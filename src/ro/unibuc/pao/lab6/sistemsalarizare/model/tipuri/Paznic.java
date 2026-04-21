package ro.unibuc.pao.lab6.sistemsalarizare.model.tipuri;

import ro.unibuc.pao.lab6.sistemsalarizare.model.Angajat;
import ro.unibuc.pao.lab6.sistemsalarizare.model.DateContract;
import ro.unibuc.pao.lab6.sistemsalarizare.model.Departament;
public class Paznic extends Angajat {
    private final double sporNoapte;

    public Paznic(String cod, String nume, int varsta, double salariuBaza,
                  Departament departament, DateContract contract, double sporNoapte) {
        super(cod, nume, varsta, salariuBaza, departament, contract);
        this.sporNoapte = sporNoapte;
    }

    @Override
    public double calculeazaSalariu() {
        return salariuBaza + salariuBaza * sporNoapte;
    }

    @Override
    public String getTip() {
        return "PAZNIC";
    }

    public double getSporNoapte() {
        return sporNoapte;
    }
}