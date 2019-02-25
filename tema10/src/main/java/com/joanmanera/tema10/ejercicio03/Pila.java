package com.joanmanera.tema10.ejercicio03;

import java.util.ArrayList;

public class Pila<T> implements IPila<T> {

    private ArrayList<T> arrayList;

    public Pila(){
        arrayList = new ArrayList<>();
    }

    public Pila(int numero){
        arrayList = new ArrayList<>(numero);
    }

    @Override
    public T push(T e) {
        arrayList.add(e);
        return e;
    }

    @Override
    public T pop() {
        T cadena = arrayList.get(arrayList.size()-1);
        arrayList.remove(arrayList.size()-1);
        return cadena;
    }

    @Override
    public int size() {
        return arrayList.size();
    }

    @Override
    public T top() {
        return arrayList.get(arrayList.size()-1);
    }

    @Override
    public boolean isEmpty() {
        return arrayList.isEmpty();
    }
}
