package com.t3h.buoi8;

import android.graphics.drawable.Animatable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnAlpha;
    private Button btnScale;
    private Button btnRotate;
    private Button btnTranslate;
    private Button btnSet;
    private ImageView imImage;

    private Animation alpha;
    private Animation scale;
    private Animation rotate;
    private Animation translate;
    private Animation set;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        initAnim();
    }

    private void initAnim() {
        alpha = AnimationUtils.loadAnimation(this, R.anim.alpha_anim);
        rotate = AnimationUtils.loadAnimation(this, R.anim.rotate_anim);
        scale = AnimationUtils.loadAnimation(this, R.anim.scale_anim);
        translate = AnimationUtils.loadAnimation(this, R.anim.translate_anim);
        set = AnimationUtils.loadAnimation(this, R.anim.set_anim);
    }

    private void initViews() {
        btnAlpha = findViewById(R.id.btn_alpha);
        btnRotate = findViewById(R.id.btn_rotate);
        btnScale = findViewById(R.id.btn_scale);
        btnTranslate = findViewById(R.id.btn_translate);
        btnSet = findViewById(R.id.btn_set);
        imImage = findViewById(R.id.im_image);

        btnSet.setOnClickListener(this);
        btnTranslate.setOnClickListener(this);
        btnScale.setOnClickListener(this);
        btnAlpha.setOnClickListener(this);
        btnRotate.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_alpha:
                imImage.startAnimation(alpha);
                break;
            case R.id.btn_rotate:
                imImage.startAnimation(rotate);
                break;
            case R.id.btn_scale:
                imImage.startAnimation(scale);
                break;
            case R.id.btn_set:
                imImage.startAnimation(set);
                break;
            case R.id.btn_translate:
                imImage.startAnimation(translate);
                break;
        }
    }
}
