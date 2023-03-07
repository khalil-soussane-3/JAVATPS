package TP3;
import java.util.Scanner;
public class Main {
	public static float CalMoy (Etudiant [] etudiant ) {
		float s=0; 
		float n;
		for (int i= 0 ;i<etudiant.length;i++) {
			s=s+etudiant[i].Moyenne();
		}
		n=s/(etudiant.length);
		return n;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		Professeur prof1 =new Professeur ();
		Etudiant etud1 = new Etudiant ();
		System.out.println("saisir les informations de professeur : ");
		System.out.println("saisir le nom / prenom / date de naissance (anne/mois/jour)/ numero de somme /"
								+ "salaire de base / statut : ");
		prof1.setNom(scan.next());
		prof1.setPrenom(scan.next());
		prof1.setDateN(scan.nextInt(),scan.nextInt(),scan.nextInt());
		prof1.setNumS(scan.nextInt());
		prof1.setSalDBase(scan.nextFloat());
		prof1.setStat(scan.next());
		System.out.println("saisir les informations d'etudiant : ");
		System.out.println("saisir le nom / prenom / date de naissance (anne/mois/jour) / CNE /"
										+ "note de controle / note examen : ");
		etud1.setNom(scan.next());
		etud1.setPrenom(scan.next());
		etud1.setDateN(scan.nextInt(),scan.nextInt(),scan.nextInt());
		etud1.setCNE(scan.next());
		etud1.setNoteContr(scan.nextFloat());
		etud1.setNoteExam(scan.nextFloat());
		prof1.affiche();
		System.out.println("le salaire de "+prof1.getNom()+" "+prof1.getPrenom()+
										" est : "+prof1.calculeSalaire());
		etud1.affiche();
		System.out.println("la moyenne de"+etud1.getNom()+" "+etud1.getPrenom()+
										" est :"+etud1.Moyenne());
		Etudiant [] etud = new Etudiant[15];
		System.out.println("saisir les informations de 15  etudiant : ");
		for (int i=0 ; i<etud.length ; i++) {
			etud[i]=new Etudiant();
			System.out.println("saisir le nom / prenom / date de naissance (anne/mois/jour) / CNE /"
					+ "note de controle / note examen  de  "+(i+1)+"  etudiant ");
			etud[i].setNom(scan.next());
			etud[i].setPrenom(scan.next());
			etud[i].setDateN(scan.nextInt(),scan.nextInt(),scan.nextInt());
			etud[i].setCNE(scan.next());
			etud[i].setNoteContr(scan.nextFloat());
			etud[i].setNoteExam(scan.nextFloat());
		}
		Etudiant etudiant [] = new Etudiant[10] ;
		for(int i=0 ; i<etudiant.length ; i++) {
			etudiant[i]=etud[i];
		}
		System.out.println("la moyenne des 10 premiers etudiant est : "+CalMoy(etudiant));
		Professeur [] prof = new Professeur [5];
		System.out.println("saisir les informations des professeurs  :");
		for(int i=0;i<prof.length;i++) {
			prof[i] = new Professeur();
			System.out.println("saisir le nom / prenom / date de naissance (anne/mois/jour) /numero de Somme/"
					+ "Salaire de base / Statut de professeur  : "+(i+1));
			prof[i].setNom(scan.next());
			prof[i].setPrenom(scan.next());
			prof[i].setDateN(scan.nextInt(),scan.nextInt(),scan.nextInt());
			prof[i].setNumS(scan.nextInt());
			prof[i].setSalDBase(scan.nextFloat());
			prof[i].setStat(scan.next());
		}
		float s=0 ;
		float min=prof[0].calculeSalaire();
		for(int i=0;i<prof.length;i++) {
			s=s+prof[i].calculeSalaire();
			if (prof[i].calculeSalaire()<min) {
				min=prof[i].calculeSalaire();
			}
		}
		System.out.println("la somme des salaires de toutes les professeurs est  :  "+s);
		System.out.println("le salaire le plus bas : " +min);
		scan.close();
	}
}
