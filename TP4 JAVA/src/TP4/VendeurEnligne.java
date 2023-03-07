package TP4;

public class VendeurEnligne extends Vendeur{
	public VendeurEnligne(String Nom, String Prenom, int Age, String Statut,
						int y, int m, int d, float ChiffreAff) {
			super(Nom, Prenom, Age, Statut, y, m, d, ChiffreAff);
	}
	public String getNom() {
		return super.getNom();
	}
	public int getAge() {
		return super.getAge();
	}
	@Override
	public float CalSalaire() {
		return (float)(ChiffreAff * 0.3 + 600) ; 
	}
}
