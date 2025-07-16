package com.jagex;/* Class298_Sub37_Sub13 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class298_Sub37_Sub13 extends Cacheable {
    public String locationName;
    public String aString9641;
    public int anInt9643;
    public int anInt9644;
    public int anInt9645 = 715250349;
    public int anInt9646;
    public int anInt9647;
    public int anInt9649;
    public int anInt9650 = 1438003712;
    int anInt9639 = 1105193455;
    Class453 aClass453_9642;
    boolean aBoolean9648;

    Class298_Sub37_Sub13(int i, String locationName, String string_9_, int i_10_, int i_11_, boolean bool, int i_12_, int i_13_) {
        anInt9647 = 0;
        anInt9649 = 1374107136;
        anInt9646 = 0;
        this.aBoolean9648 = true;
        anInt9643 = -1929943701 * i;
        this.locationName = locationName;
        aString9641 = string_9_;
        anInt9644 = i_10_ * 350230413;
        this.anInt9639 = -1105193455 * i_11_;
        this.aBoolean9648 = bool;
        anInt9645 = i_12_ * -715250349;
        if (1110271707 * anInt9645 == 255) anInt9645 = 0;
        Class94.method1020(i_13_);
        this.aClass453_9642 = new Class453();
    }

    boolean method3450(int i, int i_0_) {
        for (Class298_Sub42 class298_sub42 = (Class298_Sub42) this.aClass453_9642.method5939(); null != class298_sub42; class298_sub42 = (Class298_Sub42) this.aClass453_9642.method5944()) {
            if (class298_sub42.method3521(i, i_0_)) return true;
        }
        return false;
    }

    public boolean method3451(int i, int i_2_, int[] is) {
        for (Class298_Sub42 class298_sub42 = (Class298_Sub42) this.aClass453_9642.method5939(); class298_sub42 != null; class298_sub42 = (Class298_Sub42) this.aClass453_9642.method5944()) {
            if (class298_sub42.method3522(i, i_2_)) {
                class298_sub42.method3523(i, i_2_, is);
                return true;
            }
        }
        return false;
    }

    public boolean method3452(int i, int i_4_, int[] is) {
        for (Class298_Sub42 class298_sub42 = (Class298_Sub42) this.aClass453_9642.method5939(); class298_sub42 != null; class298_sub42 = (Class298_Sub42) this.aClass453_9642.method5944()) {
            if (class298_sub42.method3521(i, i_4_)) {
                class298_sub42.method3524(i, i_4_, is);
                return true;
            }
        }
        return false;
    }

    public boolean method3453(int i, int i_6_, int i_7_, int[] is) {
        for (Class298_Sub42 class298_sub42 = (Class298_Sub42) this.aClass453_9642.method5939(); class298_sub42 != null; class298_sub42 = (Class298_Sub42) this.aClass453_9642.method5944()) {
            if (class298_sub42.method3520(i, i_6_, i_7_)) {
                class298_sub42.method3524(i_6_, i_7_, is);
                return true;
            }
        }
        return false;
    }

    void method3454() {
        anInt9650 = 1438003712;
        anInt9647 = 0;
        anInt9649 = 1374107136;
        anInt9646 = 0;
        for (Class298_Sub42 class298_sub42 = (Class298_Sub42) this.aClass453_9642.method5939(); class298_sub42 != null; class298_sub42 = (Class298_Sub42) this.aClass453_9642.method5944()) {
            if (class298_sub42.anInt7457 * 1528024175 < 1364716801 * anInt9650)
                anInt9650 = (class298_sub42.anInt7457 * -878769809);
            if (class298_sub42.anInt7461 * 37578241 > anInt9647 * -2052483955)
                anInt9647 = (class298_sub42.anInt7461 * -1211577275);
            if (50981941 * class298_sub42.anInt7463 < anInt9649 * 1345239131)
                anInt9649 = -608005457 * (class298_sub42.anInt7463);
            if (1374138429 * class298_sub42.anInt7465 > 929385381 * anInt9646)
                anInt9646 = (-1870852423 * class298_sub42.anInt7465);
        }
    }

}
