public class Client {
    String nom;
    String telephone;
    String nomEntreprise;

    void afficherInfos() {
        System.out.println("=== Client ===");
        System.out.println("Nom : " + nom);
        System.out.println("Téléphone : " + telephone);
        System.out.println("Entreprise : " + nomEntreprise);
    }
}