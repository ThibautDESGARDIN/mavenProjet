package fr.formation.inti.workspace;

import java.io.File;
import java.io.IOException;

public class FileInfo {

	public static void main(String[] args) throws IOException {
		File apath = new File("dossier");
		apath.createNewFile(); // creation fichier
		apath.mkdir();		   // creation dossier
		
		System.out.println("Path exists ? "+apath.exists());

		if (apath.exists()) {
			System.out.println("Directory ? "+apath.isDirectory());
		}
	}

}
