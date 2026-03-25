package ro.unibuc.pao.lab5.stringbuilder;

/* Construiți un șir cu primele 100 de numere naturale separate prin , :
    •	o dată folosind concatenare cu String;
	•	o dată folosind StringBuilder. */
public class MainClass {
    public static void main(String[] args) {
        String s = "";
        for (int i = 1; i <= 100; i++) {
            if (i > 1) {
                s += ", ";
            }
            s += i;
        }
        System.out.println(s);

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 100; i++) {
            if (i > 1) {
                sb.append(", ");
            }
            sb.append(i);
        }
        System.out.println(sb.toString());
    }
}