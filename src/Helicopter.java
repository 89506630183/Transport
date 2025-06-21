import interfaces.Cargo;
import interfaces.Screw;
import interfaces.Wheeled;

class Helicopter extends Transport implements Wheeled, Screw, Cargo {

    public Helicopter() {
        super("Вертолет");
    }
}
