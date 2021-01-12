public abstract class AbstractReadableMap<K, V> implements ReadableMap<K,V> {

    public Entry<K, V>[] entries;

    public AbstractReadableMap(Entry<K, V>[] entries) {
        this.entries = GenericArrayHelper.copyArray(entries);
    }

    public AbstractReadableMap() {
        this.entries = GenericArrayHelper.newEntryArrayOfSize(10);
    }

    @Override
    public V getOrThrow(K key) throws UnknownKeyException {
        for (Entry<K, V> x : entries) {
            if (x != null && x.getKey().equals(key)) {
                return x.getValue();
            }
        }
        throw new UnknownKeyException();
    }
}
