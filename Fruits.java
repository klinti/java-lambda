import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Fruits {

    public static List<String> createArrayOfFruits() {

        return Arrays.asList("orange", "apple", "lemon", "strawberry", "cherry", "melon", "watermelon");
    }

    public static Stream<String> toUpperCase() {

        return createArrayOfFruits().stream().map(name -> name.toUpperCase());
    }

    public static String longerName() {

        return createArrayOfFruits().stream().max(Comparator.comparing(String::valueOf)).get();
    }

}