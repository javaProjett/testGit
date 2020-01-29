import com.sun.javaws.security.AppContextUtil;

public class Date {

    private int jour;

    private int mois;
    private int annee;

    public Date(int jour, int mois, int annee) {
        this.jour = jour;
        this.mois = mois;
        this.annee = annee;
    }

    public Date() {
        jour = 31;
        mois = 12;
        annee = 20;
    }

    public int getJour(){
        return jour;
    }

    public int getMois() {
        return mois;
    }

    public int getAnnee() {
        return annee;
    }


    public String toString(){
        String str = "Nous sommes le " + getJour() + getMois() + getAnnee();
        return str;
    }

}
