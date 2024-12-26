import java.util.ArrayList;

public class Client {
    private int id;
    private String Nom;
    private String Prenom;
    private String Email;
    private String Adresse;
    private String Telephone;
    Application application = new Application();
    public Client(int id, String Nom, String Prenom, String Email, String Adresse, String Telephone) {
        this.id = id;
        this.Nom = Nom;
        this.Prenom = Prenom;
        this.Email = Email;
        this.Adresse = Adresse;
        this.Telephone = Telephone;

    }



    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", Nom='" + Nom + '\'' +
                ", Prenom='" + Prenom + '\'' +
                ", Email='" + Email + '\'' +
                ", Adresse='" + Adresse + '\'' +
                ", Telephone='" + Telephone + '\'' +
                '}';
    }

    public int getId() {

        return id;
    }

    public String getNom() {

        return Nom;
    }

    public String getPrenom() {

        return Prenom;
    }

    public String getEmail() {
        return Email;
    }
    public String getAdresse() {

        return Adresse;
    }

    public String getTelephone() {
        return Telephone;
    }

}



