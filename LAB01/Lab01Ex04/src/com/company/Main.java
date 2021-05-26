package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner wejscie = new Scanner (System.in);

        System.out.println("Proszę podać liczbę wierszy.");
        int wiersze = wejscie.nextInt();

        System.out.println("Proszę podać liczbę kolumn.");
        int kolumny = wejscie.nextInt();

        System.out.println("\n=============================\n");

        for (int i = 1; i <= wiersze; i++) {

            for (int x = 1; x <= kolumny; x++) {
                System.out.print(i*x + "\t" );
            }

            System.out.println();
        }


    }
}
