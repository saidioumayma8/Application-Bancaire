public class CompteEpagne extends Compte{
    private String tauxInteret;

    public CompteEpagne(String numero, Double solde, Client proprietaire) {
        super(numero, solde, proprietaire); // Calls the parent constructor
        this.tauxInteret = "DefaultTaux"; // Default value or calculate as needed
    }

    public static void addCompteEpargne(String numero, Double solde, Client proprietaire) {
        CompteEpagne compte = new CompteEpagne(numero, solde, proprietaire);
        Comptes.add(compte); // Add to the shared list
    }

    public String getTauxInteret() {
        return tauxInteret;
    }

    public void setTauxInteret(String tauxInteret) {
        this.tauxInteret = tauxInteret;
    }
}
