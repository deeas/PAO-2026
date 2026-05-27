package ro.unibuc.pao.lab13.serializare.ex2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Grupa grupa = new Grupa("M121",
                new ArrayList<>(List.of(
                        new Student("Ana Popescu", 9.35),
                        new Student("Mihai Ionescu", 7.80),
                        new Student("Ioana Marin", 10.00),
                        new Student("Elena Dobre", 7.50)
                ))
        );

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("grupa.ser"))) {
            out.writeObject(grupa);
            System.out.println("Grupa a fost serializata!");
        } catch (IOException ex) {
            System.out.println("Eroare la serializare");
        }

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("grupa.ser"))) {
            Grupa grupaRestaurata = (Grupa) in.readObject();

            System.out.println();
            System.out.println("Grupa restaurata: ");

            grupaRestaurata.getStudentList().forEach(System.out::println);
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println("Eroare la deserialziare");
        }
    }
}
