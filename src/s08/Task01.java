package s08;

import java.util.LinkedList;
import java.util.List;

public class Task01 {
    public static void main(String[] args) {
        List<String> stringList = new LinkedList<>();

        stringList.add("A");
        stringList.add("B");
        stringList.add("C");
        stringList.add("D");
        stringList.add("E");

        System.out.println(stringList);

        stringList.add(2, "adding");

        System.out.println(stringList);
    }
}
