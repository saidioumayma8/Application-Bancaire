public class CompteEpagne extends Compte{
    private String tauxInteret;

    public CompteEpagne(String numero,Double Solde, Client Preprietaire){
        super(numero, Solde, Preprietaire);
        this.tauxInteret = tauxInteret;

    }
    public static void addCompteEpargne(String numero, Double solde, Client proprietaire) {
        CompteEpagne compte = new CompteEpargne(numero, solde, proprietaire);
        Comptes.add(compte); // Add to the shared list
    }
    public String getTauxInteret() {
        return tauxInteret;
    }

    public void setTauxInteret(String tauxInteret) {
        this.tauxInteret = tauxInteret;
    }
}
