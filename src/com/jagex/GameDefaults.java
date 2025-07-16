package com.jagex;/* Class371 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.game.cache.config.prefetch.Js5List;

public class GameDefaults {
    public int defaultRootInter;
    public int maxHitsplats = 1238942292;
    public int[] anIntArray4033 = null;
    public int[] anIntArray4034 = null;
    public int anInt4035 = -39715579;
    public int npcChatOverheadDuration;
    public int playerChatOverheadDuration;
    public boolean aBoolean4038 = true;
    public short[][] aShortArrayArray4039;
    public boolean someNPCBoolean = true;
    public int backgroundInterface;
    public boolean somePlayerBoolean;
    public short[][][] aShortArrayArrayArray4044;
    public int loadScreenXOffset;
    public int loadScreenYOffset;

    public GameDefaults(Js5FileSystem class243) {
        npcChatOverheadDuration = 1703838282;
        somePlayerBoolean = true;
        playerChatOverheadDuration = -985193475;
        loadScreenXOffset = 618853911;
        loadScreenYOffset = 1051634129;
        byte[] is = class243.get((-363169051 * Class380.aClass380_4104.anInt4108));
        decodeGameDefaults(new Buffer(is));
    }

    static void readValueLoop(byte[] data) {
        Buffer buffer = new Buffer(data);
        for (; ; ) {
            int opcode = buffer.readUByte();
            if (opcode == 0) {
                break;
            }
            if (1 == opcode) {
                int i_17_ = buffer.readUShort();
                if (Class300.anInt3210 * 782166935 == -1)
                    Class300.anInt3210 = i_17_ * 154813479;
            }
        }
    }

    static void method4581(ScriptRuntime runtime) {
        runtime.integerStack[runtime.integerStackOffset * 681479919 - 2] = (Class316.aClass362_3318.getQuestType((runtime.integerStack[runtime.integerStackOffset * 681479919 - 2])).method4564(Class128.playerVarsProvider, (runtime.integerStack[681479919 * runtime.integerStackOffset - 1]))) ? 1 : 0;
        runtime.integerStackOffset -= -391880689;
    }

    static final void method4582(IComponentDefinition icomponentDefs, ScriptRuntime runtime) {
        String string = (String) (runtime.objectStack[(runtime.objectArgs -= 969361751) * -203050393]);
        if (Class298_Sub6.method2863(string, runtime) != null)
            string = string.substring(0, string.length() - 1);
        icomponentDefs.onMouseLeaveHook = Class128_Sub2.method1441(string, runtime);
        icomponentDefs.hasScript = true;
    }

    static final void method4583(ScriptRuntime runtime) {
        int i_9_ = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        int musicVolumeValue = SettingsManager.settingsManager.musicVolume.getValue();
        if (i_9_ != musicVolumeValue) {
            if (StaticMethods.method5804(GameClient.gameState * -1233866115)) {
                if (musicVolumeValue == 0 && -1256171511 * Class300.anInt3207 != -1) {
                    ItemDefinitionLoader.method6096(Js5List.JS5_MUSIC, -1256171511 * Class300.anInt3207, 0, i_9_, false);
                    StaticMethods.method344();
                    Class300.aBoolean3208 = false;
                } else if (i_9_ == 0) {
                    Class134.method1489((byte) -103);
                    Class300.aBoolean3208 = false;
                } else
                    Class70.method801(i_9_, -1911723714);
            }
            SettingsManager.settingsManager.setValue(SettingsManager.settingsManager.musicVolume, i_9_);
            ToMoveSettings.encodeBuffer();
            GameClient.sentPreferences = false;
        }
    }

    static void profileGraphics(int mode, String loadingBoxText, boolean bool) {
        Class16.method352();
        StaticMethods.method6053();
        StaticMethods.method2528();
        Class297.method2968(mode, loadingBoxText, bool);
        StaticMethods5.fonts.reset();
        StaticMethods5.fonts.load(GameClient.defaultFontRenderProvider);
        FontToolkit.method5744();
        StaticMedia.loadSprites(GameClient.activeGraphicsToolkit, Js5List.JS5_SPRITES);
        Class92.method1007();
        StaticMethods5.method1755(StaticMedia.nameIconSprites);
        StaticMethods.method4301();
        StaticMethods.method4294();
        if (GameClient.gameState * -1233866115 == 19)
            Class439.loadGameState(1);
        else if (14 == GameClient.gameState * -1233866115)
            Class439.loadGameState(15);
        else if (18 == -1233866115 * GameClient.gameState)
            Class439.loadGameState(16);
        else if (0 == -1233866115 * GameClient.gameState)
            Class439.loadGameState(17);
        else if (GameClient.gameState * -1233866115 == 11 || GameClient.gameState * -1233866115 == 7)
            Class234.method2175();
        else if (8 == GameClient.gameState * -1233866115)
            Class439.loadGameState(9);
    }

    static final void method4585(ScriptRuntime runtime) {
        int i_12_ = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        Class298_Sub37_Sub13 class298_sub37_sub13 = Class298_Sub7.method2864();
        if (class298_sub37_sub13 != null) {
            boolean bool = class298_sub37_sub13.method3453(i_12_ >> 28 & 0x3, i_12_ >> 14 & 0x3fff, i_12_ & 0x3fff, Class388.anIntArray4156);
            if (bool)
                Class118.method1293(Class388.anIntArray4156[1], Class388.anIntArray4156[2], -548972447);
        }
    }

    static final void method4586(ScriptRuntime runtime) {
        runtime.integerStackOffset -= -783761378;
        GameClient.aShort8923 = (short) (runtime.integerStack[runtime.integerStackOffset * 681479919]);
        if (GameClient.aShort8923 <= 0)
            GameClient.aShort8923 = (short) 256;
        GameClient.aShort8931 = (short) (runtime.integerStack[1 + 681479919 * runtime.integerStackOffset]);
        if (GameClient.aShort8931 <= 0)
            GameClient.aShort8931 = (short) 320;
    }

    void decodeGameDefaults(Buffer buffer) {
        try {
            boolean bool = false;
            for (; ; ) {
                int opcode = buffer.readUByte();
                if (0 == opcode) {
                    break;
                }
                if (1 == opcode) {
                    if (null == anIntArray4033) {
                        maxHitsplats = 1238942292;
                        anIntArray4033 = new int[4];
                        anIntArray4034 = new int[4];
                    }
                    for (int i_1_ = 0; i_1_ < anIntArray4033.length; i_1_++) {
                        anIntArray4033[i_1_] = buffer.readShort();
                        anIntArray4034[i_1_] = buffer.readShort();
                    }
                    bool = true;
                } else if (opcode == 2)
                    anInt4035 = buffer.readBigSmart() * 39715579;
                else if (opcode == 3) {
                    maxHitsplats = buffer.readUByte() * -1837748075;
                    anIntArray4033 = new int[-942466371 * maxHitsplats];
                    anIntArray4034 = new int[-942466371 * maxHitsplats];
                } else if (4 == opcode)
                    aBoolean4038 = false;
                else if (opcode == 5)
                    backgroundInterface = buffer.readUTriByte() * -990069469;
                else if (opcode == 6)
                    defaultRootInter = buffer.readUTriByte() * 1632959877;
                else if (7 == opcode) {
                    aShortArrayArray4039 = new short[10][4];
                    aShortArrayArrayArray4044 = new short[10][4][];
                    for (int i_2_ = 0; i_2_ < 10; i_2_++) {
                        for (int i_3_ = 0; i_3_ < 4; i_3_++) {
                            int i_4_ = buffer.readUShort();
                            if (i_4_ == 65535)
                                i_4_ = -1;
                            aShortArrayArray4039[i_2_][i_3_] = (short) i_4_;
                            int i_5_ = buffer.readUShort();
                            aShortArrayArrayArray4044[i_2_][i_3_] = new short[i_5_];
                            for (int i_6_ = 0; i_6_ < i_5_; i_6_++) {
                                int i_7_ = buffer.readUShort();
                                if (65535 == i_7_)
                                    i_7_ = -1;
                                aShortArrayArrayArray4044[i_2_][i_3_][i_6_] = (short) i_7_;
                            }
                        }
                    }
                } else if (opcode == 8)
                    someNPCBoolean = false;
                else if (9 == opcode)
                    npcChatOverheadDuration = buffer.readUByte() * 851919141;
                else if (10 == opcode)
                    somePlayerBoolean = false;
                else if (11 == opcode)
                    playerChatOverheadDuration = buffer.readUByte() * -328397825;
                else if (opcode == 12) {
                    loadScreenXOffset = buffer.readUShort() * -618853911;
                    loadScreenYOffset = buffer.readUShort() * -1051634129;
                } else if (opcode == 13) {
                    buffer.readUByte();
                    buffer.readUByte();
                    buffer.readUByte();
                    buffer.readUByte();
                    buffer.readUByte();
                }
            }
            if (!bool) {
                if (null == anIntArray4033) {
                    maxHitsplats = 1238942292;
                    anIntArray4033 = new int[4];
                    anIntArray4034 = new int[4];
                }
                for (int i_8_ = 0; i_8_ < anIntArray4033.length; i_8_++) {
                    anIntArray4033[i_8_] = 0;
                    anIntArray4034[i_8_] = i_8_ * 20;
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("pk.a(").append(')').toString());
        }
    }
}
