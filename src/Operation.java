public class Operation {
    private String Type;
    private String Montant;
    private String Date;

    public Operation(String Type, String Montant, String Date){
        this.Type = Type;
        this.Montant = Montant;
        this.Date = Date;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getMontant() {
        return Montant;
    }

    public void setMontant(String montant) {
        Montant = montant;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }
}
