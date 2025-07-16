package com.jagex;/* Class_na - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.network.OutgoingPacket;
import com.jagex.utils.CameraUtils;

public abstract class Class_na extends Cacheable {
    public static CursorDefinitionLoader cursorDefLoader;

    Class_na() {
        /* empty */
    }

    public static MenuOption method3476(int i) {
        try {
            return StaticMethods.aMenuOption_3322;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("na.al(").append(')').toString());
        }
    }

    static final void method3477(ScriptRuntime runtime) {
        int interfaceHash = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        IComponentDefinition componentDefinition = IComponentDefinition.getInterfaceComponent(interfaceHash);
        IComponentDefinitionCollection IComponentDefinitionCollection = IComponentDefinition.getIComponentDefinitionCollections[interfaceHash >> 16];
        ToMoveIComponentScripts.method1595(componentDefinition, IComponentDefinitionCollection, runtime);
    }

    public static final void resetCamera() {
            for (int index = 0; index < 5; index++)
                GameClient.enabledCameraShakeSlots[index] = false;
            GameClient.anInt8768 = -1723181617;
            GameClient.anInt8769 = 2694169;
            Class128_Sub1.anInt8556 = 0;
            Class427.anInt5362 = 0;
            CameraUtils.cameraType = 621176181;
            Class418.anInt5339 = -1001372047;
            Class100.anInt1081 = 178575833;
            GameClient.anInt8921 = 727655629 * GameClient.clientTick;
            Class301_Sub1.anInt7639 = -1614496487 * GameClient.camPosX;
            Class409.anInt5284 = GameClient.camPosY * -418338293;
            Class82_Sub2.anInt6822 = GameClient.camPosZ * -459981543;
            Class21.anInt277 = 905514481 * GameClient.camRotX;
            Class298_Sub9.anInt7228 = GameClient.camRotY * 1437648991;
    }

    public static final void kickClanChatPacket(boolean guest, int unused) {
        try {
            ClanChannelChat clanChannelChat = (guest ? ClanChannelChat.clanManager : StaticMethods.aClanChannelChat_4084);
            if (null != clanChannelChat && unused >= 0 && unused < 649879491 * clanChannelChat.channelSize) {
                ClanMember clanMember = clanChannelChat.clanMembers[unused];
                if (-1 == clanMember.playerRank) {
                    String playerToKick = clanMember.playerDisplayName;
                    ConnectionType connectionType = ConnectionType.getConnectionType();
                    OutgoingPacketBuffer outgoingPacketBuffer = Class18.method359(OutgoingPacket.KICK_CLAN_CHAT_PACKET, connectionType.encryptor);
                    outgoingPacketBuffer.payload.writeByte(3 + StaticMethods.method693(playerToKick));
                    outgoingPacketBuffer.payload.writeByte(guest ? 1 : 0);
                    outgoingPacketBuffer.payload.writeShort(unused);
                    outgoingPacketBuffer.payload.writeString(playerToKick);
                    connectionType.sendFrame(outgoingPacketBuffer);
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("na.mw(").append(')').toString());
        }
    }

    static final void method3480(ScriptRuntime class403, int i) {
        try {
            class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919 - 1)] = GameClient.anInt8845 * -363202459;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("na.uf(").append(')').toString());
        }
    }
}
