package EX1;
import java.util.Scanner; 
public class switchc {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int a , b;
		String i; 
		System.out.println("entre le premier nombre : ");
		a = sc.nextInt();
		System.out.println("entre le premier nombre : ");
		b = sc.nextInt();
		System.out.println("entre votre  operation : ");
		i = sc.next();
		switch(i) {
		case "+": System.out.println("la somme entre "+a+"  et  "+b+"  : "+(a+b));break;
		case "-": System.out.println("la differnce entre "+a+"  et  "+b+" : "+(a-b));break;
		case "*": System.out.println("le produit entre "+a+"  et  "+b+" : "+(a*b));break;
		default : System.out.println("error");
		}
		sc.close();
	}
}
