package com.jagex;/* Class398 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class SpotType {
    public int animationID = -761293581;
    public boolean aBoolean5215;
    public byte translationType;
    int anInt5202;
    int translationBounds;
    int anInt5204;
    short[] aShortArray5206;
    short[] aShortArray5207;
    short[] aShortArray5208;
    short[] aShortArray5209;
    SpotTypeLoader loader;
    int resizeY;
    int rotation;
    int anInt5213;
    int anInt5214;
    int resizeX = -1498254464;

    SpotType() {
        this.resizeY = -2062770560;
        this.rotation = 0;
        this.anInt5213 = 0;
        this.anInt5214 = 0;
        aBoolean5215 = false;
        translationType = (byte) 0;
        this.translationBounds = -48388469;
    }

    void readValueLoop(Buffer buffer) {
        for (; ; ) {
            int opcode = buffer.readUByte();
            if (0 == opcode) {
                break;
            }
            decode(buffer, opcode);
        }
    }

    void decode(Buffer buffer, int opcode) {
        if (1 == opcode) {
            this.anInt5204 = buffer.readBigSmart() * 422607467;
        } else if (opcode == 2) {
            animationID = buffer.readBigSmart() * 761293581;
        } else if (4 == opcode) {
            this.resizeX = buffer.readUShort() * -1420991257;
        } else if (opcode == 5) {
            this.resizeY = buffer.readUShort() * -586540739;
        } else if (opcode == 6) {
            this.rotation = buffer.readUShort() * -79411937;
        } else if (7 == opcode) {
            this.anInt5213 = buffer.readUByte() * 1905965041;
        } else if (8 == opcode) {
            this.anInt5214 = buffer.readUByte() * -241990007;
        } else if (9 == opcode) {
            translationType = (byte) 3;
            this.translationBounds = -1485189472;
        } else if (10 == opcode) {
            aBoolean5215 = true;
        } else if (opcode == 11) {
            translationType = (byte) 1;
        } else if (12 == opcode) {
            translationType = (byte) 4;
        } else if (opcode == 13) {
            translationType = (byte) 5;
        } else if (14 == opcode) {
            translationType = (byte) 2;
            this.translationBounds = buffer.readUByte() * -497453824;
        } else if (opcode == 15) {
            translationType = (byte) 3;
            this.translationBounds = buffer.readUShort() * 48388469;
        } else if (16 == opcode) {
            translationType = (byte) 3;
            this.translationBounds = buffer.readInt() * 48388469;
        } else if (40 == opcode) {
            int i_2_ = buffer.readUByte();
            this.aShortArray5206 = new short[i_2_];
            this.aShortArray5207 = new short[i_2_];
            for (int i_3_ = 0; i_3_ < i_2_; i_3_++) {
                this.aShortArray5206[i_3_] = (short) buffer.readUShort();
                this.aShortArray5207[i_3_] = (short) buffer.readUShort();
            }
        } else if (41 == opcode) {
            int i_4_ = buffer.readUByte();
            this.aShortArray5208 = new short[i_4_];
            this.aShortArray5209 = new short[i_4_];
            for (int i_5_ = 0; i_5_ < i_4_; i_5_++) {
                this.aShortArray5208[i_5_] = (short) buffer.readUShort();
                this.aShortArray5209[i_5_] = (short) buffer.readUShort();
            }
        }
    }

    public final ModelToolkit method4917(GraphicsToolkit graphicsToolkit, int i, Animator animator, byte i_6_) {
        return method4918(graphicsToolkit, i, false, null, null, 0, 0, 0, animator, i_6_);

    }

    public final ModelToolkit method4918(GraphicsToolkit graphicsToolkit, int i, boolean hasFixedTranslation, FloorToolkit class_xa, FloorToolkit class_xa_8_, int i_9_, int i_10_, int i_11_, Animator animator, byte i_12_) {
        int i_14_ = i;
        hasFixedTranslation = hasFixedTranslation & 0 != translationType;
        if (null != animator) {
            i_14_ |= animator.getAnimationFlag();
        }
        if (hasFixedTranslation) {
            i_14_ = i_14_ | (translationType == 3 ? 7 : 2);
        }
        if (this.resizeY * -64059883 != 128) {
            i_14_ |= 0x2;
        }
        if (128 != this.resizeX * -1869386025 || 0 != this.rotation * -614140193) {
            i_14_ |= 0x5;
        }
        ModelToolkit modelToolkit;
        synchronized (this.loader.model_cache) {
            modelToolkit = ((ModelToolkit) (this.loader.model_cache.get((long) ((this.anInt5202 = (1757755963 * ((-559444237 * this.anInt5202) | (graphicsToolkit.id * 580915349 << 29)))) * -559444237))));
        }
        if (modelToolkit == null || graphicsToolkit.method5017(modelToolkit.m(), i_14_) != 0) {
            if (modelToolkit != null) {
                i_14_ = graphicsToolkit.method5004(i_14_, modelToolkit.m());
            }
            int i_15_ = i_14_;
            if (this.aShortArray5206 != null) {
                i_15_ |= 0x4000;
            }
            if (this.aShortArray5208 != null) {
                i_15_ |= 0x8000;
            }
            BaseModel model = BaseModel.load((this.loader.JS5_MODEL), (this.anInt5204 * -283549117), 0);
            if (model == null) {
                return null;
            }
            if (model.format < 13) {
                model.scaleUp(2);
            }
            modelToolkit = (graphicsToolkit.creatModelToolkit(model, i_15_, -258957271 * this.loader.anInt4163, 64 + -2043193071 * this.anInt5213, 850 + 1459867577 * this.anInt5214));
            if (null != this.aShortArray5206) {
                for (int i_16_ = 0; i_16_ < this.aShortArray5206.length; i_16_++)
                    modelToolkit.X(this.aShortArray5206[i_16_], this.aShortArray5207[i_16_]);
            }
            if (this.aShortArray5208 != null) {
                for (int i_17_ = 0; i_17_ < this.aShortArray5208.length; i_17_++)
                    modelToolkit.W(this.aShortArray5208[i_17_], this.aShortArray5209[i_17_]);
            }
            modelToolkit.KA(i_14_);
            synchronized (this.loader.model_cache) {
                this.loader.model_cache.put(modelToolkit, (long) ((this.anInt5202 = ((this.anInt5202 * -559444237 | 580915349 * graphicsToolkit.id << 29) * 1757755963)) * -559444237));
            }
        }
        ModelToolkit class387_18_ = modelToolkit.method4755(i_12_, i_14_, true);
        if (animator != null) {
            animator.animate(class387_18_, 0);
        }
        if (-1869386025 * this.resizeX != 128 || this.resizeY * -64059883 != 128) {
            class387_18_.oa(-1869386025 * this.resizeX, this.resizeY * -64059883, -1869386025 * this.resizeX);
        }
        if (-614140193 * this.rotation != 0) {
            if (this.rotation * -614140193 == 90) {
                class387_18_.f(4096);
            }
            if (-614140193 * this.rotation == 180) {
                class387_18_.f(8192);
            }
            if (270 == -614140193 * this.rotation) {
                class387_18_.f(12288);
            }
        }
        if (hasFixedTranslation) {
            class387_18_.pa(translationType, 167177949 * this.translationBounds, class_xa, class_xa_8_, i_9_, i_10_, i_11_);
        }
        class387_18_.KA(i);
        return class387_18_;
    }

    public final boolean method4919() {
        if (this.anInt5204 * -283549117 == -1) {
            return true;
        }
        return (this.loader.JS5_MODEL.fileExists(-283549117 * this.anInt5204, 0));
    }
}
