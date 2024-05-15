import java.util.Date;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Date date = new Date ();
        Membre Swann = new Membre("Cape","Swann", 1,"Client", date);
        Membre Hugo = new Membre("DeMarco","Hugo", 2,"GOAT", date);

        Employe Antoine = new Employe("Engasser", "Antoine", 3, "Libraire", 2300.0);

        Livre Zoro = new Livre("Zoro", "theCEO", "15623165", true);

        Swann.afficherDetails();
        Hugo.afficherDetails();
        Antoine.afficherDetails();
        Zoro.afficheDetails();

    }
}