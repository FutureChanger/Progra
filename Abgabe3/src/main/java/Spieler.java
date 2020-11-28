public class Spieler {

    Karte[] kartenhand;
    String spielerName;
    double prozentualeSiegesquote;


    public String toString() {
        return this.spielerName;
    }

    static Spieler besterSpieler(Spieler... club) {
        double tempQuote = club[0].prozentualeSiegesquote;
        Spieler t = club[0];
        for (Spieler x : club) {
            if (x.prozentualeSiegesquote > tempQuote) {
                t=x;
                return t;
            }
        }
        return t;
    }

}
