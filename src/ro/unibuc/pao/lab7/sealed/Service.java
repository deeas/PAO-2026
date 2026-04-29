package ro.unibuc.pao.lab7.sealed;

public sealed interface Service permits Car, Truck {
    int getMaxServiceIntervalInMonths();

    default int getMaxDistanceBetweenServicesInKilometers() {
        return 100000;
    }
}
