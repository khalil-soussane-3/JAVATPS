import java.util.Scanner ;
public class sasie {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s=0;
		int i;
		int min=0;
		int max=0;
		do {
			System.out.println("saisir votre nombre : ");
			i  =  sc.nextInt();
			s=s+i;
			if (i<0) {
				if(i<min ) {
					min=i;
				}
				break;
			}
				
			if(i>max) {
				max=i;
			}
				
			
		}while (i>0);
		System.out.println("la plus grand valeur est : "+max);
		System.out.println("la plus petit valeur est : "+min);
		System.out.println("la somme des valeurs  : "+s);
	}

}
