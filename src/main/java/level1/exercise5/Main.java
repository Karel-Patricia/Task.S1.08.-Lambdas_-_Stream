package level1.exercise5;

public class Main {
    public static void main(String[] args) {

        FunctionalInterface.Pivalue pi = () -> 3.1415;

        System.out.println("Pi value: " + pi.getPiValue());
    }
}
