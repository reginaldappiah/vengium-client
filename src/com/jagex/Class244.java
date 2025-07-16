package com.jagex;/* Class244 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class244 {
    public byte[][][] flags; //MAX:16777216

    public Class244(int plane, int x, int y) {
        flags = new byte[plane][x][y];
    }

    public void method2319() {
        for (int plane = 0; plane < flags.length; plane++) {
            for (int x = 0; x < flags[0].length; x++) {
                for (int y = 0; y < flags[0][0].length; y++)
                    flags[plane][x][y] = (byte) 0;
            }
        }
    }

    public boolean method2320(int x, int y) {
        if (x < 0 || y < 0 || x >= flags[1].length || y >= flags[1][x].length)
            return false;
        return (flags[1][x][y] & 0x2) != 0;//0010
    }

    public boolean method2321(int flag, int plane, int x, int y) {
        if ((flags[0][x][y] & 0x2) != 0)//0010
            return true;
        if ((flags[plane][x][y] & 0x10) != 0)//0001 0000
            return false;
        return getPlane(plane, x, y) == flag;
    }

    int getPlane(int plane, int x, int y) {
        if ((flags[plane][x][y] & 0x8) != 0)//1000
            return 0;
        if (plane > 0 && (flags[1][x][y] & 0x2) != 0)//0010
            return plane - 1;
        return plane;
    }

}
