package com.jagex;/* PaddedResourceWorker_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.utils.TimeUtils;

import java.io.IOException;

public class PaddedResourceWorker_Sub1 extends PaddedResourceWorker {
    Stream connection;

    void method2359() {
        try {
            try {
                this.connection.close();
            } catch (Exception exception) {
                /* empty */
            }
            this.connection = null;
            anInt2735 += 686188557;
            anInt2745 = 1293857183;
            this.aByte2743 = (byte) (int) (Math.random() * 255.0 + 1.0);
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("aae.k(").append(')').toString());
        }
    }

    public boolean method2351(int i) {
        try {
            if (null != this.connection) {
                long l = TimeUtils.getTime();
                int i_0_ = (int) (l - (5958027995888260733L * this.aLong2741));
                this.aLong2741 = l * 2125194141775565525L;
                if (i_0_ > 200)
                    i_0_ = 200;
                this.anInt2740 += i_0_ * 506122611;
                if (987675579 * this.anInt2740 > 30000) {
                    try {
                        this.connection.close();
                    } catch (Exception exception) {
						/* empty */
                    }
                    this.connection = null;
                }
            }
            if (this.connection == null) {
                return getHighPriorityRequestsCount() == 0 && extras() == 0;
            }
            boolean bool;
            try {
                for (PaddedResourceRequest paddedResourceRequest = ((PaddedResourceRequest) this.priorities.first()); null != paddedResourceRequest; paddedResourceRequest = ((PaddedResourceRequest) this.priorities.next())) {
                    this.aClass298_Sub53_2744.offset = 0;
                    this.aClass298_Sub53_2744.writeByte(1);
                    this.aClass298_Sub53_2744.method3584(-5533549728640346679L * paddedResourceRequest.cachedKey);
                    this.connection.method3868((this.aClass298_Sub53_2744.buffer), 0, (this.aClass298_Sub53_2744.buffer).length);
                    this.waitingPriorities.offer(paddedResourceRequest);
                }
                for (PaddedResourceRequest paddedResourceRequest = ((PaddedResourceRequest) this.extras.first()); null != paddedResourceRequest; paddedResourceRequest = ((PaddedResourceRequest) this.extras.next())) {
                    this.aClass298_Sub53_2744.offset = 0;
                    this.aClass298_Sub53_2744.writeByte(0);
                    this.aClass298_Sub53_2744.method3584(paddedResourceRequest.cachedKey * -5533549728640346679L);
                    this.connection.method3868((this.aClass298_Sub53_2744.buffer), 0, (this.aClass298_Sub53_2744.buffer).length);
                    this.waitingExtras.offer(paddedResourceRequest);
                }
                for (int i_1_ = 0; i_1_ < 100; i_1_++) {
                    int i_2_ = this.connection.method3857(1329342411);
                    if (i_2_ < 0)
                        throw new IOException();
                    if (i_2_ == 0) {
                        if (i != -358267640)
                            throw new IllegalStateException();
                        break;
                    }
                    this.anInt2740 = 0;
                    int i_3_ = 0;
                    if (null == (this.current))
                        i_3_ = 10;
                    else if (0 == (1488798733 * (this.current.anInt10005)))
                        i_3_ = 1;
                    if (i_3_ > 0) {
                        int i_4_ = i_3_ - ((this.aClass298_Sub53_2737.offset) * 385051775);
                        if (i_4_ > i_2_)
                            i_4_ = i_2_;
                        this.connection.readBytes((this.aClass298_Sub53_2737.buffer), 385051775 * (this.aClass298_Sub53_2737.offset), i_4_);
                        if (this.aByte2743 != 0) {
                            for (int i_5_ = 0; i_5_ < i_4_; i_5_++)
                                this.aClass298_Sub53_2737.buffer[((this.aClass298_Sub53_2737.offset) * 385051775) + i_5_] ^= this.aByte2743;
                        }
                        this.aClass298_Sub53_2737.offset += 116413311 * i_4_;
                        if ((this.aClass298_Sub53_2737.offset) * 385051775 < i_3_) {
                            if (i != -358267640) {
								/* empty */
                            }
                        } else if (null == (this.current)) {
                            this.aClass298_Sub53_2737.offset = 0;
                            int i_6_ = this.aClass298_Sub53_2737.readUByte();
                            int i_7_ = this.aClass298_Sub53_2737.readInt();
                            int i_8_ = this.aClass298_Sub53_2737.readUByte();
                            int i_9_ = this.aClass298_Sub53_2737.readInt();
                            int i_10_ = i_8_ & 0x7f;
                            boolean bool_11_ = 0 != (i_8_ & 0x80);
                            long l = ((long) i_6_ << 32) + (long) i_7_;
                            Object object = null;
                            PaddedResourceRequest paddedResourceRequest;
                            if (bool_11_) {
                                for (paddedResourceRequest = ((PaddedResourceRequest) this.waitingExtras.first()); null != paddedResourceRequest; paddedResourceRequest = ((PaddedResourceRequest) this.waitingExtras.next())) {
                                    if ((-5533549728640346679L * paddedResourceRequest.cachedKey) == l) {
                                        if (i != -358267640)
                                            throw new IllegalStateException();
                                        break;
                                    }
                                }
                            } else {
                                for (paddedResourceRequest = ((PaddedResourceRequest) this.waitingPriorities.first()); null != paddedResourceRequest; paddedResourceRequest = ((PaddedResourceRequest) this.waitingPriorities.next())) {
                                    if (l == (paddedResourceRequest.cachedKey * -5533549728640346679L)) {
                                        if (i != -358267640)
                                            throw new IllegalStateException();
                                        break;
                                    }
                                }
                            }
                            if (paddedResourceRequest == null)
                                throw new IOException();
                            int i_12_ = 0 == i_10_ ? 5 : 9;
                            this.current = paddedResourceRequest;
                            this.current.aClass298_Sub53_10004 = (new Buffer((this.current.padding) + (i_12_ + i_9_)));
                            this.current.aClass298_Sub53_10004.writeByte(i_10_);
                            this.current.aClass298_Sub53_10004.writeInt(i_9_);
                            this.current.anInt10005 = 154839986;
                            this.aClass298_Sub53_2737.offset = 0;
                        } else if (0 == (1488798733 * (this.current.anInt10005))) {
                            if (-1 == (this.aClass298_Sub53_2737.buffer[0])) {
                                this.current.anInt10005 = 1733470917;
                                this.aClass298_Sub53_2737.offset = 0;
                            } else
                                this.current = null;
                        } else
                            throw new IOException();
                    } else {
                        int i_13_ = ((this.current.aClass298_Sub53_10004.buffer).length - (this.current.padding));
                        int i_14_ = 512 - (1488798733 * (this.current.anInt10005));
                        if (i_14_ > i_13_ - ((this.current.aClass298_Sub53_10004.offset) * 385051775))
                            i_14_ = (i_13_ - (385051775 * (this.current.aClass298_Sub53_10004.offset)));
                        if (i_14_ > i_2_)
                            i_14_ = i_2_;
                        this.connection.readBytes((this.current.aClass298_Sub53_10004.buffer), 385051775 * (this.current.aClass298_Sub53_10004.offset), i_14_);
                        if (0 != this.aByte2743) {
                            for (int i_15_ = 0; i_15_ < i_14_; i_15_++)
                                this.current.aClass298_Sub53_10004.buffer[((this.current.aClass298_Sub53_10004.offset) * 385051775) + i_15_] ^= this.aByte2743;
                        }
                        this.current.aClass298_Sub53_10004.offset += 116413311 * i_14_;
                        this.current.anInt10005 += i_14_ * 1733470917;
                        if ((this.current.aClass298_Sub53_10004.offset) * 385051775 == i_13_) {
                            this.current.unlinkCache();
                            this.current.waiting = false;
                            this.current = null;
                        } else if (512 == (this.current.anInt10005) * 1488798733)
                            this.current.anInt10005 = 0;
                    }
                }
                bool = true;
            } catch (IOException ioexception) {
                try {
                    this.connection.close();
                } catch (Exception exception) {
					/* empty */
                }
                this.connection = null;
                anInt2735 += 686188557;
                anInt2745 = -1707252930;
                return getHighPriorityRequestsCount() == 0 && extras() == 0;
            }
            return bool;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("aae.d(").append(')').toString());
        }
    }

    public void method2343(boolean bool, int i) {
        try {
            if (this.connection != null) {
                try {
                    this.aClass298_Sub53_2744.offset = 0;
                    this.aClass298_Sub53_2744.writeByte(bool ? 2 : 3);
                    this.aClass298_Sub53_2744.method3584(0L);
                    this.connection.method3868((this.aClass298_Sub53_2744.buffer), 0, (this.aClass298_Sub53_2744.buffer).length);
                } catch (IOException ioexception) {
                    try {
                        this.connection.close();
                    } catch (Exception exception) {
						/* empty */
                    }
                    this.connection = null;
                    anInt2735 += 686188557;
                    anInt2745 = -1707252930;
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("aae.posX(").append(')').toString());
        }
    }

    public void method2345(byte i) {
        try {
            if (this.connection != null) {
                try {
                    this.aClass298_Sub53_2744.offset = 0;
                    this.aClass298_Sub53_2744.writeByte(7);
                    this.aClass298_Sub53_2744.method3584(0L);
                    this.connection.method3868((this.aClass298_Sub53_2744.buffer), 0, (this.aClass298_Sub53_2744.buffer).length);
                } catch (IOException ioexception) {
                    try {
                        this.connection.close();
                    } catch (Exception exception) {
						/* empty */
                    }
                    this.connection = null;
                    anInt2735 += 686188557;
                    anInt2745 = -1707252930;
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("aae.r(").append(')').toString());
        }
    }

    public void method2353(short i) {
        try {
            if (this.connection != null)
                this.connection.method3867((byte) 53);
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("aae.n(").append(')').toString());
        }
    }

    public void close() {
        if (this.connection != null)
            this.connection.close();
    }

    void method2377(byte i) {
        try {
            if (this.connection != null) {
                try {
                    this.aClass298_Sub53_2744.offset = 0;
                    this.aClass298_Sub53_2744.writeByte(6);
                    this.aClass298_Sub53_2744.putTriByte(3);
                    this.aClass298_Sub53_2744.writeShort(0);
                    this.connection.method3868((this.aClass298_Sub53_2744.buffer), 0, (this.aClass298_Sub53_2744.buffer).length);
                } catch (IOException ioexception) {
                    try {
                        this.connection.close();
                    } catch (Exception exception) {
						/* empty */
                    }
                    this.connection = null;
                    anInt2735 += 686188557;
                    anInt2745 = -1707252930;
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("aae.ah(").append(')').toString());
        }
    }

    public void init(Object object, boolean loggedIn) {
        if (this.connection != null) {
            try {
                this.connection.close();
            } catch (Exception exception) {
					/* empty */
            }
            this.connection = null;
        }
        this.connection = (Stream) object;
        method2377((byte) -1);
        method2343(loggedIn, -1391987547);
        this.aClass298_Sub53_2737.offset = 0;
        this.current = null;
        for (; ; ) {
            PaddedResourceRequest paddedResourceRequest = ((PaddedResourceRequest) this.waitingPriorities.poll());
            if (paddedResourceRequest == null) {
                break;
            }
            this.priorities.offer(paddedResourceRequest);
        }
        for (; ; ) {
            PaddedResourceRequest paddedResourceRequest = ((PaddedResourceRequest) this.waitingExtras.poll());
            if (paddedResourceRequest == null) {
                break;
            }
            this.extras.offer(paddedResourceRequest);
        }
        if (0 != this.aByte2743) {
            try {
                this.aClass298_Sub53_2744.offset = 0;
                this.aClass298_Sub53_2744.writeByte(4);
                this.aClass298_Sub53_2744.writeByte(this.aByte2743);
                this.aClass298_Sub53_2744.writeInt(0);
                this.connection.method3868((this.aClass298_Sub53_2744.buffer), 0, (this.aClass298_Sub53_2744.buffer).length);
            } catch (IOException ioexception) {
                try {
                    this.connection.close();
                } catch (Exception exception) {
						/* empty */
                }
                this.connection = null;
                anInt2735 += 686188557;
                anInt2745 = -1707252930;
            }
        }
        this.anInt2740 = 0;
        this.aLong2741 = TimeUtils.getTime() * 2125194141775565525L;
    }

}
