package exercice3;

public class produit {
	private int code;
	public String Marque ;
	private float prix ;
	public produit() {
		code=0 ;
		prix=0 ;
		Marque ="";
	}
	public produit(int code , float prix , String Marque) {
		this.code = code ;
		this.prix = prix ;
		this.Marque = Marque ;
	}
	public boolean equals(produit p) {
		return this.code == p.code && this.Marque.equals(p.Marque) && this.prix==p.prix ;
	}
	public String toString() {
		return "Marque =" +Marque+ "\n code= "+code+ "\n prix="+prix ; 
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMarque() {
		return Marque;
	}
	public void setMarque(String marque) {
		Marque = marque;
	}
	public float getPrix() {
		return prix;
	}
	public void setPrix(float prix) {
		this.prix = prix;
	}
}

	
