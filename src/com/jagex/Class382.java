package com.jagex;/* Class382 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class382 implements Interface22 {

    public void method247(boolean noPosition, byte i) {

    }

    public void method245(int mousePositionHash, int type, int rotation) {
        int mouseX = mousePositionHash >> 16;
        int mouseY = mousePositionHash & 0xffff;
        synchronized (StaticMethods.mouseRecordsQueue) {
            StaticMethods.mouseRecordsQueue.add(EffectiveVertex.createMouseTracker(mouseX, mouseY, type, rotation));
        }
    }

}
