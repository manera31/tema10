package com.joanmanera.tema10.ejercicio05;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class CentroSalud {
    private ArrayList<Paciente> pacientes;
    private Paciente paciente;

    public CentroSalud(){
        pacientes = new ArrayList<>();
    }

    public CentroSalud(int numero){
        pacientes = new ArrayList<>(numero);
    }

    public void addPaciente(int id, String nombre, GregorianCalendar fechaNac, char sexo, float altura, float peso){
        pacientes.add(paciente = new Paciente(id, nombre, fechaNac, sexo, altura, peso));
    }

    public int[] menorMayor(){
        int[] menorMayor = new int[2];
        long mayor = Long.MIN_VALUE;
        long menor = Long.MAX_VALUE;
        for (int i = 0 ; i < pacientes.size() ; i++){
            if(pacientes.get(i).getFechaNac().getTimeInMillis() > mayor){
                mayor = pacientes.get(i).getFechaNac().getTimeInMillis();
                menorMayor[1] = i;
            }
            if(pacientes.get(i).getFechaNac().getTimeInMillis() < menor){
                menor = pacientes.get(i).getFechaNac().getTimeInMillis();
                menorMayor[0] = i;
            }
        }
        return menorMayor;
    }

    public int[] pacientesPorSexo(){
        int[] hombreMujer = new int[2];
        for (int i = 0 ; i <  pacientes.size() ; i++){
            if(pacientes.get(i).getSexo() == 'M'){
                hombreMujer[0] += 1;
            } else {
                hombreMujer[1] += 1;
            }
        }
        return hombreMujer;
    }

    public void imprimirPacientes(){
        System.out.printf("PACIENTE MAYOR Edad: %d Sexo: %s\n", pacientes.get(menorMayor()[1]).getEdad(), pacientes.get(menorMayor()[1]).getSexo());
        System.out.printf("PACIENTE MENOR Edad: %d Sexo: %s\n", pacientes.get(menorMayor()[0]).getEdad(), pacientes.get(menorMayor()[0]).getSexo());
        System.out.printf("\n");
        System.out.printf("Cantidad de pacientes por sexo:\n");
        System.out.printf("Hombres: %d\tMujeres: %d", pacientesPorSexo()[0], pacientesPorSexo()[1]);
        System.out.printf("\n");
        for(int i = 0 ; i < pacientes.size() ; i++){
            System.out.printf("Paciente número %d: %s.\n", pacientes.get(i).getId(), pacientes.get(i).getIMCMessage());
        }
    }
}
