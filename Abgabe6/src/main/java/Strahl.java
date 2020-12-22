public class Strahl extends Gerade {

    final Punkt startPunkt;
    final Punkt zweiterPunkt;

    public Strahl(Punkt x, Punkt y) {
        super(x, y);
        this.startPunkt = x;
        this.zweiterPunkt = y;
    }

    boolean startsFromp1() {
        return startPunkt.equals(p1);
    }

    boolean startsFromp2() {
        return zweiterPunkt.equals(p2);
    }

    @Override
    public String toString() {
        return "Der Strahl startet im Punkt: " + startPunkt.toString() + " und geht durch den Punkt: " + zweiterPunkt.toString();
    }

    Gerade verlaengern() {
        return new Gerade(startPunkt, zweiterPunkt);
    }

    @Override
    public boolean enthaelt(Punkt p0) {
        if (zwischenp1p2(p0)) {
            return true;
        } else return hinterp2(p0);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj.getClass().equals(this.getClass())) {
            return this.enthaelt(((Strahl) obj).startPunkt) && this.enthaelt(((Strahl) obj).zweiterPunkt);
        } else {
            return false;
        }
    }
}

