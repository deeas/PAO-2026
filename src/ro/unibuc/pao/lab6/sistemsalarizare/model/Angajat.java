package ro.unibuc.pao.lab6.sistemsalarizare.model;

import java.util.Objects;

public abstract class Angajat {
    protected final String cod;
    protected final String nume;
    protected final int varsta;
    protected final double salariuBaza;

    protected final Departament departament;

    protected final DateContract dateContract;

    public Angajat(String cod, String nume, int varsta, double salariuBaza, Departament departament, DateContract dateContract) {
        this.cod = cod;
        this.nume = nume;
        this.varsta = varsta;
        this.salariuBaza = salariuBaza;
        this.departament = new Departament(departament);
        this.dateContract = dateContract;
    }

    public String getCod() {
        return cod;
    }

    public String getNume() {
        return nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public double getSalariuBaza() {
        return salariuBaza;
    }

    public Departament getDepartament() {
        return new Departament(departament);
    }

    public DateContract getDateContract() {
        return dateContract;
    }

    public abstract double calculeazaSalariu();

    public abstract String getTip();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Angajat angajat = (Angajat) o;
        return getVarsta() == angajat.getVarsta() && Double.compare(getSalariuBaza(), angajat.getSalariuBaza()) == 0 && Objects.equals(getCod(), angajat.getCod()) && Objects.equals(getNume(), angajat.getNume()) && Objects.equals(getDepartament(), angajat.getDepartament()) && Objects.equals(getDateContract(), angajat.getDateContract());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCod(), getNume(), getVarsta(), getSalariuBaza(), getDepartament(), getDateContract());
    }

    @Override
    public String toString() {
        return  getTip() +
                "{cod='" + cod + '\'' +
                ", nume='" + nume + '\'' +
                ", varsta=" + varsta +
                ", salariuBaza=" + salariuBaza +
                ", departament=" + departament +
                ", dateContract=" + dateContract +
                '}';
    }
}
