package TP8;


public class Personne implements Runnable {
	String Nom ;
	Compte compte ;
	public Personne(String Nom,Compte compte) {
		this.Nom=Nom;
		this.compte=compte;
	}
	public void  Retrait (float montant ) throws InterruptedException {
		System.out.println("solde de "+Nom+" est : "+compte.getSolde());
		Thread.sleep(2000);
		compte.retirer(montant);
		System.out.println(Nom+" --retire-- "+montant+"DH");
	}
	@Override
	public void run()  {
		for(int i=0;i<10;i++) {
			try {
				this.Retrait(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
		}
	}
	public static void main(String []args) {
		Compte c=new Compte(3000);
		Personne amal= new Personne("amal",c);
		Personne said = new Personne("said",c);
		Thread thread1=new Thread(amal,"amal");
		Thread thread2 = new Thread(said,"said");
		thread1.start();
		thread2.start();
	}
}
