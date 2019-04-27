package com.t3h.vandongvien;

public class Cho extends DongVat {
    public Cho(String ten, int tuoi, boolean gioiTinh, String mauLong, String loai) {
        super(ten, tuoi, gioiTinh, mauLong, loai);
    }

    void sua(){
        System.out.println("Sua, coi nha");
    }
}
