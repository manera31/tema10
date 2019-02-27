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
        T aux = arrayList.get(0);
        arrayList.remove(aux);
        return aux;
    }

    @Override
    public int size() {
        return arrayList.size();
    }

    @Override
    public T peek() {
        if(!arrayList.isEmpty()){
            return arrayList.get(arrayList.size()-1);
        } else {
            return null;
        }
    }

    @Override
    public boolean isEmpty() {
        return arrayList.isEmpty();
    }
}
