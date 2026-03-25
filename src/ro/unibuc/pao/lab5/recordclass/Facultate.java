package ro.unibuc.pao.lab5.recordclass;

public class Facultate {
    private String denumire;

    public Facultate(String denumire) {
        this.denumire = denumire;
    }

    public Facultate(Facultate other) {
        this.denumire = other.denumire;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }
}
