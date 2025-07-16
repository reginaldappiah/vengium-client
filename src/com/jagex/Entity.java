package com.jagex;/* Class365_Sub1_Sub1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.game.cache.config.Js5Configs;
import com.jagex.game.cache.config.prefetch.Js5List;
import com.jagex.game.cache.definition.animation.AnimationDefinition;
import com.jagex.maths.Matrix43f;

public abstract class Entity extends Class365_Sub1_Sub1 {
    public int anInt10063;
    public int entityIndex;
    public int anInt10066;
    public int anInt10068;
    public int anInt10069;
    public int anInt10070;
    public int anInt10071;
    public int anInt10075;
    public Graphics[] currentGraphics;
    public Animator aAnimator_10077;
    public Animator animator;
    public int[] anIntArray10079;
    public int[] anIntArray10080;
    public int[] anIntArray10081;
    public ModelToolkit[] modelToolkits;
    public int[] anIntArray10083;
    public Class386 aClass386_10084;
    public int[] anIntArray10085;
    public int anInt10086;
    public int anInt10087;
    public int anInt10088;
    public int setNextFaceEntity;
    public int[] scenePositionYQueue;
    public int[] anIntArray10092;
    public int[] anIntArray10093;
    public boolean aBoolean10094;
    public int anInt10095;
    public int anInt10096;
    public int anInt10098;
    public int anInt10099;
    public int anInt10100;
    public int anInt10101;
    public int[] anIntArray10102;
    public int anInt10103;
    public int anInt10104;
    public int anInt10105;
    public int anInt10106;
    public byte aByte10108;
    public byte aByte10109;
    public byte[] aByteArray10110;
    public Class386 aClass386_10111;
    public Animator_Sub2_Sub1[] aClass438_Sub2_Sub1Array10112;
    public Class386 aClass386_10113;
    public int anInt10114;
    public int anInt10115;
    public int anInt10116;
    public byte aByte10117;
    public boolean aBoolean10119;
    public int anInt10120;
    public int[] scenePositionXQueue;
    public boolean aBoolean10123 = true;
    public int anInt10124;
    public int anInt10125;
    public int anInt10126;
    public int[] anIntArray10127;
    public byte aByte10130;
    public IComponentDefinitionCollection IComponentDefinitionCollection;
    public int interfaceID;
    int anInt10065 = -1934893373;
    ParticleSystem aParticleSystem_10067;
    int anInt10073;
    int anInt10074;
    int anInt10089 = -1532329984;
    int anInt10097;
    int anInt10107;
    Class62 aClass62_10118;
    int anInt10122;
    boolean aBoolean10128;
    boolean aBoolean10129;
    byte aByte10133;

    Entity(Region class331, int i) {
        super(class331, 0, 0, 0, 0, 0, 0, 0, 0, 0, false, (byte) 0);
        anInt10069 = 0;
        anInt10070 = -2135118589;
        anInt10071 = 0;
        this.anInt10122 = 0;
        this.aByte10133 = (byte) 0;
        anIntArray10102 = new int[-942466371 * Js5List.JS5_DEFAULTS.maxHitsplats];
        anIntArray10079 = new int[-942466371 * Js5List.JS5_DEFAULTS.maxHitsplats];
        anIntArray10080 = new int[-942466371 * Js5List.JS5_DEFAULTS.maxHitsplats];
        anIntArray10081 = new int[Js5List.JS5_DEFAULTS.maxHitsplats * -942466371];
        anIntArray10127 = new int[Js5List.JS5_DEFAULTS.maxHitsplats * -942466371];
        anIntArray10083 = new int[Js5List.JS5_DEFAULTS.maxHitsplats * -942466371];
        anInt10116 = 1208121000;
        anInt10086 = 875976968;
        aBoolean10119 = false;
        setNextFaceEntity = -283914955;
        anIntArray10093 = null;
        aBoolean10094 = false;
        aAnimator_10077 = new Animator_Sub2(this, false);
        animator = new Animator_Sub2(this, false);
        anInt10105 = -1828453179;
        anInt10106 = 473408095;
        aByte10130 = (byte) 0;
        anInt10075 = 0;
        anInt10114 = 0;
        anInt10115 = 1168822528;
        aClass386_10084 = new Class386();
        aClass386_10113 = new Class386();
        aClass386_10111 = new Class386();
        anInt10120 = 0;
        anInt10124 = 0;
        anInt10125 = 0;
        anInt10126 = 0;
        this.aBoolean10128 = false;
        this.aBoolean10129 = false;
        this.interfaceID = -441346831;
        this.anInt10107 = -543663539;
        scenePositionXQueue = new int[i];
        scenePositionYQueue = new int[i];
        aByteArray10110 = new byte[i];
        modelToolkits = new ModelToolkit[5];
        currentGraphics = new Graphics[4];
        for (int i_125_ = 0; i_125_ < 4; i_125_++)
            currentGraphics[i_125_] = new Graphics(this);
        aClass438_Sub2_Sub1Array10112 = (new Animator_Sub2_Sub1[EquipmentDefaults.defaults.hidden.length]);
    }

    Entity(Region class331) {
        this(class331, 10);
    }

    public void method4413(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_) {
        if (method4439())
            IComponentDefinition.updateHiddenComponents(IComponentDefinitionCollection, IComponentDefinitionCollection.getComponentDefinitions(), -1, i, i_0_, i_1_, i_2_, i_3_, i_4_, i_5_, i_6_);
    }

    boolean method4399() {
        try {
            return false;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("akn.bf(").append(')').toString());
        }
    }

    public void method4414(int i, byte i_8_) {
        try {
            Class350 class350 = method4426();
            if (class350.anInt3744 * -2079528661 != 0 || 907865649 * anInt10115 != 0) {
                aClass386_10084.method4720((byte) 67);
                int i_9_ = i - 259411823 * aClass386_10084.anInt4144 & 0x3fff;
                if (i_9_ > 8192)
                    anInt10068 = (aClass386_10084.anInt4144 * 259411823 - (16384 - i_9_)) * 1874549911;
                else
                    anInt10068 = (aClass386_10084.anInt4144 * 259411823 + i_9_) * 1874549911;
            }
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("akn.a(").append(')').toString());
        }
    }

    public void method4415(int i, boolean bool, int i_10_) {
        try {
            Class350 class350 = method4426();
            if (bool || -2079528661 * class350.anInt3744 != 0 || 907865649 * anInt10115 != 0) {
                anInt10068 = (i & 0x3fff) * 1874549911;
                aClass386_10084.method4718(2145248039 * anInt10068, -1986657311);
            }
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("akn.f(").append(')').toString());
        }
    }

    void method4416() {
        if (-1 != this.interfaceID * 1097409519) {
            IComponentDefinition.deactiveInterface(1097409519 * this.interfaceID);
            IComponentDefinitionCollection = null;
            this.interfaceID = -441346831;
        }
    }

    public boolean method4417(int i, int i_11_, byte i_12_) {
        try {
            if (anIntArray10085 == null) {
                if (-1 == i_11_)
                    return true;
                anIntArray10085 = new int[(EquipmentDefaults.defaults.hidden).length];
                for (int i_13_ = 0; (i_13_ < EquipmentDefaults.defaults.hidden.length); i_13_++)
                    anIntArray10085[i_13_] = -1;
            }
            Class350 class350 = method4426();
            int i_14_ = 256;
            if (class350.anIntArray3742 != null && class350.anIntArray3742[i] > 0)
                i_14_ = class350.anIntArray3742[i];
            if (-1 == i_11_) {
                if (anIntArray10085[i] == -1)
                    return true;
                int i_15_ = aClass386_10084.method4719((byte) 0);
                int i_16_ = anIntArray10085[i];
                int i_17_ = i_15_ - i_16_;
                if (i_17_ >= -i_14_ && i_17_ <= i_14_) {
                    anIntArray10085[i] = -1;
                    for (int i_18_ = 0; i_18_ < (EquipmentDefaults.defaults.hidden).length; i_18_++) {
                        if (anIntArray10085[i_18_] != -1)
                            return true;
                    }
                    anIntArray10085 = null;
                    return true;
                }
                if (i_17_ > 0 && i_17_ <= 8192 || i_17_ <= -8192)
                    anIntArray10085[i] = i_16_ + i_14_ & 0x3fff;
                else
                    anIntArray10085[i] = i_16_ - i_14_ & 0x3fff;
                return false;
            }
            if (-1 == anIntArray10085[i])
                anIntArray10085[i] = aClass386_10084.method4719((byte) 0);
            int i_19_ = anIntArray10085[i];
            int i_20_ = i_11_ - i_19_;
            if (i_20_ >= -i_14_ && i_20_ <= i_14_) {
                anIntArray10085[i] = i_11_;
                return true;
            }
            if (i_20_ > 0 && i_20_ <= 8192 || i_20_ <= -8192)
                anIntArray10085[i] = i_14_ + i_19_ & 0x3fff;
            else
                anIntArray10085[i] = i_19_ - i_14_ & 0x3fff;
            return false;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("akn.i(").append(')').toString());
        }
    }

    public final void sendGraphics(int graphicID, int positioning, int rotation, int i_23_, boolean bool, int graphicIndex, int i_25_) {
        try {
            Graphics currentGraphic = currentGraphics[graphicIndex];
            int currentGraphicID = -967533709 * currentGraphic.graphicID;
            if (graphicID != -1 && currentGraphicID != -1) {
                if (currentGraphicID == graphicID) {
                    SpotType spotType = SpotTypeLoader.loader.get(graphicID);
                    if (spotType.aBoolean5215 && 1505778629 * spotType.animationID != -1) {
                        AnimationDefinition animationDefinitions = (Js5Configs.animsList.get(spotType.animationID * 1505778629));
                        int i_27_ = animationDefinitions.resetType * -1117238071;
                        if (i_27_ == 0)
                            return;
                        if (2 == i_27_) {
                            currentGraphic.animator.method5842();
                            return;
                        }
                    }
                } else {
                    SpotType spotType = SpotTypeLoader.loader.get(graphicID);
                    SpotType class398_28_ = SpotTypeLoader.loader.get(currentGraphicID);
                    if (1505778629 * spotType.animationID != -1 && 1505778629 * class398_28_.animationID != -1) {
                        AnimationDefinition class391 = (Js5Configs.animsList.get(1505778629 * spotType.animationID));
                        AnimationDefinition class391_29_ = (Js5Configs.animsList.get(1505778629 * class398_28_.animationID));
                        if (-1445588039 * class391.priority < class391_29_.priority * -1445588039)
                            return;
                    }
                }
            }
            int i_30_ = 0;
            if (graphicID != -1 && !(SpotTypeLoader.loader.get(graphicID).aBoolean5215))
                i_30_ = 2;
            if (-1 != graphicID && bool)
                i_30_ = 1;
            currentGraphic.graphicID = 1313669563 * graphicID;
            currentGraphic.anInt568 = 1533439965 * i_23_;
            currentGraphic.height = 1755371497 * (positioning >> 16);
            currentGraphic.rotation = rotation * 1949040559;
            currentGraphic.animator.method5824((-1 != graphicID ? ((SpotTypeLoader.loader.get(graphicID).animationID) * 1505778629) : -1), positioning & 0xffff, i_30_, false);
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("akn.d(").append(')').toString());
        }
    }

    public final void method4419(int i) {
        try {
            anInt10120 = 0;
            anInt10125 = 0;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("akn.u(").append(')').toString());
        }
    }

    public final void method4420(int i, int i_31_, int i_32_, int i_33_, int i_34_, int i_35_, int i_36_, byte i_37_) {
        try {
            boolean bool = true;
            boolean bool_38_ = true;
            for (int i_39_ = 0; i_39_ < Js5List.JS5_DEFAULTS.maxHitsplats * -942466371; i_39_++) {
                if (anIntArray10080[i_39_] > i_34_)
                    bool = false;
                else
                    bool_38_ = false;
            }
            int i_40_ = -1;
            int i_41_ = -1;
            int i_42_ = 0;
            if (i >= 0) {
                HitsplatDefinition hitsplatDefinition = HitsplatDefinitionLoader.aClass347_6117.method4176(i);
                i_41_ = hitsplatDefinition.comparisonType * 100473069;
                i_42_ = -169339039 * hitsplatDefinition.duration;
            }
            if (bool_38_) {
                if (i_41_ == -1)
                    return;
                i_40_ = 0;
                int i_43_ = 0;
                if (i_41_ == 0)
                    i_43_ = anIntArray10080[0];
                else if (i_41_ == 1)
                    i_43_ = anIntArray10079[0];
                for (int i_44_ = 1; i_44_ < -942466371 * Js5List.JS5_DEFAULTS.maxHitsplats; i_44_++) {
                    if (i_41_ == 0) {
                        if (anIntArray10080[i_44_] < i_43_) {
                            i_40_ = i_44_;
                            i_43_ = anIntArray10080[i_44_];
                        }
                    } else if (1 == i_41_ && anIntArray10079[i_44_] < i_43_) {
                        i_40_ = i_44_;
                        i_43_ = anIntArray10079[i_44_];
                    }
                }
                if (i_41_ == 1 && i_43_ >= i_31_)
                    return;
            } else {
                if (bool)
                    this.aByte10133 = (byte) 0;
                for (int i_45_ = 0; i_45_ < Js5List.JS5_DEFAULTS.maxHitsplats * -942466371; i_45_++) {
                    int i_46_ = this.aByte10133;
                    this.aByte10133 = (byte) ((this.aByte10133 + 1) % (-942466371 * Js5List.JS5_DEFAULTS.maxHitsplats));
                    if (anIntArray10080[i_46_] <= i_34_) {
                        i_40_ = i_46_;
                        break;
                    }
                }
            }
            if (i_40_ >= 0) {
                anIntArray10102[i_40_] = i;
                anIntArray10079[i_40_] = i_31_;
                anIntArray10127[i_40_] = i_32_;
                anIntArray10083[i_40_] = i_33_;
                anIntArray10080[i_40_] = i_35_ + (i_34_ + i_42_);
                anIntArray10081[i_40_] = i_36_;
            }
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("akn.posX(").append(')').toString());
        }
    }

    public int method4363() {
        try {
            Class350 class350 = method4426();
            int i_47_;
            if (1638157075 * class350.anInt3716 != -1)
                i_47_ = class350.anInt3716 * 1638157075;
            else if (-32768 == (this.anInt10089 * 1507955715))
                i_47_ = 200;
            else
                i_47_ = -(1507955715 * this.anInt10089);
            Class235 class235 = getWorldTransform();
            int i_48_ = (int) class235.trans.x >> 9;
            int i_49_ = (int) class235.trans.z >> 9;
            if (null != aClass331_7722 && i_48_ >= 1 && i_49_ >= 1 && i_48_ <= GameClient.myRegion.getMapWidth() - 1 && i_49_ <= GameClient.myRegion.getMapLength() - 1) {
                Class326 class326 = (aClass331_7722.gameSceneBase[plane][i_48_][i_49_]);
                if (null != class326 && class326.aClass365_Sub1_Sub2_3461 != null)
                    return (i_47_ + class326.aClass365_Sub1_Sub2_3461.aShort9801);
            }
            return i_47_;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("akn.bx(").append(')').toString());
        }
    }

    public void method4421(int i, int i_50_) {
        try {
            this.anInt10065 = -1934893373 * i;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("akn.r(").append(')').toString());
        }
    }

    public int getSize() {
        try {
            return 1173963243 * this.anInt10065;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("akn.q(").append(')').toString());
        }
    }

    public void method4404() {
        try {
            int i_51_ = (this.anInt10065 * 1173963243 - 1 << 8) + 240;
            Vector3f class217 = getWorldTransform().trans;
            aShort9798 = (short) ((int) class217.x - i_51_ >> 9);
            aShort9795 = (short) ((int) class217.z - i_51_ >> 9);
            aShort9796 = (short) ((int) class217.x + i_51_ >> 9);
            aShort9797 = (short) ((int) class217.z + i_51_ >> 9);
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("akn.ew(").append(')').toString());
        }
    }

    void method4423(ModelToolkit class387, int i) {
        try {
            int i_52_ = aClass386_10113.anInt4144 * 259411823;
            int i_53_ = 259411823 * aClass386_10111.anInt4144;
            if (0 != i_52_ || i_53_ != 0) {
                int i_54_ = class387.YA() / 2;
                class387.ia(0, -i_54_, 0);
                class387.EA(i_52_ & 0x3fff);
                class387.t(i_53_ & 0x3fff);
                class387.ia(0, i_54_, 0);
            }
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("akn.n(").append(')').toString());
        }
    }

    void method4424(GraphicsToolkit toolkit, Class350 class350, int i, int i_55_, int i_56_, int i_57_) {
        for (int index = 0; index < currentGraphics.length; index++) {
            byte i_60_ = 0;
            if (0 == index)
                i_60_ = (byte) 2;
            else if (1 == index)
                i_60_ = (byte) 5;
            else if (index == 2)
                i_60_ = (byte) 1;
            else if (3 == index)
                i_60_ = (byte) 7;
            Graphics currentGraphic = currentGraphics[index];
            if (-1 != currentGraphic.graphicID * -967533709 && !currentGraphic.animator.method5826()) {
                SpotType spotType = (SpotTypeLoader.loader.get(currentGraphic.graphicID * -967533709));
                boolean bool = (spotType.translationType == 3 && (i_55_ != 0 || 0 != i_56_));
                int i_61_ = i;
                if (bool)
                    i_61_ |= 0x7;
                else {
                    if (0 != -885344433 * currentGraphic.rotation)
                        i_61_ |= 0x5;
                    if (0 != 1615294553 * currentGraphic.height)
                        i_61_ |= 0x2;
                    if (currentGraphic.anInt568 * -1418960779 >= 0)
                        i_61_ |= 0x7;
                }
                ModelToolkit class387 = (modelToolkits[index + 1] = spotType.method4917(toolkit, i_61_, currentGraphic.animator, i_60_));
                if (null != class387) {
                    if (currentGraphic.anInt568 * -1418960779 >= 0 && null != class350.anIntArrayArray3710 && (class350.anIntArrayArray3710[-1418960779 * currentGraphic.anInt568]) != null) {
                        int i_62_ = 0;
                        int i_63_ = 0;
                        int i_64_ = 0;
                        if (null != class350.anIntArrayArray3710 && (null != (class350.anIntArrayArray3710[currentGraphic.anInt568 * -1418960779]))) {
                            i_62_ += (class350.anIntArrayArray3710[-1418960779 * currentGraphic.anInt568][0]);
                            i_63_ += (class350.anIntArrayArray3710[-1418960779 * currentGraphic.anInt568][1]);
                            i_64_ += (class350.anIntArrayArray3710[currentGraphic.anInt568 * -1418960779][2]);
                        }
                        if (class350.anIntArrayArray3753 != null && (null != (class350.anIntArrayArray3753[currentGraphic.anInt568 * -1418960779]))) {
                            i_62_ += (class350.anIntArrayArray3753[-1418960779 * currentGraphic.anInt568][0]);
                            i_63_ += (class350.anIntArrayArray3753[currentGraphic.anInt568 * -1418960779][1]);
                            i_64_ += (class350.anIntArrayArray3753[currentGraphic.anInt568 * -1418960779][2]);
                        }
                        if (0 != i_64_ || i_62_ != 0) {
                            int i_65_ = i_57_;
                            if (null != anIntArray10085 && anIntArray10085[(currentGraphic.anInt568 * -1418960779)] != -1)
                                i_65_ = (anIntArray10085[-1418960779 * currentGraphic.anInt568]);
                            int i_66_ = ((i_65_ + -709199872 * currentGraphic.rotation - i_57_) & 0x3fff);
                            if (0 != i_66_)
                                class387.f(i_66_);
                            int i_67_ = CircleAngleTable.SINE[i_66_];
                            int i_68_ = CircleAngleTable.COSINE[i_66_];
                            int i_69_ = i_68_ * i_62_ + i_64_ * i_67_ >> 14;
                            i_64_ = i_68_ * i_64_ - i_67_ * i_62_ >> 14;
                            i_62_ = i_69_;
                        }
                        class387.ia(i_62_, i_63_, i_64_);
                    } else if (currentGraphic.rotation * -885344433 != 0)
                        class387.f(-709199872 * currentGraphic.rotation);
                    if (currentGraphic.height * 1615294553 != 0)
                        class387.ia(0, -(1615294553 * currentGraphic.height) << 2, 0);
                    if (bool) {
                        if (0 != -155466425 * this.anInt10097)
                            class387.t((this.anInt10097) * -155466425);
                        if (0 != -197572281 * this.anInt10073)
                            class387.EA((this.anInt10073) * -197572281);
                        if (0 != (this.anInt10074 * -104151209))
                            class387.ia(0, (-104151209 * this.anInt10074), 0);
                    }
                }
            } else
                modelToolkits[1 + index] = null;
        }
    }

    void method4425(int i, int i_70_, int i_71_, int i_72_, int i_73_, int i_74_) {
        try {
            Vector3f class217 = getWorldTransform().trans;
            int i_75_ = aShort9796 + aShort9798 >> 1;
            int i_76_ = aShort9795 + aShort9797 >> 1;
            int i_77_ = CircleAngleTable.SINE[i];
            int i_78_ = CircleAngleTable.COSINE[i];
            int i_79_ = -i_70_ / 2;
            int i_80_ = -i_71_ / 2;
            int i_81_ = i_79_ * i_78_ + i_77_ * i_80_ >> 14;
            int i_82_ = i_78_ * i_80_ - i_77_ * i_79_ >> 14;
            int i_83_ = Class70.method807(i_81_ + (int) class217.x, (int) class217.z + i_82_, i_75_, i_76_, plane, (byte) 13);
            int i_84_ = i_70_ / 2;
            int i_85_ = -i_71_ / 2;
            int i_86_ = i_84_ * i_78_ + i_77_ * i_85_ >> 14;
            int i_87_ = i_85_ * i_78_ - i_84_ * i_77_ >> 14;
            int i_88_ = Class70.method807(i_86_ + (int) class217.x, (int) class217.z + i_87_, i_75_, i_76_, plane, (byte) -9);
            int i_89_ = -i_70_ / 2;
            int i_90_ = i_71_ / 2;
            int i_91_ = i_89_ * i_78_ + i_90_ * i_77_ >> 14;
            int i_92_ = i_78_ * i_90_ - i_77_ * i_89_ >> 14;
            int i_93_ = Class70.method807((int) class217.x + i_91_, i_92_ + (int) class217.z, i_75_, i_76_, plane, (byte) 105);
            int i_94_ = i_70_ / 2;
            int i_95_ = i_71_ / 2;
            int i_96_ = i_78_ * i_94_ + i_77_ * i_95_ >> 14;
            int i_97_ = i_95_ * i_78_ - i_77_ * i_94_ >> 14;
            int i_98_ = Class70.method807(i_96_ + (int) class217.x, i_97_ + (int) class217.z, i_75_, i_76_, plane, (byte) 97);
            int i_99_ = i_83_ < i_88_ ? i_83_ : i_88_;
            int i_100_ = i_93_ < i_98_ ? i_93_ : i_98_;
            int i_101_ = i_88_ < i_98_ ? i_88_ : i_98_;
            int i_102_ = i_83_ < i_93_ ? i_83_ : i_93_;
            this.anInt10097 = ((int) (Math.atan2((double) (i_99_ - i_100_), (double) i_71_) * 2607.5945876176133) & 0x3fff) * 1814320247;
            this.anInt10073 = ((int) (Math.atan2((double) (i_102_ - i_101_), (double) i_70_) * 2607.5945876176133) & 0x3fff) * -1037987721;
            if (0 != this.anInt10097 * -155466425 && i_72_ != 0) {
                int i_103_ = 16384 - i_72_;
                if (this.anInt10097 * -155466425 > 8192) {
                    if ((-155466425 * this.anInt10097) < i_103_)
                        this.anInt10097 = 1814320247 * i_103_;
                } else if ((this.anInt10097 * -155466425) > i_72_)
                    this.anInt10097 = i_72_ * 1814320247;
            }
            if (-197572281 * this.anInt10073 != 0 && i_73_ != 0) {
                int i_104_ = 16384 - i_73_;
                if (this.anInt10073 * -197572281 > 8192) {
                    if ((this.anInt10073 * -197572281) < i_104_)
                        this.anInt10073 = i_104_ * -1037987721;
                } else if ((-197572281 * this.anInt10073) > i_73_)
                    this.anInt10073 = i_73_ * -1037987721;
            }
            this.anInt10074 = (i_83_ + i_98_) * 1400968295;
            if (i_88_ + i_93_ < -104151209 * this.anInt10074)
                this.anInt10074 = 1400968295 * (i_88_ + i_93_);
            this.anInt10074 = (1400968295 * ((this.anInt10074 * -104151209 >> 1) - (int) class217.y));
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("akn.z(").append(')').toString());
        }
    }

    public Class350 method4426() {
        try {
            int i_105_ = method4432();
            if (-1 == i_105_)
                return Class349.aClass350_3708;
            return Class94.aClass349_913.method4202(i_105_, (byte) 11);
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("akn.posY(").append(')').toString());
        }
    }

    public abstract int method4427(byte i);

    public void method4428() {
        if (this.aClass62_10118 != null && null != this.aClass62_10118.nextForceTalk) {
            this.aClass62_10118.overheadDuration -= -1979671751;
            if (this.aClass62_10118.overheadDuration * -1542462711 == 0)
                this.aClass62_10118.nextForceTalk = null;
        }
    }

    public abstract boolean method4429(byte i);

    public void setNextForceTalk(String message, int i, int i_106_, int chatOverheadDuration) {
        if (this.aClass62_10118 == null)
            this.aClass62_10118 = new Class62();
        this.aClass62_10118.nextForceTalk = message;
        this.aClass62_10118.anInt607 = -883265885 * i;
        this.aClass62_10118.anInt609 = -998781563 * i_106_;
        this.aClass62_10118.overheadDuration = (this.aClass62_10118.chatOverheadDuration = chatOverheadDuration * -1166793105) * 1683680471;
    }

    public void method4431(int i) {
        if (this.interfaceID * 1097409519 != 1992528251 * this.anInt10107)
            method4416();
        this.anInt10107 = i * 543663539;
    }

    abstract int method4432();

    boolean isValidID(int interfaceID) {
        if (this.interfaceID * 1097409519 == interfaceID)
            return true;
        IComponentDefinitionCollection = com.jagex.IComponentDefinitionCollection.get(interfaceID, null, null, true);
        if (IComponentDefinitionCollection == null)
            return false;
        this.interfaceID = interfaceID * 441346831;
        Graphics.checkOnLoodHook(IComponentDefinitionCollection.componentDefinitions);
        return true;
    }

    public int method4361() {
        try {
            if (-32768 == this.anInt10089 * 1507955715)
                return 0;
            return this.anInt10089 * 1507955715;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("akn.bm(").append(')').toString());
        }
    }

    public abstract Class62 method4437(int i);

    boolean method4439() {
        if (this.anInt10107 * 1992528251 == -1)
            return false;
        return isValidID((1992528251 * this.anInt10107));
    }

    public void method4441(int i, int i_115_, int i_116_, int width, int height, int x, int y) {
        if (!method4439()) {
            if (-1 != i)
                GameClient.aBooleanArray8900[i] = true;
            else {
                for (int i_122_ = 0; i_122_ < 113; i_122_++)
                    GameClient.aBooleanArray8900[i_122_] = true;
            }
        } else
            IComponentDefinition.updateComponentType(IComponentDefinitionCollection.getComponentDefinitions(), -1, i_115_, i_116_, width, height, x, y, i, false);
    }

    public void method4442(int width, int height, boolean bool) {
        if (method4439())
            Class372.method4591(IComponentDefinitionCollection.componentDefinitions, -1, width, height, bool);
    }

    boolean method4376() {
        return this.aBoolean10129;
    }

    void method4445(GraphicsToolkit graphicsToolkit, ModelToolkit[] modelToolkits, Matrix43f cameraMatrix, boolean bool) {
        try {
            if (!bool) {
                int newSize = 0;
                int validModelCount = 0;
                int i_128_ = 0;
                int i_129_ = 0;
                int lastValidModel = -1;
                int i_131_ = -1;
                EmissiveTriangle[][] emissiveTriangles = new EmissiveTriangle[modelToolkits.length][];
                EffectiveVertex[][] effectiveVertices = new EffectiveVertex[modelToolkits.length][];
                for (int index = 0; index < modelToolkits.length; index++) {
                    if (modelToolkits[index] != null) {
                        modelToolkits[index].method4463(cameraMatrix);
                        emissiveTriangles[index] = modelToolkits[index].method4464();
                        effectiveVertices[index] = modelToolkits[index].method4445();
                        if (emissiveTriangles[index] != null) {
                            lastValidModel = index;
                            validModelCount++;
                            newSize += emissiveTriangles[index].length;
                        }
                        if (effectiveVertices[index] != null) {
                            i_131_ = index;
                            i_129_++;
                            i_128_ += effectiveVertices[index].length;
                        }
                    }
                }
                if ((this.aParticleSystem_10067 == null || (this.aParticleSystem_10067.aBoolean3992)) && (validModelCount > 0 || i_129_ > 0))
                    this.aParticleSystem_10067 = ParticleSystem.getSystem(GameClient.clientTick * 443738891, true);
                if (this.aParticleSystem_10067 != null) {
                    EmissiveTriangle[] emissiveTriangleS_133_;
                    if (validModelCount == 1)
                        emissiveTriangleS_133_ = emissiveTriangles[lastValidModel];
                    else {
                        emissiveTriangleS_133_ = new EmissiveTriangle[newSize];
                        int i_134_ = 0;
                        for (int index = 0; index < modelToolkits.length; index++) {
                            if (null != emissiveTriangles[index]) {
                                System.arraycopy(emissiveTriangles[index], 0, emissiveTriangleS_133_, i_134_, emissiveTriangles[index].length);
                                i_134_ += emissiveTriangles[index].length;
                            }
                        }
                    }
                    EffectiveVertex[] effectiveVertexS_137_;
                    if (i_129_ == 1)
                        effectiveVertexS_137_ = effectiveVertices[i_131_];
                    else {
                        effectiveVertexS_137_ = new EffectiveVertex[i_128_];
                        int i_138_ = 0;
                        for (int index = 0; index < modelToolkits.length; index++) {
                            if (effectiveVertices[index] != null) {
                                System.arraycopy(effectiveVertices[index], 0, effectiveVertexS_137_, i_138_, effectiveVertices[index].length);
                                i_138_ += effectiveVertices[index].length;
                            }
                        }
                    }
                    this.aParticleSystem_10067.createObject(graphicsToolkit, (long) (443738891 * GameClient.clientTick), emissiveTriangleS_133_, effectiveVertexS_137_, false);
                    this.aBoolean10128 = true;
                }
            } else if (this.aParticleSystem_10067 != null)
                this.aParticleSystem_10067.method4233((long) (GameClient.clientTick * 443738891));
            if (null != this.aParticleSystem_10067)
                this.aParticleSystem_10067.setPlane(plane);
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("akn.k(").append(')').toString());
        }
    }

    public int method4450(short i) {
        try {
            Class350 class350 = method4426();
            int i_140_ = 259411823 * aClass386_10084.anInt4144;
            boolean bool;
            if (class350.anInt3744 * -2079528661 != 0)
                bool = aClass386_10084.method4717(anInt10068 * 2145248039, (-2079528661 * class350.anInt3744), (class350.anInt3745 * -1460258951), (byte) -24);
            else
                bool = aClass386_10084.method4717(anInt10068 * 2145248039, 907865649 * anInt10115, anInt10115 * 907865649, (byte) -44);
            int i_141_ = 259411823 * aClass386_10084.anInt4144 - i_140_;
            if (0 != i_141_)
                anInt10114 += 1666755029;
            else {
                anInt10114 = 0;
                aClass386_10084.method4718(2145248039 * anInt10068, -43132362);
            }
            if (bool) {
                if (0 != class350.anInt3726 * 1496476593) {
                    if (i_141_ > 0)
                        aClass386_10113.method4717(class350.anInt3748 * 1185872679, class350.anInt3726 * 1496476593, 827802659 * class350.anInt3747, (byte) -96);
                    else
                        aClass386_10113.method4717(-(class350.anInt3748 * 1185872679), 1496476593 * class350.anInt3726, class350.anInt3747 * 827802659, (byte) -111);
                }
                if (class350.anInt3720 * 847512459 != 0)
                    aClass386_10111.method4717(-330229359 * class350.anInt3751, 847512459 * class350.anInt3720, class350.anInt3750 * 1308368525, (byte) -37);
            } else {
                if (0 != 1496476593 * class350.anInt3726)
                    aClass386_10113.method4717(0, class350.anInt3726 * 1496476593, 827802659 * class350.anInt3747, (byte) -2);
                else
                    aClass386_10113.method4718(0, -1696263872);
                if (class350.anInt3720 * 847512459 != 0)
                    aClass386_10111.method4717(0, 847512459 * class350.anInt3720, class350.anInt3750 * 1308368525, (byte) -85);
                else
                    aClass386_10111.method4718(0, -146971224);
            }
            return i_141_;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("akn.b(").append(')').toString());
        }
    }

    public void method4451(int[] is, int[] is_142_, int i) {
        try {
            if (null == anIntArray10092 && is != null)
                anIntArray10092 = new int[(EquipmentDefaults.defaults.hidden).length];
            else if (null == is) {
                anIntArray10092 = null;
                return;
            }
            for (int i_143_ = 0; i_143_ < anIntArray10092.length; i_143_++)
                anIntArray10092[i_143_] = -1;
            for (int i_144_ = 0; i_144_ < is.length; i_144_++) {
                int i_145_ = is_142_[i_144_];
                int i_146_ = 0;
                while (i_146_ < anIntArray10092.length) {
                    if ((i_145_ & 0x1) != 0)
                        anIntArray10092[i_146_] = is[i_144_];
                    i_146_++;
                    i_145_ >>= 1;
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("akn.p(").append(')').toString());
        }
    }

}
