package exercice3;
import java.util.Scanner; 
public class principale {
	public static float Calcprix(produit [] T) {
		float s=0;
		for(int i=0;i<T.length;i++) {
			s=s+T[i].getPrix() ;
		}
	return s;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("sasie la valeur de tableau produit :");
		int size = scan.nextInt();
		produit [] table = new produit [size] ;
		for(int i =0;i<size;i++) {
			table[i] = new produit();
			System.out.print("saisir le code : ");
			table[i].setCode(scan.nextInt());
			System.out.print("saisir la marque de produit : ");
			table[i].setMarque(scan.next());
			System.out.print("saisir le prix de marque : ");
			table[i].setPrix(scan.nextFloat());
		}
		for(int i =0;i<size;i++) {
			System.out.println(table[i].toString());
		}
		System.out.println("la somme de tous les produit est :"+Calcprix(table));
		boolean b;
		for(int i=0;i<size-1;i++) {
			for(int k=i+1;k<size;k++) {
				b= table[i].equals(table[k]);
				if(b==true){
					System.out.println("le produit "+(i+1)+"et produit "+(k+1)+"sont meme etat ");
				}
				else System.out.println("le produit "+(i+1)+"et produit "+(k+1)+" ne sont pas de meme etat ");
			}
		}
	}
}
