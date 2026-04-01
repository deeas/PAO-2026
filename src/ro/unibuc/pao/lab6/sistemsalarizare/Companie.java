package ro.unibuc.pao.lab6.sistemsalarizare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Companie {
    private final List<Angajat> angajati = new ArrayList<>();

    public List<Angajat> getAngajati() {
        return Collections.unmodifiableList(angajati);
    }

    public void addAngajat(Angajat angajat) {
        angajati.add(angajat);
    }

}
