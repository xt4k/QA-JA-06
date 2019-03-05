package com.telesens.academy.lesson11;

public class Operator {
    private Long id;
    private String name;

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return ": id= " + id + ", name=" + name;
    }
}
