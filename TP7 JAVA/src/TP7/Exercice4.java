package TP7;

import java.util.Scanner;
import java.util.Vector;

public class Exercice4 {

	public static void main(String[] args)throws LoginException,
											PwdException,InputLength {
		Scanner scan = new Scanner(System.in);
		final String a="scott";
		final String b="tiger";
		while (true) {
		try {
			System.out.println("donne le nom d'utilisateur : ");
			String login= scan.next();
			if(login.length()>10) {throw new InputLength();}
			if(!(login.equals(a))){throw new LoginException();}
			System.out.println("donne le pwd d'utilisateur : ");
			String pwd = scan.next();
			if(pwd.length()>10) {throw new InputLength();}
			if(!(pwd.equals(b))) {throw new PwdException();}
			System.out.println("nom et pwd  d'utilisateur est valide. ");
			break;
		}
		catch(PwdException e) {e.printStackTrace();}
		catch(LoginException i ) {i.printStackTrace();}
		catch(InputLength i1){i1.printStackTrace();}
		}
	}
}

