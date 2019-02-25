package com.joanmanera.tema10.ejercicio04;

public interface ICola<String> {
    boolean add(String e);
    String remove();
    int size();
    String peek();
    boolean isEmpty();
}