public class Compte {
    private String Numero;
    private Double Solde;
    private Client Preprietaire;

    public Compte(String numero,Double Solde, Client Preprietaire) {
        this.Numero = numero;
        this.Solde = Solde;
        this.Preprietaire = Preprietaire;
    }

    @Override
    public String toString() {
        return "Compte{" +
                "Numero='" + Numero + '\'' +
                ", Solde=" + Solde +
                ", Preprietaire=" + Preprietaire +
                '}';
    }

    public String getNumero() {
        return Numero;
    }

    public Double getSolde() {
        return Solde;
    }

    public Client getPreprietaire() {
        return Preprietaire;
    }

}
