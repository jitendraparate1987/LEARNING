package StringPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaExample {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 39));
        people.add(new Person("Bob", 22));
        people.add(new Person("Charlie", 30));
        people.add(new Person("Diane", 28));

        // Sort by age
        Collections.sort(people, (p1, p2) -> p1.getAge() - p2.getAge());
        //System.out.println("Sorted by age: " + people);

        // Sort by name
        Collections.sort(people, (p1, p2) -> p1.getName().compareTo(p2.getName()));
        //System.out.println("Sorted by name: " + people);
        
     // Sort the names in Java   
        
        List<Integer> S1 =  new ArrayList<Integer>();
        S1.add(784);
        S1.add(239);
        S1.add(923);
        S1.add(752);
        S1.add(234);
        
        Collections.sort(S1, (p1,p2)-> p2.compareTo(p1));
        
        System.out.println(S1);
        
        
        
    }
}
