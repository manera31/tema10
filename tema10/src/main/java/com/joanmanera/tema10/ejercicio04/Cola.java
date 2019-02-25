package com.joanmanera.tema10.ejercicio04;

public class Cola<T> implements ICola<T> {

    @Override
    public boolean add(T e) {
        return false;
    }

    @Override
    public T remove() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public T peek() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
