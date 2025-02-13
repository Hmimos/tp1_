public class Etudiant extends Utilisateur {
    private String matricule;
    
    public Etudiant(int id, String nom, String email, String matricule) {
        super(id, nom, email);
        this.matricule = matricule;
    }
    
    public String getMatricule() { return matricule; }
    public void setMatricule(String matricule) { this.matricule = matricule; }
}
