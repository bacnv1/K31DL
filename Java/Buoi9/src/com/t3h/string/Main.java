package com.t3h.string;

public class Main {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append("Hello");
        builder.append(" World");
        builder.append(" Android");

        builder.insert(2, " Banana ");
        builder.delete(5, 7);
        builder.reverse();
        System.out.println(builder.toString());
    }
}
