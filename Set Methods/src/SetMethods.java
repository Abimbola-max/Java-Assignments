import java.util.HashSet;
import java.util.Set;

public class SetMethods {

    Set<Integer> numbers = new HashSet<>();

    public boolean isEmpty() {
        return numbers.isEmpty();
    }

    public int addElementsToSet(int number) {
        numbers.add(number);
        return number;
    }

    public int[] addAllElementsToSet(int number1, int number2) {
        numbers.addAll(number1, number2);
        return numbers;
        
    }
}