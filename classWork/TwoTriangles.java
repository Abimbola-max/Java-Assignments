public class TwoTriangles {

	public static void main(String... args) {

		printTheTwoTriangle(8);		

	
	}


	public static void printStar() {
		System.out.print("* ");
	}

	public static void printNewLine() {
		System.out.println();
		
	}

	public static void printStar(int numberOfTimes) {
		for(int count = 0; count < numberOfTimes; count++) {
			printStar();	
		}
	}

	public static void printUpperTriangle(int numberOfTimes) {
		for(int count = 1; count <= numberOfTimes; count++) {
			printStar(count);
			printNewLine();
		}
		
	}

	public static void printLowerTriangle(int numberOfTimes) {
		for(int count = numberOfTimes; count >= 1; count--) {
			printStar(count);
			printNewLine();
		}
		
	}
	
	public static void printTheTwoTriangle(int length) {
		printUpperTriangle(length);	
		printLowerTriangle(length);
		
	}

}