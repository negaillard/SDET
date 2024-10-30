package Lection1;

public interface ILoad<T extends Cargo> {
    void loadCargo(T t);
}
