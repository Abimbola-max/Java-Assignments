public class SevenSegments {

    String[][] board = {
            {" ", " ", " ", " "},
            {" ", " ", " ", " "},
            {" ", " ", " ", " "},
            {" ", " ", " ", " "},
            {" ", " ", " ", " "}
    };

    private String input;

    public SevenSegments(String input) {
        validateInput(input);
        validateLength(input);
        this.input = input;
    }

    private void validateInput(String input) {
        for (int check = 0; check < input.length(); check++) {
            if (input.charAt(check) != '0' && input.charAt(check) != '1') {
                throw new IllegalArgumentException("Invalid Input: Only 0s and 1s are allowed.");
            }
        }
    }

    private void validateLength(String input) {
        if (input.length() != 8) {
            throw new IllegalArgumentException("The length of your input should be exactly eight");
        }
    }

    public String toString() {
        if (input.charAt(input.length() - 1) == '0') return "";
        return "SevenSegments{" +
                "input='" + input + '\'' +
                '}';

    }


}
