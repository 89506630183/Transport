import interfaces.Cargo;
import interfaces.Screw;

class Tanker extends Transport implements Screw, Cargo {

    public Tanker() {
        super("Танкер");
    }
}
