public class Administrateur extends Utilisateur {
    private String login;
    private String password;
    
    public Administrateur(int id, String nom, String email, String login, String password) {
        super(id, nom, email);
        this.login = login;
        this.password = password;
    }
    
    // Méthodes spécifiques
    public void gererComptes() {
        System.out.println("Gestion des comptes utilisateurs...");
    }
    
    public void genererRapports() {
        System.out.println("Génération de rapports...");
    }
    
    // Getters/Setters
    public String getLogin() { return login; }
    public void setLogin(String login) { this.login = login; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
}
