import java.util.Random;
import java.util.Scanner;

public class MathQuiz {
    static int firstNumber;
    static int secondNumber;
    static int answer;
    static int passes;
    static int fails;
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        generateNumbers();
    }

    public static void generateNumbers() {

        char[] symbols = {'-', '+', '*'};

        for (int count = 1; count <= 5; count++) {
            Random random = new Random();
            char symbol = symbols[random.nextInt(symbols.length)];

            firstNumber = (int) (Math.random() * 21);
            secondNumber = (int) (Math.random() * 21);

            switch (symbol) {
                case '+':
                    answer = firstNumber + secondNumber;
                    break;
                case '-':
                    answer = firstNumber - secondNumber;
                    break;
                case '*':
                    answer = firstNumber * secondNumber;
                    break;
                default:
                    answer = 0;
                    break;
            }

            System.out.println(firstNumber + " " + symbol + " " + secondNumber + " = ?");

            try {
                int response = input.nextInt();

                if (response == answer) {
                    System.out.println("You are correct!");
                    passes++;
                } else {
                    System.out.println("Your answer is wrong. The correct answer is " + answer);
                    fails++;
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer.");
                input.nextLine();
            }
        }
        System.out.println("You failed" + " " + fails);
        System.out.println("You passed " + passes);

    }
}