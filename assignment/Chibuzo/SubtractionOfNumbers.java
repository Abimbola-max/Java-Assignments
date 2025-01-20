public class SubtractionOfNumbers {

	public static void main(String[] args) {

		int numberOne = 13;
		int numberTwo = 27;
	
		int answer = subtractNumber(numberOne, numberTwo);

		System.out.println("The difference between both numbers is: " + answer);

	}



	public static int subtractNumber(int numberOne, int numberTwo) {

		int answer;

		if (numberOne > numberTwo) {
			answer = numberOne - numberTwo;
		} else {
			answer = numberTwo - numberOne;
		}
	return answer;

	}

}