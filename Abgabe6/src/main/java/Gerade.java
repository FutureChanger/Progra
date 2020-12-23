import java.math.*;

public class Gerade {

    private final Punkt p1;
    private final Punkt p2;

    public Punkt getP1() {
        return p1;
    }

    public Punkt getP2() {
        return p2;
    }

    public Gerade(Punkt p1, Punkt p2) {
        if (p1.equals(p2)) {
            this.p1 = null;
            this.p2 = null;
        } else {
            if (p1.getxKoordinate().compareTo(p2.getxKoordinate()) < 0) {
                this.p1 = p1;
                this.p2 = p2;
            } else if (p1.getxKoordinate().compareTo(p2.getxKoordinate()) == 0) {
                if (p1.getyKoordinate().compareTo(p2.getyKoordinate()) < 0) {
                    this.p1 = p1;
                    this.p2 = p2;
                } else {
                    this.p1 = p2;
                    this.p2 = p1;
                }
            } else {
                this.p2 = p1;
                this.p1 = p2;
            }
        }
    }

    @Override
    public String toString() {
        return "Gerade durch " + p1.toString() + " und " + p2.toString();
    }

    boolean zwischenp1p2(Punkt p0) {
        return p1.abstand(p0).add(p0.abstand(p2)).equals(p1.abstand(p2));
    }

    boolean vorp1(Punkt p0) {
        return p0.abstand(p1).add(p1.abstand(p2)).equals(p0.abstand(p2)) && p0.abstand(p1).compareTo(p0.abstand(p2)) < 0;
    }

    boolean hinterp2(Punkt p0) {
        return p1.abstand(p2).add(p2.abstand(p0)).equals(p1.abstand(p0)) && p2.abstand(p0).compareTo(p1.abstand(p0)) < 0;
    }

    public boolean enthaelt(Punkt p0) {
        if (zwischenp1p2(p0)) {
            return true;
        } else if (vorp1(p0)) {
            return true;
        } else {
            return hinterp2(p0);
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj.getClass().equals(this.getClass())) { //getClass -> instance of unterschied?
            return this.enthaelt(((Gerade) obj).p1) && this.enthaelt(((Gerade) obj).p2);
        } else {
            return false;
        }
    }
}
