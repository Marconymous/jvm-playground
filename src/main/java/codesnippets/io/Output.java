package codesnippets.io;

public class Output {
    public static void main(String[] args) {
        // Printing to the Console
        System.out.println("Hello, World!"); // With newline at the end
        System.out.print("Hello,"); // Without newline
        System.out.print(" World!\n");
        System.out.printf("Hello, World! %d", 10); // With formatted string

        // Printing to the Error Stream
        System.err.println("Hello, Hell!");
    }
}
