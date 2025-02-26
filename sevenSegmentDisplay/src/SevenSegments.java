public class SevenSegments {

    String[][] board = {
            {" ", " ", " ", " "},
            {" ", " ", " ", " "},
            {" ", " ", " ", " "},
            {" ", " ", " ", " "},
            {" ", " ", " ", " "}
    };

    private String input;
    private boolean lightState;

    public SevenSegments(String input) {
        validateInput(input);
        validateLength(input);
        this.input = input;
        this.lightState = false;
    }

    public boolean isOff() {
        return lightState;
    }

    public boolean isOn() {
        return !lightState;
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
        return input;

    }


    public String[][] printHorizontalHash() {
        String[][] horizontalHash = {{" ", " ", " ", " "}};
        if (input.charAt(0) == '1') {
            horizontalHash = new String{"#"};
            horizontalHash[1] = new String[]{"#"};
            horizontalHash[2] = "#";
            horizontalHash[3] = "#";
        }
        return horizontalHash;
    }
}
