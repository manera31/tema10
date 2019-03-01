package com.joanmanera.tema10.ejercicio10;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Empleado {
    private String dni;
    private String nombre;
    private String apellidos;
    private GregorianCalendar fechaNac;
    private float sueldo;
    private boolean haveHijo;
    private ArrayList<Hijo> arrayListHijos;

    public Empleado(String dni, String nombre, String apellidos, GregorianCalendar fechaNac, float sueldo, boolean haveHijo) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNac = fechaNac;
        this.sueldo = sueldo;
        this.haveHijo = haveHijo;
        this.arrayListHijos = new ArrayList<>();
    }
    public boolean setHijo(int numHijos){
        String nombre;
        int edad;
        Scanner lector = new Scanner(System.in);
        for(int i = 0 ; i < numHijos ; i++){
            System.out.println("Hijo "+(i+1));
            System.out.print("Nombre: ");
            nombre = lector.nextLine();
            System.out.print("Edad: ");
            edad = lector.nextInt();
            lector.nextLine();

            setHaveHijo(true);
            arrayListHijos.add(new Hijo(nombre, edad));
        }
        return true;
    }
    public boolean removeHijo(String nombre){
        for(int i = 0 ; i < arrayListHijos.size() ; i++){
            if(arrayListHijos.get(i).getNombre().toLowerCase().equals(nombre.toLowerCase())){
                arrayListHijos.remove(i);
                return true;
            }
        }
        return false;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public GregorianCalendar getFechaNac() {
        return fechaNac;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public boolean haveHijo() {
        return haveHijo;
    }

    public void setHaveHijo(boolean haveHijo) {
        this.haveHijo = haveHijo;
    }
}
