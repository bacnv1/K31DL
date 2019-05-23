package com.t3h.ontap.bai2;

import java.util.ArrayList;

public class QuanLyCanBo {
    private ArrayList<CanBo> arrCanBo = new ArrayList<>();

    public void nhap(CanBo canBo){
        arrCanBo.add(canBo);
    }

    public void timKiem(String ten){
        for (CanBo canBo: arrCanBo) {
            if (canBo.getTen().equals(ten)){
                canBo.inThongiTin();
            }
        }
    }

    public void inDanhSach(){
        for (CanBo canBo: arrCanBo) {
            canBo.inThongiTin();
        }
    }
}
