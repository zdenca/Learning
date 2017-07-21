package org.learning;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

/**
 * Created by Zdenca on 7/19/2017.
 */
public class MyMapTest {
    @Test
    public void size() throws Exception {
        MyMap<String, Integer> map = new MyMap<>();
        map.put("key", 4);
        map.put("lock", 20);
        assertEquals(2, map.size());
    }

    @Test
    public void isEmpty() throws Exception {
        MyMap<String, Integer> map = new MyMap<>();
        map.put("cat", 34);
        assertFalse(map.isEmpty());
    }

    @Test
    public void containsKey() throws Exception {
        MyMap<String, Integer> map = new MyMap<>();
        map.put("dog", 67);
        assertTrue(map.containsKey("dog"));
        assertFalse(map.containsKey(null));
    }

    @Test
    public void containsValue() throws Exception {
        MyMap<String, Integer> map = new MyMap<>();
        map.put("cat", 45);
        assertTrue(map.containsValue(45));

    }

    @Test
    public void get() throws Exception {
        MyMap<String, Integer> map = new MyMap<>();
        map.put("one", 1);
        map.get("one");
        assertEquals((Integer) 1, map.get("one"));
    }

    @Test
    public void put() throws Exception {
        MyMap<String, Integer> map = new MyMap<>();
        map.put("one", 1);
        assertEquals(1, map.keySet().size());
    }

    @Test
    public void remove() throws Exception {
        MyMap<Integer, String> map = new MyMap<>();
        map.put(1, "dog");
        map.put(2, "cat");
        map.remove(1);
        assertEquals("cat", map.get(2));
        assertEquals(1, map.size());
    }

    @Test
    public void putAll() throws Exception {
    }

    @Test
    public void clear() throws Exception {
        MyMap<String, Integer> map = new MyMap<>();
        map.put("two", 2);
        map.clear();
        assertEquals(0, map.size());
        assertNull(map.get("two"));
    }

    @Test
    public void keySet() throws Exception {
        MyMap<String, Integer> map = new MyMap<>();
        map.put("daphne", 2);
        map.put("shaggy", 4);
        Set<String> set = new HashSet<>();
        set.add("daphne");
        set.add("shaggy");
        assertEquals(set, map.keySet());
    }

    @Test
    public void values() throws Exception {
        MyMap<String, Integer> map = new MyMap<>();
        map.put("monkey", 134);
        map.put("giraffe", 21);
        Collection<Integer> expected = new ArrayList<Integer>() {
        };
        expected.add(134);
        expected.add(21);
        assertEquals(expected, map.values());
    }
//TODO test for entrySet
    @Test
    public void entrySet() throws Exception {
        MyMap<String, Integer> map = new MyMap<>();
        map.put("Hello", 56);
        map.put("Good Bye", 12);
//        Set<MyEntry<String, Integer>> set = new HashSet<>();
//        set.add(new MyEntry<>("Good Bye", 12));
//        set.add(new MyEntry<>("Hello", 56));
//        assertEquals(set, map.entrySet());
    }

}