package com.krakedev.repaso.test;
import com.krakedev.repaso.entidades.Item;

public class TestItem {
    public static void main(String[] args) {
        Item item1 = new Item("Carro de juguete", 20);
        Item item2 = new Item("Muñecos", 80);
        Item item3 = new Item("Cuadernos", 42);

        item1.vender(8);
        item1.devolver(5);
        item1.imprimir();

        item2.vender(22);
        item2.devolver(12);
        item2.imprimir();

        item3.vender(28);
        item3.imprimir();
        item3.vender(12);
        item3.imprimir();
    }
}
