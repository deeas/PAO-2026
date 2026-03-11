package ro.unibuc.pao.lab2.arrays;

import java.util.Arrays;

public class Exemple3 {
    public static void main(String[] args) {
        float value[] = new float[3];
        float[] values2 = new float[4];

        value[0] = 10.0f;
        value[1] = 15.0f;
        value[2] = 11.0f;

        Arrays.sort(value);

        System.out.println("Sorted array: ");

        for (int i = 0; i < value.length; i++) {
            System.out.println(value[i]);
        }

        long[] array1 = {12L, 56L, 9999L};
        long[] array2 = {1L, 2L, 3L};

        boolean equals = Arrays.equals(array1, array2);

        System.out.println("The arrays are equal? " + equals);


        int valSearched1 = Arrays.binarySearch(value, 10.f);

        System.out.println("first value searched is at index: " + valSearched1);
    }
}
