package ro.unibuc.pao.lab5.abstractclass;

abstract class Forma {
    protected String culoare;

    public Forma(String culoare) {
        this.culoare = culoare;
    }

    public abstract double aria();

    public void descriere() {
        System.out.println("Forma de culoare " + culoare);
    }
}

class Cerc extends Forma {
    private double raza;

    public Cerc(String culoare, double raza) {
        super(culoare);
        this.raza = raza;
    }

    @Override
    public double aria() {
        return Math.PI * raza * raza;
    }
}

class Dreptunghi extends Forma {
    private double lungime;
    private double latime;

    public Dreptunghi(String culoare, double lungime, double latime) {
        super(culoare);
        this.lungime = lungime;
        this.latime = latime;
    }

    @Override
    public double aria() {
        return lungime * latime;
    }
}

public class Ex1 {
    public static void main(String[] args) {
        Forma[] forme = {
                new Cerc("rosu", 3),
                new Dreptunghi("albastru", 4, 5)
        };

        for (Forma f : forme) {
            f.descriere();
            System.out.println("Aria = " + f.aria());
        }
    }
}