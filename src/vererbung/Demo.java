package vererbung;

public class Demo 
{
	public static void main (String Args[])
	{
		customer Huber =new customer("Antonn", "Huber", 1, true); // Neuer Kunde mit den erweiterten Eigenschaften. 
								// Vorname, Nachname werden �ber den Customer Construktor (super) an die Person weitergereicht
								// Die werte 1 f�r ID und true f�r mvc werden in der Klasse customer gespeichert.
		
		System.out.println(Huber.getLastname()); // Fragt die Eigenschaft Lastname aus der Klasse Person ab. (Vererbt)
		System.out.println(Huber.getID()); // Fragt die Kundennummer aus der Klasse Customer ab. (direkt) 
		
		
	}
}
