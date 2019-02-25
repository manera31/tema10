package com.joanmanera.tema10.ejercicio03;

import java.util.Stack;

public class Ejercicio03 {
    public Ejercicio03(){
        Pila<String> pila = new Pila(5);
        System.out.println("Push: "+pila.push("Hola "));
        System.out.println("Push: "+pila.push("Mundo"));
        System.out.println("Pop: "+pila.pop());
        System.out.println("Size: "+pila.size());
        System.out.println("Top: "+pila.top());
        System.out.println("isEmpty: "+pila.isEmpty());
    }
}
