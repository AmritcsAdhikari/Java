
//Check if a string is palindrome 
public class ClassA {
	
	public boolean palindrome(String str) {
		
		
		String str1 = str.replaceAll("\\s", ""); // replaces all the whitespace with
		
		String str2 = str1.toUpperCase(); // can do toLowerCase as well
	
		char [] charArr = str2.toCharArray(); // change String to a char array so that we can manipulate it using index.
	
		int len = str2.length();
		
		for ( int i = 0; i < len/2; i++) {
			
			if(charArr[i] == charArr[len-i-1] ) {
				return true;
			}
		}
		
		return false;
	}
	
	
	public static void main(String[] args) {

	
		ClassA obj = new ClassA();
		
		boolean value = obj.palindrome("      Rats live On no Evil sTar  ");
		
		if(value == true) {
			
			System.out.println("It is palindrome");
		}
		else {
			
			System.out.println("it is not a palindrome");
		}
		
		
		
	}
		

}
