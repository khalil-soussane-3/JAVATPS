package EX1;
import java.util.Scanner; 
public class saisie1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		double  a ;
		long b;
		long s=0;
		System.out.println("saisir votre serie des nombres : ");
		while (true) {
			a= scan.nextDouble();
			if (a!=0) {
				b=Math.round(a);
				s=s+b;
			}
			else { break ;} 
		}
		System.out.println("la somme est : "+s);
		scan.close();
		}
}
