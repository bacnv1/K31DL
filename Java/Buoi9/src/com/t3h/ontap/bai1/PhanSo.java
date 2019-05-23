package com.t3h.ontap.bai1;

public class PhanSo {
    private int tu;
    private int mau;

    public PhanSo(int tu, int mau) {
        this.tu = tu;
        this.mau = mau;
    }

    private int uocChungLonNhat() {
        int min = Math.min(Math.abs(tu), Math.abs(mau));
        for (int i = min; i >= 2; i--) {
            if (tu % i == 0 && mau % i == 0) {
                return i;
            }
        }
        return 1;
    }

    public void toiGian() {
        int uoc = uocChungLonNhat();
        if (uoc == 1) {
            System.out.println("Phan so da toi gian");
            return;
        }
        System.out.println("Dang toi gian la: "
                + (tu / uoc) + "/" + (mau / uoc));
    }
}
