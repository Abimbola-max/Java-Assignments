public class NumberDiamondPatterns {
	public static void main(String[] args ){
		
		for(int value1 = 0 ; value1 < 5 ; value1++){
			for(int space = value1 ; space < 5 ; space++){
				System.out.print(" ");
			}

			for(int number1 = 1 ; number1 < value1 ; number1++){
				System.out.print(value1+1-number1);
			}
			for(int number2 = 0 ; number2 < value1 ; number2++){
				System.out.print(number2+1);
			}
		
			System.out.println();
		
		}
		
		for(int value2 = 0; value2 < 5 ; value2++){
		
				for(int basespace = 0 ; basespace < value2 ; basespace++){
				System.out.print(" ");
				}			
				for(int basenumber = value2 ; basenumber < 5 ;basenumber++){
				System.out.print((basenumber+5-basenumber)-basenumber);
				}
				for(int basenumber2 = 2 ; basenumber2 < 2 +(4 -value2) ;basenumber2++){
				System.out.print(basenumber2);
				}	

				System.out.println();		
			}
			

	}
}