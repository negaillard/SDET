package Lection1;

public class Main {
    public static void main(String[] args) {
        IEngine gasolineEngine = new GasolineEngine(4, 150);
        AbstractVehicle car = new Car("Toyota", "Красный",VehicleType.CAR, gasolineEngine, 4);

        IEngine electricEngine = new ElectricEngine(75, 300);
        AbstractVehicle truck = new Truck("Tesla", "Синий",VehicleType.TRUCK, electricEngine, 1000);

        AbstractVehicle motorcycle = new Motorcycle("Yamaha", "Черный",VehicleType.MOTORCYCLE, gasolineEngine);

        // Используем параметризованный класс Garage
        Garage<AbstractVehicle> garage = new Garage<>();

        garage.addVehicle(car);
        garage.addVehicle(truck);
        garage.addVehicle(motorcycle);

        garage.displayAllVehicles();

        // Поиск по бренду
        garage.findVehicleByBrand("Tesla");
        garage.findVehicleByBrand("BMW");

        car.move();
        ((Car) car).maintain();

        truck.move();
        ((Truck) truck).maintain();

        motorcycle.move();
        ((Motorcycle) motorcycle).maintain();

        System.out.println("Всего транспортных средств: " + AbstractVehicle.getTotalVehicles());
    }
}