public class LargestElementInList {

    public static void main(String[] args) {
        int[] numbers = {12, 45, 89, 100, 41, 76, 65, 78, 34, 200, 400};
        int largest = largestNumber(numbers);
	System.out.printf("The largest element in the array is %d%n ", largest);
    } 


	public static int largestNumber(int[] numbers) {

        	int largest = numbers[0];

        	for (int count = 1; count < numbers.length; count++) {
            		if (numbers[count] > largest) {
                		largest = numbers[count]; 
            		}
        	}

        	
        return largest;

    	}
   
}