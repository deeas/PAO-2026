package ro.unibuc.pao.lab5.strings;

public class Ex3 {
    public static void main(String[] args) {
        String s1 = "java";
        String s2 = "java";
        String s3 = new String("java");
        String s4 = new String("java");

        System.out.println(s1 == s2); //true
        System.out.println(s3 == s4); // false
        System.out.println(s1.equals(s3)); //true

        String text = "programare";
        text.toUpperCase();
        System.out.println(text); //programare

        text = text.toUpperCase();
        System.out.println(text); //PROGRAMARE

    }
}
