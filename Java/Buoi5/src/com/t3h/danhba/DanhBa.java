package com.t3h.danhba;

public class DanhBa {
    private String sdt;
    private String ten;

    public DanhBa(String sdt, String ten) {
        this.sdt = sdt;
        this.ten = ten;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void inThongTin() {
        System.out.println("Ten: " + ten);
        System.out.println("SDT: " + sdt);
    }
}
