package com.telesens.academy.lesson07class.model;

public class Label extends Component {
    @Override
    public void draw() {
        System.out.println("Label@draw");
    }

    @Override
    public void draw3D() {
        System.out.println("Label@draw3d");
    }
}
