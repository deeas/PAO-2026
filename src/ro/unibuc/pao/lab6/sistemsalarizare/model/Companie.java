package ro.unibuc.pao.lab6.sistemsalarizare.model;



import java.util.*;

public class Companie {
    private final List<Angajat> angajati = new ArrayList<>();

    public List<Angajat> getAngajati() {
        return Collections.unmodifiableList(angajati);
    }

    public void addAngajat(Angajat angajat) {
        angajati.add(angajat);
    }

    public Angajat cautaDupaCod(String cod) {
        for (Angajat a : angajati) {
            if (a.getCod().equals(cod)) {
                return a;
            }
        }
        return null;

    }

    public double salariuTotal() {
        double total = 0;

        for (Angajat a : angajati) {
            total += a.calculeazaSalariu();
        }
        return total;
    }

    public Angajat salariuMaxim() {

        if (angajati.isEmpty()) {
            return null;
        }

        Angajat max = angajati.getFirst();

        for (Angajat a : angajati) {
            if (a.calculeazaSalariu() > max.calculeazaSalariu()) {
                max = a;
            }
        }
        return max;
    }

    public Map<String, Double> mediaSalariilorPeTip() {

        Map<String, Double> suma = new LinkedHashMap<>();
        Map<String, Integer> count = new LinkedHashMap<>();

        for (Angajat a : angajati) {

            suma.put(a.getTip(), suma.getOrDefault(a.getTip(), 0.0) + a.calculeazaSalariu());
            count.put(a.getTip(), count.getOrDefault(a.getTip(), 0) + 1);

        }

        Map<String, Double> medii = new LinkedHashMap<>();

        for (String tip : suma.keySet()) {

            medii.put(tip, suma.get(tip) / count.get(tip));

        }

        return medii;

    }

    public String genereazaRaport() {

        StringBuilder sb = new StringBuilder();
        sb.append("=== RAPORT COMPANIE ===\n");
        for (Angajat a : angajati) {
            sb.append(a).append("\n");
        }

        sb.append("\n=== MEDII PE TIP ===\n");

        for (Map.Entry<String, Double> e : mediaSalariilorPeTip().entrySet()) {
            sb.append(e.getKey())
                    .append(" -> ")
                    .append(String.format(Locale.US, "%.2f", e.getValue()))
                    .append("\n");
        }

        sb.append("\n=== SALARIU TOTAL ===\n");

        sb.append(String.format(Locale.US, "%.2f", salariuTotal())).append("\n");

        sb.append("\n=== SALARIU MAXIM ===\n");

        Angajat max = salariuMaxim();

        if (max != null) {
            sb.append(max.getNume())
                    .append(" (")
                    .append(max.getTip())
                    .append(") -> ")
                    .append(String.format(Locale.US, "%.2f", max.calculeazaSalariu()))
                    .append("\n");
        }

        return sb.toString();
    }
}
