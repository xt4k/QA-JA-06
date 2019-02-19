package com.telesens.academy.lesson07class.model;

public interface VisualComponent {
    void draw();
    default void draw3D()
    {};
}
