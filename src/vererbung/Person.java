package vererbung;

public class Person {
	String firstname; 		 // Package access, alle Klassen im Paket haben Zugriff 
	private String lastname; // nur Getter und Setter verwendbar 
	//protected 				Nur innerhalb der Vererbung verwendbar
	//public 					Generell von �berall verwedbar. 
	//final 					Setzt konstante Attribute und Methoden. K�nnen nicht �berschrieben werden.
	
	public Person(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
	}
	
	public String getFirstname() {
		return firstname;
	}
	
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	public String getLastname() {
		return lastname;
	}
	
	public void setLastname(String lastname) {
		this.lastname = lastname;
}
}
