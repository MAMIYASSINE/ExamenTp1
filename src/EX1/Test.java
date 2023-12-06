package EX1;

public class Test {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Epreuve E=new Epreuve("aa",5);
		Candidat C1=new Candidat(1,"ZZ");
		Candidat C2=new Candidat(2,"EE");
		Candidat C3=new Candidat(3,"RR");
		E.ajoutCondidat(C1);
		E.ajoutCondidat(C2);
		E.ajoutCondidat(C3);
		ResultatOral r1=new ResultatOral("C");
		ResultatOral r2=new ResultatOral("B");
		ResultatOral r3=new ResultatOral("A");

		try {
		E.fixeResultat(1, r1);
		E.fixeResultat(2, r2);
		E.fixeResultat(3, r3);
		}
		catch (IllegalUpdateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		E.terminer();
		System.out.println(E);
		try {
			System.out.println(E.getVinqueur());
			}
		
		catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			System.out.println(E.getRecord());
		}
		catch(IllegalArgumentException e1) {
			e1.printStackTrace();
		}
		//System.out.println(E.getResultat(2));
		



	}

}
