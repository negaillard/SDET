import java.util.ArrayList;
import java.util.List;

public class VehicleManager{
    private List<Vehicle> vehicles;

    public VehicleManager() {
        vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle){
        vehicles.add(vehicle);
    }

    public void displayAllVehicles(){
        if(vehicles.isEmpty()){
            System.out.println("Нет доступных транспортных средств");
            return;
        }
        System.out.println("Список доступных транспортных средств");
        for(Vehicle vehicle : vehicles){
            System.out.println("-" + vehicle.getBrand() + " " + vehicle.getType());
        }
    }

    public void findVehicleByBrand(String brand){
        boolean found = false;
        for(Vehicle vehicle : vehicles){
            if(vehicle.getBrand().equalsIgnoreCase(brand)){
                System.out.println("найдено транспортное средство: " + vehicle.getBrand() + " " + vehicle.getType());
                found = true;
            }
        }
        if(!found){
            System.out.println("Транспортное средство " + brand + " не найдено");
        }
    }
}
