package ro.unibuc.pao.lab10.collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListCollection {

    public static void main(String[] args) {
       //List = ordine + duplicate + acces prin index

        java.util.List<String> nume3 = new LinkedList<>(); //lista dublu inlantuita folosita atunci
        // cand avem de a face cu inserari/stergeri dese in interior

        //nu e de dorit
        ArrayList<String> nume2 = new ArrayList<>();

        java.util.List<String> nume = new ArrayList<>();
        nume.add("Ana");
        nume.add("Mihai");
        nume.add("Ana");
        nume.add("Catalin");

        System.out.println(nume.get(0));
        System.out.println(nume.getFirst());
        System.out.println(nume.getLast());
        System.out.println(nume.reversed());
    }
}
