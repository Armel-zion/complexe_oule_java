public class Chambre {
    String numero;
    String type;
    double prixParNuit;
    boolean estDisponible;

    void afficherInfos() {
        System.out.println("=== Chambre " + numero + " ===");
        System.out.println("Type : " + type);
        System.out.println("Prix par nuit : " + prixParNuit);
        System.out.println("Disponible : " + estDisponible);
    }
}