package com.joanmanera.tema10;

import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.Random;

//Esta es la libreria que utilizo. En ella tengo métodos para limpiar la pantalla y para generar numeros aleatorios.
public class Lib {
    private static Scanner lector = new Scanner(System.in);

    private static Random rdn = new Random();

    public static void limpiarPantallaConMensaje() {
        System.out.println();
        System.out.println("Pulsa intro para continuar...");
        lector.nextLine();
        System.out.print("\u001B[H\u001B[2J");
        System.out.flush();
    }

    public static void limpiarPantalla() {
        System.out.print("\u001B[H\u001B[2J");
        System.out.flush();
    }

    public static int randomAleatorio(int min, int max) {
        return rdn.nextInt(max - min + 1) + min;
    }

    public static int randomAleatorio(int num) {
        return rdn.nextInt(num);
    }

    public static double randomAleatorio(double min, double max){
        return min + (max - min) * rdn.nextDouble();
    }

    public int getEdad(GregorianCalendar fechaNacimiento) {
        LocalDate hoy = LocalDate.now();
        LocalDate cumple;
        Period p;
        int anyo = fechaNacimiento.get(Calendar.YEAR);
        //fechaNacimiento.get(Calendar.MONTH) devuelve en el rango [0-11], hay que sumar 1
        int mes = fechaNacimiento.get(Calendar.MONTH) + 1;
        int dia = fechaNacimiento.get(Calendar.DAY_OF_MONTH);


        cumple = LocalDate.of(anyo, mes, dia);
        p = Period.between(cumple, hoy);
        return p.getYears();
    }
}