package com.t3h.buoi5_ontap;

import android.graphics.Color;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView tvTime;
    private int time = 5;
    private int sum = 0;
    private Random rd = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews() {
        tvTime = findViewById(R.id.tv_time);
        initButton(R.id.btn_1);
        initButton(R.id.btn_2);
        initButton(R.id.btn_3);
        initButton(R.id.btn_4);
        initButton(R.id.btn_5);
        initButton(R.id.btn_6);
        initButton(R.id.btn_7);
        initButton(R.id.btn_8);
        initButton(R.id.btn_9);
    }

    private void initButton(@IdRes int resId) {
        Button btn = findViewById(resId);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v instanceof Button == false) {
            return;
        }
        if (time == 0) {
            if (sum >= 25){
                Toast.makeText(this, "You win", Toast.LENGTH_LONG).show();
            }else {
                Toast.makeText(this, "You lose", Toast.LENGTH_LONG).show();
            }
            return;
        }
        time--;
        tvTime.setText("TIMES: " + time);
        int value = rd.nextInt(11);
        sum += value;
        Button btn = (Button) v;
        btn.setText(value + "");
        btn.setBackgroundColor(Color.GREEN);
        btn.setClickable(false);
    }

    @Override
    public void onBackPressed() {
        if (time > 0){
            Toast.makeText(this, "You need complete game",
                    Toast.LENGTH_SHORT).show();
            return;
        }
        super.onBackPressed();
    }
}
