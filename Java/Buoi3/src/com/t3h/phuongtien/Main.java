package com.t3h.phuongtien;

public class Main {
    public static void main(String[] args) {
        XeDap xd = new XeDap("Mini", "Xanh",
                "2004", "Nhat");
        xd.diChuyen();
        xd.inThongTin();
        System.out.println("============");
        XeMay xm = new XeMay("Dream", "Nau",
                "2010", "Honda");
        xm.diChuyen();
        xm.inThongTin();
    }
}
