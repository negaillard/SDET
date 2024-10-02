public class ElectricEngine implements IEngine, IMaintainable{
    private int batteryCapacity;
    private int range;

    public ElectricEngine(int batteryCapacity, int range) {
        this.batteryCapacity = batteryCapacity;
        this.range = range;
    }

    @Override
    public void start() {
        System.out.println("Электрический двигатель с " + batteryCapacity + " кВт/ч батареей запущен.");
    }

    @Override
    public void stop() {
        System.out.println("Электрический двигатель остановлен");
    }

    @Override
    public void maintain() {
        System.out.println("Электрический двигатель прошел техническое обслуживание.");
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }
}
