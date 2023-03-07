package TP6;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class main {

	public static void main(String[] args) {
		HashSet<Voiture> listvoit = new HashSet<Voiture>();
		Voiture voit1 = new Voiture (152,"dacia",1403);
		Voiture voit2 = new Voiture (189,"kia",1430);
		Voiture voit3 = new Voiture (754,"mercedes",2900);
		Voiture voit4 = new Voiture (320,"bentley",5000);
		Voiture voit5 = new Voiture (170,"skoda",1200);
		listvoit.add(voit1);
		listvoit.add(voit2);
		listvoit.add(voit3);
		listvoit.add(voit4);
		listvoit.add(voit5);
		TreeSet <Voiture> treevoit = new TreeSet <Voiture>(); 
		treevoit.addAll(listvoit);
		Iterator itlist = listvoit.iterator();
		long t0 = System.nanoTime();
		while(itlist.hasNext()) {
			System.out.println(itlist.next());
		}
		long t1= System.nanoTime();
		long lt = t1-t0;
		Iterator ittree = treevoit.iterator();
		long t00 = System.nanoTime();
		while(ittree.hasNext()) {
			System.out.println(ittree.next());
		}
		long t11=System.nanoTime();
		long tt=t11-t00;
		System.out.println("tree set : "+tt);
		System.out.println("Hash set :"+lt);
		System.out.println("---------------------");
		System.out.println("LINKED HASHSET---");
		LinkedHashSet <Voiture> ListeLinked = new LinkedHashSet<Voiture>();
		ListeLinked.addAll(treevoit);
		ListeLinked.addAll(listvoit);
		Iterator itlinked = ListeLinked.iterator();
		while(itlinked.hasNext()) {
			System.out.println(itlinked.next());
		}
		System.out.println("---------------------");
		System.out.println("linkedHashset----> tableau");
		Object[] arrayvoiture = ListeLinked.toArray();
		for(Object i : arrayvoiture) {
			System.out.println(i);
		}
	}
}
