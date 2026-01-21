package level1.exercise8;

public class Main {
    public static void main(String[] args) {

        StringReverser reverser = str -> new StringBuilder(str).reverse().toString();

        String originalText = "Programming";
        String reversed = reverser.reverse(originalText);

        System.out.println("Original string: " + originalText);
        System.out.println("Reversed string: " + reversed);

    }
}
