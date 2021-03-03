package uuskieli;

import java.util.ArrayList;


public class Käskyttäjä {

	
	private static ArrayList <String> komentolista=new ArrayList <String>();
	
	
	
	public static void lue (String komento) {
		komentolista.add(komento);
		if(komento.equals("suorita")) {
			suorita();
			komentolista.clear();
		}
	}
	
	private static void suorita () {
		Suorittaja suorittaja=new Suorittaja();
		for(String komento : komentolista) {
			suorittaja.lue(komento);
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
