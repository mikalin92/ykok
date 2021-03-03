package uuskieli;

import java.util.HashMap;

public class Aritmetiikka {
	
	public static HashMap <String, Object> lisää(String [] nykyKomennonSanat,String komento,HashMap <String, Object> muistikartta) {
		
		switch(nykyKomennonSanat[1]){
		
		
		
			case "lukua":
				Integer lisättäväksiluku = null;
				if(muistikartta.containsKey("luku "+nykyKomennonSanat[2])) {
					lisättäväksiluku=(Integer)muistikartta.get("luku "+nykyKomennonSanat[2]);
				}else {
					System.out.println("Lukua "+nykyKomennonSanat[2]+" ei ole olemassa. Virhellinen komento: "+komento);
				}
				switch(nykyKomennonSanat[3]){
					case "luvulla":
						if(muistikartta.containsKey("luku "+nykyKomennonSanat[4])) {
						Integer lisäysluku=(Integer)muistikartta.get("luku "+nykyKomennonSanat[4]);
						muistikartta.put("luku "+nykyKomennonSanat[2], lisättäväksiluku+lisäysluku);
						}else {
							System.out.println("Lukua "+nykyKomennonSanat[4]+" ei ole olemassa. Virhellinen komento: "+komento);
						}
						
						
					break;
					case "liukuluvulla":
						System.out.println("Ei voida sijoittaa liukulukua lukuun. Virhellinen komento: "+komento);
					break;
					case "tekstillä":
						System.out.println("Ei voida sijoittaa teksti� lukuun. Virhellinen komento: "+komento);
					break;
				
				}
				
			break;
			
			
			
			
			
			
			
			case "liukulukua":
				Double lisättäväksiliukuluku = null;
				if(muistikartta.containsKey("liukuluku "+nykyKomennonSanat[2])) {
					lisättäväksiliukuluku =(Double)muistikartta.get("liukuluku "+nykyKomennonSanat[2]);
				}else {
					System.out.println("Liukulukua "+nykyKomennonSanat[2]+" ei ole olemassa. Virhellinen komento: "+komento);
				}					
				
				switch(nykyKomennonSanat[3]){
					case "luvulla":
						if(muistikartta.containsKey("luku "+nykyKomennonSanat[4])) {
						Integer lisäysluku=(Integer)muistikartta.get("luku "+nykyKomennonSanat[4]);
						muistikartta.put("liukuluku "+nykyKomennonSanat[2], lisättäväksiliukuluku+lisäysluku);
						}else {
							System.out.println("Lukua "+nykyKomennonSanat[4]+" ei ole olemassa. Virhellinen komento: "+komento);
						}							
						
					break;
					case "liukuluvulla":
						if(muistikartta.containsKey("liukuluku "+nykyKomennonSanat[4])) {
						Double lisäysliukuluku=(Double)muistikartta.get("liukuluku "+nykyKomennonSanat[4]);
						muistikartta.put("liukuluku "+nykyKomennonSanat[2], lisättäväksiliukuluku+lisäysliukuluku);
						}else {
							System.out.println("Lukua "+nykyKomennonSanat[4]+" ei ole olemassa. Virhellinen komento: "+komento);
						}								
						
						
						
					break;
					case "tekstillä":
						System.out.println("Ei voida sijoittaa tekstiä liukulukuun. Virhellinen komento: "+komento);
					break;					
				
				}
				
				
			break;
			
			
			
			
			
			
			
			case "tekstiä":
				String lisättäväksiteksti = null;
				if(muistikartta.containsKey("teksti "+nykyKomennonSanat[2])) {
					lisättäväksiteksti =(String)muistikartta.get("teksti "+nykyKomennonSanat[2]);
				}else {
					System.out.println("Teksti "+nykyKomennonSanat[2]+" ei ole olemassa. Virhellinen komento: "+komento);
				}					
				
				switch(nykyKomennonSanat[3]){
					case "luvulla":
						if(muistikartta.containsKey("luku "+nykyKomennonSanat[4])) {
						Integer lisäysluku=(Integer)muistikartta.get("luku "+nykyKomennonSanat[4]);
						muistikartta.put("teksti "+nykyKomennonSanat[2], lisättäväksiteksti+lisäysluku);
						}else {
							System.out.println("Lukua "+nykyKomennonSanat[4]+" ei ole olemassa. Virhellinen komento: "+komento);
						}							
						
					break;
					case "liukuluvulla":
						if(muistikartta.containsKey("liukuluku "+nykyKomennonSanat[4])) {
						Double lisäysliukuluku=(Double)muistikartta.get("liukuluku "+nykyKomennonSanat[4]);
						muistikartta.put("teksti "+nykyKomennonSanat[2], lisättäväksiteksti+lisäysliukuluku);
						}else {
							System.out.println("LiukuLukua "+nykyKomennonSanat[4]+" ei ole olemassa. Virhellinen komento: "+komento);
						}								
						
						
						
					break;
					case "tekstillä":
						if(muistikartta.containsKey("teksti "+nykyKomennonSanat[4])) {
						String lisäysteksti=(String)muistikartta.get("teksti "+nykyKomennonSanat[4]);
						muistikartta.put("teksti "+nykyKomennonSanat[2], lisättäväksiteksti+lisäysteksti);
						}else {
							System.out.println("Tekstiä "+nykyKomennonSanat[4]+" ei ole olemassa. Virhellinen komento: "+komento);
						}							
						
					break;					
					 
				}
			break;

			
			
			default: System.out.println("Virheellinen lisäyskomento: "+komento);
		}
		return muistikartta;
		
		
		
		
		
		
		
		
		
		
		
	}
	
