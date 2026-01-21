package level1.exercise1;

import java.util.ArrayList;
import java.util.List;

public class Main1 {
    public static void main(String[] args) {

        List<String> things = new ArrayList<>();
        things.add("house");
        things.add("dog");
        things.add("cat");
        things.add("moon");
        things.add("tree");


        List<String> thingsWith0 = App.filterStringsContainingO(things);

        System.out.println("Things containing letter 'o': " + thingsWith0);

    }
}
