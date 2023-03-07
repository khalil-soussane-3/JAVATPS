package TP7;

import java.util.Scanner;

public class Exercice3 {
	public static int fonct(int n ) throws ExcepNInf, 
							ExcepNmbrSuIn , ExcepRefNull {
		if (n<=1) { throw new ExcepNInf() ;}
		else {
			Scanner scan = new Scanner(System.in);
			System.out.println("saisir un nombre entre 1 et "+n+" : ");
			int a = scan.nextInt();
			int [] t = new int [a];
			if (t==null) {throw new ExcepRefNull();}
			if (a>n || a<1) {
				throw new ExcepNmbrSuIn();
			}else {
			return a;
			}
		}
	}
	public static void main(String[] args) throws ExcepNInf,
							ExcepNmbrSuIn, ExcepRefNull {
		Scanner scan = new Scanner(System.in);
		System.out.println("saisir un nombre sup a 1 : ");
		int b = scan.nextInt();
		int c = fonct(b); 
		System.out.println(c);
		int [] t = new int [c];
		for(int i=0;i<t.length;i++) {
			System.out.println(t[i]);
		}
		
	 }
}
