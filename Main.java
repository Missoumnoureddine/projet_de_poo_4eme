package com.mycompany.projet_de_poo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Diplome diplome = new Diplome();

        boolean continueAdding = true;
        while (continueAdding) {
            System.out.print("Entrez le nom de l'etudiant: ");
            String nom = scanner.nextLine();

            System.out.print("Entrez le prenom de l'etudiant: ");
            String prenom = scanner.nextLine();

            System.out.print("Entrez l'age de l'etudiant: ");
            int age = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Entrez le sexe de l'etudiant (Homme/Femme): ");
            String sexe = scanner.nextLine();

            System.out.print("Entrez le matricule de l'etudiant: ");
            String matricule = scanner.nextLine();

            System.out.print("Entrez la moyenne du baccalaureat de l'etudiant: ");
            double bacAverage = scanner.nextDouble();
            scanner.nextLine(); 

            Etudiant etudiant;
            if (bacAverage > 14) {
                etudiant = new Etudiant_ENSK(nom, prenom, age, sexe, matricule, bacAverage);
            } else {
                etudiant = new Etudiant(nom, prenom, age, sexe, matricule, bacAverage);
            }

            diplome.ajouterEtudiant(etudiant);

            System.out.print("Voulez-vous ajouter un autre etudiant? (oui/non): ");
            String response = scanner.nextLine();
            continueAdding = response.equalsIgnoreCase("oui");
        }

        diplome.afficherInformations();
    }
}
