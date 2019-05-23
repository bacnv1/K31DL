package com.t3h.ontap.bai2;

public class KySu extends CanBo{
    private String nganhDaoTao;

    public KySu(String ten, String namSinh, String diaChi, boolean gioiTinh, String nganhDaoTao) {
        super(ten, namSinh, diaChi, gioiTinh);
        this.nganhDaoTao = nganhDaoTao;
    }

    @Override
    public void inThongiTin() {
        System.out.println("--Ky su--");
        super.inThongiTin();
        System.out.println("Nganh dao tao: " + nganhDaoTao);
    }
}
