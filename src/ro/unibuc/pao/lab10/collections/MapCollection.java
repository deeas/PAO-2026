package ro.unibuc.pao.lab10.collections;

import java.util.HashMap;
import java.util.Map;

public class MapCollection {
    public static void main(String[] args) {
        Map<String, Integer> frecventa = new HashMap<>();

        String[] cuvinte = { "ana", "are", "mere", "ana", "mere"};

        for (String cuvant:cuvinte) {
            frecventa.merge(cuvant, 1, Integer::sum);
        }

        System.out.println(frecventa);
    }
}
