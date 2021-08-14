package com.example.android126hw;

public class Post {
    private String date;
    private String comment;
    private int img;

    public Post(String date, String comment, int img) {
        this.date = date;
        this.comment = comment;
        this.img = img;
    }

    public String getDate() {
        return date;
    }

    public String getComment() {
        return comment;
    }

    public int getImg() {
        return img;
    }
}
