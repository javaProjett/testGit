import java.sql.Date;
import java.util.Scanner;
import java.util.*;

    public class Main {
        public static void main(String[] args) {

            Patron patron = new Patron();
            ArrayList<Cadre> listeCadre = new ArrayList<>();
            ArrayList<Employe> listeEmploye = new ArrayList<>();

            Entreprise roboTech = new Entreprise();
            Entreprise flightTech = new Entreprise(patron, listeCadre, listeEmploye, "10 rue du général de gaulle", 4587725, 45878576, new Date(120,Calendar.MARCH,12));

            System.out.println(flightTech.getCreation());


        }
    }