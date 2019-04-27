package com.t3h.vandongvien;

public class Meo extends DongVat{
    public Meo(String ten, int tuoi, boolean gioiTinh, String mauLong, String loai) {
        super(ten, tuoi, gioiTinh, mauLong, loai);
    }

    void batChuot(){
        System.out.println("Bat chuot");
    }
}
