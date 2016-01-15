package palindrom;

public class Checker {

	public static boolean check(String string) {
		if (string.length() <= 1) // Pr�ft ob nur noch der mittlere oder kein Buchstabe mehr �brig bleibt. (Palindrom gefunden)
		{
			return true;
		}
		string = string.toLowerCase(); //wandeld den String in Kleinbuchstaben um 
		if (Character.isLetter(string.charAt(0)) == false)  // Pr�ft ob das Zeichen an der ersten Stelle kein Buchstabe ist.
		{
			return check(string.substring(1, string.length())); // schneidet den ersten Buchstaben ab und ruft sich selbst mit dem Verk�rzten String neu auf.
		} 
		else if (Character.isLetter(string.charAt(string.length() - 1)) == false) // Pr�ft ob das Zeichen an der letzten Stelle kein Buchstabe ist.
		{
			return check(string.substring(0, string.length() - 1));// schneidet den letzten Buchstaben ab und ruft sich selbst mit dem Verk�rzten String neu auf.
		} 
		else if (string.charAt(0) == string.charAt(string.length() - 1)) // Pr�ft ob das erste und letzte Zeichen des Strings gleich sind.
		{
			return check(string.substring(1, string.length() - 1)); //schneidet die als gleich gefundenen Zeichen am Anfang und Ende ab und ruft sich selbst mit dem verk�rzten String auf. 
		}
		return false; //f�r den Fall das nichts zutrifft 
	}

}
