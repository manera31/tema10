package com.joanmanera.tema10.ejercicio06;


import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio06 {
    private Scanner lector = new Scanner(System.in);
    private HashMap<String, String> palabras = new HashMap<>();

    public Ejercicio06(){
        int opcionMenu;
        do {
            opcionMenu = menu();
            switch (opcionMenu) {
                case 1:
                    pedirPalabras();
                    break;
                case 2:
                    traducirPalabra();
                    break;
                case 0:
                    System.out.println("Hasta la proxima!");
                    break;
            }
        } while (opcionMenu != 0);
    }
    private int menu(){
        int opcion;
        do {
            System.out.println("MENU PRINCIPAL");
            System.out.println("==============");
            System.out.println("1. Introducir pares de palabras.");
            System.out.println("2. Traducir palabra.");
            System.out.println("0. Salir de la aplicación");
            System.out.print("Introduce una opcion: ");
            opcion = lector.nextInt();
            lector.nextLine();
        }while (opcion < 0 || opcion > 2);
        return opcion;
    }
    private void pedirPalabras(){
        String ingles, castellano;
        System.out.print("Cuantos pares de palabras quieres introducir? ");
        int pares = lector.nextInt();
        lector.nextLine();
        for(int i = 0 ; i < pares ; i++){
            System.out.print("Inserta la palabra en ingles "+(i+1)+": ");
            ingles = lector.nextLine();
            System.out.print("Inserta la palabra en castellano "+(i+1)+": ");
            castellano = lector.nextLine();

            palabras.put(ingles, castellano);
        }
        System.out.print("\n");
    }
    private void traducirPalabra(){
        System.out.print("Inserta la palabra a buscar: ");
        String ingles = lector.nextLine();
        if(palabras.containsKey(ingles)){
            System.out.print(palabras.get(ingles)+"\n");
        } else {
            System.out.println("La palabra no existe.");
        }
        System.out.print("\n");
    }
}
