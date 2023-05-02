package dolgozat02_JuhaszGergely;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FajlKezeles {
	public Ujsag[] fajlbolOlvas(String fajlnev, String elvalaszto) throws IOException{
		
		Ujsag[] ujsagok = new Ujsag[elemszamMeghataroz(fajlnev)];
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fajlnev),"UTF-8"));
		
		
		for (int i = 0; i < ujsagok.length; i++) {
			String sor = br.readLine();
			String[] csvSor = sor.split(elvalaszto);
			if (csvSor[0].equals("Ujsag")) {
				Ujsag ujsagObj = new Ujsag(csvSor[0], csvSor[1], csvSor[2], Integer.parseInt(csvSor[3]));
				ujsagok[i] = ujsagObj;
			}else if (csvSor[0].equals("Napilap")) {
				Ujsag ujsagObj = new Napilap(csvSor[0], csvSor[1], csvSor[2], Integer.parseInt(csvSor[3]), Integer.parseInt(csvSor[4]));
				ujsagok[i] = ujsagObj;
			}else {
				Ujsag ujsagObj = new HetiLap(csvSor[0], csvSor[1], csvSor[2], Integer.parseInt(csvSor[3]), Integer.parseInt(csvSor[4]));
				ujsagok[i] = ujsagObj;
			} // itt most jó volt az if else, de a bővíthetőség mjiatt a switch-case jobb lenne
			
		}
		return ujsagok;
	}

	
	
private int elemszamMeghataroz(String fajlnev) throws IOException {
		
		Path utvonal = Paths.get(fajlnev);
		long sorokszama = Files.lines(utvonal).count();
		return (int)sorokszama;
	}
}
