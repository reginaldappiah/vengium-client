package com.jagex;

import com.jagex.maths.Matrix43f;

import java.util.Arrays;

/* NPCDefinition - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class NPCDefinition {
    public static int anInt6172 = 2;
    public static int anInt6177 = 1;
    public static short[] aShortArray6182 = new short[256];
    public boolean hasRenderPriority;
    public int typeID;
    public String name = "null";
    public int anInt6128;
    public int[] modelIDs;
    public int[] models_2;
    public int[] anIntArray6131;
    public int renderEmote;
    public short[] recolorToReplace;
    public int anInt6140;
    public String[] rightClickOptions;
    public int anInt6143;
    public int anInt6144;
    public int anInt6145;
    public int anInt6146;
    public int attackCursor;
    public boolean visibleOnMap;
    public int combatLevel;
    public int anInt6151;
    public byte aByte6152;
    public short aShort6153;
    public short[] retextureToReplace;
    public boolean aBoolean6155;
    public byte aByte6158;
    public int anInt6161;
    public boolean isClickable;
    public boolean aBoolean6164;
    public boolean aBoolean6165;
    public int anInt6167;
    public byte aByte6168;
    public int anInt6169;
    public byte walkMask;
    public boolean aBoolean6173;
    public int anInt6174;
    public int anInt6175;
    public int anInt6176;
    public int anInt6178;
    public int anInt6179;
    public boolean aBoolean6180;
    public int anInt6181;
    public Class274 aClass274_6183;
    public int anInt6184;
    public int headIcons;
    public int anInt6186;
    public int tileSpacesOccupied = -1690840619;
    public int[] morphisms;
    public int anInt6189;
    public int anInt6190;
    public short aShort6191;
    public int anInt6192;
    public boolean aBoolean6193;
    NPCDefinitionLoader loader;
    short[] recolorToFind;
    byte[] aByteArray6135;
    short[] retextureToFind;
    int ambient;
    byte aByte6138;
    byte aByte6139;
    byte aByte6141;
    int resizeX;
    int contrast;
    byte aByte6157;
    LinkedList aClass437_6159;
    int resizeY;
    int anInt6162;
    int[][] anIntArrayArray6166;
    int anInt6171;
    private byte[] aByteArray12930;
    private byte[] aByteArray1293;
    private int[] anIntArray2930;

    NPCDefinition() {
        renderEmote = 799129853;
        this.aByte6141 = (byte) 0;
        anInt6128 = -1197123063;
        anInt6144 = -1226765471;
        anInt6145 = 625322989;
        anInt6146 = -1361323597;
        attackCursor = -1737724111;
        visibleOnMap = true;
        combatLevel = -954057527;
        this.resizeX = 1732902784;
        this.resizeY = 910525824;
        hasRenderPriority = false;
        aBoolean6155 = false;
        aBoolean6173 = false;
        this.ambient = 0;
        this.contrast = 0;
        headIcons = -945207309;
        anInt6178 = 537547649;
        anInt6181 = -68186784;
        this.anInt6171 = 70774261;
        this.anInt6162 = 1169422749;
        isClickable = true;
        aBoolean6164 = true;
        aBoolean6165 = true;
        aShort6191 = (short) 0;
        aShort6153 = (short) 0;
        aByte6168 = (byte) -96;
        aByte6152 = (byte) -16;
        walkMask = (byte) 0;
        anInt6151 = 273231167;
        anInt6174 = 1377267175;
        anInt6169 = 1213502441;
        anInt6176 = 363354277;
        anInt6140 = 0;
        anInt6175 = 0;
        anInt6179 = -1876875963;
        anInt6167 = -1506883587;
        anInt6143 = -1816293685;
        anInt6184 = -198329521;
        aClass274_6183 = Class274.aClass274_6530;
        anInt6186 = -1432059025;
        aByte6158 = (byte) -1;
        anInt6189 = 133354337;
        anInt6190 = -986694912;
        anInt6161 = 1143914752;
        anInt6192 = 0;
        aBoolean6193 = true;
    }

    public static Class128 method6247(Buffer buffer) {
        Class128 class128 = Graphics.method608(buffer);
        int i_80_ = buffer.readInt();
        int i_81_ = buffer.readInt();
        return new Class128_Sub2(class128.aClass139_6322, class128.aClass133_6323, class128.anInt6327 * -39975161, 1886882435 * class128.anInt6325, class128.anInt6326 * -944287579, -1387457793 * class128.anInt6330, -684094775 * class128.anInt6328, 955568089 * class128.anInt6329, class128.anInt6324 * 782326281, i_80_, i_81_);
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

    public final ModelToolkit method6236(GraphicsToolkit toolkit, int i, Class349 class349, Interface23 interface23, Animator animator, Animator animator_1_, Animator[] animators, int[] is, int i_2_, Class498 class498, int i_3_, boolean bool) {
        if (null != morphisms) {
            NPCDefinition npcDefinition = morph(interface23);
            if (null == npcDefinition)
                return null;
            return npcDefinition.method6236(toolkit, i, class349, interface23, animator, animator_1_, animators, is, i_2_, class498, i_3_, bool);
        }
        int i_6_ = i;
        if (-1282053981 * this.resizeY != 128)
            i_6_ |= 0x2;
        if (128 != -2086573057 * this.resizeX)
            i_6_ |= 0x5;
        boolean bool_7_ = false;
        int i_8_ = null != animators ? animators.length : 0;
        for (int i_9_ = 0; i_9_ < i_8_; i_9_++) {
            if (animators[i_9_] != null) {
                i_6_ |= animators[i_9_].getAnimationFlag();
                bool_7_ = true;
            }
        }
        if (null != animator) {
            i_6_ |= animator.getAnimationFlag();
            bool_7_ = true;
        }
        if (null != animator_1_) {
            i_6_ |= animator_1_.getAnimationFlag();
            bool_7_ = true;
        }
        long l = (long) (typeID * -407713023 | 580915349 * toolkit.id << 16);
        if (null != class498)
            l |= class498.aLong6110 * -8495627389615588201L << 24;
        ModelToolkit class387;
        synchronized (this.loader.softCache) {
            class387 = (ModelToolkit) this.loader.softCache.get(l);
        }
        Class350 class350 = null;
        if (!bool && i_3_ != -1)
            class350 = class349.method4202(i_3_, (byte) 59);
        else if (-1 != 525312939 * renderEmote)
            class350 = class349.method4202(renderEmote * 525312939, (byte) 89);
        if (class387 == null || (class387.m() & i_6_) != i_6_) {
            if (null != class387)
                i_6_ |= class387.m();
            int i_10_ = i_6_;
            if (this.recolorToFind != null)
                i_10_ |= 0x4000;
            if (this.retextureToFind != null)
                i_10_ |= 0x8000;
            if (this.aByte6141 != 0)
                i_10_ |= 0x80000;
            int[] is_11_ = (null != class498 && class498.anIntArray6108 != null ? class498.anIntArray6108 : modelIDs);
            boolean bool_12_ = false;
            synchronized (this.loader.JS5_MODELS) {
                for (int i_13_ = 0; i_13_ < is_11_.length; i_13_++) {
                    if (is_11_[i_13_] == -1) {

                    } else if (!this.loader.JS5_MODELS.fileExists(is_11_[i_13_], 0))
                        bool_12_ = true;
                }
            }
            if (bool_12_)
                return null;
            BaseModel[] baseModels = new BaseModel[is_11_.length];
            for (int i_14_ = 0; i_14_ < is_11_.length; i_14_++) {
                if (is_11_[i_14_] != -1) {
                    synchronized (this.loader.JS5_MODELS) {
                        baseModels[i_14_] = BaseModel.load((this.loader.JS5_MODELS), is_11_[i_14_], 0);
                    }
                    if (baseModels[i_14_] != null) {
                        if (baseModels[i_14_].format < 13)
                            baseModels[i_14_].scaleUp(2);
                        if (this.anIntArrayArray6166 != null && (this.anIntArrayArray6166[i_14_]) != null)
                            baseModels[i_14_].translate((this.anIntArrayArray6166[i_14_][0]), (this.anIntArrayArray6166[i_14_][1]), (this.anIntArrayArray6166[i_14_][2]));
                    }
                }
            }
            if (null != class350 && null != class350.anIntArrayArray3710) {
                for (int i_15_ = 0; i_15_ < class350.anIntArrayArray3710.length; i_15_++) {
                    if (i_15_ < baseModels.length) {
                        if (null == baseModels[i_15_]) {

                        } else {
                            int i_16_ = 0;
                            int i_17_ = 0;
                            int i_18_ = 0;
                            int i_19_ = 0;
                            int i_20_ = 0;
                            int i_21_ = 0;
                            if (null != class350.anIntArrayArray3710[i_15_]) {
                                i_16_ = (class350.anIntArrayArray3710[i_15_][0]);
                                i_17_ = (class350.anIntArrayArray3710[i_15_][1]);
                                i_18_ = (class350.anIntArrayArray3710[i_15_][2]);
                                i_19_ = (class350.anIntArrayArray3710[i_15_][3]) << 3;
                                i_20_ = (class350.anIntArrayArray3710[i_15_][4]) << 3;
                                i_21_ = (class350.anIntArrayArray3710[i_15_][5]) << 3;
                            }
                            if (0 != i_19_ || 0 != i_20_ || 0 != i_21_)
                                baseModels[i_15_].method754(i_19_, i_20_, i_21_);
                            if (0 != i_16_ || i_17_ != 0 || i_18_ != 0)
                                baseModels[i_15_].translate(i_16_, i_17_, i_18_);
                        }
                    }
                }
            }
            BaseModel baseModel;
            if (1 == baseModels.length)
                baseModel = baseModels[0];
            else
                baseModel = new BaseModel(baseModels, baseModels.length);
            class387 = (toolkit.creatModelToolkit(baseModel, i_10_, 299909243 * this.loader.anInt6210, -335572127 * this.ambient + 64, 850 + -1208973327 * this.contrast));
            if (null != this.recolorToFind) {
                short[] is_22_;
                if (class498 != null && null != class498.aShortArray6109)
                    is_22_ = class498.aShortArray6109;
                else
                    is_22_ = recolorToReplace;
                for (int i_23_ = 0; i_23_ < this.recolorToFind.length; i_23_++) {
                    if (null != this.aByteArray6135 && i_23_ < this.aByteArray6135.length)
                        class387.X((this.recolorToFind[i_23_]), aShortArray6182[(this.aByteArray6135[i_23_]) & 0xff]);
                    else
                        class387.X((this.recolorToFind[i_23_]), is_22_[i_23_]);
                }
            }
            if (null != this.retextureToFind) {
                short[] is_24_;
                if (class498 != null && null != class498.aShortArray6107)
                    is_24_ = class498.aShortArray6107;
                else
                    is_24_ = retextureToReplace;
                for (int i_25_ = 0; i_25_ < this.retextureToFind.length; i_25_++)
                    class387.W(this.retextureToFind[i_25_], is_24_[i_25_]);
            }
            if (0 != this.aByte6141)
                class387.PA(this.aByte6138, this.aByte6139, this.aByte6157, this.aByte6141 & 0xff);
            class387.KA(i_6_);
            synchronized (this.loader.softCache) {
                this.loader.softCache.put(class387, l);
            }
        }
        ModelToolkit class387_26_ = class387.method4755((byte) 4, i_6_, true);
        boolean bool_27_ = false;
        if (is != null) {
            for (int i_28_ = 0; i_28_ < 12; i_28_++) {
                if (-1 != is[i_28_])
                    bool_27_ = true;
            }
        }
        if (!bool_7_ && !bool_27_)
            return class387_26_;
        Matrix43f[] class222s = null;
        if (null != class350)
            class222s = class350.method4207((byte) 22);
        if (bool_27_ && null != class222s) {
            for (int i_29_ = 0; i_29_ < 12; i_29_++) {
                if (class222s[i_29_] != null)
                    class387_26_.method4741(class222s[i_29_], 1 << i_29_, true);
            }
        }
        int i_30_ = 0;
        int i_31_ = 1;
        while (i_30_ < i_8_) {
            if (animators[i_30_] != null)
                animators[i_30_].method5830(class387_26_, 0, i_31_);
            i_30_++;
            i_31_ <<= 1;
        }
        if (bool_27_) {
            for (i_30_ = 0; i_30_ < 12; i_30_++) {
                if (-1 != is[i_30_]) {
                    i_31_ = is[i_30_] - i_2_;
                    i_31_ &= 0x3fff;
                    Matrix43f class222 = new Matrix43f();
                    class222.method2473(0.0F, 1.0F, 0.0F, CircleAngleTable.toDegrees(i_31_));
                    class387_26_.method4741(class222, 1 << i_30_, false);
                }
            }
        }
        if (bool_27_ && class222s != null) {
            for (i_30_ = 0; i_30_ < 12; i_30_++) {
                if (class222s[i_30_] != null)
                    class387_26_.method4741(class222s[i_30_], 1 << i_30_, false);
            }
        }
        if (null != animator && animator_1_ != null)
            StaticMethods.method4929(class387_26_, animator, animator_1_);
        else if (animator != null)
            animator.animate(class387_26_, 0);
        else if (null != animator_1_)
            animator_1_.animate(class387_26_, 0);
        if (-2086573057 * this.resizeX != 128 || 128 != -1282053981 * this.resizeY)
            class387_26_.oa(this.resizeX * -2086573057, this.resizeY * -1282053981, this.resizeX * -2086573057);
        class387_26_.KA(i);
        return class387_26_;
    }

    public final ModelToolkit method6237(GraphicsToolkit graphicsToolkit, int animationFlag, Interface23 interface23, Animator animator, Class498 class498) {
        try {
            if (morphisms != null) {
                NPCDefinition npcDefinition = morph(interface23);
                if (null == npcDefinition)
                    return null;
                return npcDefinition.method6237(graphicsToolkit, animationFlag, interface23, animator, class498);
            }
            if (models_2 == null && (null == class498 || null == class498.anIntArray6108))
                return null;
            int flag = animationFlag;
            if (animator != null)
                flag |= animator.getAnimationFlag();
            long l = (long) (typeID * -407713023 | 580915349 * graphicsToolkit.id << 16);
            if (null != class498)
                l |= -8495627389615588201L * class498.aLong6110 << 24;
            ModelToolkit modelToolkit;
            synchronized (this.loader.aClass348_6211) {
                modelToolkit = (ModelToolkit) this.loader.aClass348_6211.get(l);
            }
            if (null == modelToolkit || (modelToolkit.m() & flag) != flag) {
                if (null != modelToolkit)
                    flag |= modelToolkit.m();
                int mask = flag;
                if (null != this.recolorToFind)
                    mask |= 0x4000;
                if (null != this.retextureToFind)
                    mask |= 0x8000;
                if (this.aByte6141 != 0)
                    mask |= 0x80000;
                int[] is = (class498 != null && null != class498.anIntArray6108 ? class498.anIntArray6108 : models_2);
                boolean bool = false;
                synchronized (this.loader.JS5_MODELS) {
                    for (int i_36_ = 0; i_36_ < is.length; i_36_++) {
                        if (!this.loader.JS5_MODELS.fileExists(is[i_36_], 0))
                            bool = true;
                    }
                }
                if (bool)
                    return null;
                BaseModel[] class64s = new BaseModel[is.length];
                synchronized (this.loader.JS5_MODELS) {
                    for (int i_37_ = 0; i_37_ < is.length; i_37_++)
                        class64s[i_37_] = BaseModel.load((this.loader.JS5_MODELS), is[i_37_], 0);
                }
                for (int i_38_ = 0; i_38_ < is.length; i_38_++) {
                    if (null != class64s[i_38_] && class64s[i_38_].format < 13)
                        class64s[i_38_].scaleUp(2);
                }
                BaseModel model;
                if (class64s.length == 1)
                    model = class64s[0];
                else
                    model = new BaseModel(class64s, class64s.length);
                modelToolkit = graphicsToolkit.creatModelToolkit(model, mask, (this.loader.anInt6210) * 299909243, 64, 768);
                if (this.recolorToFind != null) {
                    short[] is_39_;
                    if (null != class498 && class498.aShortArray6109 != null)
                        is_39_ = class498.aShortArray6109;
                    else
                        is_39_ = recolorToReplace;
                    for (int i_40_ = 0; i_40_ < this.recolorToFind.length; i_40_++) {
                        if (null != this.aByteArray6135 && i_40_ < this.aByteArray6135.length)
                            modelToolkit.X((this.recolorToFind[i_40_]), aShortArray6182[(this.aByteArray6135[i_40_]) & 0xff]);
                        else
                            modelToolkit.X((this.recolorToFind[i_40_]), is_39_[i_40_]);
                    }
                }
                if (this.retextureToFind != null) {
                    short[] is_41_;
                    if (class498 != null && class498.aShortArray6107 != null)
                        is_41_ = class498.aShortArray6107;
                    else
                        is_41_ = retextureToReplace;
                    for (int i_42_ = 0; i_42_ < this.retextureToFind.length; i_42_++)
                        modelToolkit.W(this.retextureToFind[i_42_], is_41_[i_42_]);
                }
                if (this.aByte6141 != 0)
                    modelToolkit.PA(this.aByte6138, this.aByte6139, this.aByte6157, this.aByte6141 & 0xff);
                modelToolkit.KA(flag);
                synchronized (this.loader.aClass348_6211) {
                    this.loader.aClass348_6211.put(modelToolkit, l);
                }
            }
            if (animator != null) {
                modelToolkit = modelToolkit.method4755((byte) 1, flag, true);
                animator.animate(modelToolkit, 0);
            }
            modelToolkit.KA(animationFlag);
            return modelToolkit;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("uu.k(").append(')').toString());
        }
    }

    public final boolean method6238(int i) {
        try {
            if (modelIDs == null)
                return true;
            boolean bool = true;
            int[] is = modelIDs;
            for (int i_43_ = 0; i_43_ < is.length; i_43_++) {
                int i_44_ = is[i_43_];
                if (!this.loader.JS5_MODELS.fileExists(i_44_, 0))
                    bool = false;
            }
            return bool;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("uu.d(").append(')').toString());
        }
    }

    public int method6239(int i, int i_45_, byte i_46_) {
        try {
            if (this.aClass437_6159 == null)
                return i_45_;
            IntNode class298_sub35 = ((IntNode) this.aClass437_6159.get((long) i));
            if (class298_sub35 == null)
                return i_45_;
            return class298_sub35.capacity * -774922497;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("uu.u(").append(')').toString());
        }
    }

    public final NPCDefinition morph(Interface23 interface23) {
        int i_47_ = -1;
        if (this.anInt6171 * 677538211 != -1)
            i_47_ = interface23.method250((677538211 * this.anInt6171));
        else if (this.anInt6162 * -1248679093 != -1)
            i_47_ = interface23.method252((this.anInt6162 * -1248679093));
        if (i_47_ < 0 || i_47_ >= morphisms.length - 1 || -1 == morphisms[i_47_]) {
            int i_48_ = morphisms[morphisms.length - 1];
            if (i_48_ != -1)
                return this.loader.load(i_48_);
            return null;
        }
        return this.loader.load(morphisms[i_47_]);
    }

    public boolean method6241(Interface23 interface23, int i) {
        try {
            if (null == morphisms)
                return true;
            int i_49_ = -1;
            if (-1 != this.anInt6171 * 677538211)
                i_49_ = interface23.method250((677538211 * this.anInt6171));
            else if (-1248679093 * this.anInt6162 != -1)
                i_49_ = interface23.method252((-1248679093 * this.anInt6162));
            if (i_49_ < 0 || i_49_ >= morphisms.length - 1 || morphisms[i_49_] == -1) {
                int i_50_ = morphisms[morphisms.length - 1];
                return -1 != i_50_;
            }
            return true;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("uu.q(").append(')').toString());
        }
    }

    public boolean method6242() {
        try {
            if (morphisms == null)
                return (-1 != anInt6151 * 1945943361 || -1 != 1105496999 * anInt6169 || -1390399277 * anInt6176 != -1);
            for (int i_51_ = 0; i_51_ < morphisms.length; i_51_++) {
                if (-1 != morphisms[i_51_]) {
                    NPCDefinition class503_52_ = this.loader.load(morphisms[i_51_]);
                    if (1945943361 * class503_52_.anInt6151 != -1 || -1 != class503_52_.anInt6169 * 1105496999 || class503_52_.anInt6176 * -1390399277 != -1)
                        return true;
                }
            }
            return false;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("uu.n(").append(')').toString());
        }
    }

    void method6243() {
        try {
            if (null == modelIDs)
                modelIDs = new int[0];
            if (aByte6158 == -1) {
                if ((this.loader.context) == GameContext.VENGIUM)
                    aByte6158 = (byte) 1;
                else
                    aByte6158 = (byte) 0;
            }
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("uu.b(").append(')').toString());
        }
    }

    void decode(Buffer buffer, int opcode) {
        try {
            if (opcode == 1) {
                int modelIDsLength = buffer.readUByte();
                this.modelIDs = new int[modelIDsLength];
                for (int modelIDsIndex = 0; modelIDsIndex < modelIDsLength; modelIDsIndex++)
                    this.modelIDs[modelIDsIndex] = buffer.readBigSmart();
            } else if (opcode == 2)
                name = buffer.readString();
            else if (12 == opcode)
                tileSpacesOccupied = buffer.readUByte() * -1690840619;
            else if (opcode >= 30 && opcode < 35)
                rightClickOptions[opcode - 30] = buffer.readString();
            else if (opcode == 40) {
                int length = buffer.readUByte();
                this.recolorToFind = new short[length];
                recolorToReplace = new short[length];
                for (int index = 0; index < length; index++) {
                    this.recolorToFind[index] = (short) buffer.readUShort();
                    recolorToReplace[index] = (short) buffer.readUShort();
                }
            } else if (opcode == 41) {
                int length = buffer.readUByte();
                this.retextureToFind = new short[length];
                retextureToReplace = new short[length];
                for (int index = 0; index < length; index++) {
                    this.retextureToFind[index] = (short) buffer.readUShort();
                    retextureToReplace[index] = (short) buffer.readUShort();
                }
            } else if (opcode == 42) {
                int i_60_ = buffer.readUByte();
                this.aByteArray6135 = new byte[i_60_];
                for (int i_61_ = 0; i_61_ < i_60_; i_61_++)
                    this.aByteArray6135[i_61_] = buffer.readByte();
            } else if (opcode == 44) {
                int i_24_ = (short) buffer.readUShort();
                int i_25_ = 0;
                for (int i_26_ = i_24_; i_26_ > 0; i_26_ >>= 1)
                    i_25_++;
                aByteArray12930 = new byte[i_25_];
                byte i_27_ = 0;
                for (int i_28_ = 0; i_28_ < i_25_; i_28_++) {
                    if ((i_24_ & 1 << i_28_) > 0) {
                        aByteArray12930[i_28_] = i_27_;
                        i_27_++;
                    } else
                        aByteArray12930[i_28_] = (byte) -1;
                }
            } else if (45 == opcode) {
                int i_29_ = (short) buffer.readUShort();
                int i_30_ = 0;
                for (int i_31_ = i_29_; i_31_ > 0; i_31_ >>= 1)
                    i_30_++;
                aByteArray1293 = new byte[i_30_];
                byte i_32_ = 0;
                for (int i_33_ = 0; i_33_ < i_30_; i_33_++) {
                    if ((i_29_ & 1 << i_33_) > 0) {
                        aByteArray1293[i_33_] = i_32_;
                        i_32_++;
                    } else
                        aByteArray1293[i_33_] = (byte) -1;
                }
            } else if (opcode == 60) {
                int length = buffer.readUByte();
                models_2 = new int[length];
                for (int index = 0; index < length; index++)
                    models_2[index] = buffer.readBigSmart();
            } else if (opcode == 93)
                visibleOnMap = false;
            else if (opcode == 95)
                combatLevel = buffer.readUShort() * 954057527;
            else if (opcode == 97)
                this.resizeX = buffer.readUShort() * -1227975681;
            else if (98 == opcode)
                this.resizeY = buffer.readUShort() * 745310987;
            else if (opcode == 99)
                hasRenderPriority = true;
            else if (opcode == 100)
                this.ambient = buffer.readByte() * 2012631201;
            else if (101 == opcode)
                this.contrast = buffer.readByte() * 1653976405;
            else if (opcode == 102)
                headIcons = buffer.readUShort() * 945207309;
            else if (103 == opcode)
                anInt6181 = buffer.readUShort() * -1075872661;
            else if (opcode == 106 || 118 == opcode) {
                this.anInt6171 = buffer.readUShort() * -70774261;
                if (677538211 * this.anInt6171 == 65535)
                    this.anInt6171 = 70774261;
                this.anInt6162 = buffer.readUShort() * -1169422749;
                if (this.anInt6162 * -1248679093 == 65535)
                    this.anInt6162 = 1169422749;
                int i_64_ = -1;
                if (opcode == 118) {
                    i_64_ = buffer.readUShort();
                    if (i_64_ == 65535)
                        i_64_ = -1;
                }
                int i_65_ = buffer.readUByte();
                morphisms = new int[2 + i_65_];
                for (int i_66_ = 0; i_66_ <= i_65_; i_66_++) {
                    morphisms[i_66_] = buffer.readUShort();
                    if (65535 == morphisms[i_66_])
                        morphisms[i_66_] = -1;
                }
                morphisms[i_65_ + 1] = i_64_;
            } else if (opcode == 107)
                isClickable = false;
            else if (opcode == 109)
                aBoolean6164 = false;
            else if (111 == opcode)
                aBoolean6165 = false;
            else if (opcode == 113) {
                aShort6191 = (short) buffer.readUShort();
                aShort6153 = (short) buffer.readUShort();
            } else if (114 == opcode) {
                aByte6168 = buffer.readByte();
                aByte6152 = buffer.readByte();
            } else if (119 == opcode)
                walkMask = buffer.readByte();
            else if (opcode == 121) {
                this.anIntArrayArray6166 = new int[modelIDs.length][];
                int i_67_ = buffer.readUByte();
                for (int i_68_ = 0; i_68_ < i_67_; i_68_++) {
                    int i_69_ = buffer.readUByte();
                    int[] is = (this.anIntArrayArray6166[i_69_] = new int[3]);
                    is[0] = buffer.readByte();
                    is[1] = buffer.readByte();
                    is[2] = buffer.readByte();
                }
            } else if (opcode == 122)
                anInt6167 = buffer.readBigSmart() * 1506883587;
            else if (opcode == 123)
                anInt6143 = buffer.readUShort() * 1816293685;
            else if (opcode == 125)
                aClass274_6183 = ((Class274) StaticMethods.method5701(Class299.method3680(-1901608125), buffer.readByte()));
            else if (127 == opcode)
                renderEmote = buffer.readUShort() * -799129853;
            else if (128 == opcode)
                StaticMethods.method5701(Class522.method6325((byte) -83), buffer.readUByte());
            else if (opcode == 134) {
                anInt6151 = buffer.readUShort() * -273231167;
                if (65535 == anInt6151 * 1945943361)
                    anInt6151 = 273231167;
                anInt6174 = buffer.readUShort() * -1377267175;
                if (65535 == anInt6174 * -904091095)
                    anInt6174 = 1377267175;
                anInt6169 = buffer.readUShort() * -1213502441;
                if (65535 == 1105496999 * anInt6169)
                    anInt6169 = 1213502441;
                anInt6176 = buffer.readUShort() * -363354277;
                if (anInt6176 * -1390399277 == 65535)
                    anInt6176 = 363354277;
                anInt6140 = buffer.readUByte() * 203494719;
            } else if (opcode == 135 || 136 == opcode) {
                anInt6145 = buffer.readUByte() * -625322989;
                anInt6128 = buffer.readUShort() * 1197123063;
            } else if (opcode == 137)
                attackCursor = buffer.readUShort() * 1737724111;
            else if (opcode == 138)
                anInt6178 = buffer.readBigSmart() * -537547649;
            else if (opcode == 140)
                anInt6179 = buffer.readUByte() * -462121541;
            else if (opcode == 141)
                aBoolean6173 = true;
            else if (opcode == 142)
                anInt6186 = buffer.readUShort() * 1432059025;
            else if (143 == opcode)
                aBoolean6155 = true;
            else if (opcode >= 150 && opcode < 155) {
                rightClickOptions[opcode - 150] = buffer.readString();
                if (!this.loader.isMember)
                    rightClickOptions[opcode - 150] = null;
            } else if (opcode == 155) {
                this.aByte6138 = buffer.readByte();
                this.aByte6139 = buffer.readByte();
                this.aByte6157 = buffer.readByte();
                this.aByte6141 = buffer.readByte();
            } else if (158 == opcode)
                aByte6158 = (byte) 1;
            else if (opcode == 159)
                aByte6158 = (byte) 0;
            else if (opcode == 160) {
                int i_70_ = buffer.readUByte();
                anIntArray6131 = new int[i_70_];
                for (int i_71_ = 0; i_71_ < i_70_; i_71_++)
                    anIntArray6131[i_71_] = buffer.readUShort();
            } else if (opcode == 162)
                aBoolean6180 = true;
            else if (opcode == 163)
                anInt6189 = buffer.readUByte() * -133354337;
            else if (164 == opcode) {
                anInt6190 = buffer.readUShort() * -138072005;
                anInt6161 = buffer.readUShort() * 1615081153;
            } else if (165 == opcode)
                anInt6192 = buffer.readUByte() * -1027847229;
            else if (168 == opcode)
                anInt6175 = buffer.readUByte() * -2143657709;
            else if (opcode == 169)
                aBoolean6193 = false;
            else if (opcode >= 170 && opcode < 176) {
                if (null == anIntArray2930) {
                    anIntArray2930 = new int[6];
                    Arrays.fill(anIntArray2930, -1);
                }
                int i_44_ = (short) buffer.readUShort();
                if (i_44_ == 65535)
                    i_44_ = -1;
                anIntArray2930[opcode - 170] = i_44_;
            } else if (249 == opcode) {
                int i_72_ = buffer.readUByte();
                if (this.aClass437_6159 == null) {
                    int i_73_ = LinkedList.getNextBitValue(i_72_);
                    this.aClass437_6159 = new LinkedList(i_73_);
                }
                for (int i_74_ = 0; i_74_ < i_72_; i_74_++) {
                    boolean bool = buffer.readUByte() == 1;
                    int i_75_ = buffer.readUTriByte();
                    Node class298;
                    if (bool)
                        class298 = new ObjectNode(buffer.readString());
                    else
                        class298 = new IntNode(buffer.readInt());
                    this.aClass437_6159.connect(class298, (long) i_75_);
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("uu.f(").append(')').toString());
        }
    }

    public String method6245(int i, String string) {
        if (null == this.aClass437_6159)
            return string;
        ObjectNode class298_sub29 = ((ObjectNode) this.aClass437_6159.get((long) i));
        if (null == class298_sub29)
            return string;
        return (String) class298_sub29.nodeObject;
    }

    public final ModelToolkit method6246(GraphicsToolkit toolkit, int i, Class349 class349, Interface23 interface23, Animator animator, Animator animator_77_, Animator[] animators, int[] is, int i_78_, Class498 class498) {
        return method6236(toolkit, i, class349, interface23, animator, animator_77_, animators, is, i_78_, class498, renderEmote * 525312939, true);
    }
}
