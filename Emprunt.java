import java.util.Date;

public class Emprunt {
    private Utilisateur utilisateur;
    private Ressource ressource;
    private Date dateEmprunt;
    private Date dateRetour;
    private String statut; // "En cours", "Terminé", etc.
    
    public Emprunt(Utilisateur utilisateur, Ressource ressource, Date dateEmprunt, Date dateRetour, String statut) {
        this.utilisateur = utilisateur;
        this.ressource = ressource;
        this.dateEmprunt = dateEmprunt;
        this.dateRetour = dateRetour;
        this.statut = statut;
    }
    
    // Méthodes de gestion
    public void enregistrerEmprunt() {
        // log/DB logic
        System.out.println("Emprunt enregistré pour " + utilisateur.getNom() + " : " + ressource.getTitre());
    }
    
    public void retourner() {
        // log/DB logic
        this.statut = "Terminé";
        this.dateRetour = new Date(); // marquer le retour
        System.out.println("Ressource retournée : " + ressource.getTitre());
    }
    
}
