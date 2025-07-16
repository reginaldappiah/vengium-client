package com.jagex;/* Class420 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class420 {
    static long[] aLongArray5343 = new long[12];

    static {
        for (int i = 0; i < aLongArray5343.length; i++)
            aLongArray5343[i] = (long) Math.pow(37.0, (double) i);
    }

    Class420() throws Throwable {
        throw new Error();
    }

    public static void spawnObject(int plane, int localX, int localY, int i_2_, int i_3_, int type, int rotation) {
        ObjectDeque objectDeque = null;
        for (ObjectDeque node = ((ObjectDeque) ObjectDeque.aClass453_7152.method5939()); node != null; node = ((ObjectDeque) ObjectDeque.aClass453_7152.method5944())) {
            if ((2108312995 * node.plane == plane) && 634196087 * node.localX == localX && -2146829167 * node.localY == localY && i_2_ == -431456739 * (node.anInt7157)) {
                objectDeque = node;
                break;
            }
        }
        if (objectDeque == null) {
            objectDeque = new ObjectDeque();
            objectDeque.plane = plane * -196260341;
            objectDeque.anInt7157 = i_2_ * 1088435253;
            objectDeque.localX = 656787783 * localX;
            objectDeque.localY = localY * 284247153;
            if (localX >= 0 && localY >= 0 && localX < GameClient.myRegion.getMapWidth() && localY < GameClient.myRegion.getMapLength())
                StaticMethods.method1285(objectDeque);
            ObjectDeque.aClass453_7152.pushBack(objectDeque);
        }
        objectDeque.anInt7156 = 240885009 * i_3_;
        objectDeque.type = type * 998055383;
        objectDeque.rotation = 1034640391 * rotation;
        objectDeque.aBoolean7159 = true;
        objectDeque.aBoolean7160 = false;
    }

    public static final void method5608() {
        for (ObjectDeque objectDeque = ((ObjectDeque) ObjectDeque.aClass453_7152.method5939()); objectDeque != null; objectDeque = (ObjectDeque) ObjectDeque.aClass453_7152.method5944()) {
            if (!objectDeque.aBoolean7160) {
                objectDeque.aBoolean7159 = true;
                if (634196087 * objectDeque.localX >= 0 && objectDeque.localY * -2146829167 >= 0 && (634196087 * objectDeque.localX < GameClient.myRegion.getMapWidth()) && (objectDeque.localY * -2146829167 < GameClient.myRegion.getMapLength()))
                    StaticMethods.method1285(objectDeque);
            } else
                objectDeque.unlink();
        }
        for (ObjectDeque objectDeque = ((ObjectDeque) ObjectDeque.aClass453_7162.method5939()); null != objectDeque; objectDeque = (ObjectDeque) ObjectDeque.aClass453_7162.method5944()) {
            if (!objectDeque.aBoolean7160)
                objectDeque.aBoolean7159 = true;
            else
                objectDeque.unlink();
        }
    }
}
