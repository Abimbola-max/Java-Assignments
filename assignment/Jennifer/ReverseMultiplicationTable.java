
public class ReverseMultiplicationTable {

    public static void main(String[] args) {

            int count = 12;

	while (count >= 1) {

		int number = 10;
		while (number >= 1) {
		   System.out.print(number + " * " + count + " = ");
		   System.out.printf("%2d\t", number * count);
		number--;

		} 
		  System.out.println();
		  count--;
		} 
	}
  }