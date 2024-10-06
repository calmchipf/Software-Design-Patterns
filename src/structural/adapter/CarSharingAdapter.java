package structural.adapter;

import structural.Passenger;
import structural.Driver;

public class CarSharingAdapter implements TaxiService{
    private CarSharing carSharing;

    public CarSharingAdapter(CarSharing carSharing) {
        this.carSharing = carSharing;
    }

    @Override
    public void requestTaxi(Passenger passenger) {
        Driver driver = new Driver(); // This assumes a driver can be created or should be passed to the method.
        carSharing.rentFreeCar(driver);
        passenger.setCar(driver.getCar());
    }
}
