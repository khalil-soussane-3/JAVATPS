package TP7;

import java.util.Scanner;

public class Exercice2 {
	public static int factoriel(int a) throws ExcepNmbrNeg {
		int fact =1 ;
		if (a<0) {
			throw new ExcepNmbrNeg();
		}
		else if(a==0) {
			return 1 ;
		}else {
			for(int i=1;i<=a;i++) {
				fact = fact*i;
			}
			return fact ;
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("saisir un entier : ");
		int a=scan.nextInt();
		try {
			System.out.println("le factoriel de "+a+ " est : "+factoriel(a));
		}catch(ExcepNmbrNeg e) {
			System.out.println();
		}
	}

}
