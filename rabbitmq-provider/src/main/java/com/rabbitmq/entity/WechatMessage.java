package com.rabbitmq.entity;


import java.io.Serializable;

/**
 * @author dwenb
 * @date 2019-03-12 22:12
 */
public class WechatMessage implements Serializable {
    private static final long serialVersionUID = 5647205293618385735L;

    public String id;
    public String text;
    public String currentUser;

    public WechatMessage() {
    }

    public WechatMessage(String id, String text, String currentUser) {
        this.id = id;
        this.text = text;
        this.currentUser = currentUser;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(String currentUser) {
        this.currentUser = currentUser;
    }

}
