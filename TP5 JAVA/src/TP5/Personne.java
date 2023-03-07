package TP5;

public class Personne {
	private int code ;
	private String Nom ;
	private String Prenom ;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public String getPrenom() {
		return Prenom;
	}
	public void setPrenom(String prenom) {
		Prenom = prenom;
	}
	public Personne (int code , String Nom ,String Prenom ) {
		this.code = code ;
		this.Nom = Nom ;
		this.Prenom = Prenom ;
	}
	public String toString() {
		return "\n code : " + this.code +"\n Nom : "+this.Nom+"\n Prenom : "+this.Prenom ;
	}
	
}
