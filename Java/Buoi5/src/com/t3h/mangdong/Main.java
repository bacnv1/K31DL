package com.t3h.mangdong;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(10);
        arr.add(4);
        arr.add(20);
        arr.add(1,5);

        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(1);
        arr1.add(3);
        arr1.add(11);

        arr.addAll(1, arr1);

        arr.set(2, 10);
//        arr.remove(3);
//        arr.clear();
//        arr.removeAll(arr1);

        int index = arr.indexOf(10);
        boolean contain = arr.contains(100);
        System.out.println(contain);
        System.out.println(index);

        arr.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2 ;
            }
        });

        Collections.shuffle(arr);

        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + "\t");
        }

    }
}
