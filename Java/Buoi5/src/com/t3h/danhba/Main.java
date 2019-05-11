package com.t3h.danhba;

public class Main {
    public static void main(String[] args) {
        QuanLy ql = new QuanLy();
        ql.them("0123456789", "Nguyen Van A");
        ql.them("0123456789", "Nguyen Van B");
        ql.them("0978563124", "Nguyen Van A");
        ql.them("0166858962", "Nguyen Van A");
        ql.them("0123456789", "Nguyen Van A");

        ql.inDanhBa();
    }
}
