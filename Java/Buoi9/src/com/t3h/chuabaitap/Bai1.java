package com.t3h.chuabaitap;

import java.util.Random;

public class Bai1 {
    private int[] arr;
    private int n;
    private Random rd = new Random();


    public int[] getTwoNumberRandom(){
        int[] result = new int[2];
        int index1 = rd.nextInt(arr.length);
        result[0] = arr[index1];
        while (true){
            int index2 = rd.nextInt(arr.length);
            if (arr[index2] != result[0]){
                result[1] = arr[index2];
                break;
            }
        }
        return result;
    }

    public Bai1(int n) {
        this.n = n;
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = rd.nextInt(50) + 1;
        }
    }

    public void findTriAngle() {
        for (int i = 0; i < arr.length - 2; i++) {
            int max = Math.max(arr[i], arr[i + 1]);
            int min1 = Math.min(arr[i], arr[i + 1]);
            int min2 = Math.min(max, arr[i + 2]);
            max = Math.max(max, arr[i + 2]);
            if (min1 + min2 > max) {
                System.out.println(arr[i] + " - " +
                        arr[i + 1] + " - " + arr[i + 2]);
            }
        }
    }
}
