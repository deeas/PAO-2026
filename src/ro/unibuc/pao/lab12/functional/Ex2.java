package ro.unibuc.pao.lab12.functional;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

/*
String text = "Ana are mere. Ana are pere. Merele sunt bune, perele sunt bune.";
Using streams:

1. Convert the text to lowercase.
2. Remove punctuation marks.
3. Split the text into words.
4. Count the frequency of each word.
5. Display the words sorted alphabetically.
6. Display the most frequent word.

What to use:
Arrays.stream(...)
map(...)
filter(...)
collect(Collectors.groupingBy(...))
Collectors.counting()
Map.Entry.comparingByKey()
max(...)
Optional
 */
public class Ex2 {
    public static void main(String[] args) {
        String text = "Ana are mere. Ana are pere. Merele sunt bune, perele sunt bune.";

        Map<String, Long> wordFreq = Arrays.stream(
                        text.toLowerCase()
                                .replaceAll("[.,!?;:]", "")
                                .split("\\s+"))
                .filter(word -> !word.isBlank())
                .collect(Collectors.groupingBy(word -> word, Collectors.counting()));

        System.out.println("Word frequencies:");

        wordFreq.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(entry -> System.out.println(entry.getKey() + " ->" + entry.getValue()));
        wordFreq.entrySet()
                .stream()
                .max(Map.Entry.comparingByKey())
                .ifPresent(entry -> System.out.println(entry.getKey() + " ->" + entry.getValue()));

    }



}
