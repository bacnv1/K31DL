package com.t3h.ontap.bai2;

public class CongNhan extends CanBo {
    private String bac;

    public CongNhan(String ten, String namSinh, String diaChi, boolean gioiTinh, String bac) {
        super(ten, namSinh, diaChi, gioiTinh);
        this.bac = bac;
    }

    @Override
    public void inThongiTin() {
        System.out.println("--Cong nhan--");
        super.inThongiTin();
        System.out.println("Bac: " + bac);
    }
}
