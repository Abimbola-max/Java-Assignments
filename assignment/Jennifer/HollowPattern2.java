public class HollowPattern2 {

	public static void main(String[] args) {
	
		for(int rows = 0; rows < 5 ; rows++) {

			for (int count = 1; count <= 5 - rows; count++) {
		
				System.out.print(" ");
			}
			int number = 1;

			for (int numbers = 0; numbers <= rows; numbers++) {
				System.out.print(number + " ");

				number = number * (rows - numbers)/(numbers + 1);
			}
	
			System.out.println();
		}
	}
}
	
			

			