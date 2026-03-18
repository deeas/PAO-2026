package ro.unibuc.pao.lab4.overriding;

public class Angajat {
    protected String nume;
    protected double salariuBaza;

    public Angajat(String nume, double salariuBaza) {
        this.nume = nume;
        this.salariuBaza = salariuBaza;
    }

    double calculeazaVenit() {
        return salariuBaza;
    }
}
