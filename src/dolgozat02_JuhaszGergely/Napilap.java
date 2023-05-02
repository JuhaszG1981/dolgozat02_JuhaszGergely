package dolgozat02_JuhaszGergely;

public class Napilap extends Ujsag {
	private int hetiMegjelenesekSzama;

	public Napilap(String lapTipus, String nev, String kiado, int ar, int hetiMegjelenesekSzama) {
		super(lapTipus ,nev, kiado, ar);
		this.hetiMegjelenesekSzama = hetiMegjelenesekSzama;
	}

	public int getHetiMegjelenesekSzama() {
		return hetiMegjelenesekSzama;
	}

	public void setHetiMegjelenesekSzama(int hetiMegjelenesekSzama) {
		if (hetiMegjelenesekSzama >= 4) { // && hetiMegjelenesekSzama <= 7, kimaradt
			this.hetiMegjelenesekSzama = hetiMegjelenesekSzama;
		} else {
			throw new NumberFormatException("Napilapnak legalább négyszer kell megjelennie egy héten!");
		}
		
	}
	
	public final double hetiArkalkulacio(int hetiMegjelenesekSzama, int ar) {
		return hetiMegjelenesekSzama * (ar + afaTartalomSzami(ar)); 
	}

	@Override
	public String toString() {
		return super.toString() + " egy héten " + hetiMegjelenesekSzama + " alkalommal jelenik meg";
	}
	
	

}
