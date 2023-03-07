package TP8;

public class Compte {
	private float  solde = 100f ;
	public Compte (float solde) {
		this.solde=solde;
	}
	public Compte () {
		
	}
	public float getSolde() {
		return solde;
	}

	public void setSolde(float solde) {
		this.solde = solde;
	}
	public void retirer(float montant) {
		solde = solde - montant ;
	}
	
}
