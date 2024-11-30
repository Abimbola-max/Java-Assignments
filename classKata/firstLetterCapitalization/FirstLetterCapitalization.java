/**write a function that takes a sentence as argument and capitalizes the first letter of every word in the sentence. Sample:
input: All is weel that ends well
output: All Is Well That Ends Well
*/


public class FirstLetterCapitalization {
	
	public static String firstLetter(String givenString) {
		
		String[] arr = givenString.split(" ");
    StringBuffer sb = new StringBuffer();

    for (int i = 0; i < arr.length; i++) {
        sb.append(Character.toUpperCase(arr[i].charAt(0)))
            .append(arr[i].substring(1)).append(" ");
    }          
    	return sb.toString().trim();
	}  
	
	
	public static void main(String[] args) {
		String words = "all is well with me";
	System.out.println(firstLetter(words));
	

	}


}