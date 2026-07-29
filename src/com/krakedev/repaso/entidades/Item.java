package com.krakedev.repaso.entidades;

public class Item {
    private String nombre;
    private int productosActuales;
    private int productosDevueltos;
    private int productosVendidos;

    // constructor
    public Item(String nombre) { this.nombre = nombre; }
    public Item(String nombre, int productosActuales) { 
        this.nombre = nombre;
        this.productosActuales = productosActuales; 
    }
    public Item(String nombre, int productosActuales, int productosDevueltos, int productosVendidos) { 
        this.nombre = nombre;
        this.productosActuales = productosActuales;
        this.productosDevueltos = productosDevueltos;
        this.productosVendidos = productosVendidos;
    }

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
        System.out.println("| Nombre: %-27s |".formatted(nombre));
        System.out.println("| Productos Actuales: %-15d |".formatted(productosActuales));
        System.out.println("| Productos Devueltos: %-14d |".formatted(productosDevueltos));
        System.out.println("| Productos Vendidos: %-15d |".formatted(productosVendidos));
        System.out.println("+-------------------------------------+");
    }

    public void vender(int productosVendidos) {
        if (productosVendidos <= 0) {
            System.out.println("Error: La cantidad a vender debe ser mayor a cero.");
            return;
        }
        if (productosVendidos > productosActuales) {
            System.out.println("Error: Stock insuficiente. Stock actual: " + productosActuales);
            return;
        }

        productosActuales -= productosVendidos;
        this.productosVendidos += productosVendidos;
}

    public void devolver(int productosDevueltos) {
        if (productosDevueltos <= 0) {
            System.out.println("Error: La cantidad a devolver debe ser mayor a cero.");
            return;
        }
        if (productosDevueltos > productosVendidos) {
            System.out.println("Error: No se pueden devolver más productos de los que se han vendido. Vendidos: " + productosVendidos);
            return;
        }
        
        productosActuales += productosDevueltos;
        productosVendidos -= productosDevueltos;
        this.productosDevueltos += productosDevueltos;
    }
}
