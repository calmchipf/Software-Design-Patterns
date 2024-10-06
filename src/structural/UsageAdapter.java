package structural;

import structural.Passenger;
import structural.adapter.CarSharing;
import structural.adapter.CarSharingAdapter;
import structural.adapter.TaxiService;

public class UsageAdapter {
    public static void start(){
        Passenger passenger = new Passenger();
        Car car = new Car();
        CarSharing carSharing = new CarSharing(car);

        TaxiService taxiService = new CarSharingAdapter(carSharing);
        taxiService.requestTaxi(passenger);
    }
}
