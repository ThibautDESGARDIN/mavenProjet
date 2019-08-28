package fr.formation.inti.workspace;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Fichiers_2 {

	public static void main(String[] args) throws IOException {
		String strNom = "";
		String strPrenom;
		int annee;
		char[] nom = new char[40]; //40 vient du 20 intial *2 car ajout de " " 
		char[] prenom = new char[40]; //40 vient du 20 intial *2 car ajout de " " 
		Scanner sc = new Scanner(System.in);
		System.out.println("Nom du fichier a ouvrir");
		String fichier = sc.nextLine();
		DataInputStream flux = new DataInputStream(new FileInputStream(fichier));
		boolean eof = false;
		
		while(eof!=true) {
			try {
		
		System.out.print("Nom : ");
		for (int i = 0; i < 40; i+=2) {nom[i] = flux.readChar();System.out.print(nom[i]);}
		System.out.println();
		System.out.print("Prenom : ");
		for (int i = 0; i < 40; i+=2) {prenom[i] = flux.readChar();System.out.print(prenom[i]);}
		System.out.println();
		annee = flux.readInt();
		System.out.println("Annee : "+annee);
		flux.readChar();
		System.out.println();
		} catch (EOFException e) {
			eof = true;
			System.out.println("*****");
			System.out.println();
			System.out.println("** Fin fichier **");
		}
		}

		flux.close();
		
	}

}
