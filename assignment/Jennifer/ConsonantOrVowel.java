import java.util.Scanner;

public class ConsonantOrVowel {

    public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter a single character from the alphabet: ");
	String letter = input.next();

	if (letter.length() > 1) System.out.println("Error - Length is longer");


	char characterToCheck = letter.charAt(0);

	if (!Character.isLetter(characterToCheck)) {
	          System.out.print("Error - Enter a letter");
	return;
	}



if (characterToCheck == 'a' || characterToCheck =='e' ||
characterToCheck =='i' || characterToCheck =='o' || characterToCheck =='u') System.out.println(characterToCheck + " is a vowel");

		else
		 System.out.println(characterToCheck + " is a consonant");

	        

	}


}
