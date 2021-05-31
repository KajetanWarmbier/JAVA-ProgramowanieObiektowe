package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Ksztalt> ksztalty = new ArrayList<>();

        ksztalty.add(new Kolo(5));
        ksztalty.add(new Kwadrat(5));

        for(Ksztalt s : ksztalty) {
            System.out.println("Powierzchnia kształtu wynosi: " + s.obliczPowierzchnie());
        }
    }
}

interface Ksztalt {
    double obliczPowierzchnie();
    double obliczObwod();
}

class Kwadrat implements Ksztalt {
    double dlugoscBoku;

    public Kwadrat(double dlugoscBoku) {
        this.dlugoscBoku = dlugoscBoku;
    }

    @Override
    public double obliczPowierzchnie() {
        return dlugoscBoku * dlugoscBoku;
    }

    @Override
    public double obliczObwod() {
        return dlugoscBoku * 4;
    }
}

class Kolo implements Ksztalt {
    double promien;

    public Kolo(double promien) {
        this.promien = promien;
    }

    @Override
    public double obliczPowierzchnie() {
        return Math.PI * promien * promien;
    }

    @Override
    public double obliczObwod() {
        return 2 * Math.PI * promien;
    }
}