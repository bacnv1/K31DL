package com.t3h.string;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String str = "Hello world";
//        int length = str.length();
//        System.out.println(length);
//        char c = str.charAt(2);
//        System.out.println(c);
//        int ascii = (int) c;
//        System.out.println(ascii);
//        char a = (char) 65;
//        System.out.println(a);
//
//        int index = str.indexOf("l");
//        System.out.println(index);
//        int lastIndex = str.lastIndexOf("l");
//        System.out.println(lastIndex);
//        int second = str.indexOf("l", index + 1);
//        System.out.println(second);

        str = "Hello world, hello android, hello html";
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) == 'l') {
//                System.out.print(i + "\t");
//            }
//        }
        int index = str.indexOf("l");
        while (index != -1) {
            System.out.print(index + "\t");
            index = str.indexOf("l", index + 1);
        }
        System.out.println();
        String str1 = "hello";
        String str2 = "Hello";
        boolean check = str1.equalsIgnoreCase(str2);
        System.out.println(check);

        int value = str1.compareToIgnoreCase(str2);
        System.out.println(value);

        String str3 = "llo";
        check = str1.contains(str3);
        System.out.println(check);

        String str4 = str.substring(6, 11);
        System.out.println(str4);

        str = str.replace("hello", "HELLO");
        System.out.println(str);

        str = str.toUpperCase();
        System.out.println(str);
        str = str.toLowerCase();
        System.out.println(str);

        String[] arr = str.split(" ");
        for (String s: arr) {
            System.out.println(s);
        }
        String str5 = "    hello   n      ";
        str5 = str5.trim();
        System.out.println(str5);
    }
}
