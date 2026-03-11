package ro.unibuc.pao.lab2.io;

import java.util.Scanner;

public class ReadAndWrite {


    public static void main(String[] args) {
        Scanner scanner;

        scanner = new Scanner(System.in);

        System.out.println("Input text: ");

        String string = scanner.nextLine();

        System.out.println("the text is: " + string);

        System.out.println("Read boolean: ");
        boolean b = scanner.nextBoolean();
        System.out.println("The boolean is: " + b);

        System.out.println("REad int: ");
        int i = scanner.nextInt();

        System.out.println("Read double: ");
        double d = scanner.nextDouble();

        System.err.println("Something bad happened");
        System.err.print("Same as before, with \\n at the end");
    }
}
