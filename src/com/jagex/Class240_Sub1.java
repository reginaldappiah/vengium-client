package com.jagex;/* Class240_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.game.settings.TextureSetting;

public class Class240_Sub1 extends Class240 {
    static boolean aBoolean7073;
    static int[] anIntArray7074;
    static int[] anIntArray7075;
    static int[] anIntArray7078;
    static int[] anIntArray7081;
    static boolean aBoolean7084;

    static {
        aBoolean7073 = false;
        anIntArray7078 = new int[]{1, 0, -1, 0};
        anIntArray7075 = new int[]{0, -1, 0, 1};
        anIntArray7074 = new int[]{1, -1, -1, 1};
        anIntArray7081 = new int[]{-1, -1, 1, 1};
    }

    ObjectDefinitionLoader cache;
    LightingDetails lightingDetails;
    int plane = 1175238381;

    public Class240_Sub1(Region class331, ObjectDefinitionLoader class433, int i, int i_183_, int i_184_, boolean bool, Class244 class244, LightingDetails class364) {
        super(class331, i, i_183_, i_184_, bool, StaticMethods.aClass375_6196, Class151.aClass451_6358, class244);
        this.cache = class433;
        this.lightingDetails = class364;
    }

    static final void method2244(IComponentDefinition componentDefinition, IComponentDefinitionCollection IComponentDefinitionCollection, ScriptRuntime runtime) {
        try {
            String string = (String) (runtime.objectStack[(runtime.objectArgs -= 969361751) * -203050393]);
            int[] is = Class298_Sub6.method2863(string, runtime);
            if (is != null) {
                string = string.substring(0, string.length() - 1);
            }
            componentDefinition.onVarcTransmitHook = Class128_Sub2.method1441(string, runtime);
            componentDefinition.globalVarTransmitList = is;
            componentDefinition.hasScript = true;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("aaa.oy(").append(')').toString());
        }
    }

    static final void method2245(ScriptRuntime runtime) {
        try {
            runtime.integerStackOffset -= -1959403445;
            int i_185_ = (runtime.integerStack[runtime.integerStackOffset * 681479919]);
            int i_186_ = (runtime.integerStack[681479919 * runtime.integerStackOffset + 1]);
            int i_187_ = (runtime.integerStack[681479919 * runtime.integerStackOffset + 2]);
            int i_188_ = (runtime.integerStack[3 + 681479919 * runtime.integerStackOffset]);
            int i_189_ = (runtime.integerStack[4 + 681479919 * runtime.integerStackOffset]);
            if (-1 == i_187_) {
                throw new RuntimeException();
            }
            ClientScriptMap class483 = Class51.aClass475_506.getClientScriptMap(i_187_);
            if (i_186_ != class483.aChar6042) {
                throw new RuntimeException();
            }
            if (class483.aChar6037 != i_185_) {
                throw new RuntimeException();
            }
            int[] is = class483.method6128(Integer.valueOf(i_188_));
            if (i_189_ < 0 || is == null || is.length <= i_189_) {
                throw new RuntimeException();
            }
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = is[i_189_];
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("aaa.vv(").append(')').toString());
        }
    }

    static final void method2246(ScriptRuntime runtime) {
        IComponentScripter IComponentScripter = (runtime.currentInstrBool ? runtime.aIComponentScripter_5247 : runtime.aIComponentScripter_5246);
        IComponentDefinition componentDefinition = IComponentScripter.componentDefinition;
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = (1548853569 * componentDefinition.modelType == 1 ? componentDefinition.modelID * 572201537 : -1);
    }

    void method2234(GraphicsToolkit toolkit, int i, int i_0_, int i_1_, int i_2_, Class289 class289) {
        try {
            SceneObject sceneObject = method2241(i, i_0_, i_1_, i_2_);
            if (null != sceneObject) {
                ObjectDefinition objectDefinition = (this.cache.get(sceneObject.getID()));
                int i_4_ = sceneObject.method29();
                int i_5_ = sceneObject.method30();
                if (objectDefinition.method5784()) {
                    StaticMethods.method5951(i, i_1_, i_2_, objectDefinition);
                }
                if (sceneObject.method39()) {
                    sceneObject.method37(toolkit);
                }
                if (i_0_ == 0) {
                    aClass331_2619.method4025(i, i_1_, i_2_);
                    aClass331_2619.method4026(i, i_1_, i_2_);
                    if (0 != objectDefinition.clipType * -2144543407) {
                        class289.method2743(i_1_, i_2_, i_4_, i_5_, objectDefinition.objectBlocksFly, !objectDefinition.objectBlocksWalkAlternative);
                    }
                    if (-1508517619 * objectDefinition.anInt5376 == 1) {
                        if (0 == i_5_) {
                            aClass331_2619.aClass333_3512.method4068(1, i, i_1_, i_2_);
                        } else if (1 == i_5_) {
                            aClass331_2619.aClass333_3512.method4068(2, i, i_1_, 1 + i_2_);
                        } else if (2 == i_5_) {
                            aClass331_2619.aClass333_3512.method4068(1, i, i_1_ + 1, i_2_);
                        } else if (i_5_ == 3) {
                            aClass331_2619.aClass333_3512.method4068(2, i, i_1_, i_2_);
                        }
                    }
                } else if (1 == i_0_) {
                    aClass331_2619.method4054(i, i_1_, i_2_);
                    aClass331_2619.method4027(i, i_1_, i_2_);
                } else if (2 == i_0_) {
                    aClass331_2619.method4028(i, i_1_, i_2_, GameClient.anInterface17_8960);
                    if (0 != objectDefinition.clipType * -2144543407 && (-1125834887 * objectDefinition.sizeX + i_1_ < anInt2627 * -954368823) && (-1125834887 * objectDefinition.sizeX + i_2_ < anInt2628 * 181474463) && (-565161399 * objectDefinition.sizeY + i_1_ < anInt2627 * -954368823) && (-565161399 * objectDefinition.sizeY + i_2_ < 181474463 * anInt2628)) {
                        class289.method2736(i_1_, i_2_, objectDefinition.sizeX * -1125834887, -565161399 * objectDefinition.sizeY, i_5_, objectDefinition.objectBlocksFly, !objectDefinition.objectBlocksWalkAlternative);
                    }
                    if (Class424.aClass424_6595.type * -1976050083 == i_4_) {
                        if ((i_5_ & 0x1) == 0) {
                            aClass331_2619.aClass333_3512.method4068(8, i, i_1_, i_2_);
                        } else {
                            aClass331_2619.aClass333_3512.method4068(16, i, i_1_, i_2_);
                        }
                    }
                } else if (3 == i_0_) {
                    aClass331_2619.method4009(i, i_1_, i_2_, 2008906043);
                    if (objectDefinition.clipType * -2144543407 == 1) {
                        class289.method2738(i_1_, i_2_, -1244104271);
                    }
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("aaa.cr(").append(')').toString());
        }
    }

    public final void resetAtmosphere(GraphicsToolkit graphicsToolkit, Buffer buffer, int i, int i_6_) {
        if (!underwater) {
            boolean bool = false;
            Atmosphere atmosphere = null;
            while_0_:
            do {
                for (; ; ) {
                    if (buffer.offset * 385051775 >= buffer.buffer.length) {
                        break while_0_;
                    }
                    int i_8_ = buffer.readUByte();
                    if (i_8_ == 0) {
                        if (atmosphere == null) {
                            atmosphere = new Atmosphere(buffer, (this.lightingDetails));
                        } else {
                            atmosphere.method4706(buffer, (this.lightingDetails));
                        }
                    } else if (1 == i_8_) {
                        int i_9_ = buffer.readUByte();
                        if (i_9_ > 0) {
                            for (int i_10_ = 0; i_10_ < i_9_; i_10_++) {
                                Class321 class321 = new Class321(graphicsToolkit, (-1688804109 * (aClass331_2619.positionHash)), buffer, 2);
                                if (589172669 * class321.anInt3351 == 31) {
                                    Class493 class493 = (StaticMethods.aClass499_6668.method6214(buffer.readUShort(), -1728729634));
                                    class321.method3917(class493.anInt6088 * 1438741121, class493.anInt6087 * -2095379959, 2096922993 * class493.anInt6085, 1418726113 * class493.anInt6086);
                                }
                                if (graphicsToolkit.method5048() > 0) {
                                    Light class298_sub10 = class321.light;
                                    int i_11_ = (class298_sub10.method2895(823958259) + (i << 9));
                                    int i_12_ = (class298_sub10.method2897((byte) 113) + (i_6_ << 9));
                                    int i_13_ = i_11_ >> 9;
                                    int i_14_ = i_12_ >> 9;
                                    if (i_13_ >= 0 && i_14_ >= 0 && i_13_ < -954368823 * anInt2627 && i_14_ < 181474463 * anInt2628) {
                                        class298_sub10.method2899(i_11_, ((anIntArrayArrayArray2653[(class321.anInt3345 * -1565952249)][i_13_][i_14_]) - (class298_sub10.method2894(1382635254))), i_12_, (byte) 37);
                                        aClass331_2619.method4051(class321, 763639750);
                                    }
                                }
                            }
                        }
                    } else if (i_8_ == 2) {
                        if (null == atmosphere) {
                            atmosphere = new Atmosphere();
                        }
                        atmosphere.decodeHDR(buffer);
                    } else if (128 == i_8_) {
                        if (atmosphere == null) {
                            atmosphere = new Atmosphere();
                        }
                        atmosphere.decodeSkybox(buffer, (this.lightingDetails));
                    } else {
                        if (129 != i_8_) {
                            break;
                        }
                        if (aByteArrayArrayArray2631 == null) {
                            aByteArrayArrayArray2631 = new byte[4][][];
                        }
                        for (int i_15_ = 0; i_15_ < 4; i_15_++) {
                            byte i_16_ = buffer.readByte();
                            if (i_16_ == 0 && (null != aByteArrayArrayArray2631[i_15_])) {
                                int i_17_ = i;
                                int i_18_ = i + 64;
                                int i_19_ = i_6_;
                                int i_20_ = 64 + i_6_;
                                if (i_17_ < 0) {
                                    i_17_ = 0;
                                } else if (i_17_ >= -954368823 * anInt2627) {
                                    i_17_ = anInt2627 * -954368823;
                                }
                                if (i_18_ < 0) {
                                    i_18_ = 0;
                                } else if (i_18_ >= -954368823 * anInt2627) {
                                    i_18_ = -954368823 * anInt2627;
                                }
                                if (i_19_ < 0) {
                                    i_19_ = 0;
                                } else if (i_19_ >= 181474463 * anInt2628) {
                                    i_19_ = anInt2628 * 181474463;
                                }
                                if (i_20_ < 0) {
                                    i_20_ = 0;
                                } else if (i_20_ >= anInt2628 * 181474463) {
                                    i_20_ = anInt2628 * 181474463;
                                }
                                for (/**/; i_17_ < i_18_; i_17_++) {
                                    for (/**/; i_19_ < i_20_; i_19_++)
                                        aByteArrayArrayArray2631[i_15_][i_17_][i_19_] = (byte) 0;
                                }
                            } else if (i_16_ == 1) {
                                if (aByteArrayArrayArray2631[i_15_] == null) {
                                    aByteArrayArrayArray2631[i_15_] = (new byte[anInt2627 * -954368823 + 1][1 + anInt2628 * 181474463]);
                                }
                                for (int i_21_ = 0; i_21_ < 64; i_21_ += 4) {
                                    for (int i_22_ = 0; i_22_ < 64; i_22_ += 4) {
                                        byte i_23_ = buffer.readByte();
                                        for (int i_24_ = i_21_ + i; i_24_ < 4 + (i_21_ + i); i_24_++) {
                                            for (int i_25_ = i_22_ + i_6_; (i_25_ < 4 + (i_6_ + i_22_)); i_25_++) {
                                                if (i_24_ >= 0 && (i_24_ < (-954368823 * anInt2627)) && i_25_ >= 0 && (i_25_ < (181474463 * anInt2628))) {
                                                    aByteArrayArrayArray2631[i_15_][i_24_][i_25_] = i_23_;
                                                }
                                            }
                                        }
                                    }
                                }
                            } else if (2 == i_16_) {
                                if (aByteArrayArrayArray2631[i_15_] == null) {
                                    aByteArrayArrayArray2631[i_15_] = (new byte[anInt2627 * -954368823 + 1][181474463 * anInt2628 + 1]);
                                }
                                if (i_15_ > 0) {
                                    int i_26_ = i;
                                    int i_27_ = 64 + i;
                                    int i_28_ = i_6_;
                                    int i_29_ = 64 + i_6_;
                                    if (i_26_ < 0) {
                                        i_26_ = 0;
                                    } else if (i_26_ >= anInt2627 * -954368823) {
                                        i_26_ = anInt2627 * -954368823;
                                    }
                                    if (i_27_ < 0) {
                                        i_27_ = 0;
                                    } else if (i_27_ >= anInt2627 * -954368823) {
                                        i_27_ = -954368823 * anInt2627;
                                    }
                                    if (i_28_ < 0) {
                                        i_28_ = 0;
                                    } else if (i_28_ >= 181474463 * anInt2628) {
                                        i_28_ = 181474463 * anInt2628;
                                    }
                                    if (i_29_ < 0) {
                                        i_29_ = 0;
                                    } else if (i_29_ >= anInt2628 * 181474463) {
                                        i_29_ = 181474463 * anInt2628;
                                    }
                                    for (/**/; i_26_ < i_27_; i_26_++) {
                                        for (/**/; i_28_ < i_29_; i_28_++)
                                            aByteArrayArrayArray2631[i_15_][i_26_][i_28_] = (aByteArrayArrayArray2631[i_15_ - 1][i_26_][i_28_]);
                                    }
                                }
                            }
                        }
                        bool = true;
                    }
                }
                throw new IllegalStateException("");
            } while (false);
            if (atmosphere != null) {
                for (int i_30_ = 0; i_30_ < 8; i_30_++) {
                    for (int i_31_ = 0; i_31_ < 8; i_31_++) {
                        int i_32_ = i_30_ + (i >> 3);
                        int i_33_ = (i_6_ >> 3) + i_31_;
                        if (i_32_ >= 0 && i_32_ < anInt2627 * -954368823 >> 3 && i_33_ >= 0 && i_33_ < anInt2628 * 181474463 >> 3) {
                            this.lightingDetails.method4319(i_32_, i_33_, atmosphere, (byte) -2);
                        }
                    }
                }
            }
            if (!bool && aByteArrayArrayArray2631 != null) {
                for (int i_34_ = 0; i_34_ < 4; i_34_++) {
                    if (aByteArrayArrayArray2631[i_34_] != null) {
                        for (int i_35_ = 0; i_35_ < 16; i_35_++) {
                            for (int i_36_ = 0; i_36_ < 16; i_36_++) {
                                int i_37_ = (i >> 2) + i_35_;
                                int i_38_ = i_36_ + (i_6_ >> 2);
                                if (i_37_ >= 0 && i_37_ < 26 && i_38_ >= 0 && i_38_ < 26) {
                                    aByteArrayArrayArray2631[i_34_][i_37_][i_38_] = (byte) 0;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public final void method2236(GraphicsToolkit class_ra, Buffer class298_sub53, int i, int i_39_, int i_40_, int i_41_, int i_42_, int i_43_, int i_44_, int i_45_) {
        try {
            if (!underwater) {
                boolean bool = false;
                Atmosphere class385 = null;
                int i_46_ = 8 * (i_42_ & 0x7);
                int i_47_ = (i_43_ & 0x7) * 8;
                while_1_:
                do {
                    for (; ; ) {
                        if (385051775 * class298_sub53.offset >= class298_sub53.buffer.length) {
                            break while_1_;
                        }
                        int i_48_ = class298_sub53.readUByte();
                        if (0 == i_48_) {
                            if (null == class385) {
                                class385 = new Atmosphere(class298_sub53, (this.lightingDetails));
                            } else {
                                class385.method4706(class298_sub53, (this.lightingDetails));
                            }
                        } else if (1 == i_48_) {
                            int i_49_ = class298_sub53.readUByte();
                            if (i_49_ > 0) {
                                for (int i_50_ = 0; i_50_ < i_49_; i_50_++) {
                                    Class321 class321 = new Class321(class_ra, (-1688804109 * (aClass331_2619.positionHash)), class298_sub53, 2);
                                    if (31 == 589172669 * class321.anInt3351) {
                                        Class493 class493 = (StaticMethods.aClass499_6668.method6214(class298_sub53.readUShort(), -1427443057));
                                        class321.method3917(class493.anInt6088 * 1438741121, -2095379959 * class493.anInt6087, 2096922993 * class493.anInt6085, class493.anInt6086 * 1418726113);
                                    }
                                    if (class_ra.method5048() > 0) {
                                        Light class298_sub10 = class321.light;
                                        int i_51_ = (class298_sub10.method2895(823958259) >> 9);
                                        int i_52_ = (class298_sub10.method2897((byte) 113) >> 9);
                                        if (i_41_ == (class321.anInt3345 * -1565952249) && i_51_ >= i_46_ && i_51_ < i_46_ + 8 && i_52_ >= i_47_ && i_52_ < i_47_ + 8) {
                                            int i_53_ = ((i_39_ << 9) + (StaticMethods.method2045((class298_sub10.method2895(823958259)) & 0xfff, (class298_sub10.method2897((byte) 107)) & 0xfff, i_44_)));
                                            int i_54_ = ((i_40_ << 9) + (method2233((class298_sub10.method2895(823958259)) & 0xfff, (class298_sub10.method2897((byte) 68)) & 0xfff, i_44_, (short) 27107)));
                                            i_51_ = i_53_ >> 9;
                                            i_52_ = i_54_ >> 9;
                                            if (i_51_ >= 0 && i_52_ >= 0 && (i_51_ < anInt2627 * -954368823) && (i_52_ < anInt2628 * 181474463)) {
                                                class298_sub10.method2899(i_53_, ((anIntArrayArrayArray2653[i_41_][i_51_][i_52_]) - (class298_sub10.method2894(-2061162182))), i_54_, (byte) -72);
                                                aClass331_2619.method4051(class321, -1995203079);
                                            }
                                        }
                                    }
                                }
                            }
                        } else if (2 == i_48_) {
                            if (class385 == null) {
                                class385 = new Atmosphere();
                            }
                            class385.decodeHDR(class298_sub53);
                        } else if (i_48_ == 128) {
                            if (null == class385) {
                                class385 = new Atmosphere();
                            }
                            class385.decodeSkybox(class298_sub53, (this.lightingDetails));
                        } else {
                            if (i_48_ != 129) {
                                break;
                            }
                            if (null == aByteArrayArrayArray2631) {
                                aByteArrayArrayArray2631 = new byte[4][][];
                            }
                            int i_55_ = 0;
                            for (/**/; i_55_ < 4; i_55_++) {
                                byte i_56_ = class298_sub53.readByte();
                                if (i_56_ == 0 && null != aByteArrayArrayArray2631[i]) {
                                    if (i_55_ <= i_41_) {
                                        int i_57_ = i_39_;
                                        int i_58_ = i_39_ + 7;
                                        int i_59_ = i_40_;
                                        int i_60_ = 7 + i_40_;
                                        if (i_57_ < 0) {
                                            i_57_ = 0;
                                        } else if (i_57_ >= -954368823 * anInt2627) {
                                            i_57_ = -954368823 * anInt2627;
                                        }
                                        if (i_58_ < 0) {
                                            i_58_ = 0;
                                        } else if (i_58_ >= -954368823 * anInt2627) {
                                            i_58_ = anInt2627 * -954368823;
                                        }
                                        if (i_59_ < 0) {
                                            i_59_ = 0;
                                        } else if (i_59_ >= anInt2628 * 181474463) {
                                            i_59_ = anInt2628 * 181474463;
                                        }
                                        if (i_60_ < 0) {
                                            i_60_ = 0;
                                        } else if (i_60_ >= anInt2628 * 181474463) {
                                            i_60_ = anInt2628 * 181474463;
                                        }
                                        for (/**/; i_57_ < i_58_; i_57_++) {
                                            for (/**/; i_59_ < i_60_; i_59_++)
                                                aByteArrayArrayArray2631[i][i_57_][i_59_] = (byte) 0;
                                        }
                                    }
                                } else if (i_56_ == 1) {
                                    if (null == aByteArrayArrayArray2631[i]) {
                                        aByteArrayArrayArray2631[i] = (new byte[-954368823 * anInt2627 + 1][1 + 181474463 * anInt2628]);
                                    }
                                    for (int i_61_ = 0; i_61_ < 64; i_61_ += 4) {
                                        for (int i_62_ = 0; i_62_ < 64; i_62_ += 4) {
                                            byte i_63_ = class298_sub53.readByte();
                                            if (i_55_ <= i_41_) {
                                                for (int i_64_ = i_61_; i_64_ < 4 + i_61_; i_64_++) {
                                                    for (int i_65_ = i_62_; i_65_ < i_62_ + 4; i_65_++) {
                                                        if (i_64_ >= i_46_ && (i_64_ < 8 + i_46_) && i_65_ >= i_47_ && (i_65_ < 8 + i_47_)) {
                                                            int i_66_ = (i_39_ + (CS2CallStackEntry.method4941((i_64_ & 0x7), (i_65_ & 0x7), i_44_, -1280307862)));
                                                            int i_67_ = (i_40_ + (Class472.method6064((i_64_ & 0x7), (i_65_ & 0x7), i_44_, (byte) -51)));
                                                            if (i_66_ >= 0 && (i_66_ < (-954368823 * anInt2627)) && i_67_ >= 0 && (i_67_ < (anInt2628 * 181474463))) {
                                                                aByteArrayArrayArray2631[i][i_66_][i_67_] = i_63_;
                                                                bool = true;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else if (2 == i_56_) {
                                    continue;
                                }
                            }
                        }
                    }
                    throw new IllegalStateException("");
                } while (false);
                if (class385 != null) {
                    this.lightingDetails.method4319(i_39_ >> 3, i_40_ >> 3, class385, (byte) -31);
                }
                if (!bool && aByteArrayArrayArray2631 != null && null != aByteArrayArrayArray2631[i]) {
                    int i_68_ = i_39_ + 7;
                    int i_69_ = i_40_ + 7;
                    for (int i_70_ = i_39_; i_70_ < i_68_; i_70_++) {
                        for (int i_71_ = i_40_; i_71_ < i_69_; i_71_++)
                            aByteArrayArrayArray2631[i][i_70_][i_71_] = (byte) 0;
                    }
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("aaa.cn(").append(')').toString());
        }
    }

    public final void method2237(GraphicsToolkit toolkit, byte[] data, int i, int i_72_, Class289[] class289s, int i_73_) {
        try {
            Buffer buffer = new Buffer(data);
            int i_74_ = -1;
            for (; ; ) {
                int i_75_ = buffer.readSmart();
                if (i_75_ == 0) {
                    if (i_73_ == 65535) {
                        /* empty */
                    }
                    break;
                }
                i_74_ += i_75_;
                int i_76_ = 0;
                for (; ; ) {
                    int i_77_ = buffer.readUnsignedSmart();
                    if (i_77_ == 0) {
                        if (i_73_ == 65535) {
							/* empty */
                        }
                        break;
                    }
                    i_76_ += i_77_ - 1;
                    int i_78_ = i_76_ & 0x3f;
                    int i_79_ = i_76_ >> 6 & 0x3f;
                    int i_80_ = i_76_ >> 12;
                    int i_81_ = buffer.readUByte();
                    int i_82_ = i_81_ >> 2;
                    int i_83_ = i_81_ & 0x3;
                    int i_84_ = i_79_ + i;
                    int i_85_ = i_78_ + i_72_;
                    if (i_84_ > 0 && i_85_ > 0 && i_84_ < -954368823 * anInt2627 - 1 && i_85_ < anInt2628 * 181474463 - 1) {
                        Class289 class289 = null;
                        if (!underwater) {
                            int i_86_ = i_80_;
                            if (2 == ((aClass244_2635.flags[1][i_84_][i_85_]) & 0x2)) {
                                i_86_--;
                            }
                            if (i_86_ >= 0) {
                                class289 = class289s[i_86_];
                            }
                        }
                        method2243(toolkit, i_80_, i_80_, i_84_, i_85_, i_74_, i_83_, i_82_, class289, -1);
                    }
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("aaa.cc(").append(')').toString());
        }
    }

    public final void method2238(GraphicsToolkit class_ra, byte[] is, int i, int i_87_, int i_88_, int i_89_, int i_90_, int i_91_, int i_92_, Class289[] class289s, int i_93_) {
        try {
            Buffer class298_sub53 = new Buffer(is);
            int i_94_ = -1;
            for (; ; ) {
                int i_95_ = class298_sub53.readSmart();
                if (i_95_ == 0) {
                    if (i_93_ == -174685332) {
                        break;
                    }
                    break;
                }
                i_94_ += i_95_;
                int i_96_ = 0;
                for (; ; ) {
                    int i_97_ = class298_sub53.readUnsignedSmart();
                    if (i_97_ == 0) {
                        if (i_93_ != -174685332) {
                            throw new IllegalStateException();
                        }
                        break;
                    }
                    i_96_ += i_97_ - 1;
                    int i_98_ = i_96_ & 0x3f;
                    int i_99_ = i_96_ >> 6 & 0x3f;
                    int i_100_ = i_96_ >> 12;
                    int i_101_ = class298_sub53.readUByte();
                    int i_102_ = i_101_ >> 2;
                    int i_103_ = i_101_ & 0x3;
                    if (i_89_ == i_100_ && i_99_ >= i_90_ && i_99_ < 8 + i_90_ && i_98_ >= i_91_ && i_98_ < 8 + i_91_) {
                        ObjectDefinition class432 = this.cache.get(i_94_);
                        int i_104_ = (i_87_ + Class415.method5587(i_99_ & 0x7, i_98_ & 0x7, i_92_, (-1125834887 * class432.sizeX), (class432.sizeY * -565161399), i_103_, 181137699));
                        int i_105_ = i_88_ + Class315.method3833(i_99_ & 0x7, i_98_ & 0x7, i_92_, (class432.sizeX * -1125834887), (class432.sizeY * -565161399), i_103_, 1981614763);
                        if (i_104_ > 0 && i_105_ > 0 && i_104_ < -954368823 * anInt2627 - 1 && i_105_ < 181474463 * anInt2628 - 1) {
                            Class289 class289 = null;
                            if (!underwater) {
                                int i_106_ = i;
                                if (2 == ((aClass244_2635.flags[1][i_104_][i_105_]) & 0x2)) {
                                    i_106_--;
                                }
                                if (i_106_ >= 0) {
                                    class289 = class289s[i_106_];
                                }
                            }
                            method2243(class_ra, i, i, i_104_, i_105_, i_94_, i_92_ + i_103_ & 0x3, i_102_, class289, -1);
                        }
                    }
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("aaa.ca(").append(')').toString());
        }
    }

    boolean method2239(GraphicsToolkit toolkit, int i, int i_107_, boolean bool, ObjectDefinition objectDefinition, int i_108_, int i_109_, int i_110_, int i_111_, int i_112_, int i_113_, int i_114_, int i_115_, boolean bool_116_, FloorToolkit floorToolkit, Class289 class289, int i_117_, int i_118_) {
        try {
            if (-1976050083 * Class424.aClass424_6614.type == i) {
                int i_120_ = objectDefinition.anInt5376 * -1508517619;
                if (aBoolean7073 && -1 == -1508517619 * objectDefinition.anInt5376) {
                    i_120_ = 1;
                }
                Class365_Sub1_Sub5 class365_sub1_sub5;
                if (bool) {
                    Class365_Sub1_Sub5_Sub1 class365_sub1_sub5_sub1 = new Class365_Sub1_Sub5_Sub1(aClass331_2619, toolkit, (this.cache), objectDefinition, i_109_, i_110_, i_111_, i_112_, i_113_, underwater, i, i_107_, bool_116_);
                    if (class365_sub1_sub5_sub1.method39()) {
                        class365_sub1_sub5_sub1.method33(toolkit);
                    }
                    class365_sub1_sub5 = class365_sub1_sub5_sub1;
                } else {
                    class365_sub1_sub5 = new Class365_Sub1_Sub5_Sub2(aClass331_2619, toolkit, (this.cache), objectDefinition, i_109_, i_110_, i_111_, i_112_, i_113_, underwater, i, i_107_, i_108_);
                }
                aClass331_2619.method4020(i_109_, i_114_, i_115_, class365_sub1_sub5, null, (byte) 53);
                if (0 == i_107_) {
                    if (aBoolean2632 && objectDefinition.aBoolean5405) {
                        floorToolkit.LA(i_114_, i_115_, 50);
                        floorToolkit.LA(i_114_, i_115_ + 1, 50);
                    }
                    if (i_120_ == 1 && !underwater) {
                        aClass331_2619.aClass333_3512.method4067(1, i_109_, i_114_, i_115_, 201968507 * objectDefinition.anInt5387, -1994960695 * objectDefinition.anInt5388);
                    }
                } else if (i_107_ == 1) {
                    if (aBoolean2632 && objectDefinition.aBoolean5405) {
                        floorToolkit.LA(i_114_, 1 + i_115_, 50);
                        floorToolkit.LA(i_114_ + 1, i_115_ + 1, 50);
                    }
                    if (i_120_ == 1 && !underwater) {
                        aClass331_2619.aClass333_3512.method4067(2, i_109_, i_114_, 1 + i_115_, objectDefinition.anInt5387 * 201968507, -(objectDefinition.anInt5388 * -1994960695));
                    }
                } else if (i_107_ == 2) {
                    if (aBoolean2632 && objectDefinition.aBoolean5405) {
                        floorToolkit.LA(i_114_ + 1, i_115_, 50);
                        floorToolkit.LA(1 + i_114_, 1 + i_115_, 50);
                    }
                    if (1 == i_120_ && !underwater) {
                        aClass331_2619.aClass333_3512.method4067(1, i_109_, 1 + i_114_, i_115_, objectDefinition.anInt5387 * 201968507, -(objectDefinition.anInt5388 * -1994960695));
                    }
                } else if (i_107_ == 3) {
                    if (aBoolean2632 && objectDefinition.aBoolean5405) {
                        floorToolkit.LA(i_114_, i_115_, 50);
                        floorToolkit.LA(1 + i_114_, i_115_, 50);
                    }
                    if (1 == i_120_ && !underwater) {
                        aClass331_2619.aClass333_3512.method4067(2, i_109_, i_114_, i_115_, objectDefinition.anInt5387 * 201968507, objectDefinition.anInt5388 * -1994960695);
                    }
                }
                if (0 != -2144543407 * objectDefinition.clipType && class289 != null) {
                    class289.method2732(i_114_, i_115_, i, i_107_, objectDefinition.objectBlocksFly, !objectDefinition.objectBlocksWalkAlternative);
                }
                if (-448694871 * objectDefinition.anInt5391 != 64) {
                    aClass331_2619.method4023(i_109_, i_114_, i_115_, objectDefinition.anInt5391 * -448694871, (byte) -54);
                }
                return true;
            }
            if (i == -1976050083 * Class424.aClass424_6592.type) {
                Class365_Sub1_Sub5 class365_sub1_sub5;
                if (bool) {
                    Class365_Sub1_Sub5_Sub1 class365_sub1_sub5_sub1 = new Class365_Sub1_Sub5_Sub1(aClass331_2619, toolkit, (this.cache), objectDefinition, i_109_, i_110_, i_111_, i_112_, i_113_, underwater, i, i_107_, bool_116_);
                    if (class365_sub1_sub5_sub1.method39()) {
                        class365_sub1_sub5_sub1.method33(toolkit);
                    }
                    class365_sub1_sub5 = class365_sub1_sub5_sub1;
                } else {
                    class365_sub1_sub5 = new Class365_Sub1_Sub5_Sub2(aClass331_2619, toolkit, (this.cache), objectDefinition, i_109_, i_110_, i_111_, i_112_, i_113_, underwater, i, i_107_, i_108_);
                }
                aClass331_2619.method4020(i_109_, i_114_, i_115_, class365_sub1_sub5, null, (byte) 117);
                if (objectDefinition.aBoolean5405 && aBoolean2632) {
                    if (i_107_ == 0) {
                        floorToolkit.LA(i_114_, i_115_ + 1, 50);
                    } else if (1 == i_107_) {
                        floorToolkit.LA(1 + i_114_, i_115_ + 1, 50);
                    } else if (2 == i_107_) {
                        floorToolkit.LA(i_114_ + 1, i_115_, 50);
                    } else if (3 == i_107_) {
                        floorToolkit.LA(i_114_, i_115_, 50);
                    }
                }
                if (-2144543407 * objectDefinition.clipType != 0 && null != class289) {
                    class289.method2732(i_114_, i_115_, i, i_107_, objectDefinition.objectBlocksFly, !objectDefinition.objectBlocksWalkAlternative);
                }
                return true;
            }
            if (i == -1976050083 * Class424.aClass424_6593.type) {
                int i_121_ = i_107_ + 1 & 0x3;
                Class365_Sub1_Sub5 class365_sub1_sub5;
                Class365_Sub1_Sub5 class365_sub1_sub5_122_;
                if (bool) {
                    Class365_Sub1_Sub5_Sub1 class365_sub1_sub5_sub1 = new Class365_Sub1_Sub5_Sub1(aClass331_2619, toolkit, (this.cache), objectDefinition, i_109_, i_110_, i_111_, i_112_, i_113_, underwater, i, 4 + i_107_, bool_116_);
                    Class365_Sub1_Sub5_Sub1 class365_sub1_sub5_sub1_123_ = new Class365_Sub1_Sub5_Sub1(aClass331_2619, toolkit, (this.cache), objectDefinition, i_109_, i_110_, i_111_, i_112_, i_113_, underwater, i, i_121_, bool_116_);
                    if (class365_sub1_sub5_sub1.method39()) {
                        class365_sub1_sub5_sub1.method33(toolkit);
                    }
                    if (class365_sub1_sub5_sub1_123_.method39()) {
                        class365_sub1_sub5_sub1_123_.method33(toolkit);
                    }
                    class365_sub1_sub5 = class365_sub1_sub5_sub1;
                    class365_sub1_sub5_122_ = class365_sub1_sub5_sub1_123_;
                } else {
                    class365_sub1_sub5 = new Class365_Sub1_Sub5_Sub2(aClass331_2619, toolkit, (this.cache), objectDefinition, i_109_, i_110_, i_111_, i_112_, i_113_, underwater, i, 4 + i_107_, i_108_);
                    class365_sub1_sub5_122_ = new Class365_Sub1_Sub5_Sub2(aClass331_2619, toolkit, (this.cache), objectDefinition, i_109_, i_110_, i_111_, i_112_, i_113_, underwater, i, i_121_, i_108_);
                }
                aClass331_2619.method4020(i_109_, i_114_, i_115_, class365_sub1_sub5, class365_sub1_sub5_122_, (byte) 48);
                if ((objectDefinition.anInt5376 * -1508517619 == 1 || aBoolean7073 && -1 == -1508517619 * objectDefinition.anInt5376) && !underwater) {
                    if (0 == i_107_) {
                        aClass331_2619.aClass333_3512.method4067(1, i_109_, i_114_, i_115_, objectDefinition.anInt5387 * 201968507, objectDefinition.anInt5388 * -1994960695);
                        aClass331_2619.aClass333_3512.method4067(2, i_109_, i_114_, 1 + i_115_, objectDefinition.anInt5387 * 201968507, objectDefinition.anInt5388 * -1994960695);
                    } else if (i_107_ == 1) {
                        aClass331_2619.aClass333_3512.method4067(1, i_109_, i_114_ + 1, i_115_, objectDefinition.anInt5387 * 201968507, objectDefinition.anInt5388 * -1994960695);
                        aClass331_2619.aClass333_3512.method4067(2, i_109_, i_114_, 1 + i_115_, objectDefinition.anInt5387 * 201968507, objectDefinition.anInt5388 * -1994960695);
                    } else if (i_107_ == 2) {
                        aClass331_2619.aClass333_3512.method4067(1, i_109_, 1 + i_114_, i_115_, 201968507 * objectDefinition.anInt5387, -1994960695 * objectDefinition.anInt5388);
                        aClass331_2619.aClass333_3512.method4067(2, i_109_, i_114_, i_115_, 201968507 * objectDefinition.anInt5387, objectDefinition.anInt5388 * -1994960695);
                    } else if (3 == i_107_) {
                        aClass331_2619.aClass333_3512.method4067(1, i_109_, i_114_, i_115_, objectDefinition.anInt5387 * 201968507, objectDefinition.anInt5388 * -1994960695);
                        aClass331_2619.aClass333_3512.method4067(2, i_109_, i_114_, i_115_, objectDefinition.anInt5387 * 201968507, -1994960695 * objectDefinition.anInt5388);
                    }
                }
                if (0 != -2144543407 * objectDefinition.clipType && class289 != null) {
                    class289.method2732(i_114_, i_115_, i, i_107_, objectDefinition.objectBlocksFly, !objectDefinition.objectBlocksWalkAlternative);
                }
                if (objectDefinition.anInt5391 * -448694871 != 64) {
                    aClass331_2619.method4023(i_109_, i_114_, i_115_, -448694871 * objectDefinition.anInt5391, (byte) 12);
                }
                return true;
            }
            if (i == -1976050083 * Class424.aClass424_6594.type) {
                Class365_Sub1_Sub5 class365_sub1_sub5;
                if (bool) {
                    Class365_Sub1_Sub5_Sub1 class365_sub1_sub5_sub1 = new Class365_Sub1_Sub5_Sub1(aClass331_2619, toolkit, (this.cache), objectDefinition, i_109_, i_110_, i_111_, i_112_, i_113_, underwater, i, i_107_, bool_116_);
                    if (class365_sub1_sub5_sub1.method39()) {
                        class365_sub1_sub5_sub1.method33(toolkit);
                    }
                    class365_sub1_sub5 = class365_sub1_sub5_sub1;
                } else {
                    class365_sub1_sub5 = new Class365_Sub1_Sub5_Sub2(aClass331_2619, toolkit, (this.cache), objectDefinition, i_109_, i_110_, i_111_, i_112_, i_113_, underwater, i, i_107_, i_108_);
                }
                aClass331_2619.method4020(i_109_, i_114_, i_115_, class365_sub1_sub5, null, (byte) 58);
                if (objectDefinition.aBoolean5405 && aBoolean2632) {
                    if (0 == i_107_) {
                        floorToolkit.LA(i_114_, 1 + i_115_, 50);
                    } else if (i_107_ == 1) {
                        floorToolkit.LA(i_114_ + 1, i_115_ + 1, 50);
                    } else if (2 == i_107_) {
                        floorToolkit.LA(i_114_ + 1, i_115_, 50);
                    } else if (3 == i_107_) {
                        floorToolkit.LA(i_114_, i_115_, 50);
                    }
                }
                if (objectDefinition.clipType * -2144543407 != 0 && class289 != null) {
                    class289.method2732(i_114_, i_115_, i, i_107_, objectDefinition.objectBlocksFly, !objectDefinition.objectBlocksWalkAlternative);
                }
                return true;
            }
            if (i == -1976050083 * Class424.aClass424_6595.type) {
                Class365_Sub1_Sub1 class365_sub1_sub1;
                if (bool) {
                    Class365_Sub1_Sub1_Sub6 class365_sub1_sub1_sub6 = new Class365_Sub1_Sub1_Sub6(aClass331_2619, toolkit, (this.cache), objectDefinition, i_109_, i_110_, i_111_, i_112_, i_113_, underwater, i_114_, i_114_, i_115_, i_115_, i, i_107_, bool_116_);
                    if (class365_sub1_sub1_sub6.method39()) {
                        class365_sub1_sub1_sub6.method33(toolkit);
                    }
                    class365_sub1_sub1 = class365_sub1_sub1_sub6;
                } else {
                    class365_sub1_sub1 = new Class365_Sub1_Sub1_Sub5(aClass331_2619, toolkit, (this.cache), objectDefinition, i_109_, i_110_, i_111_, i_112_, i_113_, underwater, i_114_, i_117_ + i_114_ - 1, i_115_, i_115_ + i_118_ - 1, i, i_107_, i_108_);
                }
                aClass331_2619.method4022(class365_sub1_sub1, false, (byte) 0);
                if (1 == objectDefinition.anInt5376 * -1508517619 && !underwater) {
                    int i_124_;
                    if ((i_107_ & 0x1) == 0) {
                        i_124_ = 8;
                    } else {
                        i_124_ = 16;
                    }
                    aClass331_2619.aClass333_3512.method4067(i_124_, i_109_, i_114_, i_115_, objectDefinition.anInt5387 * 201968507, 0);
                }
                if (objectDefinition.clipType * -2144543407 != 0 && null != class289) {
                    class289.method2741(i_114_, i_115_, i_117_, i_118_, objectDefinition.objectBlocksFly, !objectDefinition.objectBlocksWalkAlternative, (byte) 2);
                }
                if (objectDefinition.anInt5391 * -448694871 != 64) {
                    aClass331_2619.method4023(i_109_, i_114_, i_115_, objectDefinition.anInt5391 * -448694871, (byte) 23);
                }
                return true;
            }
            return false;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("aaa.ce(").append(')').toString());
        }
    }

    boolean method2240(GraphicsToolkit class_ra, int i, int i_125_, boolean bool, ObjectDefinition class432, int i_126_, int i_127_, int i_128_, int i_129_, int i_130_, int i_131_, int i_132_, int i_133_, int i_134_) {
        try {
            if (i == -1976050083 * Class424.aClass424_6596.type) {
                Class365_Sub1_Sub3 class365_sub1_sub3;
                if (bool) {
                    Class365_Sub1_Sub3_Sub2 class365_sub1_sub3_sub2 = new Class365_Sub1_Sub3_Sub2(aClass331_2619, class_ra, (this.cache), class432, i_127_, i_128_, i_129_, i_130_, i_131_, underwater, 0, 0, i, i_125_);
                    if (class365_sub1_sub3_sub2.method39()) {
                        class365_sub1_sub3_sub2.method33(class_ra);
                    }
                    class365_sub1_sub3 = class365_sub1_sub3_sub2;
                } else {
                    class365_sub1_sub3 = new Class365_Sub1_Sub3_Sub1(aClass331_2619, class_ra, (this.cache), class432, i_127_, i_128_, i_129_, i_130_, i_131_, underwater, 0, 0, i, i_125_, i_126_);
                }
                aClass331_2619.method4021(i_127_, i_132_, i_133_, class365_sub1_sub3, null, 861548591);
                return true;
            }
            if (i == Class424.aClass424_6601.type * -1976050083) {
                int i_135_ = 65;
                SceneObject sceneObject = ((SceneObject) aClass331_2619.method4031(i_127_, i_132_, i_133_));
                if (null != sceneObject) {
                    i_135_ = (this.cache.get(sceneObject.getID()).anInt5391) * -448694871 + 1;
                }
                Class365_Sub1_Sub3 class365_sub1_sub3;
                if (bool) {
                    Class365_Sub1_Sub3_Sub2 class365_sub1_sub3_sub2 = (new Class365_Sub1_Sub3_Sub2(aClass331_2619, class_ra, this.cache, class432, i_127_, i_128_, i_129_, i_130_, i_131_, underwater, anIntArray7078[i_125_] * i_135_, anIntArray7075[i_125_] * i_135_, i, i_125_));
                    if (class365_sub1_sub3_sub2.method39()) {
                        class365_sub1_sub3_sub2.method33(class_ra);
                    }
                    class365_sub1_sub3 = class365_sub1_sub3_sub2;
                } else {
                    class365_sub1_sub3 = (new Class365_Sub1_Sub3_Sub1(aClass331_2619, class_ra, this.cache, class432, i_127_, i_128_, i_129_, i_130_, i_131_, underwater, i_135_ * anIntArray7078[i_125_], i_135_ * anIntArray7075[i_125_], i, i_125_, i_126_));
                }
                aClass331_2619.method4021(i_127_, i_132_, i_133_, class365_sub1_sub3, null, 1859376340);
                return true;
            }
            if (-1976050083 * Class424.aClass424_6598.type == i) {
                int i_136_ = 33;
                SceneObject sceneObject = ((SceneObject) aClass331_2619.method4031(i_127_, i_132_, i_133_));
                if (sceneObject != null) {
                    i_136_ = (this.cache.get(sceneObject.getID()).anInt5391) * -448694871 / 2 + 1;
                }
                Class365_Sub1_Sub3 class365_sub1_sub3;
                if (bool) {
                    Class365_Sub1_Sub3_Sub2 class365_sub1_sub3_sub2 = (new Class365_Sub1_Sub3_Sub2(aClass331_2619, class_ra, this.cache, class432, i_127_, i_128_, i_129_, i_130_, i_131_, underwater, i_136_ * anIntArray7078[i_125_], i_136_ * anIntArray7075[i_125_], i, i_125_ + 4));
                    if (class365_sub1_sub3_sub2.method39()) {
                        class365_sub1_sub3_sub2.method33(class_ra);
                    }
                    class365_sub1_sub3 = class365_sub1_sub3_sub2;
                } else {
                    class365_sub1_sub3 = (new Class365_Sub1_Sub3_Sub1(aClass331_2619, class_ra, this.cache, class432, i_127_, i_128_, i_129_, i_130_, i_131_, underwater, i_136_ * anIntArray7074[i_125_], anIntArray7081[i_125_] * i_136_, i, i_125_ + 4, i_126_));
                }
                aClass331_2619.method4021(i_127_, i_132_, i_133_, class365_sub1_sub3, null, 1431954302);
                return true;
            }
            if (-1976050083 * Class424.aClass424_6599.type == i) {
                int i_137_ = i_125_ + 2 & 0x3;
                Class365_Sub1_Sub3 class365_sub1_sub3;
                if (bool) {
                    Class365_Sub1_Sub3_Sub2 class365_sub1_sub3_sub2 = new Class365_Sub1_Sub3_Sub2(aClass331_2619, class_ra, (this.cache), class432, i_127_, i_128_, i_129_, i_130_, i_131_, underwater, 0, 0, i, i_137_ + 4);
                    if (class365_sub1_sub3_sub2.method39()) {
                        class365_sub1_sub3_sub2.method33(class_ra);
                    }
                    class365_sub1_sub3 = class365_sub1_sub3_sub2;
                } else {
                    class365_sub1_sub3 = new Class365_Sub1_Sub3_Sub1(aClass331_2619, class_ra, (this.cache), class432, i_127_, i_128_, i_129_, i_130_, i_131_, underwater, 0, 0, i, i_137_ + 4, i_126_);
                }
                aClass331_2619.method4021(i_127_, i_132_, i_133_, class365_sub1_sub3, null, 1921538390);
                return true;
            }
            if (Class424.aClass424_6600.type * -1976050083 == i) {
                int i_138_ = i_125_ + 2 & 0x3;
                int i_139_ = 33;
                SceneObject sceneObject = ((SceneObject) aClass331_2619.method4031(i_127_, i_132_, i_133_));
                if (null != sceneObject) {
                    i_139_ = (this.cache.get(sceneObject.getID()).anInt5391) * -448694871 / 2 + 1;
                }
                Class365_Sub1_Sub3 class365_sub1_sub3;
                Class365_Sub1_Sub3 class365_sub1_sub3_140_;
                if (bool) {
                    Class365_Sub1_Sub3_Sub2 class365_sub1_sub3_sub2 = (new Class365_Sub1_Sub3_Sub2(aClass331_2619, class_ra, this.cache, class432, i_127_, i_128_, i_129_, i_130_, i_131_, underwater, i_139_ * anIntArray7074[i_125_], anIntArray7081[i_125_] * i_139_, i, i_125_ + 4));
                    Class365_Sub1_Sub3_Sub2 class365_sub1_sub3_sub2_141_ = new Class365_Sub1_Sub3_Sub2(aClass331_2619, class_ra, (this.cache), class432, i_127_, i_128_, i_129_, i_130_, i_131_, underwater, 0, 0, i, i_138_ + 4);
                    if (class365_sub1_sub3_sub2.method39()) {
                        class365_sub1_sub3_sub2.method33(class_ra);
                    }
                    if (class365_sub1_sub3_sub2_141_.method39()) {
                        class365_sub1_sub3_sub2_141_.method33(class_ra);
                    }
                    class365_sub1_sub3 = class365_sub1_sub3_sub2;
                    class365_sub1_sub3_140_ = class365_sub1_sub3_sub2_141_;
                } else {
                    Class365_Sub1_Sub3_Sub1 class365_sub1_sub3_sub1 = (new Class365_Sub1_Sub3_Sub1(aClass331_2619, class_ra, this.cache, class432, i_127_, i_128_, i_129_, i_130_, i_131_, underwater, i_139_ * anIntArray7074[i_125_], i_139_ * anIntArray7081[i_125_], i, i_125_ + 4, i_126_));
                    Class365_Sub1_Sub3_Sub1 class365_sub1_sub3_sub1_142_ = new Class365_Sub1_Sub3_Sub1(aClass331_2619, class_ra, (this.cache), class432, i_127_, i_128_, i_129_, i_130_, i_131_, underwater, 0, 0, i, 4 + i_138_, i_126_);
                    class365_sub1_sub3 = class365_sub1_sub3_sub1;
                    class365_sub1_sub3_140_ = class365_sub1_sub3_sub1_142_;
                }
                aClass331_2619.method4021(i_127_, i_132_, i_133_, class365_sub1_sub3, class365_sub1_sub3_140_, 1357750473);
                return true;
            }
            return false;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("aaa.cb(").append(')').toString());
        }
    }

    SceneObject method2241(int i, int i_143_, int i_144_, int i_145_) {
        try {
            SceneObject sceneObject = null;
            if (i_143_ == 0) {
                sceneObject = (SceneObject) aClass331_2619.method4031(i, i_144_, i_145_);
            }
            if (1 == i_143_) {
                sceneObject = (SceneObject) aClass331_2619.method4033(i, i_144_, i_145_);
            }
            if (i_143_ == 2) {
                sceneObject = ((SceneObject) aClass331_2619.method4035(i, i_144_, i_145_, GameClient.anInterface17_8960));
            }
            if (i_143_ == 3) {
                sceneObject = (SceneObject) aClass331_2619.method4058(i, i_144_, i_145_);
            }
            return sceneObject;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("aaa.cu(").append(')').toString());
        }
    }

    public final void method2242(GraphicsToolkit class_ra, boolean bool, int i) {
        try {
            aClass331_2619.method4037();
            if (!bool) {
                if (1551623871 * anInt2626 > 1) {
                    for (int i_147_ = 0; i_147_ < anInt2627 * -954368823; i_147_++) {
                        for (int i_148_ = 0; i_148_ < anInt2628 * 181474463; i_148_++) {
                            if (((aClass244_2635.flags[1][i_147_][i_148_]) & 0x2) == 2) {
                                aClass331_2619.method4011(i_147_, i_148_, -1135071672);
                            }
                        }
                    }
                }
                for (int i_149_ = 0; i_149_ < 1551623871 * anInt2626; i_149_++) {
                    for (int i_150_ = 0; i_150_ <= anInt2628 * 181474463; i_150_++) {
                        for (int i_151_ = 0; i_151_ <= anInt2627 * -954368823; i_151_++) {
                            if (((aByteArrayArrayArray2637[i_149_][i_151_][i_150_]) & 0x4) != 0) {
                                int i_152_ = i_151_;
                                int i_153_ = i_151_;
                                int i_154_ = i_150_;
                                int i_155_;
                                for (i_155_ = i_150_; (i_154_ > 0 && ((aByteArrayArrayArray2637[i_149_][i_151_][i_154_ - 1]) & 0x4) != 0 && i_155_ - i_154_ < 10); i_154_--) {
									/* empty */
                                }
                                for (/**/; (i_155_ < 181474463 * anInt2628 && ((aByteArrayArrayArray2637[i_149_][i_151_][i_155_ + 1]) & 0x4) != 0 && i_155_ - i_154_ < 10); i_155_++) {
									/* empty */
                                }
                                while_2_:
                                for (/**/; i_152_ > 0 && i_153_ - i_152_ < 10; i_152_--) {
                                    for (int i_156_ = i_154_; i_156_ <= i_155_; i_156_++) {
                                        if (((aByteArrayArrayArray2637[i_149_][i_152_ - 1][i_156_]) & 0x4) == 0) {
                                            if (i == 1773155741) {
                                                break while_2_;
                                            }
                                            return;
                                        }
                                    }
                                }
                                while_3_:
                                for (/**/; (i_153_ < anInt2627 * -954368823 && i_153_ - i_152_ < 10); i_153_++) {
                                    for (int i_157_ = i_154_; i_157_ <= i_155_; i_157_++) {
                                        if (((aByteArrayArrayArray2637[i_149_][i_153_ + 1][i_157_]) & 0x4) == 0) {
                                            if (i != 1773155741) {
												/* empty */
                                            }
                                            break while_3_;
                                        }
                                    }
                                }
                                if ((1 + (i_155_ - i_154_)) * (i_153_ - i_152_ + 1) >= 4) {
                                    int i_158_ = (anIntArrayArrayArray2653[i_149_][i_152_][i_154_]);
                                    aClass331_2619.aClass333_3512.method4070(4, i_149_, i_152_ << 9, (i_153_ << 9) + 512, i_154_ << 9, 512 + (i_155_ << 9), i_158_, i_158_);
                                    for (int i_159_ = i_152_; i_159_ <= i_153_; i_159_++) {
                                        for (int i_160_ = i_154_; i_160_ <= i_155_; i_160_++)
                                            aByteArrayArrayArray2637[i_149_][i_159_][i_160_] &= ~0x4;
                                    }
                                }
                            }
                        }
                    }
                }
                aClass331_2619.aClass333_3512.method4080();
            }
            aByteArrayArrayArray2637 = null;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("aaa.cp(").append(')').toString());
        }
    }

    final void method2243(GraphicsToolkit toolkit, int i, int plane, int localX, int localY, int objectID, int i_165_, int i_166_, Class289 class289, int i_167_) {
        if (plane < -1281303921 * this.plane) {
            this.plane = 272172143 * plane;
        }
        ObjectDefinition objectDefinition = this.cache.get(objectID);
        if (SettingsManager.settingsManager.textures.getValue() != TextureSetting.OFF || !objectDefinition.aBoolean5432) {
            int i_169_;
            int i_170_;
            if (1 == i_165_ || i_165_ == 3) {
                i_169_ = objectDefinition.sizeY * -565161399;
                i_170_ = objectDefinition.sizeX * -1125834887;
            } else {
                i_169_ = objectDefinition.sizeX * -1125834887;
                i_170_ = -565161399 * objectDefinition.sizeY;
            }
            int i_171_;
            int i_172_;
            if (i_169_ + localX <= -954368823 * anInt2627) {
                i_171_ = (i_169_ >> 1) + localX;
                i_172_ = (i_169_ + 1 >> 1) + localX;
            } else {
                i_171_ = localX;
                i_172_ = localX + 1;
            }
            int i_173_;
            int i_174_;
            if (i_170_ + localY <= 181474463 * anInt2628) {
                i_173_ = localY + (i_170_ >> 1);
                i_174_ = localY + (1 + i_170_ >> 1);
            } else {
                i_173_ = localY;
                i_174_ = 1 + localY;
            }
            FloorToolkit class_xa = aClass331_2619.aClass_xaArray3517[i];
            int i_175_ = ((class_xa.method6341(i_171_, i_173_) + class_xa.method6341(i_172_, i_173_) + class_xa.method6341(i_171_, i_174_) + class_xa.method6341(i_172_, i_174_)) >> 2);
            int i_176_ = (i_169_ << 8) + (localX << 9);
            int i_177_ = (i_170_ << 8) + (localY << 9);
            boolean bool = aBoolean2632 && !underwater && objectDefinition.aBoolean5385;
            if (objectDefinition.method5784()) {
                StaticMethods.method4884(plane, localX, localY, i_165_, objectDefinition, null, null);
            }
            boolean bool_178_ = (-1 == i_167_ && !objectDefinition.objectAnimationExists() && objectDefinition.objectIDs == null && !objectDefinition.aBoolean5381 && !objectDefinition.aBoolean5389);
            if (!aBoolean7084 || ((!Class82_Sub9.method900(i_166_, (byte) 13) || objectDefinition.anInt5376 * -1508517619 == 1) && (!Js5ArchiveEnum.method1236(i_166_, 1378507148) || 0 != -1508517619 * objectDefinition.anInt5376))) {
                if (i_166_ == -1976050083 * Class424.aClass424_6610.type) {
                    if ((SettingsManager.settingsManager.groundDecoration.getValue() != 0) || objectDefinition.anInt5382 * 1532834983 != 0 || -2144543407 * objectDefinition.clipType == 1 || objectDefinition.aBoolean5410) {
                        Class365_Sub1_Sub2 class365_sub1_sub2;
                        if (bool_178_) {
                            Class365_Sub1_Sub2_Sub2 class365_sub1_sub2_sub2 = (new Class365_Sub1_Sub2_Sub2(aClass331_2619, toolkit, this.cache, objectDefinition, plane, i, i_176_, i_175_, i_177_, underwater, i_165_, bool));
                            if (class365_sub1_sub2_sub2.method39()) {
                                class365_sub1_sub2_sub2.method33(toolkit);
                            }
                            class365_sub1_sub2 = class365_sub1_sub2_sub2;
                        } else {
                            class365_sub1_sub2 = (new Class365_Sub1_Sub2_Sub1(aClass331_2619, toolkit, this.cache, objectDefinition, plane, i, i_176_, i_175_, i_177_, underwater, i_165_, i_167_));
                        }
                        aClass331_2619.method4057(plane, localX, localY, class365_sub1_sub2, 1853221006);
                        if (1 == objectDefinition.clipType * -2144543407 && null != class289) {
                            class289.method2734(localX, localY, (byte) 2);
                        }
                    }
                } else if ((-1976050083 * Class424.aClass424_6611.type == i_166_) || i_166_ == -1976050083 * (Class424.aClass424_6604.type)) {
                    Class365_Sub1_Sub1_Sub6 class365_sub1_sub1_sub6 = null;
                    Class365_Sub1_Sub1 class365_sub1_sub1;
                    int i_179_;
                    if (bool_178_) {
                        Class365_Sub1_Sub1_Sub6 class365_sub1_sub1_sub6_180_ = (new Class365_Sub1_Sub1_Sub6(aClass331_2619, toolkit, this.cache, objectDefinition, plane, i, i_176_, i_175_, i_177_, underwater, localX, localX + i_169_ - 1, localY, i_170_ + localY - 1, i_166_, i_165_, bool));
                        i_179_ = class365_sub1_sub1_sub6_180_.method4493((short) 230);
                        class365_sub1_sub1 = class365_sub1_sub1_sub6_180_;
                        class365_sub1_sub1_sub6 = class365_sub1_sub1_sub6_180_;
                    } else {
                        class365_sub1_sub1 = (new Class365_Sub1_Sub1_Sub5(aClass331_2619, toolkit, this.cache, objectDefinition, plane, i, i_176_, i_175_, i_177_, underwater, localX, localX + i_169_ - 1, localY, localY + i_170_ - 1, i_166_, i_165_, i_167_));
                        i_179_ = 15;
                    }
                    if (aClass331_2619.method4022(class365_sub1_sub1, false, (byte) 0)) {
                        if (class365_sub1_sub1_sub6 != null && class365_sub1_sub1_sub6.method39()) {
                            class365_sub1_sub1_sub6.method33(toolkit);
                        }
                        if (objectDefinition.aBoolean5405 && aBoolean2632) {
                            if (i_179_ > 30) {
                                i_179_ = 30;
                            }
                            for (int i_181_ = 0; i_181_ <= i_169_; i_181_++) {
                                for (int i_182_ = 0; i_182_ <= i_170_; i_182_++)
                                    class_xa.LA(localX + i_181_, i_182_ + localY, i_179_);
                            }
                        }
                    }
                    if (objectDefinition.clipType * -2144543407 != 0 && null != class289) {
                        class289.method2741(localX, localY, i_169_, i_170_, objectDefinition.objectBlocksFly, !objectDefinition.objectBlocksWalkAlternative, (byte) 15);
                    }
                } else if (Js5ArchiveEnum.method1236(i_166_, -865214392) || VarDefinition.method1930(i_166_)) {
                    Class365_Sub1_Sub1 class365_sub1_sub1;
                    if (bool_178_) {
                        Class365_Sub1_Sub1_Sub6 class365_sub1_sub1_sub6 = (new Class365_Sub1_Sub1_Sub6(aClass331_2619, toolkit, this.cache, objectDefinition, plane, i, i_176_, i_175_, i_177_, underwater, localX, i_169_ + localX - 1, localY, i_170_ + localY - 1, i_166_, i_165_, bool));
                        if (class365_sub1_sub1_sub6.method39()) {
                            class365_sub1_sub1_sub6.method33(toolkit);
                        }
                        class365_sub1_sub1 = class365_sub1_sub1_sub6;
                    } else {
                        class365_sub1_sub1 = (new Class365_Sub1_Sub1_Sub5(aClass331_2619, toolkit, this.cache, objectDefinition, plane, i, i_176_, i_175_, i_177_, underwater, localX, localX + i_169_ - 1, localY, localY + i_170_ - 1, i_166_, i_165_, i_167_));
                    }
                    aClass331_2619.method4022(class365_sub1_sub1, false, (byte) 0);
                    if (aBoolean2632 && !underwater && Js5ArchiveEnum.method1236(i_166_, 1932287279) && (-1976050083 * Class424.aClass424_6602.type != i_166_) && plane > 0 && objectDefinition.anInt5376 * -1508517619 != 0) {
                        aByteArrayArrayArray2637[plane][localX][localY] |= 0x4;
                    }
                    if (0 != objectDefinition.clipType * -2144543407 && null != class289) {
                        class289.method2741(localX, localY, i_169_, i_170_, objectDefinition.objectBlocksFly, !objectDefinition.objectBlocksWalkAlternative, (byte) 4);
                    }
                } else if (method2239(toolkit, i_166_, i_165_, bool_178_, objectDefinition, i_167_, plane, i, i_176_, i_175_, i_177_, localX, localY, bool, class_xa, class289, i_169_, i_170_) || method2240(toolkit, i_166_, i_165_, bool_178_, objectDefinition, i_167_, plane, i, i_176_, i_175_, i_177_, localX, localY, -1189422227)) {
						/* empty */
                }
            }
        }
    }
}
