package com.company;

public class Main {

    public static void main(String[] args) {
        PrzykladPrzeciazanie przyklad = new PrzykladPrzeciazanie();

        przyklad.wypisz(10);
        przyklad.wypisz(19.2);
        przyklad.wypisz("Przeciazenie argument tekst");
    }
}

class PrzykladPrzeciazanie {
    public void wypisz(int a) {
        System.out.println("Int: " + a);
    }

    public void wypisz(double a) {
        System.out.println("Double: " + a);
    }

    public void wypisz(String a) {
        System.out.println("String: " + a);
    }
}