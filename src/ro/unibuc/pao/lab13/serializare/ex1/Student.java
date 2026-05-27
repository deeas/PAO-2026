package ro.unibuc.pao.lab13.serializare.ex1;

import java.io.Serializable;
/* Creați o clasă Student care implementează Serializable și conține:
String nume;
String grupa;
int an;
double media;
transient String parolaCont;
static String facultate;

Cerințe:
1. creați un obiect Student;
2. salvați obiectul în fișierul binar student.ser;
3. restaurați obiectul din fișier;
4. afișați obiectul înainte și după serializare;

 */
public class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    static String facultate = "Facultatea de informatica";
    private String nume;
    private String grupa;
    private int an;
    private double media;
    private transient String parolaCont;

    public Student(String nume, String grupa, int an, double media, String parolaCont) {
        this.nume = nume;
        this.grupa = grupa;
        this.an = an;
        this.media = media;
        this.parolaCont = parolaCont;
    }

    public static String getFacultate() {
        return facultate;
    }

    public static void setFacultate(String facultate) {
        Student.facultate = facultate;
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

    public int getAn() {
        return an;
    }

    public void setAn(int an) {
        this.an = an;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public String getParolaCont() {
        return parolaCont;
    }

    public void setParolaCont(String parolaCont) {
        this.parolaCont = parolaCont;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nume='" + nume + '\'' +
                ", grupa='" + grupa + '\'' +
                ", an=" + an +
                ", media=" + media +
                ", parolaCont='" + parolaCont + '\'' +
                ", facultate='" + facultate + '\'' +
                '}';
    }
}
