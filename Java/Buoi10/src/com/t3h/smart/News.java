package com.t3h.smart;

public class News {
    private String title;
    private String link;
    private String image;
    private String date;

    public News(String title, String link, String image, String date) {
        this.title = title;
        this.link = link;
        this.image = image;
        this.date = date;
    }

    @Override
    public String toString() {
        return "News{" +
                "title=" + title + "\n" +
                "link=" + link + "\n" +
                "image=" + image + "\n" +
                "date=" + date + "\n" +
                '}';
    }
}
