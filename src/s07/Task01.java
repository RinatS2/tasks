package s07;

import java.util.ArrayList;
import java.util.List;

public class Task01 {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();

        integerList.add(100);
        integerList.add(200);
        integerList.add(300);

        integerList.remove(2);

        System.out.println(integerList);

    }
}
