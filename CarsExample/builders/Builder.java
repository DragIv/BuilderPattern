package CarsExample.builders;

import CarsExample.cars.CarType;
import CarsExample.components.Engine;
import CarsExample.components.GPSNavigator;
import CarsExample.components.Transmission;
import CarsExample.components.TripComputer;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
