package com.jagex;/* Class467 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class467 {
    Class467() throws Throwable {
        throw new Error();
    }

    static final void method6023(int i) {
        try {
            RsBitsBuffer class298_sub53_sub2 = ConnectionType.gameConnection.bitsBuffer;
            class298_sub53_sub2.initBitAccess();
            int i_0_ = class298_sub53_sub2.readBits(8);
            if (i_0_ < GameClient.entitySize * -1230451913) {
                for (int i_1_ = i_0_; i_1_ < -1230451913 * GameClient.entitySize; i_1_++)
                    GameClient.anIntArray8709[(GameClient.anInt8708 += 107511579) * -1508392173 - 1] = GameClient.entityKeys[i_1_];
            }
            if (i_0_ > GameClient.entitySize * -1230451913) {
                throw new RuntimeException();
            }
            GameClient.entitySize = 0;
            for (int i_2_ = 0; i_2_ < i_0_; i_2_++) {
                int i_3_ = GameClient.entityKeys[i_2_];
                NPC class365_sub1_sub1_sub2_sub1 = ((NPC) (((ObjectNode) GameClient.entityList.get((long) i_3_)).nodeObject));
                int i_4_ = class298_sub53_sub2.readBits(1);
                if (i_4_ == 0) {
                    GameClient.entityKeys[(GameClient.entitySize += -409937273) * -1230451913 - 1] = i_3_;
                    class365_sub1_sub1_sub2_sub1.anInt10075 = -3704423 * GameClient.anInt8707;
                } else {
                    int i_5_ = class298_sub53_sub2.readBits(2);
                    if (0 == i_5_) {
                        GameClient.entityKeys[((GameClient.entitySize += -409937273) * -1230451913) - 1] = i_3_;
                        class365_sub1_sub1_sub2_sub1.anInt10075 = -3704423 * GameClient.anInt8707;
                        GameClient.anIntArray8706[(GameClient.anInt8808 += -386992021) * -976358333 - 1] = i_3_;
                    } else if (1 == i_5_) {
                        GameClient.entityKeys[((GameClient.entitySize += -409937273) * -1230451913) - 1] = i_3_;
                        class365_sub1_sub1_sub2_sub1.anInt10075 = GameClient.anInt8707 * -3704423;
                        Class274 class274 = ((Class274) (StaticMethods.method5701(Class299.method3680(-2130206915), class298_sub53_sub2.readBits(3))));
                        class365_sub1_sub1_sub2_sub1.method4455(class274, Class282.aClass282_6540.aByte6542, (short) 32767);
                        int i_6_ = class298_sub53_sub2.readBits(1);
                        if (1 == i_6_) {
                            GameClient.anIntArray8706[((GameClient.anInt8808 += -386992021) * -976358333 - 1)] = i_3_;
                        }
                    } else if (i_5_ == 2) {
                        GameClient.entityKeys[((GameClient.entitySize += -409937273) * -1230451913) - 1] = i_3_;
                        class365_sub1_sub1_sub2_sub1.anInt10075 = -3704423 * GameClient.anInt8707;
                        if (class298_sub53_sub2.readBits(1) == 1) {
                            Class274 class274 = ((Class274) (StaticMethods.method5701(Class299.method3680(-2113999549), class298_sub53_sub2.readBits(3))));
                            class365_sub1_sub1_sub2_sub1.method4455(class274, Class282.aClass282_6541.aByte6542, (short) 32767);
                            Class274 class274_7_ = ((Class274) (StaticMethods.method5701(Class299.method3680(-1890825389), class298_sub53_sub2.readBits(3))));
                            class365_sub1_sub1_sub2_sub1.method4455(class274_7_, Class282.aClass282_6541.aByte6542, (short) 32767);
                        } else {
                            Class274 class274 = ((Class274) (StaticMethods.method5701(Class299.method3680(-2012553016), class298_sub53_sub2.readBits(3))));
                            class365_sub1_sub1_sub2_sub1.method4455(class274, Class282.aClass282_6545.aByte6542, (short) 32767);
                        }
                        int i_8_ = class298_sub53_sub2.readBits(1);
                        if (1 == i_8_) {
                            GameClient.anIntArray8706[((GameClient.anInt8808 += -386992021) * -976358333 - 1)] = i_3_;
                        }
                    } else if (i_5_ == 3) {
                        GameClient.anIntArray8709[(GameClient.anInt8708 += 107511579) * -1508392173 - 1] = i_3_;
                    }
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("tg.jn(").append(')').toString());
        }
    }

    static final void method6024(ScriptRuntime runtime) {

        int scriptID = (runtime.integerstack[1883543357 * runtime.integerPos]);
        CS2ScriptDefinition scriptDefinition = CS2ScriptDefinition.getClientScript(scriptID);
        if (null == scriptDefinition) {
            throw new RuntimeException();
        }
        int[] ints = new int[scriptDefinition.maxIntLocals * -1516159487];
        Object[] objects = new Object[1787035509 * scriptDefinition.maxObjectLocals];
        long[] longs = new long[scriptDefinition.maxLongLocals * 1679522843];
        for (int index = 0; index < scriptDefinition.intArgs * -1249619929; index++)
            ints[index] = (runtime.integerStack[(681479919 * runtime.integerStackOffset - -1249619929 * scriptDefinition.intArgs + index)]);
        for (int index = 0; index < 2027436935 * scriptDefinition.objectArgs; index++)
            objects[index] = (runtime.objectStack[(index + (-203050393 * runtime.objectArgs - 2027436935 * scriptDefinition.objectArgs))]);
        for (int index = 0; index < scriptDefinition.longArgs * -1520504699; index++)
            longs[index] = (runtime.longStacks[(index + (1685767703 * runtime.longArgs - scriptDefinition.longArgs * -1520504699))]);
        runtime.integerStackOffset -= -238333367 * scriptDefinition.intArgs;
        runtime.objectArgs -= 258390497 * scriptDefinition.objectArgs;
        runtime.longArgs -= scriptDefinition.longArgs * 1071348675;
        CS2CallStackEntry callStackEntry = new CS2CallStackEntry();
        callStackEntry.script = runtime.script;
        callStackEntry.integerPos = -985206291 * runtime.integerPos;
        callStackEntry.integerLocals = runtime.integerLocals;
        callStackEntry.objectLocals = runtime.objectLocals;
        callStackEntry.longLocals = runtime.longLocals;
        if (runtime.stackIndex * -932179775 >= runtime.callStack.length) {
            throw new RuntimeException();
        }
        runtime.callStack[((runtime.stackIndex += 373063489) * -932179775 - 1)] = callStackEntry;
        runtime.script = scriptDefinition;
        runtime.instruction = (runtime.script.instruction);
        runtime.integerstack = (runtime.script.intOperands);
        runtime.integerPos = -286750741;
        runtime.integerLocals = ints;
        runtime.objectLocals = objects;
        runtime.longLocals = longs;
    }
}
