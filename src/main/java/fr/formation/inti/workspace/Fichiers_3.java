package fr.formation.inti.workspace;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;

public class Fichiers_3 {

	public static void main(String[] args) throws IOException {
		String str = "";
		int i;
		String[] ligne = new String[100];
		char[] prenom = new char[40];
		Scanner sc = new Scanner(System.in);

//			System.out.println("Nom du fichier a ouvrir");
//			String fichier = sc.nextLine();
		FileInputStream in = new FileInputStream("C:\\Users\\IN-LL-037\\Desktop\\ligne.txt");
		Reader reader = new InputStreamReader(in, "UTF-8");
		BufferedReader br = new BufferedReader(reader);

		i = 1;
		int j = 1;
		String s = null;
		while ((s = br.readLine()) != null) {

			System.out.print(j + " - ");
			j++;

//			ligne[0] = Character.toString(flux.readChar());
//			
//			System.out.print(i);
//			while (ligne[i-1].compareToIgnoreCase("/n")!=0) {
//				ligne[i] = Character.toString(flux.readChar());
//				System.out.print(ligne[i-1]);
//				i++;
//				if (i==60 && ligne[i-1].compareToIgnoreCase("/n")!=0) {
//					System.out.println();
//					System.out.print("  ");
//				}
//			}
//			System.out.println();

			for (int k = 0; k < s.length(); k++) {
				System.out.print(s.charAt(k));
				if (k % 59 == 0 && k != 0 && s.length()!=60) {
//					for (int l = 0; l < 10; l++) {
//						if (s.charAt(k + l) == ' ') {
							System.out.println();
							System.out.print("    ");
//							break;
//						} else {
//							System.out.print(s.charAt((k+1) + l));
//						}
					
				}

			}
			System.out.println();
		}

		br.close();
		System.out.println();
		System.out.println("     *** fin fichier ***");
	}

}
