package EX1;

public class ResultatOral implements Resultat {
	private String appreciation;
	
	ResultatOral(String appre){
		this.appreciation=appre;
	}
	@Override
	public String toString() {
		return this.getClass().getSimpleName()+" "+this.appreciation;
	}
	@Override
	public int compareTo(Resultat r) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		if(r instanceof ResultatOral )
		{
			return this.appreciation.compareTo(((ResultatOral)r).appreciation);
		}
		else
		{
			throw new IllegalArgumentException(" Erreur de Type");
		}
		
	}
}
