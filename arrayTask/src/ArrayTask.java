public class ArrayTask {

    public int[][] replaceXwithOneThenOWithZero(char[][] characters) {
        int rows = characters.length;
        int columns = characters.length;

        int[][] result = new int[rows][columns];

        for (int index = 0; index < rows; index++) {
            for (int counter = 0; counter < columns; counter++) {
                if (characters[index][counter] == 'x') {
                    result[index][counter] = 1;
                }
                else if (characters[index][counter] == 'o') {
                    result[index][counter] = 0;
                }
            }
        }
        return result;
    }
}
