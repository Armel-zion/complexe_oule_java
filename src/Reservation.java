public class Reservation {
    Client client;
    String numeroChambre;
    String dateEntree;
    String dateSortie;
    String dateReservation;
    int nombreNuitees;
    double montantChambre;
    String observation;
    String receptionniste;

    void afficherInfos() {
        System.out.println("=== Réservation ===");
        System.out.println("Client : " + client.nom);
        System.out.println("Téléphone : " + client.telephone);
        System.out.println("Entreprise : " + client.nomEntreprise);
        System.out.println("Chambre n° : " + numeroChambre);
        System.out.println("Date d'entrée : " + dateEntree);
        System.out.println("Date de sortie : " + dateSortie);
        System.out.println("Date réservation : " + dateReservation);
        System.out.println("Nombre de nuitées : " + nombreNuitees);
        System.out.println("Montant chambre : " + montantChambre);
        System.out.println("Observation : " + observation);
        System.out.println("Réceptionniste : " + receptionniste);
    }
}