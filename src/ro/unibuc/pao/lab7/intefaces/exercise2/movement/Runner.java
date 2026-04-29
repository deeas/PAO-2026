package ro.unibuc.pao.lab7.intefaces.exercise2.movement;

public interface Runner extends BaseMovement {
    @Override
    default void move() {
        System.out.println("I can run!");
    }
}
