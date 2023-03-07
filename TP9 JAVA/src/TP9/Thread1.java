package TP9;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class Thread1 implements Runnable {

	@Override
	public void run() {
		try {
			String i;
			BufferedReader fil=new BufferedReader(new FileReader("fichexe4.txt"));
			try {
				while((i=fil.readLine())!=null) {
					System.out.println(i);
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			} catch (IOException e) {
				e.printStackTrace();}
		} catch (FileNotFoundException e) {
			e.printStackTrace();}	
	}
}
