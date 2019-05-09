package com.t3h.hinhhoc;

public class HinhVuong extends HinhHoc {
    private int canh;

    public HinhVuong(String tenHinh, int canh) {
        super(tenHinh);
        this.canh = canh;
    }


    @Override
    public void tinhChuVi() {
        int cv = 4 * canh;
        System.out.println("Chi vi: " + cv);
    }

    @Override
    public void tinhDienTich() {
        int dt = canh * canh;
        System.out.println("Dien tich: " + dt);
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println("Chieu dai canh: " + canh);
    }

    public void tongDuongCheo() {
        float tong = (float) (Math.sqrt(2)
                * canh * 2 * (4 * canh));
        System.out.println("Tong la cac canh: " + tong);
    }
}
