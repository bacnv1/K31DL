package com.t3h.chuabai4;

import java.util.ArrayList;
import java.util.Arrays;

public class ChuanHoa {
    private String str;

    public ChuanHoa(String str) {
        this.str = str;
    }

    public void chuanHoa() {
        System.out.println(str);
        ArrayList<String> arr = new ArrayList<>(Arrays.asList(str.split("")));
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            String c = arr.get(i);
            if (c.equals("(")) {
                count++;
            } else {
                count--;
            }
            if (count < 0){
                arr.remove(i);
                i-= 1;
                count = 0;
            }
        }
        count = 0;
        for (int i = arr.size() - 1; i >= 0; i--) {
            String c = arr.get(i);
            if (c.equals(")")) {
                count++;
            } else {
                count--;
            }
            if (count < 0){
                arr.remove(i);
                count = 0;
            }
        }


        for (String s : arr) {
            System.out.print(s);
        }
    }
}
