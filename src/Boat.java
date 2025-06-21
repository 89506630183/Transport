import interfaces.Cargo;
import interfaces.Screw;

class Boat extends Transport implements Screw, Cargo {

    public Boat() {
        super("Катер");
    }
}
