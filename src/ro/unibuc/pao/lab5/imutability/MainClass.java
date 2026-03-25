package ro.unibuc.pao.lab5.imutability;

/*
Se dau clasele:
    •	Facultate — mutabilă;
	•	Student — implementați Student astfel încât obiectul să rămână imutabil chiar dacă Facultate este mutabilă.*/
class Facultate {
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

final class Student {
    private final String nume;
    private final Facultate facultate;
    private final int grupa;

    public Student(String nume, Facultate facultate, int grupa) {
        this.nume = nume;
        this.facultate = new Facultate(facultate);
        this.grupa = grupa;
    }

    public String getNume() {
        return nume;
    }

    public Facultate getFacultate() {
        return new Facultate(facultate);
    }

    public int getGrupa() {
        return grupa;
    }
}

public class MainClass {
    public static void main(String[] args) {
        Facultate f = new Facultate("Informatica");
        Student s = new Student("Ana", f, 231);

        f.setDenumire("Matematica");
        System.out.println(s.getFacultate().getDenumire()); // Informatica

        Facultate copia = s.getFacultate();
        copia.setDenumire("Cibernetica");
        System.out.println(s.getFacultate().getDenumire()); // Informatica
    }
}
