public class Main {

    public static void main(String[] args) {
        Karte k1 = Karte.neueKarte(Farbe.HERZ,Wert.BUBE);
        Karte k2 = Karte.neueKarte(Farbe.KARO,Wert.KOENIG);

        System.out.println(k1.bedient(k2)+k1.wert.toString());
        System.out.println(k2.bedient(k1)+k2.wert.toString());
    }
}
