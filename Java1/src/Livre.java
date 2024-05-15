public class Livre {
    protected String titre;
    protected String auteur;
    protected String isbn;
    protected boolean disponible;

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isDisponible() {
        return disponible;
    }
    public void afficheDetails(){
        System.out.println("Titre : "+ this.titre);
        System.out.println("Auteur :"+ this.auteur);
        System.out.println("isbn :"+ this.isbn);
        System.out.println("Disponibilité"+ this.disponible);
    }

}
