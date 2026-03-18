package ro.unibuc.pao.lab4.mostenire;

import java.util.HashSet;
import java.util.Set;

public class Ex1 {
    public static void main(String[] args) {
        Student s1 = new Student("Ana Popescu", 20, "Info", 2, 9.45);
        Student s2 = new Student("Mircea Popescu", 21, "Mate", 2, 7.80);
        Student s3 = new Student("Ana Blandiana", 20, "Info", 3, 4.90);
        Student s5 = new Student("Ana Blandiana", 20, "Info", 3, 4.90);
        Student s6 = new Student("Ana1 Blandiana", 20, "Info", 3, 4.90);



        Student s4 = s1;

        System.out.println(s1.toString());
        System.out.println(s2);
        System.out.println(s3);

        System.out.println("S4 equals s1: " + s4.equals(s1));
        System.out.println("S4 == s1: " + (s4 == s1));

        System.out.println("S3 equals s5: " + s3.equals(s5));
        System.out.println("S3 == s5: " + (s3 == s5));

        Set<Student> set =new HashSet<>();
        set.add(s5);
        set.add(s2);
        set.add(s6);


        System.out.println(set.size());
        System.out.println(set);
    }
}
