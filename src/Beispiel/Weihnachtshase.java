package Beispiel;

public class Weihnachtshase extends Hase{

	public Weihnachtshase(String name) 
	{
		super(name);
	}

	public void geschenkeVerteilen()
	{
		System.out.println(name + " verteilt die Geschenke");
	}
	@Override
	public void hoppeln() {
		System.out.println(name +" nimmt den Raketenschlitten statt zu hoppeln.");
	}
}