	public static HashMap <String, Object> vähennä(String [] nykyKomennonSanat,String komento,HashMap <String, Object> muistikartta) {
		
		switch(nykyKomennonSanat[1]){
		
		
		
			case "lukua":
				Integer lisättäväksiluku = null;
				if(muistikartta.containsKey("luku "+nykyKomennonSanat[2])) {
					lisättäväksiluku=(Integer)muistikartta.get("luku "+nykyKomennonSanat[2]);
				}else {
					System.out.println("Lukua "+nykyKomennonSanat[2]+" ei ole olemassa. Virhellinen komento: "+komento);
				}
				switch(nykyKomennonSanat[3]){
					case "luvulla":
						if(muistikartta.containsKey("luku "+nykyKomennonSanat[4])) {
						Integer lisäysluku=(Integer)muistikartta.get("luku "+nykyKomennonSanat[4]);
						muistikartta.put("luku "+nykyKomennonSanat[2], lisättäväksiluku-lisäysluku);
						}else {
							System.out.println("Lukua "+nykyKomennonSanat[4]+" ei ole olemassa. Virhellinen komento: "+komento);
						}
						
						
					break;
					case "liukuluvulla":
						System.out.println("Ei voida sijoittaa liukulukua lukuun. Virhellinen komento: "+komento);
					break;
					case "tekstillä":
						System.out.println("Ei voida sijoittaa tekstiä lukuun. Virhellinen komento: "+komento);
					break;
				
				}
				
			break;
			
			
			
			
			
			
			
			case "liukulukua":
				Double lisättäväksiliukuluku = null;
				if(muistikartta.containsKey("liukuluku "+nykyKomennonSanat[2])) {
					lisättäväksiliukuluku =(Double)muistikartta.get("liukuluku "+nykyKomennonSanat[2]);
				}else {
					System.out.println("Liukulukua "+nykyKomennonSanat[2]+" ei ole olemassa. Virhellinen komento: "+komento);
				}					
				
				switch(nykyKomennonSanat[3]){
					case "luvulla":
						if(muistikartta.containsKey("luku "+nykyKomennonSanat[4])) {
						Integer lisäysluku=(Integer)muistikartta.get("luku "+nykyKomennonSanat[4]);
						muistikartta.put("liukuluku "+nykyKomennonSanat[2], lisättäväksiliukuluku-lisäysluku);
						}else {
							System.out.println("Lukua "+nykyKomennonSanat[4]+" ei ole olemassa. Virhellinen komento: "+komento);
						}							
						
					break;
					case "liukuluvulla":
						if(muistikartta.containsKey("liukuluku "+nykyKomennonSanat[4])) {
						Double lisäysliukuluku=(Double)muistikartta.get("liukuluku "+nykyKomennonSanat[4]);
						muistikartta.put("liukuluku "+nykyKomennonSanat[2], lisättäväksiliukuluku-lisäysliukuluku);
						}else {
							System.out.println("Lukua "+nykyKomennonSanat[4]+" ei ole olemassa. Virhellinen komento: "+komento);
						}								
						
						
						
					break;
					case "tekstillä":
						System.out.println("Ei voida vähentää tekstiä liukuluvusta. Virhellinen komento: "+komento);
					break;					
				
				}
				
				
			break;
			
			
			
			
			
			
			
			case "tekstiä":
				System.out.println("Tekstiä ei voi vähentää. Virheellinen komento: "+komento);
			break;	

			
			
			default: System.out.println("Virheellinen vähennyskomento: "+komento);
		}
		return muistikartta;
		
		
		
		
		
		
		
		
		
		
		
	}
	

	
	public static HashMap <String, Object> kerro(String [] nykyKomennonSanat,String komento,HashMap <String, Object> muistikartta) {
		
		switch(nykyKomennonSanat[1]){
		
		
		
			case "lukua":
				Integer lisättäväksiluku = null;
				if(muistikartta.containsKey("luku "+nykyKomennonSanat[2])) {
					lisättäväksiluku=(Integer)muistikartta.get("luku "+nykyKomennonSanat[2]);
				}else {
					System.out.println("Lukua "+nykyKomennonSanat[2]+" ei ole olemassa. Virhellinen komento: "+komento);
				}
				switch(nykyKomennonSanat[3]){
					case "luvulla":
						if(muistikartta.containsKey("luku "+nykyKomennonSanat[4])) {
						Integer lisäysluku=(Integer)muistikartta.get("luku "+nykyKomennonSanat[4]);
						muistikartta.put("luku "+nykyKomennonSanat[2], lisättäväksiluku*lisäysluku);
						}else {
							System.out.println("Lukua "+nykyKomennonSanat[4]+" ei ole olemassa. Virhellinen komento: "+komento);
						}
						
						
					break;
					case "liukuluvulla":
						System.out.println("Ei voida kertoa liukulukua lukuun. Virhellinen komento: "+komento);
					break;
					case "tekstillä":
						System.out.println("Ei voida kertoa tekstiä lukuun. Virhellinen komento: "+komento);
					break;
				
				}
				
			break;
			
			
			
			
			
			
			
			case "liukulukua":
				Double lisättäväksiliukuluku = null;
				if(muistikartta.containsKey("liukuluku "+nykyKomennonSanat[2])) {
					lisättäväksiliukuluku =(Double)muistikartta.get("liukuluku "+nykyKomennonSanat[2]);
				}else {
					System.out.println("Liukulukua "+nykyKomennonSanat[2]+" ei ole olemassa. Virhellinen komento: "+komento);
				}					
				
				switch(nykyKomennonSanat[3]){
					case "luvulla":
						if(muistikartta.containsKey("luku "+nykyKomennonSanat[4])) {
						Integer lisäysluku=(Integer)muistikartta.get("luku "+nykyKomennonSanat[4]);
						muistikartta.put("liukuluku "+nykyKomennonSanat[2], lisättäväksiliukuluku*lisäysluku);
						}else {
							System.out.println("Lukua "+nykyKomennonSanat[4]+" ei ole olemassa. Virhellinen komento: "+komento);
						}							
						
					break;
					case "liukuluvulla":
						if(muistikartta.containsKey("liukuluku "+nykyKomennonSanat[4])) {
						Double lisäysliukuluku=(Double)muistikartta.get("liukuluku "+nykyKomennonSanat[4]);
						muistikartta.put("liukuluku "+nykyKomennonSanat[2], lisättäväksiliukuluku*lisäysliukuluku);
						}else {
							System.out.println("Lukua "+nykyKomennonSanat[4]+" ei ole olemassa. Virhellinen komento: "+komento);
						}								
						
						
						
					break;
					case "tekstill�":
						System.out.println("Ei voida kertoa tekstiä liukulukuun. Virhellinen komento: "+komento);
					break;					
				
				}
				
				
			break;
			
			
			
			
			
			
			
			case "tekstiä":
				System.out.println("Ei voida kertoa tekstiä. Virheellinen komento: "+komento);
			break;

			
			
			default: System.out.println("Virheellinen kertomiskomento: "+komento);
		}
		return muistikartta;
		
		
		
		
		
		
		
		
		
		
		
	}	
public static HashMap <String, Object> jaa(String [] nykyKomennonSanat,String komento,HashMap <String, Object> muistikartta) {
		
		switch(nykyKomennonSanat[1]){
		
		
		
			case "lukua":
				Integer lisättäväksiluku = null;
				if(muistikartta.containsKey("luku "+nykyKomennonSanat[2])) {
					lisättäväksiluku=(Integer)muistikartta.get("luku "+nykyKomennonSanat[2]);
				}else {
					System.out.println("Lukua "+nykyKomennonSanat[2]+" ei ole olemassa. Virhellinen komento: "+komento);
				}
				switch(nykyKomennonSanat[3]){
					case "luvulla":
						if(muistikartta.containsKey("luku "+nykyKomennonSanat[4])) {
						Integer lisäysluku=(Integer)muistikartta.get("luku "+nykyKomennonSanat[4]);
						muistikartta.put("luku "+nykyKomennonSanat[2], lisättäväksiluku/lisäysluku);
						}else {
							System.out.println("Lukua "+nykyKomennonSanat[4]+" ei ole olemassa. Virhellinen komento: "+komento);
						}
						
						
					break;
					case "liukuluvulla":
						System.out.println("Ei voida jakaa lukua liukuluvulla. Virhellinen komento: "+komento);
					break;
					case "tekstillä":
						System.out.println("Ei voida jakaa lukua tekstillä. Virhellinen komento: "+komento);
					break;
				
				}
				
			break;
			
			
			
			
			
			
			
			case "liukulukua":
				Double lisättäväksiliukuluku = null;
				if(muistikartta.containsKey("liukuluku "+nykyKomennonSanat[2])) {
					lisättäväksiliukuluku =(Double)muistikartta.get("liukuluku "+nykyKomennonSanat[2]);
				}else {
					System.out.println("Liukulukua "+nykyKomennonSanat[2]+" ei ole olemassa. Virhellinen komento: "+komento);
				}					
				
				switch(nykyKomennonSanat[3]){
					case "luvulla":
						if(muistikartta.containsKey("luku "+nykyKomennonSanat[4])) {
						Integer lisäysluku=(Integer)muistikartta.get("luku "+nykyKomennonSanat[4]);
						muistikartta.put("liukuluku "+nykyKomennonSanat[2], lisättäväksiliukuluku/lisäysluku);
						}else {
							System.out.println("Lukua "+nykyKomennonSanat[4]+" ei ole olemassa. Virhellinen komento: "+komento);
						}							
						
					break;
					case "liukuluvulla":
						if(muistikartta.containsKey("liukuluku "+nykyKomennonSanat[4])) {
						Double lisäysliukuluku=(Double)muistikartta.get("liukuluku "+nykyKomennonSanat[4]);
						muistikartta.put("liukuluku "+nykyKomennonSanat[2], lisättäväksiliukuluku/lisäysliukuluku);
						}else {
							System.out.println("Lukua "+nykyKomennonSanat[4]+" ei ole olemassa. Virhellinen komento: "+komento);
						}								
						
						
						
					break;
					case "tekstillä":
						System.out.println("Ei voida jakaa liukulukua tekstillä. Virhellinen komento: "+komento);
					break;					
				
				}
				
				
			break;
			
			
			
			
			
			
			
			case "tekstiä":
				System.out.println("Ei voida jakaa tekstiä. Virheellinen komento: "+komento);
			break;

			
			
			default: System.out.println("Virheellinen jakamiskomento: "+komento);
		}
		return muistikartta;
		
		
		
		
		
		
		
		
		
		
		
	}	
	
public static HashMap <String, Object> jakojäännä(String [] nykyKomennonSanat,String komento,HashMap <String, Object> muistikartta) {
	
	switch(nykyKomennonSanat[1]){
	
	
	
		case "lukua":
			Integer lisättäväksiluku = null;
			if(muistikartta.containsKey("luku "+nykyKomennonSanat[2])) {
				lisättäväksiluku=(Integer)muistikartta.get("luku "+nykyKomennonSanat[2]);
			}else {
				System.out.println("Lukua "+nykyKomennonSanat[2]+" ei ole olemassa. Virhellinen komento: "+komento);
			}
			switch(nykyKomennonSanat[3]){
				case "luvulla":
					if(muistikartta.containsKey("luku "+nykyKomennonSanat[4])) {
					Integer lisäysluku=(Integer)muistikartta.get("luku "+nykyKomennonSanat[4]);
					muistikartta.put("luku "+nykyKomennonSanat[2], lisättäväksiluku%lisäysluku);
					}else {
						System.out.println("Lukua "+nykyKomennonSanat[4]+" ei ole olemassa. Virhellinen komento: "+komento);
					}
					
					
				break;
				case "liukuluvulla":
					System.out.println("Ei voida jakaa lukua liukuluvulla. Virhellinen komento: "+komento);
				break;
				case "tekstillä":
					System.out.println("Ei voida jakaa lukua tekstillä. Virhellinen komento: "+komento);
				break;
			
			}
			
		break;
		
		
		
		
		
		
		
		case "liukulukua":
			Double lisättäväksiliukuluku = null;
			if(muistikartta.containsKey("liukuluku "+nykyKomennonSanat[2])) {
				lisättäväksiliukuluku =(Double)muistikartta.get("liukuluku "+nykyKomennonSanat[2]);
			}else {
				System.out.println("Liukulukua "+nykyKomennonSanat[2]+" ei ole olemassa. Virhellinen komento: "+komento);
			}					
			
			switch(nykyKomennonSanat[3]){
				case "luvulla":
					if(muistikartta.containsKey("luku "+nykyKomennonSanat[4])) {
					Integer lisäysluku=(Integer)muistikartta.get("luku "+nykyKomennonSanat[4]);
					muistikartta.put("liukuluku "+nykyKomennonSanat[2], lisättäväksiliukuluku%lisäysluku);
					}else {
						System.out.println("Lukua "+nykyKomennonSanat[4]+" ei ole olemassa. Virhellinen komento: "+komento);
					}							
					
				break;
				case "liukuluvulla":
					if(muistikartta.containsKey("liukuluku "+nykyKomennonSanat[4])) {
					Double lisäysliukuluku=(Double)muistikartta.get("liukuluku "+nykyKomennonSanat[4]);
					muistikartta.put("liukuluku "+nykyKomennonSanat[2], lisättäväksiliukuluku%lisäysliukuluku);
					}else {
						System.out.println("Lukua "+nykyKomennonSanat[4]+" ei ole olemassa. Virhellinen komento: "+komento);
					}								
					
					
					
				break;
				case "tekstillä":
					System.out.println("Ei voida jakojäännöstää liukulukua tekstillä. Virhellinen komento: "+komento);
				break;					
			
			}
			
			
		break;
		
		
		
		
		
		
		
		case "tekstiä":
			System.out.println("Ei voida jakojäännöstää tekstiä. Virheellinen komento: "+komento);
		break;

		
		
		default: System.out.println("Virheellinen jakojäännöskomento: "+komento);
	}
	return muistikartta;
	
	
	
	
	
	
	
	
	
	
	
}		
	
	
	

}
