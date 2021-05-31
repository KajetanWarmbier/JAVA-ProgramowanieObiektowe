package com.company;

public class Main {

    public static void main(String[] args) {

        Samochod samochod1 = new Samochod();
        int seria = samochod1.getSeriaSilnika();
        System.out.printf("Nazwa silnika to: %d. %n", seria);
    }
}

class Silnik {
    private int seria;

    public int getSeria() {
        return seria;
    }

    public void setSeria(int seria) {
        this.seria = seria;
    }
}

class Samochod extends Silnik {
    private Silnik silnik;

     public Samochod() {
         this.silnik = new Silnik();
         silnik.setSeria(1234);
     }

     public int getSeriaSilnika() {
         return silnik.getSeria();
     }
}