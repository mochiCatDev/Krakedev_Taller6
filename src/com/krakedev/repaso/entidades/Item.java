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

    // métodos
    public void imprimir() {
        System.out.println("+-------------------------------------+");
        System.out.println("| Nombre: %-29s".formatted(nombre));
        System.out.println("| Productos Actuales: %-17d".formatted(productosActuales));
        System.out.println("| Productos Devueltos: %-16d".formatted(productosDevueltos));
        System.out.println("| Productos Vendidos: %-17d".formatted(productosVendidos));
        System.out.println("+-------------------------------------+");
    }

    public void vender(int productosVendidos) {
        productosActuales = productosActuales - productosVendidos;
        this.productosVendidos = this.productosVendidos + productosVendidos;
    }
}
