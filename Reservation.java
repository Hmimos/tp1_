import java.util.Date;

public class Reservation {
    private Utilisateur utilisateur;
    private Ressource ressource;
    private Date dateReservation;
    private String statut; // "En attente", "Confirmée", etc.
    
    public Reservation(Utilisateur utilisateur, Ressource ressource, Date dateReservation, String statut) {
        this.utilisateur = utilisateur;
        this.ressource = ressource;
        this.dateReservation = dateReservation;
        this.statut = statut;
    }
    
    public void confirmerReservation() {
        this.statut = "Confirmée";
        System.out.println("Réservation confirmée pour " + utilisateur.getNom());
    }
    
    public void annulerReservation() {
        this.statut = "Annulée";
        System.out.println("Réservation annulée pour " + utilisateur.getNom());
    }
    
    // Getters/Setters...
}
