public class HollowPattern1 {

	public static void main(String[] args) {
	
		for(int rows = 1; rows <= 6 ; rows++) {
			
			
			for(int count = 1; count < 6; count++) {
				if(count  == 1 || count == 5){
					System.out.print("*");
				}
				else if(rows == 1 || rows == 6){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}

						
			System.out.println();
		}
	}
}