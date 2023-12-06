package examen2015;

public class Agence {
	Voiture [] lv;
	String ref;
	int taille;
	int nbVoit;
	public Agence(int taille) {
		  this.taille=taille;
	      this.lv=new Voiture[taille];
	      this.nbVoit=0;
	}
	public void selectionne(Critere c) {
		for(int i=0; i<lv.length;i++) {
			if(c.correspond(lv[i])) {
				System.out.println(lv[i]);
			}
		}
	}
	public void ajout (Voiture v) throws AjoutInterditException {
		int anConst=2016;
		if((anConst-v.getAnne()<5)&& (nbVoit<taille)){
			lv[nbVoit++]=v;
		}
		else
			throw new AjoutInterditException();
	} 

}
