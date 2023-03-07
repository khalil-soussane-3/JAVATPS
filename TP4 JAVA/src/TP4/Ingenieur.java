package TP4;

public class Ingenieur extends Agent {
	private int Nbrheure ;
	public Ingenieur(String Nom, String Prenom, int Age, String Statut,
						int y, int m, int d,int Nbrheure) {
		super(Nom, Prenom, Age, Statut, y, m, d);	
		Nbrheure= this.Nbrheure;
	}
	public String getNom() {
		return super.getNom();
	}
	public int getAge() {
		return super.getAge();
	}
	@Override
	public float CalSalaire() {
		return (float)(Nbrheure * 300);
	}
	
}
