package com.jagex;/* MouseTracker - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;

public class MouseTracker extends MouseRecord {
    static MouseTracker[] aClass298_Sub50_Sub2Array9770 = new MouseTracker[0];
    int mouseY;
    int mouseX;
    long time;
    int type;
    int rotation;

    MouseTracker() {

    }

    static void method3572(int size) {
        ComponentMouseRecord.cacheCapacity = 912274055 * size;
        ComponentMouseRecord.cache = new ComponentMouseRecord[size];
        ComponentMouseRecord.cacheSize = 0;
    }

    public int method3568() {
        return this.rotation * -1497786335;
    }

    public int method3569() {
        return this.type * 1151921009;
    }

    public int getMouseType() {
        switch (this.type * 1151921009) {
            case 167:
            case 169:
            case 519:
            case 521:
                return 1;
            case 161:
            case 163:
            case 513:
            case 515:
                return 0;
            case 164:
            case 166:
            case 516:
            case 518:
                return 2;
            case 162:
            case 514:
                return 3;
            case 170:
            case 522:
                return 6;
            case 160:
            case 512:
                return -1;
            case 165:
            case 517:
                return 5;
            case 168:
            case 520:
                return 4;
            default:
                return -2;
        }
    }

    public int getMousRotation() {
        switch (this.type * 1151921009) {
            default:
                return 1;
            case 163:
            case 166:
            case 169:
            case 173:
            case 515:
            case 518:
            case 521:
            case 525:
                return 2;
            case 160:
            case 512:
                return 0;
        }
    }

    public long getTimeMs() {
        return -1729630536048907557L * this.time;
    }

    public int getMouseX() {
        return this.mouseX * 2113899933;
    }

    public int getMouseY() {
        return -1537929791 * this.mouseY;
    }

    public boolean method3570() {
        switch (this.type * 1151921009) {
            case 160:
            case 161:
            case 162:
            case 163:
            case 164:
            case 165:
            case 166:
            case 167:
            case 168:
            case 169:
            case 170:
            case 171:
            case 172:
            case 173:
            case 174:
            case 672:
            case 674:
                return true;
            default:
                return false;
        }
    }

    public void resizeCache() {
        synchronized (aClass298_Sub50_Sub2Array9770) {
            if (656179585 * Class446.anInt5614 < 200219789 * Class521.anInt6282 - 1)
                aClass298_Sub50_Sub2Array9770[(Class446.anInt5614 += 453361281) * 656179585 - 1] = this;
        }
    }

    public void setMousePoint(Point point) {
        this.mouseX -= point.x * 1060004021;
        this.mouseY -= point.y * 1196163649;
    }
}
