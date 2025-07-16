package com.jagex;/* Class298_Sub37_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class298_Sub37_Sub7 extends Cacheable {
    LinkedList linkedList;

    Class298_Sub37_Sub7() {

    }

    void readValueLoop(Buffer buffer) {
        for (; ; ) {
            int opcode = buffer.readUByte();
            if (0 == opcode) {
                break;
            }
            decode(buffer, opcode);
        }
    }

    public int method3425(int key, int i_1_) {
        if (this.linkedList == null)
            return i_1_;
        IntNode node = (IntNode) this.linkedList.get((long) key);
        if (null == node)
            return i_1_;
        return node.capacity * -774922497;

    }

    void decode(Buffer buffer, int opcode) {
        if (opcode == 249) {
            int maxKey = buffer.readUByte();
            if (null == this.linkedList) {
                int bestKeyIndexSize = LinkedList.getNextBitValue(maxKey);
                this.linkedList = new LinkedList(bestKeyIndexSize);
            }
            for (int index = 0; index < maxKey; index++) {
                boolean isString = buffer.readUByte() == 1;
                int key = buffer.readUTriByte();
                Node node;
                if (isString)
                    node = new ObjectNode(buffer.readString());
                else
                    node = new IntNode(buffer.readInt());
                this.linkedList.connect(node, (long) key);
            }
        }
    }

    public String method3427(int key, String string) {
        if (this.linkedList == null)
            return string;
        ObjectNode objectNode = (ObjectNode) this.linkedList.get((long) key);
        if (objectNode == null)
            return string;
        return (String) objectNode.nodeObject;
    }
}
