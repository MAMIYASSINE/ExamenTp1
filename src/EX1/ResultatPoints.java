package EX1;

public class ResultatPoints implements Resultat{
	
	private int ptcummule;
	public ResultatPoints(int pt) {
		this.ptcummule=pt;
	}
	@Override
	public String toString() {
		return this.getClass().getSimpleName()+" "+this.ptcummule;
	}
	@Override
	public int compareTo(Resultat r) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		if(r instanceof ResultatPoints )
		{
			if(this.ptcummule ==((ResultatPoints)r).ptcummule){
				return 0;
			}
			else if(this.ptcummule >((ResultatPoints)r).ptcummule) {
				return 1;
			}
			else
			{
				return -1;
			}
		}
		else
		{
			throw new IllegalArgumentException(" Erreur de Type");
		}
	}
	

}
