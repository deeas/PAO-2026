package ro.unibuc.pao.lab5.recordclass;

/*
	1.	Definiți un record StudentRecord(String nume, int grupa, double medie).
    2.	Afișați valorile și testați equals.
	3.	Definiți apoi un record StudentRecord2(String nume, Facultate facultate) și protejați corect componenta mutabilă.
*/
public class MainRecord {
    public static void main(String[] args) {
        StudentRecord s1 = new StudentRecord("Ana", 231, 9.5);
        StudentRecord s2 = new StudentRecord("Ana", 231, 9.5);

        System.out.println(s1.nume());
        System.out.println(s1);
        System.out.println(s1.equals(s2));

        Facultate f = new Facultate("Informatica");

        StudentRecord2 sr = new StudentRecord2("Mihai", f);

        f.setDenumire("Matematica");
        System.out.println(sr.facultate().getDenumire());
    }
}
