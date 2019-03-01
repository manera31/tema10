package com.joanmanera.tema10.ejercicio05;

import java.util.GregorianCalendar;

public class Paciente {
    private static int idAuto = 1;
    private int id;
    private String nombre;
    private GregorianCalendar fechaNac;
    private char sexo;
    private float altura;
    private float peso;

    public Paciente(String nombre, GregorianCalendar fechaNac, char sexo, float altura, float peso) {
        this.id = idAuto++;
        this.nombre = nombre;
        this.fechaNac = fechaNac;
        this.sexo = sexo;
        this.altura = altura;
        this.peso = peso;
    }

    public float getIMC(){
        return peso/(altura*altura);
    }

    public int getEdad(){
        GregorianCalendar fechaActual = new GregorianCalendar();
        long difMillis = fechaActual.getTimeInMillis()-fechaNac.getTimeInMillis();
        return (int)(((((difMillis/1000)/60)/60)/24)/365.25);
    }

    public String getIMCMessage(){
        float imc = getIMC();
        if(imc < 18.5){
            return "Peso insuficiente";
        } else if(imc >= 18.5 && imc <= 24.9){
            return "Peso normal";
        } else if(imc >= 25 && imc <= 26.9){
            return "Sobrepeso grado I";
        } else if(imc >= 27 && imc <= 29.9){
            return "Sobrepeso grado II";
        } else if(imc > 29.9){
            return "Sobrepeso grado III";
        } else {
            return "ERROR en el método getIMCMessage()";
        }
    }
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public GregorianCalendar getFechaNac() {
        return fechaNac;
    }

    public char getSexo() {
        return sexo;
    }

    public float getAltura() {
        return altura;
    }

    public float getPeso() {
        return peso;
    }
}
