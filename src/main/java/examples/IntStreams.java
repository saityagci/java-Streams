package examples;
import mockData.MockData;
import org.testng.annotations.Test;
import start.Person;

import java.util.List;
import java.util.stream.IntStream;

public class IntStreams {
    @Test
    public void range() throws Exception {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println("With int stream exclusive");
       IntStream.range(0,10).forEach(value -> System.out.println(value));

        System.out.println("With int stream inclusive");
        IntStream.rangeClosed(0,10).forEach(System.out::println);
    }
    // Loop through people using IntStreams
    @Test
    public void rangeIteratingLists() throws Exception {
        List<Person> people= MockData.getPeople();
        IntStream.range(0, people.size())
                .forEach(index -> {
                    System.out.println(people.get(index));
                });
    }
    @Test
    public void intStreamIterate()  {
        IntStream.iterate(0, value -> value + 1)
                .limit(11)
                .forEach(System.out::println);
    }
}
