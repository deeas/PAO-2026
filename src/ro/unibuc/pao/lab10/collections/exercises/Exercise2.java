package ro.unibuc.pao.lab10.collections.exercises;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

class Task {
    private final String denumire;
    private final int prioritate;
    private final int ordineIntroducere;

    public Task(String denumire, int prioritate, int ordineIntroducere) {
        this.denumire = denumire;
        this.prioritate = prioritate;
        this.ordineIntroducere = ordineIntroducere;
    }

    public String getDenumire() {
        return denumire;
    }

    public int getPrioritate() {
        return prioritate;
    }

    public int getOrdineIntroducere() {
        return ordineIntroducere;
    }

    @Override
    public String toString() {
        return "Task: " + denumire + ", prioritate: " + prioritate;
    }
}

public class Exercise2 {
    public static void main(String[] args) {
        /*
            Comparatorul spune cum se ordoneaza task-urile in coada.
            1. Comparator.comparingInt(Task::getPrioritate).reversed()
               -> prioritatea mai mare vine prima.
            2. thenComparingInt(Task::getOrdineIntroducere)
               -> daca doua task-uri au aceeasi prioritate,
                  se proceseaza primul task introdus.
        */

        try (Scanner scanner = new Scanner(System.in)) {
            PriorityQueue<Task> coadaTaskuri = new PriorityQueue<>(
                    Comparator.comparingInt(Task::getPrioritate)
                            .reversed()
                            .thenComparingInt(Task::getOrdineIntroducere)
            );
            System.out.print("Numar task-uri: ");
            int n = Integer.parseInt(scanner.nextLine());

            if (n <= 0) {
                throw new IllegalArgumentException("Numarul de task-uri trebuie sa fie pozitiv.");
            }

            for (int i = 0; i < n; i++) {
                System.out.println();
                System.out.println("Task-ul " + (i + 1) + ":");

                System.out.print("Denumire: ");
                String denumire = scanner.nextLine();

                if (denumire.trim().isEmpty()) {
                    throw new IllegalArgumentException("Denumirea task-ului nu poate fi vida.");
                }

                System.out.print("Prioritate: ");
                int prioritate = Integer.parseInt(scanner.nextLine());

                Task task = new Task(denumire, prioritate, i);
                coadaTaskuri.offer(task);
            }

            System.out.println();
            System.out.println("Ordinea de procesare a task-urilor:");

            while (!coadaTaskuri.isEmpty()) {
                Task taskCurent = coadaTaskuri.poll();
                System.out.println(taskCurent);
            }
        } catch (NumberFormatException ex) {
            System.out.println("Eroare: trebuie sa introduceti un numar valid.");
        } catch (IllegalArgumentException ex) {
            System.out.println("Eroare: " + ex.getMessage());
        } finally {
            System.out.println("Program terminat.");
        }
    }
}
