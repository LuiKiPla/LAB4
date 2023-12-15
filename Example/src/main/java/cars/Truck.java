package cars;

public class Truck extends Car{

    @Override
    public void move() {
        System.out.println("грузовик движется со скоростью" + speed);
    }
}
