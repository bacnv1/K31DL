package com.t3h.smart;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        SmartString smart = new SmartString();
        ArrayList<News> arr = smart.filter();
        for (News item: arr) {
            System.out.println(item);
        }
    }
}
