public class StringPalindrome {
	
	public static void main(String[] args) {

		String text = "madam";

		boolean isFound = isPalindrome(text);

		System.out.println("Is" + " " +  text + " " + "a palindrome?" + " " + isFound);

	}


	public static Boolean isPalindrome(String text) {
		
		int count = 0;
		int counter = text.length() -1;

		while (count <= text.length() / 2) {
			if (text.charAt(count) != text.charAt(counter)) {
				return false;
			}
			counter -= 1;
			count++;	
		}	
		return true;
		
	}


}