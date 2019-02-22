package com.telesens.academy.lesson06home.Poly.object.hierarchy;

public class Checkbox extends Button {
    public void draw() {
        String str = super.toString();
        System.out.println("Checkbox "+str);//this.toString());
    }
}