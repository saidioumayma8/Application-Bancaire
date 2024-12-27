import java.util.ArrayList;
import java.util.Scanner;

public class Compte {
    private String Numero;
    private Double Solde;
    private Client Preprietaire;

    private static ArrayList<Operation> Operations = new ArrayList<>();
    private static ArrayList<Client> Clients = new ArrayList<>();
    private static ArrayList<Compte> Comptes = new ArrayList<>();// Declare Clients collection

    public Compte(String numero,Double Solde, Client Preprietaire) {
        this.Numero = numero;
        this.Solde = Solde;
        this.Preprietaire = Preprietaire;
    }


    public static void manageCompte(Scanner scanner, Application application) {

        while (true) {
            System.out.println("\n--- Manage Compte ---");
            System.out.println("1. Add Compte");
            System.out.println("2. View Compte");
            System.out.println("5. Back to Main Menu");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addCompte(scanner);
                    break;
                case 2:
                    viewCompte();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
    public static void addCompte(Scanner scanner) {
        System.out.println("Entre le numero de compte ");
        String numero = scanner.nextLine();

        System.out.println("Entre le solde de compte");
        Double solde = null;

        System.out.println("Entre le type de compte(1:pargne ou 0:courant) ");
        String numero = scanner.nextLine();
        try {
            solde = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Solde invalide. Veuillez entrer un nombre valide.");
            return;
        }

        Client proprietaire = null;
        for (Client client : Clients) {

        }

        if (proprietaire == null) {
            System.out.println("Propriétaire introuvable.");
            return;
        }

        Compte compte = new Compte(numero, solde, proprietaire);
        Comptes.add(compte);

        System.out.println("Compte ajouté avec succès !");
    }
    public static void viewCompte(){
        if (Comptes.isEmpty()){
            System.out.println("No Comptes available.");
        }else{
            for (Compte compte : Comptes){
                System.out.println(compte);
            }
        }
    }
    public static Compte IsCompteExist (String className){
        for(Compte compte : Comptes){
            if(compte.getNumero().equals(className)){
                return compte;
            }
        }
        return null;

    }
    public void Associer(ArrayList<Compte>Comptes){

        System.out.println("entrer le numero de Compte: ");
        String numCompte = sc.nextLine();
        Compte compteExiste = IsCompteExist(numCompte);
        System.out.println("entrer id de Client : ");
        int id = sc.nextInt();
        Client clienttExiste = IsClientExist(id);
        if(compteExiste != null){
            if(clienttExiste !=null ){
                clienttExiste.getApprenants().add(apprenantExiste);
            }else {
                System.out.println("apprenant n'exsiste pas");
            }

        }else {
            System.out.println("Classe n'exsiste pas");
        }
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

    public void setSolde(Double solde) {
        Solde = solde;
    }

    public Client getPreprietaire() {
        return Preprietaire;
    }

}
