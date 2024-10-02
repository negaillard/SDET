public abstract class Vehicle {
    private static int totalVehicles = 0;
    protected String brand;
    protected String color;
    protected VehicleType type;

    public Vehicle(String brand, String color, VehicleType type){
        this.brand = brand;
        this.color = color;
        this.type = type;
        totalVehicles++;
    }

    public static int getTotalVehicles() {
        return totalVehicles;
    }

    public abstract void move();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }
    public VehicleType getType(){return type;}
}
