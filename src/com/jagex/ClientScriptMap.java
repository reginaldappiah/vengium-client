package com.jagex;/* Class483 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.util.*;
import java.util.LinkedList;

public class ClientScriptMap {
    public char aChar6037;
    public char aChar6042;
    int anInt6036;
    int anInt6038;
    HashMap aHashMap6039;
    Map aMap6040;
    Object[] anObjectArray6041;
    String string = "null";

    ClientScriptMap() {
        this.anInt6036 = 0;
    }

    public static String method6131() {
        try {
            String string = "www";
            if (Class401.aClass401_6555 == StaticMethods.aClass401_2708) {
                string = "www-wtrc";
            } else if (StaticMethods.aClass401_2708 == Class401.aClass401_6554) {
                string = "www-wtqa";
            } else if (Class401.aClass401_6560 == StaticMethods.aClass401_2708) {
                string = "www-wtwip";
            } else if (Class401.aClass401_6553 == StaticMethods.aClass401_2708) string = "www-wti";
            String string_13_ = "";
            if (GameClient.settings != null) {
                string_13_ = new StringBuilder().append("/p=").append(GameClient.settings).toString();
            }
            String string_14_ = new StringBuilder().append(GameClient.game.BUILD_NAME).append(".com").toString();
            return new StringBuilder().append("http://").append(string).append(".").append(string_14_).append("/l=").append(GameLanguage.CURRENT_LANGUAGE).append("/a=").append(GameClient.offiliateId * -1154804873).append(string_13_).append("/").toString();
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("tx.nn(").append(')').toString());
        }
    }

    public String getMap(int key) {
        try {
            Object object = method6126(key);
            if (object == null) return this.string;
            return (String) object;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("tx.p(").append(')').toString());
        }
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

    void decode(Buffer buffer, int opcode) {
        try {
            if (1 == opcode) {
                aChar6042 = Class485.keyCodeToSymbol(buffer.readByte());
            } else if (opcode == 2) {
                aChar6037 = Class485.keyCodeToSymbol(buffer.readByte());
            } else if (3 == opcode) {
                this.string = buffer.readString();
            } else if (4 == opcode) {
                this.anInt6038 = buffer.readInt() * -1961153765;
            } else if (opcode == 5 || opcode == 6) {
                this.anInt6036 = buffer.readUShort() * -1158380671;
                this.aMap6040 = new HashMap(-1179140991 * this.anInt6036);
                for (int i_3_ = 0; i_3_ < this.anInt6036 * -1179140991; i_3_++) {
                    int i_4_ = buffer.readInt();
                    java.io.Serializable serializable;
                    if (opcode == 5) {
                        serializable = buffer.readString();
                    } else {
                        serializable = new Integer(buffer.readInt());
                    }
                    this.aMap6040.put(new Integer(i_4_), serializable);
                }
            } else if (7 == opcode || 8 == opcode) {
                int i_5_ = buffer.readUShort();
                this.anInt6036 = buffer.readUShort() * -1158380671;
                this.anObjectArray6041 = new Object[i_5_];
                for (int i_6_ = 0; i_6_ < -1179140991 * this.anInt6036; i_6_++) {
                    int i_7_ = buffer.readUShort();
                    if (opcode == 7) {
                        this.anObjectArray6041[i_7_] = buffer.readString();
                    } else {
                        this.anObjectArray6041[i_7_] = new Integer(buffer.readInt());
                    }
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("tx.f(").append(')').toString());
        }
    }

    public int method6125(int i) {
        try {
            Object object = method6126(i);
            if (null == object) return this.anInt6038 * -1363462381;
            return ((Integer) object).intValue();
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("tx.b(").append(')').toString());
        }
    }

    Object method6126(int key) {
        try {
            if (this.anObjectArray6041 != null) {
                if (key < 0 || key >= this.anObjectArray6041.length) return null;
                return this.anObjectArray6041[key];
            }
            if (null != this.aMap6040) return this.aMap6040.get(new Integer(key));
            return null;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("tx.i(").append(')').toString());
        }
    }

    public boolean method6127(Object object, byte i) {
        try {
            if (this.anInt6036 * -1179140991 == 0) return false;
            if (this.aHashMap6039 == null) method6130(671224629);
            return this.aHashMap6039.containsKey(object);
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("tx.k(").append(')').toString());
        }
    }

    public int[] method6128(Object object) {
        try {
            if (0 == this.anInt6036 * -1179140991) return null;
            if (this.aHashMap6039 == null) method6130(817562642);
            return (int[]) this.aHashMap6039.get(object);
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("tx.d(").append(')').toString());
        }
    }

    public int method6129() {
        try {
            return this.anInt6036 * -1179140991;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("tx.u(").append(')').toString());
        }
    }

    void method6130(int i) {
        try {
            HashMap hashmap = new HashMap();
            if (null != this.anObjectArray6041) {
                for (int i_10_ = 0; i_10_ < this.anObjectArray6041.length; i_10_++) {
                    if (null == this.anObjectArray6041[i_10_]) {
                        if (i <= 49152) {
                            /* empty */
                        }
                    } else {
                        Object object = this.anObjectArray6041[i_10_];
                        List list = (List) hashmap.get(object);
                        if (null == list) {
                            list = new LinkedList();
                            hashmap.put(object, list);
                        }
                        list.add(new Integer(i_10_));
                    }
                }
            } else if (null != this.aMap6040) {
                Iterator iterator = this.aMap6040.entrySet().iterator();
                while (iterator.hasNext()) {
                    Map.Entry entry = (Map.Entry) iterator.next();
                    Object object = entry.getValue();
                    List list = (List) hashmap.get(object);
                    if (list == null) {
                        list = new LinkedList();
                        hashmap.put(object, list);
                    }
                    list.add(entry.getKey());
                }
            } else {
                throw new IllegalStateException();
            }
            this.aHashMap6039 = new HashMap();
            Iterator iterator = hashmap.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry entry = (Map.Entry) iterator.next();
                List list = (List) entry.getValue();
                int[] is = new int[list.size()];
                int i_11_ = 0;
                Iterator iterator_12_ = list.iterator();
                while (iterator_12_.hasNext()) {
                    Integer integer = (Integer) iterator_12_.next();
                    is[i_11_++] = integer.intValue();
                }
                this.aHashMap6039.put(entry.getKey(), is);
            }
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("tx.posX(").append(')').toString());
        }
    }
}
