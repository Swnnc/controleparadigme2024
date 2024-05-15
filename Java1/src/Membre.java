import java.util.Date;

public class Membre extends Personne{

    protected String statut;
    protected Date dateAdhesion;

    public Membre(String nom, String prenom, int id) {
        super(nom, prenom, id);
    }

    public void afficherDetails() {

        System.out.println("");
    }
}
