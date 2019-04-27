package com.t3h.connguoi;

public class ConNguoi {
    String ten;
    String sdt;
    int tuoi;
    boolean gioiTinh;
    String diaChi;

    public ConNguoi(String ten, String sdt, int tuoi, boolean gioiTinh, String diaChi) {
        this.ten = ten;
        this.sdt = sdt;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
    }

    void inThongTin() {
        System.out.println("Ten: " + ten);
        System.out.println("Tuoi: " + tuoi);
        System.out.println("Gioi Tinh: " + (gioiTinh ? "Nam" : "Nu"));
        System.out.println("SDT: " + sdt);
        System.out.println("Dia Chi: " + diaChi);
    }
}
