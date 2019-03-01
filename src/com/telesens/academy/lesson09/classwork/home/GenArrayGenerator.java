package com.telesens.academy.lesson09.classwork.home;

public class GenArrayGenerator {
    public static void main(String[] args) {
        Integer[] arrInt = new Integer[20];
        GenArray<Integer[]> genArrayInt = new GenArray (arrInt);
    }
}
