package TP8;

public class SoldeCompte {
	private float solde ; 
	public SoldeCompte(float solde) {
		this.solde=solde ;
	}
	public void DeposerArgent(float montant) {
		solde = solde+montant;
		this.notifyAll();
	}
	public synchronized void RetirerAgent(float montant) {
			while(solde==0) {
				try {
					System.out.println("--attendre--");
					this.wait();
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		solde=solde-montant;
		System.out.println("le solde apres retrait est :"+solde);
	}
	
}
