import java.util.Date;
import java.util.Scanner;
  
  public class DaysInAMonth {

    public static void main(String...args) {

	Scanner input = new Scanner(System.in);
	

	System.out.print("Enter a month number: ");
	int month = input.nextInt();

	System.out.print("Enter year: ");
	int year = input.nextInt();

	int number = month;
	
	   if (number == 1){
	     System.out.printf("January has %d 31days", year); }
	   else if(number == 2){
	     System.out.printf("february has %d 29days", year);}
	   else if(number == 3){
	     System.out.printf("march has %d 31days", year);}
	   else if(number == 4){
	     System.out.printf("april has %d 31days", year);}
	   else if (number == 5){
	     System.out.printf("may has %d 31days", year);}
	   else if (number == 6){
	     System.out.printf("june has %d 30days", year);}
	   else if (number == 7){
	     System.out.printf("july has %d 31days", year);}
	   else if (number == 8){
	     System.out.printf("august has %d 30days", year);}
	   else if (number == 9){
	     System.out.printf("september has %d 31days", year);}
	   else if (number == 10){
	     System.out.printf("october has %d 31days", year);}
	   else if (number == 11){
	     System.out.printf("november has %d 31days", year);}
	   else if (number == 12){
	     System.out.printf("december has %d 31days", year);}
	   
}
	}


