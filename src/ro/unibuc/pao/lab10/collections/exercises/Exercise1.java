package ro.unibuc.pao.lab10.collections.exercises;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

/*
Coada de cereri la secretariat Queue<Cerere> cu ArrayDeque
- adaugam o cerere
- procesam urmatoarea cerere
- afisam urmatoarea cerere fara stergere
- afisam numarul de cereri ramase
- afisam toate cererile
 */
class Cerere {
    private int id;
    private String nume;
    private String tip;

    public Cerere(int id, String nume, String tip) {
        if (nume == null || nume.trim().isEmpty()) {
            throw new IllegalArgumentException("Numele nu poate fi vid");
        }

        if (tip == null || tip.trim().isEmpty()) {
            throw new IllegalArgumentException("Tipul nu poate fi vid");
        }

        this.id = id;
        this.nume = nume;
        this.tip = tip;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    @Override
    public String toString() {
        return "Cerere{" +
                "id=" + id +
                ", nume='" + nume + '\'' +
                ", tip='" + tip + '\'' +
                '}';
    }
}

public class Exercise1 {
    private static int urmatorulId = 1;

    public static void main(String[] args) {
        Queue<Cerere> cerereQueue = new ArrayDeque<>();

        try (Scanner scanner = new Scanner(System.in)) {
            boolean ruleaza = true;
            while (ruleaza) {
                afiseazaMeniul();

                System.out.println("Alegeti optiunea: ");
                int optiunea = Integer.parseInt(scanner.nextLine());

                switch (optiunea) {
                    case 1:
                        adaugaCerere(scanner, cerereQueue);
                        break;
                    case 2:
                        proceseazaCererea(cerereQueue);
                        break;
                    case 3:
                        afiseazaUrmatoareCerere(cerereQueue);
                        break;
                    case 4:
                        afiseazaNrCereriRamase(cerereQueue);
                        break;
                    case 5:
                        afiseazaToateCererile(cerereQueue);
                        break;
                    case 0:
                        ruleaza = false;
                        System.out.println("Programul se inchide...");
                    default:
                        System.out.println("Optiune invalida");

                }
            }
        } catch (NumberFormatException ex) {
            System.out.println("Eroare: trebuie sa introduci un numar pentru optiune");
        } catch (IllegalArgumentException ex) {
            System.out.println("Eroare: " + ex.getMessage());
        } finally {
            System.out.println("Program terminat");
        }
    }

    private static void afiseazaMeniul() {
        System.out.println("1. Adauga cerere");
        System.out.println("2. Proceseaza urmatoarea cerere");
        System.out.println("3. Afiseaza urmatoarea cerere fara stergere");
        System.out.println("4. Afiseaza numar cereri ramase");
        System.out.println("5. Afiseaza toate cererile");
        System.out.println("0. Exit");
    }

    private static void adaugaCerere(Scanner scanner, Queue<Cerere> coadaCereri) {
        System.out.println("Nume student:");
        String nume = scanner.nextLine();

        System.out.println("Tipul cererii: ");
        String tip = scanner.nextLine();

        Cerere cerere = new Cerere(urmatorulId, nume, tip);
        urmatorulId++;

        coadaCereri.offer(cerere);

        System.out.println("Cererea a fost adaugata");
    }

    private static void proceseazaCererea(Queue<Cerere> coadaCereri) {
        if (coadaCereri.isEmpty()) {
            System.out.println("Nu exista cereri");
            return;
        }
        Cerere cerere = coadaCereri.poll();

        System.out.println("Cererea a fost procesata" + cerere);
    }

    private static void afiseazaUrmatoareCerere(Queue<Cerere> coadaCereri) {
        if (coadaCereri.isEmpty()) {
            System.out.println("Nu exista cereri");
            return;
        }

        Cerere urmatoareaCerere = coadaCereri.peek();

        System.out.println("Urmatoarea cerere din coada: " + urmatoareaCerere);
    }

    private static void afiseazaNrCereriRamase(Queue<Cerere> coadaCereri) {
        if (coadaCereri.isEmpty()) {
            System.out.println("Nu exista cereri");
            return;
        }
        System.out.println("Numar cereri ramase: " + coadaCereri.size());
    }

    private static void afiseazaToateCererile(Queue<Cerere> coadaCereri) {
        if (coadaCereri.isEmpty()) {
            System.out.println("Nu exista cereri in coada.");
            return;
        }

        System.out.println("Cererile aflate in coada:");

        for (Cerere cerere : coadaCereri) {
            System.out.println(cerere);
        }
    }
}
