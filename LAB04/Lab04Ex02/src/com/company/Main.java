package com.company;

public class Main {

    public static void main(String[] args) {

        Kalkulator kalkulatorPodstawowy = new Kalkulator();
        System.out.println(kalkulatorPodstawowy.dodaj(10, 20));
        System.out.println(kalkulatorPodstawowy.odejmij(10, 20));
        System.out.println();

        KalkulatorStatystyczny kalkulatorStatystyczny = new KalkulatorStatystyczny();
        System.out.println(kalkulatorStatystyczny.dodaj(10, 20));
        System.out.println(kalkulatorStatystyczny.odejmij(10, 20));
        System.out.println(kalkulatorStatystyczny.sinus(89));
    }
}

class Kalkulator {
    public int dodaj(int a, int b) {
        return a + b;
    }

    public int odejmij(int a, int b) {
        return a - b;
    }
}

class KalkulatorStatystyczny extends Kalkulator {

    public double sinus(int stopien) {
        double radian = stopien * 3.14159 / 180;
        return Math.sin(radian);
    }
}