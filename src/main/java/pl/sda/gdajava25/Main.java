package pl.sda.gdajava25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 2 Zadanie:
 * Przygotuj funkcję rekurencyjną, która odwraca kolejność elementów w liście.
 */
public class Main {
    public static void main(String[] args) {
        ReversList reversList = new ReversList();

        List<String> stringList = new ArrayList<String>(Arrays.asList("a", "b", "c", "d","e","f"));

        List<String> reverse = reversList.revers(stringList);
        System.out.println(reverse);

    }
}
