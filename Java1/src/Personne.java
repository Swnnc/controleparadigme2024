public abstract class Personne {

    protected String nom;
    protected String prenom;
    protected int id;

    public  personne(String nom, String prenom, int id){
        this.nom = nom;
        this.prenom = prenom;
        this.id = id;

        return;
    }


    public abstract void afficherDetails();
}
