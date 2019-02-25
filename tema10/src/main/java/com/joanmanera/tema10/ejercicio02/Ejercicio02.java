package com.joanmanera.tema10.ejercicio02;

import com.joanmanera.tema10.Lib;

import java.util.ArrayList;
import java.util.HashMap;

public class Ejercicio02 implements IEstadisticas {
    private int NUM_ARRAY = 100;
    private ArrayList<Double> array = new ArrayList<>(NUM_ARRAY);

    public Ejercicio02(){

        for (int i = 0; i < NUM_ARRAY ; i++){
            array.add(Lib.randomAleatorio(1.0, 5.0));
        }

        System.out.printf("Minimo: %.2f\n",minimo());
        System.out.printf("Maximo: %.2f\n",maximo());
        System.out.printf("Sumatorio: %.2f\n",sumatorio());
        System.out.printf("Media: %.2f\n",media());
        System.out.printf("Moda: %.2f\n",moda());
    }

    @Override
    public double minimo() {
        double min = Double.MAX_VALUE;
        for (int i = 0 ; i < array.size() ; i++){
            if(array.get(i) < min){
                min = array.get(i);
            }
        }
        return min;
    }

    @Override
    public double maximo() {
        double max = Double.MIN_VALUE;
        for (int i = 0 ; i < array.size() ; i++){
            if(array.get(i) > max){
                max = array.get(i);
            }
        }
        return max;
    }

    @Override
    public double sumatorio() {
        double sumatorio=0;

        for (int i = 0 ; i < array.size() ; i++){
            sumatorio += array.get(i);
        }
        return sumatorio;
    }

    @Override
    public double media() {
        return sumatorio()/array.size();
    }

    @Override
    public double moda() {
        HashMap<Double, Integer> map = new HashMap<>();
        double contadorKey = 0;
        int contadorValue = Integer.MIN_VALUE;

        for (int i = 0 ; i < array.size() ; i++){
            if(map.containsKey(array.get(i))){
                map.replace(array.get(i), map.get(array.get(i)), (map.get(array.get(i))+1));
            } else {
                map.put(array.get(i), 1);
            }

            if(map.get(array.get(i))>contadorValue){
                contadorValue = map.get(array.get(i));
                contadorKey = array.get(i);
            }
        }
        return contadorKey;
    }
}
