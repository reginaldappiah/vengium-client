package com.jagex.game.cache.definition.animation;/* Class96 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.Buffer;

public class AnimationFrame {
    public static short[] bufferX = new short[500];
    public static short[] bufferY = new short[500];
    public static short[] bufferZ = new short[500];
    public static short[] skipped = new short[500];
    public static short[] aShortArray927 = new short[500];
    public static byte[] flagsBuffer = new byte[500];
    public int transformationCount;
    public short[] transformationX;
    public short[] transformationY;
    public short[] transformationZ;
    public byte[] transformationFlags;

    public short[] transformationIndicies;

    public AnimationFrameBase base;

    public boolean modifiesAlpha;
    public boolean modifiesColor;
    public short[] skippedReferences;

    public boolean modifiesBrightness;

    public AnimationFrame(byte[] data, AnimationFrameBase base) {
        this.transformationCount = 0;
        this.modifiesAlpha = false;
        this.modifiesColor = false;
        this.modifiesBrightness = false;
        this.base = base;
        try {
            Buffer buffer = new Buffer(data);
            Buffer transformationsBuffer = new Buffer(data);
            buffer.readUByte();
            buffer.offset += 232826622;
            int count = buffer.readUByte();
            int transformCount = 0;
            int currentIndex = -1;
            int lastUsedIndex = -1;
            transformationsBuffer.offset = (buffer.offset * 385051775 + count) * 116413311;


            for (int index = 0; index < count; index++) {
                int transformType = base.transformationTypes[index];
                if (transformType == 0) {
                    currentIndex = index;
                }
                int movement = buffer.readUByte();
                if (movement > 0) {//There is one or more joint transform
                    if (transformType == AnimationFrameBase.UNKNOWN0) {
                        lastUsedIndex = index;
                    }
                    aShortArray927[transformCount] = (short) index;
                    short values = 0;
                    if (transformType == AnimationFrameBase.UNKNOWN3 || transformType == AnimationFrameBase.UNKNOWN10) {
                        values = (short) 128;
                    }
                    if ((movement & 0x1) != 0) {
                        bufferX[transformCount] = (short) transformationsBuffer.readSmartShort();
                    } else {
                        bufferX[transformCount] = values;
                    }
                    if ((movement & 0x2) != 0) {
                        bufferY[transformCount] = (short) transformationsBuffer.readSmartShort();
                    } else {
                        bufferY[transformCount] = values;
                    }
                    if ((movement & 0x4) != 0) {
                        bufferZ[transformCount] = (short) transformationsBuffer.readSmartShort();
                    } else {
                        bufferZ[transformCount] = values;
                    }
                    flagsBuffer[transformCount] = (byte) (movement >>> 3 & 0x3);
                    if (transformType == AnimationFrameBase.UNKNOWN2 || transformType == AnimationFrameBase.UNKNOWN9) {
                        bufferX[transformCount] = (short) (bufferX[transformCount] << 2 & 0x3FFF);
                        bufferY[transformCount] = (short) (bufferY[transformCount] << 2 & 0x3FFF);
                        bufferZ[transformCount] = (short) (bufferZ[transformCount] << 2 & 0x3FFF);
                    }
                    skipped[transformCount] = (short) -1;
                    if (transformType == AnimationFrameBase.UNKNOWN1 || transformType == AnimationFrameBase.UNKNOWN2  || transformType == AnimationFrameBase.UNKNOWN3 ) {
                        if (currentIndex > lastUsedIndex) {
                            skipped[transformCount] = (short) currentIndex;
                            lastUsedIndex = currentIndex;
                        }
                    } else if (transformType == AnimationFrameBase.UNKNOWN5) {
                        this.modifiesAlpha = true;
                    } else if (transformType == AnimationFrameBase.UNKNOWN7) {
                        this.modifiesColor = false;
                    } else if (transformType == AnimationFrameBase.UNKNOWN8  || transformType == AnimationFrameBase.UNKNOWN9 || transformType == AnimationFrameBase.UNKNOWN10) {
                        this.modifiesBrightness = true;
                    }
                    transformCount++;
                }
            }
            if (transformationsBuffer.offset * 385051775 != data.length) {
                throw new RuntimeException();
            }
            this.transformationCount = transformCount;
            this.transformationIndicies = new short[transformCount];
            this.transformationX = new short[transformCount];
            this.transformationY = new short[transformCount];
            this.transformationZ = new short[transformCount];
            this.skippedReferences = new short[transformCount];
            this.transformationFlags = new byte[transformCount];
            for (int index = 0; index < transformCount; index++) {
                this.transformationIndicies[index] = aShortArray927[index];
                this.transformationX[index] = bufferX[index];
                this.transformationY[index] = bufferY[index];
                this.transformationZ[index] = bufferZ[index];
                this.skippedReferences[index] = skipped[index];
                this.transformationFlags[index] = flagsBuffer[index];
            }
        } catch (Exception exception) {
            this.transformationCount = 0;
            this.modifiesAlpha = false;
            this.modifiesColor = false;
        }
    }
}
