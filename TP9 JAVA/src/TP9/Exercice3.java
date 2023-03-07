package TP9;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Exercice3 {
	private float reel ;
	public Exercice3(float reel ) {
		this.reel=reel;
	}
	public void remplissage ()   {
		int i=0;
		float r;
		try {
			DataOutputStream fiche=new DataOutputStream
								(new FileOutputStream("exerci3.dot"));
			while(i<this.reel) {
				r=i*this.reel;
				fiche.writeFloat(r);
				System.out.println(r);
				i++;
			}
			fiche.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void analyse() {
		System.out.println("le reel est : "+this.reel);
		@SuppressWarnings("unused")
		float i;
		int k=0;
		try {
			DataInputStream fich=new DataInputStream(new FileInputStream("exerci3.txt"));
			try {
				while((i=fich.read())!=-1) {
					k++;
				}
				System.out.println("le nombres de multiples est : "+k);
				fich.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main (String []args) {
		Exercice3 test = new Exercice3(15);
		
		test.remplissage();
		test.analyse();
		
	}
}
