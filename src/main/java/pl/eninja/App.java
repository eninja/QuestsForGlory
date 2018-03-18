package pl.eninja;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
//        System.out.println("Hello World!");
        firstDuplicate firstDuplicate = new firstDuplicate();
        System.out.println(firstDuplicate.findUsingFor(new int[]{2, 3, 3, 1, 5, 2}));
    }
}
