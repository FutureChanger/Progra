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
                t = x;
                return t;
            }
        }
        return t;
    }

    void kannBedienen(Karte k) {
        Karte[] deck = this.kartenhand;
        String check = k.bedienbar(deck) ? this.spielerName + " kann bedienen!" : this.spielerName + " kann nicht bedienen!";
        System.out.println(check);
    }

    public static void main(String[] args) {
        Spieler elisabeth = new Spieler();
        Spieler klaus = new Spieler();
        Spieler helmut = new Spieler();
        Spieler erwin = new Spieler();

        elisabeth.spielerName = "Elisabeth";
        elisabeth.prozentualeSiegesquote = 37.5;

        klaus.spielerName = "Klaus";
        klaus.prozentualeSiegesquote = 12.5;

        helmut.spielerName = "Helmut";
        helmut.prozentualeSiegesquote = 38.75;

        erwin.spielerName = "Erwin";
        erwin.prozentualeSiegesquote = 11.25;

        Spieler best = Spieler.besterSpieler(helmut, elisabeth, klaus, erwin);

        Karte[] dreiElemente = {Karte.neueKarte(Farbe.HERZ, Wert.SIEBEN), Karte.neueKarte(Farbe.HERZ, Wert.NEUN), Karte.neueKarte(Farbe.KARO, Wert.KOENIG)};

        best.kartenhand = dreiElemente;

        best.kannBedienen(Karte.neueKarte(Farbe.KARO, Wert.BUBE));
    }

}
