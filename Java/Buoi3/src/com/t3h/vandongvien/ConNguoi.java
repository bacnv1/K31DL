package com.t3h.vandongvien;

public class ConNguoi {
    String ten;
    int tuoi;
    boolean gioiTinh;
    String sdt;
    String diaChi;

    public ConNguoi(String ten, int tuoi, boolean gioiTinh, String sdt, String diaChi) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.sdt = sdt;
        this.diaChi = diaChi;
    }

    void inThongTin() {
        System.out.println("Ten: " + ten);
        System.out.println("Tuoi: " + tuoi);
        System.out.println("Gioi tinh: " + (gioiTinh ? "Nam" : "Nu"));
        System.out.println("SDT: " + sdt);
        System.out.println("Dia Chi: " + diaChi);
    }
}
