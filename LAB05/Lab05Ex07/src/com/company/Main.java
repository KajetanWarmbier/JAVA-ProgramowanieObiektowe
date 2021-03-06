package com.company;

public class Main {

    public static void main(String[] args) {

        SystemAudioSpecyficzny audio = new SystemAudioSpecyficzny();
        audio.odtwarzaj();
        audio.nagrywaj();
        audio.odtwarzajRadio();
        audio.wylacz();
    }
}

interface OdtwarzaczAudio {
    void odtwarzaj();
}

interface NagrywarkaAudio {
    void nagrywaj();
}

interface OdtwarzaczRadio {
    void odtwarzajRadio();
}

interface SystemAudio extends OdtwarzaczAudio, NagrywarkaAudio {

}

abstract class SystemAudioPodstawowy implements SystemAudio, OdtwarzaczRadio{

    public void odtwarzaj() {
        System.out.println("Odtwarzaj audio");
    }


    public void nagrywaj() {
        System.out.println("Nagrywaj audio");
    }
}

class SystemAudioSpecyficzny extends SystemAudioPodstawowy{
    @Override
    public void odtwarzajRadio() {
        System.out.println("Odtwarzaj Radio");
    }

    public void wylacz() {
        System.out.println("Wyłącz");
    }
}