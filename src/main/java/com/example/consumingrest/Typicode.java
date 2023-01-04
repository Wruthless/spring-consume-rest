package com.example.consumingrest;

public class Typicode {

    private String userId;
    private int id;
    private String title;
    private String body;

    public int getId() {
        return id;
    }

    public String getBody() {
        return body;
    }

    public String getTitle() {
        return title;
    }

    public String getUserId() {
        return userId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Typicode{" +
            "userId='" + userId + '\'' +
            ", id=" + id +
            ", title='" + title + '\'' +
            ", body='" + body + '\'' +
            '}';
    }
}
