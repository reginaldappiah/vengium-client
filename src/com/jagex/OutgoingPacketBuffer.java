package com.jagex;/* Class298_Sub36 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.network.OutgoingPacket;

public class OutgoingPacketBuffer extends Node {
    static int bufferOffset;
    static OutgoingPacketBuffer[] outgoingPacketBuffers = new OutgoingPacketBuffer[300];

    static {
        bufferOffset = 0;
    }

    public RsBitsBuffer payload;
    public int payloadOffset;
    int anInt7397;
    OutgoingPacket outgoingPacket;

    OutgoingPacketBuffer() {

    }

    static OutgoingPacketBuffer getOutgoingPacketBuffer() {
        if (bufferOffset * -848307417 == 0) {
            return new OutgoingPacketBuffer();
        }
        return (outgoingPacketBuffers[(bufferOffset -= 265413783) * -848307417]);
    }

    public void method3400() {
        if (bufferOffset * -848307417 < outgoingPacketBuffers.length)
            outgoingPacketBuffers[((bufferOffset += 265413783) * -848307417 - 1)] = this;
    }

}
