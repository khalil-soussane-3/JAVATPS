package TP8;

class mythread extends Thread {
	String nom;
	public mythread(String nom ) {
		this.nom = nom;
	}
	public void run() {
		try {
			for(int i=0;i<20;i++) {
				System.out.println(Thread.currentThread().getName()+" -->"
								+this.nom+" >>"+i );
				sleep((long) (Math.random()*200));
			}
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}
public class Exercice1 {

	public static void main(String[] args) throws InterruptedException  {
		mythread thread1 = new mythread ("first");
		mythread thread2 = new mythread ("second");
		mythread thread3 = new mythread ("last");
		thread1.setPriority(Thread.MAX_PRIORITY);
		thread3.setPriority(Thread.MIN_PRIORITY);
		thread1.start();
		thread3.start();
		thread1.join();
		thread3.join();
		thread2.start();
	}

}
