package TP9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Thread2 implements Runnable  {
	@Override
	public void run() {
		try {
			String i;
			BufferedReader fil=new BufferedReader(new FileReader("fichexe44.txt"));
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
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void main (String []args) throws IOException {
		ObjectOutputStream data1 = new ObjectOutputStream(new FileOutputStream("fichexe4.txt"));
		Client cl2= new Client("Soussane2","khalil2","oued zem2");
		Client cl3= new Client("Soussane3","khalil3","oued zem3");
		data1.writeObject(cl2);
		data1.writeObject(cl3);
		data1.close();
		ObjectOutputStream data2 = new ObjectOutputStream(new FileOutputStream("fichexe44.txt"));
		Client cl4= new Client("Soussane4","khalil4","oued zem4");
		Client cl5= new Client("Soussane5","khalil5","oued zem5");
		data2.writeObject(cl4);
		data2.writeObject(cl5);
		data2.close();
		
		Thread1 t1=new Thread1();
		Thread2 t2=new Thread2();
		Thread t11=new Thread(t1);
		Thread t22=new Thread(t2);
		t11.start();
		t22.start();
	}
}
