public class Main {
    public static void main(String[] args) {
        IEngine gasolineEngine = new GasolineEngine(4, 150);
        Vehicle car = new Car("Toyota", "Красный",VehicleType.CAR, gasolineEngine, 4);

        IEngine electricEngine = new ElectricEngine(75, 300);
        Vehicle truck = new Truck("Tesla", "Синий",VehicleType.TRUCK, electricEngine, 1000);

        Vehicle motorcycle = new Motorcycle("Yamaha", "Черный",VehicleType.MOTORCYCLE, gasolineEngine);

        // Используем параметризованный класс Garage
        Garage<Vehicle> garage = new Garage<>();

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

        System.out.println("Всего транспортных средств: " + Vehicle.getTotalVehicles());
    }
}