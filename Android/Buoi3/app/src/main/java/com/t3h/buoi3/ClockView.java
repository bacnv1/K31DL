package com.t3h.buoi3;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;

public class ClockView extends View implements Runnable {

    private Paint paint;
    private SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    public ClockView(Context context) {
        super(context);
        init(null);
    }

    public ClockView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs);
    }

    public ClockView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(attrs);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public ClockView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(attrs);
    }

    private void init(AttributeSet attrs) {
        paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(Color.RED);
        paint.setStrokeWidth(20);
        paint.setTextSize(50);

        if (attrs != null){
            TypedArray arr = getContext().obtainStyledAttributes(attrs, R.styleable.ClockView);
            float size = arr.getDimension(R.styleable.ClockView_size, 0f);
            paint.setTextSize(size);
            arr.recycle();
        }

        Thread t = new Thread(this);
        t.start();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        String current = getCurrentTime();
        canvas.drawText(current, 100, 100, paint);
    }

    private String getCurrentTime() {
        Calendar calendar = Calendar.getInstance();
        return format.format(calendar.getTime());
    }

    @Override
    public void run() {
        Random rd = new Random();
        while (true) {
            int r = rd.nextInt(256);
            int g = rd.nextInt(256);
            int b = rd.nextInt(256);

            int color = Color.rgb(r, g, b);
            paint.setColor(color);

            postInvalidate();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
