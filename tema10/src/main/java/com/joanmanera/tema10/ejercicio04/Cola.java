package com.joanmanera.tema10.ejercicio04;

import java.util.ArrayList;

public class Cola<T> implements ICola<T> {
    private ArrayList<T> arrayList;

    public Cola(){
        arrayList = new ArrayList<>();
    }

    public Cola(int numero){
        arrayList = new ArrayList<>(numero);
    }
    public String toString(){
        return arrayList.toString();
    }

    @Override
    public boolean add(T e) {
        arrayList.add(e);
        return true;
    }

    @Override
    public T remove() {
        return arrayList.remove(0);
    }

    @Override
    public int size() {
        return arrayList.size();
    }

    @Override
    public T peek() {
        if(!arrayList.isEmpty()){
            return arrayList.get(0);
        } else {
            return null;
        }
    }

    @Override
    public boolean isEmpty() {
        return arrayList.isEmpty();
    }
}
