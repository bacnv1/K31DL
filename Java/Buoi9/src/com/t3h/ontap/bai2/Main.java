package com.t3h.ontap.bai2;

public class Main {
    public static void main(String[] args) {
        QuanLyCanBo qlcb = new QuanLyCanBo();
        NhanVien nv = new NhanVien("Nguyen Van A",
                "1990",
                "Ha Noi",
                true,
                "Soan thao van ban");
        qlcb.nhap(nv);

        NhanVien nv1 = new NhanVien("Nguyen Thi B",
                "1980",
                "Ha Noi",
                false,
                "Phat trien du an");
        qlcb.nhap(nv1);

        CongNhan cn = new CongNhan("Tran Van A",
                "1988",
                "Ha Noi",
                true, "4/4");
        qlcb.nhap(cn);
        KySu ks = new KySu("Ngo Xuan D",
                "1991",
                "Ha Noi",
                true,
                "CNTT");
        qlcb.nhap(ks);
        qlcb.inDanhSach();

    }
}
