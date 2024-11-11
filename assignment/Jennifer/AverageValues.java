public class AverageValues {
	
	public static void main(String[] args) {

		int [] arr = {23, 56, 31, 76, 23, 87};

		double sum = 0;

		for (int count = 0; count < arr.length; count++) {
			sum += arr[count];
		}
			double average = sum / 6;
		
			System.out.printf("The average is of the numbers is %.2f", average);
	}
	
}