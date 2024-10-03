package Lection1;

public class GasolineEngine implements IEngine, IMaintainable {
    private int cylinders;
    private int horsepower;

    public GasolineEngine(int cylinders, int horsepower) {
        this.cylinders = cylinders;
        this.horsepower = horsepower;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    @Override
    public void start(){
        System.out.println("Бензиновый двигатель с " + cylinders + " цилиндрами запущен.");
    }

    @Override
    public void stop(){
        System.out.println("Бензиновый двигатель цилиндрами остановлен.");
    }

    @Override
    public void maintain() {
        System.out.println("Бензиновый двигатель прошел техническое обслуживание.");
    }
}
