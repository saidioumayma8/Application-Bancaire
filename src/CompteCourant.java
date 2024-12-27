public class CompteCourant extends Compte {
    private String fraisBancaires;

    public CompteCourant(String numero,Double Solde, Client Preprietaire, String fraisBancaires){
        super(numero, Solde, Preprietaire);
        this.fraisBancaires = fraisBancaires;

    }
    public static void addCompteCourant(String numero, Double solde, Client proprietaire) {
        CompteCourant compte = new CompteCourant(numero, solde, proprietaire);
        Comptes.add(compte); // Add to the shared list
    }
    public String getFraisBancaires() {
        return fraisBancaires;
    }

    public void setFraisBancaires(String fraisBancaires) {
        this.fraisBancaires = fraisBancaires;
    }
}
