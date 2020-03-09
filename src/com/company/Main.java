package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int alter = 10;
        if (alter >= 18){
            System.out.println("Ich darf in den Club!");
        }
        else if (alter >= 16){
            System.out.println("Ich darf rein, aber nur mit Wein!");
        }
        else {
            System.out.println("Gehe inzwischen Pizza essen.");
        }
        System.out.println("Warte gelangweilt im Auto");

        //Bsp. für Switch:
        int note = 2, stipendium;   //mehrere int können in einer Zeile definiert werden

        // Berechne Förderstipendium
        switch (note){
            case 1: //hier steht was passiert wenn Note = 1
                stipendium = 100;
                break;
            case 2:
                stipendium = 50;
                break;
            case 3:
                stipendium = 30;
                break;
            default:
                stipendium = 0;
                break;
        }
        System.out.println("Stipendiumshöhe: " + stipendium + "€");

    }
}
