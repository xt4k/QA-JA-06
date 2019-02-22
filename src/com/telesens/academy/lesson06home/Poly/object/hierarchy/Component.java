package com.telesens.academy.lesson06home.Poly.object.hierarchy;

public class Component extends Object {
    public void draw() {
        System.out.println("Component - root item");//this.toString());
    }

    @Override
    public String toString() {
        return "Component item";
    }
}
