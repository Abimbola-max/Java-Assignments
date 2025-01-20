public class EvenAndOddNumbers {

	public static void main(String[] args) {
		
		int number = 87;

		boolean isEven = isEven(number); 

		if (isEven) {
			System.out.println(number + " is even.");
		} else { 
			System.out.println(number + " is odd.");
        	}
	}

	public static boolean isEven(int number) {
  
		if (number % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
}