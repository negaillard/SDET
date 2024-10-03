package Lection1;

import java.util.ArrayList;
import java.util.List;

public class Garage <T extends AbstractVehicle> {
    private List<T> vehicles;
    public Garage(List<T> initialVehicles) {
        vehicles = new ArrayList<>(initialVehicles);
    }
    public Garage() {
        vehicles = new ArrayList<>();
    }

    public void addVehicle(T vehicle) {
        vehicles.add(vehicle);
        System.out.println(vehicle.getBrand() + " добавлен в гараж.");
    }

    public void displayAllVehicles() {
        if (vehicles.isEmpty()) {
            System.out.println("Гараж пуст.");
            return;
        }

        System.out.println("Список всех транспортных средств в гараже:");
        for (T vehicle : vehicles) {
            System.out.println("- " + vehicle.getBrand());
        }
    }

    public void findVehicleByBrand(String brand) {
        boolean found = false;

        for (T vehicle : vehicles) {
            if (vehicle.getBrand().equalsIgnoreCase(brand)) {
                System.out.println("Найдено транспортное средство: " + vehicle.getBrand());
                found = true;
            }
        }

        if (!found) {
            System.out.println("Транспортное средство с брендом \"" + brand + "\" не найдено.");
        }
    }
}
