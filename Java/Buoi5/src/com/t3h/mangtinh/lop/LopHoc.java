package com.t3h.mangtinh.lop;

import java.util.Arrays;
import java.util.Comparator;

public class LopHoc {
    private SinhVien[] arrSv = new SinhVien[5];

    public LopHoc() {
        arrSv[0] = new SinhVien("1", "Nguyen Van A",
                19, true, 8.7f);
        arrSv[1] = new SinhVien("2", "Nguyen Thi D",
                15, false, 4.5f);
        arrSv[2] = new SinhVien("3", "Tran Van S",
                21, true, 9.0f);
        arrSv[3] = new SinhVien("4", "Ngo Thi B",
                18, false, 5.7f);
        arrSv[4] = new SinhVien("5", "Nguyen Van R",
                22, true, 6.3f);
    }

    public void danhSachSV(){
        timKiem(0);
    }

    public void timKiem(float diem){
        for (SinhVien sv: arrSv) {
            if (sv.getDiem() >= diem) {
                sv.inThongTin();
                System.out.println("================");
            }
        }
    }

    public void capNhap(SinhVien sv){
        for (int i = 0; i < arrSv.length; i++) {
            if (arrSv[i].getMaSv() == sv.getMaSv()){
                arrSv[i] = sv;
                System.out.println("Cap nhap thanh cong");
                return;
            }
        }
        System.out.println("Khong ton tai sinh vien");
    }

    public void sapXep(){
        Arrays.sort(arrSv, comparator);
    }

    private Comparator<SinhVien> comparator = new Comparator<SinhVien>() {
        @Override
        public int compare(SinhVien o1, SinhVien o2) {
            if (o1.getDiem() > o2.getDiem()){
                return 1;
            }
            return -1;
        }
    };

}
