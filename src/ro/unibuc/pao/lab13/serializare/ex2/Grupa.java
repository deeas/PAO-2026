package ro.unibuc.pao.lab13.serializare.ex2;

import java.io.Serializable;
import java.util.List;

public class Grupa implements Serializable {
    private static final long serialVersionUID = 1L;

    private String codGrupa;
    private List<Student> studentList;

    public Grupa(String codGrupa, List<Student> studentList) {
        this.codGrupa = codGrupa;
        this.studentList = studentList;
    }

    public String getCodGrupa() {
        return codGrupa;
    }

    public void setCodGrupa(String codGrupa) {
        this.codGrupa = codGrupa;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public String toString() {
        return "Grupa{" +
                "codGrupa='" + codGrupa + '\'' +
                ", studentList=" + studentList +
                '}';
    }
}
