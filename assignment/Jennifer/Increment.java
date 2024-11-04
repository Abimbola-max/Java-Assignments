public class Increment {

    public static void main(String[] args) {

        int x = 5; 

        System.out.println("Initial value of x: " + x); 
        
        x += x++; 
        
        System.out.println("Value of x after executing 'x += x++': " + x); 
}
	}