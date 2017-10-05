package fr.univ_amu.iut.exo1;

import java.time.LocalDate;

/**
 * Created by p16002371 on 05/10/17.
 */
public class Employe {
    private int nEmploye;
    private int nSecuriteSociale;
    private String nom;
    private String prenom;
    private int echelon;
    private LocalDate dateNaissance;
    private LocalDate dateEmbauche;
    private double nbHeures;
    private double base;


    public Employe(int nEmploye, int nSecuriteSociale, String nom, String prenom, int echelon, LocalDate dateNaissance, LocalDate dateEmbauche, double nbHeures, double base) {
        this.nEmploye = nEmploye;
        this.nSecuriteSociale = nSecuriteSociale;
        this.nom = nom;
        this.prenom = prenom;
        this.echelon = echelon;
        this.dateNaissance = dateNaissance;
        this.dateEmbauche = dateEmbauche;
        this.nbHeures = nbHeures;
        this.base = base;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "nEmploye=" + nEmploye +
                ", nSecuriteSociale=" + nSecuriteSociale +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", echelon=" + echelon +
                ", dateNaissance=" + dateNaissance +
                ", dateEmbauche=" + dateEmbauche +
                ", nbHeures=" + nbHeures +
                ", base=" + base +
                '}';
    }

    public double CalculSalaireBrut(Employe employe)
    {
        double salaireBrut = this.nbHeures*this.base;
        return salaireBrut;

    }
    public double CalculSalaireNet(Employe employe)
    {
        double salaireNet = CalculSalaireBrut(employe)*0.8;
        return salaireNet;
    }


    public void setDateEmbauche(LocalDate dateEmbauche) {
        this.dateEmbauche = dateEmbauche;
    }
}
