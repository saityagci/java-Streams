package examples;

import start.Person;
import mockData.MockData;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GettingStarted {


    public void imperativeApproach() throws IOException {
        // 1. Find people aged less or equal 18
        // 2. Then change implementation to find first 10 people
        
        List<Person>people=MockData.getPeople();
        List<Person>youngPeople=new ArrayList<>();
        int limit=8;
        int counter=0;
        for (Person person : people) {
            if (person.getAge()<18){
                youngPeople.add(person);
                counter++;
                if (counter==limit){
                    break;
                }
            }

        }
        youngPeople.forEach(System.out::println);
    }
    public void declarativeApproachUsingStreams() throws Exception {
        List<Person>people=MockData.getPeople();

       List<Person>youngPeople= people.stream()
                .filter(person -> person.getAge()<18)
                .limit(8)
                .collect(Collectors.toList());
        youngPeople.forEach(System.out::println);


    }
}

