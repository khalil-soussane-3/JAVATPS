package TP9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Exercice4 {
	public static void copiee(String fichie , String path) throws IOException {
		BufferedReader fich1=new BufferedReader(new FileReader(fichie));
		BufferedWriter fich2=new BufferedWriter(new FileWriter(path));
		int a=0;
		while((a=fich1.read())!=-1) {
			System.out.println((char)a);
			fich2.write((char)a);
		}
		fich1.close();
		fich2.close();
	}
	public static void main(String []args) throws IOException {
		copiee("fichie1.txt","C:\\Users\\khali\\Desktop\\exercic4.txt");
	}

}
