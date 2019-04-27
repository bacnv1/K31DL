package com.t3h.connguoi;

public class Main {
    public static void main(String[] args) {
        SinhVien sv = new SinhVien("Nguyen Van A",
                "0123456789", 20, true,
                "Ha noi", 9.0f, "Android");
        sv.inThongTin();
        sv.hocBai();
        sv.thi();
        System.out.println("====================");
        GiaoVien gv = new GiaoVien("Nguyen Thi B",
                "02921281212", 30, false,
                "Ha Noi", "Thac sy", "Android");
        gv.inThongTin();
        gv.dayHoc();
        gv.chamBai();
    }
}
