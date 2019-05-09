package com.t3h.mangtinh;

import com.t3h.mangtinh.lop.LopHoc;
import com.t3h.mangtinh.lop.SinhVien;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
//        Integer[] arr = new Integer[5];
//        arr[0] = 10;
//        arr[1] = 3;
//        arr[2] = 5;
//        arr[3] = 9;
//        arr[4] = 1;
//
//        Comparator<Integer> comparator = new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o1 - o2;
//            }
//        };
//
//        Arrays.sort(arr, comparator);
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + "\t");
//        }
        LopHoc lopHoc = new LopHoc();
        lopHoc.sapXep();
        lopHoc.danhSachSV();
        SinhVien sv = new SinhVien("1", "ABC",
                20, true, 10.0f);
        lopHoc.capNhap(sv);
        lopHoc.danhSachSV();
    }
}
