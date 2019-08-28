package fr.formation.inti.workspace;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

class Fichiers_1 {

	public static void main(String[] args) throws IOException {
		String strNom = "";
		String strPrenom;
		int age;
		char[] nom = new char[20];
		char[] prenom = new char[20];
		Scanner sc = new Scanner(System.in);
		System.out.println("Nom du fichier a creer");
		String fichier = sc.nextLine();
		
		DataOutputStream flux = new DataOutputStream(new FileOutputStream(fichier));
		int j = 1;
		while (strNom.compareToIgnoreCase("stop") != 0) {
			System.out.print("nom " + j + " : ");
			strNom = sc.nextLine();
			if (strNom.compareToIgnoreCase("stop") == 0) {
				break;
			}
			for (int i = 0; i < 20; i++) {
				if (i < strNom.length()) {
					nom[i] = strNom.charAt(i);
					flux.writeChar(nom[i]);
				} else {
					nom[i] = ' ';
					flux.writeChar(nom[i]);
				}
			}
			System.out.print("Prenom : ");
			strPrenom = sc.nextLine();
			for (int i = 0; i < 20; i++) {
				if (i < strPrenom.length()) {
					prenom[i] = strPrenom.charAt(i);
					flux.writeChar(prenom[i]);
				} else {
					prenom[i] = ' ';
					flux.writeChar(prenom[i]);
				}
			}
			System.out.print("annee naissance : ");
			age = sc.nextInt();
			flux.writeInt(age);
			flux.writeChars("\n");
			System.out.println();
			sc.nextLine();
			j++;

			System.out.println("Rentrez \"stop\" dans \"nom\"pour arreter le programme.");
		}
		flux.close();
		System.out.println("Fin programme");
	}
}