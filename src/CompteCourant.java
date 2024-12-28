public class CompteCourant extends Compte {
    private String fraisBancaires;

    public CompteCourant(String numero, Double solde, Client proprietaire) {
        super(numero, solde, proprietaire); // Calls the parent constructor
        this.fraisBancaires = "DefaultFrais"; // Default value or calculate as needed
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
