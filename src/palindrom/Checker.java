package palindrom;

public class Checker {

	public static boolean check(String string) {
		if (string.length() <= 1) // Prüft ob nur noch der mittlere oder kein Buchstabe mehr übrig bleibt. (Palindrom gefunden)
		{
			return true;
		}
		string = string.toLowerCase(); //wandeld den String in Kleinbuchstaben um 
		if (Character.isLetter(string.charAt(0)) == false)  // Prüft ob das Zeichen an der ersten Stelle kein Buchstabe ist.
		{
			return check(string.substring(1, string.length())); // schneidet den ersten Buchstaben ab und ruft sich selbst mit dem Verkürzten String neu auf.
		} 
		else if (Character.isLetter(string.charAt(string.length() - 1)) == false) // Prüft ob das Zeichen an der letzten Stelle kein Buchstabe ist.
		{
			return check(string.substring(0, string.length() - 1));// schneidet den letzten Buchstaben ab und ruft sich selbst mit dem Verkürzten String neu auf.
		} 
		else if (string.charAt(0) == string.charAt(string.length() - 1)) // Prüft ob das erste und letzte Zeichen des Strings gleich sind.
		{
			return check(string.substring(1, string.length() - 1)); //schneidet die als gleich gefundenen Zeichen am Anfang und Ende ab und ruft sich selbst mit dem verkürzten String auf. 
		}
		return false; //für den Fall das nichts zutrifft 
	}

}
