package com.company;

public class Main {

    public static void main(String[] args) {

        int liczba = 1;
        float fLiczba = 7.1f;
        double dLiczba = 5.2;
        String tekst = "Tu Jakiś tekst";
        String tekst0 = "Inny tekst";
        boolean bZmienna = true;

        System.out.println("Tu mamy " + tekst + ", a tu jest " + tekst0);
        System.out.println(bZmienna);

        if(args.length == 2) {
            System.out.println(args[0]);
            System.out.println(args[1]);
        }

    }
}
