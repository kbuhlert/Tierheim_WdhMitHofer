package com.company;

public class Tierheim_WdhMethoden {
    public static void main(String[] args) {
        System.out.println("Willkommen im glücklichen Tierheim!");
        // Hund Lassie - 20 kg, spielfreudig, löst Kriminalfälle
        double futterLassie = berechneFuttermenge(20);
        System.out.println("Lassie bekommt " + futterLassie + "kg Futter");
        // fuettern am Abend
        double gew = 21;    //Lassies Gewicht wird als Variable eingelesen und um 1 erhöht (++gew;)
        ++gew;
        futterLassie = berechneFuttermenge(gew);
        System.out.println("Lassie bekommt am Abend" + futterLassie + "kg Futter");
    }

    static double berechneFuttermenge(double gewicht){
        double futtermenge;
        futtermenge = gewicht/20;
        return futtermenge; //ganz kurz geschrieben: return gewicht/20;
    }
}
