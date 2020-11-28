import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Karte k1 = Karte.neueKarte(Farbe.HERZ,Wert.BUBE);
        Karte k2 = Karte.neueKarte(Farbe.KARO,Wert.KOENIG);
        Karte k3 = Karte.neueKarte(Farbe.PIK,Wert.ACHT);
        Karte k4 = Karte.neueKarte(Farbe.KREUZ,Wert.ASS);
        Karte.druckeEinbahnBedienungen();
        //System.out.println(Arrays.toString(Karte.skatblatt()));
        //System.out.println(k1.bedient(k2)+k1.wert.toString());
        //System.out.println(k2.bedient(k1)+k2.wert.toString());
    }
}
