package examen2015;

public class CritereMarque implements Critere {
	String marqueDonne;
	public CritereMarque(String md) {
		this.marqueDonne=md;
	}
	@Override
	public boolean correspond(Object o) {
		if( o instanceof Voiture) {
			Voiture voi1 = (Voiture)o;
			return voi1.getMarque().equals(marqueDonne);
		}
		return false;
	}
	

}
