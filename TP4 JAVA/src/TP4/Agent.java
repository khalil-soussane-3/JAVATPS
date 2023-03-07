package TP4;

public abstract  class Agent extends Employe {
	public Agent(String Nom, String Prenom, int Age, 
			String Statut, int y, int m, int d ) {
		super(Nom, Prenom, Age, Statut, y, m, d);
	}
	public String getNom() {
		return super.getNom()  ;
	}
	public int getAge() {
		return super.getAge();
	}
	public abstract float CalSalaire();
}
