package com.jagex;/* Class231 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class231 {

    static void method2128(ScriptRuntime runtime) {
        try {
            runtime.integerStack[runtime.integerStackOffset * 681479919 - 1] = (Class316.aClass362_3318.getQuestType((runtime.integerStack[runtime.integerStackOffset * 681479919 - 1])).method4569(Class128.playerVarsProvider) ? 1 : 0);
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("jt.q(").append(')').toString());
        }
    }

    static final void setRoofFlags(byte flag) {
        byte[][][] roofFlags = GameClient.myRegion.getRoofFlags();
        if (roofFlags == null) {
            roofFlags = (new byte[4][GameClient.myRegion.getMapWidth()][GameClient.myRegion.getMapLength()]);
            GameClient.myRegion.setRoofFlags(roofFlags);
        }
        for (int plane = 0; plane < 4; plane++) {
            for (int regionX = 0; regionX < GameClient.myRegion.getMapWidth(); regionX++) {
                for (int regionY = 0; regionY < GameClient.myRegion.getMapLength(); regionY++)
                    roofFlags[plane][regionX][regionY] = flag;
            }
        }
    }

    static final void method2133(ScriptRuntime class403, int i) {
        try {
            class403.integerStackOffset -= -783761378;
            int i_4_ = (class403.integerStack[681479919 * class403.integerStackOffset]);
            int i_5_ = (class403.integerStack[class403.integerStackOffset * 681479919 + 1]);
            if (Player.myPlayer.appearance != null)
                Player.myPlayer.appearance.setColor(i_4_, i_5_);
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("jt.co(").append(')').toString());
        }
    }

    static final void method2134(ScriptRuntime runtime) {
        try {
            int i_6_ = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
            if (GameClient.anInt8942 * 1131012101 == 2 && i_6_ < -1054937867 * GameClient.anInt8941) {
                runtime.objectStack[((runtime.objectArgs += 969361751) * -203050393) - 1] = GameClient.playerAccountNames[i_6_];
                if (GameClient.aStringArray8945[i_6_] != null)
                    runtime.objectStack[((runtime.objectArgs += 969361751) * -203050393) - 1] = GameClient.aStringArray8945[i_6_];
                else
                    runtime.objectStack[((runtime.objectArgs += 969361751) * -203050393) - 1] = "";
            } else {
                runtime.objectStack[((runtime.objectArgs += 969361751) * -203050393) - 1] = "";
                runtime.objectStack[((runtime.objectArgs += 969361751) * -203050393) - 1] = "";
            }
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("jt.vp(").append(')').toString());
        }
    }
}
