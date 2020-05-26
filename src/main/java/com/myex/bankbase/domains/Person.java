package com.myex.bankbase.domains;

public class Person  {
    private int id;
    private String name;
    private String sureName;

    public Person() {
    }

    public Person(String name, String sureName) {
        this.name = name;
        this.sureName = sureName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSureName() {
        return sureName;
    }

    public void setSureName(String sureName) {
        this.sureName = sureName;
    }
}
