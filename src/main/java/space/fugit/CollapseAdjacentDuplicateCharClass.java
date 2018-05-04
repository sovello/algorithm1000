package space.fugit;

public class CollapseAdjacentDuplicateCharClass {

	public static String getString(String str) {
		if( str.length() == 0) {
			return "Invalid string";
		}
		
		if( str.length() == 1) {
			return str;
		}
		
		StringBuilder string = new StringBuilder();
		int length = str.length();
		string.append(str.charAt(length - 1));
		length = length - 2;
		
		for( int i = length; i >= 0; i--) {
			if( string.charAt(string.length()-1) != str.charAt(i)) {
				string.append(str.charAt(i));
			}
		}
		
		return string.toString();
	}

}
