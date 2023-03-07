package TP5;
import java.util.ArrayList;
import java.util.Iterator;
public class Test {

	public static void main(String[] args) {
		ArrayList <Personne> list = new ArrayList <Personne>();
		Personne pers1 = new Personne(1,"kkk","sss");
		Personne pers2 = new Personne(2,"aaa","bbb");
		Personne pers3 = new Personne(3,"ddd","ccc");
		Personne pers4 = new Personne(4,"eee","fff");
		Personne pers5 = new Personne(5,"hhh","ggg");
		PersonneService list2 = new PersonneService(list);
		list2.save(pers1);
		list2.save(pers2);
		list2.save(pers3);
		list2.save(pers4);
		list2.save(pers5);
		list2.delete(2);
		list2.update(pers5);
		list2.findById(1);
		for(int i =0 ;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}	
}
