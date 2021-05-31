package com.company;

public class Main {

    public static void main(String[] args) {

        Podstawowa podstawa = new Podstawowa();
        podstawa.wypiszTekstF();
        podstawa.wypiszTekstG();

        Pochodna pochodna1 = new Pochodna();
        pochodna1.wypiszTekstF();
        pochodna1.wypiszTekstG();
        pochodna1.wypiszTekstH();

        Pochodna pochodna2 = new Pochodna();
        pochodna2.wypiszTekstF();
        pochodna2.wypiszTekstG();
    }
}

class Podstawowa {

    public void wypiszTekstG() {
        System.out.println("G() w Podstawowa");
    }

    public void wypiszTekstF() {
        System.out.println("F() w Podstawowa");
    }
}

class Pochodna extends Podstawowa {

    public void wypiszTekstG() {
        System.out.println("G() w Pochodna");
    }

    public void wypiszTekstH() {
        System.out.println("H() w Pochodna");
    }
}