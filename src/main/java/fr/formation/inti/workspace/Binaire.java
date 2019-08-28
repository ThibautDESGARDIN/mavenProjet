package fr.formation.inti.workspace;

import java.util.Scanner;

public class Binaire {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez la longueur de la chaine binaire");
		int n = sc.nextInt();
		sc.nextLine();
		System.out.println("Entrez la valeur binaire");
		String binaire = sc.nextLine();
		hasDecimal(binaire, n);
		hasHexa(binaire, n);

	}

	private static void hasDecimal(String binaire, int n) {
		char[] valeur = new char[n];
		int sortie = 0;
		for (int i = 0; i < n; i++) {
			if (i < (n - binaire.length())) {
				valeur[i] = '0';

			} else {
				valeur[i] = binaire.charAt(i - (n - binaire.length()));
			}
		}
		for (int i = 0; i < n; i++) {
			if (valeur[n - (1 + i)] == '1' && (n - (1 + i)) != 0) {
				sortie = sortie + (int) Math.pow(2, i);
			} else if (valeur[n - (1 + i)] == '1' && (n - (1 + i)) == 0) {
				sortie = sortie - (int) Math.pow(2, i);
			}
		}
		System.out.println("La valeur en décimal est : " + sortie);

	}

	private static void hasHexa(String binaire, int n) {
		char[] valeur = new char[n];
		int sortie = 0;
		String rep = "";
		for (int i = 0; i < n; i++) {
			if (i < (n - binaire.length())) {
				valeur[i] = '0';

			} else {
				valeur[i] = binaire.charAt(i - (n - binaire.length()));
			}
		}
		for (int i = 0; i < n; i++) {
			if (valeur[n - (1 + i)] == '1' && (n - (1 + i)) != 0) {
				sortie = sortie + (int) Math.pow(2, i);
			} else if (valeur[n - (1 + i)] == '1' && (n - (1 + i)) == 0) {
				sortie = sortie - (int) Math.pow(2, i);
			}
		}

		String[] hexa = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F" };
		if (sortie < 0) {
			sortie = (int) (Math.pow(2, n)) + sortie;
			while (sortie >= 16) {
				rep = hexa[sortie % 16] + rep;
				sortie = sortie / 16;

			}
		}
		while (sortie >= 16) {
			rep = hexa[sortie % 16] + rep;
			sortie = sortie / 16;

		}
		rep = hexa[sortie] + rep;

		System.out.println("La valeur en hexadécimal est : " + rep);

	}

}
