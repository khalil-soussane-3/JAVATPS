package TP4;

public abstract class Vendeur extends Employe implements Salarie {
	public float ChiffreAff ; 
	public Vendeur(String Nom, String Prenom, int Age, String Statut,
							int y, int m, int d , float ChiffreAff) {
		super(Nom, Prenom, Age, Statut, y, m, d);
		this.ChiffreAff = ChiffreAff ; 
	}
	public String getNom() {
		return super.getNom();
	}
	public int getAge() {
		return super.getAge();
	}
	public abstract float CalSalaire();
	
	public float CalPrime (float Salaire) {
		if (ChiffreAff>100000) {
			return (float)(0.05 * Salaire);
		}
		else if (ChiffreAff>50000) {
			return (float)(0.02 * Salaire);
		}
		else 
			return 0 ; 
	}
}
