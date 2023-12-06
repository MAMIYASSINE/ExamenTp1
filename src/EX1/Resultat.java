package EX1;

public interface Resultat {
	public String toString() ;
	public int compareTo(Resultat r) throws IllegalArgumentException  ;
	public static boolean equals(Resultat r) {
		if(r!=null) {
			return true;
		}
		else
		{
			return false;
		}
		
	}

}
