import java.math.*;

public class Gerade {

    final Punkt p1;
    final Punkt p2;

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
            if (p1.xKoordinate.compareTo(p2.xKoordinate) < 0) {
                this.p1 = p1;
                this.p2 = p2;
            } else if (p1.xKoordinate.compareTo(p2.xKoordinate) == 0) {
                if (p1.yKoordinate.compareTo(p2.yKoordinate) < 0) {
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

    public String toString() {
        return "Gerade durch " + p1.toString() + " und " + p2.toString();
    }

    boolean zwischenp1p2(Punkt p0) {
        return p1.abstand(p0).add(p0.abstand(p2)).equals(p1.abstand(p2));
    }

    boolean vorp1(Punkt p0) {
        return p0.abstand(p1).add(p1.abstand(p2)).equals(p0.abstand(p2)) && p0.abstand(p1).compareTo(p0.abstand(p2)) < 0;
    }

    boolean hinterp1(Punkt p0) {
        return p1.abstand(p2).add(p2.abstand(p0)).equals(p1.abstand(p0)) && p2.abstand(p0).compareTo(p1.abstand(p2)) < 0;
    }

    public boolean enthaelt(Punkt p0) {
        if (zwischenp1p2(p0)) {
            return true;
        } else if (vorp1(p0)) {
            return true;
        } else return hinterp1(p0);
    }

    public boolean equals(Object obj) {
        if (obj.getClass().equals(this.getClass())) { //getClass -> instance of unterschied?
            return this.enthaelt(((Gerade) obj).p1) && this.enthaelt(((Gerade) obj).p2);
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Punkt x = new Punkt(1, 2);
        Punkt y = new Punkt(1, 3);
        Gerade z = new Gerade(x, y);
        String k = z.toString();
        System.out.println(k);
    }
}
