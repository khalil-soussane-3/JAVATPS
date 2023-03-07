package TP6;

public class Voiture implements Comparable<Voiture>{
	private int matricule ;
	private String Marque ;
	private float Puissance ;
	public Voiture(int matricule , String Marque,float Puissance) {
		super();
		this.matricule = matricule ;
		this.Marque = Marque ;
		this.Puissance = Puissance ;
	} 
	@Override
	public int compareTo(Voiture o) {
		if (this.equals(o)) {
			return 0;
		}
		else {
			return (int) (this.matricule - o.matricule);
		}
	}
	public boolean equals(Voiture v) {
		return (this.matricule==v.matricule) && this.Marque.equals(v.Marque) && this.Puissance==v.Puissance ;
	}
	@Override
	public String toString() {
		return "Voiture [matricule=" + matricule + ", Marque=" + Marque + ", Puissance=" + Puissance + "]";
	}
	
}
