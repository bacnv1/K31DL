package com.t3h.hinhhoc;

public class HinhTron extends HinhHoc {
    private float banKinh;

    public HinhTron(String tenHinh, float banKinh) {
        super(tenHinh);
        this.banKinh = banKinh;
    }

    @Override
    public void tinhChuVi() {
        float cv = banKinh * 2 * 3.14f;
        System.out.println("Chu vi la: " + cv);
    }

    @Override
    public void tinhDienTich() {
        float dt = 3.14f * banKinh * banKinh;
        System.out.println("Dien tich la: " + dt);
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println("Ban kinh: " + banKinh);
    }

    public void tamGiacNoiTiep(){
        float dt = banKinh * banKinh;
        System.out.println("Dien tich tam giac noi tiep: "+ dt);
    }
}
