package com.company;

public class Main {

    public static void main(String[] args) {

        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i] + ", ");
        }

        System.out.println("");

        String wynik = "";

        for (String liczba: args) {
            wynik += liczba + ", ";
        }

        System.out.print(wynik);

    }
}
