public class Karte {

    Farbe farbe;
    Wert wert;

    public String toString() {
        return farbe.toString() + wert.toString();
    }

    static Karte neueKarte(Farbe f, Wert w) {
        Karte neu = new Karte();
        neu.farbe = f;
        neu.wert = w;
        return neu;
    }

    static Karte neueKarte(String f, String w) {
        Karte neu2 = new Karte();
        neu2.farbe = Farbe.valueOf(f);
        neu2.wert = Wert.valueOf(w);
        return neu2;
    }

    static int kombinationen() {
        int a = Wert.values().length;
        int b = Farbe.values().length;
        return a * b;
    }

    boolean bedient(Karte other) {
        if (this.wert.toString().contentEquals("BUBE")) {
            return true;
        } else if (this.farbe.toString().contentEquals(other.farbe.toString())) {
            return true;
        } else return this.wert.toString().contentEquals(other.wert.toString());
    }

    boolean bedienbar(Karte... karten) {
        for (Karte x : karten) {
            if(this.bedient(x)) {
                return true;
            }
        }
        return false;
    }
}
