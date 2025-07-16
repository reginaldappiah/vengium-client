package com.jagex;/* Class73 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class73 {
    LinkedList list;
    int capacity;

    Class73(int capacity) {
        this.capacity = 547036117 * capacity;
    }

    public void method814(int key, int capacity) {
        if (this.list == null)
            this.list = new LinkedList(-1623767683 * this.capacity);
        IntNode node = ((IntNode) this.list.get((long) key));
        if (null != node)
            node.capacity = -898670337 * capacity;
        else {
            node = new IntNode(capacity);
            this.list.connect(node, (long) key);
        }
    }

    public int method815(int i) {
        Class434 class434 = Class82_Sub16.aClass427_6886.method5748(i);
        int i_3_ = class434.anInt5458 * -1979044991;
        int i_4_ = (31 == class434.anInt5457 * -1638834999 ? -1 : (1 << class434.anInt5457 * -1638834999 + 1) - 1);
        return ((method817(i_3_) & i_4_) >>> -2127213381 * class434.anInt5459);
    }

    public void clear() {
        if (this.list != null)
            this.list.clear();
    }

    public int method817(int key) {
        IntNode node = ((IntNode) this.list.get((long) key));
        if (null != node)
            return node.capacity * -774922497;
        Class485 class485 = StaticMethods.aClass445_8384.get(key);
        if ('i' != class485.symbol)
            return -1;
        return 0;

    }

}
