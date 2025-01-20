public class ContinueLoop {

	public static void main(String[] args) {

		int number = 1;
		
		
		while(number <= 5) {
			 if (number == 5) {
				continue;
			}System.out.print(number + " ");
			number++;
		}
	}
}
