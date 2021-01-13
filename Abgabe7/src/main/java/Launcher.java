public class Launcher {
    public static void main(String[] args) {
        MutableMap<String,Integer> map = new MutableMap<>();
        putEntries(map);
        printEntries(map); ImmutableMap<String, Integer> immutableMap = map.asImmutableMap();
        printEntries(immutableMap);
    }

    public static void putEntries(WriteableMap<String, Integer> param) {
        param.put("sizeInMB", 42);
        param.put("version", 4);
        param.put("yearOfRelease", 2015);
    }

    public static void printEntries(ReadableMap<String, Integer> parameter) {

        StringBuilder builder = new StringBuilder();
        for (String key : parameter.keysAsSet()) {
            builder.setLength(0);
            builder = new StringBuilder();
            builder.append(key);
            builder.append(": ");
            try {
                builder.append(parameter.getOrThrow(key));
                System.out.println(builder.toString());
            } catch (UnknownKeyException e) {
                System.out.println("UnknownKeyException occurred!");
            }
        }
    }
}