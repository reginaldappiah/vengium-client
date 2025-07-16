package com.jagex.game.cache.config.underlay;/* Class443 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.Buffer;

public class UnderlayType {
    public int textureID = 328024129;
    public int saturation;
    public boolean aBoolean5596;
    public int textureSize = -381610496;
    public int hue;
    public boolean blockShadow = true;
    public int lightness;
    public int chroma;
    int groundRGB = 0;

    UnderlayType() {
        aBoolean5596 = true;
    }

    void calculateHSL(int color) {
        double r = (double) (color >> 16 & 0xFF) / 256.0;
        double g = (double) (color >> 8 & 0xFF) / 256.0;
        double b = (double) (color & 0xFF) / 256.0;
        double maximum = r;
        if (g < maximum)
            maximum = g;
        if (b < maximum)
            maximum = b;
        double minimum = r;
        if (g > minimum)
            minimum = g;
        if (b > minimum)
            minimum = b;
        double h = 0.0;
        double s = 0.0;
        double l = (maximum + minimum) / 2.0;
        if (maximum != minimum) {
            if (l < 0.5)
                s = (minimum - maximum) / (maximum + minimum);
            if (l >= 0.5)
                s = (minimum - maximum) / (2.0 - minimum - maximum);
            if (r == minimum)
                h = (g - b) / (minimum - maximum);
            else if (minimum == g)
                h = 2.0 + (b - r) / (minimum - maximum);
            else if (minimum == b)
                h = (r - g) / (minimum - maximum) + 4.0;
        }
        h /= 6.0;
        saturation = (int) (256.0 * s) * 10667035;
        lightness = (int) (l * 256.0) * -656706385;
        if (saturation * -620399085 < 0)
            saturation = 0;
        else if (-620399085 * saturation > 255)
            saturation = -1574873371;
        if (656695887 * lightness < 0)
            lightness = 0;
        else if (lightness * 656695887 > 255)
            lightness = 43596369;
        if (l > 0.5)
            chroma = 1823857443 * (int) (512.0 * (s * (1.0 - l)));
        else
            chroma = (int) (512.0 * (s * l)) * 1823857443;
        if (chroma * -813159285 < 1)
            chroma = 1823857443;
        hue = 599548295 * (int) ((double) (chroma * -813159285) * h);
    }

    void buffer(Buffer buffer, int opcode) {
            if (1 == opcode) {
                this.groundRGB = buffer.readUTriByte() * -1369220863;
                calculateHSL(2106435329 * this.groundRGB);
            } else if (2 == opcode) {
                textureID = buffer.readUShort() * -328024129;
                if (textureID * 2012295231 == 65535)
                    textureID = 328024129;
            } else if (opcode == 3)
                textureSize = ((buffer.readUShort() << 2) * -562782069);
            else if (4 == opcode)
                blockShadow = false;
            else if (5 == opcode)
                aBoolean5596 = false;
    }

    public void readValueLoop(Buffer buffer) {
        for (; ; ) {
            int opcode = buffer.readUByte();
            if (0 == opcode) {
                break;
            }
            buffer(buffer, opcode);
        }
    }

}
