package s06;

import java.util.Arrays;
import java.util.List;

public class Task01 {
    public static void main(String[] args) {
        List<Product> productList = Arrays.asList(new Product("A", 12.5),
                new Product("B", 5.6),
                new Product("C", 25.15),
                new Product("D", 25.14));

        System.out.println(productList);
        System.out.println();

        productList.sort(new PriceComparator());

        System.out.println(productList);
    }
}
