package EX1;
import java.util.Scanner ;
public class sommegrandpetit {

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		System.out.println("saisir votre nombre ;");
		int a;
		a= n.nextInt();
		int max=a,min=a,s=a;
		if (a>0) {
		while (a>0) {
			System.out.println("saisir un autre nombre  ; ");
			a=n.nextInt();
			if (a==0) break;
			else 
				if(a<min) {min=a;}
				if(a>max) {max=a;}
			s=s+a;
		}
		System.out.println("la valeur max :"+max);
		System.out.println("la valeur min :"+min);
		System.out.println("la somme est :"+s);
		} else {System.out.println("nombre n'est pas sup a 0 ");}
		n.close();
	}
}

