package com.mycompany.projet_de_poo;


public class Etudiant_ENSK extends Etudiant {
    private String specialite;


    public Etudiant_ENSK(String nom, String prenom, int age, String sexe, String matricule, double bacAverage) {
        super(nom, prenom, age, sexe, matricule, bacAverage);

        if (bacAverage > 16) {
            specialite = "PES";
        } else {
            specialite = "PEM";
        }
    }


    public String getSpecialite() {
        return specialite;
    }
}