package TP4;

public class Chefprjt extends Agent {
	private int NbrprojetR ; 
	public Chefprjt(String Nom, String Prenom, int Age, String Statut,
						int y, int m, int d, int NbrprojetR) {
		super(Nom, Prenom, Age, Statut, y, m, d);
		this.NbrprojetR =  NbrprojetR ;
	}
	public String getNom() {
		return super.getNom();
	}
	public int getAge() {
		return super.getAge();
	}
	@Override
	public float CalSalaire() {
		return (float)(NbrprojetR * 5000 + 400 );
	}
	
}
