package EXE6;

public class produit {
	private int code ;
	private String intitule ;
	private float prix ;
	private String marque ;
	public produit () {
		code = 120 ;
		intitule = "prdt";
		prix = 15000 ;
		marque = "khalil soussane" ;
	}
	public produit (int code , float prix ) {
		this.code = code ;
		this.prix = prix ;
	}
	public float prix () {
		return this.prix ;
	}
	public String marque () {
		return this.marque ;
	}
	public void afficher () {
		System.out.println("le code :"+this.code);
		System.out.println("l'intitule :"+this.intitule);
		System.out.println("le prix :"+this.prix);
		System.out.println("la marque :"+this.marque);
	}
	public void augmenter (int m) {
		float a,b ;
		b=this.prix;
		a=(float)(b*0.05) ;
		if (m>a) {System.out.println("le montant depasse 5%");}
		else {prix = prix +m ;
		System.out.println("le prix augmenté est  "+prix);}
	}
	public void diminuer (int n ) {
		float a ;
		a=(float)(this.prix*n/100);
		if (this.prix>1000) {
			this.prix = this.prix-a;
			System.out.println("le prix diminié est  "+prix);
		}
		else {
			System.out.println("le prix ne depasse pas 1000dh ");
		}
	}
	public static void main (String[] args) {
		produit P1 = new produit ();
		produit P2 = new produit ();
		P1.augmenter(300);
		P2.diminuer(3);
		P1.afficher();
		P2.afficher();
	}
}
