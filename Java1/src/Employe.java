public class Employe extends Personne{
    protected String poste;
    protected double salaire;

    public Employe(String nom, String prenom, int id, String poste, double salaire) {
        super(nom, prenom, id);
        this.poste = poste;
        this.salaire = salaire;
    }


    public void afficherDetails() {
        System.out.println("Nom :" + this.nom);
        System.out.println("Prenom : "+ this.prenom);
        System.out.println("id :"+ this.id);
        System.out.println("Poste : "+ this.poste);
        System.out.println("Salaire :"+ this.salaire);
    }
}
