public class Livre extends Ressource {
    private String isbn;
    
    public Livre(int id, String titre, String auteur, String type, String isbn) {
        super(id, titre, auteur, type);
        this.isbn = isbn;
    }
    
    public String getIsbn() { return isbn; }
    public void setIsbn(String isbn) { this.isbn = isbn; }
}
