package TP3;

public class Professeur extends Personne{
	private int NumS ;
	private float SalDBase ;
	private String Stat ;
	public Professeur (String Nom , String Prenom ,int y,int m,int d,
						int NumS,float SalDBase, String Stat) {
		super (Nom,Prenom,y,m,d);
		this.NumS=NumS ;
		this.SalDBase=SalDBase;
		this.Stat=Stat;
	}
	public Professeur() {
		super();
		NumS = 0;
		SalDBase = 0;
		Stat="";
	}
	public int getNumS() {
		return NumS;
	}
	public void setNumS(int numS) {
		NumS = numS;
	}
	public float getSalDBase() {
		return SalDBase;
	}
	public void setSalDBase(float salDBase) {
		SalDBase = salDBase;
	}
	public String getStat() {
		return Stat;
	}
	public void setStat(String stat) {
		Stat = stat;
	}
	public void affiche() {
		super.affiche();
		System.out.println("numero de Somme : "+NumS+
				"\n Salaire de base : "+SalDBase+
				"\n Statut :"+Stat);
	}
	public float calculeSalaire() {
		float salaire =SalDBase ;
		if(Stat.equals("assistant")) {
			salaire=(float)(SalDBase+0.2*SalDBase);}
		else if(Stat.equals("habilite")) {
			salaire=(float)(SalDBase+0.5*SalDBase);}
		return salaire;
	}
}
