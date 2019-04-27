package com.t3h.vandongvien;

public class NguoiMau extends ConNguoi {
    Meo meo;
    String cty;
    String linhVuc;

    public NguoiMau(String ten, int tuoi, boolean gioiTinh, String sdt, String diaChi, Meo meo, String cty, String linhVuc) {
        super(ten, tuoi, gioiTinh, sdt, diaChi);
        this.meo = meo;
        this.cty = cty;
        this.linhVuc = linhVuc;
    }

    void diShopping() {
        System.out.println("Dat meo di shopping");
    }

    @Override
    void inThongTin() {
        super.inThongTin();
        System.out.println("Cong ty: " + cty);
        System.out.println("Linh vuc: " + linhVuc);
        System.out.println("-----Thu nuoi-----");
        meo.inThongTin();
        meo.batChuot();
    }
}
