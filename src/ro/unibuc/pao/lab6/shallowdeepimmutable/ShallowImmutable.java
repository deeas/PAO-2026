package ro.unibuc.pao.lab6.shallowdeepimmutable;


final class Course {
    private final String name;
    private final StringBuilder code;

    public Course(String name, StringBuilder code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public StringBuilder getCode() {
        return code;
    }
}
public class ShallowImmutable {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("PAO");

        Course c = new Course("Programare", sb);

        sb.append("J");
        System.out.println(c.getCode());
    }
}
