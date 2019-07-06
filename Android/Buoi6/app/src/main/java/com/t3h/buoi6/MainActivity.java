package com.t3h.buoi6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Question> questions = new ArrayList<>();
    private int[] resAnswer = {
            R.id.btn_answer_1, R.id.btn_answer_2, R.id.btn_answer_3,
            R.id.btn_answer_4, R.id.btn_answer_5, R.id.btn_answer_6,
            R.id.btn_answer_7, R.id.btn_answer_8, R.id.btn_answer_9,
            R.id.btn_answer_10, R.id.btn_answer_11, R.id.btn_answer_12,
            R.id.btn_answer_13, R.id.btn_answer_14, R.id.btn_answer_15,
            R.id.btn_answer_16
    };

    private int[] resQuestion = {
            R.id.btn_question_1, R.id.btn_question_2, R.id.btn_question_3,
            R.id.btn_question_4, R.id.btn_question_5, R.id.btn_question_6,
            R.id.btn_question_7, R.id.btn_question_8, R.id.btn_question_9,
            R.id.btn_question_10, R.id.btn_question_11, R.id.btn_question_12,
            R.id.btn_question_13, R.id.btn_question_14, R.id.btn_question_15,
            R.id.btn_question_16
    };

    private AnswerButton[] btnAnswer = new AnswerButton[16];
    private AnswerButton[] btnQuestion = new AnswerButton[16];
    private ImageView imQuestion;
    private TextView tvHeart;
    private TextView tvCoin;
    private int index = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        initViews();
        loadQuestion();
    }

    private void loadQuestion() {
        if (index == 0){
            Collections.shuffle(questions);
        }
        if (index >= questions.size()){
            finish();
        }
        Question question = questions.get(index);
        imQuestion.setImageResource(question.getImage());
        String pickAnswer = question.getPickAnswer();
        for (int i = 0; i < pickAnswer.length(); i++) {
            btnQuestion[i].setText(pickAnswer.charAt(i) + "");
            btnQuestion[i].setVisibility(View.VISIBLE);
        }
        for (int i = 0; i < btnAnswer.length; i++) {
            btnAnswer[i].setText("");
            btnAnswer[i].setBackgroundResource(R.drawable.ic_tile_hover);
            if (i < question.getAnswer().length()) {
                btnAnswer[i].setVisibility(View.VISIBLE);
            } else {
                btnAnswer[i].setVisibility(View.GONE);
            }
        }
    }

    private void initViews() {
        imQuestion = findViewById(R.id.im_question);
        tvHeart = findViewById(R.id.tv_heart);
        tvCoin = findViewById(R.id.tv_coin);

        for (int i = 0; i < resAnswer.length; i++) {
            final AnswerButton btn = findViewById(resAnswer[i]);
            btnAnswer[i] = btn;
        }

        for (int i = 0; i < resQuestion.length; i++) {
            final AnswerButton btn = findViewById(resQuestion[i]);
            btnQuestion[i] = btn;
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    for (AnswerButton answer : btnAnswer) {
                        if (answer.getText().toString().isEmpty() &&
                                answer.getVisibility() == View.VISIBLE) {
                            answer.setText(btn);
                            break;
                        }
                    }
                    checkCorrect();
                }
            });
        }
    }

    private void checkCorrect() {
        Question question = questions.get(index);
        String answer = question.getAnswer();
        boolean check = true;
        for (int i = 0; i < answer.length(); i++) {
            if (btnAnswer[i].getText().toString().isEmpty()){
                return;
            }
            if (btnAnswer[i].getText().toString()
                    .equals(answer.charAt(i) + "") == false) {
                check = false;
            }
        }
        showAnswer(check);
    }

    private void showAnswer(boolean answer) {
        for (AnswerButton btn: btnAnswer){
            btn.setResult(answer);
        }
        if (answer){
            index++;
            loadQuestion();
        }
    }

    private void initData() {
        questions.add(new Question(R.drawable.aomua, "AOMUA"));
        questions.add(new Question(R.drawable.baocao, "BAOCAO"));
        questions.add(new Question(R.drawable.canthiep, "CANTHIEP"));
    }
}
