package examen2015;

public class CriterePrix implements Critere {
	double prixFixe;
	public CriterePrix(double pf) {
	this.prixFixe=pf;
	}
	@Override
	public boolean correspond(Object o) {
	
			if( o instanceof Voiture) {
				Voiture voi1 = (Voiture)o;
				return voi1.getPrix()<prixFixe;
			}
			return false;
		}
	

}
