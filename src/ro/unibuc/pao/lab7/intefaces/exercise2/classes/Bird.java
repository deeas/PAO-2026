package ro.unibuc.pao.lab7.intefaces.exercise2.classes;

public interface Bird extends BaseClass {

    default boolean hasFeathers() {
        return true;
    }
}
