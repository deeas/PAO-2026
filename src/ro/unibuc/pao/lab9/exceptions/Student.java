package ro.unibuc.pao.lab9.exceptions;

public class Student {

    private String nume;
    private String grupa;
    private double media;
    private int an;

    public Student(String nume, String grupa, double media, int an) throws StudentInvalidException {
        validate(nume, grupa, media, an);

        this.nume = nume;
        this.grupa = grupa;
        this.media = media;
        this.an = an;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getGrupa() {
        return grupa;
    }

    public void setGrupa(String grupa) {
        this.grupa = grupa;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public int getAn() {
        return an;
    }

    public void setAn(int an) {
        this.an = an;
    }

    private void validate(String nume, String grupa, double media, int an) throws StudentInvalidException {
        StringBuilder erori = new StringBuilder();

        if (nume == null || nume.trim().isEmpty()) {
            erori.append("Numele nu poate fi vid. \n");
        }

        if (grupa == null || !grupa.trim().matches("MI\\d{2}")) {
            erori.append("Grupa trebuie sa fie de forma MI urmata de doua cifre, de exemplu MI21.\n");
        }

        if (media < 1 || media > 10) {
            erori.append("Media trebuie sa fie in intervalul [1, 10].\n");
        }

        if (an != 1 && an != 2 && an != 3) {
            erori.append("Anul trebuie sa fie 1, 2, 3");
        }

        if (erori.length() > 0) {
            throw new StudentInvalidException(erori.toString());
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "nume='" + nume + '\'' +
                ", grupa='" + grupa + '\'' +
                ", media=" + media +
                ", an=" + an +
                '}';
    }
}
