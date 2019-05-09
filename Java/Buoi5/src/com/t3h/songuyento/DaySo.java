package com.t3h.songuyento;

import java.util.Random;

public class DaySo {
    private int[] arr = new int[100];
    private Random rd = new Random();

    public DaySo() {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(1001);
        }
    }

    public void inDaySo() {
        for (int v : arr) {
            System.out.print(v + "\t");
        }
    }

    public void lietKe() {
        for (int v : arr) {
            boolean check = true;
            for (int i = 2; i <= Math.sqrt(v); i++) {
                if (v % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check == true) {
                System.out.print(v + "\t");
            }
        }
    }

}
