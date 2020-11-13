public class Main {

    public static void main(String[] args) {


        double startBetrag = SimpleIO.getDouble("Bitte gebe den Betrag ein.");
        double zinsSatz = SimpleIO.getDouble("Bitte gebe den Zinssatz ein.");
        int counterFuerZinsen = 0;

        String ziel = SimpleIO.getString("Bitte gebe ein ob du das Ziel oder die Zeit berechnen möchtest.");

        while (!ziel.equals("Ziel") && !ziel.equals("Zeit")) {
            SimpleIO.output("Bitte 'Ziel' oder 'Zeit' eingeben.");
            ziel = SimpleIO.getString("Bitte gebe ein ob du das Ziel oder die Zeit berechnen möchtest.");
        }
        if (ziel.equals("Ziel")) {
            double zielBetrag = SimpleIO.getDouble("Was ist ihr Zielbetrag?");
            while (startBetrag < zielBetrag) {
                startBetrag = startBetrag * (1 + (zinsSatz / 100));
                counterFuerZinsen++;
            }
            SimpleIO.output("Es dauert " + counterFuerZinsen + " Jahre. Danach haben sie: " + startBetrag + " Euro.");
        } else {
            int dauerVonJahren = SimpleIO.getInt("Wie viele Jahre wollen Sie sparen?");
            for (int i = 0; i < dauerVonJahren; i++) {
                startBetrag = startBetrag * (1 + (zinsSatz / 100));
            }
            SimpleIO.output("Bei einem Zinssatz von: " + zinsSatz + "% und einem Startbetrag von " + startBetrag + " hat man nach " + dauerVonJahren + " Jahren " + startBetrag + " Euro gespart.");
        }
    }
}
