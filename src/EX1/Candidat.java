package EX1;

public class Candidat {
	private int id ;
	private String nom ;
	private Resultat resultat ;
	public Candidat(int id, String nom ){
	this.id=id ;
	this. nom = nom ;
	this.resultat=null ;
	}
	public int getId() {
	return id;
	}
	public void setId(int id) {
	this.id = id;
	}
	public String getNon() {
	return nom;
	}
	public void setNon(String non) {
	this.nom = non;
	}
	public Resultat getResultat() {
	return resultat;
	}
	public void setResultat(Resultat resultat) {
	this.resultat = resultat;
	}
	@Override
	public String toString() {
		return this.id+" "+this.nom;
	}

}
