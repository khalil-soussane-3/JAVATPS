package TP9;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
public class Save {

	public static void main(String[] args) throws FileNotFoundException,
					IOException, ClassNotFoundException {
		@SuppressWarnings("unused")
		ObjectOutputStream data = new ObjectOutputStream(
				new FileOutputStream("file.dot"));	
		Client cl1= new Client("soussane1","khalil1","oued zem1");
		Client cl2= new Client("soussane2","khalil2","oued zem2");
		Client cl3= new Client("soussane3","khalil3","oued zem3");
		data.writeObject(cl1);
		data.writeObject(cl2);
		data.writeObject(cl3);
		data.close();
		ObjectInputStream indata=new ObjectInputStream(
				new FileInputStream("file.dot"));
		String [] tab = new String[3];
		Client[] cl = new Client [3];
		for(int i=0;i<cl.length;i++) {
			cl[i]=(Client)(indata.readObject());
			tab[i]=cl[i].getNom();
			System.out.println(tab[i]);
		}
	}
}
