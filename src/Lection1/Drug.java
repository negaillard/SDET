package Lection1;

public class Drug extends Cargo{
    String name;
    public Drug(String name, int weight) {
        super(weight);
        this.name = name;
    }
}
