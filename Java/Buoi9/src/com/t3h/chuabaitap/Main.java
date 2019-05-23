package com.t3h.chuabaitap;

public class Main {
    public static void main(String[] args) {
        Bai1 bai1 = new Bai1(10);
        bai1.findTriAngle();
        int[] result = bai1.getTwoNumberRandom();
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + "\t");
        }
    }
}
