public class RhombusPattern {

	public static void main(String[] args ) {

		int number = 7;
		
		for(int count = 0; count < number ; count++) {

			for(int counter = count ; counter < number ; counter++) {
				System.out.print(" ");
			}

			for(int counter = 1; counter < count ; counter++){
				System.out.print(count + 1 - counter);
			}
			for(int counter = 0 ; counter < count ; counter++){
				System.out.print(counter + 1);
			}
		
			System.out.println();
		}
			
		for(int counts = 0; counts < number; counts++) {
		
			for(int counter = 0; counter < counts; counter++) {
				System.out.print(" ");
			}			
				for(int counter = counts; counter < number; counter++) {
					System.out.print((counter + number - counter) - counter);
				}

				for(int counter = 2 ; counter < 2 + ((number-1) - counts); counter++){
					System.out.print(counter);
				}	

				System.out.println();		
			}


	}
}