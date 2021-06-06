/*Project created and maintained by Kajetan Warmbier
 * Contact info: k.warmbier.436@studms.ug.edu.pl*/

package com.company;

public class TestApp {


    public static void main(String[] args){
        MenuGlowne menuWybierz = new MenuGlowne();
        menuWybierz.MenuPomocPole.tematPomocy();
        menuWybierz.MenuWidokPole.MenuPowiekszeniePole.pokazMiniature();
        menuWybierz.MenuWidokPole.powiekszenie();
        menuWybierz.MenuPlikPole.otworz();
        menuWybierz.MenuEdycjaPole.usun();
    }
}

class MenuPowiekszenie {

    public MenuPowiekszenie() {

    }

    public void duzy() {
        System.out.println("Rozmiar: duzy");
    }

    public void niestandardowy() {
        System.out.println("Rozmiar: niestandardowy");
    }

    public void normalny() {
        System.out.println("Rozmiar: normalny");
    }

    public void pokazMiniature() {
        System.out.println("Pokazuje miniature");
    }

    public void pokazSiatke() {
        System.out.println("Pokazuje siatke");
    }
}

class MenuWidok {
    MenuPowiekszenie MenuPowiekszeniePole = new MenuPowiekszenie();

    public MenuWidok() {

    }

    public void pasekStanu() {
        System.out.println("Pasek stanu: [***.......]");
    }

    public void pokazMapeBitowa() {
        System.out.println("OTO MAPA BITOWA!");
    }

    public void powiekszenie() {
        System.out.println("Powiekszam...");
    }

    public void przybornik() {
        System.out.println("Gumka, olowek, pedzle i farbki...");
    }

    public void selektorKoloru() {
        System.out.println(">Piekne menu z wyborem koloru<");
    }
}

class MenuPomoc {

    public MenuPomoc() {

    }

    public void informacjeOProgramie() {
        System.out.println("Program stworzony przez Kajetana Warmbier");
    }

    public void tematPomocy() {
        System.out.println("W kwestii pomocy skontaktuj się z tworca oprogramowania ;)");
    }
}

class MenuPlik {

    public MenuPlik() {

    }

    public void otworz() {
        System.out.println("Otwieram...");
    }

    public void zakoncz() {
        System.out.println("Koncze...");
    }

    public void zamknij() {
        System.out.println("puff...");
    }

    public void zapisz() {
        System.out.println("Trwa zapisywanie");
    }

    public void zapiszJako() {
        System.out.println("Zapisac jako zdane?");
    }

}

class MenuEdycja {

    public MenuEdycja() {

    }

    public void cofnij() {
        System.out.println("Cofam, cofam...");
    }

    public void kopiuj() {
        System.out.println("Skopiowano!");
    }

    public void ponow() {
        System.out.println("Ponawiam...");
    }

    public void usun() {
        System.out.println("Usuwam...");
    }

    public void wklej() {
        System.out.println("Wklejone!");
    }

    public void wytnij() {
        System.out.println("Ciach, ciach.");
    }

    public void znajdz() {
        System.out.println("Pytanie gdzie szukac?");
    }

}

class MenuGlowne {
    MenuPomoc MenuPomocPole = new MenuPomoc();
    MenuWidok MenuWidokPole = new MenuWidok();
    MenuPlik MenuPlikPole = new MenuPlik();
    MenuEdycja MenuEdycjaPole = new MenuEdycja();

    public MenuGlowne() {

    }
}