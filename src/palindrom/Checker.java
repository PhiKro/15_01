package palindrom;

public class Checker {

	public static boolean check(String string) {
		if (string.length() <= 1) 
		{
			return true;
		}
		string = string.toLowerCase();
		if (Character.isLetter(string.charAt(0)) == false) 
		{
			return check(string.substring(1, string.length()));
		} 
		else if (Character.isLetter(string.charAt(string.length() - 1)) == false) 
		{
			return check(string.substring(0, string.length() - 1));
		} 
		else if (string.charAt(0) == string.charAt(string.length() - 1)) 
		{
			return check(string.substring(1, string.length() - 1));
		}
		return false;
	}

}
