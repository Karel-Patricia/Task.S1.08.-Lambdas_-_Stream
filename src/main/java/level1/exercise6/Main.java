package level1.exercise6;

import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Object> items = List.of(10, "Java", "Stream", 25,
                                        "Lambda", "API", 314, "Functional");

        List<String> sortedItems = items.stream()
                .filter(item -> item instanceof String)
                .map(item -> (String) item)
                .sorted(Comparator.comparingInt(String::length))
                .toList();


        System.out.println("Strings sorted by length: " + sortedItems);
    }


}
