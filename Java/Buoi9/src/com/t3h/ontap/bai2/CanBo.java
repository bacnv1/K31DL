package com.t3h.ontap.bai2;

public abstract class CanBo {
    protected String ten;
    protected String namSinh;
    protected String diaChi;
    protected boolean gioiTinh;

    public CanBo(String ten, String namSinh, String diaChi, boolean gioiTinh) {
        this.ten = ten;
        this.namSinh = namSinh;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
    }

    public void inThongiTin() {
        System.out.println("Ho ten: " + ten);
        System.out.println("Nam sinh: " + namSinh);
        System.out.println("Dia chi: " + diaChi);
        System.out.println("Gioi tinh: " + (gioiTinh ? "Nam" : "Nu"));
    }

    public String getTen() {
        return ten;
    }
}
