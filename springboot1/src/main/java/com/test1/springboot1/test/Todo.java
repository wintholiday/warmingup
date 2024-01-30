package com.test1.springboot1.test;

import javax.persistence.*;

@Entity
@Table(name = "shixiang")
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String content;

    public Todo() {
    }

    public Todo(int id, String content) {
        this.id = id;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String toString() {
        return "Todo{id = " + id + ", content = " + content + "}";
    }
}
