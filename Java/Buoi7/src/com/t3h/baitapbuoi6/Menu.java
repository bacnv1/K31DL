package com.t3h.baitapbuoi6;

import java.util.ArrayList;

public class Menu {
    private ArrayList<Province> arrProvince = new ArrayList<>();

    private int checkExists(int id) {
        for (int i = 0; i < arrProvince.size(); i++) {
            if (arrProvince.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    public void addProvince(int id, String name) {
        if (checkExists(id) >= 0) {
            System.out.println("Province was exists");
            return;
        }
        arrProvince.add(new Province(id, name));
    }

    public void addTidbit(int id, Tidbit tidbit) {
        int index = checkExists(id);
        if (index == -1) {
            System.out.println("Province not exists");
            return;
        }
        arrProvince.get(index).addTidbit(tidbit);
    }

    public void deleteProvince(int id) {
        int index = checkExists(id);
        if (index == -1) {
            System.out.println("Province not exists");
            return;
        }
        arrProvince.remove(index);
        System.out.println("Delete province success");
    }

    public void deleteTidbit(int idProvince, int idTidbit) {
        int index = checkExists(idProvince);
        if (index == -1) {
            System.out.println("Province not exists");
            return;
        }
        arrProvince.get(index).deleteTidbit(idTidbit);
    }

    public void filter(int idProvince){
        for (Province p: arrProvince) {
            if (p.getId() == idProvince){
                p.print();
                return;
            }
        }
    }

    public void print(){
        for (Province p: arrProvince) {
            p.print();
            System.out.println("===================");
        }
    }
}
