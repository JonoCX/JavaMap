package com.jcarlton;

import java.util.Collection;
import java.util.Iterator;

/**
 * @author Jonathan Carlton
 */
public interface Map<E> extends Iterable<E> {

    int size();

    boolean isEmpty();

    boolean contains(Object element);

    boolean add(E element);

    boolean remove(Object element);

    Iterator<E> iterator();

    boolean containsAll(Collection<?> c);

    boolean addAll(Collection<? extends E> c);

    boolean removeAll(Collection<?> c);

    boolean retainAll(Collection<?> c);

    void clear();

    Object[] toArray();

    <T> T[] toArray(T[] a);

}
