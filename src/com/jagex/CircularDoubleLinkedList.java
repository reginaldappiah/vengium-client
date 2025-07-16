package com.jagex;/* Class461 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.util.Iterator;

public class CircularDoubleLinkedList implements Iterable {
    public Cacheable DELIMETER = new Cacheable();
    public Cacheable ACTIVE;

    public CircularDoubleLinkedList() {
        DELIMETER.next_cache = DELIMETER;
        DELIMETER.prev_cache = DELIMETER;
    }

    public void offer(Cacheable cacheable) {
        if (cacheable.prev_cache != null)
            cacheable.unlinkCache();
        cacheable.prev_cache = DELIMETER.prev_cache;
        cacheable.next_cache = DELIMETER;
        cacheable.prev_cache.next_cache = cacheable;
        cacheable.next_cache.prev_cache = cacheable;
    }

    public Cacheable poll() {
        Cacheable cacheable = DELIMETER.next_cache;
        if (DELIMETER == cacheable)
            return null;
        cacheable.unlinkCache();
        return cacheable;
    }

    public Cacheable first() {
        return firstEx(null);
    }

    public Cacheable next() {
        Cacheable cacheable = this.ACTIVE;
        if (DELIMETER == cacheable) {
            this.ACTIVE = null;
            return null;
        }
        this.ACTIVE = cacheable.next_cache;
        return cacheable;
    }

    public int getSize() {
        int count = 0;
        for (Cacheable cacheable = DELIMETER.next_cache; DELIMETER != cacheable; cacheable = cacheable.next_cache)
            count++;
        return count;
    }

    public Iterator iterator() {
        return new CircularDoubleLinkedListIterator(this);
    }

    Cacheable firstEx(Cacheable cacheable) {
        Cacheable new_cache;
        if (cacheable == null)
            new_cache = DELIMETER.next_cache;
        else
            new_cache = cacheable;
        if (DELIMETER == new_cache) {
            this.ACTIVE = null;
            return null;
        }
        this.ACTIVE = new_cache.next_cache;
        return new_cache;
    }

    public void clear() {
        while (DELIMETER.next_cache != DELIMETER)
            DELIMETER.next_cache.unlinkCache();
    }

}
