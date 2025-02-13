public abstract class Ressource {
    protected int id;
    protected String titre;
    protected String auteur;
    protected String type; // par exemple : "Livre", "Revue", etc.
    
    public Ressource(int id, String titre, String auteur, String type) {
        this.id = id;
        this.titre = titre;
        this.auteur = auteur;
        this.type = type;
    }
    
    // Getters/Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getTitre() { return titre; }
    public void setTitre(String titre) { this.titre = titre; }
    public String getAuteur() { return auteur; }
    public void setAuteur(String auteur) { this.auteur = auteur; }
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
}
