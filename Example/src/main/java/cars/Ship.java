package cars;

public class Ship extends Car{
    @Override
    public void move() {
        System.out.println("корабль движется со скоростью" + speed);
    }
}
