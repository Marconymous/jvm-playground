package codesnippets.io;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        // Creating the scanner for the CommandLine
        var sc = new Scanner(System.in);

        // Reading a String
        var str = sc.nextLine();

        // Reading an int
        var i = sc.nextInt();

        // Reading a boolean
        var bool = sc.nextBoolean();
    }
}
