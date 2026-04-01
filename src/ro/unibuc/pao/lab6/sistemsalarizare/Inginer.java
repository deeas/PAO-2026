package ro.unibuc.pao.lab6.sistemsalarizare;

public class Inginer extends Angajat {
    private final String specializare;

    public Inginer(String cod, String nume, int varsta, double salariuBaza,
                   Departament departament, DateContract contract, String specializare) {
        super(cod, nume, varsta, salariuBaza, departament, contract);
        this.specializare = specializare;
    }

    @Override
    public double calculeazaSalariu() {
        double sporFix = 1000;
        return salariuBaza + sporFix;
    }

    @Override
    public String getTip() {
        return "INGINER";
    }

    public String getSpecializare() {
        return specializare;
    }
}
