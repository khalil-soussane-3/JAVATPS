package TP9;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exercice1 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String ligne =" ";
		String nom ;
		System.out.println("saisir le nom de fichier : ");
		nom=scan.next();
		 try {
			FileWriter write = new FileWriter(nom+".txt");
			BufferedWriter bufwrite = new BufferedWriter(write);
			while(!(ligne.equals("stop"))) {
				System.out.println("saisir un autre ligne ");
				bufwrite.write(ligne);
				bufwrite.newLine();
				ligne = scan.next();
			}
			bufwrite.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
