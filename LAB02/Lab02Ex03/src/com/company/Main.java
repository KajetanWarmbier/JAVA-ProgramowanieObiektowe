package com.company;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        KoszykProduktow koszyk = new KoszykProduktow();

        koszyk.dodajProduktDoKoszyka("P1");
        koszyk.dodajProduktDoKoszyka("P2");
        koszyk.dodajProduktDoKoszyka("P3");

        koszyk.pokazZamowienie();
    }
}

class KoszykProduktow {
    private LinkedList produkty = new LinkedList();

    public void dodajProduktDoKoszyka(String produkt) {
        produkty.add(produkt);
    }

    public void pokazZamowienie() {
        System.out.println("Zamówione produkty:");
        System.out.println(produkty);
    }
}
