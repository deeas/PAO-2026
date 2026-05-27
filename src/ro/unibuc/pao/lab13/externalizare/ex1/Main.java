package ro.unibuc.pao.lab13.externalizare.ex1;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        ContUtilizator cont = new ContUtilizator("ana.popescu", "ana.popescu@mail.com", "parolaSecreta", 1270.56);
        System.out.println("Inainte de externalizare");
        System.out.println(cont);

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("cont.ser"))) {

            out.writeObject(cont);
            System.out.println("Contul a fost externalizat");
        } catch (IOException ex) {
            System.out.println("Eroare la scriere " + ex.getMessage());
        }

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("cont.ser"))){
            ContUtilizator contRestaurat = (ContUtilizator)  in.readObject();

            System.out.println(" \nDupa externalizare " + contRestaurat);
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println("Eroare la citire: " + ex.getMessage());
        }
    }
}
