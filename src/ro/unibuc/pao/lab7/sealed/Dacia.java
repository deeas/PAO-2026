package ro.unibuc.pao.lab7.sealed;

public class Dacia extends Car {
    private int fabricationYear;

    public Dacia(String registrationNumber, int numberOfSeats, int fabricationYear) {
        super(registrationNumber, numberOfSeats);
        this.fabricationYear = fabricationYear;
    }
}
