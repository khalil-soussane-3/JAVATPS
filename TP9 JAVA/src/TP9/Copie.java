package TP9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Copie {
	
	public Copie(File source,File destination,String type) {
		if (type.equals("ligne")) {
			try {
				@SuppressWarnings("resource")
				BufferedReader lire = new BufferedReader(new FileReader(source));
				BufferedWriter ecrire = new BufferedWriter(new FileWriter(destination));
				String ligne ;
				int nmbr = 0;
				System.out.println("les donnes de fichie source est : ");
				while((ligne = lire.readLine())!= null) {
					System.out.println(ligne);
					ecrire.write(ligne);
					ecrire.newLine();
					nmbr++;
				}
				System.out.println("le nombre des lignes est : "+nmbr);
				ecrire.close();
			} catch ( IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(type.equals("caracter")) {
			try {
				@SuppressWarnings("resource")
				BufferedReader lire = new BufferedReader(new FileReader(source));
				BufferedWriter ecrire = new BufferedWriter(new FileWriter(destination));
				int nmbr = 0;
				System.out.println("les donnes de fichie source est : ");
				int carac ;
				while((carac=lire.read())!=-1) {
					if (carac=='\n') {
						nmbr++;
					}
					char c = (char)(carac);
					System.out.println(c);
					ecrire.write(c);
				}
				System.out.println("le nombre des lignes est : "+nmbr);
				ecrire.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String [] args) throws IOException {
		File source = new File("fichie1.txt"); 
		File destination = new File("fichie2.txt");
		@SuppressWarnings("unused")
		Copie copie1 = new Copie(source,destination,"ligne");
		File source2 = new File("fichie11.txt"); 
		File destination2 = new File("fichie22.txt");
		@SuppressWarnings("unused")
		Copie copie2 = new Copie(source2,destination2,"caracter");
	}
}
