package com.t3h.vandongvien;

public class Main {
    public static void main(String[] args) {
        Cho cho = new Cho("Cucu", 2, true,
                "Vang", "Ta");
        VanDongVien vdv = new VanDongVien("Nguyen va A",
                21, true, "0134647887",
                "Ha Noi", cho, "Real Madrid",
                100, 10);
        vdv.inThongTin();
        vdv.diDao();
        System.out.println("================");
        Meo meo = new Meo("Kiki", 1, false,
                "Do", "Muop");
        NguoiMau nm = new NguoiMau("Nguyen Thi B",
                20, false, "014454555",
                "Ha Noi", meo, "ABC", "Anh");
        nm.inThongTin();
        nm.diShopping();
        //=============
        DongVat dv = new DongVat("A", 2, false,"Do", "Tay");
        dv.inThongTin();
    }
}
