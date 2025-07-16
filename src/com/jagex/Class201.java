package com.jagex;/* Class201 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class201 {

    Class201() throws Throwable {
        throw new Error();
    }

    public static synchronized void retrieve(byte[] data) {
        if (100 == data.length && 355907107 * Class416.anInt5330 < 1000)
            Class416.aByteArrayArray5332[(Class416.anInt5330 += -996497013) * 355907107 - 1] = data;
        else if (5000 == data.length && Class416.anInt5328 * 1904890379 < 250)
            Class416.aByteArrayArray5327[(Class416.anInt5328 += -1583470173) * 1904890379 - 1] = data;
        else if (30000 == data.length && -1426745913 * Class416.anInt5329 < 50)
            Class416.aByteArrayArray5333[(Class416.anInt5329 += 1975229431) * -1426745913 - 1] = data;
        else if (Class298_Sub37_Sub9_Sub2.packetPool != null) {
            for (int i_0_ = 0; i_0_ < Class136.anIntArray6388.length; i_0_++) {
                if (data.length == Class136.anIntArray6388[i_0_] && (Class416.anIntArray5331[i_0_] < (Class298_Sub37_Sub9_Sub2.packetPool[i_0_]).length)) {
                    Class298_Sub37_Sub9_Sub2.packetPool[i_0_][Class416.anIntArray5331[i_0_]++] = data;
                    break;
                }
            }
        }
    }

}
