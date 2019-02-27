package com.joanmanera.tema10.ejercicio04;

import java.util.LinkedList;

public class Ejercicio04 {
    public Ejercicio04(){
        Cola<Integer> cola = new Cola<>();
        System.out.println("IsEmpty: "+cola.isEmpty());
        System.out.println("\nSize: "+cola.size());
        System.out.println("\nPeek: "+cola.peek());

        System.out.println("\nAñadir: 1, 2, 3, 4, 5");
        cola.add(1);
        cola.add(2);
        cola.add(3);
        cola.add(4);
        cola.add(5);
        System.out.println(cola.toString());

        System.out.println("\nBorrar: "+cola.remove()+", "+cola.remove());
        System.out.println(cola.toString());

        System.out.println("\nAñadir: 6, 7, 8");
        cola.add(6);
        cola.add(7);
        cola.add(8);
        System.out.println(cola.toString());

        System.out.println("\nIsEmpty: "+cola.isEmpty());
        System.out.println("\nSize: "+cola.size());
        System.out.println("\nPeek: "+cola.peek());


    }
}
