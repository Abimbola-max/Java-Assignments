package ccv;

import java.util.Scanner;

public class CreditCardValidation {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            boolean validatorCheck = true;
            while (validatorCheck) {
                try {
                    System.out.print("Enter a credit card number: ");
                    String cardNumber = input.nextLine();

                    checkValidity(cardNumber);
                    cardPrefixChecker(cardNumber);
                    validatorCheck = false;
                } catch (Exception e) {
                    System.out.println("Error.");
                }
            }
        }

        public static void cardPrefixChecker(String cardNumber) {
            System.out.println("**************************************");
            if (cardNumber.startsWith("4")) {
                if (cardNumber.length() < 13 || cardNumber.length() > 16) {
                    System.out.println("Too much or Too low");
                } else {
                    System.out.println("Credit Card Type: Visa");
                }
            } else if (cardNumber.startsWith("37")) {
                if (cardNumber.length() < 13 || cardNumber.length() > 16) {
                    System.out.println("Too much or Too low");
                } else {
                    
                    System.out.println("Credit Card Type: American Express");
                }
            } else if (cardNumber.startsWith("5")) {
                if (cardNumber.length() < 13 || cardNumber.length() > 16) {
                    System.out.println("Too much or Too low");
                } else {
                    System.out.println("Credit Card Type: Master card");
                }
            } else if (cardNumber.startsWith("6")) {
                if (cardNumber.length() < 13 || cardNumber.length() > 16) {
                    System.out.println("Too much or Too low");
                } else {
                    System.out.println("Credit Card Type: Discover card");
                }
            } else if (isVerveCard(cardNumber)) {
                System.out.println("Credit Card Type: Verve");
            } else {
                System.out.println("Invalid details");
            }

        }


        public static boolean checkValidity(String cardNumber) {
            if (isValid(cardNumber)) {
                System.out.println("**************************************");
                System.out.println("Credit card validity Status: Valid");
                System.out.println("Credit Card Number: " + cardNumber);
                System.out.println("Credit Card Digit Length: " + cardNumber.length());
                System.out.println("**************************************");
                return isValid(cardNumber);
            } else {
                System.out.println("Credit card validity Status: Invalid");
                return false;
            }

        }


        public static boolean isValid(String cardNumber) {
            if (!(cardNumber.length() >= 13 && cardNumber.length() <= 16)) {
                return false;
            }
            int evenSum = sumOfDoubleEvenPlace(cardNumber);
            int oddSum = sumOfOddPlace(cardNumber);
            return (evenSum + oddSum) % 10 == 0;
        }


        public static int sumOfDoubleEvenPlace(String cardNumber) {
            int sum = 0;
            for (int countForEven = cardNumber.length() - 2; countForEven >= 0; countForEven -= 2) {
                int digit = Integer.parseInt(cardNumber.substring(countForEven, countForEven + 1));
                int doubledDigit = digit * 2;
                sum += getDigit(doubledDigit);
            }
            return sum;
        }


        public static int getDigit(int number) {
            if (number > 9) {
                return (number - 9);
            } else {
                return number;
            }
        }


        public static int sumOfOddPlace(String cardNumber) {
            int sum = 0;
            for (int countForOdd = cardNumber.length() - 1; countForOdd >= 0; countForOdd -= 2) {
                sum += Integer.parseInt(cardNumber.substring(countForOdd, countForOdd + 1));
            }
            return sum;
        }


        public static boolean isVerveCard(String cardNumber) {
            return (cardNumber.length() <= 19 &&
                    cardNumber.startsWith("506099") ||
                    cardNumber.startsWith("50610") ||
                    cardNumber.startsWith("50611") ||
                    cardNumber.startsWith("50612") ||
                    cardNumber.startsWith("50613") ||
                    cardNumber.startsWith("50614") ||
                    cardNumber.startsWith("50615") ||
                    cardNumber.startsWith("50616") ||
                    cardNumber.startsWith("50617") ||
                    cardNumber.startsWith("50618") ||
                    cardNumber.startsWith("506199"));
        }
    }
