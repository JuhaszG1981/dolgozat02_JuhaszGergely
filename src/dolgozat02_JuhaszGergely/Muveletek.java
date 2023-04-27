package dolgozat02_JuhaszGergely;

public class Muveletek {
	
	public void kilistaz(Ujsag[] ujsagok, String laptipus) {
		for (Ujsag ujsag : ujsagok) {
			if (ujsag.getLapTipus().equals(laptipus)) {
				System.out.println(ujsag.toString());
			}
		}
	}
	
	public void napilapMinMegjelenesSzammal(Ujsag[] ujsagok, int minimumMegjelenes) {
		
		for (Ujsag ujsag : ujsagok) {
			Napilap napilapObj;
			if (ujsag.getClass() == Napilap.class) {
				napilapObj = (Napilap) ujsag;
				if (napilapObj.getHetiMegjelenesekSzama() >= minimumMegjelenes) {
					System.out.println(napilapObj.toString());
					
				}
				
			}
		}
	}
	public int megszamlal(Ujsag[] ujsagok, String megszamlalandoUjsag) {
		
		int darabSzam=0;
		for (int i = 0; i < ujsagok.length; i++) {
			
			if (ujsagok[i].getLapTipus().equals(megszamlalandoUjsag)) {
				darabSzam++;
			}
			
		}
		return darabSzam;
	}
	public void legdragabbUjsag(Ujsag[] ujsagok) {
		int legdragabb = 0;
		for (int i = 1; i < ujsagok.length; i++) {
			if (ujsagok[i].getAr() > ujsagok[legdragabb].getAr() ) {
				legdragabb = i;
			}
		}
		System.out.println("A legdrágább újság neve: " + ujsagok[legdragabb].getNev() + ", ÁFA tartalma: " + ujsagok[legdragabb].afaTartalomSzami(ujsagok[legdragabb].getAr()) +"Forint" );
	}
	
	public void elsoNapilap(Ujsag[] ujsagok, String keresettUjsag) {
		int i=0;
		Napilap napilapObj;
		 while (i!=ujsagok.length && !ujsagok[i].getLapTipus().equals(keresettUjsag)) {
			 i++;
		 }
		 if (i == ujsagok.length ) {
			System.out.println("Nincs keresett újságtípus!");
		}else {
			
			napilapObj = (Napilap) ujsagok[i];
			System.out.println("neve "+napilapObj.getNev()+ ", heti össz költsége (brutto) " +napilapObj.hetiArkalkulacio(napilapObj.getHetiMegjelenesekSzama(), napilapObj.getAr()) + "Forint");
		}
		 
		 

		
		
	}

}
