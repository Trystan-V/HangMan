package co.trystan;

public class Joueur {
    
    //instance

    String nom;
    String nom2;
    int point;

////////////////////CONSTRUCTEUR\\\\\\\\\\\\\\\\\\\\\\\\\\\

    public Joueur() {
        this.point = 0;
    }

////////////////////METHOD\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

    public void setNom(String entreeClavier) {
        
        this.nom = entreeClavier;
    }

    // public void setNon2(String entreeClavier2) {
        
    //     this.nom2 = entreeClavier2;
    //}


}