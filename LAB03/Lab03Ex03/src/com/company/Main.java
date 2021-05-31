package com.company;

public class Main {

    public static void main(String[] args) {

        Przyklad p1 = new Przyklad();
        p1.wypisz();

        Przyklad p2 = new Przyklad(10);
        p2.wypisz();

        Przyklad p3 = new Przyklad(50, 4.5);
        p3.wypisz();
    }
}

class Przyklad {

    private double polePierwsze;
    private double poleDrugie;

    public Przyklad() {
        polePierwsze = 0;
        poleDrugie = 0;
    }

    public Przyklad(double r) {
        polePierwsze = r;
        poleDrugie = 0;
    }

    public Przyklad(double r, double n) {
        polePierwsze = r;
        poleDrugie = n;
    }

    public void wypisz() {
        System.out.println(polePierwsze + " i " + poleDrugie);
    }
}