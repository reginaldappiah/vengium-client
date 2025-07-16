package com.jagex;/* Class70 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class70 {
    int anInt682;
    LinkedList aClass437_683;

    Class70(int i) {
        this.anInt682 = -1382335519 * i;
    }

    public static void method801(int i, int i_6_) {
        try {
            if (617004265 * Class79.anInt734 != 0)
                Class79.anInt739 = i * -2102749749;
            else
                Class79.aClass298_Sub19_Sub1_737.method2961(i);
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("cv.k(").append(')').toString());
        }
    }

    static void method802(GraphicsToolkit class_ra, int i, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_, int i_13_) {
        try {
            Region class331 = GameClient.myRegion.getRegion();
            SceneObject sceneObject = (SceneObject) class331.method4031(i, i_7_, i_8_);
            if (null != sceneObject) {
                ObjectDefinition class432 = (GameClient.myRegion.getObjectDefinitionLoader().get(sceneObject.getID()));
                int i_14_ = sceneObject.method30() & 0x3;
                int i_15_ = sceneObject.method29();
                if (-1 != -1204256389 * class432.anInt5400)
                    StaticMethods.method871(class_ra, class432, i_14_, i_9_, i_10_);
                else {
                    int i_16_ = i_11_;
                    if (1532834983 * class432.anInt5382 > 0)
                        i_16_ = i_12_;
                    if ((i_15_ == -1976050083 * Class424.aClass424_6614.type) || (-1976050083 * Class424.aClass424_6593.type == i_15_)) {
                        if (i_14_ == 0)
                            class_ra.method5035(i_9_, i_10_, 4, i_16_);
                        else if (1 == i_14_)
                            class_ra.method4990(i_9_, i_10_, 4, i_16_);
                        else if (2 == i_14_)
                            class_ra.method5035(i_9_ + 3, i_10_, 4, i_16_);
                        else if (i_14_ == 3)
                            class_ra.method4990(i_9_, 3 + i_10_, 4, i_16_);
                    }
                    if (i_15_ == -1976050083 * Class424.aClass424_6594.type) {
                        if (0 == i_14_)
                            class_ra.fillRectangle(i_9_, i_10_, 1, 1, i_16_);
                        else if (1 == i_14_)
                            class_ra.fillRectangle(i_9_ + 3, i_10_, 1, 1, i_16_);
                        else if (i_14_ == 2)
                            class_ra.fillRectangle(i_9_ + 3, i_10_ + 3, 1, 1, i_16_);
                        else if (3 == i_14_)
                            class_ra.fillRectangle(i_9_, 3 + i_10_, 1, 1, i_16_);
                    }
                    if (Class424.aClass424_6593.type * -1976050083 == i_15_) {
                        if (i_14_ == 0)
                            class_ra.method4990(i_9_, i_10_, 4, i_16_);
                        else if (i_14_ == 1)
                            class_ra.method5035(3 + i_9_, i_10_, 4, i_16_);
                        else if (i_14_ == 2)
                            class_ra.method4990(i_9_, i_10_ + 3, 4, i_16_);
                        else if (i_14_ == 3)
                            class_ra.method5035(i_9_, i_10_, 4, i_16_);
                    }
                }
            }
            sceneObject = (SceneObject) class331.method4035(i, i_7_, i_8_, GameClient.anInterface17_8960);
            if (null != sceneObject) {
                ObjectDefinition class432 = (GameClient.myRegion.getObjectDefinitionLoader().get(sceneObject.getID()));
                int i_17_ = sceneObject.method30() & 0x3;
                int i_18_ = sceneObject.method29();
                if (-1204256389 * class432.anInt5400 != -1)
                    StaticMethods.method871(class_ra, class432, i_17_, i_9_, i_10_);
                else if (Class424.aClass424_6595.type * -1976050083 == i_18_) {
                    int i_19_ = -1118482;
                    if (1532834983 * class432.anInt5382 > 0)
                        i_19_ = -1179648;
                    if (i_17_ == 0 || i_17_ == 2)
                        class_ra.drawDiagnolLine(i_9_, 3 + i_10_, i_9_ + 3, i_10_, i_19_);
                    else
                        class_ra.drawDiagnolLine(i_9_, i_10_, 3 + i_9_, 3 + i_10_, i_19_);
                }
            }
            sceneObject = (SceneObject) class331.method4058(i, i_7_, i_8_);
            if (null != sceneObject) {
                ObjectDefinition class432 = (GameClient.myRegion.getObjectDefinitionLoader().get(sceneObject.getID()));
                int i_20_ = sceneObject.method30() & 0x3;
                if (-1 != -1204256389 * class432.anInt5400)
                    StaticMethods.method871(class_ra, class432, i_20_, i_9_, i_10_);
            }
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("cv.u(").append(')').toString());
        }
    }

    public static void method803(int cutsceneID, String string, int i_21_) {
        CS2ScriptDefinition scriptDefinition = CS2ScriptDefinition.lookup(CS2Context.aClass502_6724, cutsceneID, -1);
        if (scriptDefinition != null) {
            ScriptRuntime runtime = ToMoveScripts.method1950();
            runtime.integerLocals = new int[scriptDefinition.maxIntLocals * -1516159487];
            runtime.objectLocals = new String[scriptDefinition.maxObjectLocals * 1787035509];
            runtime.objectLocals[0] = string;
            runtime.integerLocals[0] = i_21_;
            ClientScriptsExecutor.executeScript(scriptDefinition, 200000, runtime);
        }
    }

    public static int method804(int i, int i_23_, short i_24_) {
        try {
            int i_25_ = 1;
            for (/**/; i_23_ > 1; i_23_ >>= 1) {
                if (0 != (i_23_ & 0x1))
                    i_25_ *= i;
                i *= i;
            }
            if (1 == i_23_)
                return i_25_ * i;
            return i_25_;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("cv.a(").append(')').toString());
        }
    }

    static void method805(byte i) {
        try {
            Class525.aClass486_6298 = Js5CacheWrite.aClass486_6060;
            Class525.aClass412_6299 = Class412.aClass412_6565;
            Class357.aClass413_3845 = Class413.aClass413_6584;
            Class378.aClass428_4094 = Class428.aClass428_6618;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("cv.f(").append(')').toString());
        }
    }

    public static void method806(Js5FileSystem class243, byte i) {
        try {
            Class74.containerID = class243.getArchiveIdByName("p11_full") * 1133798363;
            Class74.anInt690 = class243.getArchiveIdByName("p12_full") * 399685195;
            Class74.anInt698 = class243.getArchiveIdByName("b12_full") * 1666679073;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("cv.a(").append(')').toString());
        }
    }

    public static final int method807(int i, int i_26_, int i_27_, int i_28_, int i_29_, byte i_30_) {
        try {
            if (GameClient.myRegion.getRegion() == null)
                return 0;
            if (i_29_ < 3) {
                Class244 class244 = GameClient.myRegion.method2654();
                int i_31_ = i >> 9;
                int i_32_ = i_26_ >> 9;
                if (i_27_ < 0 || i_28_ < 0 || (i_27_ > GameClient.myRegion.getMapWidth() - 1) || i_28_ > GameClient.myRegion.getMapLength() - 1)
                    return 0;
                if (i_31_ < 1 || i_32_ < 1 || (i_31_ > GameClient.myRegion.getMapWidth() - 1) || (i_32_ > GameClient.myRegion.getMapLength() - 1))
                    return 0;
                boolean bool = 0 != ((class244.flags[1][i >> 9][i_26_ >> 9]) & 0x2);
                if ((i & 0x1ff) == 0) {
                    boolean bool_33_ = (((class244.flags[1][i_31_ - 1][i_26_ >> 9]) & 0x2) != 0);
                    boolean bool_34_ = 0 != ((class244.flags[1][i_31_][i_26_ >> 9]) & 0x2);
                    if (bool_34_ != bool_33_)
                        bool = 0 != ((class244.flags[1][i_27_][i_28_]) & 0x2);
                }
                if ((i_26_ & 0x1ff) == 0) {
                    boolean bool_35_ = (((class244.flags[1][i >> 9][i_32_ - 1]) & 0x2) != 0);
                    boolean bool_36_ = ((class244.flags[1][i >> 9][i_32_] & 0x2) != 0);
                    if (bool_36_ != bool_35_)
                        bool = ((class244.flags[1][i_27_][i_28_]) & 0x2) != 0;
                }
                if (bool)
                    i_29_++;
            }
            return GameClient.myRegion.getRegion().aClass_xaArray3517[i_29_].method6340(i, i_26_);
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("cv.ja(").append(')').toString());
        }
    }

    public void method797(byte i) {
        try {
            if (this.aClass437_683 != null)
                this.aClass437_683.clear();
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("cv.a(").append(')').toString());
        }
    }

    public int method798(int i) {
            IntNode intNode = ((IntNode) this.aClass437_683.get((long) i));
            if (null != intNode)
                return intNode.capacity * -774922497;
            VarDefinition varDefinition = Class440.aClass205_5582.get(i);
            if ('i' != varDefinition.aChar2358)
                return -1;
            return 0;
    }

    public int method799(int i, int i_1_) {
        try {
            ConfigDefinitions class327 = Class472.configLoader.getConfigDefinitions(i);
            int i_2_ = -50358139 * class327.realConfigID;
            int i_3_ = (31 == class327.endingBit * 1394539663 ? -1 : (1 << 1 + class327.endingBit * 1394539663) - 1);
            return ((method798(i_2_) & i_3_) >>> -1528472107 * class327.startingBit);
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("cv.p(").append(')').toString());
        }
    }

    public void method800(int i, int i_4_, byte i_5_) {
        try {
            if (this.aClass437_683 == null)
                this.aClass437_683 = new LinkedList(1793476641 * this.anInt682);
            IntNode class298_sub35 = ((IntNode) this.aClass437_683.get((long) i));
            if (null != class298_sub35)
                class298_sub35.capacity = i_4_ * -898670337;
            else {
                class298_sub35 = new IntNode(i_4_);
                this.aClass437_683.connect(class298_sub35, (long) i);
            }
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("cv.f(").append(')').toString());
        }
    }
}
