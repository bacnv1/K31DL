package com.t3h.danhba;

import java.util.ArrayList;

public class QuanLy {
    private ArrayList<DanhBa> arr = new ArrayList<>();

    private boolean kiemTra(String sdt) {
        for (DanhBa db : arr) {
            if (db.getSdt().equals(sdt)) {
                return false;
            }
        }
        return true;
    }

    public void them(String sdt, String ten) {
        if (kiemTra(sdt) == false) {
            System.out.println("So dien thoai da ton tai");
            return;
        }
        arr.add(new DanhBa(sdt, ten));
        System.out.println("Them thanh cong");
    }

    public void sua(String sdt, String ten) {
        if (kiemTra(sdt) == true) {
            System.out.println("So dien thoai khong ton tai");
            return;
        }
        for (DanhBa db : arr) {
            if (db.getSdt().equals(sdt)) {
                db.setTen(ten);
                return;
            }
        }
    }


    public void inDanhBa() {
        for (DanhBa db : arr) {
            db.inThongTin();
        }
    }
}
