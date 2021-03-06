public class Strecke extends Strahl {


    public Strecke(Punkt x, Punkt y) {
        super(x, y);
    }

    @Override
    public boolean enthaelt(Punkt p0) {
        return this.zwischenp1p2(p0);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj.getClass().equals(this.getClass())) {
            return this.enthaelt(((Strecke) obj).getP1()) && this.enthaelt(((Strecke) obj).getP2());
        } else {
            return false;
        }
    }

    Strahl verlaengern(boolean swap) {
        if (swap) {
            return new Strahl(this.getP1(), this.getP2());
        } else {
            return new Strahl(this.getP2(), this.getP1());
        }
    }
}
