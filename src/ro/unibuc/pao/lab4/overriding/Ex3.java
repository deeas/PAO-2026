package ro.unibuc.pao.lab4.overriding;

public class Ex3 {
    public static void main(String[] args) {
        Angajat a1 = new Economist("Ana", 5000, 5);
        Angajat a2 = new Paznic("Dan", 3200, 0.25);

        System.out.println(a1.nume + " -> " + a1.calculeazaVenit());
        System.out.println(a2.nume + " -> " + a2.calculeazaVenit());
    }
}
