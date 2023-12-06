package examen2015;

public class main {

	public static void main(String[] args) {
	
		{ 
			 Agence A1 = new Agence(100);
		Voiture V1=new Voiture("FORD ","Fiesta",2000,11000) ;
		Voiture V2=new Voiture("KIA","Rio",2012,28.500) ;
		Voiture V3=new Voiture("KIA ","Picanto",2015,26000) ;
		Voiture V4=new Voiture("OPEL","Astra",2013,45000) ;
		try {
			//A1.ajout(V1) ;
			A1.ajout(V2) ;
			A1.ajout(V3) ;
			A1.ajout(V4) ;
		} catch (AjoutInterditException e) {
			System.out.println(e.alert());
		}
		
		 CriterePrix cpr = new CriterePrix(50000);
		 A1.selectionne(cpr);
		}

	}

}
