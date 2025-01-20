public class SecondDuplicateValues {

	public static void main(String[] args) {

	int[] firstList = {1, 3, 5, 7, 6, 2, 4, 9};

	int[] secondList = {1, 8, 11, 5, 6, 10, 2, 99};

	
	for (int count = 0; count < firstList.length; count++) {
		for( int counter = 0; counter < secondList.length; counter++)
			if (firstList[count] == secondList[counter]) {
				System.out.print(secondList[counter] + " ");
				break;
			}
	}

		
	}
}