package TP3;

public class Etudiant extends Personne {
	private String CNE ;
	private float NoteContr ;
	private float NoteExam;
	public Etudiant (String Nom , String Prenom ,int y,int m,int d ,
						String CNE,float NoteContr,float NoteExam) {
		super (Nom,Prenom,y,m,d);
		this.CNE=CNE;
		this.NoteContr=NoteContr;
		this.NoteExam=NoteExam;
	}
	public Etudiant () {
		super();
		CNE = "";
		NoteContr = 0;
		NoteExam = 0 ;
	}
	public String getCNE() {
		return CNE;
	}
	public void setCNE(String cNE) {
		CNE = cNE;
	}
	public float getNoteContr() {
		return NoteContr;
	}
	public void setNoteContr(float noteContr) {
		NoteContr = noteContr;
	}
	public float getNoteExam() {
		return NoteExam;
	}
	public void setNoteExam(float noteExam) {
		NoteExam = noteExam;
	}
	public void affiche() {
		super.affiche();
		System.out.println("numero de CNE :  "+CNE+
							"\n Note de controle : "+NoteContr+
							"\n Note Examen : "+NoteExam);
	}
	public float Moyenne() {
		return (float)(NoteExam*0.75+NoteContr*0.25);
	}
	
}
