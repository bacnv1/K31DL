package com.t3h.buoi6;

import android.content.Context;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;
import android.view.View;

public class AnswerButton extends AppCompatButton implements View.OnClickListener {
    private AnswerButton btn;

    public AnswerButton(Context context) {
        super(context);
        init();
    }

    public AnswerButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public AnswerButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init(){
        setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        if (getText().toString().isEmpty()) return;
        btn.setVisibility(VISIBLE);
        btn.setText(getText().toString());
        setText("");
    }

    public void setResult(boolean isCorrect){
        if (isCorrect) {
            setBackgroundResource(R.drawable.ic_tile_true);
        }else{
            setBackgroundResource(R.drawable.ic_tile_false);
        }
    }

    public void setText(AnswerButton btn){
        this.btn = btn;
        setText(btn.getText());
        btn.setVisibility(INVISIBLE);
    }
}
