package Lection1;

public class Car extends Vehicle implements IMaintainable{
    private IEngine engine;
    private int doors;

    public Car(String brand, String color, VehicleType type, IEngine engine, int doors){
        super(brand,color,type);
        this.engine = engine;
        this.doors = doors;
    }

    @Override
    public void move(){
        engine.start();
        System.out.println(brand + " " + color + "автомобиль движется");
        engine.stop();
    }
    @Override
    public void maintain(){
        System.out.println("Автомобиль прошел техобслуживание");
    }

    public int getDoors() {
        return doors;
    }

    private void setDoors(int doors){
        this.doors = doors;
    }
}
