package uuskieli;

import java.util.ArrayList;
import java.util.HashMap;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Suorittaja {
	
	private  HashMap <String, Object> muistikartta;
	
	public Suorittaja() {
		this.muistikartta=new HashMap <String,Object>();
	}
	
	public Suorittaja(HashMap <String, Object> ylimuistikartta) {
		this.muistikartta=ylimuistikartta;
	}
	
	
	private ArrayList<String> alirutiinikomentolista=new ArrayList<String>();
	private boolean alirutiiniOnAuki;
	private boolean katkaistaanAlirutiini;
	
	
	private BufferedReader puskurilukija;
	private String luettukomento;
	
	
	public void lue (String komento) {
		if(alirutiiniOnAuki) {
			if(!komento.equals("päätä-alirutiini")) {
			alirutiinikomentolista.add(komento);
			}
		}
		
		
		String[] nykyKomennonSanat=komento.split(" ");
		
		switch(nykyKomennonSanat[0]) {
		
		case "lue-komennot-tiedostosta":
			
			try {
				puskurilukija=new BufferedReader(new FileReader(nykyKomennonSanat[1]));
				
				
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				//e1.printStackTrace();
				System.out.println("Tiedostoa "+ nykyKomennonSanat[1]+" ei löytynyt." );
			}
			
			try {
				luettukomento=puskurilukija.readLine();
				//System.out.println("luin: "+luettukomento);
				while(luettukomento!=null) {
				this.lue(luettukomento);
				luettukomento=puskurilukija.readLine();
				}
				
				puskurilukija.close();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				//e1.printStackTrace();
				System.out.println("Tiedostoa "+ nykyKomennonSanat[1]+" ei voitu lukea." );
			}
			
			
		
		break;
		
		case "laita-muistipaikkaan":
		
			switch(nykyKomennonSanat[2]) {
			
				case "luku": 
					
					try {
						muistikartta.put("luku "+nykyKomennonSanat[1], Integer.parseInt(nykyKomennonSanat[3]));
					} catch (Exception e) {
						// TODO Auto-generated catch block
						//e.printStackTrace();
						System.out.println("Virheellinen lukusyöte komennossa: "+komento);
					}
				break;
				
				case "liukuluku": 
					try {
						muistikartta.put("liukuluku "+nykyKomennonSanat[1], Double.parseDouble(nykyKomennonSanat[3]));
					} catch (Exception e) {
						// TODO Auto-generated catch block
						//e.printStackTrace();
						System.out.println("Virheellinen liukulukusyöte komennossa: "+komento);
					}
				break;
				
				case "teksti": 
					muistikartta.put("teksti "+nykyKomennonSanat[1], nykyKomennonSanat[3]);
				break;
			}
		
		break;
		
		
		case "aloita-alirutiini":
			alirutiiniOnAuki=true;
		break;
		
		case "katkaise-alirutiini-jos":
			
			switch(nykyKomennonSanat[3]) {
			case "on-yhtä-suuri-kuin":
				Object verrokki1;
				
				
				if(true) {
					katkaistaanAlirutiini=true;
				}
			break;
			case "on-pienempi-kuin":
				if(true) {
					katkaistaanAlirutiini=true;
				}
			break;
			case "on-suurempi-kuin":
				if(true) {
					katkaistaanAlirutiini=true;
				}
			break;
			
			}
			
			
		break;
		
		
		
		case "päätä-alirutiini":
			alirutiiniOnAuki=false;
			Suorittaja alisuorittaja=new Suorittaja(this.muistikartta);
			int prönk=0;
			while(true) {
				for(String alikomento : alirutiinikomentolista) {
					alisuorittaja.lue(alikomento);
					
				}
				prönk++;
				if(prönk>16) {
				    break;
				}
			}
			
		alirutiinikomentolista.clear();
		break;
			
		case "vertaa":
			
		break;
		
		case "lisää":
			muistikartta=Aritmetiikka.lisää(nykyKomennonSanat, komento, muistikartta);
			
		break;	
			
			
			
			
	
			
		case "vähennä":
			muistikartta=Aritmetiikka.vähennä(nykyKomennonSanat, komento, muistikartta);
			
		break;
		
		case "kerro":
			muistikartta=Aritmetiikka.kerro(nykyKomennonSanat, komento, muistikartta);
			
		break;
		
		case "jaa":
			muistikartta=Aritmetiikka.jaa(nykyKomennonSanat, komento, muistikartta);
			
		break;
		
		
		case "jakojäännä":
			muistikartta=Aritmetiikka.jakojäännä(nykyKomennonSanat, komento, muistikartta);
			
		break;
		
		
		
		case "tulosta":
			String avain=nykyKomennonSanat[1]+" "+nykyKomennonSanat[2];
			
			if(muistikartta.containsKey(avain)) {
				System.out.println(avain+"="+muistikartta.get(avain));
			}
			else {
				System.out.println("Muistikartasta ei löytynyt: "+ avain);
			}
			
		break;
			
		case "tulosta-kaikki":
			for(String yleisavain : muistikartta.keySet()) {
				System.out.println(yleisavain+"="+muistikartta.get(yleisavain));
			}
		break;
		
		case "suorita":
		break;
		
		case "":
		break;
		
		default: System.out.println("Virheellinen komento: "+komento);
		}
		
		
		
		
	}
	
	
}
	
	


