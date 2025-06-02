import java.nio.file.Files;
import java.util.function.BiConsumer;
import java.util.function.DoubleToIntFunction;
import java.util.function.IntConsumer;

public class Main {
    public static void main(String[] args) {
        doubleConsumer();
        doubleToInt();
    }

    public static void doubleConsumer() {
        BiConsumer<String, String> biConsumer = (x, y)-> {
            System.out.println(x+ " "+ y);
        };
        biConsumer.accept("bim", "bola");
    }

    public static void doubleToInt() {

        DoubleToIntFunction conversion = x -> {
//            System.out.println("The conversion from double to integer is " + x);
            return (int) x;
        };
       int value = conversion.applyAsInt(6.0);
        System.out.print(value);
    }

    public static void intConsumer() {
        IntConsumer consumer = x -> {
            System.out.println("The value of int consumer is " + x);
        };
    }

    public Files createFile(String path) {
//        String path = "/home/bibi/Documents/Java-Assignments/MyPractise/src";
    }
}