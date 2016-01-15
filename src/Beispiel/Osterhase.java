package Beispiel;

public class Osterhase extends Hase{

	public Osterhase(String name) {
		super(name);}
	
	public void eierVerteilen() 
	{
		System.out.println(name+ " verteilt Ostereier");
	}
	
	@Override
	public void hoppeln() {
	System.out.println(name + "hoppelt durch das grüne Gras.");
	}
}
