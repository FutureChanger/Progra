public class Strahl extends Gerade {

    final Punkt startPunkt;
    final Punkt zweiterPunkt;

    public Strahl(Punkt x, Punkt y) {
        super(x, y);
        this.startPunkt = p1;
        this.zweiterPunkt = p2;
    }

    boolean startsFromp1(Punkt x) {
        return x.equals(p1);
    }

    boolean startsFromp2(Punkt y) {
        return y.equals(p1);
    }

    @Override
    public String toString() {
        return "Der Strahl startet im Punkt: " + startPunkt.toString() + " und geht durch den Punkt: " + zweiterPunkt.toString();
    }
}

