package ro.unibuc.pao.lab10.collections;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueCollection {
    public static void main(String[] args) {
        Queue<String> coada = new ArrayDeque<>();

        coada.offer("Ana");
        coada.offer("Mihai");
        coada.offer("Ioana");

        System.out.println("Peek: " + coada.peek());//Ana
        System.out.println("Coada" + coada);

        System.out.println("Poll: " + coada.poll()); //Ana
        System.out.println("Coada" + coada);

        System.out.println("Peek: " + coada.peek()); //Mihai
        System.out.println("Coada" + coada);

        System.out.println("Poll: " + coada.poll()); //Ioana
        System.out.println("Coada" + coada);

    }
}
