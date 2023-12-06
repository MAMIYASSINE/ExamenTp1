package EX1;

public class Epreuve {

	private String denomination;
	Candidat tab[];
	private int nbMAX;
	private int nbreff;
	private boolean etat;
	public Epreuve(String denomination, int max) {
		this.denomination=denomination;
		this.nbMAX=max;
		tab=new Candidat[max];
	}
	public String  decrire() {
		String ch=" ";
		for(int i=0;i<nbreff;i++) {
			ch=ch+tab[i].getNon()+" ";
		}
		return ch;
	}
	@Override
	public String toString() {
		String ch="";
		if(etat== true) {
			ch="termine";
		}
		else
		{
			ch="non terminée";
		}
		return this.denomination+" "+ch +this.decrire(); 
	}
	public void ajoutCondidat(Candidat c) {
		if(nbreff<tab.length) {
			tab[nbreff]=c;
			nbreff++;
		}
		else
		{
			System.out.println("Le tableau atteint le maximum");
		}
	}
	public void terminer () {
		etat=true;
	}
	public boolean estTerminee() {
		return etat;
	}
	public Resultat getRecord() throws IllegalArgumentException {
		Resultat r=tab[0].getResultat();
		for(int i=1;i<nbreff;i++) {
			if(tab[i].getResultat().compareTo(r)==1) {
				r=tab[i].getResultat();
			}
		}
		return r;
		
	}
	public Candidat getVinqueur() throws IllegalArgumentException {
		int i=0;
		boolean estrouve=false;
		Candidat c=null;
		Resultat r=this.getRecord();
		while((i<nbreff)&&(estrouve==false)) {
			if(tab[i].getResultat().compareTo(r)==0) {
				c=tab[i];
				estrouve=true;
			}
			else
			{
				i++;
			}
		}
		return c;
	}
	public void fixeResultat(int id, Resultat r) throws IllegalUpdateException
	{
		int i=0;
		boolean estrouve=false;
		if(this.estTerminee()==false) {
		
			while((i<nbreff)&&(estrouve==false)) {
				if(tab[i].getId()==id) {
					estrouve=true;
				}
				else
				{
					i++;
				}
			}
			if(estrouve==true) {
				tab[i].setResultat(r);
			}
			else
			{
				System.out.println("Le candidat n'est pas enregistre");
			}
		}
		else
		{
			throw new IllegalUpdateException(" L'epreuve est terminee");
		}
		
	}
	public Resultat getResultat(int id)
	{
		int i=0;
		boolean estrouve=false;
		while((i<nbreff)&&(estrouve==false)) {
			if(tab[i].getId()==id) {
				estrouve=true;
			}
			else
			{
				i++;
			}
		}
		if(estrouve==true) {
			if(tab[i].getResultat()==null) {
				return null;
			}
			else
			{
				return tab[i].getResultat();
			}
		}
		else
		{
			return null;
		}

	}
	
	
	
}
