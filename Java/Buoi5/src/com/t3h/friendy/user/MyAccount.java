package com.t3h.friendy.user;

import java.util.ArrayList;
import java.util.Comparator;

public class MyAccount extends User {
    private String password;
    private ArrayList<Friend> arrFriend = new ArrayList<>();

    public MyAccount(int id, String name, int age, String email, String password) {
        super(id, name, age, email);
        this.password = password;
    }

    private int checkExists(int id) {
        for (int i = 0; i < arrFriend.size(); i++) {
            if (arrFriend.get(i).id == id) {
                return i;
            }
        }
        return -1;
    }

    public void addFriend(Friend friend) {
        if (checkExists(friend.id) >= 0) {
            System.out.println("Friend was exists");
            return;
        }
        arrFriend.add(friend);
        System.out.println("Add friend success");
    }

    public void unFriend(int id) {
        int index = checkExists(id);
        if (index == -1) {
            System.out.println("Friend not exists");
            return;
        }
        arrFriend.remove(index);
        System.out.println("UnFriend success");
    }

    public void search(String name){
        System.out.println("Searching by friend name: " + name);
        for (Friend f: arrFriend) {
            if (f.name.contains(name)){
                f.print();
                System.out.println("============");
            }
        }
    }

    public void sort(){
        arrFriend.sort(comparator);
    }

    private Comparator<Friend> comparator = new Comparator<Friend>() {
        @Override
        public int compare(Friend o1, Friend o2) {
            return o1.name.compareToIgnoreCase(o2.name);
        }
    };

    public void listFriend() {
        for (Friend f : arrFriend) {
            f.print();
            System.out.println("=============== ");
        }
    }
}

