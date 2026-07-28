package com.krakedev.repaso.test;
import com.krakedev.repaso.entidades.Estudiante;

public class TestEstudiante {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Juan");
        Estudiante estudiante2 = new Estudiante("Pedro");
        Estudiante estudiante3 = new Estudiante("Francisco");

        estudiante1.calificar(8.00000001);
        estudiante2.calificar(8);
        estudiante3.calificar(7.9999999);
        
        System.out.println("Resultado estudiante 1: " + estudiante1.getResultado());
        System.out.println("Resultado estudiante 2: " + estudiante2.getResultado());
        System.out.println("Resultado estudiante 3: " + estudiante3.getResultado());
    }
}
