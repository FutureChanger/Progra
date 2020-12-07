/**
 * Diese Klasse enthaelt die Methoden um die Eingabestring zu konvertieren je nach Bedarf.
 */
public class BooleanStringHelper {

    /**
     * Diese Methode konvertiert einen String in ein Booleanarray.
     *
     * @param x Der Stringparameter
     * @param y Der Charparamter
     * @return Ein Booleanarray
     */
    public static boolean[] parse(String x, char y) {

        boolean[] arr = new boolean[x.length()];
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) == y) {
                arr[i] = true;
            } else if (x.charAt(i) != y) {
                arr[i] = false;
            }
        }
        return arr;
    }

    /**
     * Diese Methode konvertiert ein Booleanarray in einen String.
     *
     * @param x Das Booleanarray als Parameter
     * @param a Der char, welcher eingesetzt wird, wenn der Booleaneintrag im Array = true ist
     * @param b Der char, welcher eingesetzt wird, wenn der Booleaneintrag im Array = false ist
     * @return returned einen String
     */
    public static String stringify(boolean[] x, char a, char b) {
        StringBuilder builder = new StringBuilder();
        builder.setLength(x.length);

        for (boolean t : x) {
            if (t) {
                builder.append(a);
            } else {
                builder.append(b);
            }
        }
        return builder.toString();

    }
}
