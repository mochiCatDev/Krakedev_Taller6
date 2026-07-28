package com.krakedev.repaso.test;
import com.krakedev.repaso.entidades.Validacion;

public class TestValidacion {
    public static void main(String[] args) {
        Validacion v1 = new Validacion();

        // Pruebas método validarMonto
        System.out.println("Resultado validación con valor 10: " + v1.validarMonto(10));
        System.out.println("Resultado validación con valor 0: " + v1.validarMonto(0));
        System.out.println("Resultado validación con valor -3: " + v1.validarMonto(-3));
    }
}
