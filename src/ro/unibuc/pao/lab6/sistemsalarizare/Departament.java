package ro.unibuc.pao.lab6.sistemsalarizare;

public class Departament {
    private String nume;

    public Departament(String nume) {
        this.nume = nume;
    }

    public Departament(Departament otherDepartament) {
        this.nume = otherDepartament.nume;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public String toString() {
        return "Departament{" +
                "nume='" + nume + '\'' +
                '}';
    }
}
