package com.krakedev.repaso.entidades;

public class Producto {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public void setPrecio(double precio) {
        if(precio < 0) { this.precio = precio * -1; }
        else if(precio > 0) { this.precio = precio; }
    }

    public double calcularPrecioPromo(double porcentajeDescuento) {
        if(porcentajeDescuento >= 0 && porcentajeDescuento <= 100) {
            precio = precio * (100 - porcentajeDescuento) / 100;
        }
        return precio;
    }
}
