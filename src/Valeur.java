public enum Valeur {
    C1(1, "AS"), C2(2, "2"), C3(3, "3"), C4(4, "4"), C5(5, "5"), C6(6, "6"), C7(7, "7"), C8(8, "8"), C9(9, "9"), C10(10, "10"), J(11, "JACK"), Q(12, "QUEEN"), K(13, "KING");

    private int rang;
    private String nomValeur;

    Valeur(int r, String n){
        this.rang = r;
        this.nomValeur = n;
    }

    public int getRang() {
        return rang;
    }

    public String getNomValeur() {
        return nomValeur;
    }
}
