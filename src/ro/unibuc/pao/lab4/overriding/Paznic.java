package ro.unibuc.pao.lab4.overriding;

public class Paznic extends Angajat {
    private double sporNoapte;

    public Paznic(String nume, double salariuBaza, double sporNoapte) {
        super(nume, salariuBaza);
        this.sporNoapte = sporNoapte;
    }

    @Override
    double calculeazaVenit() {
        return salariuBaza + salariuBaza * sporNoapte;
    }
}
