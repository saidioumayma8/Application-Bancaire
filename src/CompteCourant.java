public class CompteCourant extends Compte {
    private String fraisBancaires;

    public CompteCourant(String numero,Double Solde, Client Preprietaire, String fraisBancaires){
        super(numero, Solde, Preprietaire);
        this.fraisBancaires = fraisBancaires;

    }

    public String getFraisBancaires() {
        return fraisBancaires;
    }

    public void setFraisBancaires(String fraisBancaires) {
        this.fraisBancaires = fraisBancaires;
    }
}
