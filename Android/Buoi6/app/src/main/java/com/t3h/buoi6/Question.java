package com.t3h.buoi6;

import android.support.annotation.DrawableRes;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Question {
    private Random rd = new Random();

    private int image;
    private String answer;

    public Question(@DrawableRes int image,
                    String answer) {
        this.image = image;
        this.answer = answer;
    }

    public int getImage() {
        return image;
    }

    public String getAnswer() {
        return answer;
    }

    public String getPickAnswer() {
        String pickAnswer = answer;
        for (int i = 0; i < 16 - answer.length(); i++) {
            int v = rd.nextInt(26) + 65;
            pickAnswer += (char) v;
        }
        String[] arr = pickAnswer.split("");
        List<String> result = Arrays.asList(arr);
        Collections.shuffle(result);
        pickAnswer = "";
        for (String s: result) {
            pickAnswer += s;
        }
        return pickAnswer;
    }
}
