package com.mycompany.projet_de_poo;


public class Etudiant extends Personne {
    private String matricule;
    private double bacAverage;
    private String typeEtudiant;


    public Etudiant(String nom, String prenom, int age, String sexe, String matricule, double bacAverage) {
        super(nom, prenom, age, sexe);
        this.matricule = matricule;
        this.bacAverage = bacAverage;

        if (bacAverage > 14) {
            typeEtudiant = "ENS";
        } else {
            typeEtudiant = "Normal";
        }
    }


    public String getMatricule() {
        return matricule;
    }


    public double getBacAverage() {
        return bacAverage;
    }

    // Getter for typeEtudiant
    public String getTypeEtudiant() {
        return typeEtudiant;
    }
}