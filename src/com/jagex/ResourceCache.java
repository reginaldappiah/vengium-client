package com.jagex;/* ResourceCache - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.EOFException;
import java.io.IOException;

public final class ResourceCache {
    static byte[] buffer = new byte[520];
    BufferedFile data = null;
    BufferedFile index = null;
    int anInt3493;
    int anInt3494 = -22135608;

    public ResourceCache(int i, BufferedFile data, BufferedFile index, int i_42_) {
        this.anInt3493 = i * 576785855;
        this.data = data;
        this.index = index;
        this.anInt3494 = i_42_ * 1731069709;
    }

    static void method3994(byte i) {
        if (Class294.anIntArray3165 == null) {
            Class294.anIntArray3165 = new int[65536];
            Class379.anIntArray4098 = new int[65536];
            double d = 0.7 + (Math.random() * 0.03 - 0.015);
            for (int i_43_ = 0; i_43_ < 65536; i_43_++) {
                double d_44_ = (double) (i_43_ >> 10 & 0x3f) / 64.0 + 0.0078125;
                double d_45_ = 0.0625 + (double) (i_43_ >> 7 & 0x7) / 8.0;
                double d_46_ = (double) (i_43_ & 0x7f) / 128.0;
                double d_47_ = d_46_;
                double d_48_ = d_46_;
                double d_49_ = d_46_;
                if (0.0 != d_45_) {
                    double d_50_;
                    if (d_46_ < 0.5)
                        d_50_ = d_46_ * (1.0 + d_45_);
                    else
                        d_50_ = d_46_ + d_45_ - d_46_ * d_45_;
                    double d_51_ = d_46_ * 2.0 - d_50_;
                    double d_52_ = d_44_ + 0.3333333333333333;
                    if (d_52_ > 1.0)
                        d_52_--;
                    double d_53_ = d_44_;
                    double d_54_ = d_44_ - 0.3333333333333333;
                    if (d_54_ < 0.0)
                        d_54_++;
                    if (6.0 * d_52_ < 1.0)
                        d_47_ = (d_50_ - d_51_) * 6.0 * d_52_ + d_51_;
                    else if (d_52_ * 2.0 < 1.0)
                        d_47_ = d_50_;
                    else if (d_52_ * 3.0 < 2.0)
                        d_47_ = d_51_ + 6.0 * ((d_50_ - d_51_) * (0.6666666666666666 - d_52_));
                    else
                        d_47_ = d_51_;
                    if (6.0 * d_53_ < 1.0)
                        d_48_ = d_51_ + (d_50_ - d_51_) * 6.0 * d_53_;
                    else if (d_53_ * 2.0 < 1.0)
                        d_48_ = d_50_;
                    else if (3.0 * d_53_ < 2.0)
                        d_48_ = 6.0 * ((0.6666666666666666 - d_53_) * (d_50_ - d_51_)) + d_51_;
                    else
                        d_48_ = d_51_;
                    if (d_54_ * 6.0 < 1.0)
                        d_49_ = d_54_ * ((d_50_ - d_51_) * 6.0) + d_51_;
                    else if (2.0 * d_54_ < 1.0)
                        d_49_ = d_50_;
                    else if (3.0 * d_54_ < 2.0)
                        d_49_ = 6.0 * ((0.6666666666666666 - d_54_) * (d_50_ - d_51_)) + d_51_;
                    else
                        d_49_ = d_51_;
                }
                d_47_ = Math.pow(d_47_, d);
                d_48_ = Math.pow(d_48_, d);
                d_49_ = Math.pow(d_49_, d);
                int i_55_ = (int) (256.0 * d_47_);
                int i_56_ = (int) (256.0 * d_48_);
                int i_57_ = (int) (256.0 * d_49_);
                int i_58_ = i_57_ + ((i_56_ << 8) + (i_55_ << 16));
                Class294.anIntArray3165[i_43_] = i_58_ & 0xffffff;
                int i_59_ = i_55_ + ((i_56_ << 8) + (i_57_ << 16));
                Class379.anIntArray4098[i_43_] = i_59_;
            }
        }
    }

    boolean method3991(int i, byte[] is, int i_0_, boolean bool, int i_1_) {
        try {
            synchronized (this.data) {
                boolean bool_2_;
                try {
                    int i_3_;
                    if (bool) {
                        if (this.index.method6135(-1460152461) < (long) (i * 6 + 6)) {
                            boolean bool_4_ = false;
                            return bool_4_;
                        }
                        this.index.seek((long) (6 * i));
                        this.index.read(buffer, 0, 6, -1945961108);
                        i_3_ = (((buffer[3] & 0xff) << 16) + ((buffer[4] & 0xff) << 8) + (buffer[5] & 0xff));
                        if (i_3_ <= 0 || (long) i_3_ > (this.data.method6135(-1513278544) / 520L)) {
                            boolean bool_5_ = false;
                            return bool_5_;
                        }
                    } else {
                        i_3_ = (int) ((this.data.method6135(-1893675250) + 519L) / 520L);
                        if (i_3_ == 0)
                            i_3_ = 1;
                    }
                    buffer[0] = (byte) (i_0_ >> 16);
                    buffer[1] = (byte) (i_0_ >> 8);
                    buffer[2] = (byte) i_0_;
                    buffer[3] = (byte) (i_3_ >> 16);
                    buffer[4] = (byte) (i_3_ >> 8);
                    buffer[5] = (byte) i_3_;
                    this.index.seek((long) (i * 6));
                    this.index.method6134(buffer, 0, 6);
                    int i_6_ = 0;
                    int i_7_ = 0;
                    while (i_6_ < i_0_) {
                        int i_8_ = 0;
                        if (bool) {
                            this.data.seek((long) (i_3_ * 520));
                            int i_9_;
                            int i_10_;
                            int i_11_;
                            if (i > 65535) {
                                try {
                                    this.data.read(buffer, 0, 10, -1753859317);
                                } catch (EOFException eofexception) {
                                    break;
                                }
                                i_9_ = (((buffer[2] & 0xff) << 8) + (((buffer[0] & 0xff) << 24) + ((buffer[1] & 0xff) << 16)) + (buffer[3] & 0xff));
                                i_10_ = ((buffer[5] & 0xff) + ((buffer[4] & 0xff) << 8));
                                i_8_ = (((buffer[7] & 0xff) << 8) + ((buffer[6] & 0xff) << 16) + (buffer[8] & 0xff));
                                i_11_ = buffer[9] & 0xff;
                            } else {
                                try {
                                    this.data.read(buffer, 0, 8, -1374964621);
                                } catch (EOFException eofexception) {
                                    break;
                                }
                                i_9_ = ((buffer[1] & 0xff) + ((buffer[0] & 0xff) << 8));
                                i_10_ = (((buffer[2] & 0xff) << 8) + (buffer[3] & 0xff));
                                i_8_ = ((buffer[6] & 0xff) + (((buffer[5] & 0xff) << 8) + ((buffer[4] & 0xff) << 16)));
                                i_11_ = buffer[7] & 0xff;
                            }
                            if (i_9_ != i || i_7_ != i_10_ || i_11_ != (-1194991041 * this.anInt3493)) {
                                boolean bool_12_ = false;
                                return bool_12_;
                            }
                            if (i_8_ < 0 || ((long) i_8_ > this.data.method6135(-1633796509) / 520L)) {
                                boolean bool_13_ = false;
                                return bool_13_;
                            }
                        }
                        if (i_8_ == 0) {
                            bool = false;
                            i_8_ = (int) ((this.data.method6135(-1603705353) + 519L) / 520L);
                            if (0 == i_8_)
                                i_8_++;
                            if (i_8_ == i_3_)
                                i_8_++;
                        }
                        if (i_0_ - i_6_ <= 512)
                            i_8_ = 0;
                        if (i > 65535) {
                            buffer[0] = (byte) (i >> 24);
                            buffer[1] = (byte) (i >> 16);
                            buffer[2] = (byte) (i >> 8);
                            buffer[3] = (byte) i;
                            buffer[4] = (byte) (i_7_ >> 8);
                            buffer[5] = (byte) i_7_;
                            buffer[6] = (byte) (i_8_ >> 16);
                            buffer[7] = (byte) (i_8_ >> 8);
                            buffer[8] = (byte) i_8_;
                            buffer[9] = (byte) (-1194991041 * this.anInt3493);
                            this.data.seek((long) (i_3_ * 520));
                            this.data.method6134(buffer, 0, 10);
                            int i_14_ = i_0_ - i_6_;
                            if (i_14_ > 510)
                                i_14_ = 510;
                            this.data.method6134(is, i_6_, i_14_);
                            i_6_ += i_14_;
                        } else {
                            buffer[0] = (byte) (i >> 8);
                            buffer[1] = (byte) i;
                            buffer[2] = (byte) (i_7_ >> 8);
                            buffer[3] = (byte) i_7_;
                            buffer[4] = (byte) (i_8_ >> 16);
                            buffer[5] = (byte) (i_8_ >> 8);
                            buffer[6] = (byte) i_8_;
                            buffer[7] = (byte) (this.anInt3493 * -1194991041);
                            this.data.seek((long) (i_3_ * 520));
                            this.data.method6134(buffer, 0, 8);
                            int i_15_ = i_0_ - i_6_;
                            if (i_15_ > 512)
                                i_15_ = 512;
                            this.data.method6134(is, i_6_, i_15_);
                            i_6_ += i_15_;
                        }
                        i_3_ = i_8_;
                        i_7_++;
                    }
                    bool_2_ = true;
                } catch (IOException ioexception) {
                    boolean bool_16_ = false;
                    return bool_16_;
                }
                return bool_2_;
            }
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ns.b(").append(')').toString());
        }
    }

    public byte[] read(int i) {
        try {
            synchronized (this.data) {
                byte[] is;
                try {
                    if (this.index.method6135(-1862419954) < (long) (6 * i + 6)) {
                        byte[] is_18_ = null;
                        return is_18_;
                    }
                    this.index.seek((long) (6 * i));
                    this.index.read(buffer, 0, 6, -1665251619);
                    int i_19_ = (((buffer[0] & 0xff) << 16) + ((buffer[1] & 0xff) << 8) + (buffer[2] & 0xff));
                    int i_20_ = ((buffer[5] & 0xff) + (((buffer[4] & 0xff) << 8) + ((buffer[3] & 0xff) << 16)));
                    if (i_19_ < 0 || i_19_ > this.anInt3494 * -1289609275) {
                        byte[] is_21_ = null;
                        return is_21_;
                    }
                    if (i_20_ <= 0 || (long) i_20_ > (this.data.method6135(-1393462746) / 520L)) {
                        byte[] is_22_ = null;
                        return is_22_;
                    }
                    byte[] is_23_ = new byte[i_19_];
                    int i_24_ = 0;
                    int i_25_ = 0;
                    while (i_24_ < i_19_) {
                        if (0 == i_20_) {
                            byte[] is_26_ = null;
                            return is_26_;
                        }
                        this.data.seek((long) (520 * i_20_));
                        int i_27_ = i_19_ - i_24_;
                        int i_28_;
                        int i_29_;
                        int i_30_;
                        int i_31_;
                        int i_32_;
                        if (i > 65535) {
                            if (i_27_ > 510)
                                i_27_ = 510;
                            i_28_ = 10;
                            this.data.read(buffer, 0, i_28_ + i_27_, -2124921702);
                            i_29_ = (((buffer[2] & 0xff) << 8) + (((buffer[0] & 0xff) << 24) + ((buffer[1] & 0xff) << 16)) + (buffer[3] & 0xff));
                            i_30_ = (((buffer[4] & 0xff) << 8) + (buffer[5] & 0xff));
                            i_31_ = (((buffer[6] & 0xff) << 16) + ((buffer[7] & 0xff) << 8) + (buffer[8] & 0xff));
                            i_32_ = buffer[9] & 0xff;
                        } else {
                            if (i_27_ > 512)
                                i_27_ = 512;
                            i_28_ = 8;
                            this.data.read(buffer, 0, i_28_ + i_27_, -1642020087);
                            i_29_ = (((buffer[0] & 0xff) << 8) + (buffer[1] & 0xff));
                            i_30_ = ((buffer[3] & 0xff) + ((buffer[2] & 0xff) << 8));
                            i_31_ = (((buffer[5] & 0xff) << 8) + ((buffer[4] & 0xff) << 16) + (buffer[6] & 0xff));
                            i_32_ = buffer[7] & 0xff;
                        }
                        if (i_29_ != i || i_30_ != i_25_ || (-1194991041 * this.anInt3493 != i_32_)) {
                            byte[] is_33_ = null;
                            return is_33_;
                        }
                        if (i_31_ < 0 || (long) i_31_ > (this.data.method6135(-1934019874) / 520L)) {
                            byte[] is_34_ = null;
                            return is_34_;
                        }
                        int i_35_ = i_27_ + i_28_;
                        for (int i_36_ = i_28_; i_36_ < i_35_; i_36_++)
                            is_23_[i_24_++] = buffer[i_36_];
                        i_20_ = i_31_;
                        i_25_++;
                    }
                    is = is_23_;
                } catch (IOException ioexception) {
                    byte[] is_37_ = null;
                    return is_37_;
                }
                return is;
            }
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ns.a(").append(')').toString());
        }
    }

    public boolean write(int i, byte[] is, int i_38_, int i_39_) {
        try {
            synchronized (this.data) {
                if (i_38_ < 0 || i_38_ > -1289609275 * this.anInt3494)
                    throw new IllegalArgumentException();
                boolean bool = method3991(i, is, i_38_, true, 1494361890);
                if (!bool)
                    bool = method3991(i, is, i_38_, false, 1552417971);
                boolean bool_40_ = bool;
                return bool_40_;
            }
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ns.f(").append(')').toString());
        }
    }

    public String toString() {
        try {
            return new StringBuilder().append("").append(this.anInt3493 * -1194991041).toString();
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ns.toString(").append(')').toString());
        }
    }

}
