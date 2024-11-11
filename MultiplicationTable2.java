public class MultiplicationTable2 {

   public static void main(String... args) {
	int count = 1;
	

	do {
	int number = 1;	
	do {
 	System.out.print(number + " * " + count + " = ");
	System.out.printf("%2d\t", number * count);
	number++;
	} while (number < 10); 
	

	System.out.println();
	count ++;

	} while (count < 10);
	


   }
} 