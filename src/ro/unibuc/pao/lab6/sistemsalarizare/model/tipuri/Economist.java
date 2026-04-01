package ro.unibuc.pao.lab6.sistemsalarizare.model.tipuri;

import ro.unibuc.pao.lab6.sistemsalarizare.model.Angajat;
import ro.unibuc.pao.lab6.sistemsalarizare.model.DateContract;
import ro.unibuc.pao.lab6.sistemsalarizare.model.Departament;

public class Economist extends Angajat {

    private final int treaptaProfesionala;
    private static final double[] SPORURI = {5, 10, 15, 20, 25, 30};

    public Economist(String cod, String nume, int varsta, double salariuBaza,
                     Departament departament, DateContract contract, int treaptaProfesionala) {
        super(cod, nume, varsta, salariuBaza, departament, contract);
        this.treaptaProfesionala = treaptaProfesionala;
    }
    @Override
    public double calculeazaSalariu() {
        return salariuBaza + salariuBaza * SPORURI[treaptaProfesionala] / 100.0;
    }

    @Override
    public String getTip() {
        return "ECONOMIST";
    }

    public int getTreaptaProfesionala() {
        return treaptaProfesionala;
    }
}
