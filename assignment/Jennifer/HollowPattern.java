public class HollowPattern {

	public static void main(String[] args) {
	
	int number = 5;
	
	for (int count = 1; count <= number; count++) {
		for (int counter = 1; counter < count; counter++) {
			if (count == number || counter == 1)
				System.out.print("* ");
			else 
				System.out.print(" ");
		}
		for (int counter = 1; counter <= count; counter++) {
			if (count == number || counter == count)
				System.out.print("* ");
			else 
				System.out.print(" ");
		} System.out.println();
	}

	}
   } 
