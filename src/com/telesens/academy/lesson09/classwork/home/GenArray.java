package com.telesens.academy.lesson09.classwork.home;

import java.util.Objects;

public class GenArray <T> {
    private T element;

    public T getElement() throws ExceededArrayBoundException {
        return element;
    }

    public void setElement(T element) throws ExceededArrayBoundException {
        this.element = element;
    }

    @Override
    public String toString() {
        for (int i=0;i<T
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GenArray<?> genArray = (GenArray<?>) o;
        return Objects.equals(element, genArray.element);
    }

    @Override
    public int hashCode() {

        return Objects.hash(element);
    }
}
