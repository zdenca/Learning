package org.learning;

import java.util.*;

/**
 * Created by Zdenca on 7/19/2017.
 */
public class MyMap<K, V> implements Map<K, V> {
    private List<MyEntry<K, V>> entries = new ArrayList<>();


    @Override
    public int size() {
        return entries.size();
//        int countEntry = 0;
//        for (MyEntry<K, V> myEntry : entries) {
//            if (myEntry != null) {
//                countEntry++;
//            }
//        }
//        return countEntry;
    }

    @Override
    public boolean isEmpty() {
        if (entries != null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public boolean containsKey(Object key) {
        MyEntry<K, V> entry = findEntryByKey(key);
        if (entry == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public boolean containsValue(Object value) {
        V myValue = null;
        for (MyEntry<K, V> entry : entries) {
            if (entry.getValue().equals(value)) {
                myValue = entry.getValue();
            }
        }
        if (myValue == null) {
            return false;
        } else {
            return true;
        }
    }


    @Override
    public V get(Object key) {
        MyEntry<K, V> entry = findEntryByKey(key);
        return entry != null ? entry.getValue() : null;
    }

    @Override
    public V put(K key, V value) {
        if (key == null) {
            throw new RuntimeException("Key must not be null.");
        }
        MyEntry<K, V> entry = findEntryByKey(key);
        if (entry == null) {
            entries.add(new MyEntry<K, V>(key, value));
            return null;
        } else {
            return entry.setValue(value);
        }
    }

    private MyEntry<K, V> findEntryByKey(Object key) {
        for (MyEntry<K, V> myEntry : entries) {
            if (myEntry.getKey().equals(key)) {
                return myEntry;
            }
        }
        return null;
    }

    @Override
    public V remove(Object key) {
        MyEntry<K, V> entry = findEntryByKey(key);
        if (entry == null) {
            return null;
        } else {
            entries.remove(entry);
            return entry.setValue(null);
        }
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> m) {
        for (Map.Entry<? extends K, ? extends V> entry : m.entrySet()) {
            K key = entry.getKey();
            V value = entry.getValue();
            entries.add(new MyEntry<K, V>(key, value));
            System.out.println(entries);
        }

    }

    @Override
    public void clear() {
        entries.clear();


    }

    @Override
    public Set<K> keySet() {
        Set<K> myKeySet = new HashSet<>();
        for (MyEntry<K, V> entry : entries) {
            K key = entry.getKey();
            myKeySet.add(key);
        }
        return myKeySet;
    }

    @Override
    public Collection<V> values() {
        Collection<V> collection = new ArrayList<V>();
        for (MyEntry<K, V> entry : entries) {
            V value = entry.getValue();
            collection.add(value);
        }
        return collection;
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        Set<Entry<K, V>> myEntrySet = new HashSet<>();
        for (MyEntry<K, V> entry : entries) {
            myEntrySet.add(entry);
        }
        return myEntrySet;
    }

    @Override
    public String toString() {
        return "MyMap{" +
                "entries=" + entries +
                '}';
    }

    public static void main(String[] args) {
        MyMap<String, Integer> map = new MyMap<>();
        map.put("dog", 2);
        map.put("cat", 3);
        map.put("snake", 1);
        System.out.println(map);
        map.put("snake", 10);
        System.out.println(map);
        System.out.println(map.size());
        map.remove("cat");
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.containsValue(3));
        System.out.println(map.containsKey("cat"));
        System.out.println(map.values());
        System.out.println(map.keySet());
        MyMap<String, Integer> map2 = new MyMap<>();
        map2.put("hello",20);
        map.putAll(map2);



    }
}
