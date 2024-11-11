import java.util.Scanner;

  public class EvenOrOdd {

    public static void main(String...args) {

	Scanner task = new Scanner(System.in);

	System.out.print("Enter a number: ");
	int number = task.nextInt();

	if (number % 2 == 0){
	System.out.print("1");
	}
	if (number % 2 != 0) {
	System.out.print("0");
	}


}
}