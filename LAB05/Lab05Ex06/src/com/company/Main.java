package com.company;

public class Main {

    public static void main(String[] args) {

        PrzykladowaKlasa obiekt = new PrzykladowaKlasa();
        obiekt.przykladowaMetoda();
        obiekt.innaMetoda();
    }
}

interface PrzykladowyInterfejs {
    void przykladowaMetoda();
}

interface InnyInterfejs {
    void innaMetoda();
}

class PrzykladowaKlasa implements PrzykladowyInterfejs, InnyInterfejs {

    @Override
    public void przykladowaMetoda() {
        System.out.println("Implementacja przykladowejMetody");
    }

    @Override
    public void innaMetoda() {
        System.out.println("Implementacja innejMetody");
    }
}