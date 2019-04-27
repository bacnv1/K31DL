package com.t3h.vandongvien;

public class DongVat {
    String ten;
    int tuoi;
    boolean gioiTinh;
    String mauLong;
    String loai;

    public DongVat(String ten, int tuoi, boolean gioiTinh, String mauLong, String loai) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.mauLong = mauLong;
        this.loai = loai;
    }

    void inThongTin() {
        System.out.println("Ten: " + ten);
        System.out.println("Tuoi: " + tuoi);
        System.out.println("Gioi Tinh: " + (gioiTinh ? "Duc" : "Cai"));
        System.out.println("Mau Long: " + mauLong);
        System.out.println("Loai: " + loai);
    }
}
