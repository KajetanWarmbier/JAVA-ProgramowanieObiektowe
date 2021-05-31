package com.company;

public class Main {

    public static void main(String[] args) {

        Przyklad s = new Przyklad();
        s.wypisz();

        Przyklad s1 = new Przyklad(10);
        s1.wypisz();
    }
}

class Przyklad {
    private int wartosc;

    Przyklad() {
        wartosc = 19;
    }

    Przyklad(int n) {
        wartosc = n;
    }

    public void wypisz() {
        System.out.println(wartosc);
    }
}
