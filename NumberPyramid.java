public class NumberPyramid {

    public static void main(String[] args) {

        int rows = 7;

        for (int i = 1; i <= rows; i += 2) {
                for (int j = rows; j > i; j -= 2) {
                System.out.print(" ");
            }
                        for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }
            
            System.out.println();
        }
    }
}