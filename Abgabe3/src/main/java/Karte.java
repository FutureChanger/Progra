import java.util.Arrays;

public class Karte {

    Farbe farbe;
    Wert wert;

    public String toString() {
        return this.farbe.toString() + this.wert.toString();
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

    static Karte[] skatblatt() {
        int arrayLength = kombinationen();
        Karte[] deck = new Karte[arrayLength];
        int x = 0;
        Farbe[] f = Farbe.values();
        Wert[] w = Wert.values();
        for (int i = 0; i < Farbe.values().length; i++) {
            for (int t = 0; t < Wert.values().length; t++) {
                deck[x] = Karte.neueKarte(f[i], w[t]);
                x++;
            }
        }
        return deck;
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
            if (this.bedient(x)) {
                return true;
            }
        }
        return false;
    }

    public static void druckeEinbahnBedienungen() {
        Karte[] deckToIterate = skatblatt();
        for (int i = 0; i < deckToIterate.length - 1; i++) {
            for (int k = 0; k < deckToIterate.length - 1; k++) {
                if (deckToIterate[i] != deckToIterate[k]) {
                    if (deckToIterate[i].bedient(deckToIterate[k]) && !(deckToIterate[k].bedient(deckToIterate[i]))) {
                        System.out.println(deckToIterate[i] + " bedient " + deckToIterate[k] + " aber " + deckToIterate[k] + " nicht " + deckToIterate[i]);
                    }
                }
            }
        }
    }
}