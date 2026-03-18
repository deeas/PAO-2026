package ro.unibuc.pao.lab4.mostenire;

import java.util.Objects;

public class Student extends Person {
    private String department;
    private int year;
    private double mark;


    public Student(String name, int age, String department, int year, double mark) {
        super(name, age);
        this.department = department;
        this.year = year;
        this.mark = mark;
    }

    public boolean isIntegralist() {
        return mark >=5.0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return name == student.name && age == student.age &&
                year == student.year && Double.compare(mark, student.mark) == 0 && Objects.equals(department, student.department);
    }

   @Override
    public int hashCode() {
        return Objects.hash(name, age, department, year, mark);
    }

    @Override
    public String toString() {

        /*return "Student{" +
                "name= " + name +
                ", age=" + age +
                ", department='" + department + '\'' +
                ", year=" + year +
                ", mark=" + mark +
                '}';*/

        return super.toString() +
                ", department='" + department + '\'' +
                ", year=" + year +
                ", mark=" + mark;

    }
}
