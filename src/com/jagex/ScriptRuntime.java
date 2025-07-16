package com.jagex;/* Class403 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;

public class ScriptRuntime {
    static EventQueue anEventQueue5262;
    SceneObject anSceneObject_5233;
    int[] arrayLengths = new int[5];
    int[][] arrays = new int[5][5000];
    ClanChannelChat clanChannelChat;
    Object[] objectLocals;
    Object[] objectStack;
    Entity entity;
    Class177 aClass177_5243;
    int[] integerLocals;
    CS2CallStackEntry[] callStack;
    int stackIndex;
    long[] longLocals;
    long[] longStacks;
    Class162 aClass162_5252;
    Class365_Sub1_Sub4_Sub1 aClass365_Sub1_Sub4_Sub1_5253;
    int objectArgs;
    int longArgs;
    IComponentScripter aIComponentScripter_5246;
    IComponentScripter aIComponentScripter_5247;
    int anInt5254;
    int playerIndex;
    Class214 aClass214_5256;
    int[] integerStack = new int[1000];
    int integerStackOffset;
    int[] integerstack;
    int integerPos;
    CS2Instruction[] instruction;
    CS2ScriptDefinition script;
    boolean currentInstrBool;

    ScriptRuntime() {
        this.integerStackOffset = 0;
        this.objectStack = new Object[1000];
        this.objectArgs = 0;
        this.longStacks = new long[1000];
        this.longArgs = 0;
        this.stackIndex = 0;
        this.callStack = new CS2CallStackEntry[50];
        this.aIComponentScripter_5246 = new IComponentScripter();
        this.aIComponentScripter_5247 = new IComponentScripter();
        this.anInt5254 = 0;
        this.integerPos = -286750741;
    }

    static final void method4945(ScriptRuntime runtime) {
        if (-932179775 * runtime.stackIndex != 0) {
            CS2CallStackEntry entry = (runtime.callStack[(runtime.stackIndex -= 373063489) * -932179775]);
            runtime.script = entry.script;
            runtime.instruction = (runtime.script.instruction);
            runtime.integerstack = (runtime.script.intOperands);
            runtime.integerPos = entry.integerPos * -2092362779;
            runtime.integerLocals = entry.integerLocals;
            runtime.objectLocals = entry.objectLocals;
            runtime.longLocals = entry.longLocals;
        }
    }
}
