import java.util.Date;

public class Membre extends Personne{

    protected String statut;
    protected Date dateAdhesion;

    public Membre(String nom, String prenom, int id, String statut, Date dateAdhesion) {
        super(nom, prenom, id);
        this.statut = statut;
        this.dateAdhesion = dateAdhesion;
    }

    public void afficherDetails() {

        System.out.println("Nom :" + this.nom);
        System.out.println("Prenom : "+ this.prenom);
        System.out.println("id :"+ this.id);
        System.out.println("Statut : "+ this.statut);
        System.out.println("Date d'adhesion :" + this.dateAdhesion);

    }
}
