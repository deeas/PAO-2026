package ro.unibuc.pao.lab12.functional;

/*
Create a class:
class Student {
    private String name;
    private String group;
    private double grade;
}
Create a List<Student> with at least 8 students.
Using Java streams, solve the following tasks:
1. Display all students with grade at least 5.
2. Display only the names of students from group "MI21".
3. Display all students sorted descending by grade.
4. Display the names of students with grade at least 9, sorted alphabetically.
5. Count how many students failed the exam.
*/

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class Ex1 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Ana Popescu", "MI21", 9.50));
        students.add(new Student("Mihai Ionescu", "MI22", 4.80));
        students.add(new Student("Ioana Marin", "MI21", 7.30));
        students.add(new Student("George Stan", "MI23", 10.00));
        students.add(new Student("Elena Dobre", "MI22", 8.40));
        students.add(new Student("Radu Pavel", "MI21", 3.90));
        students.add(new Student("Maria Georgescu", "MI23", 9.20));
        students.add(new Student("Andrei Matei", "MI22", 5.00));

        //1. Display all students with grade at least 5.
        System.out.println("Students who passed: ");
        students.stream()
                .filter(student -> student.getGrade() >= 5)
                .forEach(System.out::println);

        //2. Display only the names of students from group "MI21".
        System.out.println("Names of students from MI21");
        students.stream()
                .filter(student -> student.getGroup().equals("MI21"))
                .map(Student::getName)
                .forEach(System.out::println);

        System.out.println();

        //3. Display all students sorted descending by grade.
        System.out.println("all students sorted descending by grade");
        students.stream()
                .sorted(Comparator.comparing(Student::getGrade).reversed())
                .forEach(System.out::println);

        System.out.println();

        //4. Display the names of students with grade at least 9, sorted alphabetically.
        System.out.println("students with grade at least 9, sorted alphabetically");
        students.stream()
                .filter(student -> student.getGrade() >=9)
                .map(Student::getName)
                .sorted()
                .forEach(System.out::println);

        System.out.println();

        //Count how many students failed the exam.
        long failedStudents = students.stream()
                        .filter(student -> student.getGrade() < 5)
                                .count();
        System.out.println("Number of failed students: " + failedStudents);

    }
}
    class Student {
        private String name;
        private String group;
        private double grade;

        public Student(String name, String group, double grade) {
            this.name = name;
            this.group = group;
            this.grade = grade;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getGroup() {
            return group;
        }

        public void setGroup(String group) {
            this.group = group;
        }

        public double getGrade() {
            return grade;
        }

        public void setGrade(double grade) {
            this.grade = grade;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", group='" + group + '\'' +
                    ", grade=" + grade +
                    '}';
        }
    }



