package s04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task01 {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();

        personList.add(new Person("G", 7));
        personList.add(new Person("F", 6));
        personList.add(new Person("E", 5));
        personList.add(new Person("D", 4));
        personList.add(new Person("C", 3));
        personList.add(new Person("B", 2));
        personList.add(new Person("A", 1));

        System.out.println(personList);

        System.out.println();

        Collections.sort(personList);

        System.out.println(personList);

        System.out.println();

        Person[] peoples = {new Person("G", 7), new Person("F", 6), new Person("B", 2), new Person("A", 1)};

        Arrays.sort(peoples);

        for(Person p : peoples) {
            System.out.println(p);
        }
    }
}
