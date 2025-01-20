public class Patternss {
 
   public static void main(String... args) {

	System.out.println("Pattern A");
	for (int a = 1; a <= 6; a++) {
		for (int b = 1; b <= a; b++) {
			System.out.print("*");
		} System.out.println();
	} 
	 System.out.println();

	System.out.println("Pattern B");
	for (int x = 1; x <=6; x++) {
		for (int y = 6; y >=x; y--) {
		    System.out.print("*");
		} System.out.println();
	}	
	  System.out.println();


	System.out.println("Pattern C");
	for (int m = 1; m <=6; m++) {
		for (int z = 1; z <= 7 - m; z++) {
			System.out.print(" ");
		}
		for(int n = 1; n <= m; n++) {
		   System.out.print("*");
		} System.out.println();
	} 
	  System.out.println();

	System.out.println("Pattern D");
	for (int c = 1; c <=6; c++) {
		for (int k = 1; k>= c - 7; k--) {
		   System.out.print(" ");
		}
		for(int i= 1; i <= 6; i++); {
		   System.out.print("*");
	  	System.out.println();

		}
	}
	  System.out.println(); 
  }	

}