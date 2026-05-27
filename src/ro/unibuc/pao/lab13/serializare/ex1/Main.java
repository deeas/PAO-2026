package ro.unibuc.pao.lab13.serializare.ex1;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Ana Popescu", "M1121", 2, 9.35, "ana123");
        System.out.println("Inainte de serializare: ");
        System.out.println(student);

        try (ObjectOutputStream out = new ObjectOutputStream((new FileOutputStream("student.ser")))) {
            out.writeObject(student);
            System.out.println("Studentul a fost serializat");
        } catch (IOException ex) {
            System.out.println("Eroare la serialziare");
        }

        Student.facultate = "Alta facultate";

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("student.ser"))) {
            Student studentRestaurat = (Student) in.readObject();
            System.out.println();
            System.out.println("Dupa deserializare: ");
            System.out.println(
                    studentRestaurat
            );
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println("Eroare la deserializare");
        }
    }
}
