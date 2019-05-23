package com.t3h.ontap.bai2;

public class NhanVien extends CanBo {
    private String congViec;

    public NhanVien(String ten, String namSinh, String diaChi, boolean gioiTinh, String congViec) {
        super(ten, namSinh, diaChi, gioiTinh);
        this.congViec = congViec;
    }

    @Override
    public void inThongiTin() {
        System.out.println("--Nhan vien--");
        super.inThongiTin();
        System.out.println("Cong viec: " + congViec);
    }
}
