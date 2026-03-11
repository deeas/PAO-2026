package ro.unibuc.pao.lab2.arrays;

public class Example1 {
    public static void main(String[] args) {
        float value[] = new float[3];
        float[] values2 = new float[4];

        value[0] = 10.0f;
        value[1] = 10.0f;
        value[2] = 11.0f;

        float sum = 0.0f;

        for (int i = 0; i< value.length; i++) {
            sum += value[i];
        }

        System.out.println("Suma: " + sum);

        for (float name : value) {
            sum += name;
        }

        System.out.println("with enhanced for: " + sum);
     }



}
