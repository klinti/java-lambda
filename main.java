import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class main {

    public static void main(String[] args) throws IOException {

        List<String> fruitsName = Fruits.createArrayOfFruits();

        // print all values
        fruitsName.stream().forEach(System.out::println);

        // print characters greater than 6
        System.out.println();
        fruitsName.stream().filter(afruit -> afruit.length() > 6).forEach(System.out::println);

        // print size of array
        System.out.println();
        System.out.println(fruitsName.stream().count());

        // print number of elem whose length greater than 8
        System.out.println();
        System.out.println(fruitsName.stream().filter(fruit -> fruit.length() > 8).count());

        // print number of characters of each fruit name
        System.out.println();
        fruitsName.stream().forEach(fruit -> System.out.println(fruit.length()));

        // print uppercase fruits
        System.out.println();
        Fruits.toUpperCase().forEach(System.out::println);

        // prints the longer name
        System.out.println();
        System.out.println(Fruits.longerName());

        // print sorted fruit name
        System.out.println();
        fruitsName.stream().sorted().forEach(System.out::println);

        Files.walk(Paths.get("/home/linux/Desktop/directory"),Integer.MAX_VALUE).filter(Files::isDirectory).forEach(System.out::println);
    }
}