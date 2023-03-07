package TP4;

import java.util.Scanner;

public class Principale {

	public static void main(String[] args) {
		//vendeur direct 
		VendeurDirect vend1 = new VendeurDirect("chlih","najib",37,"binance",1978,07,11,150000); 
		System.out.println(vend1.getNom());
		System.out.println(vend1.getAge());
		System.out.println("prime de vend1 : "+vend1.CalPrime(110000));
		System.out.println("salaire de vendeur 1 : "+vend1.CalSalaire());
		//vendeur enligne
		VendeurEnligne vend2 = new VendeurEnligne("soussane","khalil",22,"gg",2000,05,16,120000);
		System.out.println(vend2.getNom());
		System.out.println(vend2.getAge());
		System.out.println("prime de vendeur 2 : "+vend2.CalPrime(55000));
		System.out.println("salaire de vendeur 2 : "+vend2.CalSalaire());
		//chef de projet
		Chefprjt ag1 = new Chefprjt("aaa","bbb",40,"ccc",1972,01,01,30);
		System.out.println(ag1.getNom());
		System.out.println(ag1.getAge());
		System.out.println("salaire : "+ag1.CalSalaire());
		//ingenieur
		Ingenieur ing1 = new Ingenieur("ddd","eee",30,"fff",1982,02,03,120);
		System.out.println(ing1.getNom());
		System.out.println(ing1.getAge());
		System.out.println("salaire d'ingenieur : "+ing1.CalSalaire());
		//tech
		Technicien tech1 = new Technicien("xxx","yyy",36,"zzz",1986,10,28,24,230);
		System.out.println(tech1.getNom());
		System.out.println(tech1.getAge());
		System.out.println("prime de technicien : "+tech1.CalPrime(150000));
		System.out.println("salaire de technicien : "+tech1.CalSalaire());
	}
}
