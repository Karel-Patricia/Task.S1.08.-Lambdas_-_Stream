package level1.exercise1;

import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static List<String> filterStringsContainingO(List<String> strings) {
        return strings.stream()
                .filter(s -> s.toLowerCase().contains("o"))
                .collect(Collectors.toList());
    }

}
