public class Entry<K, V> {

    private K key; //Schlüssel
    private V value; //Werte

    public Entry(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}