package TP8;

public class Depotret implements Runnable {
	SoldeCompte c ;
	public Depotret(SoldeCompte c) {
		this.c=c;
	}
	@Override
	public void run() {
		try {
			while(true) {
			c.DeposerArgent(8000);
			c.RetirerAgent(200);
			Thread.sleep(3000);}
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	public static void main(String [] args ) {
		SoldeCompte sld1 = new SoldeCompte(8000);
		SoldeCompte sld2 = new SoldeCompte(6000);
		Depotret depotret1 = new Depotret(sld1);
		Depotret depotret2 = new Depotret(sld2);
		Thread thread1 = new Thread(depotret1,"thread1");
		Thread thread2 = new Thread(depotret2,"thread2");
		thread1.start();
		thread2.start();
		
	}
}
