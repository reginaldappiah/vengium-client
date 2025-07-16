package com.jagex;/* Class462 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class462 {
    static SoftCache cache = new SoftCache(32);

    Class462() throws Throwable {
        throw new Error();
    }

    static String method5990(String string) {
        try {
            if (SystemTools.osName.startsWith("win"))
                return new StringBuilder().append(string).append(".dll").toString();
            if (SystemTools.osName.startsWith("linux"))
                return new StringBuilder().append("lib").append(string).append(".so").toString();
            if (SystemTools.osName.startsWith("mac"))
                return new StringBuilder().append("lib").append(string).append(".dylib").toString();
            return null;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("t.a(").append(')').toString());
        }
    }

    static void sweep() {
            synchronized (cache) {
                cache.sweep();
            }
    }

    public static ModelToolkit method2678(GraphicsToolkit graphicsToolkit, int i, int i_178_, int i_179_, int i_180_, int i_181_, ModelToolkit passedModelToolkit, int i_182_, int i_183_, int i_184_, int i_185_, Animator animator) {
        try {
            if (null == passedModelToolkit) {
                return null;
            }
            int mask = 2055;
            if (null != animator) {
                mask |= animator.getAnimationFlag();
                mask &= ~0x200;
            }
            long l = (((long) i_183_ << 48) + ((i_185_ << 24) + ((i_184_ << 16) + i_181_) + ((long) i_182_ << 32)));
            ModelToolkit modelToolkit;
            synchronized (cache) {
                modelToolkit = (ModelToolkit) cache.get(l);
            }
            if (modelToolkit == null || graphicsToolkit.method5017(modelToolkit.m(), mask) != 0) {
                if (modelToolkit != null) {
                    mask = graphicsToolkit.method5004(mask, modelToolkit.m());
                }
                int i_189_;
                if (i_181_ == 1) {
                    i_189_ = 9;
                } else if (2 == i_181_) {
                    i_189_ = 12;
                } else if (i_181_ == 3) {
                    i_189_ = 15;
                } else if (4 == i_181_) {
                    i_189_ = 18;
                } else {
                    i_189_ = 21;
                }
                int i_190_ = 3;
                int[] is = { 64, 96, 128 };
                BaseModel model = new BaseModel(1 + i_190_ * i_189_, 2 * (i_190_ * i_189_) - i_189_, 0);
                int i_191_ = model.method747(0, 0, 0);
                int[][] is_192_ = new int[i_190_][i_189_];
                for (int i_193_ = 0; i_193_ < i_190_; i_193_++) {
                    int i_194_ = is[i_193_];
                    int i_195_ = is[i_193_];
                    for (int i_196_ = 0; i_196_ < i_189_; i_196_++) {
                        int i_197_ = (i_196_ << 14) / i_189_;
                        int i_198_ = i_194_ * CircleAngleTable.SINE[i_197_] >> 14;
                        int i_199_ = i_195_ * CircleAngleTable.COSINE[i_197_] >> 14;
                        is_192_[i_193_][i_196_] = model.method747(i_198_, 0, i_199_);
                    }
                }
                for (int i_200_ = 0; i_200_ < i_190_; i_200_++) {
                    int i_201_ = (128 + i_200_ * 256) / i_190_;
                    int i_202_ = 256 - i_201_;
                    byte i_203_ = (byte) (i_185_ * i_201_ + i_202_ * i_184_ >> 8);
                    short i_204_ = (short) ((((i_202_ * (i_182_ & 0x7f) + i_201_ * (i_183_ & 0x7F)) & 0x7F00) + ((((i_183_ & 0xFC00) * i_201_ + (i_182_ & 0xFC00) * i_202_) & 0xFC0000) + ((i_201_ * (i_183_ & 0x380) + i_202_ * (i_182_ & 0x380)) & 0x38000))) >> 8);
                    for (int i_205_ = 0; i_205_ < i_189_; i_205_++) {
                        if (0 == i_200_) {
                            model.method748(i_191_, (is_192_[0][(1 + i_205_) % i_189_]), is_192_[0][i_205_], (byte) 1, (byte) -1, i_204_, i_203_, (short) -1);
                        } else {
                            model.method748(is_192_[i_200_ - 1][i_205_], (is_192_[i_200_ - 1][(1 + i_205_) % i_189_]), (is_192_[i_200_][(1 + i_205_) % i_189_]), (byte) 1, (byte) -1, i_204_, i_203_, (short) -1);
                            model.method748(is_192_[i_200_ - 1][i_205_], (is_192_[i_200_][(i_205_ + 1) % i_189_]), is_192_[i_200_][i_205_], (byte) 1, (byte) -1, i_204_, i_203_, (short) -1);
                        }
                    }
                }
                modelToolkit = graphicsToolkit.creatModelToolkit(model, mask, 161976139 * Class419.anInt5341, 64, 768);
                synchronized (cache) {
                    cache.put(modelToolkit, l);
                }
            }
            int i_206_ = passedModelToolkit.RA();
            int i_207_ = passedModelToolkit.ya();
            int i_208_ = passedModelToolkit.AA();
            int i_209_ = passedModelToolkit.ha();
            if (animator != null) {
                modelToolkit = modelToolkit.method4755((byte) 3, mask, true);
                modelToolkit.oa(i_207_ - i_206_ >> 1, 128, i_209_ - i_208_ >> 1);
                modelToolkit.ia(i_206_ + i_207_ >> 1, 0, i_208_ + i_209_ >> 1);
                animator.method5831(modelToolkit);
            } else {
                modelToolkit = modelToolkit.method4755((byte) 3, mask, true);
                modelToolkit.oa(i_207_ - i_206_ >> 1, 128, i_209_ - i_208_ >> 1);
                modelToolkit.ia(i_206_ + i_207_ >> 1, 0, i_209_ + i_208_ >> 1);
            }
            if (i_178_ != 0) {
                modelToolkit.t(i_178_);
            }
            if (0 != i_179_) {
                modelToolkit.EA(i_179_);
            }
            if (i_180_ != 0) {
                modelToolkit.ia(0, i_180_, 0);
            }
            return modelToolkit;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("lt.a(").append(')').toString());
        }
    }

    static void method2496(int i) {
        synchronized (cache) {
            cache.method4186(i);
        }
    }

    static void clear() {
        try {
            synchronized (cache) {
                cache.clear();
            }
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("tw.b(").append(')').toString());
        }
    }

    static void method4515(int i) {
        try {
            Class419.anInt5341 = -249626013 * i;
            synchronized (cache) {
                cache.clear();
            }
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wq.f(").append(')').toString());
        }
    }
}
