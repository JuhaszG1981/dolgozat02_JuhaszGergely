package dolgozat02_JuhaszGergely;

public class HetiLap extends Ujsag {
	int megjelenesNapjaAHeten;

	public HetiLap(String lapTipus, String nev, String kiado, int ar, int megjelenesNapjaAHeten) {
		super(lapTipus, nev, kiado, ar);
		this.megjelenesNapjaAHeten = megjelenesNapjaAHeten;
	}

	public int getMegjelenesNapjaAHeten() {
		return megjelenesNapjaAHeten;
	}

	public void setMegjelenesNapjaAHeten(int megjelenesNapjaAHeten) {
		if (megjelenesNapjaAHeten >= 1 && megjelenesNapjaAHeten <= 7) {
			this.megjelenesNapjaAHeten = megjelenesNapjaAHeten;
				
		} else {
			throw new NumberFormatException("A heti megjelenés napjának 1-7 között kell lennie!");

		}
		}

	@Override
	public String toString() {
		return super.toString() + " A hét " + megjelenesNapjaAHeten + ". napján jelenik meg";
	}
	

}
