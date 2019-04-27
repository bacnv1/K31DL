package com.t3h.connguoi;

public class SinhVien extends ConNguoi {

    float diem;
    String lop;

    public SinhVien(String ten, String sdt, int tuoi, boolean gioiTinh, String diaChi, float diem, String lop) {
        super(ten, sdt, tuoi, gioiTinh, diaChi);
        this.diem = diem;
        this.lop = lop;
    }

    @Override
    void inThongTin() {
        super.inThongTin();
        System.out.println("Diem: " + diem);
        System.out.println("Lop: " + lop);
    }

    void hocBai(){
        System.out.println("Hoc bai");
    }

    void thi(){
        System.out.println("Thi");
    }
}
