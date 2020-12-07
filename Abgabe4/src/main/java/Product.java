/**
 * Diese Klasse enthaelt den Bauplan um neue Produkte zu erstellen und sich anzeigen zu lassen ob sie regional verfuegbar sind oder importiert.
 */
public class Product {

    final String nameProdukt;
    private boolean[] istVerfuegbarRegional;
    private boolean[] istVerfuegbarImportWare;

    /**
     * Der Konstruktor weisst den Klassenattributen die Parameter zu
     *
     * @param name Name des Produkts
     * @param regionalWare Verfuegbarkeit der Ware regional
     * @param importWare Verfuegbarkeit der Ware aus dem Import
     */
    public Product(String name, boolean[] regionalWare, boolean[] importWare) {
        this.nameProdukt = name;
        this.istVerfuegbarRegional = regionalWare;
        this.istVerfuegbarImportWare = importWare;
    }

    /**
     * Der Konstruktor weisst den Klassenattributen die Parameter zu, erhaelt aber als Parameter drei Strings, welche erst geparsed werden müssen
     *
     * @param nameDesProdukts Name des Produkts
     * @param monatRegionalVerfuegbar Verfuegbarkeit der Ware regional
     * @param monatImportVerfuegbar Verfuegbarkeit der Ware aus dem Import
     */
    public Product(String nameDesProdukts, String monatRegionalVerfuegbar, String monatImportVerfuegbar) {
        this.nameProdukt = nameDesProdukts;
        this.istVerfuegbarRegional = BooleanStringHelper.parse(monatRegionalVerfuegbar, '1');
        this.istVerfuegbarImportWare = BooleanStringHelper.parse(monatImportVerfuegbar, '1');
    }

    /**
     * Returned einen String der nur die regionale Verfügbarkeit anzeigt.
     *
     * @return String aus Leerzeichen und R's
     */
    public String stringifyIsRegional() {
        return BooleanStringHelper.stringify(this.istVerfuegbarRegional, 'R', ' ');
    }

    /**
     * Returned einen String der nur die Verfuegbarkeit aus dem Import anzeigt.
     *
     * @return String aus Leerzeichen und I's
     */
    public String stringifyIsImported() {
        return BooleanStringHelper.stringify(this.istVerfuegbarImportWare, 'I', ' ');
    }

    /**
     * Getter Methode für den Namen des Produkts
     *
     * @return Name des Produkts
     */
    public String getNameProdukt() {
        return nameProdukt;
    }
}
