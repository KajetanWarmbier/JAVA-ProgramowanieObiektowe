package com.company;

public class Main {

    public static void main(String[] args) {

        Operacje o1 = new Operacje(8, 8);
        Operacje o2 = new Operacje(1);

        System.out.println(o1.wykonajOperacjeMatemtycznaDodawanie());
        System.out.println(o1.wykonajOperacjeMatematycznaDodawanie(-1));

        System.out.println(o2.wykonajOperacjeMatematycznaMnozenie(1,1));
        System.out.println(o2.wykonajOperacjeMatematycznaDodawanie(7));
    }
}

class Operacje {
    int a;
    int b;

    public Operacje() {

    }

    public Operacje(int a) {
        this.a = a;
    }

    public Operacje(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int wykonajOperacjeMatemtycznaDodawanie() {
        return a + b;
    }

    public int wykonajOperacjeMatematycznaDodawanie(int a) {
        return a + b;
    }

    public int wykonajOperacjeMatematycznaMnozenie(int a, int b) {
        return a * b;
    }
}
