package ro.unibuc.pao.lab5.strings;

/* Pentru șirul: "  Ana   are  2 mere, 10 pere și  7 prune.  "
Să se afișeze:
    •	textul fără spații la capete;
	•	textul cu spații multiple reduse la unul singur;
	•	toate numerele extrase;
	•	dacă textul conține un nume care începe cu literă mare urmată de litere mici.*/

public class Ex4 {
    public static void main(String[] args) {
        String s = "  Ana   are  2 mere, 10 pere și  7 prune.  ";

        String cleaned = s.strip();
        System.out.println(cleaned);

        cleaned = cleaned.replaceAll("[ ]{2,}", " ");
        System.out.println(cleaned);

        String[] numbers = cleaned.split("[^0-9]+");
        for (String nr : numbers) {
            if (!nr.isEmpty()) {
                System.out.println("Numar " + nr);
            }
        }

        boolean hasCapitalizedWord = cleaned.matches(".*\\b[A-Z][a-z]+\\b.*");
        System.out.println("Are cuvant de forma Nume? " + hasCapitalizedWord);
    }
}
