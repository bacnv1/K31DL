package com.t3h.baitapbuoi6;

public class Tidbit {
    private int id;
    private String name;
    private String desc;
    private String link;
    private String icon;

    public Tidbit(int id, String name, String desc, String link, String icon) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.link = link;
        this.icon = icon;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public String getLink() {
        return link;
    }

    public String getIcon() {
        return icon;
    }

    public void print() {
        System.out.print("Id: "+ id);
        System.out.print(", Name: " + name);
        System.out.print(", Description: " + desc);
        System.out.print(", Link: " + link);
        System.out.println(", Icon: " + icon);
    }
}
