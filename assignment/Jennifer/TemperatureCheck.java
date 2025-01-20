import java.util.Scanner;

public class TemperatureCheck {

	public static void main(String... args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter temperature in celsius: ");
		int celsiusTemperature = input.nextInt();

		if (celsiusTemperature <= 10) {
			System.out.print("cold");
		} else if (celsiusTemperature >=  10 && celsiusTemperature <= 25) {
			System.out.print("warm");
		} else {
			System.out.print("hot");
		}
	}
}


