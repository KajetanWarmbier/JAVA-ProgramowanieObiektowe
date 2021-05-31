package com.company;

public class Main {

    public static void main(String[] args) {

        Punkt p0 = new Punkt(10, 20);
        System.out.println(p0);

        Linia l1 = new Linia(0, 0, 3, 4);
        System.out.println(l1);

        Punkt p1 = new Punkt(4, 20);
        Punkt p2 = new Punkt(10, 20);
        Linia l2 = new Linia(p1, p2);
        System.out.println("Początek: " + l2.getPoczatek());
        System.out.println("Koniec: " + l2.getKoniec());
    }
}

class Punkt {

    private int x;
    private int y;

    public Punkt(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Punkt: (" + x + ", " + y + ")";
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setXY(int x, int y) {
        this.y = y;
        this.x = x;
    }
}

class Linia {
    private Punkt poczatek;
    private Punkt koniec;

    public Linia(Punkt poczatek, Punkt koniec) {
        this.poczatek = poczatek;
        this.koniec = koniec;
    }

    public Linia (int poczatekX, int poczatekY, int koniecX, int koniecY) {
        poczatek = new Punkt(poczatekX, poczatekY);
        koniec = new Punkt(koniecX, koniecY);
    }

    public Punkt getPoczatek() {
        return poczatek;
    }

    public void setPoczatek(Punkt poczatek) {
        this.poczatek = poczatek;
    }

    public Punkt getKoniec() {
        return koniec;
    }

    public void setKoniec(Punkt koniec) {
        this.koniec = koniec;
    }
}
