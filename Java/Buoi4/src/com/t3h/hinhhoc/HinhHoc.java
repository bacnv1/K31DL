package com.t3h.hinhhoc;

public abstract class HinhHoc {
    protected String tenHinh;

    public HinhHoc(String tenHinh) {
        this.tenHinh = tenHinh;
    }

    public abstract void tinhChuVi();

    public abstract void tinhDienTich();

    public void inThongTin() {
        System.out.println("Ten hinh: " + tenHinh);
    }
}
