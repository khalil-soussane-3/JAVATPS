package TP6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class tp6 {

	public static void main(String[] args) {
		//exercice1
		TreeSet <String> color = new TreeSet<String>(); 
		color.add("yellow");
		color.add("red");
		color.add("green");
		color.add("black");
		color.add("blue");
		color.add("brown");
		Iterator it = color.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		//exercice2
		HashSet hashst=new HashSet();
		hashst.addAll(color);
		color.removeAll(color);
		System.out.println("-------------------------------------");
		Iterator itt = hashst.iterator();
		while(itt.hasNext()) {
			System.out.println(itt.next());
		}
		System.out.println("-------------------------------------");
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		//exercice3 
		HashSet <Integer> numbrs = new HashSet<Integer> ();
		ArrayList<Integer> pnumbrs = new ArrayList<Integer>();
		for(int i =0;i<16;i++) {
			numbrs.add(i);
		}
		int a;
		Iterator itnumbr = numbrs.iterator();
		while(itnumbr.hasNext()) {
			 a=(int) itnumbr.next() ;
			 if(a%2==1) {
				 pnumbrs.add(a);
			 }
		}
		Iterator itpnumbrs = pnumbrs.iterator();
		System.out.println("-------------------------------------");
		while(itpnumbrs.hasNext()) {
			System.out.println(itpnumbrs.next());
		}
	}
}
