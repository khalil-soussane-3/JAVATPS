package TP7;

public class Entier {
	private int a;
	public Entier (int a) {
		this.a = a;
	}
	public double division (Entier diviseur) {
		double d = 1;
		try {
		d= (double)(a/diviseur.a);
		}catch(ArithmeticException e) {
			System.out.println("division impossible");
		}
		return  (double)(d);
	}
	public static void main(String[] args) {
		Entier a= new Entier(45);
		Entier b= new Entier(3);
		Entier c= new Entier(0);
		System.out.println(a.division(b));
		System.out.println(a.division(c));
	}
}
