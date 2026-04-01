package ro.unibuc.pao.lab6.sistemsalarizare.io;

import ro.unibuc.pao.lab6.sistemsalarizare.model.Angajat;
import ro.unibuc.pao.lab6.sistemsalarizare.model.Companie;
import ro.unibuc.pao.lab6.sistemsalarizare.model.DateContract;
import ro.unibuc.pao.lab6.sistemsalarizare.model.Departament;
import ro.unibuc.pao.lab6.sistemsalarizare.model.tipuri.Inginer;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.Scanner;


public class CititorAngajati {
    public static Companie citesteDinFisier(String numeFisier) throws FileNotFoundException {
        Scanner in = new Scanner(new File(numeFisier));
        Companie companie = new Companie();

        int n = Integer.parseInt(in.nextLine().trim());

        //TIP; COD;NUME;VARSTA;DEPARTAMENT;SALARIU_BAZA;PARAMETRU_SPECIFIC
        for (int i=0; i < n;  i++) {
            String linie = in.nextLine().trim();

            if (linie.isEmpty()) {
                continue;
            }

            String[] aux  = linie.split(";");

            if (aux.length != 7) {
                throw new IllegalArgumentException("Linie invalida!");
            }

            String tip = aux[0].trim().toUpperCase();
            String cod = aux[1].trim();
            String nume = aux[2].trim();
            int varsta = Integer.parseInt(aux[3].trim());
            String numeDepartament = aux[4].trim();
            double salariuBaza = Double.parseDouble(aux[5].trim());
            String param = aux[6].trim();

            Angajat angajat;

            Departament departament = new Departament(numeDepartament);
            DateContract contract = new DateContract(LocalDate.now(), "NEDERMINAT");


            switch (tip) {
                case "INGINER" -> {
                    angajat = new Inginer(cod, nume, varsta, salariuBaza, departament,
                            contract, param );
                }
                default -> throw new IllegalStateException("Tip necunoscut: " + tip);
            }

            companie.addAngajat(angajat);
        }

        in.close();
        return companie;
    }



}
