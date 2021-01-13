import java.util.HashSet;
import java.util.Set;

public abstract class AbstractReadableMap<K, V> implements ReadableMap<K, V> {

    protected Entry<K, V>[] entries;

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

    @Override
    public ImmutableMap<K, V> asImmutableMap() {
        return new ImmutableMap<>(this.entries);
    }

    @Override
    public Set<K> keysAsSet() {
        HashSet<K> k = new HashSet<>();
        for (Entry<K, V> x : entries) {
            if (x != null) {
                k.add(x.getKey());
            }
        }
        return k;
    }
}
