import java.util.Scanner;

public class CourseAndGrade {

	public static void main(String... args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter your department: \n1. Math\n2. Science\n3. History\n>>>");
		int department = input.nextInt();

		System.out.println("Enter your grade level: \n1. Freshman\n2. Sophomore\n3. Junior\n4. Senior\n>>>");
		int gradeLevel = input.nextInt();
		
		switch (gradeLevel) {
			case 1:
				System.out.print("Fresherman\npress any from(1-4) to see your instructor"); 
			int instructor = input.nextInt();

				switch (instructor) { 
					case 1:
						System.out.print("Your instructor is Mr Tayo"); break;
					case 2:
						System.out.print("Your instructor is Mr ayo"); break;
					case 3:
						System.out.print("Your instructor is Mr bayo"); break;
					case 4:
						System.out.print("Your instructor is Mr tunde"); break;

			}break;


			case 2: 	
				System.out.print("press any key from(1-4) to see your instructor"); 
			int instructor1 = input.nextInt();
			
				switch (instructor1) { 
				case 1:
					System.out.print("Your instructor is Mr taye"); break;
				case 2:
					System.out.print("Your instructor is Mrs bola"); break;
				case 3:
					System.out.print("Your instructor is Miss banke"); break;
				case 4:
					System.out.print("Your instructor is Mr fola"); break;
				}break;
				
			case 3: 	
				System.out.print("press any key from(1-4) to see your instructor"); 
				int instructor2 = input.nextInt();
			
				switch (instructor2) { 
					case 1:
						System.out.print("Your instructor is Mr dayo"); break;
					case 2:
						System.out.print("Your instructor is Mrs fade"); break;
					case 3:
						System.out.print("Your instructor is Miss kiki"); break;
					case 4:
						System.out.print("Your instructor is Mr folabi"); break;
				}break;
			

			case 4: 	
				System.out.print("press any key from(1-4) to see your instructor"); 
				int instructor3 = input.nextInt();
			
				switch (instructor3) { 
					case 1:
						System.out.print("Your instructor is Mr gaffy"); break;
					case 2:
						System.out.print("Your instructor is Mrs fikin"); break;
					case 3:
						System.out.print("Your instructor is Miss lola"); break;
					case 4:
						System.out.print("Your instructor is Mr bode"); break;
			}break;

			}
		}
				

}




