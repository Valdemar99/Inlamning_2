
import java.util.Scanner;

/**
 * Det här programmet jämför tal, som användaren matar in.
 * Den jämför tills 0 matas in, varefter programmet tackar för sig och avslutar.
 * @author Administrator
 *
 */

public class Inlämning2a {

	public static void main(String[] args) {
		//Skapar variabler och scanner och rullningsnummer
		int x, y;
		Scanner inläs = new Scanner(System.in);
		
		while (true) {
			//Samlar in värde:
			System.out.println("Skriv in ett heltal.");
			x = inläs.nextInt();
			
			//Nollbrytning - om någon av talen är 0 avbryts slingan.
			if (x == 0) {
				break;
			}
			
			System.out.println("Skriv in ännu ett heltal.");
			y = inläs.nextInt();
			
			
			
			if (x>y) { //Ifall x är störst, skrivs detta ut.
				System.out.println(x + " är större än " + y + ".");
			}
			else if (x==y){ //Ifall de är lika
				System.out.println("Talen är lika.");
			}
			else { //Ifall x är mindre
				System.out.println(x + " är mindre än " + y + ".");
			}
		}
		
		//Avslutning
		System.out.println("Tack.");
		
		//Stänger av scannern
		inläs.close();

	}

}
