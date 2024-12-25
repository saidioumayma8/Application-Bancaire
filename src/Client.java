import java.util.ArrayList;

public class Client {
    private int Id;
    private String Nom;
    private String Prenom;
    private String Email;
    private String Adresse;
    private String Telephone;

    public static ArrayList<Client> clients=new ArrayList<>();

    public Client(int Id, String Nom, String Prenom, String Email, String Adresse, String Telephone) {
        this.Id = Id;
        this.Nom = Nom;
        this.Prenom = Prenom;
        this.Email = Email;
        this.Adresse = Adresse;
        this.Telephone = Telephone;

    }

    @Override
    public String toString() {
        return "Client{" +
                "Id=" + Id +
                ", Nom='" + Nom + '\'' +
                ", Prenom='" + Prenom + '\'' +
                ", Email='" + Email + '\'' +
                ", Adresse='" + Adresse + '\'' +
                ", Telephone='" + Telephone + '\'' +
                '}';
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public void setPrenom(String prenom) {
        Prenom = prenom;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getAdresse() {
        return Adresse;
    }

    public void setAdresse(String adresse) {
        Adresse = adresse;
    }

    public String getTelephone() {

        return Telephone;
    }

    public void setTelephone(String telephone) {

        Telephone = telephone;
    }
}


