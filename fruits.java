import java.util.Arrays;
import java.util.List;

public class fruits {

    public static void main(String[] args) {

        List<String> fruitsName = Arrays.asList("orange", "apple", "lemon", "strawberry", "cherry", "melon",
                "watermelon");

        // print all values
        fruitsName.stream().forEach(System.out::println);

        // print characters greater than 6
        System.out.println();
        fruitsName.stream().filter(afruit -> afruit.length() > 6).forEach(System.out::println);

        //print size of array
        System.out.println();
        System.out.println(fruitsName.stream().count());

    }
}