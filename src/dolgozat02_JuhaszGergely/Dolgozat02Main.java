package dolgozat02_JuhaszGergely;

import java.io.IOException;

public class Dolgozat02Main {

	public static void main(String[] args) {
		Muveletek muveletek = new Muveletek();
		FajlKezeles fajl = new FajlKezeles();
		try {
			Ujsag[] ujsagok= fajl.fajlbolOlvas("ujsagok.csv","-");
			//System.out.println("Sikeres fájlbeolvasás"); //kimaradt, visszajelzés a felhasználónak
			//4.Feladat
			System.out.println("Hetilapok:");
			muveletek.kilistaz(ujsagok, "Hetilap");
			System.out.println();
			System.out.println("Napilapok: ");
			muveletek.kilistaz(ujsagok, "Napilap");
			System.out.println();
			//5.Feladat
			System.out.println("Napilapok amik legalább 6-szor jelennek meg egy héten: ");
			muveletek.napilapMinMegjelenesSzammal(ujsagok, 6);
			System.out.println();
			//6.Feladat
			System.out.println("Általános Újságok dartabszáma:");
			System.out.println(muveletek.megszamlal(ujsagok, "Ujsag"));
			System.out.println();
			//7.Feladat
			muveletek.legdragabbUjsag(ujsagok);
			System.out.println();
			//8.Feladat
			System.out.print("Az első Napilap ");
			muveletek.elsoNapilap(ujsagok, "Napilap");
			
			System.out.print("Az első Havilap ");
			muveletek.elsoNapilap(ujsagok, "Havilap");
			
			
			
			
		} catch (IOException e) {
			System.err.println("Fájl nem létezik/hibás!");
		}
		
		
	
		
		

	}

}
