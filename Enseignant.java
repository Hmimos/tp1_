public class Enseignant extends Utilisateur {
    private String departement;
    
    public Enseignant(int id, String nom, String email, String departement) {
        super(id, nom, email);
        this.departement = departement;
    }
    
    public String getDepartement() { return departement; }
    public void setDepartement(String departement) { this.departement = departement; }
}
