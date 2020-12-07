/**
 * Startet die Applikation und enthaelt die Main-Methode
 */
public class Launcher {

    public static void main(String[] args) {
        Product apfel = new Product("Apfel", "111111001111", "111111111111");
        Product banane = new Product("Banane", "000000000000", "111111111111");
        Product erdbeere = new Product("Erdbeere", "000011100000", "000110000000");
        Product blumenkohl = new Product("Blumenkohl", "000001111100", "111100000011");
        Product feldsalat = new Product("Feldsalat", "100011001111", "111100011111");
        Product zwiebel = new Product("Zwiebel", "111110011111", "001111100000");
        Product[] arr = {apfel, banane, erdbeere, blumenkohl, feldsalat, zwiebel};
        SeasonalCalender y = new SeasonalCalender(arr);
        y.stringify();
    }
}
