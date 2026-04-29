package ro.unibuc.pao.lab9.exceptions;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Nume: ");
            String nume = scanner.nextLine();

            System.out.println("Grupa: ");
            String grupa = scanner.nextLine();

            System.out.println("Media: ");
            double media = Double.parseDouble(scanner.nextLine());

            System.out.println("An: ");
            int an = Integer.parseInt(scanner.nextLine());

            Student student = new Student(nume, grupa, media, an);

            System.out.println(student);

        } catch (NumberFormatException e) {
            System.out.println("Media trebuie sa fie numar real, iar anul trebuie sa fie numar intreg ");
        } catch (StudentInvalidException e) {
            System.out.println("Eroare la validarea studentului {} " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Program terminat");
        }

    }
}
