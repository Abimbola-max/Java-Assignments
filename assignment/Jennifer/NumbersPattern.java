public class NumbersPattern {

    public static void main(String[] args) {

        for (int count = 0; count < 3; count++) { 
            for (int column = 0; column < 3; column++) { 
                int number = count * 3 + column + 1; 
                System.out.print(number + " ");
            }

            System.out.println(); 
        }
    }
}
