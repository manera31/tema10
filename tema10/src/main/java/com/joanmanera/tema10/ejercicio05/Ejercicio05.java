package com.joanmanera.tema10.ejercicio05;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Ejercicio05 {
    public Ejercicio05(){
        CentroSalud cs = new CentroSalud();

        cs.addPaciente("paciente1", new GregorianCalendar(1980, Calendar.FEBRUARY, 12), 'F', 1.63f, 57f);

        cs.addPaciente("paciente2", new GregorianCalendar(1990, Calendar.MARCH, 7), 'F', 1.74f, 60.5f);

        cs.addPaciente("paciente3", new GregorianCalendar(1967, Calendar.MARCH, 20), 'F', 1.62f, 50.8f);

        cs.addPaciente("paciente4", new GregorianCalendar(1972, Calendar.APRIL, 20), 'M', 1.78f, 72.5f);

        cs.addPaciente("paciente5", new GregorianCalendar(1960, Calendar.FEBRUARY, 29), 'M', 1.8f, 85.2f);

        cs.imprimirPacientes();

    }
}
