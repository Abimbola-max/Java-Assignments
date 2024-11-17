public class MinimumAndMaximumArray {

	public static void main(String[] args) {

		int[] arr = {54, 87, 12, 67, 90, 31, 45, 35};

		int max =0;
		int min = 0;
		int number = 0;

		for (int count = 0; count < arr.length; count++) {
			number = arr[count];
            		if (number > max) {
               		 max = number;
			} else {
               		 min = number;
			}
		}  System.out.println("The minimum is: " + min);
		   System.out.println("The maximum is: " + max);

	}
}