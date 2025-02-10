package com.mycompany.projet_de_poo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Diplome diplome = new Diplome();

        boolean continueAdding = true;
        while (continueAdding) {
            System.out.print(" le nom : ");
            String nom = scanner.nextLine();

            System.out.print(" le prenom : ");
            String prenom = scanner.nextLine();

            System.out.print(" l'age : ");
            int age = scanner.nextInt();
            scanner.nextLine();

            System.out.print(" le sexe  (H/F): ");
            String sexe = scanner.nextLine();
            
            System.out.print(" le matricule : ");
            String matricule = scanner.nextLine();
           
            System.out.print(" la moyenne du bac : ");
            double bac = scanner.nextDouble();
           
             scanner.nextLine();
            Etudiant etudiant;
            if (bac > 14) {
                etudiant = new Etudiant_ENSK(nom, prenom, age, sexe, matricule, bac);
            } else {
                etudiant = new Etudiant(nom, prenom, age, sexe, matricule, bac);
            }

            diplome.ajouterEtudiant(etudiant);

            System.out.print(" ajouter un autre etudiant? (oui/non): ");
            String response = scanner.nextLine();
            continueAdding = response.equalsIgnoreCase("oui");
        }
         System.out.println("-----------------------------");
         diplome.afficherInformations();
    }
}
