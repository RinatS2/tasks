package s05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task01 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("7-AAAAAAA", "6-AAAAAA", "", "4-AAAA", "3-AAA", "2-AA", "1-A");

        System.out.println(strings);
        System.out.println();

        Collections.sort(strings, new StringLengthComparator());

        System.out.println(strings);
    }
}
