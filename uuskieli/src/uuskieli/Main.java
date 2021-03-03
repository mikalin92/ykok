package uuskieli;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		juokse();
	}
	
	
	
	public static void juokse() {
		Scanner lukija=new Scanner(System.in);
		String sisääntulo;
		do{ System.out.print("YK-OK>");
			sisääntulo=lukija.nextLine();
			Käskyttäjä.lue(sisääntulo);
		}
		while(!sisääntulo.equals("sulje"));
		lukija.close();
	}
	
	
	
	

}
