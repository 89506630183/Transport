import interfaces.Cargo;
import interfaces.Screw;
import interfaces.Wheeled;
import interfaces.Winged;

class Airplane extends Transport implements Wheeled, Screw, Winged, Cargo {

    public Airplane() {
        super("Самолет");
    }
}
