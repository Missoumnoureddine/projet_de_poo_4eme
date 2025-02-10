package com.mycompany.projet_de_poo;

public class Main {
    
    public static void main(String[] args) {

        Etudiant etudiant1 = new Etudiant("Ahmed", "Ali", 10, "Homme", "E12345", 10);
        Etudiant_ENSK etudiant2 = new Etudiant_ENSK("kamal", "Mohamed", 19, "Femme", "E67890", 15.0);
        Etudiant_ENSK etudiant3 = new Etudiant_ENSK("missoum", "noureddine", 17, "Homme", "E67891",17);


        Diplome diplome = new Diplome();

   
        diplome.ajouterEtudiant(etudiant1);
        diplome.ajouterEtudiant(etudiant2);
        diplome.ajouterEtudiant(etudiant3);
        


        diplome.afficherInformations();
    }
}