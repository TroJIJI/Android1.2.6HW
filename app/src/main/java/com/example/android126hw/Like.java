package com.example.android126hw;

public class Like {
    private int ava;
    private int post;
    private String time;
    private String userName;

    public Like(int ava, int post, String time, String userName) {
        this.ava = ava;
        this.post = post;
        this.time = time;
        this.userName = userName;
    }

    public int getAva() {
        return ava;
    }

    public int getPost() {
        return post;
    }

    public String getTime() {
        return time;
    }

    public String getUserName() {
        return userName;
    }
}
