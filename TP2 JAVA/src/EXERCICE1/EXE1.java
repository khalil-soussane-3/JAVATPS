package EXERCICE1;
import java.util.Scanner ;
public class EXE1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in) ;
		String T = scan.next();
		String A =scan.next();
		String [] tab ;
		String text="" ;
		switch(A) {
			case "ensa": 
				tab = T.split("ensa");
				T="";
				for(int i=0;i<tab.length;i++) {
					T=T.concat(tab[i]);
				};System.out.println(T);break;
			case "fst" :
				text = T.replace("fst","ensa");
				System.out.println(text);break;
			case "encg":
				T=T.concat(" encg");
				System.out.println(T);break;
			default:
				System.out.println("error");
		}
		scan.close();
	}	
}
