public class Compte {
    private String Numero;
    private Double Solde;
    private Client Preprietaire;

    public Compte(String numero,Double Solde, Client Preprietaire) {
        this.Numero = numero;
        this.Solde = Solde;
        this.Preprietaire = Preprietaire;
    }

    public String getNumero() {
        return Numero;
    }

    public void setNumero(String numero) {
        Numero = numero;
    }

    public Double getSolde() {
        return Solde;
    }

    public void setSolde(Double solde) {
        Solde = solde;
    }

    public Client getPreprietaire() {
        return Preprietaire;
    }

    public void setPreprietaire(Client preprietaire) {
        Preprietaire = preprietaire;
    }
}
