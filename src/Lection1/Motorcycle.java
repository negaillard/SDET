public class Motorcycle extends Vehicle implements IMaintainable{
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
