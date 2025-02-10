package com.mycompany.projet_de_poo;

public class Personne {
    private String nom;
    private String prenom;
    private int age;
    private String sexe;
    private String isMajor;

    public Personne(String nom, String prenom, int age, String sexe) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.sexe = sexe;
        
        if (age >= 18) {
            this.isMajor = "Major";
        } else {
            this.isMajor = "Non Major";
        }
    }
    
    public String getNom() {
        return nom;
    }
    
    public String getPrenom() {
        return prenom;
    }
    
    public int getAge() {
        return age;
    }
    
    public String getSexe() {
        return sexe;
    }
    
    public String getisMajor() {
        return isMajor;
    }
}