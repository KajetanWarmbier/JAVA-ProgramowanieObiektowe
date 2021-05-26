package com.company;

public class Main {

    public static void main(String[] args) {

        KontoBankowe rachunek = new KontoBankowe();

        rachunek.pokazSaldo();

        rachunek.kredyt(100);
        rachunek.pokazSaldo();

        rachunek.debet(50);
        rachunek.pokazSaldo();
    }
}

class KontoBankowe {

    private int saldo = 0;

    public void pokazSaldo() {
        System.out.println("Saldo wynosi: " + saldo);
    }

    public void kredyt(int ilosc) {
        saldo += ilosc;
    }

    public void debet(int ilosc) {
        saldo -= ilosc;
    }
}
