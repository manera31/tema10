package com.joanmanera.tema10.ejercicio01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Ejercicio01 {

    private ArrayList<Integer> numerosArrayList = new ArrayList<Integer>(10);


    public Ejercicio01(){
        int[] numerosArray = generarNumeros();
        System.out.println(Arrays.toString(numerosArray));

        ArrayList<Integer> numerosArrayList;
        numerosArrayList = dividirParesEImpares(numerosArray);
        System.out.println(Arrays.toString(numerosArrayList.toArray()));
    }

    private int[] generarNumeros(){
        int[] numerosArray = new int[10];
        Random rdn = new Random();
        for(int i = 0 ; i < numerosArray.length ; i++){
            numerosArray[i] = rdn.nextInt(50);
        }
        return numerosArray;
    }

    private ArrayList dividirParesEImpares(int[] array){
        ArrayList<Integer> numerosArrayList = new ArrayList<Integer>(10);
        int contadorFin = array.length-1, contadorInicio=0;

        for(int i = 0 ; i < array.length ; i++){
            numerosArrayList.add(i, 0);
        }

        for(int i = 0 ; i < array.length ; i++){
            if(array[i]%2 == 0){
                numerosArrayList.set(contadorInicio, array[i]);
                contadorInicio++;
            } else {
                numerosArrayList.set(contadorFin, array[i]);
                contadorFin--;
            }
        }

        return numerosArrayList;
    }

}
