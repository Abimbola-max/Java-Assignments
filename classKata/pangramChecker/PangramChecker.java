public class PangramChecker {

	public static boolean isLetterPresent(String words) {

		boolean isPresent = false;
		boolean allPresent = true;

		int length = words.length();
		if (length < 26) return false;		

		for(char letter = 'a'; letter <= 'z'; letter++) {
			for( int index = 0; index < words.length(); index++) {
				if (letter == words.toLowerCase().charAt(index)) {
					isPresent = true;
					break;
				} 
			}

			if (!isPresent) {
				allPresent = false;
				break;
			}

		} isPresent = false;

		return allPresent;
		
	}

}



	


