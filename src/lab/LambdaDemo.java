package lab;

import java.util.ArrayList;
import java.util.Comparator;

public class LambdaDemo {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // cannot calculate bigger numbers due to Integer limit
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }

        System.out.print("display original ");
        System.out.println(list);

        System.out.println("reduce");
        int product = list.stream().reduce(1, (a, b) -> a * b);
        System.out.println("Total product is: " + product);

        int sum = list.stream().reduce(0, (a, b) -> a + b);
        System.out.println("sum " + sum);


        System.out.println("just display");
        list.forEach(instance -> System.out.print(instance + " "));

        System.out.println("\nfiler & display");
        list.stream().filter(itr -> itr % 2 == 0).forEach(itr2 -> System.out.print(" " + itr2));

        System.out.println();
//        Integer max = list.stream().max(Comparator.comparing(i->i));
//        Integer min = list.stream().mapToInt( v -> v).min();
//        System.out.println("max : " + max);
//        System.out.println("min : " + min);

    }

}
