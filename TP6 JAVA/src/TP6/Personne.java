package TP6;

public class Personne implements Comparable<Personne> {
	private int code ;
	private String Nom ;
	private int Age ;
	public Personne (int code ,String Nom , int Age) {
		this.code = code ; 
		this.Nom = Nom ;
		this.Age = Age ;
	}
	public int getCode() {
		return code;
	}
	public String getNom() {
		return Nom;
	}
	public int getAge() {
		return Age;
	}
	@Override
	public int compareTo(Personne o) {
		if (this.equals(o)) {
		return 0;
		}else {
			return (int) (this.Age - o.Age);
		}
	}
	@Override
	public String toString() {
		return "Personne [code=" + code + ", Nom=" + Nom + ", Age=" + Age + "]";
	}
	
}
