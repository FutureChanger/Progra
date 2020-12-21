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

    public static void main(String[] args) {
        Punkt x = new Punkt(1, 2);
        Punkt y = new Punkt(1, 3);
        Gerade z = new Gerade(x, y);
        String k = z.toString();
        System.out.println(k);
    }
}
