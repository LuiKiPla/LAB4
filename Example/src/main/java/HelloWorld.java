import cars.*;

import java.util.List;

public class HelloWorld {
    public static void main(String[] args) {
        Truck truck = new Truck();
        truck.setSpeed(5);
        Ship ship = new Ship();
        ship.setSpeed(4);
        List<Car> cars = List.of(truck,ship);
        for (Car car:cars) {
            car.move();
        }
    }
}
