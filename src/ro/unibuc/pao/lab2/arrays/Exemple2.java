package ro.unibuc.pao.lab2.arrays;

public class Exemple2 {

    public static void main(String[] args) {
        float[] values = {10.0f, 20.0f, 15.0f};

        float sum = 0.0f;

        for (int i = 0; i< values.length; i++) {
            sum += values[i];
        }

        System.out.println("The sum of array values: " + sum);
    }

}
