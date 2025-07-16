package com.jagex;/* StockMarketListing - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class StockMarketListing {
    public static Class524 aClass524_2773;
    public int anInt2768;
    public int anInt2769;
    public int anInt2770;
    public int anInt2771;
    public int anInt2772;
    byte listingHash;

    public StockMarketListing(Buffer class298_sub53) {
        this.listingHash = class298_sub53.readByte();
        anInt2768 = class298_sub53.readUShort() * -1745142161;
        anInt2769 = class298_sub53.readInt() * 1614840625;
        anInt2770 = class298_sub53.readInt() * -720550021;
        anInt2771 = class298_sub53.readInt() * -381867285;
        anInt2772 = class298_sub53.readInt() * 822515113;
    }

    public StockMarketListing() {

    }

    public int getListingStatus() {
        return this.listingHash & 0x7;
    }

    public int method2401(byte i) {
        return (this.listingHash & 0x8) == 8 ? 1 : 0;
    }
}
