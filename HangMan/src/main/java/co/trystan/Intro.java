package co.trystan;
import java.util.Scanner;

public class Intro {
    
    /////// METHODE POUR LE NOM DES JOUEURS ET LES REGLES \\\\\\\\\\\\\\\\

    public void leNomEtLesRegles() {

        // joueur 1

        System.out.println("Quel est ton nom ?");
       
        Scanner clavier = new Scanner(System.in);
        String entreeClavier = clavier.nextLine();

        Joueur joueur1 = new Joueur();
        joueur1.setNom(entreeClavier);


        System.out.println("Welcome " + joueur1.nom);

        // joueur 2

        // System.out.println("et toi quel est ton nom ?");
        
        // Scanner clavier2 = new Scanner(System.in);
        // String entreeClavier2 = clavier2.nextLine();

        // Joueur joueur2 = new Joueur();
        // joueur2.setNom(entreeClavier2);

        // System.out.println(" très bien " + joueur2.nom2);

        System.out.println("Vous allez maintenant prendre part au jeu du pendu !!");
        System.out.println("Trouve les lettres manquantes avant la fin sinon ...");
    }
}