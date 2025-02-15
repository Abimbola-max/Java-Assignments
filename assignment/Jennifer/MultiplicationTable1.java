public class MultiplicationTable1 {

   public static void main(String... args) {

	int count = 1;

	while (count < 10) {

		int number = 1;
		while (number < 10) {
		   System.out.print(number + " * " + count + " = ");
		   System.out.printf("%2d\t", number * count);
		number++;

		} 
		  System.out.println();
		  count++;
		} 
	}
  }