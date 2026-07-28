package com.krakedev.repaso.test;
import com.krakedev.repaso.entidades.Producto;

public class TestProducto {
    public static void main(String[] args) {
        Producto p1 = new Producto("Cuaderno", 10.25);
        Producto p2 = new Producto("Cuaderno", 10.25);
        Producto p3 = new Producto("Cuaderno", 10.25);

        // setPrecio, los valores negativos pasan a positivo
        // El valor 0 se ignora
        p1.setPrecio(10);
        p2.setPrecio(0);
        p3.setPrecio(-5);

        // Calcular precioPromo, los valores negativos se ignoran
        double p1Promo = p1.calcularPrecioPromo(10);
        double p2Promo = p2.calcularPrecioPromo(15);
        double p3Promo = p3.calcularPrecioPromo(-5);

        System.out.println("Producto 1 con descuento del 10%: " + p1Promo);
        System.out.println("Producto 2 con descuento del 15%: " + p2Promo);
        System.out.println("Producto 3 con descuento del -5%: " + p3Promo);
    }
}
