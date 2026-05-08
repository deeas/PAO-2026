package ro.unibuc.pao.lab10.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetCollection {
    public static void main(String[] args) {
        //Set = unicitate

        Set<String> grupeHashSet = new HashSet<>();

        grupeHashSet.add("MI21");
        grupeHashSet.add("MI22");
        grupeHashSet.add("MI21");

        System.out.println(grupeHashSet);

        Set<String> grupeLinkedHashSet = new LinkedHashSet<>();

        grupeLinkedHashSet.add("MI21");
        grupeLinkedHashSet.add("MI24");
        grupeLinkedHashSet.add("MI21");
        grupeLinkedHashSet.add("MI22");

        System.out.println(grupeLinkedHashSet);


        Set<String> grupeTreeSet = new TreeSet<>();

        grupeTreeSet.add("MI21");
        grupeTreeSet.add("MI24");
        grupeTreeSet.add("MI21");
        grupeTreeSet.add("MI22");

        System.out.println(grupeTreeSet);

    }
}
