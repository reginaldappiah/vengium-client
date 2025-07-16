package com.jagex;/* PaddedResourceWorker - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class PaddedResourceWorker {
    public static PaddedResourceWorker protocol;
    public static long aLong2748;
    public volatile int anInt2735;
    public volatile int anInt2745;
    CircularDoubleLinkedList waitingExtras;
    CircularDoubleLinkedList priorities = new CircularDoubleLinkedList();
    Buffer aClass298_Sub53_2737;
    CircularDoubleLinkedList extras;
    int anInt2740;
    long aLong2741;
    CircularDoubleLinkedList waitingPriorities = new CircularDoubleLinkedList();
    byte aByte2743;
    Buffer aClass298_Sub53_2744;
    PaddedResourceRequest current;

    PaddedResourceWorker() {
        this.extras = new CircularDoubleLinkedList();
        this.waitingExtras = new CircularDoubleLinkedList();
        this.aClass298_Sub53_2744 = new Buffer(6);
        this.aByte2743 = (byte) 0;
        anInt2735 = 0;
        anInt2745 = 0;
        this.aClass298_Sub53_2737 = new Buffer(10);
    }

    PaddedResourceRequest method2338(int type, int file, byte padding, boolean priority) {
        long key = ((long) type << 32) + (long) file;
        PaddedResourceRequest request = new PaddedResourceRequest();
        request.cachedKey = 1476940603538232441L * key;
        request.padding = padding;
        request.highPriority = priority;
        if (priority) {
            if (getHighPriorityRequestsCount() >= 50)
                throw new RuntimeException();
            this.priorities.offer(request);
        } else {
            if (extras() >= 20)
                throw new RuntimeException();
            this.extras.offer(request);
        }
        return request;
    }

    boolean method2340() {
        return getHighPriorityRequestsCount() >= 50;
    }

    int extras() {
        return (this.extras.getSize() + this.waitingExtras.getSize());
    }

    public abstract void method2343(boolean bool, int i);

    public abstract void init(Object object, boolean loggedIn);

    public abstract void method2345(byte i);

    public abstract void close();

    boolean extraUnavailable() {
            return extras() >= 20;
    }

    public int getHighPriorityRequestsCount() {
        return (this.priorities.getSize() + this.waitingPriorities.getSize());
    }

    public abstract boolean method2351(int i);

    public abstract void method2353(short i);

    abstract void method2359();
}
