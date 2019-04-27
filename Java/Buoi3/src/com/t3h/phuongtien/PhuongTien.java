package com.t3h.phuongtien;

public abstract class PhuongTien {
    String ten;
    String mau;
    String namSanXuat;
    String hang;

    public PhuongTien(String ten, String mau, String namSanXuat, String hang) {
        this.ten = ten;
        this.mau = mau;
        this.namSanXuat = namSanXuat;
        this.hang = hang;
    }

    void phanh() {
        System.out.println("Giam toc do");
    }

    abstract void diChuyen();

    void inThongTin() {
        System.out.println("Ten: " + ten);
        System.out.println("Mau: " + mau);
        System.out.println("Nam San Xuat: " + namSanXuat);
        System.out.println("Hang: " + hang);
    }
}
