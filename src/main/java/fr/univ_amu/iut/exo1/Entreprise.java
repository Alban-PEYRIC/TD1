package fr.univ_amu.iut.exo1;

import java.time.LocalDate;
import java.util.List;

/**
 * Created by p16002371 on 05/10/17.
 */
public class Entreprise {
    private String nomEntreprise;
    private List<Employe> lesEmployes;

    public Entreprise(String nomEntreprise, List<Employe> lesEmployes) {
        this.nomEntreprise = nomEntreprise;
        this.lesEmployes = lesEmployes;
    }

    public void setNomEntreprise(String nomEntreprise) {
        this.nomEntreprise = nomEntreprise;
    }
    public void  Embauche (Employe employe, LocalDate dateEmbauche)
    {
        employe.setDateEmbauche(dateEmbauche);
        lesEmployes.add(employe);
    }
    public void Lienciement (Employe employe)
    {
        lesEmployes.remove(employe);
    }

    public List<Employe> getLesEmployes() {
        return lesEmployes;
    }
}
