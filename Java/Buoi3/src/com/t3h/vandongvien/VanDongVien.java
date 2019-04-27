package com.t3h.vandongvien;

public class VanDongVien extends ConNguoi {
    Cho cho;
    String cauLacBo;
    int soBanThang;
    int soAo;

    public VanDongVien(String ten, int tuoi, boolean gioiTinh, String sdt, String diaChi, Cho cho, String cauLacBo, int soBanThang, int soAo) {
        super(ten, tuoi, gioiTinh, sdt, diaChi);
        this.cho = cho;
        this.cauLacBo = cauLacBo;
        this.soBanThang = soBanThang;
        this.soAo = soAo;
    }

    void diDao() {
        System.out.println("Dat cho di dao o cong vien");
    }

    @Override
    void inThongTin() {
        super.inThongTin();
        System.out.println("Cau lac bo: " + cauLacBo);
        System.out.println("So ao: " + soAo);
        System.out.println("So ban thang: " + soBanThang);
        System.out.println("-----Thu nuoi-----");
        cho.inThongTin();
        cho.sua();
    }
}
