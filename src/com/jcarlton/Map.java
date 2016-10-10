package com.jcarlton;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/**
 * @author Jonathan Carlton
 */
public interface Map<K, V> {

    V put(K key, V val);

    V get(Object key);

    V remove(Object key);

    boolean containsKey(Object key);

    boolean containsValue(Object value);

    int size();

    boolean isEmpty();

    void putAll(Map<? extends K, ? extends V> t);

    void clear();

    Set<K> keySet();

    Collection<V> values();

    Set<java.util.Map.Entry<K, V>> entrySet();

}
