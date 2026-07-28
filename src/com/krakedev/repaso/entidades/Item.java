package com.krakedev.repaso.entidades;

public class Item {
    private String nombre;
    private int productosActuales;
    private int productosDevueltos;
    private int productosVendidos;

    // getters
    public String getNombre() { return nombre; }
    public int getProductosActuales() { return productosActuales; }
    public int getProductosDevueltos() { return productosDevueltos; }
    public int getProductosVendidos() { return productosVendidos; }

    // setters
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setProductosActuales(int productosActuales) { this.productosActuales = productosActuales; }
    public void setProductosDevueltos(int productosDevueltos) { this.productosDevueltos = productosDevueltos; }
    public void setProductosVendidos(int productosVendidos) { this.productosVendidos = productosVendidos; }
}
