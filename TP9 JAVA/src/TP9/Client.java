package TP9;
import java.io.Serializable;
public class Client implements Serializable{

	private static final long serialVersionUID = 1L;
	private String nom;
	private String prenom;
	private String adresse ;
	public Client(String nom,String prenom,String adresse) {
		this.nom=nom;
		this.prenom=prenom;
		this.adresse=adresse;}
	@Override
	public String toString() {
		return "Client [nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + "]";}
	public String getNom() {
		return nom;}
	public void setNom(String nom) {
		this.nom = nom;}
	public String getPrenom() {
		return prenom;}
	public void setPrenom(String prenom) {
		this.prenom = prenom;}
	public String getAdresse() {
		return adresse;}
	public void setAdresse(String adresse) {
		this.adresse = adresse;}	
}
