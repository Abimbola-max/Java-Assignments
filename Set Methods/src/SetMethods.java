import java.util.Arrays;
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

    public Set<Integer> addAllElementsToSet(int integers) {
        numbers.addAll(Arrays.asList(integers));
        return numbers;
    }

}