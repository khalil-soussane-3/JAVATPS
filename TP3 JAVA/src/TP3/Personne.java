package TP3;
import java.time.LocalDate;
import java.time.Month;

public class Personne {
	private String Nom ;
	private String Prenom ;
	private LocalDate DateN ;
	public  Personne(String Nom , String Prenom , int y,int m ,int d) {
		this.Nom=Nom;
		this.Prenom=Prenom;
		this.DateN=LocalDate.of(y,Month.of(m) , d);
	} 
	public Personne () {
		Nom="";
		Prenom="";
		DateN=LocalDate.of(2000, 1, 1);
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
	public LocalDate getDateN() {
		return DateN;
	}
	public void setDateN(int y ,int m ,int d ) {
		DateN = LocalDate.of(y,m,d);
	}
	public void affiche() {
		System.out.println("le nom : "+Nom+
				"\n le prenom  : "+Prenom+
				"\n la date de naissance : "+DateN);
	}
	
}
