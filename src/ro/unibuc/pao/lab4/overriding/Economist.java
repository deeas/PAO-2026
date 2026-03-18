package ro.unibuc.pao.lab4.overriding;

public class Economist extends Angajat {
    private int treaptaProfesionala;
    private static final double[] SPORURI = {5, 10, 15, 20, 25, 30};

    public Economist(String nume, double salariuBaza, int treaptaProfesionala) {
        super(nume, salariuBaza);
        this.treaptaProfesionala = treaptaProfesionala;
    }

    @Override
    double calculeazaVenit() {
        return salariuBaza + salariuBaza * SPORURI[treaptaProfesionala] / 100;
    }
}
