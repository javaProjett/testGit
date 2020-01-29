import java.util.ArrayList;
import java.util.Date;

public class Entreprise {

    private Patron patron;
    private ArrayList<Cadre> listeCadre;
    private ArrayList<Employe> listeEmploye;
    private String adresse;
    private int numSiret;
    private int numSiren;
    private Date creation; // earar



    public Entreprise() {
        patron = new Patron();
        listeCadre = new ArrayList<>();
        listeEmploye = new ArrayList<>();
        adresse = "5 rue des acacias";
        numSiret = 12345623;
        numSiren = 1234561554;
        creation = new Date();
    }

    public Entreprise(Patron patron, ArrayList<Cadre> listeCadre, ArrayList<Employe> listeEmploye, String adresse, int numSiret, int numSiren, Date creation) {
        this.patron = patron;
        this.listeCadre = listeCadre;
        this.listeEmploye = listeEmploye;
        this.adresse = adresse;
        this.numSiret = numSiret;
        this.numSiren = numSiren;
        this.creation = creation;
    }

    public Date getCreation() {
        return creation;
    }
}
