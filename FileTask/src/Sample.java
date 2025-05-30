import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class Sample {

    public static void main(String[] args) {

        Comparator<Integer> comparator = (first, second) -> {
            if (first > second) return 1;
            else if (first < second) return -1;
            else return 0;
        };

        System.out.println("The sum is " + IntStream
                .rangeClosed(0, 10)
                .sum());

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(numbers
                .stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n * n)
                .sorted(comparator)
                .toList());

        User user = new User();

        user.setEmail("abimbola@gmail.com");
        user.setFirstName("abimbola");
        user.setLastName("aisha");
        user.setPassword("password");

        User user2 = new User();

        user2.setEmail("aishat@gmail.com");
        user2.setFirstName("tayo");
        user2.setLastName("bolaji");
        user2.setPassword("password");

        List<User> users = List.of(user, user2);

//        List<User> users = List.of(user);

        List<UserDto> stringUser = users
                .stream()
                .sorted((first, second) -> {
//                    if (first.getEmail() == null) return 0;
                    if (first.getEmail().length() > second.getEmail().length()) return -1;
                    if (first.getEmail().length() < second.getEmail().length()) return 1;
                    else return 0;
                })
                .map(UserDto::new)
                .toList();


//        List<UserDto> stringUser = users
//                .stream()
//                .map(UserDto::new)
//                .toList();
    }
}
