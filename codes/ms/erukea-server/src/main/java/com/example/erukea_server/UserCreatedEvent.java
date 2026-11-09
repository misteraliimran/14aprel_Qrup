package com.example.erukea_server;

public class UserCreatedEvent {

    private Integer userId;
    private String username;

    public UserCreatedEvent() {
    }

    public UserCreatedEvent(Integer userId, String username) {
        this.userId = userId;
        this.username = username;
    }

    public Integer getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }
}