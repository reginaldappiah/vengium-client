package com.jagex;

import com.jagex.game.cache.config.Js5Configs;
import com.jagex.game.cache.config.prefetch.Js5List;
import com.jagex.game.settings.*;
import com.jagex.network.OutgoingPacket;
import com.jagex.utils.CameraUtils;
import com.jagex.utils.ColorUtils;
import com.jagex.utils.StringUtils;
import com.jagex.utils.TimeUtils;

import java.io.File;

/**
 * Created by Krimsonowl on 7/9/2017.
 */
public class ToMoveScripts {
    static final void method2909(ScriptRuntime runtime) {
        try {
            int i_6_ = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = GameClient.aBooleanArray8957[i_6_] ? 1 : 0;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("aax.wu(").append(')').toString());
        }
    }

    static final void method6291(ScriptRuntime runtime) {
            IComponentScripter IComponentScripter = (runtime.currentInstrBool ? runtime.aIComponentScripter_5247 : runtime.aIComponentScripter_5246);
            IComponentDefinition componentDefinition = IComponentScripter.componentDefinition;
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = 1004185785 * componentDefinition.zAngle;
    }

    static final void method1586(ScriptRuntime runtime) {
        NPC npc = ((NPC) runtime.entity);
        NPCDefinition npcDef = npc.aClass503_10190;
        if (npcDef.morphisms != null)
            npcDef = npcDef.morph(Class128.playerVarsProvider);
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = npcDef != null ? 1 : 0;
    }

    static final void playerEquip(ScriptRuntime runtime) {
        runtime.integerStackOffset -= -783761378;
        int slotID = runtime.integerStack[runtime.integerStackOffset * 681479919];
        int itemID = runtime.integerStack[runtime.integerStackOffset * 681479919 + 1];
        if (Player.myPlayer.appearance != null)
            Player.myPlayer.appearance.equip(slotID, itemID, Js5Configs.itemList);
    }

    static final void method1584(ScriptRuntime runtime) {
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = runtime.aClass162_5252.anInt1670 * 873199607;
    }

    static final void method2080(ScriptRuntime runtime) {
        try {
            runtime.integerStackOffset -= -1567522756;
            ToMoveSettings.method3913((runtime.integerStack[runtime.integerStackOffset * 681479919]), (runtime.integerStack[1 + runtime.integerStackOffset * 681479919]), (runtime.integerStack[2 + runtime.integerStackOffset * 681479919]), (runtime.integerStack[3 + runtime.integerStackOffset * 681479919]), false, 256);
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("jl.ty(").append(')').toString());
        }
    }

    static final void listingStatusScript(ScriptRuntime runtime) {
        try {
            int listingID = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
            int listingStatus = GameClient.stockMarketListing[listingID].getListingStatus();
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = 1 == listingStatus ? 1 : 0;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("pn.yz(").append(')').toString());
        }
    }

    static final void method4609(ScriptRuntime runtime) {
        try {
            boolean bool = false;
            String filePath = "";
            if (runtime.aClass214_5256 != null && runtime.aClass214_5256.method1985()) {
                File file = runtime.aClass214_5256.getFile();
                if (null != file) {
                    filePath = file.getPath();
                    if (filePath == null)
                        filePath = "";
                }
                bool = true;
                runtime.aClass214_5256 = null;
            }
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = bool ? 1 : 0;
            runtime.objectStack[((runtime.objectArgs += 969361751) * -203050393 - 1)] = filePath;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("pn.agm(").append(')').toString());
        }
    }

    static final void method4608(ScriptRuntime runtime, int i) {
        try {
            int charactersLength = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
            PublicMessage message = PublicMessage.getMessageCharacterCount(charactersLength);
            int i_4_ = -1;
            if (message != null)
                i_4_ = message.anInt1086 * -876503999;
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = i_4_;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("pn.acx(").append(')').toString());
        }
    }

    static final void method4607(ScriptRuntime runtime) {
        try {
            int i_2_ = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
            if (2 == GameClient.anInt8942 * 1131012101 && i_2_ < -1054937867 * GameClient.anInt8941)
                runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = GameClient.anIntArray8705[i_2_];
            else
                runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = 0;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("pn.vw(").append(')').toString());
        }
    }

    static final void method4606(IComponentDefinition component, ScriptRuntime runtime) {
        runtime.integerStackOffset -= -1175642067;
        component.lineHAlign = ((runtime.integerStack[runtime.integerStackOffset * 681479919]) * -1733811909);
        component.lineVAlign = ((runtime.integerStack[681479919 * runtime.integerStackOffset + 1]) * 210030285);
        component.lineHeight = ((runtime.integerStack[681479919 * runtime.integerStackOffset + 2]) * 1629063197);
        StaticMethods.updateComponentTick(component);
    }

    static final void method4883(ScriptRuntime runtime) {
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = GameClient.aShort8923;
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = GameClient.aShort8931;
    }

    static final void method3688(ScriptRuntime runtime) {
        try {
            int configIDX = (runtime.integerstack[runtime.integerPos * 1883543357]);
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = Class128.playerVarsProvider.configs[configIDX];
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("mm.c(").append(')').toString());
        }
    }

    static final void method6316(ScriptRuntime runtime) {
        int value = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        if (!GameClient.activeGraphicsToolkit.hasBloomToolkits())
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = 3;
        else
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = SettingsManager.settingsManager.bloom.getSupport(value);
    }

    static final void method4905(ScriptRuntime runtime) {
        try {
            runtime.integerStackOffset -= -783761378;
            int itemID = (runtime.integerStack[runtime.integerStackOffset * 681479919]);
            int i_7_ = (runtime.integerStack[1 + 681479919 * runtime.integerStackOffset]);
            Class497 class497 = Class92.aClass504_905.get(i_7_);
            if (class497.method6206())
                runtime.objectStack[((runtime.objectArgs += 969361751) * -203050393) - 1] = (Js5Configs.itemList.getItemDefinitions(itemID).method6041(i_7_, class497.aString6101));
            else
                runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = (Js5Configs.itemList.getItemDefinitions(itemID).method6037(i_7_, class497.size * -388931549));
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("qj.aat(").append(')').toString());
        }
    }

    static final void method3657(ScriptRuntime runtime) {
        String string = (String) (runtime.objectStack[(runtime.objectArgs -= 969361751) * -203050393]);
        int i_93_ = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        if (-1 == i_93_)
            throw new RuntimeException("");
        runtime.objectStack[((runtime.objectArgs += 969361751) * -203050393 - 1)] = new StringBuilder().append(string).append((char) i_93_).toString();
    }

    static final void method3653(ScriptRuntime runtime) {
        String string = (String) (runtime.objectStack[(runtime.objectArgs -= 969361751) * -203050393]);
        runtime.objectStack[((runtime.objectArgs += 969361751) * -203050393 - 1)] = string.toLowerCase();
    }

    static final void isAPI(ScriptRuntime runtime) {
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = (SettingsManager.settingsManager.antiAliasing.isAPI() && GameClient.activeGraphicsToolkit.isMultisampled()) ? 1 : 0;
    }

    static final void method1901(ScriptRuntime runtime) {
        int i_1_ = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = i_1_ & 0x3FFF;
    }

    static final void method2527(ScriptRuntime runtime) {
        try {
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = GameClient.anInt666 * -1972322437;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("lb.amk(").append(')').toString());
        }
    }

    static final void method4649(ScriptRuntime runtime) {
        try {
            runtime.integerStackOffset -= -1175642067;
            int i_2_ = (runtime.integerStack[runtime.integerStackOffset * 681479919]);
            int i_3_ = (runtime.integerStack[1 + runtime.integerStackOffset * 681479919]);
            int i_4_ = (runtime.integerStack[681479919 * runtime.integerStackOffset + 2]);
            if (i_3_ == -1)
                throw new RuntimeException();
            ClientScriptMap class483 = Class51.aClass475_506.getClientScriptMap(i_3_);
            if (class483.aChar6037 != i_2_)
                throw new RuntimeException();
            int[] data = class483.method6128(Integer.valueOf(i_4_));
            int size = 0;
            if (data != null)
                size = data.length;
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = size;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("pp.vs(").append(')').toString());
        }
    }

    static final void method4650(ScriptRuntime runtime) {
        try {
            String string = (String) (runtime.objectStack[(runtime.objectArgs -= 969361751) * -203050393]);
            Class342.method4152(string, (byte) 62);
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("pp.vl(").append(')').toString());
        }
    }

    static final void method600(ScriptRuntime runtime) {
        try {
            runtime.integerStackOffset -= -1175642067;
            Class136.method1495((runtime.integerStack[runtime.integerStackOffset * 681479919]), (runtime.integerStack[1 + runtime.integerStackOffset * 681479919]), (runtime.integerStack[2 + runtime.integerStackOffset * 681479919]), -649427988);
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("cc.tp(").append(')').toString());
        }
    }

    static final void method601(ScriptRuntime runtime) {
        try {
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = GameClient.anInt8834 * 1396956439;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("cc.uz(").append(')').toString());
        }
    }

    static final void method3901(ScriptRuntime runtime) {
        try {
            runtime.integerStackOffset -= -1567522756;
            int i_8_ = (runtime.integerStack[681479919 * runtime.integerStackOffset]);
            int i_9_ = (runtime.integerStack[1 + runtime.integerStackOffset * 681479919]);
            int i_10_ = (runtime.integerStack[2 + runtime.integerStackOffset * 681479919]);
            int i_11_ = (runtime.integerStack[681479919 * runtime.integerStackOffset + 3]);
            i_8_ += i_9_ << 14;
            i_8_ += i_10_ << 28;
            i_8_ += i_11_;
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = i_8_;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("nh.uu(").append(')').toString());
        }
    }

    static final void method4713(ScriptRuntime runtime) {
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = GameClient.aByte8959;
        if (GameClient.aByte8959 != -1)
            GameClient.aByte8959 = (byte) -6;
    }

    static final void method2811(ScriptRuntime runtime) {
        try {
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = Class100.anInt1079 * -1537941929;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("client.amm(").append(')').toString());
        }
    }

    static final void method956(ScriptRuntime runtime) {
        try {
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = 1097409519 * (runtime.entity.interfaceID);
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("dl.aow(").append(')').toString());
        }
    }

    static final void method1903(ScriptRuntime runtime) {
        try {
            runtime.integerStackOffset -= -783761378;
            int i_1_ = (runtime.integerStack[681479919 * runtime.integerStackOffset]);
            int i_2_ = (runtime.integerStack[681479919 * runtime.integerStackOffset + 1]);
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = StaticMethods.method886(i_1_, i_2_, false);
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("in.tv(").append(')').toString());
        }
    }

    static final void method1904(ScriptRuntime runtime) {
        try {
            runtime.integerStackOffset -= -783761378;
            int i_3_ = (runtime.integerStack[681479919 * runtime.integerStackOffset]);
            int i_4_ = (runtime.integerStack[1 + runtime.integerStackOffset * 681479919]);
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = i_4_ + i_3_;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("in.yk(").append(')').toString());
        }
    }

    static final void method1905(ScriptRuntime runtime) {
        try {
            SettingsManager.settingsManager.setValue(SettingsManager.settingsManager.fog, (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]) == 1 ? 1 : 0);
            GameClient.myRegion.method2667();
            ToMoveSettings.encodeBuffer();
            GameClient.sentPreferences = false;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("in.aii(").append(')').toString());
        }
    }

    static final void enterIntegerScript(ScriptRuntime runtime) {
        try {
            String string = (String) (runtime.objectStack[(runtime.objectArgs -= 969361751) * -203050393]);
            int input = 0;
            if (Class51.method543(string))
                input = StringUtils.method1998(string);
            OutgoingPacketBuffer outgoingPacketBuffer = Class18.method359(OutgoingPacket.ENTER_INTEGER_PACKET, ConnectionType.gameConnection.encryptor);
            outgoingPacketBuffer.payload.writeInt(input);
            ConnectionType.gameConnection.sendFrame(outgoingPacketBuffer);
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("in.sz(").append(')').toString());
        }
    }

    static final void method1891(ScriptRuntime runtime) {
        try {
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = runtime.clanChannelChat.minimumRankToChat;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ij.xb(").append(')').toString());
        }
    }

    static final void method1892(ScriptRuntime runtime) {
        try {
            runtime.objectStack[((runtime.objectArgs += 969361751) * -203050393 - 1)] = (Class79.method847(GameContext.method5574((runtime.integerStack[(runtime.integerStackOffset -= -391880689) * 681479919])), GameLanguage.CURRENT_LANGUAGE.getID(), -1841335173));
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ij.zo(").append(')').toString());
        }
    }

    static final void isWaterDetailOn(ScriptRuntime runtime) {
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = SettingsManager.settingsManager.water.getValue() == WaterSetting.HIGH ? 1 : 0;
    }

    static final void getItemStatus(ScriptRuntime runtime) {
        runtime.integerStackOffset -= -783761378;
        ItemContainerDefinition itemContainerDefinition = (Class300.itemContainerDefinitionLoader.getDefinition((runtime.integerStack[681479919 * runtime.integerStackOffset])));
        int slot = runtime.integerStack[681479919 * runtime.integerStackOffset + 1];
        int status = -1;
        for (int itemID = 0; itemID < -408056823 * itemContainerDefinition.itemsCount; itemID++) {
            if (slot == itemContainerDefinition.itemIds[itemID]) {
                status = itemContainerDefinition.itemAmts[itemID];
                break;
            }
        }
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = status;
    }

    static final void emptyScript() {

    }

    static final void getIdleAnimationValue(ScriptRuntime runtime) {
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = SettingsManager.settingsManager.idleAnimations.getValue();
    }

    static final void method1040(ScriptRuntime runtime) {
        runtime.integerStackOffset -= -1175642067;
        int i_0_ = (runtime.integerStack[runtime.integerStackOffset * 681479919]);
        int i_1_ = (runtime.integerStack[runtime.integerStackOffset * 681479919 + 1]);
        int i_2_ = (runtime.integerStack[2 + 681479919 * runtime.integerStackOffset]);
        Class301_Sub1.method3713(5, i_0_ << 16 | i_1_, i_2_, "");
    }

    static final void getVoiceOverVolume(ScriptRuntime runtime) {
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = SettingsManager.settingsManager.voiceOverVolume.getValue();
    }

    static final void method3101(ScriptRuntime runtime) {
        ToMoveIComponentScripts.method1138(runtime);
    }

    static final void method3102(ScriptRuntime runtime) {
        try {
            Class298_Sub37_Sub13 class298_sub37_sub13 = WorldMapHandler.method3705(runtime.integerStack[(runtime.integerStackOffset -= -391880689) * 681479919]);
            if (class298_sub37_sub13 == null || null == class298_sub37_sub13.aString9641)
                runtime.objectStack[((runtime.objectArgs += 969361751) * -203050393) - 1] = "";
            else
                runtime.objectStack[((runtime.objectArgs += 969361751) * -203050393) - 1] = class298_sub37_sub13.aString9641;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("abj.adf(").append(')').toString());
        }
    }

    static final void method3103(ScriptRuntime runtime) {
        try {
            int i_6_ = (runtime.integerstack[1883543357 * runtime.integerPos]);
            Long var_long = (Long) Class313.anObjectArray3298[i_6_];
            if (var_long == null)
                runtime.longStacks[((runtime.longArgs += -682569305) * 1685767703) - 1] = -1L;
            else
                runtime.longStacks[((runtime.longArgs += -682569305) * 1685767703) - 1] = var_long.longValue();
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("abj.bs(").append(')').toString());
        }
    }

    static final void getGameTick(ScriptRuntime runtime) {
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = 443738891 * GameClient.clientTick;
    }

    static final void method1777(ScriptRuntime runtime) {
        runtime.integerStack[(runtime.integerStackOffset += -391880689) * 681479919 - 1] = StaticMethods.getSceneLoadingTime();
    }

    static final ScriptRuntime method1950() {
        if (597504395 * Class388.scriptsRan == Class388.anArrayList4149.size())
            Class388.anArrayList4149.add(new ScriptRuntime());
        ScriptRuntime runtime = (ScriptRuntime) Class388.anArrayList4149.get(Class388.scriptsRan * 597504395);
        Class388.scriptsRan += -1866863069;
        return runtime;
    }

    static final void method1948(ScriptRuntime runtime) {
        try {
            int i_1_ = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = StaticMethods.method2375((char) i_1_) ? 1 : 0;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ix.zg(").append(')').toString());
        }
    }

    static final void method1946(ScriptRuntime runtime) {
        runtime.integerStack[runtime.integerStackOffset * 681479919 - 1] = (runtime.clanChannelChat.method3095()[(runtime.integerStack[681479919 * runtime.integerStackOffset - 1])]);
    }

    public static void method4926(int i) {
        try {
            if (8 == GameClient.gameState * -1233866115) {
                OutgoingPacketBuffer outgoingPacketBuffer = Class18.method359(OutgoingPacket.aClass198_2021, ConnectionType.lobbyConnection.encryptor);
                outgoingPacketBuffer.payload.writeByte(i);
                ConnectionType.lobbyConnection.sendFrame(outgoingPacketBuffer);
            }
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("qo.k(").append(')').toString());
        }
    }

    static final void method4894(ScriptRuntime runtime) {
        try {
            runtime.integerStackOffset -= -783761378;
            int i_4_ = (runtime.integerStack[681479919 * runtime.integerStackOffset]);
            int i_5_ = (runtime.integerStack[runtime.integerStackOffset * 681479919 + 1]);
            if (0 == i_4_)
                runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = 0;
            else
                runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = (int) Math.pow((double) i_4_, (double) i_5_);
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("qg.zb(").append(')').toString());
        }
    }

    static final void method4890(ScriptRuntime runtime) {
        try {
            Class343_Sub1 class343_sub1 = Class365_Sub1_Sub5_Sub2.method4537();
            if (class343_sub1 != null) {
                runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = class343_sub1.anInt7717 * -15394297;
                runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = -877023375 * class343_sub1.anInt3670;
                runtime.objectStack[((runtime.objectArgs += 969361751) * -203050393) - 1] = class343_sub1.aString7719;
                Class353 class353 = class343_sub1.method4163();
                runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = class353.anInt3820 * 1675394033;
                runtime.objectStack[((runtime.objectArgs += 969361751) * -203050393) - 1] = class353.aString3819;
                runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = class343_sub1.anInt3666 * -945794709;
                runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = class343_sub1.address * 512449113;
                runtime.objectStack[((runtime.objectArgs += 969361751) * -203050393) - 1] = class343_sub1.aString7718;
            } else {
                runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = -1;
                runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = 0;
                runtime.objectStack[((runtime.objectArgs += 969361751) * -203050393) - 1] = "";
                runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = 0;
                runtime.objectStack[((runtime.objectArgs += 969361751) * -203050393) - 1] = "";
                runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = 0;
                runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = 0;
                runtime.objectStack[((runtime.objectArgs += 969361751) * -203050393) - 1] = "";
            }
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("qg.alh(").append(')').toString());
        }
    }

    static final void method363(ScriptRuntime runtime) {
        try {
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = null != Class313.anObjectArray3298 ? 1 : 0;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("at.yl(").append(')').toString());
        }
    }

    static final void method4139(ScriptRuntime runtime) {
        try {
            int i_4_ = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
            if (GameClient.anInt8942 * 1131012101 == 2 && i_4_ < GameClient.anInt8941 * -1054937867)
                runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = GameClient.aBooleanArray8950[i_4_] ? 1 : 0;
            else
                runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = 0;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("of.we(").append(')').toString());
        }
    }

    static final void method4140(ScriptRuntime runtime) {
        try {
            int i_5_ = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = i_5_ >> 14 & 0x3fff;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("of.tj(").append(')').toString());
        }
    }

    static final void method4898(ScriptRuntime runtime) {
        try {
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = runtime.aClass162_5252.aByte1660;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("qi.xi(").append(')').toString());
        }
    }

    static final void method2324(ScriptRuntime runtime) {
        try {
            runtime.integerStackOffset -= -391880689;
            int i_14_ = (runtime.integerStack[runtime.integerStackOffset * 681479919]);
            Widget class298_sub51 = ((Widget) GameClient.linkedList.get((long) i_14_));
            if (null != class298_sub51 && 3 == 27137839 * class298_sub51.clipped)
                Widget.closeInterface(class298_sub51, true, true);
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("kf.sh(").append(')').toString());
        }
    }

    static final void method2325(ScriptRuntime runtime) {
        try {
            int i_15_ = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
            Class118.method1293(i_15_ >> 14 & 0x3fff, i_15_ & 0x3fff, -548972447);
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("kf.aeb(").append(')').toString());
        }
    }

    static final void method2329(ScriptRuntime runtime) {
        try {
            if ((runtime.integerStack[(runtime.integerStackOffset -= -391880689) * 681479919]) == 1)
                runtime.integerPos += ((runtime.integerstack[1883543357 * runtime.integerPos]) * 286750741);
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("kf.bw(").append(')').toString());
        }
    }

    static final void method2386(ScriptRuntime runtime) {
        try {
            String string = (String) (runtime.objectStack[(runtime.objectArgs -= 969361751) * -203050393]);
            String string_1_ = (String) (runtime.objectStack[((runtime.objectArgs -= 969361751) * -203050393)]);
            OutgoingPacketBuffer outgoingPacketBuffer = Class18.method359(OutgoingPacket.aClass198_2068, ConnectionType.lobbyConnection.encryptor);
            outgoingPacketBuffer.payload.writeShort((StaticMethods.method693(string) + StaticMethods.method693(string_1_)));
            outgoingPacketBuffer.payload.writeString(string);
            outgoingPacketBuffer.payload.writeString(string_1_);
            ConnectionType.lobbyConnection.sendFrame(outgoingPacketBuffer);
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("kj.vq(").append(')').toString());
        }
    }

    static final void getAntiAliasingMode(ScriptRuntime runtime) {
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = SettingsManager.settingsManager.antiAliasing.getValue();
    }

    static final void method5995(ScriptRuntime runtime) {
        try {
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = (-407713023 * (((NPC) runtime.entity).aClass503_10190.typeID));
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ta.apx(").append(')').toString());
        }
    }

    static final void method1277(ScriptRuntime runtime) {
        try {
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = StaticMethods.method5804(-1233866115 * GameClient.gameState) ? 1 : 0;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("et.afp(").append(')').toString());
        }
    }

    static final void method1281(ScriptRuntime runtime, short i) {
        try {
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = 1484045541 * Class301_Sub1.anInt7625;
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = Class413.anInt6590 * 1464638883;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("et.adn(").append(')').toString());
        }
    }

    static final void method3830(ScriptRuntime runtime) {
        try {
            ConnectionType connectionType = ConnectionType.getConnectionType();
            OutgoingPacketBuffer outgoingPacketBuffer = Class18.method359(OutgoingPacket.PUBLIC_QUICK_CHAT_PACKET, connectionType.encryptor);
            outgoingPacketBuffer.payload.writeByte(0);
            int i_4_ = (outgoingPacketBuffer.payload.offset * 385051775);
            outgoingPacketBuffer.payload.writeByte(1);
            outgoingPacketBuffer.payload.writeShort(-2034569943 * runtime.aClass177_5243.anInt1787);
            runtime.aClass177_5243.aClass298_Sub37_Sub14_1788.method3464(outgoingPacketBuffer.payload, runtime.aClass177_5243.anIntArray1789, 373327263);
            outgoingPacketBuffer.payload.method3649((outgoingPacketBuffer.payload.offset * 385051775) - i_4_);
            connectionType.sendFrame(outgoingPacketBuffer);
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("nb.ack(").append(')').toString());
        }
    }

    static final void method3828(ScriptRuntime runtime) {
        try {
            runtime.longArgs -= -1365138610;
            if ((runtime.longStacks[1685767703 * runtime.longArgs]) <= (runtime.longStacks[runtime.longArgs * 1685767703 + 1])) {
                runtime.integerPos += (286750741 * (runtime.integerstack[runtime.integerPos * 1883543357]));
            }
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("nb.bl(").append(')').toString());
        }
    }

    static final void method4198(ScriptRuntime runtime) {
        int i_12_ = (runtime.integerstack[runtime.integerPos * 1883543357]);
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = ((NPC) runtime.entity).aClass73_10187.method817(i_12_);
    }

    static final void method4195(ScriptRuntime runtime) {
        int value = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        SettingsManager.settingsManager.setValue(SettingsManager.settingsManager.brightness, value);
        GameClient.myRegion.method2667();
        ToMoveSettings.encodeBuffer();
        GameClient.sentPreferences = false;
    }

    static final void method3404(ScriptRuntime runtime) {
        try {
            int i_29_ = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
            Class298_Sub37_Sub13 class298_sub37_sub13 = WorldMapHandler.method3705(i_29_);
            if (class298_sub37_sub13 == null) {
                runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = 0;
                runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = 0;
            } else {
                runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = (-2052483955 * class298_sub37_sub13.anInt9647 - class298_sub37_sub13.anInt9650 * 1364716801);
                runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = (929385381 * class298_sub37_sub13.anInt9646 - class298_sub37_sub13.anInt9649 * 1345239131);
            }
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("abv.adj(").append(')').toString());
        }
    }

    static final void method2090(ScriptRuntime runtime) {
        try {
            int i_112_ = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
            if (GameClient.anInt8942 * 1131012101 != 0 && i_112_ < GameClient.anInt8952 * -548972447)
                runtime.objectStack[((runtime.objectArgs += 969361751) * -203050393) - 1] = GameClient.aStringArray8954[i_112_];
            else
                runtime.objectStack[((runtime.objectArgs += 969361751) * -203050393) - 1] = "";
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("jm.ws(").append(')').toString());
        }
    }

    static final void method2091(ScriptRuntime runtime) {
        try {
            runtime.integerStackOffset -= -783761378;
            int i_113_ = (runtime.integerStack[681479919 * runtime.integerStackOffset]);
            int i_114_ = (runtime.integerStack[1 + 681479919 * runtime.integerStackOffset]);
            int i_115_ = (StaticMethods.aClass469_5618.method6045(i_113_).method3460(i_114_, -1821518698).anInt3996 * -1682932563);
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = i_115_;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("jm.adr(").append(')').toString());
        }
    }

    static final void method2092(ScriptRuntime runtime) {
        try {
            runtime.integerStackOffset -= -783761378;
            int i_116_ = (runtime.integerStack[681479919 * runtime.integerStackOffset]);
            int i_117_ = (runtime.integerStack[1 + 681479919 * runtime.integerStackOffset]);
            if (-1 != i_116_) {
                if (i_117_ > 255)
                    i_117_ = 255;
                else if (i_117_ < 0)
                    i_117_ = 0;
                Class313.method3820(i_116_, i_117_, false, 2142965372);
            }
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("jm.anc(").append(')').toString());
        }
    }

    static final void method5906(ScriptRuntime runtime) {
        try {
            String string = (String) (runtime.objectStack[(runtime.objectArgs -= 969361751) * -203050393]);
            runtime.integerStackOffset -= -783761378;
            int i_0_ = (runtime.integerStack[681479919 * runtime.integerStackOffset]);
            int i_1_ = (runtime.integerStack[681479919 * runtime.integerStackOffset + 1]);
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = string.indexOf(i_0_, i_1_);
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("sl.aau(").append(')').toString());
        }
    }

    static final void method948(ScriptRuntime runtime) {
        try {
            int i_13_ = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
            OutgoingPacketBuffer outgoingPacketBuffer = Class18.method359(OutgoingPacket.COLOR_ID_PACKET, ConnectionType.gameConnection.encryptor);
            outgoingPacketBuffer.payload.writeShort(i_13_);
            ConnectionType.gameConnection.sendFrame(outgoingPacketBuffer);
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("dk.displayName(").append(')').toString());
        }
    }

    static final void method949(ScriptRuntime runtime) {
        try {
            int i_14_ = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
            Class124.method1385(i_14_, (byte) 2);
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("dk.ahg(").append(')').toString());
        }
    }

    static final void method554(ScriptRuntime runtime) {
        try {
            String string = (String) (runtime.objectStack[(runtime.objectArgs -= 969361751) * -203050393]);
            runtime.objectStack[((runtime.objectArgs += 969361751) * -203050393 - 1)] = StringUtils.decryptStringMessage(string);
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("cb.zc(").append(')').toString());
        }
    }

    static final void method553(ScriptRuntime runtime) {
        try {
            runtime.longArgs -= -1365138610;
            if ((runtime.longStacks[1685767703 * runtime.longArgs]) > (runtime.longStacks[1685767703 * runtime.longArgs + 1]))
                runtime.integerPos += (286750741 * (runtime.integerstack[runtime.integerPos * 1883543357]));
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("cb.bb(").append(')').toString());
        }
    }

    static void method5620(ScriptRuntime runtime) {
        try {
            runtime.integerStack[runtime.integerStackOffset * 681479919 - 2] = (Class316.aClass362_3318.getQuestType((runtime.integerStack[runtime.integerStackOffset * 681479919 - 2])).method4567(Class128.playerVarsProvider, (runtime.integerStack[681479919 * runtime.integerStackOffset - 1]))) ? 1 : 0;
            runtime.integerStackOffset -= -391880689;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("rm.v(").append(')').toString());
        }
    }

    static final void method5671(ScriptRuntime runtime) {
        int i_2_ = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = Character.toLowerCase((char) i_2_);
    }

    static final void method5672(ScriptRuntime runtime) {
        int buttonID = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        String string = (String) (runtime.objectStack[(runtime.objectArgs -= 969361751) * -203050393]);
        Class69.method793(buttonID, string);
    }

    static final void method5595(ScriptRuntime runtime) {
        String string = (String) (runtime.objectStack[(runtime.objectArgs -= 969361751) * -203050393]);
        if (string.startsWith(StaticMethods.method2368(0)) || string.startsWith(StaticMethods.method2368(1)))
            string = string.substring(7);
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = Class287.method2722(string) ? 1 : 0;
    }

    static final void method2130(ScriptRuntime runtime) {
        try {
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = SettingsManager.settingsManager.maxScreenSize.method5653() ? 1 : 0;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("jt.ani(").append(')').toString());
        }
    }

    static final void method2131(IComponentDefinition component, ScriptRuntime runtime) {
        try {
            String string = (String) (runtime.objectStack[(runtime.objectArgs -= 969361751) * -203050393]);
            if (Class298_Sub6.method2863(string, runtime) != null)
                string = string.substring(0, string.length() - 1);
            component.anObjectArray1267 = Class128_Sub2.method1441(string, runtime);
            component.hasScript = true;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("jt.mz(").append(')').toString());
        }
    }

    static final void method6076(ScriptRuntime runtime) {
        try {
            runtime.integerStackOffset -= -1175642067;
            int i_2_ = (runtime.integerStack[681479919 * runtime.integerStackOffset]);
            int i_3_ = (runtime.integerStack[1 + runtime.integerStackOffset * 681479919]);
            int i_4_ = (runtime.integerStack[681479919 * runtime.integerStackOffset + 2]);
            Class301_Sub1.method3713(3, i_2_ << 16 | i_3_, i_4_, "");
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("to.alf(").append(')').toString());
        }
    }

    static final void method6309(ScriptRuntime runtime) {
        try {
            runtime.integerStackOffset -= -783761378;
            int i_2_ = (runtime.integerStack[runtime.integerStackOffset * 681479919]);
            int i_3_ = (runtime.integerStack[1 + 681479919 * runtime.integerStackOffset]);
            Class497 class497 = Class92.aClass504_905.get(i_3_);
            if (class497.method6206())
                runtime.objectStack[((runtime.objectArgs += 969361751) * -203050393) - 1] = NPCDefinitionLoader.npcList.load(i_2_).method6245(i_3_, class497.aString6101);
            else
                runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = (NPCDefinitionLoader.npcList.load(i_2_).method6239(i_3_, -388931549 * class497.size, (byte) 106));
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("vt.abu(").append(')').toString());
        }
    }

    static final void method4264(ScriptRuntime runtime) {
        runtime.integerStackOffset -= -783761378;
        int i_10_ = (runtime.integerStack[runtime.integerStackOffset * 681479919]);
        int i_11_ = (runtime.integerStack[runtime.integerStackOffset * 681479919 + 1]);
        Class497 class497 = Class92.aClass504_905.get(i_11_);
        if (class497.method6206())
            runtime.objectStack[((runtime.objectArgs += 969361751) * -203050393) - 1] = GameClient.myRegion.getObjectDefinitionLoader().get(i_10_).method5770(i_11_, class497.aString6101);
        else
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = (GameClient.myRegion.getObjectDefinitionLoader().get(i_10_).method5776(i_11_, class497.size * -388931549));
    }

    static final void method4296(ScriptRuntime runtime) {
        String string = (String) (runtime.objectStack[(runtime.objectArgs -= 969361751) * -203050393]);
        if (14 != -1233866115 * GameClient.gameState || Class315.method3837())
            GameClient.aByte8959 = (byte) -5;
        else if (string.length() > 20)
            GameClient.aByte8959 = (byte) -4;
        else {
            GameClient.aByte8959 = (byte) -1;
            OutgoingPacketBuffer outgoingPacketBuffer = Class18.method359(OutgoingPacket.aClass198_2028, ConnectionType.lobbyConnection.encryptor);
            outgoingPacketBuffer.payload.writeByte(0);
            int i_14_ = (385051775 * outgoingPacketBuffer.payload.offset);
            outgoingPacketBuffer.payload.writeString(string);
            outgoingPacketBuffer.payload.method3649((outgoingPacketBuffer.payload.offset * 385051775) - i_14_);
            ConnectionType.lobbyConnection.sendFrame(outgoingPacketBuffer);
        }
    }

    static final void method4293(ScriptRuntime runtime) {
        try {
            Class79.method850((runtime.aClass365_Sub1_Sub4_Sub1_5253), (runtime.integerStack[(runtime.integerStackOffset -= -391880689) * 681479919]));
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = (int) GameClient.translated3DCoord[0];
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = (int) GameClient.translated3DCoord[1];
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = (int) GameClient.translated3DCoord[2];
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("oz.apa(").append(')').toString());
        }
    }

    static final void method4212(ScriptRuntime runtime) {
        try {
            int i_26_ = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
            runtime.objectArgs -= 1938723502;
            String string = (String) (runtime.objectStack[runtime.objectArgs * -203050393]);
            String string_27_ = ((String) (runtime.objectStack[1 + runtime.objectArgs * -203050393]));
            if (string.length() <= 500 && string_27_.length() <= 500)
                method2791(i_26_, string, string_27_, 600657777);
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("op.aps(").append(')').toString());
        }
    }

    static final void method4217(ScriptRuntime runtime) {
        try {
            int value = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = SettingsManager.settingsManager.groundDecoration.getSupport(value);
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("op.aoc(").append(')').toString());
        }
    }

    static final void method4956(ScriptRuntime runtime) {
        try {
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = GameClient.aBoolean8802 ? 1 : 0;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("qv.uq(").append(')').toString());
        }
    }

    static void method4959(ScriptRuntime runtime) {
        try {
            runtime.integerStack[runtime.integerStackOffset * 681479919 - 1] = (Class316.aClass362_3318.getQuestType((runtime.integerStack[runtime.integerStackOffset * 681479919 - 1])).requiredQuestPoints) * 1327747841;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("qv.r(").append(')').toString());
        }
    }

    static final void method6016(ScriptRuntime runtime) {
        int i_0_ = (runtime.integerstack[runtime.integerPos * 1883543357]);
        StaticMethods.interfaceGCString[i_0_] = (String) (runtime.objectStack[((runtime.objectArgs -= 969361751) * -203050393)]);
        IComponentUpdateNode.appendGlobalStringUpdate(i_0_);
    }

    static final void method3949(ScriptRuntime runtime) {
        try {
            String string = (String) (runtime.objectStack[(runtime.objectArgs -= 969361751) * -203050393]);
            runtime.integerStackOffset -= -783761378;
            int i_11_ = (runtime.integerStack[runtime.integerStackOffset * 681479919]);
            int i_12_ = (runtime.integerStack[runtime.integerStackOffset * 681479919 + 1]);
            RSFontMetrics class505 = Class322.getFontMetricFileData(Js5List.JS5_FONTMETRICS, i_12_, 0);
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = class505.method6259(string, i_11_, StaticMedia.nameIconSprites);
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("nl.zn(").append(')').toString());
        }
    }

    static final void method3946(ScriptRuntime runtime) {
        try {
            int i_1_ = Class431.anInt6502 * -1012194159;
            int i_2_ = 1953279233 * ScriptInstructions.anInt6465;
            int i_3_ = -1;
            if (GameClient.fullscreen) {
                Class456[] class456s = Class271.method2545((byte) -2);
                for (int i_4_ = 0; i_4_ < class456s.length; i_4_++) {
                    Class456 class456 = class456s[i_4_];
                    if (i_1_ == class456.anInt5663 * 28445523 && class456.anInt5665 * 262154323 == i_2_) {
                        i_3_ = i_4_;
                        break;
                    }
                }
            }
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = i_3_;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("nl.aeu(").append(')').toString());
        }
    }

    static final void method5950(ScriptRuntime runtime) {
        try {
            if (GameClient.anInt8932 * -1333485389 >= 5 && -1333485389 * GameClient.anInt8932 <= 9)
                runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = 1;
            else
                runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = 0;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("sr.ur(").append(')').toString());
        }
    }

    static final void method3525(ScriptRuntime runtime) {
        try {
            int i_0_ = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = GameClient.anIntArray8924[i_0_];
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("acb.ti(").append(')').toString());
        }
    }

    static final void method4168(ScriptRuntime runtime) {
        try {
            runtime.integerStackOffset -= -783761378;
            int i_10_ = (runtime.integerStack[runtime.integerStackOffset * 681479919]);
            int i_11_ = (runtime.integerStack[runtime.integerStackOffset * 681479919 + 1]);
            if (i_10_ >= 0 && i_10_ < 2)
                GameClient.anIntArrayArrayArray8767[i_10_] = new int[i_11_ << 1][4];
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("oj.afc(").append(')').toString());
        }
    }

    static final void method5580(ScriptRuntime runtime) {
        try {
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = (JS5NativeManager.nativeManager.isDefined("jagtheora") ? 1 : 0);
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("rb.and(").append(')').toString());
        }
    }

    static final void method737(ScriptRuntime runtime) {
        int i_1_ = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = (int) (GameContext.method5574(i_1_) / 60000L);
    }

    static final void removeScript(ScriptRuntime runtime) {
        runtime.integerStackOffset -= -783761378;
        int i_0_ = runtime.integerStack[runtime.integerStackOffset * 681479919];
        int i_1_ = runtime.integerStack[runtime.integerStackOffset * 681479919 + 1];
        runtime.integerStack[(runtime.integerStackOffset += -391880689) * 681479919 - 1] = (StaticMethods.aClass469_5618.method6045(i_0_).anIntArray9653[i_1_]);
    }

    static final void method4694(ScriptRuntime runtime) {
        int i_10_ = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        if (GameClient.aString8804 != null && i_10_ < -1801543887 * Class489.anInt6071)
            runtime.objectStack[((runtime.objectArgs += 969361751) * -203050393) - 1] = StaticMethods.aClass7Array6846[i_10_].aString92;
        else
            runtime.objectStack[((runtime.objectArgs += 969361751) * -203050393) - 1] = "";
    }

    static final void method4691(ScriptRuntime runtime) {
        try {
            runtime.objectStack[((runtime.objectArgs += 969361751) * -203050393 - 1)] = ((Player) runtime.entity).getPlayerName(true);
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("px.aom(").append(')').toString());
        }
    }

    static final void method537(ScriptRuntime runtime) {
        int i_20_ = ((runtime.integerstack[runtime.integerPos * 1883543357]) >> 16);
        int i_21_ = ((runtime.integerstack[1883543357 * runtime.integerPos]) & 0xffff);
        int i_22_ = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        if (i_22_ < 0 || i_22_ > 5000)
            throw new RuntimeException();
        runtime.arrayLengths[i_20_] = i_22_;
        int i_23_ = -1;
        if (105 == i_21_)
            i_23_ = 0;
        for (int i_24_ = 0; i_24_ < i_22_; i_24_++)
            runtime.arrays[i_20_][i_24_] = i_23_;
    }

    static final void method536(ScriptRuntime runtime) {
        try {
            runtime.integerStackOffset -= -1175642067;
            int i_17_ = (runtime.integerStack[runtime.integerStackOffset * 681479919]);
            int i_18_ = (runtime.integerStack[runtime.integerStackOffset * 681479919 + 1]);
            int i_19_ = (runtime.integerStack[2 + 681479919 * runtime.integerStackOffset]);
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = runtime.aClass162_5252.method1752(i_17_, i_18_, i_19_);
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("c.xr(").append(')').toString());
        }
    }

    static final void method532(ScriptRuntime runtime) {
        try {
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = -1168328513 * GameClient.anInt8837;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("c.abh(").append(')').toString());
        }
    }

    static final void method4853(ScriptRuntime runtime) {
        try {
            int i_0_ = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = GameClient.anIntArray8828[i_0_];
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("qb.tc(").append(')').toString());
        }
    }

    static final void method4855(ScriptRuntime runtime) {
        try {
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = SettingsManager.settingsManager.skybox.compatibleMode() ? 1 : 0;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("qb.aod(").append(')').toString());
        }
    }

    static final void method4274(ScriptRuntime runtime) {
        try {
            runtime.objectStack[((runtime.objectArgs += 969361751) * -203050393 - 1)] = runtime.aClass162_5252.aString1654;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ox.xl(").append(')').toString());
        }
    }

    static final void method1445(ScriptRuntime runtime) {
        try {
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = GameClient.isMemberWorld ? 1 : 0;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ff.th(").append(')').toString());
        }
    }

    static final void method4974(ScriptRuntime runtime) {
        try {
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = Class301_Sub1.aBoolean7635 ? 1 : 0;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("qz.aem(").append(')').toString());
        }
    }

    static final void getSceneryShadowsMode(ScriptRuntime runtime) {
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = SettingsManager.settingsManager.sceneryShadows.getValue();
    }

    static final void method4977(ScriptRuntime runtime) {
        try {
            SettingsManager.settingsManager.setValue(SettingsManager.settingsManager.buildArea, (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]));
            ToMoveSettings.encodeBuffer();
            GameClient.sentPreferences = false;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("qz.ain(").append(')').toString());
        }
    }

    static final void method4979(ScriptRuntime runtime) {
        try {
            boolean bool = ((runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]) != 0);
            int i_11_ = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
            runtime.objectStack[((runtime.objectArgs += 969361751) * -203050393 - 1)] = StringUtils.method3685((long) i_11_, 0, bool, GameLanguage.CURRENT_LANGUAGE);
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("qz.aac(").append(')').toString());
        }
    }

    static final void method6050(ScriptRuntime runtime) {
        try {
            int i_3_ = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = Class431.method5764((char) i_3_) ? 1 : 0;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("tj.aae(").append(')').toString());
        }
    }

    static final void method6052(ScriptRuntime runtime) {
        try {
            SettingsManager.settingsManager.setValue(SettingsManager.settingsManager.maxScreenSize, (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]));
            ToMoveSettings.encodeBuffer();
            GameClient.aBoolean8676 = true;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("tj.aiq(").append(')').toString());
        }
    }

    static final void method6051(ScriptRuntime runtime) {
        try {
            int i_4_ = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = SettingsManager.settingsManager.sceneryShadows.getSupport(i_4_);
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("tj.aol(").append(')').toString());
        }
    }

    static final void method5705(ScriptRuntime runtime) {
        try {
            Class79.method850(((Class365_Sub1) runtime.anSceneObject_5233), (runtime.integerStack[(runtime.integerStackOffset -= -391880689) * 681479919]));
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = (int) GameClient.translated3DCoord[0];
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = (int) GameClient.translated3DCoord[1];
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = (int) GameClient.translated3DCoord[2];
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("aee.apu(").append(')').toString());
        }
    }

    static final void method5704(ScriptRuntime runtime) {
        try {
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = SettingsManager.settingsManager.flickeringEffects.getValue() == 1 ? 1 : 0;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("aee.ajj(").append(')').toString());
        }
    }

    static final void brightnessValue(ScriptRuntime runtime) {
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = SettingsManager.settingsManager.brightness.getValue();
    }

    static final void method5719(ScriptRuntime runtime) {
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = 1001535723 * Class360.anInt3908;
    }

    static final void method5690(ScriptRuntime runtime) {
        String string = (String) (runtime.objectStack[(runtime.objectArgs -= 969361751) * -203050393]);
        runtime.aClass214_5256 = new Class214(string, true);
    }

    static final void method1261(ScriptRuntime runtime, int i) {
        try {
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = runtime.aClass365_Sub1_Sub4_Sub1_5253.method4363();
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("er.apo(").append(')').toString());
        }
    }

    static final void method3973(ScriptRuntime runtime) {
        try {
            runtime.longArgs -= -1365138610;
            if ((runtime.longStacks[1685767703 * runtime.longArgs]) == (runtime.longStacks[1 + runtime.longArgs * 1685767703]))
                runtime.integerPos += (286750741 * (runtime.integerstack[runtime.integerPos * 1883543357]));
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("np.bx(").append(')').toString());
        }
    }

    static final void method5992(ScriptRuntime runtime) {
        try {
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = Class360.anInt3894 * 235445649;
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = 508782749 * Class360.anInt3888;
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = 1800450029 * Class360.anInt3906;
            Class360.anInt3894 = -1908115170;
            Class360.anInt3888 = 599892555;
            Class360.anInt3906 = 930150939;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("t.ahz(").append(')').toString());
        }
    }

    static final void method5993(ScriptRuntime runtime) {
        try {
            runtime.integerStackOffset -= -783761378;
            int i_1_ = (runtime.integerStack[runtime.integerStackOffset * 681479919]);
            int i_2_ = (runtime.integerStack[1 + 681479919 * runtime.integerStackOffset]);
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = 0 != (i_1_ & 1 << i_2_) ? 1 : 0;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("t.zh(").append(')').toString());
        }
    }

    static final void method3749(ScriptRuntime runtime) {
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = 1592380953 * GameClient.shutdownDelay;
    }

    static final void method3750(ScriptRuntime runtime) {
        try {
            Class79.method850((runtime.entity), (runtime.integerStack[(runtime.integerStackOffset -= -391880689) * 681479919]));
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = (int) GameClient.translated3DCoord[0];
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = (int) GameClient.translated3DCoord[1];
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = (int) GameClient.translated3DCoord[2];
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("mr.aov(").append(')').toString());
        }
    }

    static final void method3748(ScriptRuntime runtime) {
        try {
            runtime.integerStackOffset -= -1175642067;
            int i_36_ = (runtime.integerStack[681479919 * runtime.integerStackOffset]);
            int i_37_ = (runtime.integerStack[1 + runtime.integerStackOffset * 681479919]);
            int i_38_ = (runtime.integerStack[runtime.integerStackOffset * 681479919 + 2]);
            String string = (String) (runtime.objectStack[(runtime.objectArgs -= 969361751) * -203050393]);
            if (i_37_ == -1)
                throw new RuntimeException();
            ClientScriptMap class483 = Class51.aClass475_506.getClientScriptMap(i_37_);
            if (i_36_ != class483.aChar6042)
                throw new RuntimeException();
            if (class483.aChar6037 != 's')
                throw new RuntimeException();
            int[] is = class483.method6128(string);
            if (i_38_ < 0 || null == is || is.length <= i_38_)
                throw new RuntimeException();
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = is[i_38_];
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("mr.vm(").append(')').toString());
        }
    }

    static final void method6364(ScriptRuntime runtime) {
        try {
            runtime.integerStackOffset -= -1175642067;
            int i_170_ = (runtime.integerStack[681479919 * runtime.integerStackOffset]);
            int i_171_ = (runtime.integerStack[runtime.integerStackOffset * 681479919 + 1]);
            int i_172_ = (runtime.integerStack[2 + runtime.integerStackOffset * 681479919]);
            long l = Class296.method2830(0, 0, 12, i_170_, i_171_, i_172_, (byte) 67);
            int i_173_ = Class408.method4966(l);
            if (i_172_ < 1970)
                i_173_--;
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = i_173_;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("xa.akr(").append(')').toString());
        }
    }

    static final void method6362(ScriptRuntime runtime) {
        try {
            runtime.integerStackOffset -= -783761378;
            int i_168_ = (runtime.integerStack[runtime.integerStackOffset * 681479919]);
            int i_169_ = (runtime.integerStack[1 + 681479919 * runtime.integerStackOffset]);
            if (i_168_ > 700 || i_169_ > 700)
                runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = 256;
            double d = ((Math.random() * (double) (i_169_ + i_168_) - (double) i_168_ + 800.0) / 100.0);
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = (int) (Math.pow(2.0, d) + 0.5);
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("xa.zr(").append(')').toString());
        }
    }

    static final void method6363(ScriptRuntime runtime) {
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = (SettingsManager.settingsManager.bloom.method5646() && GameClient.activeGraphicsToolkit.hasBloomToolkits()) ? 1 : 0;
    }

    static final void method4909(ScriptRuntime runtime) {
        try {
            if (null != Class508.aClass162_6216) {
                runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = 1;
                runtime.aClass162_5252 = Class508.aClass162_6216;
            } else
                runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = 0;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("qk.wk(").append(')').toString());
        }
    }

    static final void method4159(ScriptRuntime runtime) {
        try {
            int i_0_ = (runtime.integerstack[1883543357 * runtime.integerPos]);
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = Class128.playerVarsProvider.method250(i_0_);
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("oh.at(").append(')').toString());
        }
    }

    static final void method4160(ScriptRuntime runtime) {
        try {
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = SettingsManager.settingsManager.areaSoundsVolume.getValue();
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("oh.ajf(").append(')').toString());
        }
    }

    static final void method2494(ScriptRuntime runtime) {
        try {
            int memberIndex = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = (runtime.clanChannelChat.clanMembers[memberIndex].playerRank);
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("l.ym(").append(')').toString());
        }
    }

    static final void method6268(ScriptRuntime runtime) {
        runtime.objectArgs -= 1938723502;
        Class23.method377((String) (runtime.objectStack[-203050393 * runtime.objectArgs]), (String) (runtime.objectStack[1 + -203050393 * runtime.objectArgs]), "", (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]) == 1, false);
    }

    static final void method4526(ScriptRuntime runtime) {
        int i_27_ = (runtime.integerstack[runtime.integerPos * 1883543357]);
        String string = (String) Class313.anObjectArray3298[i_27_];
        if (string == null)
            runtime.objectStack[((runtime.objectArgs += 969361751) * -203050393) - 1] = "";
        else
            runtime.objectStack[((runtime.objectArgs += 969361751) * -203050393) - 1] = string;
    }

    static final void method4527(ScriptRuntime runtime) {
        int i_28_ = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        Class352 class352 = Class363.aClass339_3931.method4116(i_28_);
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = class352.anInt3783 * 1023000389;
    }

    static final void method4522(ScriptRuntime runtime) {
        int i_12_ = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        Class298_Sub37_Sub13 class298_sub37_sub13 = WorldMapHandler.method3705(i_12_);
        if (null == class298_sub37_sub13) {
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = 0;
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = 0;
        } else {
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = (-1973484731 * class298_sub37_sub13.anInt9644 >> 14 & 0x3fff);
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = class298_sub37_sub13.anInt9644 * -1973484731 & 0x3fff;
        }
    }

    static final void method1056(ScriptRuntime runtime) {
        try {
            runtime.integerStackOffset -= -1567522756;
            int i_73_ = (runtime.integerStack[runtime.integerStackOffset * 681479919]);
            boolean bool = 1 == (runtime.integerStack[runtime.integerStackOffset * 681479919 + 1]);
            int i_74_ = (runtime.integerStack[runtime.integerStackOffset * 681479919 + 2]);
            boolean bool_75_ = ((runtime.integerStack[3 + 681479919 * runtime.integerStackOffset]) == 1);
            Class298_Sub32_Sub20.method3263(i_73_, bool, i_74_, bool_75_, 1687031105);
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("dz.alr(").append(')').toString());
        }
    }

    static final void method1062(ScriptRuntime runtime) {
        int type = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        ConnectionType connectionType = ConnectionType.getConnectionType();
        OutgoingPacketBuffer outgoingPacketBuffer = Class18.method359(OutgoingPacket.CHAT_TYPE_PACKET, connectionType.encryptor);
        outgoingPacketBuffer.payload.writeByte(type);
        connectionType.sendFrame(outgoingPacketBuffer);
    }

    static final void method1063(ScriptRuntime runtime) {
        try {
            String string = (String) (runtime.objectStack[(runtime.objectArgs -= 969361751) * -203050393]);
            if (null != StaticMethods.aString1369 && StaticMethods.aString1369.equalsIgnoreCase(string))
                runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = 1;
            else
                runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = 0;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("yh.vu(").append(')').toString());
        }
    }

    public static void method1064(CS2Context context, int i, int i_27_, Class365_Sub1_Sub4_Sub1 class365_sub1_sub4_sub1) {
        ScriptRuntime runtime = method1950();
        runtime.aClass365_Sub1_Sub4_Sub1_5253 = class365_sub1_sub4_sub1;
        SubIncommingPacket.method1925(context, i, i_27_, runtime);
        runtime.aClass365_Sub1_Sub4_Sub1_5253 = null;
    }

    static final void method1066(ScriptRuntime runtime) {
        try {
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = 2119035647 * Class216.anInt6659;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("yh.amq(").append(')').toString());
        }
    }

    static final void cs2SetBitconfigValue(ScriptRuntime runtime) {
        try {
            int bitConfig = runtime.integerstack[1883543357 * runtime.integerPos];
            Class128.playerVarsProvider.setBitconfigValue(bitConfig, runtime.integerStack[(runtime.integerStackOffset -= -391880689) * 681479919], 2039921944);
        } catch (RuntimeException e) {
            throw ErrorReporter.generateReport(e, new StringBuilder().append("ys.ah(").append(')').toString());
        }
    }

    static final void method1059(ScriptRuntime runtime) {
        try {
            runtime.integerLocals[(runtime.integerstack[runtime.integerPos * 1883543357])] = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ye.as(").append(')').toString());
        }
    }

    static final void method311(ScriptRuntime runtime) {
        try {
            int i_0_ = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = GameClient.stockMarketListing[i_0_].method2401((byte) 8);
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ah.yc(").append(')').toString());
        }
    }

    static final void method312(ScriptRuntime runtime) {
        try {
            runtime.integerStackOffset -= -1175642067;
            int i_1_ = (runtime.integerStack[681479919 * runtime.integerStackOffset]);
            int i_2_ = (runtime.integerStack[runtime.integerStackOffset * 681479919 + 1]);
            int i_3_ = (runtime.integerStack[2 + runtime.integerStackOffset * 681479919]);
            Class301_Sub1.method3713(1, i_1_ << 16 | i_2_, i_3_, "");
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ah.alj(").append(')').toString());
        }
    }

    static final void method3574(ScriptRuntime runtime) {
        try {
            int componentID = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
            IComponentDefinition componentDefinition = IComponentDefinition.getInterfaceComponent(componentID);
            if (null == componentDefinition.opBase)
                runtime.objectStack[((runtime.objectArgs += 969361751) * -203050393) - 1] = "";
            else
                runtime.objectStack[((runtime.objectArgs += 969361751) * -203050393) - 1] = componentDefinition.opBase;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("acs.sw(").append(')').toString());
        }
    }

    static final void method4930(ScriptRuntime runtime) {
        runtime.integerStackOffset -= -1175642067;
        int i_4_ = (runtime.integerStack[runtime.integerStackOffset * 681479919]);
        int i_5_ = (runtime.integerStack[681479919 * runtime.integerStackOffset + 1]);
        int i_6_ = (runtime.integerStack[runtime.integerStackOffset * 681479919 + 2]);
        Class298_Sub37_Sub14 class298_sub37_sub14 = StaticMethods.aClass469_5618.method6045(i_4_);
        if ((class298_sub37_sub14.method3460(i_5_, -827579127).anInt3996 * -1682932563) != 0)
            throw new RuntimeException("");
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = class298_sub37_sub14.method3458(i_5_, i_6_);
    }

    static final void method3971(ScriptRuntime runtime) {
        try {
            int value = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = SettingsManager.settingsManager.water.getSupport(value);
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("np.aoa(").append(')').toString());
        }
    }

    static final void method3970(ScriptRuntime runtime) {
        try {
            runtime.objectArgs -= 1938723502;
            runtime.integerStackOffset -= -783761378;
            String string = (String) (runtime.objectStack[runtime.objectArgs * -203050393]);
            int i_19_ = (runtime.integerStack[681479919 * runtime.integerStackOffset]);
            int i_20_ = (runtime.integerStack[681479919 * runtime.integerStackOffset + 1]);
            String string_21_ = ((String) (runtime.objectStack[-203050393 * runtime.objectArgs + 1]));
            StaticMethods.method4288(string, i_19_ == 1, i_20_, string_21_);
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = Class344.itemIndex * 367592105;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("np.abb(").append(')').toString());
        }
    }

    static void method1303(ScriptRuntime runtime) {
        try {
            runtime.integerStack[681479919 * runtime.integerStackOffset - 2] = (Class316.aClass362_3318.getQuestType((runtime.integerStack[681479919 * runtime.integerStackOffset - 2])).requiredQuests[(runtime.integerStack[runtime.integerStackOffset * 681479919 - 1])]);
            runtime.integerStackOffset -= -391880689;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ev.u(").append(')').toString());
        }
    }

    static final void method1299(ScriptRuntime runtime) {
        try {
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = SettingsManager.settingsManager.maxScreenSize.getValue();
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ev.akh(").append(')').toString());
        }
    }

    static final void method4875(MenuOption menuOption, ScriptRuntime runtime) {
        try {
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = StaticMethods.method2366(menuOption);
            runtime.objectStack[((runtime.objectArgs += 969361751) * -203050393 - 1)] = StaticMethods.getTargetMenuOption(menuOption);
            runtime.objectStack[((runtime.objectArgs += 969361751) * -203050393 - 1)] = Class104.method1107(menuOption);
            runtime.objectStack[((runtime.objectArgs += 969361751) * -203050393 - 1)] = VarDefinition.method1933(menuOption);
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("qd.v(").append(')').toString());
        }
    }

    static final void SET_CAMERA_PITCH(ScriptRuntime runtime) {
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = (int) GameClient.cameraYAngle >> 3;
    }

    static final void method4870(ScriptRuntime runtime) {
        try {
            Class301_Sub1.aBoolean7635 = (runtime.integerStack[(runtime.integerStackOffset -= -391880689) * 681479919]) == 1;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("qd.aez(").append(')').toString());
        }
    }

    static final void method1135(Class365_Sub1 class365_sub1, ScriptRuntime runtime) {
        try {
            boolean bool = false;
            int i_69_ = 0;
            int i_70_ = 0;
            int i_71_ = 0;
            int i_72_ = 0;
            if (class365_sub1.aClass302_Sub1Array7726 != null) {
                for (int i_73_ = 0; i_73_ < class365_sub1.aClass302_Sub1Array7726.length; i_73_++) {
                    Class302_Sub1 class302_sub1 = class365_sub1.aClass302_Sub1Array7726[i_73_];
                    if (class302_sub1.aBoolean7644) {
                        int i_74_;
                        int i_75_;
                        if (class302_sub1.anInt7643 < class302_sub1.anInt7641) {
                            i_74_ = (class302_sub1.anInt7643 - class302_sub1.anInt7645);
                            i_75_ = (class302_sub1.anInt7641 + class302_sub1.anInt7645);
                        } else {
                            i_74_ = (class302_sub1.anInt7641 - class302_sub1.anInt7645);
                            i_75_ = (class302_sub1.anInt7645 + class302_sub1.anInt7643);
                        }
                        int i_76_;
                        int i_77_;
                        if (class302_sub1.anInt7640 < class302_sub1.anInt7642) {
                            i_76_ = (class302_sub1.anInt7640 - class302_sub1.anInt7645);
                            i_77_ = (class302_sub1.anInt7645 + class302_sub1.anInt7642);
                        } else {
                            i_76_ = (class302_sub1.anInt7642 - class302_sub1.anInt7645);
                            i_77_ = (class302_sub1.anInt7645 + class302_sub1.anInt7640);
                        }
                        if (!bool || i_74_ < i_69_)
                            i_69_ = i_74_;
                        if (!bool || i_76_ < i_70_)
                            i_70_ = i_76_;
                        if (!bool || i_75_ > i_71_)
                            i_71_ = i_75_;
                        if (!bool || i_77_ > i_72_)
                            i_72_ = i_77_;
                        bool = true;
                    }
                }
            }
            runtime.integerStack[(runtime.integerStackOffset += -391880689) * 681479919 - 1] = bool ? 1 : 0;
            runtime.integerStack[(runtime.integerStackOffset += -391880689) * 681479919 - 1] = i_69_;
            runtime.integerStack[(runtime.integerStackOffset += -391880689) * 681479919 - 1] = i_70_;
            runtime.integerStack[(runtime.integerStackOffset += -391880689) * 681479919 - 1] = i_71_;
            runtime.integerStack[(runtime.integerStackOffset += -391880689) * 681479919 - 1] = i_72_;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("eg.apj(").append(')').toString());
        }
    }

    static final void method1134(ScriptRuntime runtime) {
        try {
            int i_68_ = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
            Class298_Sub37_Sub13 class298_sub37_sub13 = Class298_Sub7.method2864();
            if (null != class298_sub37_sub13) {
                boolean bool = class298_sub37_sub13.method3451(i_68_ >> 14 & 0x3fff, i_68_ & 0x3fff, Class388.anIntArray4156);
                if (bool) {
                    runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = Class388.anIntArray4156[1];
                    runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = Class388.anIntArray4156[2];
                } else {
                    runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = -1;
                    runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = -1;
                }
            } else {
                runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = -1;
                runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = -1;
            }
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("eg.aee(").append(')').toString());
        }
    }

    static final void getClanManager(ScriptRuntime runtime) {
        if (null != ClanChannelChat.clanManager) {
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = 1;
            runtime.clanChannelChat = ClanChannelChat.clanManager;
        } else
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = 0;
    }

    static final void method1132(ScriptRuntime runtime) {
        try {
            int i_67_ = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
            OutgoingPacketBuffer outgoingPacketBuffer = Class18.method359(OutgoingPacket.GRAND_EXCHANGE_ITEM_SELECT, ConnectionType.gameConnection.encryptor);
            outgoingPacketBuffer.payload.writeShort(i_67_);
            ConnectionType.gameConnection.sendFrame(outgoingPacketBuffer);
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("eg.su(").append(')').toString());
        }
    }

    static void method1130(ScriptRuntime runtime) {
        try {
            runtime.integerStack[runtime.integerStackOffset * 681479919 - 1] = (Class316.aClass362_3318.getQuestType((runtime.integerStack[runtime.integerStackOffset * 681479919 - 1])).method4563(Class128.playerVarsProvider, GameClient.anIntArray8828)) ? 1 : 0;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("eg.m(").append(')').toString());
        }
    }

    static final void method876(ScriptRuntime runtime) {
        try {
            int i_9_ = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
            PublicMessage publicMessage = PublicMessage.getMessageCharacterCount(i_9_);
            int i_10_ = 0;
            if (publicMessage != null)
                i_10_ = publicMessage.anInt1092 * 1016049299;
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = i_10_;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("di.acf(").append(')').toString());
        }
    }

    static final void method875(ScriptRuntime runtime) {
        try {
            SettingsManager.settingsManager.setValue(SettingsManager.settingsManager.multisample, (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]));
            Class370.loadingPleaseWait(SettingsManager.settingsManager.toolkitSetting.getValue(), false);
            ToMoveSettings.encodeBuffer();
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("di.aia(").append(')').toString());
        }
    }

    static final void method874(ScriptRuntime runtime) {
        try {
            long l = (runtime.longStacks[((runtime.longArgs -= -682569305) * 1685767703)]);
            runtime.objectStack[((runtime.objectArgs += 969361751) * -203050393 - 1)] = l == -1L ? "" : Long.toString(l, 36).toUpperCase();
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("di.aab(").append(')').toString());
        }
    }

    static final void method6207(ScriptRuntime runtime) {
        SettingsManager.settingsManager.setValue(SettingsManager.settingsManager.cpu, (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]));
        ToMoveSettings.encodeBuffer();
    }

    static final void method6252(ScriptRuntime runtime) {
        try {
            String string = (String) (runtime.objectStack[(runtime.objectArgs -= 969361751) * -203050393]);
            boolean bool = ((runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]) == 1);
            Class311.method3817(string, bool, 729356820);
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = Class344.itemIndex * 367592105;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("uv.adv(").append(')').toString());
        }
    }

    static final void method5885(ScriptRuntime runtime) {
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = Class95.anInt923 * -2009663223;
    }

    static final void method5886(ScriptRuntime runtime) {
        String string = (String) (runtime.objectStack[(runtime.objectArgs -= 969361751) * -203050393]);
        StaticMethods.method6194(string);
    }

    static final void method5933(ScriptRuntime runtime) {
        runtime.integerStackOffset -= -783761378;
        int animationID = (runtime.integerStack[runtime.integerStackOffset * 681479919]);
        int key = (runtime.integerStack[runtime.integerStackOffset * 681479919 + 1]);
        Class497 class497 = Class92.aClass504_905.get(key);
        if (class497.method6206())
            runtime.objectStack[((runtime.objectArgs += 969361751) * -203050393) - 1] = Js5Configs.animsList.get(animationID).stringAttribute(key, class497.aString6101);
        else
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = (Js5Configs.animsList.get(animationID).method4881(key, -388931549 * class497.size));
    }

    static final void method1313(ScriptRuntime runtime) {
        SettingsManager.settingsManager.setValue(SettingsManager.settingsManager.flickeringEffects, (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]) == 1 ? 1 : 0);
        ToMoveSettings.encodeBuffer();
        GameClient.sentPreferences = false;
    }

    static final void method4701(ScriptRuntime runtime) {
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = Class315.method3837() ? 1 : 0;
    }

    static final void method4702(ScriptRuntime runtime) {
        Class298_Sub37_Sub13 class298_sub37_sub13 = Class298_Sub7.method2864();
        if (class298_sub37_sub13 != null) {
            boolean bool = (class298_sub37_sub13.method3451((WorldMapHandler.mapX + 1196508279 * Class82_Sub14.anInt6875), 1882038855 * Class376.anInt4090 + WorldMapHandler.mapY, Class388.anIntArray4156));
            if (bool) {
                runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = Class388.anIntArray4156[1];
                runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = Class388.anIntArray4156[2];
            } else {
                runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = -1;
                runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = -1;
            }
        } else {
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = -1;
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = -1;
        }
    }

    static final void method4697(ScriptRuntime runtime) {
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = SettingsManager.settingsManager.screenSize.getValue();
    }

    static final void method4698(ScriptRuntime runtime) {
        int value = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = SettingsManager.settingsManager.buildArea.getSupport(value);
    }

    static final void method4696(ScriptRuntime runtime) {
        runtime.integerStackOffset -= -1567522756;
        int i_1_ = (runtime.integerStack[681479919 * runtime.integerStackOffset]);
        int i_2_ = (runtime.integerStack[1 + runtime.integerStackOffset * 681479919]);
        int id = (runtime.integerStack[runtime.integerStackOffset * 681479919 + 2]);
        int key = (runtime.integerStack[3 + 681479919 * runtime.integerStackOffset]);
        ClientScriptMap scriptMap = Class51.aClass475_506.getClientScriptMap(id);
        if (scriptMap.aChar6042 != i_1_ || scriptMap.aChar6037 != i_2_)
            throw new RuntimeException(new StringBuilder().append(id).append(" ").append(key).toString());
        if (i_2_ == 115)
            runtime.objectStack[((runtime.objectArgs += 969361751) * -203050393) - 1] = scriptMap.getMap(key);
        else
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = scriptMap.method6125(key);
    }

    static final void method4289(ScriptRuntime runtime) {
        runtime.integerStackOffset -= -783761378;
        int i_7_ = (runtime.integerStack[runtime.integerStackOffset * 681479919]);
        int i_8_ = (runtime.integerStack[681479919 * runtime.integerStackOffset + 1]);
        if (i_7_ == 0)
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = 0;
        else if (i_8_ == 0)
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = 2147483647;
        else
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = (int) Math.pow((double) i_7_, 1.0 / (double) i_8_);
    }

    static final void method4285(ScriptRuntime runtime) {
        runtime.integerStackOffset -= -1175642067;
        StaticMethods.method967((runtime.integerStack[681479919 * runtime.integerStackOffset]), (runtime.integerStack[(runtime.integerStackOffset * 681479919 + 1)]), (runtime.integerStack[2 + (runtime.integerStackOffset * 681479919)]));
    }

    static void method4286(ScriptRuntime runtime) {
        runtime.objectStack[((runtime.objectArgs += 969361751) * -203050393 - 1)] = (Class316.aClass362_3318.getQuestType((runtime.integerStack[runtime.integerStackOffset * 681479919 - 2])).requiredVarpsText[(runtime.integerStack[runtime.integerStackOffset * 681479919 - 1])]);
        runtime.integerStackOffset -= -783761378;
    }

    static final void method887(ScriptRuntime runtime) {
        try {
            runtime.integerStackOffset -= -783761378;
            int i_2_ = (runtime.integerStack[681479919 * runtime.integerStackOffset]);
            int i_3_ = (runtime.integerStack[1 + runtime.integerStackOffset * 681479919]);
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = i_2_ | 1 << i_3_;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("xm.yj(").append(')').toString());
        }
    }

    static final void method3912(ScriptRuntime runtime) {
        int value = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = SettingsManager.settingsManager.fog.getSupport(value);
    }

    static final void method2113(ScriptRuntime runtime) {
        int i_15_ = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        if (GameClient.anInt8942 * 1131012101 == 2 && i_15_ < -1054937867 * GameClient.anInt8941)
            runtime.objectStack[((runtime.objectArgs += 969361751) * -203050393) - 1] = GameClient.aStringArray8947[i_15_];
        else
            runtime.objectStack[((runtime.objectArgs += 969361751) * -203050393) - 1] = "";
    }

    static final void method2111(ScriptRuntime runtime) {
        runtime.integerStackOffset -= -783761378;
        int i_8_ = (runtime.integerStack[681479919 * runtime.integerStackOffset]);
        int i_9_ = (runtime.integerStack[1 + 681479919 * runtime.integerStackOffset]);
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = ItemDefinition.method2845(i_8_, i_9_, true, false);
    }

    static void onLoadHook(ScriptNode scriptNode, int limit) {
        Object[] parameters = scriptNode.parameters;
        int scriptID = ((Integer) parameters[0]).intValue();
        CS2ScriptDefinition scriptDefinition = CS2ScriptDefinition.getClientScript(scriptID);
        if (scriptDefinition != null) {
            ScriptRuntime runtime = method1950();
            runtime.integerLocals = new int[scriptDefinition.maxIntLocals * -1516159487];
            int loclaInts = 0;
            runtime.objectLocals = new String[scriptDefinition.maxObjectLocals * 1787035509];
            int localObjs = 0;
            runtime.longLocals = new long[1679522843 * scriptDefinition.maxLongLocals];
            int localLongs = 0;
            for (int index = 1; index < parameters.length; index++) {
                if (parameters[index] instanceof Integer) {
                    int localInteger = ((Integer) parameters[index]).intValue();
                    if (-2147483647 == localInteger)
                        localInteger = scriptNode.anInt7526 * 1893415363;
                    if (localInteger == -2147483646)
                        localInteger = -54723935 * scriptNode.anInt7527;
                    if (localInteger == -2147483645)
                        localInteger = (scriptNode.aClass105_7525 != null ? (scriptNode.aClass105_7525.interfaceHash) : -1);
                    if (-2147483644 == localInteger)
                        localInteger = 426539335 * scriptNode.anInt7528;
                    if (-2147483643 == localInteger)
                        localInteger = (scriptNode.aClass105_7525 != null ? -1309843523 * (scriptNode.aClass105_7525.slot) : -1);
                    if (-2147483642 == localInteger)
                        localInteger = (null != scriptNode.aClass105_7529 ? (scriptNode.aClass105_7529.interfaceHash) : -1);
                    if (localInteger == -2147483641)
                        localInteger = (scriptNode.aClass105_7529 != null ? (scriptNode.aClass105_7529.slot * -1309843523) : -1);
                    if (-2147483640 == localInteger)
                        localInteger = -1652898593 * scriptNode.anInt7532;
                    if (-2147483639 == localInteger)
                        localInteger = scriptNode.anInt7531 * -2080757995;
                    runtime.integerLocals[loclaInts++] = localInteger;
                } else if (parameters[index] instanceof String) {
                    String string = (String) parameters[index];
                    //System.out.println("CS2 Script " + scriptID + ": parameter" + index + "- " + string);
                    if (string.equals("event_opbase"))
                        string = scriptNode.aString7523;
                    runtime.objectLocals[localObjs++] = string;
                } else if (parameters[index] instanceof Long) {
                    long localLong = ((Long) parameters[index]).longValue();
                    runtime.longLocals[localLongs++] = localLong;
                }
            }
            runtime.anInt5254 = scriptNode.anInt7524 * -323690565;
            ClientScriptsExecutor.executeScript(scriptDefinition, limit, runtime);
        }
    }

    static final void method2266(ScriptRuntime runtime) {
        try {
            runtime.integerStackOffset -= -783761378;
            int i_3_ = (runtime.integerStack[runtime.integerStackOffset * 681479919]);
            int i_4_ = (runtime.integerStack[1 + runtime.integerStackOffset * 681479919]);
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = i_4_ * i_3_;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("kd.yr(").append(')').toString());
        }
    }

    static final void method2268(ScriptRuntime runtime) {
        runtime.integerStackOffset -= -15720283;
        Class139[] class139s = Class139.method6176();
        Class133[] class133s = Class133.method1255();
        Class14.method2200(class139s[(runtime.integerStack[681479919 * runtime.integerStackOffset])], (class133s[(runtime.integerStack[1 + 681479919 * runtime.integerStackOffset])]), (runtime.integerStack[2 + runtime.integerStackOffset * 681479919]), (runtime.integerStack[3 + 681479919 * runtime.integerStackOffset]), (runtime.integerStack[4 + 681479919 * runtime.integerStackOffset]), (runtime.integerStack[runtime.integerStackOffset * 681479919 + 5]), (runtime.integerStack[runtime.integerStackOffset * 681479919 + 6]), (runtime.integerStack[7 + 681479919 * runtime.integerStackOffset]), (runtime.integerStack[runtime.integerStackOffset * 681479919 + 8]), (runtime.integerStack[9 + 681479919 * runtime.integerStackOffset]), (runtime.integerStack[10 + 681479919 * runtime.integerStackOffset]));
    }

    static final void method2281(ScriptRuntime runtime) {
        if (GameClient.fullscreen && GameClient.fullScreenFrame != null)
            Class357.method4276(SettingsManager.settingsManager.screenSize.getValue(), -1, -1, false);
        String string = (String) (runtime.objectStack[(runtime.objectArgs -= 969361751) * -203050393]);
        boolean bool = ((runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]) == 1);
        String string_44_ = new StringBuilder().append(ClientScriptMap.method6131()).append(string).toString();
        ErrorReporter.method4172(string_44_, bool, SettingsManager.settingsManager.toolkitSetting.getValue() == ToolkitOption.OPENGLSPECIAL, GameClient.useJs, GameClient.aBoolean8651, (byte) 49);
    }

    static final void method1392(ScriptRuntime runtime) {
        runtime.integerStackOffset -= -783761378;
        int i_2_ = (runtime.integerStack[681479919 * runtime.integerStackOffset]);
        int i_3_ = (runtime.integerStack[1 + 681479919 * runtime.integerStackOffset]);
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = Class82_Sub2.method878(i_2_, i_3_, true);
    }

    static final void method1393(ScriptRuntime runtime) {
        runtime.integerStackOffset -= -783761378;
        int i_4_ = (runtime.integerStack[runtime.integerStackOffset * 681479919]);
        int i_5_ = (runtime.integerStack[1 + 681479919 * runtime.integerStackOffset]);
        Class74.method830(i_4_, i_5_ >> 14 & 0x3fff, i_5_ & 0x3fff, false);
    }

    static final void method1394(ScriptRuntime runtime) {
        NPC npc = ((NPC) runtime.entity);
        String string = npc.name;
        NPCDefinition npcDefinition = npc.aClass503_10190;
        if (null != npcDefinition.morphisms) {
            npcDefinition = npcDefinition.morph(Class128.playerVarsProvider);
            if (npcDefinition == null)
                string = "";
            else
                string = npcDefinition.name;
        }
        if (string == null)
            string = "";
        runtime.objectStack[((runtime.objectArgs += 969361751) * -203050393 - 1)] = string;
    }

    static final void method4687(ScriptRuntime runtime) {
        runtime.integerStackOffset -= -407600972;
        Class194.closeMenus();
        Class365_Sub1_Sub3_Sub2.method4512(313309588);
        IPAddress.anInt5958 = 1806117321 * (runtime.integerStack[runtime.integerStackOffset * 681479919]);
        Class82_Sub4.anInt6833 = (-1838335691 * (runtime.integerStack[681479919 * runtime.integerStackOffset + 1]));
        Class313.anInt3297 = (389597853 * (runtime.integerStack[2 + 681479919 * runtime.integerStackOffset]));
        Class436.anInt5484 = ((runtime.integerStack[3 + 681479919 * runtime.integerStackOffset]) * -1589801219);
        StaticMethods.anInt3918 = (-666665017 * (runtime.integerStack[4 + runtime.integerStackOffset * 681479919]));
        StaticMethods.anInt8400 = ((runtime.integerStack[5 + runtime.integerStackOffset * 681479919]) * 207797751);
        Class162.anInt1680 = ((runtime.integerStack[6 + 681479919 * runtime.integerStackOffset]) * -741526353);
        Class361.anInt3914 = ((runtime.integerStack[681479919 * runtime.integerStackOffset + 7]) * -221610643);
        Class260.anInt2820 = ((runtime.integerStack[681479919 * runtime.integerStackOffset + 8]) * 1226151685);
        StaticMethods.anInt3674 = (-994575607 * (runtime.integerStack[9 + runtime.integerStackOffset * 681479919]));
        Class298_Sub40_Sub2.anInt9693 = (-1941123577 * (runtime.integerStack[681479919 * runtime.integerStackOffset + 10]));
        ResourceProvider.anInt2710 = ((runtime.integerStack[11 + runtime.integerStackOffset * 681479919]) * -1418353209);
        Js5List.JS5_SPRITES.exists(StaticMethods.anInt3918 * 142643703);
        Js5List.JS5_SPRITES.exists(StaticMethods.anInt8400 * 1757615047);
        Js5List.JS5_SPRITES.exists(1049272911 * Class162.anInt1680);
        Js5List.JS5_SPRITES.exists(-745532315 * Class361.anInt3914);
        Js5List.JS5_SPRITES.exists(Class260.anInt2820 * -684155443);
        Js5List.JS5_SPRITES.exists(ResourceProvider.anInt2710 * -2085188617);
        Js5List.JS5_FONTMETRICS.exists(-2085188617 * ResourceProvider.anInt2710);
        Js5CacheWrite.aClass57_6062 = null;
        OverlayDefinition.aClass57_4070 = null;
        Class367.aClass57_4001 = null;
        Class74.aClass57_700 = null;
        Class423.aClass57_5356 = null;
        Class313.aClass57_3299 = null;
        Class82_Sub8.aClass57_6855 = null;
        ClassNotAnim.aClass57_6123 = null;
        Class436.aBoolean5496 = true;
    }

    static final void method4688(ScriptRuntime runtime) {
        try {
            runtime.integerStackOffset -= -783761378;
            int i_9_ = (runtime.integerStack[681479919 * runtime.integerStackOffset]);
            int i_10_ = (runtime.integerStack[681479919 * runtime.integerStackOffset + 1]);
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = i_9_ > i_10_ ? i_9_ : i_10_;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("pw.zw(").append(')').toString());
        }
    }

    static final void method4689(ScriptRuntime runtime) {
        try {
            String string = (String) (runtime.objectStack[(runtime.objectArgs -= 969361751) * -203050393]);
            int i_11_ = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
            runtime.objectStack[((runtime.objectArgs += 969361751) * -203050393 - 1)] = new StringBuilder().append(string).append(i_11_).toString();
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("pw.zi(").append(')').toString());
        }
    }

    static final void method2570(ScriptRuntime runtime) {
        try {
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = (int) (GameClient.aLong8645 * -5648129435911399733L >> 32);
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = (int) (GameClient.aLong8645 * -5648129435911399733L & 0xffffffffffffffffL);
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("lk.ahf(").append(')').toString());
        }
    }

    static final void method2572(ScriptRuntime runtime) {
        try {
            int i_2_ = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = StaticMethods.aClass469_5618.method6045(i_2_).method3461((short) -22372);
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("lk.adi(").append(')').toString());
        }
    }

    public static final void textEffector(ScriptRuntime runtime) {
        String message = (String) runtime.objectStack[(runtime.objectArgs -= 969361751) * -203050393];
        if (GameClient.localPrivilege * 1806357379 != 0 || ((!GameClient.aBoolean8811 || GameClient.aBoolean8812) && !GameClient.aBoolean8802)) {
            String toLowerCase = message.toLowerCase();
            int i_2_ = 0;
            if (toLowerCase.startsWith(Tradution.yellow_TextEffect.translate(GameLanguage.english))) {
                i_2_ = 0;
                message = message.substring(Tradution.yellow_TextEffect.translate(GameLanguage.english).length());
            } else if (toLowerCase.startsWith(Tradution.red_TextEffect.translate(GameLanguage.english))) {
                i_2_ = 1;
                message = message.substring(Tradution.red_TextEffect.translate(GameLanguage.english).length());
            } else if (toLowerCase.startsWith(Tradution.green_TextEffect.translate(GameLanguage.english))) {
                i_2_ = 2;
                message = message.substring(Tradution.green_TextEffect.translate(GameLanguage.english).length());
            } else if (toLowerCase.startsWith(Tradution.cyan_TextEffect.translate(GameLanguage.english))) {
                i_2_ = 3;
                message = message.substring(Tradution.cyan_TextEffect.translate(GameLanguage.english).length());
            } else if (toLowerCase.startsWith(Tradution.purple_TextEffect.translate(GameLanguage.english))) {
                i_2_ = 4;
                message = message.substring(Tradution.purple_TextEffect.translate(GameLanguage.english).length());
            } else if (toLowerCase.startsWith(Tradution.white_TextEffect.translate(GameLanguage.english))) {
                i_2_ = 5;
                message = message.substring(Tradution.white_TextEffect.translate(GameLanguage.english).length());
            } else if (toLowerCase.startsWith(Tradution.flash_TextEffect.translate(GameLanguage.english))) {
                i_2_ = 6;
                message = message.substring(Tradution.flash_TextEffect.translate(GameLanguage.english).length());
            } else if (toLowerCase.startsWith(Tradution.flash2_TextEffect.translate(GameLanguage.english))) {
                i_2_ = 7;
                message = message.substring(Tradution.flash2_TextEffect.translate(GameLanguage.english).length());
            } else if (toLowerCase.startsWith(Tradution.flash3_TextEffect.translate(GameLanguage.english))) {
                i_2_ = 8;
                message = message.substring(Tradution.flash3_TextEffect.translate(GameLanguage.english).length());
            } else if (toLowerCase.startsWith(Tradution.glow_TextEffect.translate(GameLanguage.english))) {
                i_2_ = 9;
                message = message.substring(Tradution.glow_TextEffect.translate(GameLanguage.english).length());
            } else if (toLowerCase.startsWith(Tradution.glow2_TextEffect.translate(GameLanguage.english))) {
                i_2_ = 10;
                message = message.substring(Tradution.glow2_TextEffect.translate(GameLanguage.english).length());
            } else if (toLowerCase.startsWith(Tradution.glow3_TextEffect.translate(GameLanguage.english))) {
                i_2_ = 11;
                message = message.substring(Tradution.glow3_TextEffect.translate(GameLanguage.english).length());
            } else if (GameLanguage.CURRENT_LANGUAGE != GameLanguage.english) {

                if (toLowerCase.startsWith(Tradution.yellow_TextEffect.translate(GameLanguage.CURRENT_LANGUAGE))) {
                    i_2_ = 0;
                    message = message.substring(Tradution.yellow_TextEffect.translate(GameLanguage.CURRENT_LANGUAGE).length());
                } else if (toLowerCase.startsWith(Tradution.red_TextEffect.translate(GameLanguage.CURRENT_LANGUAGE))) {
                    i_2_ = 1;
                    message = message.substring(Tradution.red_TextEffect.translate(GameLanguage.CURRENT_LANGUAGE).length());
                } else if (toLowerCase.startsWith(Tradution.green_TextEffect.translate(GameLanguage.CURRENT_LANGUAGE))) {
                    i_2_ = 2;
                    message = message.substring(Tradution.green_TextEffect.translate(GameLanguage.CURRENT_LANGUAGE).length());
                } else if (toLowerCase.startsWith(Tradution.cyan_TextEffect.translate(GameLanguage.CURRENT_LANGUAGE))) {
                    i_2_ = 3;
                    message = message.substring(Tradution.cyan_TextEffect.translate(GameLanguage.CURRENT_LANGUAGE).length());
                } else if (toLowerCase.startsWith(Tradution.purple_TextEffect.translate(GameLanguage.CURRENT_LANGUAGE))) {
                    i_2_ = 4;
                    message = message.substring(Tradution.purple_TextEffect.translate(GameLanguage.CURRENT_LANGUAGE).length());
                } else if (toLowerCase.startsWith(Tradution.white_TextEffect.translate(GameLanguage.CURRENT_LANGUAGE))) {
                    i_2_ = 5;
                    message = message.substring(Tradution.white_TextEffect.translate(GameLanguage.CURRENT_LANGUAGE).length());
                } else if (toLowerCase.startsWith(Tradution.flash_TextEffect.translate(GameLanguage.CURRENT_LANGUAGE))) {
                    i_2_ = 6;
                    message = message.substring(Tradution.flash_TextEffect.translate(GameLanguage.CURRENT_LANGUAGE).length());
                } else if (toLowerCase.startsWith(Tradution.flash2_TextEffect.translate(GameLanguage.CURRENT_LANGUAGE))) {
                    i_2_ = 7;
                    message = message.substring(Tradution.flash2_TextEffect.translate(GameLanguage.CURRENT_LANGUAGE).length());
                } else if (toLowerCase.startsWith(Tradution.flash3_TextEffect.translate(GameLanguage.CURRENT_LANGUAGE))) {
                    i_2_ = 8;
                    message = message.substring(Tradution.flash3_TextEffect.translate(GameLanguage.CURRENT_LANGUAGE).length());
                } else if (toLowerCase.startsWith(Tradution.glow_TextEffect.translate(GameLanguage.CURRENT_LANGUAGE))) {
                    i_2_ = 9;
                    message = message.substring(Tradution.glow_TextEffect.translate(GameLanguage.CURRENT_LANGUAGE).length());
                } else if (toLowerCase.startsWith(Tradution.glow2_TextEffect.translate(GameLanguage.CURRENT_LANGUAGE))) {
                    i_2_ = 10;
                    message = message.substring(Tradution.glow2_TextEffect.translate(GameLanguage.CURRENT_LANGUAGE).length());
                } else if (toLowerCase.startsWith(Tradution.glow3_TextEffect.translate(GameLanguage.CURRENT_LANGUAGE))) {
                    i_2_ = 11;
                    message = message.substring(Tradution.glow3_TextEffect.translate(GameLanguage.CURRENT_LANGUAGE).length());
                }
            }

            toLowerCase = message.toLowerCase();
            int i_3_ = 0;
            if (toLowerCase.startsWith(Tradution.wave_TextEffect.translate(GameLanguage.english))) {
                i_3_ = 1;
                message = message.substring(Tradution.wave_TextEffect.translate(GameLanguage.english).length());
            } else if (toLowerCase.startsWith(Tradution.wave2_TextEffect.translate(GameLanguage.english))) {
                i_3_ = 2;
                message = message.substring(Tradution.wave2_TextEffect.translate(GameLanguage.english).length());
            } else if (toLowerCase.startsWith(Tradution.shake_TextEffect.translate(GameLanguage.english))) {
                i_3_ = 3;
                message = message.substring(Tradution.shake_TextEffect.translate(GameLanguage.english).length());
            } else if (toLowerCase.startsWith(Tradution.scroll_TextEffect.translate(GameLanguage.english))) {
                i_3_ = 4;
                message = message.substring(Tradution.scroll_TextEffect.translate(GameLanguage.english).length());
            } else if (toLowerCase.startsWith(Tradution.slide_TextEffect.translate(GameLanguage.english))) {
                i_3_ = 5;
                message = message.substring(Tradution.slide_TextEffect.translate(GameLanguage.english).length());
            } else if (GameLanguage.english != GameLanguage.CURRENT_LANGUAGE) {


                if (toLowerCase.startsWith(Tradution.wave_TextEffect.translate(GameLanguage.CURRENT_LANGUAGE))) {
                    i_3_ = 1;
                    message = message.substring(Tradution.wave_TextEffect.translate(GameLanguage.CURRENT_LANGUAGE).length());
                } else if (toLowerCase.startsWith(Tradution.wave2_TextEffect.translate(GameLanguage.CURRENT_LANGUAGE))) {
                    i_3_ = 2;
                    message = message.substring(Tradution.wave2_TextEffect.translate(GameLanguage.CURRENT_LANGUAGE).length());
                } else if (toLowerCase.startsWith(Tradution.shake_TextEffect.translate(GameLanguage.CURRENT_LANGUAGE))) {
                    i_3_ = 3;
                    message = message.substring(Tradution.shake_TextEffect.translate(GameLanguage.CURRENT_LANGUAGE).length());
                } else if (toLowerCase.startsWith(Tradution.scroll_TextEffect.translate(GameLanguage.CURRENT_LANGUAGE))) {
                    i_3_ = 4;
                    message = message.substring(Tradution.scroll_TextEffect.translate(GameLanguage.CURRENT_LANGUAGE).length());
                } else if (toLowerCase.startsWith(Tradution.slide_TextEffect.translate(GameLanguage.CURRENT_LANGUAGE))) {
                    i_3_ = 5;
                    message = message.substring(Tradution.slide_TextEffect.translate(GameLanguage.CURRENT_LANGUAGE).length());
                }
            }
            ConnectionType connectionType = ConnectionType.getConnectionType();
            OutgoingPacketBuffer outgoingPacketBuffer = Class18.method359(OutgoingPacket.CHAT_PACKET, connectionType.encryptor);
            outgoingPacketBuffer.payload.writeByte(0);
            int i_4_ = (385051775 * outgoingPacketBuffer.payload.offset);
            outgoingPacketBuffer.payload.writeByte(i_2_);
            outgoingPacketBuffer.payload.writeByte(i_3_);
            Class23.method379(outgoingPacketBuffer.payload, message);
            outgoingPacketBuffer.payload.method3649((outgoingPacketBuffer.payload.offset * 385051775) - i_4_);
            connectionType.sendFrame(outgoingPacketBuffer);
        }
    }

    static final void method1084(ScriptRuntime runtime) {
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = 1243777389 * Class360.anInt3866;
    }

    static final void method1251(ScriptRuntime runtime) {
        int i_41_ = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        if (GameClient.aString8804 != null && i_41_ < Class489.anInt6071 * -1801543887)
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = StaticMethods.aClass7Array6846[i_41_].aByte97;
        else
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = 0;
    }

    static final void method1252(ScriptRuntime runtime) {
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = SettingsManager.settingsManager.aClass422_Sub20_7578.getValue();
    }

    static final void method6105(ScriptRuntime runtime) {
        int i_1_ = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        PublicMessage publicMessage = PublicMessage.getMessageCharacterCount(i_1_);
        int i_2_ = -1;
        if (null != publicMessage)
            i_2_ = publicMessage.anInt1085 * 40869749;
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = i_2_;
    }

    static final void method2193(ScriptRuntime runtime) {
        try {
            Class298_Sub52 class298_sub52 = FrameBufferContext.method567(-1558918044);
            if (class298_sub52 == null) {
                runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = -1;
                runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = -1;
            } else {
                runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = class298_sub52.anInt7608 * -530122905;
                int i_6_ = (class298_sub52.anInt7605 * -1740053407 << 28 | (WorldMapHandler.mapX + 2122110429 * class298_sub52.anInt7607) << 14 | (WorldMapHandler.mapY + class298_sub52.anInt7610 * -372920341));
                runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = i_6_;
            }
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("jz.adg(").append(')').toString());
        }
    }

    static final void method2194(ScriptRuntime runtime) {
        try {
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = GameClient.aBoolean8811 && !GameClient.aBoolean8812 ? 1 : 0;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("jz.amz(").append(')').toString());
        }
    }

    static final void method1242(ScriptRuntime runtime) {
        runtime.objectStack[((runtime.objectArgs += 969361751) * -203050393 - 1)] = Class22.method371().toString();
    }

    static final void method2107(ScriptRuntime runtime) {
        Class82_Sub12.method909((String) (runtime.objectStack[(runtime.objectArgs -= 969361751) * -203050393]), -1257906929);
    }

    static final void method2108(ScriptRuntime runtime) {
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = (null == GameClient.currentSceneComponent ? -1 : GameClient.currentSceneComponent.interfaceHash);
    }

    static final void method1997(ScriptRuntime runtime) {
        try {
            int i_1_ = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
            PublicMessage publicMessage = PublicMessage.getMessageCharacterCount(i_1_);
            String string = "";
            if (null != publicMessage && null != publicMessage.aString1089)
                string = publicMessage.aString1089;
            runtime.objectStack[((runtime.objectArgs += 969361751) * -203050393 - 1)] = string;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("jc.acz(").append(')').toString());
        }
    }

    static final void method2003(ScriptRuntime runtime) {
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = Player.myPlayer.aClass386_10084.method4719((byte) 0) >> 3;
    }

    static final void method4863(ScriptRuntime runtime) {
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = SettingsManager.settingsManager.buildArea.getValue();
    }

    static final void method4864(ScriptRuntime runtime) {
        runtime.integerStackOffset -= -783761378;
        int i_4_ = (runtime.integerStack[runtime.integerStackOffset * 681479919]);
        int i_5_ = (runtime.integerStack[1 + 681479919 * runtime.integerStackOffset]);
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = (GraphicsToolkit.aClass256_5315.method2441(i_4_, 2021332528).aCharArray9597[i_5_]);
    }

    static final void method4925(ScriptRuntime runtime) {
        try {
            SettingsManager.settingsManager.setValue(SettingsManager.settingsManager.groundBlending, (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]) != 0 ? 1 : 0);
            ToMoveSettings.encodeBuffer();
            GameClient.myRegion.method2667();
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("qm.aip(").append(')').toString());
        }
    }

    static final void method1940(ScriptRuntime runtime) {
        runtime.integerStackOffset -= -783761378;
        int i_12_ = (runtime.integerStack[681479919 * runtime.integerStackOffset]);
        int i_13_ = (runtime.integerStack[runtime.integerStackOffset * 681479919 + 1]);
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = i_12_ & -1 - (1 << i_13_);
    }

    static final void method3871(ScriptRuntime runtime) {
        try {
            runtime.integerStackOffset -= -1959403445;
            int i_10_ = (runtime.integerStack[681479919 * runtime.integerStackOffset]);
            int i_11_ = (runtime.integerStack[1 + runtime.integerStackOffset * 681479919]);
            int i_12_ = (runtime.integerStack[runtime.integerStackOffset * 681479919 + 2]);
            int i_13_ = (runtime.integerStack[3 + 681479919 * runtime.integerStackOffset]);
            int i_14_ = (runtime.integerStack[4 + runtime.integerStackOffset * 681479919]);
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = (i_11_ - i_10_) * (i_14_ - i_12_) / (i_13_ - i_12_) + i_10_;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ng.yo(").append(')').toString());
        }
    }

    static final void method3872(ScriptRuntime runtime) {
        try {
            runtime.integerStackOffset -= -783761378;
            GameClient.aShort8928 = (short) (runtime.integerStack[runtime.integerStackOffset * 681479919]);
            if (GameClient.aShort8928 <= 0)
                GameClient.aShort8928 = (short) 256;
            GameClient.aShort8929 = (short) (runtime.integerStack[681479919 * runtime.integerStackOffset + 1]);
            if (GameClient.aShort8929 <= 0)
                GameClient.aShort8929 = (short) 205;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ng.akb(").append(')').toString());
        }
    }

    static final void method3870(ScriptRuntime runtime) {
        try {
            if (GameClient.anInt8942 * 1131012101 == 0)
                runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = -2;
            else if (GameClient.anInt8942 * 1131012101 == 1)
                runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = -1;
            else
                runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = GameClient.anInt8941 * -1054937867;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ng.vb(").append(')').toString());
        }
    }

    static final void method5607(ScriptRuntime runtime) {
        int listID = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = GameClient.stockMarketListing[listID].anInt2769 * 1383593425;
    }

    static final void method3429(ScriptRuntime runtime) {
        String string = (String) (runtime.objectStack[(runtime.objectArgs -= 969361751) * -203050393]);
        int i_17_ = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        runtime.objectStack[((runtime.objectArgs += 969361751) * -203050393 - 1)] = new StringBuilder().append(string).append(Class128_Sub1.method1440(i_17_, true, (byte) 8)).toString();
    }

    static final void method4911(ScriptRuntime runtime) {
        method4926((runtime.integerStack[(runtime.integerStackOffset -= -391880689) * 681479919]));
    }

    static final void method6288(ScriptRuntime runtime) {
        runtime.objectArgs -= 969361751;
        runtime.integerStackOffset -= -1175642067;
        String string = (String) (runtime.objectStack[-203050393 * runtime.objectArgs]);
        boolean bool = ((runtime.integerStack[681479919 * runtime.integerStackOffset]) == 1);
        boolean bool_2_ = 1 == (runtime.integerStack[1 + 681479919 * runtime.integerStackOffset]);
        boolean bool_3_ = ((runtime.integerStack[runtime.integerStackOffset * 681479919 + 2]) == 1);
        OutgoingPacketBuffer outgoingPacketBuffer = Class18.method359(OutgoingPacket.aClass198_2093, ConnectionType.lobbyConnection.encryptor);
        outgoingPacketBuffer.payload.writeShort(StaticMethods.method693(string) + 1);
        outgoingPacketBuffer.payload.writeString(string);
        int i_4_ = 0;
        if (bool)
            i_4_ |= 0x1;
        if (bool_2_)
            i_4_ |= 0x2;
        if (bool_3_)
            i_4_ |= 0x4;
        outgoingPacketBuffer.payload.writeByte(i_4_);
        ConnectionType.lobbyConnection.sendFrame(outgoingPacketBuffer);
    }

    static final void getItemMembersOnly(ScriptRuntime runtime) {
        int itemID = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = (Js5Configs.itemList.getItemDefinitions(itemID).membersOnly) ? 1 : 0;
    }

    static final void method396(ScriptRuntime runtime) {
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = runtime.entity.method4363();
    }

    static void method6061(ScriptRuntime runtime) {
        runtime.integerStack[681479919 * runtime.integerStackOffset - 1] = (Class316.aClass362_3318.getQuestType((runtime.integerStack[runtime.integerStackOffset * 681479919 - 1])).anInt4011) * -1570899057;
    }

    static final void getItemValue(ScriptRuntime runtime) {
        int itemID = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = (Js5Configs.itemList.getItemDefinitions(itemID).value) * 785788887;
    }

    static final void method4571(ScriptRuntime runtime) {
        int i_39_ = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = runtime.aClass162_5252.anIntArray1666[i_39_];
    }

    static final void method4312(ScriptRuntime runtime, byte i) {
        try {
            int i_5_ = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
            if (2 == 1131012101 * GameClient.anInt8942 && i_5_ < GameClient.anInt8941 * -1054937867)
                runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = GameClient.anIntArray8946[i_5_];
            else
                runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = 0;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("pb.vx(").append(')').toString());
        }
    }

    static final void method4309(ScriptRuntime runtime) {
        int listingIndex = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        int listingStatus = GameClient.stockMarketListing[listingIndex].getListingStatus();
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = listingStatus == 0 ? 1 : 0;
    }

    static final void method6005(ScriptRuntime runtime) {
        int index = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        if (null != GameClient.aString8804 && index < Class489.anInt6071 * -1801543887)
            runtime.objectStack[((runtime.objectArgs += 969361751) * -203050393) - 1] = StaticMethods.aClass7Array6846[index].aString93;
        else
            runtime.objectStack[((runtime.objectArgs += 969361751) * -203050393) - 1] = "";
    }

    static void method6004(ScriptRuntime runtime) {
        runtime.objectStack[((runtime.objectArgs += 969361751) * -203050393 - 1)] = (Class316.aClass362_3318.getQuestType((runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)])).sortName);
    }

    static final void method965(ScriptRuntime runtime) {
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = runtime.aClass162_5252.aByte1672;
    }

    static final void method968(ScriptRuntime runtime) {
        String string = (String) (runtime.objectStack[(runtime.objectArgs -= 969361751) * -203050393]);
        runtime.integerStackOffset -= -1175642067;
        int i_0_ = (runtime.integerStack[681479919 * runtime.integerStackOffset]);
        int i_1_ = (runtime.integerStack[runtime.integerStackOffset * 681479919 + 1]);
        int i_2_ = (runtime.integerStack[2 + 681479919 * runtime.integerStackOffset]);
        StaticMethods.method5846(string, i_0_ == 1, i_1_, i_2_);
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = Class344.itemIndex * 367592105;

    }

    static final void method2116(ScriptRuntime runtime) {
        String string = (String) (runtime.objectStack[(runtime.objectArgs -= 969361751) * -203050393]);
        StringBuilder stringbuilder = new StringBuilder(string.length());
        boolean bool = false;
        for (int i_0_ = 0; i_0_ < string.length(); i_0_++) {
            char c = string.charAt(i_0_);
            if (c == '<')
                bool = true;
            else if (c == '>')
                bool = false;
            else if (!bool)
                stringbuilder.append(c);
        }
        runtime.objectStack[((runtime.objectArgs += 969361751) * -203050393 - 1)] = stringbuilder.toString();
    }

    static final void method908(ScriptRuntime runtime) {
        method1135((runtime.aClass365_Sub1_Sub4_Sub1_5253), runtime);
    }

    static void method6000(ScriptRuntime runtime) {
        runtime.integerStack[runtime.integerStackOffset * 681479919 - 1] = (Class316.aClass362_3318.getQuestType((runtime.integerStack[681479919 * runtime.integerStackOffset - 1])).anInt4012) * 126451825;
    }

    static final void method2434(ScriptRuntime runtime) {
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = SettingsManager.settingsManager.groundBlending.getGameContext() ? 1 : 0;
    }

    static final void method1388(ScriptRuntime runtime) {
        runtime.integerStackOffset -= -1175642067;
        int i_2_ = (runtime.integerStack[runtime.integerStackOffset * 681479919]);
        int i_3_ = (runtime.integerStack[runtime.integerStackOffset * 681479919 + 1]);
        int i_4_ = (runtime.integerStack[runtime.integerStackOffset * 681479919 + 2]);
        Class301_Sub1.method3713(6, i_2_ << 16 | i_3_, i_4_, "");
    }

    static final void method5867(ScriptRuntime runtime) {
        int i_4_ = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        Class352 class352 = Class363.aClass339_3931.method4116(i_4_);
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = 715019623 * class352.anInt3785;
    }

    static final void setItemGroundOption(ScriptRuntime runtime) {
        runtime.integerStackOffset -= -783761378;
        int itemID = (runtime.integerStack[681479919 * runtime.integerStackOffset]);
        int optionID = (runtime.integerStack[runtime.integerStackOffset * 681479919 + 1]);
        ItemDefinition itemDefinitions = Js5Configs.itemList.getItemDefinitions(itemID);
        if (optionID >= 1 && optionID <= 5 && itemDefinitions.groundOptions[optionID - 1] != null)
            runtime.objectStack[((runtime.objectArgs += 969361751) * -203050393) - 1] = itemDefinitions.groundOptions[optionID - 1];
        else
            runtime.objectStack[((runtime.objectArgs += 969361751) * -203050393) - 1] = "";
    }

    static final void method1934(ScriptRuntime runtime) {
        runtime.integerStackOffset -= -783761378;
        int i_9_ = (runtime.integerStack[runtime.integerStackOffset * 681479919]);
        int i_10_ = (runtime.integerStack[1 + 681479919 * runtime.integerStackOffset]);
        Class74.method830(i_9_, i_10_ >> 14 & 0x3fff, i_10_ & 0x3fff, true);
    }

    static final void method1935(ScriptRuntime runtime) {
        if (154600941 * Class12.systemInfo.javaVersion < 6)
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = 0;
        else if (6 == 154600941 * Class12.systemInfo.javaVersion && (Class12.systemInfo.javaSubSubVersion * 1324779323 < 10))
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = 0;
        else
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = 1;
    }

    static final void method1143(ScriptRuntime runtime) {
        int i_6_ = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = runtime.aClass162_5252.aByteArray1657[i_6_];
    }

    static final void isAlphabetical(ScriptRuntime runtime) {
        int keyCode = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = StringUtils.isAlphabetic((char) keyCode) ? 1 : 0;
    }

    static final void getBloomValue(ScriptRuntime runtime) {
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = SettingsManager.settingsManager.bloom.getValue() == BloomSettings.BLOOMON ? BloomSettings.BLOOMON : BloomSettings.BLOOMOFF;
    }

    static final void setIdleAnimation(ScriptRuntime runtime) {
        SettingsManager.settingsManager.setValue(SettingsManager.settingsManager.idleAnimations, (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]));
        ToMoveSettings.encodeBuffer();
    }

    static final void method1139(ScriptRuntime runtime) {
        try {
            runtime.objectArgs -= 1938723502;
            String string = (String) (runtime.objectStack[-203050393 * runtime.objectArgs]);
            String string_2_ = ((String) (runtime.objectStack[1 + -203050393 * runtime.objectArgs]));
            runtime.integerStackOffset -= -783761378;
            int i_3_ = (runtime.integerStack[runtime.integerStackOffset * 681479919]);
            int i_4_ = (runtime.integerStack[runtime.integerStackOffset * 681479919 + 1]);
            if (null == string_2_)
                string_2_ = "";
            if (string_2_.length() > 80)
                string_2_ = string_2_.substring(0, 80);
            ConnectionType connectionType = ConnectionType.getConnectionType();
            OutgoingPacketBuffer outgoingPacketBuffer = Class18.method359(OutgoingPacket.aClass198_2085, connectionType.encryptor);
            outgoingPacketBuffer.payload.writeByte((StaticMethods.method693(string) + 2 + StaticMethods.method693(string_2_)));
            outgoingPacketBuffer.payload.writeString(string);
            outgoingPacketBuffer.payload.writeByte(i_3_ - 1);
            outgoingPacketBuffer.payload.writeByte(i_4_);
            outgoingPacketBuffer.payload.writeString(string_2_);
            connectionType.sendFrame(outgoingPacketBuffer);
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ej.abn(").append(')').toString());
        }
    }

    public static void method1405(CS2Context context, int i, int i_5_) {
        ScriptRuntime runtime = method1950();
        SubIncommingPacket.method1925(context, i, i_5_, runtime);
    }

    public static void method3853() {
        if (19 == -1233866115 * GameClient.gameState && (!Class315.method3837() && !Class489.method6167()))
            Class439.loadGameState(2);
    }

    static final void method3854(ScriptRuntime runtime) {
        int i_9_ = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = i_9_ >> 28;
    }

    static final void method3851(ScriptRuntime runtime) {
        if (GameClient.aString8656 != null)
            runtime.objectStack[((runtime.objectArgs += 969361751) * -203050393) - 1] = GameClient.aString8656;
        else
            runtime.objectStack[((runtime.objectArgs += 969361751) * -203050393) - 1] = "";
    }

    static final void method3965(ScriptRuntime runtime) {
        int count = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        PublicMessage publicMessage = PublicMessage.getMessageCharacterCount(count);
        String string = "";
        if (publicMessage != null && null != publicMessage.playerTitle)
            string = publicMessage.playerTitle;
        runtime.objectStack[((runtime.objectArgs += 969361751) * -203050393 - 1)] = string;
    }

    static final void method1547(ScriptRuntime runtime) {
        int tileHash = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        Class298_Sub37_Sub13 class298_sub37_sub13 = WorldMapHandler.method3708(tileHash >> 14 & 0x3fff, tileHash & 0x3fff);
        if (class298_sub37_sub13 == null)
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = -1;
        else
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = class298_sub37_sub13.anInt9643 * -947282109;
    }

    static final void method1546(ScriptRuntime runtime) {
        int i_3_ = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        PublicMessage publicMessage = PublicMessage.getMessageCharacterCount(i_3_);
        String string = "";
        if (null != publicMessage && publicMessage.playerName != null)
            string = publicMessage.playerName;
        runtime.objectStack[((runtime.objectArgs += 969361751) * -203050393 - 1)] = string;
    }

    static final void method3930(ScriptRuntime runtime) {
        int i_0_ = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        if (GameClient.aString8804 != null && i_0_ < -1801543887 * Class489.anInt6071)
            runtime.objectStack[((runtime.objectArgs += 969361751) * -203050393) - 1] = StaticMethods.aClass7Array6846[i_0_].aString96;
        else
            runtime.objectStack[((runtime.objectArgs += 969361751) * -203050393) - 1] = "";
    }

    static final void method3583(ScriptRuntime runtime) {
        runtime.integerStackOffset -= -783761378;
        int i_2_ = (runtime.integerStack[runtime.integerStackOffset * 681479919]);
        int i_3_ = (runtime.integerStack[1 + runtime.integerStackOffset * 681479919]);
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = Class82_Sub2.method878(i_2_, i_3_, false);
    }

    static final void method2418(ScriptRuntime runtime) {
        runtime.integerStackOffset -= -391880689;
    }

    static final void method2419(ScriptRuntime runtime) {
        String string = (String) (runtime.objectStack[(runtime.objectArgs -= 969361751) * -203050393]);
        if (string.startsWith(StaticMethods.method2368(0)) || string.startsWith(StaticMethods.method2368(1)))
            string = string.substring(7);
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = StaticMethods.method6098(string);
    }

    static final void method2420(ScriptRuntime runtime) {
        Class343_Sub1 class343_sub1 = Class522.method6328((byte) 29);
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = (class343_sub1 == null ? 0 : class343_sub1.anInt3670 * -877023375);
    }

    static final void method2421(ScriptRuntime runtime) {
        int i_10_ = (runtime.integerstack[runtime.integerPos * 1883543357]);
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = ((Player) runtime.entity).aClass70_10223.method799(i_10_, -1034906382);
    }

    static final void method6280(ScriptRuntime runtime) {
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = StaticMethods.getMessageCapacity();
    }

    static final void method1032(ScriptRuntime runtime) {
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = LightingDetails.method4336(2134288170).getID();
    }

    static final void method2727(ScriptRuntime runtime) {
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = -1372893999 * Class360.anInt3871;
    }

    static final void method3730(ScriptRuntime runtime) {
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = Class173.aByte1759;
    }

    static final void method3729(ScriptRuntime runtime) {
        String string = (String) (runtime.objectStack[(runtime.objectArgs -= 969361751) * -203050393]);
        int containerID = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        RSFontMetrics RSFontMetrics = Class322.getFontMetricFileData(Js5List.JS5_FONTMETRICS, containerID, 0);
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = RSFontMetrics.method6254(string, StaticMedia.nameIconSprites);
    }

    static final void method4489(ScriptRuntime runtime) {
        if (EffectiveVertex.aShortArray678 == null || (-316347407 * ResourceProvider.anInt2709 >= Class344.itemIndex * 367592105))
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = -1;
        else
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = ((EffectiveVertex.aShortArray678[(ResourceProvider.anInt2709 += 1578804497) * -316347407 - 1]) & 0xffff);
    }

    static final void method712(ScriptRuntime runtime) {
        int itemID = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = (Js5Configs.itemList.getItemDefinitions(itemID).unknown) * 1764050979;
    }

    static final void method713(ScriptRuntime runtime) {
        if (GameClient.aString8804 != null)
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = -1801543887 * Class489.anInt6071;
        else
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = 0;
    }

    public static void method709(CS2Context context, int i, int i_19_, SceneObject sceneObject) {
        ScriptRuntime runtime = method1950();
        runtime.anSceneObject_5233 = sceneObject;
        SubIncommingPacket.method1925(context, i, i_19_, runtime);
        runtime.anSceneObject_5233 = null;
    }

    static final void method708(ScriptRuntime runtime) {
        runtime.integerStackOffset -= -783761378;
        int i_17_ = (runtime.integerStack[runtime.integerStackOffset * 681479919]);
        int i_18_ = (runtime.integerStack[runtime.integerStackOffset * 681479919 + 1]);
        if (i_18_ == -1)
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = -1;
        else
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = GraphicsToolkit.aClass256_5315.method2441(i_17_, 2082342727).method3431((char) i_18_, 166344309);
    }

    static final void method2460(ScriptRuntime runtime) {
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = SettingsManager.settingsManager.buildArea.method5666(-391880689) ? 1 : 0;
    }

    static final void method1438(ScriptRuntime runtime) {
        int i_8_ = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        int i_9_ = GameClient.stockMarketListing[i_8_].getListingStatus();
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = i_9_ == 2 ? 1 : 0;
    }

    static final void method2838(ScriptRuntime runtime) {
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = Class406.aBoolean5274 ? 1 : 0;

    }

    static final void method4145(ScriptRuntime runtime) {
        int i_53_ = (runtime.integerstack[1883543357 * runtime.integerPos]);
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = ((Player) runtime.entity).aClass70_10223.method798(i_53_);
    }

    static void method905(ScriptRuntime runtime) {
        runtime.integerStack[681479919 * runtime.integerStackOffset - 2] = (Class316.aClass362_3318.getQuestType((runtime.integerStack[runtime.integerStackOffset * 681479919 - 2])).requiredSkills[(runtime.integerStack[runtime.integerStackOffset * 681479919 - 1])][0]);
        runtime.integerStackOffset -= -391880689;
    }

    static final void method2814(ScriptRuntime runtime) {
        int i_2_ = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        NPC npc = ((NPC) runtime.entity);
        int i_3_ = npc.method4462(i_2_);
        int i_4_ = npc.method4466(i_2_);
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = i_3_;
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = i_4_;
    }

    static final void method2813(ScriptRuntime runtime) {
        int itemID = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = (Js5Configs.itemList.getItemDefinitions(itemID).equipType) * 1625363587;
    }

    static final void method4587(ScriptRuntime runtime) {
        runtime.integerStackOffset -= -1567522756;
        int i_0_ = (runtime.integerStack[681479919 * runtime.integerStackOffset]);
        int i_1_ = (runtime.integerStack[runtime.integerStackOffset * 681479919 + 1]);
        int i_2_ = (runtime.integerStack[runtime.integerStackOffset * 681479919 + 2]);
        int i_3_ = (runtime.integerStack[runtime.integerStackOffset * 681479919 + 3]);
        GameScene gameScene = GameClient.myRegion.getGameScene();
        Class97_Sub1.moveCamera(((i_0_ >> 14 & 0x3fff) - gameScene.gameSceneBaseX * -1760580017), ((i_0_ & 0x3fff) - 283514611 * gameScene.gameSceneBaseY), i_1_ << 2, i_2_, i_3_, false);
    }

    static final void method4588(ScriptRuntime runtime) {
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = SettingsManager.settingsManager.idleAnimations.getValue();
    }

    static final void method1422(ScriptRuntime runtime) {
        int i_23_ = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        runtime.objectStack[((runtime.objectArgs += 969361751) * -203050393 - 1)] = (GraphicsToolkit.aClass256_5315.method2441(i_23_, 1350033014).aString9596);
    }

    static final void method367(ScriptRuntime runtime) {
        runtime.integerStackOffset -= -783761378;
        int i_7_ = (runtime.integerStack[runtime.integerStackOffset * 681479919]);
        int i_8_ = (runtime.integerStack[1 + 681479919 * runtime.integerStackOffset]);
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = (GraphicsToolkit.aClass256_5315.method2441(i_7_, -1634888229).aCharArray9595[i_8_]);
    }

    static final void method357(ScriptRuntime runtime) {
        runtime.integerStackOffset -= -783761378;
        if ((runtime.integerStack[runtime.integerStackOffset * 681479919]) <= (runtime.integerStack[1 + runtime.integerStackOffset * 681479919]))
            runtime.integerPos += (286750741 * (runtime.integerstack[runtime.integerPos * 1883543357]));
    }

    static final void method4676(ScriptRuntime runtime) {
        runtime.integerStackOffset -= -783761378;
        int i_0_ = (runtime.integerStack[681479919 * runtime.integerStackOffset]);
        int i_1_ = (runtime.integerStack[1 + runtime.integerStackOffset * 681479919]);
        Class298_Sub37_Sub8 class298_sub37_sub8 = GraphicsToolkit.aClass256_5315.method2441(i_0_, 7133861);
        int i_2_ = class298_sub37_sub8.anIntArray9599[i_1_];
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = i_2_;
    }

    static final void method4677(ScriptRuntime runtime) {
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = SettingsManager.settingsManager.toolkitSetting.getValue();
    }

    static final void method4243(ScriptRuntime runtime) {
        int fileID = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = (Class300.itemContainerDefinitionLoader.getDefinition(fileID).size) * 1317156085;
    }

    static final void method4247(ScriptRuntime runtime) {
        runtime.integerStackOffset -= -783761378;
        Class107.aShortArray1315[(runtime.integerStack[(681479919 * runtime.integerStackOffset)])] = (short) ColorUtils.fromRgb((runtime.integerStack[(681479919 * runtime.integerStackOffset + 1)]));
        Js5Configs.itemList.method6091();
        Js5Configs.itemList.clearSpriteCache();
        NPCDefinitionLoader.npcList.method6273();
        StaticMethods.method4301();
    }

    static final void method4248(ScriptRuntime runtime) {
        int itemID = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        runtime.objectStack[((runtime.objectArgs += 969361751) * -203050393 - 1)] = (Js5Configs.itemList.getItemDefinitions(itemID).name);
        //System.out.println("Some script: " + itemID);

    }

    static final void method4242(ScriptRuntime runtime) {
        runtime.integerStackOffset -= -1959403445;
        ToMoveSettings.method3913((runtime.integerStack[681479919 * runtime.integerStackOffset]), (runtime.integerStack[runtime.integerStackOffset * 681479919 + 1]), (runtime.integerStack[2 + runtime.integerStackOffset * 681479919]), (runtime.integerStack[3 + 681479919 * runtime.integerStackOffset]), false, (runtime.integerStack[runtime.integerStackOffset * 681479919 + 4]));
    }

    static final void method4126(ScriptRuntime runtime) {
        runtime.aClass177_5243 = new Class177();
        runtime.aClass177_5243.anInt1787 = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]) * -1496580327;
        runtime.aClass177_5243.aClass298_Sub37_Sub14_1788 = StaticMethods.aClass469_5618.method6045((-2034569943 * (runtime.aClass177_5243.anInt1787)));
        runtime.aClass177_5243.anIntArray1789 = new int[runtime.aClass177_5243.aClass298_Sub37_Sub14_1788.method3461((short) -407)];
    }

    static final void method4123(ScriptRuntime runtime) {
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = AwtMouse.mouse.getLastY();
    }

    static final void method4124(ScriptRuntime runtime) {
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = Class82_Sub14.anInt6875 * 1196508279 + WorldMapHandler.mapX;
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = Class376.anInt4090 * 1882038855 + WorldMapHandler.mapY;
    }

    static final void GET_CPU_USAGE_VALUE(ScriptRuntime runtime) {
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = SettingsManager.settingsManager.cpu.getValue();
    }

    static final void method6155(ScriptRuntime runtime) {
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = Class474.activeConnectionInfo.worldID * 1606920449;
    }

    static final void method6158(ScriptRuntime runtime) {
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = (runtime.integerstack[runtime.integerPos * 1883543357]);
    }

    static final void method6151(ScriptRuntime runtime) {
        runtime.longArgs -= -1365138610;
        if ((runtime.longStacks[1685767703 * runtime.longArgs]) != (runtime.longStacks[1 + 1685767703 * runtime.longArgs]))
            runtime.integerPos += (286750741 * (runtime.integerstack[1883543357 * runtime.integerPos]));
    }

    static final void method6149(ScriptRuntime runtime) {
        runtime.integerStackOffset -= -783761378;
        int i_0_ = (runtime.integerStack[681479919 * runtime.integerStackOffset]);
        int i_1_ = (runtime.integerStack[1 + 681479919 * runtime.integerStackOffset]);
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = SoftCache.method4197(i_0_, i_1_, false);
    }

    static final void method6150(ScriptRuntime runtime) {
        int i_2_ = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = -804725095 * GameClient.stockMarketListing[i_2_].anInt2772;
    }

    static final void method2374(ScriptRuntime runtime) {
        int value = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        int i_24_ = SettingsManager.settingsManager.themeMusicVolume.getValue();
        if (value != i_24_ && (Class300.anInt3210 * 782166935 == Class300.anInt3207 * -1256171511)) {
            if (!StaticMethods.method5804(GameClient.gameState * -1233866115)) {
                if (0 == i_24_) {
                    ItemDefinitionLoader.method6096(Js5List.JS5_MUSIC, -1256171511 * Class300.anInt3207, 0, value, false);
                    StaticMethods.method344();
                    Class300.aBoolean3208 = false;
                } else if (value == 0) {
                    Class134.method1489((byte) -3);
                    Class300.aBoolean3208 = false;
                } else
                    Class70.method801(value, -1911723714);
            }
            SettingsManager.settingsManager.setValue(SettingsManager.settingsManager.themeMusicVolume, value);
            ToMoveSettings.encodeBuffer();
            GameClient.sentPreferences = false;
        }
    }

    static final void method2373(ScriptRuntime runtime) {
        runtime.integerStackOffset -= -783761378;
        int i_21_ = (runtime.integerStack[runtime.integerStackOffset * 681479919]);
        int i_22_ = (runtime.integerStack[1 + runtime.integerStackOffset * 681479919]);
        CircularDoubleLinkedList class461 = WorldMapHandler.method3693(i_21_ >> 14 & 0x3fff, i_21_ & 0x3fff);
        boolean bool = false;
        for (Class298_Sub37_Sub13 class298_sub37_sub13 = (Class298_Sub37_Sub13) class461.first(); class298_sub37_sub13 != null; class298_sub37_sub13 = ((Class298_Sub37_Sub13) class461.next())) {
            if (-947282109 * class298_sub37_sub13.anInt9643 == i_22_) {
                bool = true;
                break;
            }
        }
        if (bool)
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = 1;
        else
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = 0;
    }

    static final void method4549(ScriptRuntime runtime) {
        if (null != Class225.aClass162_2512) {
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = 1;
            runtime.aClass162_5252 = Class225.aClass162_2512;
        } else
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = 0;
    }

    static final void method301(ScriptRuntime runtime) {
        SettingsManager.settingsManager.setValue(SettingsManager.settingsManager.textures, (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]) == 1 ? 1 : 0);
        ToMoveSettings.encodeBuffer();
        StaticMethods.method4294();
        GameClient.sentPreferences = false;
    }

    static final void method303(ScriptRuntime runtime) {
        String string = (String) (runtime.objectStack[(runtime.objectArgs -= 969361751) * -203050393]);
        if (string.startsWith(StaticMethods.method2368(0)) || string.startsWith(StaticMethods.method2368(1)))
            string = string.substring(7);
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = StaticMethods.method6192(string) ? 1 : 0;
    }

    static final void method1589(ScriptRuntime runtime) {
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = GameClient.anInt8844 * 827374123;
    }

    static final void method1590(ScriptRuntime runtime) {
        if (GameClient.anInt8942 * 1131012101 == 0)
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = -1;
        else
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = -548972447 * GameClient.anInt8952;
    }

    static final void method1591(ScriptRuntime runtime) {
        int i_0_ = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = (runtime.clanChannelChat.clanMembers[i_0_].playerWorldID) * -1333059205;
    }

    static final void method1592(ScriptRuntime runtime) {
        int i_1_ = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = (int) (Math.random() * (double) (i_1_ + 1));
    }

    static final void method1593(ScriptRuntime runtime) {
        int i_2_ = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        Class298_Sub37_Sub8 class298_sub37_sub8 = GraphicsToolkit.aClass256_5315.method2441(i_2_, 415666693);
        if (class298_sub37_sub8.anIntArray9598 == null)
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = 0;
        else
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = class298_sub37_sub8.anIntArray9598.length;
    }

    static final void method1225(ScriptRuntime runtime) {
        int i_60_ = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        runtime.objectStack[((runtime.objectArgs += 969361751) * -203050393 - 1)] = StaticMethods.aClass469_5618.method6045(i_60_).method3462((byte) -114);
    }

    static final void method2826(ScriptRuntime runtime) {
        runtime.integerStackOffset -= -1175642067;
        int i_0_ = (runtime.integerStack[runtime.integerStackOffset * 681479919]);
        int i_1_ = (runtime.integerStack[1 + 681479919 * runtime.integerStackOffset]);
        int i_2_ = (runtime.integerStack[2 + 681479919 * runtime.integerStackOffset]);
        Class301_Sub1.method3713(7, i_0_ << 16 | i_1_, i_2_, "");
    }

    static void method2791(int i, String string, String string_44_, int i_45_) {
        try {
            if (null != ConnectionType.gameConnection) {
                OutgoingPacketBuffer outgoingPacketBuffer = Class18.method359(OutgoingPacket.aClass198_2088, ConnectionType.gameConnection.encryptor);
                outgoingPacketBuffer.payload.writeShort((1 + StringUtils.addLengthByTwo(string) + StringUtils.addLengthByTwo(string_44_)));
                outgoingPacketBuffer.payload.putJagString(string_44_);
                outgoingPacketBuffer.payload.write128Byte(i);
                outgoingPacketBuffer.payload.putJagString(string);
                ConnectionType.gameConnection.sendFrame(outgoingPacketBuffer);
            }
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("mc.apk(").append(')').toString());
        }
    }

    static final void method4672(ScriptRuntime runtime) {
        int i_0_ = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        PublicMessage publicMessage = PublicMessage.getMessageCharacterCount(i_0_);
        String string = "";
        if (publicMessage != null && null != publicMessage.rawPublicMessage)
            string = publicMessage.rawPublicMessage;
        runtime.objectStack[((runtime.objectArgs += 969361751) * -203050393 - 1)] = string;
    }

    static final void method1147(ScriptRuntime runtime) {
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = GameClient.aBoolean8640 ? 1 : 0;
    }

    static final void method1151(ScriptRuntime runtime) {
        if (EffectiveVertex.aShortArray678 == null || (ResourceProvider.anInt2709 * -316347407 >= Class344.itemIndex * 367592105))
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = -1;
        else
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = ((EffectiveVertex.aShortArray678[(ResourceProvider.anInt2709 += 1578804497) * -316347407 - 1]) & 0xffff);
    }

    static final void method1321(ScriptRuntime runtime) {
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = SettingsManager.settingsManager.aClass422_Sub10_7548.getValue();
    }

    static final void method1322(ScriptRuntime runtime) {
        runtime.integerStackOffset -= -783761378;
        int i_21_ = (runtime.integerStack[681479919 * runtime.integerStackOffset]);
        int i_22_ = (runtime.integerStack[runtime.integerStackOffset * 681479919 + 1]);
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = i_21_ < i_22_ ? i_21_ : i_22_;
    }

    static final void method1566(ScriptRuntime runtime) {
        SettingsManager.settingsManager.setValue(SettingsManager.settingsManager.modShadows, (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]) == 1 ? 1 : 0);
        ToMoveSettings.encodeBuffer();
        GameClient.sentPreferences = false;
    }

    static final void method2318(ScriptRuntime runtime) {
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = (int) (TimeUtils.getTime() / 86400000L) - 11745;
    }

    static final void method1701(ScriptRuntime runtime) {
        runtime.integerStackOffset -= -1567522756;
        ToMoveSettings.method3913((runtime.integerStack[runtime.integerStackOffset * 681479919]), (runtime.integerStack[1 + runtime.integerStackOffset * 681479919]), (runtime.integerStack[681479919 * runtime.integerStackOffset + 2]), (runtime.integerStack[3 + 681479919 * runtime.integerStackOffset]), true, 256);
    }

    static final void method3995(ScriptRuntime runtime) {
        int i_60_ = (runtime.integerstack[runtime.integerPos * 1883543357]);
        String string = (runtime.aClass162_5252.method1755(-937307905 * GameClient.game.id << 16 | i_60_, -1713280768));
        String string_61_;
        if (null == string)
            string_61_ = "";
        else
            string_61_ = string;
        runtime.objectStack[((runtime.objectArgs += 969361751) * -203050393 - 1)] = string_61_;
    }

    static final void method3997(ScriptRuntime runtime) {
        String string = (String) (runtime.objectStack[(runtime.objectArgs -= 969361751) * -203050393]);
        OutgoingPacketBuffer buffer = Class18.method359(OutgoingPacket.aClass198_2073, ConnectionType.gameConnection.encryptor);
        buffer.payload.writeByte(string.length() + 1);
        buffer.payload.writeString(string);
        ConnectionType.gameConnection.sendFrame(buffer);
    }

    static final void method6082(ScriptRuntime runtime) {
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = 707299179 * Class360.anInt3892;
    }

    static final void method2369(ScriptRuntime runtime) {
        method4875(Class_na.method3476(1476588124), runtime);
    }

    static final void method2367(ScriptRuntime runtime) {
        Class298_Sub52 class298_sub52 = Class236.method2190();
        if (null == class298_sub52) {
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = -1;
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = -1;
        } else {
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = -530122905 * class298_sub52.anInt7608;
            int i_6_ = (-1740053407 * class298_sub52.anInt7605 << 28 | (2122110429 * class298_sub52.anInt7607 + WorldMapHandler.mapX) << 14 | (WorldMapHandler.mapY + -372920341 * class298_sub52.anInt7610));
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = i_6_;
        }
    }

    static final void getMultiSampleValue(ScriptRuntime runtime) {
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = SettingsManager.settingsManager.multisample.getValue();
    }

    static final void method539(ScriptRuntime runtime) {
        StaticMethods.method967((runtime.integerStack[(runtime.integerStackOffset -= -391880689) * 681479919]), 255, 50);
    }

    static final void updateMultisampling(ScriptRuntime runtime) {
        int value = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        if (!GameClient.activeGraphicsToolkit.isMultisampled())
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = 3;
        else
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = SettingsManager.settingsManager.antiAliasing.getSupport(value);
    }

    static final void method1074(ScriptRuntime runtime) {
        StaticMethods.method3455((runtime.integerStack[(runtime.integerStackOffset -= -391880689) * 681479919]));
    }

    static final void method1075(ScriptRuntime runtime) {
        runtime.integerStackOffset -= -783761378;
        int i_0_ = (runtime.integerStack[681479919 * runtime.integerStackOffset]);
        int i_1_ = (runtime.integerStack[runtime.integerStackOffset * 681479919 + 1]);
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = (GraphicsToolkit.aClass256_5315.method2441(i_0_, 537859491).anIntArray9598[i_1_]);
    }

    static final void method1077(ScriptRuntime runtime) {
        if (GameClient.fullscreen) {
            Class456[] class456s = Class271.method2545((byte) -22);
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = class456s.length;
        } else
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = 0;
    }

    static final void method1078(ScriptRuntime runtime) {
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = Class229.method2123();
    }

    static final void method1585(ScriptRuntime runtime) {
        int value = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = SettingsManager.settingsManager.aClass422_Sub10_7548.getSupport(value);
    }

    static final void particlesHaveExcessMemory(ScriptRuntime runtime) {
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = SettingsManager.settingsManager.particles.hasExcessMemory() ? 1 : 0;
    }

    static final void getMaxScreenSizeSupport(ScriptRuntime runtime) {
        int value = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = SettingsManager.settingsManager.maxScreenSize.getSupport(value);
    }

    static final void method2538(ScriptRuntime runtime) {
        runtime.integerStackOffset -= -783761378;
        int i_32_ = (runtime.integerStack[runtime.integerStackOffset * 681479919]);
        int i_33_ = (runtime.integerStack[681479919 * runtime.integerStackOffset + 1]);
        int i_34_ = i_33_ >> 14 & 0x3fff;
        int i_35_ = i_33_ & 0x3fff;
        int i_36_ = Class264_Sub4.method2514(i_32_, i_34_, i_35_, (short) -30782);
        if (i_36_ < 0)
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = -1;
        else
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = i_36_;
    }

    static final void method2537(ScriptRuntime runtime) {
        if (GameClient.anInt8932 * -1333485389 >= 5 && -1333485389 * GameClient.anInt8932 <= 9)
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = -1333485389 * GameClient.anInt8932;
        else
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = 0;
    }

    static final void method1942(ScriptRuntime runtime, int i) {
        LinkedList linkedList = (runtime.script.switches[(runtime.integerstack[1883543357 * runtime.integerPos])]);
        IntNode intNode = ((IntNode) linkedList.get((long) runtime.integerStack[(runtime.integerStackOffset -= -391880689) * 681479919]));
        if (null != intNode)
            runtime.integerPos += -1065839893 * intNode.capacity;
    }

    static final void method1943(ScriptRuntime runtime) {
        int i_0_ = (runtime.integerstack[1883543357 * runtime.integerPos]);
        Long var_long = (runtime.aClass162_5252.method1766(-937307905 * GameClient.game.id << 16 | i_0_, -2092321657));
        long l;
        if (null == var_long)
            l = -1L;
        else
            l = var_long.longValue();
        runtime.longStacks[((runtime.longArgs += -682569305) * 1685767703 - 1)] = l;
    }

    static final void method1944(ScriptRuntime runtime) {
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = SettingsManager.settingsManager.stereoSound.getValue() == 1 ? StereoSoundSetting.STEREO : StereoSoundSetting.MONO;
    }

    static final void method1945(ScriptRuntime runtime) {
        runtime.integerStackOffset -= -783761378;
        int i_1_ = (runtime.integerStack[runtime.integerStackOffset * 681479919]);
        int i_2_ = ((runtime.integerStack[1 + 681479919 * runtime.integerStackOffset]) - 1);
        ItemDefinition class468 = Js5Configs.itemList.getItemDefinitions(i_1_);
        if (i_2_ == 690460599 * class468.unknownInt22)
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = -1953923599 * class468.unknownInt23;
        else if (i_2_ == class468.unknownInt24 * 1689294225)
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = class468.unknownInt25 * -1824861577;
        else
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = -1;
    }

    static final void method374(ScriptRuntime runtime) {
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = SettingsManager.settingsManager.fog.getValue() == FogSetting.ON ? 1 : 0;
    }

    static final void method4098(ScriptRuntime runtime) {
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = SettingsManager.settingsManager.textures.getValue() == TextureSetting.ON ? 1 : 0;
    }

    static final void method4100(ScriptRuntime runtime) {
        int i_7_ = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        ClientScriptMap clientScriptMap = Class51.aClass475_506.getClientScriptMap(i_7_);
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = clientScriptMap.method6129();
    }

    static final void method4102(ScriptRuntime runtime) {
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = StaticMethods.anInt4128 * -821031539;
    }

    static final void isGroundBlendingOn(ScriptRuntime runtime) {
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = SettingsManager.settingsManager.groundBlending.getValue() == GroundBlendingSetting.ON ? 1 : 0;
    }

    static final void method2407(ScriptRuntime runtime, byte i) {
            int value = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = SettingsManager.settingsManager.textures.getSupport(value);
    }

    static final void setCameraRotation(ScriptRuntime runtime) {
        runtime.integerStackOffset -= -783761378;
        StaticMethods.setMiddleMouseCameraRotation((runtime.integerStack[(681479919 * runtime.integerStackOffset)]), (runtime.integerStack[1 + (681479919 * runtime.integerStackOffset)]), 0);
    }

    static final void method2405(ScriptRuntime runtime) {
        runtime.integerStackOffset -= 1943683162;
        int i_0_ = (runtime.integerStack[681479919 * runtime.integerStackOffset]);
        if (i_0_ >= 2)
            throw new RuntimeException();
        GameClient.anInt8768 = 1723181617 * i_0_;
        int i_1_ = (runtime.integerStack[681479919 * runtime.integerStackOffset + 1]);
        if (i_1_ + 1 >= (GameClient.anIntArrayArrayArray8767[-591434031 * GameClient.anInt8768]).length >> 1)
            throw new RuntimeException();
        GameClient.anInt8770 = i_1_ * -2146952741;
        GameClient.anInt8857 = 0;
        GameClient.anInt8852 = ((runtime.integerStack[681479919 * runtime.integerStackOffset + 2]) * -2045228877);
        GameClient.anInt8774 = (-546154255 * (runtime.integerStack[3 + 681479919 * runtime.integerStackOffset]));
        int i_2_ = (runtime.integerStack[4 + 681479919 * runtime.integerStackOffset]);
        if (i_2_ >= 2)
            throw new RuntimeException();
        GameClient.anInt8769 = -2694169 * i_2_;
        int i_3_ = (runtime.integerStack[5 + 681479919 * runtime.integerStackOffset]);
        if (1 + i_3_ >= (GameClient.anIntArrayArrayArray8767[-839811113 * GameClient.anInt8769]).length >> 1)
            throw new RuntimeException();
        GameClient.anInt8771 = i_3_ * -274142709;
        CameraUtils.cameraType = -734758223 * CameraUtils.LIVE_GAME;
        Class418.anInt5339 = -1001372047;
        Class100.anInt1081 = 178575833;
    }

    static final void method2600(ScriptRuntime runtime) {
            runtime.objectStack[((runtime.objectArgs += 969361751) * -203050393 - 1)] = new StringBuilder().append(Class465.method6017((long) (runtime.integerStack[(runtime.integerStackOffset -= -391880689) * 681479919]) * 60000L, GameLanguage.CURRENT_LANGUAGE.getID(), true, -1759893587)).append(" UTC").toString();
    }

    static final void getSceneCameraYaw(ScriptRuntime runtime) {
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = (int) GameClient.cameraXAngle >> 3;
    }

    static final void method856(ScriptRuntime runtime) {
            String string = (String) (runtime.objectStack[(runtime.objectArgs -= 969361751) * -203050393]);
            runtime.integerStackOffset -= -783761378;
            int i_18_ = (runtime.integerStack[681479919 * runtime.integerStackOffset]);
            int i_19_ = (runtime.integerStack[681479919 * runtime.integerStackOffset + 1]);
            runtime.objectStack[((runtime.objectArgs += 969361751) * -203050393 - 1)] = string.substring(i_18_, i_19_);
    }

    static final void setRoofSetting(ScriptRuntime runtime) {
            int i_0_ = SettingsManager.settingsManager.removeRoofs.getValue();
            SettingsManager.settingsManager.setValue(SettingsManager.settingsManager.currentRoofs, (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]) == 1 ? 0 : i_0_);
            ToMoveSettings.updateRoofFlags();
    }

    static final void method4889(ScriptRuntime runtime) {
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = SettingsManager.settingsManager.removeRoofs.getValue() == RemoveRoofsSetting.SELECTIVELY ? 1 : 0;
    }

    static final void method891(ScriptRuntime runtime) {
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = -2005990483 * Class360.anInt3910;
    }
}
