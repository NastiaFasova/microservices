package com.example.api.dto;

public class Foo {
    private long id;
    private String name;

    public Foo(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Foo() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}