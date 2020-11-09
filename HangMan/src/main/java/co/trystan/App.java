package co.trystan;

import java.util.Scanner;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
       
        Intro debut = new Intro();
        debut.leNomEtLesRegles();

        Mots mot = new Mots();
        mot.initMotMasquey();
        mot.afficherEmplacementMotMasquey();

        Plateau visuel = new Plateau();
        visuel.visuel(); 

    }
}
