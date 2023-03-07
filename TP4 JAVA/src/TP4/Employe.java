package TP4;
import java.time.LocalDate ;
import java.time.Month;
public abstract class Employe {
	private String Nom ;
	private String Prenom ; 
	private int Age ;
	private String Statut ; 
	private LocalDate DateE ;
	
	public abstract float CalSalaire();
	public int getAge() {
		return Age ;
	}
	public String getNom() {
		return "l'Employe : "+ Nom +" "+ Prenom ;
	}
	public Employe (String Nom , String Prenom , int Age ,
						String Statut , int y, int m, int d) {
		this.Nom = Nom ; 
		this.Prenom = Prenom ; 
		this.Age = Age ; 
		this.Statut = Statut ;
		this.DateE = LocalDate.of(y,Month.of(m) , d);
	}
}
