package org.learning;

import java.util.Map;

/**
 * Created by Zdenca on 7/19/2017.
 */
public class MyEntry<K, V> implements Map.Entry<K, V> {
    private K key;
    private V value;

    public MyEntry(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }

    @Override
    public V setValue(V value) {
        V oldValue = this.value;
        this.value = value;
        return oldValue;
    }

    @Override
    public String toString() {
        return "MyEntry{" +
                "key = " + key +
                ", value = " + value +
                '}';
    }
}
