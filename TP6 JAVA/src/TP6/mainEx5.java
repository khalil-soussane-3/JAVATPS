package TP6;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;

public class mainEx5 {

	public static void main(String[] args) {
		ArrayList<Personne> ListeNom = new ArrayList<Personne> ();
		Hashtable <Integer,String> MapPersonne = new Hashtable<Integer,String>();
		Personne [] listpers = new Personne [5] ;
		listpers[0] = new Personne(1,"khalil",25);
		listpers[1] = new Personne(2,"soussane",16);
		listpers[2] = new Personne(3,"othman",19);
		listpers[3] = new Personne(4,"azami",31);
		listpers[4] = new Personne(5,"rbaiti",22);
		
		//q1
		for(Personne i : listpers) {
			if(i.getAge()>=20) {
				ListeNom.add(i);
			}else {
				MapPersonne.put(i.getCode(),i.getNom());
			}
		}
		//q2
		Iterator itlistnom = ListeNom.iterator();
		while (itlistnom.hasNext()) {
			System.out.println(itlistnom.next());
		}
		System.out.println("---------------------");
		//q3
		Enumeration EMapPers = MapPersonne.elements();
		long emp0 = System.nanoTime();
		while(EMapPers.hasMoreElements()) {
			System.out.println(EMapPers.nextElement());
		}
		long emp1 = System.nanoTime();
		System.out.println("---------------------");
		//q4
		System.out.println(MapPersonne.containsKey(5));
		System.out.println("---------------------");
		//q5
		System.out.println(MapPersonne.containsValue("soussane"));
		System.out.println("---------------------");
		//q6
		HashMap <Integer,String> CopiePersonne = new HashMap<Integer,String>();
		CopiePersonne.putAll(MapPersonne);
		long cp0 = System.nanoTime();
		//q7
		for(Entry <Integer,String> e : CopiePersonne.entrySet()) {
			System.out.println(e.getKey()+" // "+e.getValue());
		}
		long cp1 = System.nanoTime();
		System.out.println("---------------------");
		//q8
		System.out.println("performance de liste CopiePersonne "+(cp1-cp0));
		System.out.println("performance de liste CopiePersonne "+(emp1-emp0));
	}
}
