package com.krakedev.repaso.entidades;

public class Estudiante {
    private String nombre;
    private double nota;
    private String resultado;

    // getters
    public String getNombre() { return nombre; }
    public double getNota() { return nota; }
    public String getResultado() { return resultado; }

    // setters
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setNota(double nota) { this.nota = nota; }
    public void setResultado(String resultado) { this.resultado = resultado; }

    public Estudiante(String nombre) {
        this.nombre = nombre;
    }

    public void calificar(double nota) {
        this.nota = nota;
        if (nota < 8) {
            resultado = "F";
        } else {
            resultado = "A";
        }
    }
}
