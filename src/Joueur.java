import java.util.ArrayList;

public class Joueur {
    public ArrayList<Carte> mainDeJeu = new ArrayList<Carte>();
    public int nombreDeCartes = 0;

    public void piocherCarte(Carte c){
        if(nombreDeCartes < 5) {
            this.mainDeJeu.add(c);
            nombreDeCartes++;
        }else{
            System.out.println("Erreur, on ne peut pas piocher, le nombre de cartes est trop élevé");
        }
    }
}
