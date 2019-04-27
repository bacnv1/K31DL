package com.t3h.connguoi;

public class GiaoVien extends ConNguoi {
    String hocVi;
    String boMon;

    public GiaoVien(String ten, String sdt, int tuoi, boolean gioiTinh, String diaChi, String hocVi, String boMon) {
        super(ten, sdt, tuoi, gioiTinh, diaChi);
        this.hocVi = hocVi;
        this.boMon = boMon;
    }

    @Override
    void inThongTin() {
        super.inThongTin();
        System.out.println("Hoc Vi: " + hocVi);
        System.out.println("Bo mon: " + boMon);
    }

    void dayHoc(){
        System.out.println("Day hoc");
    }

    void chamBai(){
        System.out.println("Cham bai");
    }
}
