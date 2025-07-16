package com.jagex;/* Class365_Sub1_Sub5_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.maths.Matrix43f;

import java.awt.datatransfer.Clipboard;

public class Class365_Sub1_Sub5_Sub2 extends Class365_Sub1_Sub5 implements SceneObject {
    public static Clipboard aClipboard9941;
    static int[] anIntArray9937 = {1, 2, 4, 8};
    static int[] anIntArray9938 = {16, 32, 64, 128};
    static Stream aStream_9940;
    public Class60 aClass60_9935;
    Class334 aClass334_9934;
    boolean aBoolean9936;
    boolean aBoolean9939 = true;

    public Class365_Sub1_Sub5_Sub2(Region class331, GraphicsToolkit class_ra, ObjectDefinitionLoader class433, ObjectDefinition class432, int i, int i_11_, int i_12_, int i_13_, int i_14_, boolean bool, int i_15_, int i_16_, int i_17_) {
        super(class331, i_12_, i_13_, i_14_, i, i_11_, StaticMethods.method4263(i_15_, i_16_));
        aClass60_9935 = new Class60(class_ra, class433, class432, i_15_, i_16_, plane, i_11_, this, bool, i_17_);
        this.aBoolean9936 = 0 != 1532834983 * class432.anInt5382 && !bool;
        method4362(1);
    }

    static final void method4534(ScriptRuntime runtime) {
        try {
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = SettingsManager.settingsManager.water.method5641() ? 1 : 0;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wr.any(").append(')').toString());
        }
    }

    static final void method4535(ScriptRuntime class403) {
        try {
            class403.integerStackOffset -= -783761378;
            int i_29_ = (class403.integerStack[class403.integerStackOffset * 681479919]);
            boolean bool = ((class403.integerStack[class403.integerStackOffset * 681479919 + 1]) == 1);
            if (Class301_Sub1.aClass437_7636 != null) {
                Node class298 = Class301_Sub1.aClass437_7636.get((long) i_29_);
                if (class298 != null && !bool)
                    class298.unlink();
                else if (class298 == null && bool) {
                    class298 = new Node();
                    Class301_Sub1.aClass437_7636.connect(class298, (long) i_29_);
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wr.aeh(").append(')').toString());
        }
    }

    static final void method4536(RsBitsBuffer bitsBuffer) {
            int i_30_ = 0;
            bitsBuffer.initBitAccess();
            for (int i_31_ = 0; i_31_ < 1168366243 * Class10.entitiesInRegion; i_31_++) {
                int i_32_ = Class10.players[i_31_];
                if (0 == (Class10.aByteArray131[i_32_] & 0x1)) {
                    if (i_30_ > 0) {
                        i_30_--;
                        Class10.aByteArray131[i_32_] |= 0x2;
                    } else {
                        int i_33_ = bitsBuffer.readBits(1);
                        if (0 == i_33_) {
                            i_30_ = Class127_Sub3.method1431(bitsBuffer, 2074736782);
                            Class10.aByteArray131[i_32_] |= 0x2;
                        } else
                            StaticMethods.method6221(bitsBuffer, i_32_);
                    }
                }
            }
            bitsBuffer.finishBitAccess();
            if (i_30_ != 0)
                throw new RuntimeException();
            bitsBuffer.initBitAccess();
            for (int i_34_ = 0; i_34_ < Class10.entitiesInRegion * 1168366243; i_34_++) {
                int i_35_ = Class10.players[i_34_];
                if (0 != (Class10.aByteArray131[i_35_] & 0x1)) {
                    if (i_30_ > 0) {
                        i_30_--;
                        Class10.aByteArray131[i_35_] |= 0x2;
                    } else {
                        int i_36_ = bitsBuffer.readBits(1);
                        if (i_36_ == 0) {
                            i_30_ = Class127_Sub3.method1431(bitsBuffer, 2076159127);
                            Class10.aByteArray131[i_35_] |= 0x2;
                        } else
                            StaticMethods.method6221(bitsBuffer, i_35_);
                    }
                }
            }
            bitsBuffer.finishBitAccess();
            if (0 != i_30_)
                throw new RuntimeException();
            bitsBuffer.initBitAccess();
            for (int i_37_ = 0; i_37_ < 1430471535 * Class10.anInt130; i_37_++) {
                int i_38_ = Class10.entities[i_37_];
                if ((Class10.aByteArray131[i_38_] & 0x1) != 0) {
                    if (i_30_ > 0) {
                        i_30_--;
                        Class10.aByteArray131[i_38_] |= 0x2;
                    } else {
                        int i_39_ = bitsBuffer.readBits(1);
                        if (0 == i_39_) {
                            i_30_ = Class127_Sub3.method1431(bitsBuffer, 2121776092);
                            Class10.aByteArray131[i_38_] |= 0x2;
                        } else if (ClassNotAnim.method6229(bitsBuffer, i_38_))
                            Class10.aByteArray131[i_38_] |= 0x2;
                    }
                }
            }
            bitsBuffer.finishBitAccess();
            if (0 != i_30_)
                throw new RuntimeException();
            bitsBuffer.initBitAccess();
            for (int i_40_ = 0; i_40_ < Class10.anInt130 * 1430471535; i_40_++) {
                int i_41_ = Class10.entities[i_40_];
                if ((Class10.aByteArray131[i_41_] & 0x1) == 0) {
                    if (i_30_ > 0) {
                        i_30_--;
                        Class10.aByteArray131[i_41_] |= 0x2;
                    } else {
                        int i_42_ = bitsBuffer.readBits(1);
                        if (i_42_ == 0) {
                            i_30_ = Class127_Sub3.method1431(bitsBuffer, 2129494225);
                            Class10.aByteArray131[i_41_] |= 0x2;
                        } else if (ClassNotAnim.method6229(bitsBuffer, i_41_))
                            Class10.aByteArray131[i_41_] |= 0x2;
                    }
                }
            }
            bitsBuffer.finishBitAccess();
            if (i_30_ != 0)
                throw new RuntimeException();
            Class10.entitiesInRegion = 0;
            Class10.anInt130 = 0;
            for (int playerIndex = 1; playerIndex < 2048; playerIndex++) {
                Class10.aByteArray131[playerIndex] >>= 1;
                Player player = GameClient.entities[playerIndex];
                if (null != player)
                    Class10.players[(Class10.entitiesInRegion += -656365301) * 1168366243 - 1] = playerIndex;
                else
                    Class10.entities[(Class10.anInt130 += 854162319) * 1430471535 - 1] = playerIndex;
            }
    }

    public static Class343_Sub1 method4537() {
        try {
            if (Class474.anInt5977 * 1056867697 < Class474.aClass343_Sub1Array5975.length)
                return (Class474.aClass343_Sub1Array5975[(Class474.anInt5977 += -700736623) * 1056867697 - 1]);
            return null;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wr.k(").append(')').toString());
        }
    }

    public void method33(GraphicsToolkit toolkit) {
        aClass60_9935.method702(toolkit);
    }

    boolean method4376() {
        return this.aBoolean9939;
    }

    public Class334 method4358(GraphicsToolkit toolkit) {
        return this.aClass334_9934;
    }

    public int method4361() {
        return aClass60_9935.method705();
    }

    public void method4530(Class435 class435) {
        aClass60_9935.method698(class435);
    }

    Class335 method4394(GraphicsToolkit graphicsToolkit) {
        ModelToolkit modelToolkit = aClass60_9935.method700(graphicsToolkit, 2048, false, true);
        if (modelToolkit == null)
            return null;
        Matrix43f class222 = method4347();
        Class235 class235 = getWorldTransform();
        Class335 class335 = StaticMethods.method818((this.aBoolean9936));
        aClass60_9935.method701(graphicsToolkit, modelToolkit, class222, true);
        modelToolkit.render(class222, aClass302_Sub1Array7726[0], 0);
        if (null != aClass60_9935.aParticleSystem_602) {
            Class69 class69 = aClass60_9935.aParticleSystem_602.method4229();
            graphicsToolkit.renderParticles(class69);
        }
        this.aBoolean9939 = (modelToolkit.i() || null != aClass60_9935.aParticleSystem_602);
        if (null == this.aClass334_9934)
            this.aClass334_9934 = Class472.method6063((int) (class235.trans.x), (int) (class235.trans.y), (int) (class235.trans.z), modelToolkit);
        else
            Class264_Sub2.method2507(this.aClass334_9934, (int) class235.trans.x, (int) class235.trans.y, (int) class235.trans.z, modelToolkit);
        return class335;
    }

    void method4357(GraphicsToolkit graphicsToolkit, int i) {
        ModelToolkit modelToolkit = aClass60_9935.method700(graphicsToolkit, 262144, true, true);
        if (modelToolkit != null) {
            Matrix43f class222 = method4347();
            aClass60_9935.method701(graphicsToolkit, modelToolkit, class222, false);
        }
    }

    final void method4355(GraphicsToolkit graphicsToolkit, Class365_Sub1 class365_sub1, int i, int i_6_, int i_7_, boolean bool) {
        throw new IllegalStateException();
    }

    public int method4363() {
        return aClass60_9935.method699();
    }

    public int method29() {
        return -1598457753 * aClass60_9935.anInt589;
    }

    public int method30() {
        return 748228569 * aClass60_9935.anInt590;
    }

    public void method31() {
            /* empty */
    }

    public boolean method39() {
            return aClass60_9935.method706();
    }

    public void method37(GraphicsToolkit toolkit) {
            aClass60_9935.method707();
    }

    boolean method4399() {
            return false;
    }

    final boolean method4366() {
            return false;
    }

    public int getID() {
            return aClass60_9935.fileID * 1686561661;
    }

    boolean method4350(GraphicsToolkit graphicsToolkit, int i, int i_23_, byte i_24_) {
            ModelToolkit modelToolkit = aClass60_9935.method700(graphicsToolkit, 131072, false, false);
            if (modelToolkit == null)
                return false;
            return modelToolkit.method4787(i, i_23_, method4347(), false, 0);
    }

    final void method4398() {
            throw new IllegalStateException();
    }
}
