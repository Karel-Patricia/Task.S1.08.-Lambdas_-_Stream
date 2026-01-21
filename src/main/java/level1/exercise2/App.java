package level1.exercise2;

import java.util.List;
import java.util.stream.Collectors;

public class App {

    public static List<String> filterStringsContainingOAndLongerThanFive(List<String> strings) {
        return strings.stream()
                .filter(s -> s.toLowerCase().contains("o") && s.length() > 5)
                .collect(Collectors.toList());
    }
}
