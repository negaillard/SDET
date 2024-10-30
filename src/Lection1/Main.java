package Lection1;

public class Main {
    public static void main(String[] args) {
        IEngine gasolineEngine = new GasolineEngine(4, 150);
        AbstractVehicle car = new Car("Toyota", "Красный",VehicleType.CAR, gasolineEngine, 4);

        IEngine electricEngine = new ElectricEngine(75, 300);
        AbstractVehicle truck = new Truck("Tesla", "Синий",VehicleType.TRUCK, electricEngine, 1000);

        AbstractVehicle motorcycle = new Motorcycle("Yamaha", "Черный",VehicleType.MOTORCYCLE, gasolineEngine, 1996);

        Garage<AbstractVehicle> garage = new Garage<>();
        Drug drug = new Drug("aspirin", 100);
        Vegetable vegetable = new Vegetable("aspirin", 900);
        System.out.println("грузовик до загрузки "+((Truck) truck).getAvailableCapacity());
        ((Truck) truck).loadCargo(drug);
        ((Truck) truck).loadCargo(vegetable);
        ((Truck) truck).loadCargo(vegetable);
        System.out.println("грузовик после загрузки "+((Truck) truck).getAvailableCapacity());
        garage.addVehicle(car);
        garage.addVehicle(truck);
        garage.addVehicle(motorcycle);

        garage.displayAllVehicles();

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

    public static void main2(String[] args){
        NumberChecker isDivisibleBy13 = number -> number % 13 == 0;

        int numberToCheck = 52;

        if (isDivisibleBy13.check(numberToCheck)) {
            System.out.println(numberToCheck + " делится на 13 без остатка.");
        } else {
            System.out.println(numberToCheck + " не делится на 13 без остатка.");
        }

        QuadraticEquation discriminant = (a, b, c) -> (b * b) - (4 * a * c);

        double a = 1.0, b = 2.0, c = -3.0;
        double result = discriminant.calculate(a, b, c);
        System.out.println("Дискриминант: " + result);
    }
}
