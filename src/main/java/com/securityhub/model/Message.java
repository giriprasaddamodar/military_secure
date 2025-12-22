package com.securityhub.model;

import java.sql.Timestamp;

public class Message {

    private int id;
    private String sender;
    private String content;
    private Timestamp createdAt;

    public Message() {}

    public Message(int id, String sender, String content, Timestamp createdAt) {
        this.id = id;
        this.sender = sender;
        this.content = content;
        this.createdAt = createdAt;
    }

    public int getId() {
        return id;
    }

    public String getSender() {
        return sender;
    }

    public String getContent() {
        return content;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }
}
