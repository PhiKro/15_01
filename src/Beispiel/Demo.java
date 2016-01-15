package Beispiel;

public class Demo {

	public static void main(String[] args) {

	Weihnachtshase saturn = new Weihnachtshase("Turni"); //Erweiterte Klasse mit geschenkeVerteilen()
	Osterhase hasi = new Osterhase("Hasi"); // Erweiterte Klasse mit eierVerteilen()
	Hase max = new Hase("Maxi"); // Basisklasse 
	
	max.hoppeln();
	saturn.hoppeln();
	hasi.hoppeln();
	
	saturn.geschenkeVerteilen();
	hasi.eierVerteilen();
	max.fressen();
	hasi.fressen();
	
	
	}

}
