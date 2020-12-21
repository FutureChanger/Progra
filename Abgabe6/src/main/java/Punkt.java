import java.math.*;

public class Punkt {

    final BigDecimal xKoordinate;
    final BigDecimal yKoordinate;

    public BigDecimal getxKoordinate() {
        return xKoordinate;
    }

    public BigDecimal getyKoordinate() {
        return yKoordinate;
    }

    public Punkt(BigDecimal x, BigDecimal y) {
        this.xKoordinate = x;
        this.yKoordinate = y;
    }

    public Punkt(double x, double y) {
        this.yKoordinate = new BigDecimal(y);
        this.xKoordinate = new BigDecimal(x);
    }

    public String toString() {
        return "(" + xKoordinate + "," + yKoordinate + ")";
    }

    BigDecimal abstand(Punkt other) {
        return BigDecimalUtility.sqrt((other.xKoordinate.subtract(this.xKoordinate).pow(2)).add((other.yKoordinate).subtract(this.yKoordinate).pow(2)));
    }

    public boolean equals(Object obj) {
        return obj instanceof Punkt && BigDecimalUtility.equalValues(((Punkt) obj).xKoordinate, this.xKoordinate) && BigDecimalUtility.equalValues(((Punkt) obj).yKoordinate, this.yKoordinate);
    }

}
