package level1.exercise5;

public class Main {

    public static void main(String[] args) {

        PiValueProvider piProvider = () -> 3.1415;

        System.out.println("Pi value: " + piProvider.getPiValue());
    }
}
