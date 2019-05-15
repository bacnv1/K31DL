package com.t3h.baitapbuoi6;

import java.util.ArrayList;

public class Province {
    private int id;
    private String name;
    private ArrayList<Tidbit> arrTidbit = new ArrayList<>();

    public Province(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    private int checkExists(int id) {
        for (int i = 0; i < arrTidbit.size(); i++) {
            if (id == arrTidbit.get(i).getId()) {
                return i;
            }
        }
        return -1;
    }

    public void addTidbit(Tidbit tidbit) {
        if (checkExists(tidbit.getId()) >= 0) {
            System.out.println("Tidbit was exists");
            return;
        }
        arrTidbit.add(tidbit);
        System.out.println("Add tidbit success");
    }

    public void deleteTidbit(int id) {
        int index = checkExists(id);
        if (index == -1) {
            System.out.println("Tidbit not exists");
            return;
        }
        arrTidbit.remove(index);
        System.out.println("Delete tidbit success");
    }

    public void search(String name){
        for (Tidbit t: arrTidbit) {
            if (t.getName().contains(name)){
                t.print();
            }
        }
    }

    public void print(){
        System.out.println("Id: "+ id);
        System.out.println("Name: " + name);
        System.out.println("--- Tidbit ---");
        search("");
    }
}
