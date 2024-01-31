import java.util.ArrayList;
import java.util.Collections;

public class JeuDeCarte {

    public ArrayList<Carte> jeu = new ArrayList<Carte>();

    public JeuDeCarte(){
        for(Couleur couleur : Couleur.values()){
            for(Valeur valeur : Valeur.values()){
                this.jeu.add(new Carte(valeur,couleur));
            }
        }
    }

    public void melanger(){
        Collections.shuffle(this.jeu);
    }

    public void distribuerCarte(Carte carte){
        this.jeu.remove(carte);
    }

    public void ajouterCarteJoueur(Joueur joueur){
        joueur.piocherCarte(this.jeu.getFirst());
        distribuerCarte(this.jeu.getFirst());
    }

    public String toString(){
        String message = "";
        for(int i=0; i<this.jeu.size(); i++)
            message = message + '\n' + this.jeu.get(i).toString();
        return(message);
    }
}
