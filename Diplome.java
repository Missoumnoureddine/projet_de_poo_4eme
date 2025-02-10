package com.mycompany.projet_de_poo;

import java.util.ArrayList;
import java.util.List;

public class Diplome {
    private List<Etudiant> etudiantsList;
    private static int number = 0;

    public Diplome() {
        etudiantsList = new ArrayList<>();
    }

    public void ajouterEtudiant(Etudiant etudiant) {
        etudiantsList.add(etudiant);
        number++;
    }

    public void afficherInformations() {
        for (Etudiant etudiant : etudiantsList) {
            System.out.println("Nom: " + etudiant.getNom());
            System.out.println("Prenom: " + etudiant.getPrenom());
            System.out.println("Age: " + etudiant.getAge());
            System.out.println("Sexe: " + etudiant.getSexe());
            System.out.println("Major ؟: " + etudiant.getisMajor());
            System.out.println("Matricule: " + etudiant.getMatricule());
            System.out.println("Type Etudiant: " + etudiant.getTypeEtudiant());

            if (etudiant instanceof Etudiant_ENSK) {
                System.out.println("Specialite: " + ((Etudiant_ENSK) etudiant).getSpecialite());
            }
            System.out.println("-----------------------------");
        }
        System.out.println("Nombre  d'etudiants: " + number);
    }
}
