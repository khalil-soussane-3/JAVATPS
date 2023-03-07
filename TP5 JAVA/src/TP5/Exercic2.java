package TP5;
import java.util.Iterator;
import java.util.LinkedList;
public class Exercic2 {

	public static void main(String[] args) {
		LinkedList <Integer> liste1 = new LinkedList<Integer>();
		liste1.add(15);
		liste1.add(13);
		liste1.add(5);
		liste1.add(3,10);
		liste1.add(13);
		liste1.addFirst(03);
		liste1.addLast(04);
		Iterator <Integer> list1 = liste1.iterator();
		while (list1.hasNext()) {
			System.out.println("les elements de la liste 1 :  "  +list1.next());
		}
		for(int i=0;i<liste1.size();i++) {
			System.out.println("les elements de la liste 1 par boucle for :  "  +liste1.get(i));
		}
		
		System.out.println("1ere element de liste1 : "+liste1.getFirst());
		System.out.println("derniere element de la liste1 : "+liste1.getLast());
		
		liste1.remove(1);
		LinkedList<Integer> liste2 = new LinkedList<Integer>();
		liste2 = liste1 ;
		Iterator <Integer> list2 = liste2.iterator();
		while (list2.hasNext()) {
			System.out.println("les elements de la liste 2 :  "  +list2.next());
		}
	}

}
