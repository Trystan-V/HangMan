package co.trystan;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Mots {

    String motGenerey;
    String[] motMasquey;

    public Mots() {
        Random rand = new Random();
        List<String> liste = Arrays.asList("ninja", "camouflage", "shuriken", "technique");

        int nombreDElements = 1;

        for (int i = 0; i < nombreDElements; i++) {
            int randomIndex = rand.nextInt(liste.size());
            this.motGenerey = liste.get(randomIndex);
            // System.out.println(randomElement);
        }

        int tailleDuTableau = this.motGenerey.length();

        this.motMasquey = new String[tailleDuTableau];

    }

    public void initMotMasquey() {

        for (String emplacement : this.motMasquey) {

            emplacement = "_";
        }
    }

    public void afficherEmplacementMotMasquey() {
        
        for (String string : this.motMasquey) {
            System.out.println(string + " ");
        }
    }
}