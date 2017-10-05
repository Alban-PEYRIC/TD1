package fr.univ_amu.iut.exo1;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;
import java.util.List;

public class GestionEntreprises {
    public static void main(String[] args) {

       Employe employeTest = new Employe(1,521,
               "SPEED", "René",1,
               LocalDate.of(2017, Month.FEBRUARY,20 ),
               LocalDate.of(1920, Month.APRIL,1 ),
               1,
               700);

        List<Employe> mesEmployes = new ArrayList<>();
       Entreprise maBoiteInfo = new Entreprise ("Lubrisoft", mesEmployes);
       maBoiteInfo.Embauche(employeTest, LocalDate.of(2017, Month.AUGUST, 14));
       maBoiteInfo.getLesEmployes();
    }
}