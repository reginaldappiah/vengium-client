package com.jagex;/* Class413 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.game.cache.config.quest.QuestType;

public class Class413 implements Interface21 {
    public static Class413 aClass413_6576;
    public static Class413 aClass413_6584 = new Class413(-2);
    public static Class413 aClass413_6587;
    public static int anInt6590;
    static Class413 aClass413_6575;
    static Class413 aClass413_6577;
    static Class413 aClass413_6578;
    static Class413 aClass413_6579;
    static Class413 aClass413_6580;
    static Class413 aClass413_6581;
    static Class413 aClass413_6582;
    static Class413 aClass413_6583;
    static Class413 aClass413_6585;
    static Class413 aClass413_6586;
    static Class413 aClass413_6588;

    static {
        aClass413_6576 = new Class413(-3);
        aClass413_6577 = new Class413(2);
        aClass413_6587 = new Class413(3);
        aClass413_6579 = new Class413(9);
        aClass413_6580 = new Class413(10);
        aClass413_6581 = new Class413(20);
        aClass413_6578 = new Class413(21);
        aClass413_6588 = new Class413(30);
        aClass413_6575 = new Class413(31);
        aClass413_6585 = new Class413(32);
        aClass413_6583 = new Class413(33);
        aClass413_6586 = new Class413(34);
        aClass413_6582 = new Class413(38);
    }

    int anInt6589;

    Class413(int i) {
        this.anInt6589 = i * -548304903;
    }

    static void method5582(ScriptRuntime runtime) {
        QuestType questType = Class316.aClass362_3318.getQuestType((runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]));
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = (questType.requiredVarpsID == null ? 0 : questType.requiredVarpsID.length);
    }

    public static boolean method5584(int i) {
        return (19 == i || 1 == i || 4 == i || i == 3 || i == 8 || 2 == i || i == 9);
    }

    public int getID() {
        return 1997834825 * this.anInt6589;
    }

    public int method243() {
        return 1997834825 * this.anInt6589;
    }

    public int method244() {
        return 1997834825 * this.anInt6589;
    }
}
