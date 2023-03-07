package EXE6;

public class Employe {
	private int code ;
	private int age ;
	private float salaire ;
	private String nom ;
	public Employe () {
		code = 0;
		age = 0 ;
		salaire = 0 ;
		nom ="soussane" ;
	}
	public Employe (int code , float salaire ) {
		this.code = code ;
		this.salaire = salaire ;
	}
	public float salaire() {
		return this.salaire ;
	}
	public int age() {
		return this.age; 
	}
	public void affiche() {
		System.out.println("le code est "+this.code);
		System.out.println("l'age est "+this.age);
		System.out.println("le salaire est "+this.salaire);
		System.out.println("le nom est "+this.nom);
	}
	public void augmenter (int m) {
		float a ;
		a= (float)(0.05*this.salaire) ;
		if(m<=a) {
			salaire += m ;
		}
		else {
			System.out.println("la somme depasse 5% ");
		}
	}
	public void diminier (float n) {
		if (this.salaire > 1000) {
			this.salaire = (this.salaire*n)/100 ; 
		}
		else {
			System.out.println(" salaire ne depasse pas 1000dh ");
		}
	}
	public static void main (String[] args) {
		Employe E1= new Employe();
		Employe E2= new Employe();
		E1.augmenter(300);
		E2.diminier(3);
		E1.affiche();
		E2.affiche();
	}
}
