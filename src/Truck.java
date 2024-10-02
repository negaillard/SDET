public class Truck extends Vehicle implements IMaintainable{
    private IEngine engine;
    private int cargoCapacity;

    public Truck(String brand, String color, VehicleType type, IEngine engine, int cargoCapacity){
        super(brand, color, type);
        this.engine = engine;
        this.cargoCapacity =cargoCapacity;
    }

    @Override
    public void move(){
        engine.start();
        System.out.println(brand + " " + color + " грузовик движется");
    }

    @Override
    public void maintain(){
        System.out.println("Грузовик прошел техобслуживание");
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }
}
