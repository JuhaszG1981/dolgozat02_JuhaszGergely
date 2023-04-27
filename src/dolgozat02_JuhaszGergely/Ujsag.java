package dolgozat02_JuhaszGergely;

public class Ujsag {
	private String lapTipus;
	private String nev;
	private String kiado;
	private int ar;
	public Ujsag(String lapTipus, String nev, String kiado, int ar) {
		this.lapTipus = lapTipus;
		this.nev = nev;
		this.kiado = kiado;
		this.ar = ar;
	}
	
	public String getLapTipus() {
		return lapTipus;
	}
	public void setLapTipus(String lapTipus) {
		this.lapTipus = lapTipus;
	}
	public String getNev() {
		return nev;
	}
	public void setNev(String nev) throws UresNevKivetelException {
		if (!nev.isEmpty() && nev != null ) {
			this.nev = nev;	
		}else {
			throw new UresNevKivetelException("Az újság neve nem lehet üres!");
		}
		
		
	}
	public String getKiado() {
		return kiado;
	}
	public void setKiado(String kiado) throws UresNevKivetelException {
		if (!kiado.isEmpty() && kiado != null ) {
			this.kiado = kiado;	
		}else {
			throw new UresNevKivetelException("Az újság kiadóját meg kell adni!");
		}
	}
	public int getAr() {
		
		return ar;
		
		
	}
	public void setAr(int ar) {
		if (ar >= 0) {
			this.ar = ar;
		} else {
			throw new NumberFormatException("Az ár nem lehet negatív!");
		}
		
	}
	
	public double afaTartalomSzami(int ar) {
		return ar*0.05;
	}
	@Override
	public String toString() {
		return nev + " " + kiado + " " + ar + " Forint + " + afaTartalomSzami(ar) + " Forint ÁFA";
	}
	

}
