public class Carte {
    Couleur couleur;
    Valeur valeur;

    public Couleur getCouleur() {
        return couleur;
    }

    public Valeur getValeur() {
        return valeur;
    }

    public Carte(Valeur v, Couleur c){
        this.couleur = c;
        this.valeur = v;
    }

    @Override
    public String toString(){
        return(this.valeur.getNomValeur() + " " + this.couleur);
    }
}
