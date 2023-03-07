package TP4;
public class Technicien extends Agent implements Salarie {
	private int NbrUnite ;
	private int Nbrheure ; 
	public Technicien(String Nom, String Prenom, int Age, String Statut,
						int y, int m, int d, int NbrUnite, int Nbrheure ) {
		super(Nom, Prenom, Age, Statut, y, m, d);
		this.NbrUnite= NbrUnite ;
		this.Nbrheure = Nbrheure ; 
	}
	public String getNom() {
		return super.getNom();
	}
	public int getAge() {
		return super.getAge();
	}
	@Override
	public float CalSalaire() {
		return (float)(NbrUnite * 70);
	}
	
	public float CalPrime(float Salaire) {
		if (Nbrheure>240) {
			return (float)(0.02 * Salaire);
		}
		else return 0 ; 
	}
}
