package vererbung;

public class customer extends Person // Customer is-a Person. Erbt die Eigenschaften der Klasse Person
	{
	public int ID;
	public boolean mvc;

	public customer(String firstname, String lastname, int id, boolean mvc) 
	{
		super(firstname, lastname); // Läd den Constructor der zu erweiternden Klasse. Notwendig wenn die basisklasse einen Konstruktor hat.
		this.ID=id;
		this.mvc=mvc;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public boolean isMvc() {
		return mvc;
	}

	public void setMvc(boolean mvc) {
		this.mvc = mvc;
	}
	
	@Override // deutet an das eine Methode aus der Basisklasse überschrieben wird. 
	public String getLastname() // Customer.getLastname wird etwas anderes liefern als Person.getLastname
	{
		return "....."; // der neue Rückgabestring
	}
}
