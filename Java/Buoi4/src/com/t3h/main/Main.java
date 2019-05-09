package com.t3h.main;

import com.t3h.hinhhoc.HinhHoc;
import com.t3h.hinhhoc.HinhTron;
import com.t3h.hinhhoc.HinhVuong;

public class Main {
    public static void main(String[] args) {
        HinhTron h1 = new HinhTron("Hinh tron", 3);
        HinhVuong h2 = new HinhVuong("Hinh vuong", 5);
        inThongTin(h1);
        System.out.println("===================");
        inThongTin(h2);
    }

    private static void inThongTin(HinhHoc h) {
        h.inThongTin();
        h.tinhChuVi();
        h.tinhDienTich();

        boolean check = h instanceof HinhTron;
         if (check == true){
             HinhTron ht = (HinhTron) h;
             ht.tamGiacNoiTiep();
         }else{
             HinhVuong hv = (HinhVuong) h;
             hv.tongDuongCheo();
         }
    }
}
