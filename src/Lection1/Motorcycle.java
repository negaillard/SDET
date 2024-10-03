package Lection1;

public class Motorcycle extends AbstractVehicle implements IMaintainable{
    private IEngine engine;
    public Motorcycle(String brand, String color, VehicleType type, IEngine engine) {
        super(brand, color, type);
        this.engine = engine;
    }

    @Override
    public void maintain() {
        System.out.println("Мотоцикл прошел техобслуживание");
    }

    @Override
    public void move() {
        engine.start();
        System.out.println(brand + " " + color + " мотоцикл движется.");
        engine.stop();
    }
}
