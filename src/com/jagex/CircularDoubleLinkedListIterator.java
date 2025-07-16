package com.jagex;/* CircularDoubleLinkedListIterator - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.util.Iterator;

public class CircularDoubleLinkedListIterator implements Iterator {
    CircularDoubleLinkedList list;
    Cacheable next_cache;
    Cacheable new_cache = null;

    public CircularDoubleLinkedListIterator(CircularDoubleLinkedList list) {
        this.list = list;
        this.next_cache = (this.list.DELIMETER.next_cache);
        this.new_cache = null;
    }

    public void init() {
        this.next_cache = (this.list.DELIMETER.next_cache);
        this.new_cache = null;
    }

    public Cacheable first() {
        init();
        return (Cacheable) next();
    }

    public Object next() {
        Cacheable cacheable = this.next_cache;
        if (this.list.DELIMETER == cacheable) {
            cacheable = null;
            this.next_cache = null;
        } else
            this.next_cache = cacheable.next_cache;
        this.new_cache = cacheable;
        return cacheable;
    }

    public void remove() {
        if (this.new_cache == null)
            throw new IllegalStateException();
        this.new_cache.unlinkCache();
        this.new_cache = null;
    }

    public boolean hasNext() {
        return (this.list.DELIMETER != this.next_cache);

    }

}
