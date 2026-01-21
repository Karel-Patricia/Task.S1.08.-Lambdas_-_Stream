package level1.exercise2;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {

        List<String> continentes = new ArrayList<>();
        continentes.add("América");
        continentes.add("Europa");
        continentes.add("Asia");
        continentes.add("Oceania");
        continentes.add("Africa");
        continentes.add("Antártida");


        List<String> result = App.filterStringsContainingOAndLongerThanFive(continentes);

        System.out.println("Strings containing 'o' and longer than 5 characters:: " + result);

    }

}
