package ro.unibuc.pao.lab12.functional;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex4 {
    public static void main(String[] args) {
        Path path = Path.of("students.txt");

        try(Stream<String> lines = Files.lines(path)) {
            List<Student> students =  lines.map(Ex4::parseStudent)
                    .flatMap(Optional::stream)
                    .toList();
            System.out.println("All valid students: ");

            students.forEach(System.out::println);

            Map<String, Double> averageByGroup = students.stream()
                    .collect(Collectors.groupingBy(Student::getGroup, Collectors.averagingDouble(Student::getGrade)
                    ));

            averageByGroup.entrySet().stream().sorted(Map.Entry.comparingByKey())
                    .forEach(entry -> System.out.println(entry.getKey() + " -" + entry.getValue()));

        } catch (IOException e) {
            System.out.println("Error while reading the file. " + e.getMessage());
        }
    }

    private static Optional<Student> parseStudent(String line) {
        String[] parts = line.split(",");

        if (parts.length !=3) {
            System.out.println("Invalid line: " + line);
            return Optional.empty();
        }

        String name = parts[0].trim();
        String group = parts[1].trim();

        try {
            double grade = Double.parseDouble(parts[2]);

            if (grade < 1 || grade > 10) {
                System.out.println("Invalid grade " + grade);
                return Optional.empty();
            }
            return Optional.of(new Student(name, group, grade));
        } catch (NumberFormatException ex) {
            System.out.println("Invalid grade: " + parts[2]);
            return Optional.empty();
        }

    }

}
