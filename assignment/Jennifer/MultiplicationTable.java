public class MultiplicationTable {

   public static void main(String[] args) {

	for (int count = 1; count < 10; count++) {
	
		for (int number = 1; number < 10; number++) {

	
			System.out.print(number + " * " + count + " = ");
			System.out.printf("%4d\t", number * count);
		} 
		System.out.println();
	}	

      }
   }