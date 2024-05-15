public class Livre implements Empruntable{
    protected String titre;
    protected String auteur;
    protected String isbn;
    protected boolean disponible;

    public Livre(String titre, String auteur, String isbn, boolean disponible){
        this.titre = titre;
        this.auteur = auteur;
        this.isbn = isbn;
        this.disponible = disponible;
    }
    public void afficheDetails(){
        System.out.println("Titre : "+ this.titre);
        System.out.println("Auteur :"+ this.auteur);
        System.out.println("isbn :"+ this.isbn);
        System.out.println("Disponibilité :"+ this.disponible);
    }

    public void emprunter(String isbn) {

    }

    public void retourner(String isbn) {

    }
}
