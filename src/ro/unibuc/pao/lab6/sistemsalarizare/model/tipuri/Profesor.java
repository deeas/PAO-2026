package ro.unibuc.pao.lab6.sistemsalarizare.model.tipuri;

import ro.unibuc.pao.lab6.sistemsalarizare.model.Angajat;
import ro.unibuc.pao.lab6.sistemsalarizare.model.DateContract;
import ro.unibuc.pao.lab6.sistemsalarizare.model.Departament;

public class Profesor extends Angajat {
    private final double coeficientDidactic;

    public Profesor(String cod, String nume, int varsta, double salariuBaza,
                    Departament departament, DateContract contract, double coeficientDidactic) {
        super(cod, nume, varsta, salariuBaza, departament, contract);
        this.coeficientDidactic = coeficientDidactic;
    }

    @Override
    public double calculeazaSalariu() {
        return salariuBaza * coeficientDidactic;
    }

    @Override
    public String getTip() {
        return "PROFESOR";
    }

    public double getCoeficientDidactic() {
        return coeficientDidactic;
    }
}
