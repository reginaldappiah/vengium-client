package com.jagex;/* BufferedFile - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.EOFException;
import java.io.IOException;

public class BufferedFile {
    static int anInt6057;
    DiskFile file;
    long aLong6047;
    long aLong6048 = -8905853134302459951L;
    int anInt6049;
    byte[] aByteArray6050;
    long aLong6051 = -483645590008820269L;
    byte[] aByteArray6052;
    int anInt6053 = 0;
    long aLong6054;
    long aLong6055;
    long aLong6056;

    public BufferedFile(DiskFile file, int i, int i_20_) throws IOException {
        this.file = file;
        this.aLong6055 = ((this.aLong6054 = file.getFileLength() * -2138022200351563309L) * 4755452723842239733L);
        this.aByteArray6052 = new byte[i];
        this.aByteArray6050 = new byte[i_20_];
        this.aLong6047 = 0L;
    }

    public void method6133(int i) throws IOException {
            method6138((byte) 63);
            this.file.method6079();
    }

    public void method6134(byte[] is, int i, int i_0_) throws IOException {
        try {
            do {
                try {
                    if ((2482753095985495469L * this.aLong6047 + (long) i_0_) > this.aLong6055 * -7034414526671508465L)
                        this.aLong6055 = ((2482753095985495469L * this.aLong6047) + (long) i_0_) * 1637511753732440815L;
                    if (-1L != (-3151226325898744411L * this.aLong6051) && ((2482753095985495469L * this.aLong6047 < (-3151226325898744411L * this.aLong6051)) || ((this.aLong6047 * 2482753095985495469L) > ((-3151226325898744411L * this.aLong6051) + (long) (447269525 * this.anInt6053)))))
                        method6138((byte) 104);
                    if ((-3151226325898744411L * this.aLong6051 != -1L) && ((long) i_0_ + (2482753095985495469L * this.aLong6047) > ((-3151226325898744411L * this.aLong6051) + (long) (this.aByteArray6050).length))) {
                        int i_2_ = (int) ((long) (this.aByteArray6050).length - ((2482753095985495469L * this.aLong6047) - (this.aLong6051 * -3151226325898744411L)));
                        System.arraycopy(is, i, this.aByteArray6050, (int) ((2482753095985495469L * this.aLong6047) - (this.aLong6051 * -3151226325898744411L)), i_2_);
                        this.aLong6047 += -4167043960764305883L * (long) i_2_;
                        i += i_2_;
                        i_0_ -= i_2_;
                        this.anInt6053 = (44871869 * this.aByteArray6050.length);
                        method6138((byte) 18);
                    }
                    if (i_0_ > this.aByteArray6050.length) {
                        if (-6802897060071190031L * this.aLong6056 != (2482753095985495469L * this.aLong6047)) {
                            this.file.method6077(this.aLong6047 * 2482753095985495469L);
                            this.aLong6056 = (this.aLong6047 * -4798501635493713027L);
                        }
                        this.file.method6078(is, i, i_0_);
                        this.aLong6056 += (long) i_0_ * -6791912350805098735L;
                        if (-6802897060071190031L * this.aLong6056 > (4615439178561396315L * this.aLong6054))
                            this.aLong6054 = (this.aLong6056 * -4019893457238828381L);
                        long l = -1L;
                        long l_3_ = -1L;
                        if ((2482753095985495469L * this.aLong6047 >= (this.aLong6048 * -6509381880913424689L)) && ((this.aLong6047 * 2482753095985495469L) < ((-6509381880913424689L * this.aLong6048) + (long) (this.anInt6049 * 998848593))))
                            l = (this.aLong6047 * 2482753095985495469L);
                        else if (((-6509381880913424689L * this.aLong6048) >= (this.aLong6047 * 2482753095985495469L)) && ((-6509381880913424689L * this.aLong6048) < ((2482753095985495469L * this.aLong6047) + (long) i_0_)))
                            l = (this.aLong6048 * -6509381880913424689L);
                        if (((long) i_0_ + (2482753095985495469L * this.aLong6047) > (-6509381880913424689L * this.aLong6048)) && ((long) i_0_ + (2482753095985495469L * this.aLong6047) <= ((long) (998848593 * this.anInt6049) + (this.aLong6048 * -6509381880913424689L))))
                            l_3_ = ((long) i_0_ + (2482753095985495469L * this.aLong6047));
                        else if ((((this.aLong6048 * -6509381880913424689L) + (long) (this.anInt6049 * 998848593)) > (this.aLong6047 * 2482753095985495469L)) && (((long) (998848593 * this.anInt6049) + (this.aLong6048 * -6509381880913424689L)) <= ((2482753095985495469L * this.aLong6047) + (long) i_0_)))
                            l_3_ = ((long) (this.anInt6049 * 998848593) + (this.aLong6048 * -6509381880913424689L));
                        if (l > -1L && l_3_ > l) {
                            int i_4_ = (int) (l_3_ - l);
                            System.arraycopy(is, (int) ((long) i + l - (2482753095985495469L * this.aLong6047)), this.aByteArray6052, (int) (l - (this.aLong6048 * -6509381880913424689L)), i_4_);
                        }
                        this.aLong6047 += (long) i_0_ * -4167043960764305883L;
                    } else {
                        if (i_0_ <= 0)
                            break;
                        if (-1L == (-3151226325898744411L * this.aLong6051))
                            this.aLong6051 = (2209468448714957161L * this.aLong6047);
                        System.arraycopy(is, i, this.aByteArray6050, (int) ((this.aLong6047 * 2482753095985495469L) - (this.aLong6051 * -3151226325898744411L)), i_0_);
                        this.aLong6047 += -4167043960764305883L * (long) i_0_;
                        if ((2482753095985495469L * this.aLong6047 - (-3151226325898744411L * this.aLong6051)) > (long) (this.anInt6053 * 447269525))
                            this.anInt6053 = (44871869 * (int) ((2482753095985495469L * this.aLong6047) - (-3151226325898744411L * (this.aLong6051))));
                    }
                } catch (IOException ioexception) {
                    this.aLong6056 = 6791912350805098735L;
                    throw ioexception;
                }
                break;
            } while (false);
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ty.d(").append(')').toString());
        }
    }

    public long method6135(int i) {
        try {
            return this.aLong6055 * -7034414526671508465L;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ty.b(").append(')').toString());
        }
    }

    public void method6136(byte[] is, int i) throws IOException {
        try {
            read(is, 0, is.length, -1421240116);
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ty.p(").append(')').toString());
        }
    }

    void method6137(int i) throws IOException {
        try {
            this.anInt6049 = 0;
            if (2482753095985495469L * this.aLong6047 != -6802897060071190031L * this.aLong6056) {
                this.file.method6077(2482753095985495469L * this.aLong6047);
                this.aLong6056 = -4798501635493713027L * this.aLong6047;
            }
            this.aLong6048 = -3797790670521537853L * this.aLong6047;
            int i_5_;
            for (/**/; (998848593 * this.anInt6049 < this.aByteArray6052.length); this.anInt6049 += i_5_ * -1121251151) {
                int i_6_ = (this.aByteArray6052.length - this.anInt6049 * 998848593);
                if (i_6_ > 200000000)
                    i_6_ = 200000000;
                i_5_ = (this.file.method6081(this.aByteArray6052, this.anInt6049 * 998848593, i_6_, (short) 2486));
                if (-1 == i_5_) {
                    if (i == 65346295) {
                        /* empty */
                    }
                    break;
                }
                this.aLong6056 += (long) i_5_ * -6791912350805098735L;
            }
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ty.k(").append(')').toString());
        }
    }

    void method6138(byte i) throws IOException {
        try {
            if (-3151226325898744411L * this.aLong6051 != -1L) {
                if (-3151226325898744411L * this.aLong6051 != this.aLong6056 * -6802897060071190031L) {
                    this.file.method6077(this.aLong6051 * -3151226325898744411L);
                    this.aLong6056 = this.aLong6051 * 8772800544907846389L;
                }
                this.file.method6078(this.aByteArray6050, 0, this.anInt6053 * 447269525);
                this.aLong6056 += (-7564286584664531227L * (long) this.anInt6053);
                if (-6802897060071190031L * this.aLong6056 > this.aLong6054 * 4615439178561396315L)
                    this.aLong6054 = -4019893457238828381L * this.aLong6056;
                long l = -1L;
                long l_7_ = -1L;
                if ((-3151226325898744411L * this.aLong6051 >= this.aLong6048 * -6509381880913424689L) && (this.aLong6051 * -3151226325898744411L < (-6509381880913424689L * this.aLong6048 + (long) (this.anInt6049 * 998848593))))
                    l = this.aLong6051 * -3151226325898744411L;
                else if ((this.aLong6048 * -6509381880913424689L >= (this.aLong6051 * -3151226325898744411L)) && ((-6509381880913424689L * this.aLong6048) < ((-3151226325898744411L * this.aLong6051) + (long) (447269525 * this.anInt6053))))
                    l = -6509381880913424689L * this.aLong6048;
                if (((-3151226325898744411L * this.aLong6051 + (long) (this.anInt6053 * 447269525)) > -6509381880913424689L * this.aLong6048) && (((long) (447269525 * this.anInt6053) + this.aLong6051 * -3151226325898744411L) <= ((long) (998848593 * this.anInt6049) + (-6509381880913424689L * this.aLong6048))))
                    l_7_ = (this.aLong6051 * -3151226325898744411L + (long) (this.anInt6053 * 447269525));
                else if ((((long) (998848593 * this.anInt6049) + (this.aLong6048 * -6509381880913424689L)) > (this.aLong6051 * -3151226325898744411L)) && (((this.aLong6048 * -6509381880913424689L) + (long) (this.anInt6049 * 998848593)) <= ((-3151226325898744411L * this.aLong6051) + (long) (447269525 * this.anInt6053))))
                    l_7_ = ((long) (998848593 * this.anInt6049) + (this.aLong6048 * -6509381880913424689L));
                if (l > -1L && l_7_ > l) {
                    int i_8_ = (int) (l_7_ - l);
                    System.arraycopy(this.aByteArray6050, (int) (l - (-3151226325898744411L * this.aLong6051)), this.aByteArray6052, (int) (l - (this.aLong6048 * -6509381880913424689L)), i_8_);
                }
                this.aLong6051 = -483645590008820269L;
                this.anInt6053 = 0;
            }
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ty.u(").append(')').toString());
        }
    }

    public void read(byte[] is, int i, int i_9_, int i_10_) throws IOException {
        try {
            try {
                if (i_9_ + i > is.length)
                    throw new ArrayIndexOutOfBoundsException(i + i_9_ - is.length);
                if (-1L != -3151226325898744411L * this.aLong6051 && (this.aLong6047 * 2482753095985495469L >= -3151226325898744411L * this.aLong6051) && ((2482753095985495469L * this.aLong6047 + (long) i_9_) <= ((long) (447269525 * this.anInt6053) + (this.aLong6051 * -3151226325898744411L)))) {
                    System.arraycopy(this.aByteArray6050, (int) ((2482753095985495469L * this.aLong6047) - (this.aLong6051 * -3151226325898744411L)), is, i, i_9_);
                    this.aLong6047 += -4167043960764305883L * (long) i_9_;
                    return;
                }
                long l = 2482753095985495469L * this.aLong6047;
                int i_11_ = i;
                int i_12_ = i_9_;
                if ((this.aLong6047 * 2482753095985495469L >= -6509381880913424689L * this.aLong6048) && (2482753095985495469L * this.aLong6047 < ((long) (998848593 * this.anInt6049) + (-6509381880913424689L * this.aLong6048)))) {
                    int i_13_ = (int) ((long) (this.anInt6049 * 998848593) - ((this.aLong6047 * 2482753095985495469L) - (-6509381880913424689L * this.aLong6048)));
                    if (i_13_ > i_9_)
                        i_13_ = i_9_;
                    System.arraycopy(this.aByteArray6052, (int) ((2482753095985495469L * this.aLong6047) - (-6509381880913424689L * this.aLong6048)), is, i, i_13_);
                    this.aLong6047 += (long) i_13_ * -4167043960764305883L;
                    i += i_13_;
                    i_9_ -= i_13_;
                }
                if (i_9_ > this.aByteArray6052.length) {
                    this.file.method6077(2482753095985495469L * this.aLong6047);
                    this.aLong6056 = this.aLong6047 * -4798501635493713027L;
                    int i_14_;
                    for (/**/; i_9_ > 0; i_9_ -= i_14_) {
                        i_14_ = this.file.method6081(is, i, i_9_, (short) 17941);
                        if (i_14_ == -1) {
                            if (i_10_ >= -1248661228) {
								/* empty */
                            }
                            break;
                        }
                        this.aLong6056 += -6791912350805098735L * (long) i_14_;
                        this.aLong6047 += -4167043960764305883L * (long) i_14_;
                        i += i_14_;
                    }
                } else if (i_9_ > 0) {
                    method6137(334196140);
                    int i_15_ = i_9_;
                    if (i_15_ > 998848593 * this.anInt6049)
                        i_15_ = 998848593 * this.anInt6049;
                    System.arraycopy(this.aByteArray6052, 0, is, i, i_15_);
                    i += i_15_;
                    i_9_ -= i_15_;
                    this.aLong6047 += -4167043960764305883L * (long) i_15_;
                }
                if (-3151226325898744411L * this.aLong6051 != -1L) {
                    if ((-3151226325898744411L * this.aLong6051 > 2482753095985495469L * this.aLong6047) && i_9_ > 0) {
                        int i_16_ = i + (int) ((-3151226325898744411L * this.aLong6051) - (2482753095985495469L * this.aLong6047));
                        if (i_16_ > i_9_ + i)
                            i_16_ = i + i_9_;
                        while (i < i_16_) {
                            is[i++] = (byte) 0;
                            i_9_--;
                            this.aLong6047 += -4167043960764305883L;
                        }
                    }
                    long l_17_ = -1L;
                    long l_18_ = -1L;
                    if ((this.aLong6051 * -3151226325898744411L >= l) && (this.aLong6051 * -3151226325898744411L < (long) i_12_ + l))
                        l_17_ = (-3151226325898744411L * this.aLong6051);
                    else if (l >= (this.aLong6051 * -3151226325898744411L) && l < ((long) (447269525 * this.anInt6053) + (-3151226325898744411L * this.aLong6051)))
                        l_17_ = l;
                    if (((-3151226325898744411L * this.aLong6051 + (long) (this.anInt6053 * 447269525)) > l) && ((long) (447269525 * this.anInt6053) + (this.aLong6051 * -3151226325898744411L)) <= (long) i_12_ + l)
                        l_18_ = ((this.aLong6051 * -3151226325898744411L) + (long) (this.anInt6053 * 447269525));
                    else if (l + (long) i_12_ > (-3151226325898744411L * this.aLong6051) && (l + (long) i_12_ <= ((-3151226325898744411L * this.aLong6051) + (long) (447269525 * (this.anInt6053)))))
                        l_18_ = (long) i_12_ + l;
                    if (l_17_ > -1L && l_18_ > l_17_) {
                        int i_19_ = (int) (l_18_ - l_17_);
                        System.arraycopy(this.aByteArray6050, (int) (l_17_ - (-3151226325898744411L * (this.aLong6051))), is, i_11_ + (int) (l_17_ - l), i_19_);
                        if (l_18_ > (2482753095985495469L * this.aLong6047)) {
                            i_9_ -= l_18_ - (this.aLong6047 * 2482753095985495469L);
                            this.aLong6047 = -4167043960764305883L * l_18_;
                        }
                    }
                }
            } catch (IOException ioexception) {
                this.aLong6056 = 6791912350805098735L;
                throw ioexception;
            }
            if (i_9_ > 0)
                throw new EOFException();
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ty.i(").append(')').toString());
        }
    }

    public void seek(long l) throws IOException {
        try {
            if (l < 0L)
                throw new IOException();
            this.aLong6047 = l * -4167043960764305883L;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ty.f(").append(')').toString());
        }
    }
}
