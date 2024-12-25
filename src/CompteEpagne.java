public class CompteEpagne extends Compte{
    private String tauxInteret;

    public CompteEpagne(String numero,Double Solde, Client Preprietaire){
        super(numero, Solde, Preprietaire);
        this.tauxInteret = tauxInteret;

    }

    public String getTauxInteret() {
        return tauxInteret;
    }

    public void setTauxInteret(String tauxInteret) {
        this.tauxInteret = tauxInteret;
    }
}
