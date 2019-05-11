package com.t3h.friendy.user;

public class Friend extends User {
    private String status;

    public Friend(int id, String name, int age, String email, String status) {
        super(id, name, age, email);
        this.status = status;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Status: " + status);
    }
}
