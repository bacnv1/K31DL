package com.t3h.phuongtien;

public class XeDap extends PhuongTien {
    public XeDap(String ten, String mau, String namSanXuat, String hang) {
        super(ten, mau, namSanXuat, hang);
    }

    @Override
    void diChuyen() {
        System.out.println("Dap de di chuyen");
    }
}
