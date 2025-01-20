public class TabularOutput {

	public static void main(String[] args) {

	System.out.println("N\tN2\tN3\tN4");

	for ( int count = 1; count < 6; count++) {
		System.out.println(count+ "\t");
	  } for (int number = 1; number < 6; number++) {
		System.out.println("\t" + number * number);
	   }  for (int counter = 1; counter < 6; counter++) {
		System.out.println("\t" + counter * counter * counter);
		}   for (int numbers = 1; numbers < 6; numbers++) {
		System.out.println("\t" + numbers * numbers * numbers * numbers);
		}
     }
}

