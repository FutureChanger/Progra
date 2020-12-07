/**
 * Diese Klasse erstellt einen SaisonKalender mit allen Verfügbarkeiten der Produkte
 */

public class SeasonalCalender {
    private Product[] pro;

    /**
     * Weisst dem Klassenattribut den Paramter zu
     *
     * @param products Ein Array aus Produkten
     */
    public SeasonalCalender(Product[] products) {
        this.pro = products;
    }

    /**
     * Greift den laengsten Produktnamen
     *
     * @return die Laenge des laengsten Produktnamens
     */
    public int getLongestProductName() {
        int currLength = pro[0].getNameProdukt().length();
        for (Product p : pro) {
            if (p.getNameProdukt().length() > currLength) {
                currLength = p.getNameProdukt().length();
            }
        }
        return currLength;
    }

    /**
     * Fuellt je nach Bedarf, den Eingabestring mit chars auf
     *
     * @param a Eingabewort
     * @param b die Laenge, wieviel aufzufuellen ist
     * @param c mit was aufzufuellen ist
     * @return einen aufgefuellten String
     */
    public String pad(String a, int b, char c) {
        if (a.length() < b) {
            StringBuilder str = new StringBuilder();
            str.append(a);
            while (str.length() < b) {
                str.append(c);
            }
            return str.toString();
        } else {
            return a;
        }
    }

    /**
     * Erstellt den SaisonKalender
     *
     * @return den SaisonKalender
     */
    public String stringify() {
        StringBuilder str = new StringBuilder();
        int length = getLongestProductName() + 2;
        str.append(pad("", length, ' ') + "JFMAMJJASOND" + System.lineSeparator());
        for (int i = 0; i < pro.length; i++) {
            str.append(pad(pro[i].getNameProdukt() + ": ", length, ' ') + pro[i].stringifyIsRegional() + System.lineSeparator() + pad("", length, ' ') + pro[i].stringifyIsImported() + System.lineSeparator());
        }
        System.out.println(str.toString());
        return str.toString();
    }
}
