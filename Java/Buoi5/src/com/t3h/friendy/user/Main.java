package com.t3h.friendy.user;

public class Main {
    public static void main(String[] args) {
        MyAccount account = new MyAccount(12212, "Nguyen Van A",
                12, "a@gmail.com", "123456");
        account.addFriend(new Friend(1, "Nguyen Van V", 12,
                "v@gmail.com", "Ban than"));
        account.addFriend(new Friend(2, "Nguyen Van b", 13,
                "b@gmail.com", "Ban than"));
        account.addFriend(new Friend(3, "Nguyen Thi C", 12,
                "c@gmail.com", "Ban than"));
        account.addFriend(new Friend(4, "Nguyen Thi D", 12,
                "d@gmail.com", "Nguoi Yeu"));
        account.unFriend(2);
        account.sort();
        account.listFriend();
        account.search("Thi");
    }
}
