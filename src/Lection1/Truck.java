package Lection1;

import java.util.ArrayList;
import java.util.List;

public class Truck extends AbstractVehicle implements IMaintainable, ILoad{
    private IEngine engine;
    private int cargoCapacity;
    private int availableCapacity;
    private List<Object> cargoList = new ArrayList<>();

    public Truck(String brand, String color, VehicleType type, IEngine engine, int cargoCapacity){
        super(brand, color, type);
        this.engine = engine;
        this.cargoCapacity =cargoCapacity;
        this.availableCapacity = cargoCapacity;
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


    @Override
    public void loadCargo(Cargo cargo) {
        if (cargo.getWeight() <= availableCapacity) {
            cargoList.add(cargo);
            availableCapacity -= cargo.getWeight();
            System.out.println("загрузка груза прошла успешно");
        }
        else{
            System.out.println("места не хватает");
        }
    }

    public int getAvailableCapacity() {
        return availableCapacity;
    }


}
