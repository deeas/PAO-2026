package ro.unibuc.pao.lab6.sistemsalarizare.main;

import ro.unibuc.pao.lab6.sistemsalarizare.io.CititorAngajati;
import ro.unibuc.pao.lab6.sistemsalarizare.model.Angajat;
import ro.unibuc.pao.lab6.sistemsalarizare.model.Companie;
import ro.unibuc.pao.lab6.sistemsalarizare.model.Departament;

public class Main {
    public static void main(String[] args) {

        try {
            Companie companie = CititorAngajati.citesteDinFisier("src/ro/unibuc/pao/lab6/sistemsalarizare/angajati.txt");
            System.out.println(companie.genereazaRaport());

            System.out.println("=== CAUTARE DUPA COD ===");

            Angajat cautat = companie.cautaDupaCod("A003");

            if (cautat != null) {
                System.out.println("Gasit: " + cautat);
            } else {
                System.out.println("Nu exista angajatul cautat.");
            }

            System.out.println("\n=== DEMONSTRATIE INCAPSULARE ===");

            Angajat a = companie.cautaDupaCod("A001");

            if (a != null) {
                Departament d = a.getDepartament();
                d.setNume("HackedDepartment");
                System.out.println("Departament extern modificat: " + d.getNume());
                System.out.println("Departament intern ramas: " + a.getDepartament().getNume());
            }
        } catch (Exception e) {
            System.out.println("Eroare: " + e.getMessage());
        }
    }
}
