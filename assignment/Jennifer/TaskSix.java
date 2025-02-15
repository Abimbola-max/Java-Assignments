public class TaskSix {
	
	public static void main(String[] args) {
		int currentNumber = 0;
		int currentMultiple = 1;

		for(int number=1; number < 11; number++) {
			if(number % 4 == 0) {
	            		for ( int space = 0; space < 5; space++) {
					currentNumber = number;
					currentMultiple = 1 * currentNumber * currentMultiple;
	   				System.out.print(currentMultiple + " ");
	   	    		}
			}
			
			currentMultiple = 1;
		}

     }
}


