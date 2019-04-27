package com.t3h.phuongtien;

public class XeMay extends PhuongTien{
    public XeMay(String ten, String mau, String namSanXuat, String hang) {
        super(ten, mau, namSanXuat, hang);
    }

    @Override
    void diChuyen() {
        System.out.println("Keo ga de di chuyen");
    }
}
