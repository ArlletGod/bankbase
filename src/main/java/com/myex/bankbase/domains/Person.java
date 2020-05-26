package com.myex.bankbase.domains;

import javax.persistence.*;

@Entity
@Table
public class Person  {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String sureName;

    public Person() {
    }

    public Person(String name, String sureName) {
        this.name = name;
        this.sureName = sureName;
    }

    public long getId() {
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
