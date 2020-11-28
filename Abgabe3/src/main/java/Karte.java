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
}
