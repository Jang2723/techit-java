package d6.vehicles;

import d6.vehicles.Beeper;
import d6.vehicles.Car;
import d6.vehicles.Ship;

public class InterfaceMain {
    public static void main(String[] args) {
        Car car = new Car();
        Ship ship = new Ship();
        makeNoise(car);
        makeNoise(ship);
    }

    public static void makeNoise(Beeper beeper){
        beeper.beep();
    }
}
