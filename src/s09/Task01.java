package s09;

import java.util.ArrayList;
import java.util.List;

public class Task01 {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();

        stringList.add("A");
        stringList.add("B");
        stringList.add("C");
        stringList.add("D");
        stringList.add("E");

        System.out.println(nameSearch("u", stringList));
    }

    public static boolean nameSearch(String searchName, List<String> nameList) {
        boolean b = false;
        for (String s : nameList) {
            if (searchName.equals(s)) {
                return true;
            }
        }
        return b;
    }
}
