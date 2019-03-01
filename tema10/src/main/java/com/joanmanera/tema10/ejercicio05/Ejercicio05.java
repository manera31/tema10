package com.joanmanera.tema10.ejercicio05;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Ejercicio05 {
    public Ejercicio05(){
        CentroSalud cs = new CentroSalud();
        GregorianCalendar gc = new GregorianCalendar();
        gc.set(Calendar.YEAR, 1980);
        gc.set(Calendar.MONTH, 2);
        gc.set(Calendar.DATE, 12);
        cs.addPaciente(1, "paciente1", gc, 'F', 1.63f, 57f);
        gc.set(Calendar.YEAR, 1990);
        gc.set(Calendar.MONTH, 3);
        gc.set(Calendar.DATE, 7);
        cs.addPaciente(2, "paciente2", gc, 'F', 1.74f, 60.5f);
        gc.set(Calendar.YEAR, 1967);
        gc.set(Calendar.MONTH, 3);
        gc.set(Calendar.DATE, 20);
        cs.addPaciente(3, "paciente3", gc, 'F', 1.62f, 50.8f);
        gc.set(Calendar.YEAR, 1972);
        gc.set(Calendar.MONTH, 4);
        gc.set(Calendar.DATE, 20);
        cs.addPaciente(4, "paciente4", gc, 'M', 1.78f, 72.5f);
        gc.set(Calendar.YEAR, 1960);
        gc.set(Calendar.MONTH, 2);
        gc.set(Calendar.DATE, 29);
        cs.addPaciente(5, "paciente5", gc, 'M', 1.8f, 85.2f);

        cs.imprimirPacientes();

    }
}
