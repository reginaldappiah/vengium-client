package com.jagex;/* Class482 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.File;
import java.io.RandomAccessFile;

public class Class482 {
    Class482() throws Throwable {
        throw new Error();
    }

    static void method6116(Buffer buffer) {
        if ((buffer.buffer.length - buffer.offset * 385051775) >= 1) {
            int i_0_ = buffer.readUByte();
            if (i_0_ >= 0 && i_0_ <= 1 && (buffer.buffer.length - buffer.offset * 385051775) >= 2) {
                int length = buffer.readUShort();
                if ((buffer.buffer.length - buffer.offset * 385051775) >= length * 6) {
                    for (int index = 0; index < length; index++) {
                        int i_3_ = buffer.readUShort();
                        int i_4_ = buffer.readInt();
                        if (i_3_ < Class374.interfaceGCValue.length) {
                            if (!Class254.interfaceGC[i_3_]) {

                            } else {
                                if ((StaticMethods.aClass494_6550.load(i_3_).symbol) == '1') {
                                    if (i_4_ < -1)
                                        continue;
                                    if (i_4_ > 1) {
                                        continue;
                                    }
                                }
                                Class374.interfaceGCValue[i_3_] = i_4_;
                            }
                        }
                    }
                }
            }
        }
    }

    static File method6118(String string) {
            if (!Class304.aBoolean3266)
                throw new RuntimeException("");
            File file = (File) Class304.aHashtable3267.get(string);
            if (null != file)
                return file;
            File file_5_ = new File(Class304.aFile3265, string);
            RandomAccessFile randomaccessfile = null;
            File file_6_;
            try {
                File file_7_ = new File(file_5_.getParent());
                if (!file_7_.exists())
                    throw new RuntimeException("");
                randomaccessfile = new RandomAccessFile(file_5_, "rw");
                int i_8_ = randomaccessfile.read();
                randomaccessfile.seek(0L);
                randomaccessfile.write(i_8_);
                randomaccessfile.seek(0L);
                randomaccessfile.close();
                Class304.aHashtable3267.put(string, file_5_);
                file_6_ = file_5_;
            } catch (Exception exception) {
                try {
                    if (null != randomaccessfile) {
                        randomaccessfile.close();
                        Object object = null;
                    }
                } catch (Exception exception_9_) {
                    /* empty */
                }
                throw new RuntimeException();
            }
            return file_6_;
    }

    static short[][] method6120(float[][] fs, short[][] is, byte i) {
            for (int i_10_ = 0; i_10_ < fs.length; i_10_++) {
                for (int i_11_ = 0; i_11_ < is[i_10_].length; i_11_++)
                    is[i_10_][i_11_] = (short) (int) (16383.0F * fs[i_10_][i_11_]);
            }
            return is;
    }

    static final void method6121(int vertexX, int vertexZ, int plane, int yOffset, int i_15_, int xOffset, int height) {
            int i_19_ = height - 334;
            if (i_19_ < 0)
                i_19_ = 0;
            else if (i_19_ > 100)
                i_19_ = 100;
            int i_20_ = (GameClient.aShort8923 + i_19_ * (GameClient.aShort8931 - GameClient.aShort8923) / 100);
            xOffset = i_20_ * xOffset >> 8;
            int i_21_ = 16384 - yOffset & 0x3fff;
            int i_22_ = 16384 - i_15_ & 0x3fff;
            int i_23_ = 0;
            int i_24_ = 0;
            int i_25_ = xOffset;
            if (i_21_ != 0) {
                i_24_ = -i_25_ * CircleAngleTable.SINE[i_21_] >> 14;
                i_25_ = CircleAngleTable.COSINE[i_21_] * i_25_ >> 14;
            }
            if (0 != i_22_) {
                i_23_ = CircleAngleTable.SINE[i_22_] * i_25_ >> 14;
                i_25_ = CircleAngleTable.COSINE[i_22_] * i_25_ >> 14;
            }
            GameClient.camPosX = (vertexX - i_23_) * 547882953;
            GameClient.camPosY = 1078403147 * (vertexZ - i_24_);
            GameClient.camPosZ = (plane - i_25_) * 309839105;
            GameClient.camRotX = -648269561 * yOffset;
            GameClient.camRotY = -1587695039 * i_15_;
            GameClient.camRotZ = 0;
    }
}
