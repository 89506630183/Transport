import interfaces.Cargo;
import interfaces.Wheeled;

class Truck extends Transport implements Wheeled, Cargo {

    public Truck() {
        super("Грузовик");
    }
}
