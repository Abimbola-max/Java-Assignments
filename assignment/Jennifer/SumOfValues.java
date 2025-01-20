public class SumOfValues {
	
	public static void main(String[] args) {

		int[] arr = {23, 56, 31, 76, 23, 87};

		int sum = 0;

		for (int count = 0; count < arr.length; count++) {
			sum += arr[count];
		}
			System.out.print("The sum is " + sum);	
	}
	
}

