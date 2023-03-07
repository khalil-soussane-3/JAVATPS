package EXERCICE1;
import java.util.Scanner ;
public class EXERCICE22 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a ;
		System.out.println("entre la taille de tableau : ");
		a = scan.nextInt();
		float [] tab  = new float [a];
		System.out.println("entrez les valeurs de tableau");
		for(int k=0;k<a;k++) {
			tab[k]=scan.nextInt();
		}
		for(int i=0; i<a;i++) {
			System.out.println("la valeur de indice "+i+ " est  : "+tab[i]);
	}
		scan.close();
}
}
