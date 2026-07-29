package com.krakedev.repaso.test;
import com.krakedev.repaso.entidades.Item;

public class TestItem {
    public static void main(String[] args) {
        Item item1 = new Item("Carro", 20);
        item1.vender(8);
        item1.imprimir();
    }
}
