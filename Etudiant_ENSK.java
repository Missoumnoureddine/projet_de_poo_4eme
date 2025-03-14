package com.mycompany.projet_de_poo;

public class Etudiant_ENSK extends Etudiant {
    private String specialite;

    public Etudiant_ENSK(String nom, String prenom, int age, String sexe, String matricule, double bac) {
        super(nom, prenom, age, sexe, matricule, bac);
        if (bac < 16) {
            specialite = "PEM";
        } else {
            specialite = "PES";
        }
    }

    public String getSpecialite() {
        return specialite;
    }
}
