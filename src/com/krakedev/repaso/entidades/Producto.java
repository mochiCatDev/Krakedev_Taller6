package com.krakedev.repaso.entidades;

public class Producto {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public void setPrecio(double precio) { 
        if(precio < 0) { precio = precio * -1; }
        else { this.precio = precio; }
    }
}
