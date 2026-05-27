package ro.unibuc.pao.lab12.functional;

import java.util.List;
import java.util.stream.Collectors;

@FunctionalInterface
interface GradeTransformer {
    double transform(double grade);
}
public class Ex3 {
    public static void main(String[] args) {
        List<Double> grades = List.of(4.25, 5.70, 8.90, 9.80, 10.00);

        System.out.println("Original grades:");

        System.out.println(grades);

        System.out.println("Grades after bonus");

        List<Double> gradesAfterBonus = transformGrades(grades,
                grade -> Math.min(grade + 1, 10));

        System.out.println(gradesAfterBonus);

        List<Double> percentageScale = transformGrades(grades, grade -> grade*10);

        System.out.println("Percentage scale: " + percentageScale);


        List<Double> roundedGrades = transformGrades(grades, grade -> Math.round(grade));

        System.out.println("Rounded grades: " + roundedGrades);
    }

    public static List<Double> transformGrades(List<Double> grades,
                                               GradeTransformer transformer) {

        return grades.stream()
                .map(transformer::transform)
                .collect(Collectors.toList());
    }
}
