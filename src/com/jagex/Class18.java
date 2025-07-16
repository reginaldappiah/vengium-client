package com.jagex;/* Class18 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.network.OutgoingPacket;
import com.jagex.utils.ColorUtils;

public class Class18 {
    static int anInt255;
    int anInt244;
    float aFloat245 = 1.0F;
    int anInt246;
    int anInt247;
    float aFloat248 = 1.0F;
    int anInt249;
    float aFloat250;
    int anInt251;
    int anInt252;
    int anInt253;
    int anInt254;

    Class18(int i, float f, float f_0_, int i_1_, int i_2_, int i_3_) {
        this.anInt254 = i * -564629049;
        this.aFloat245 = f;
        this.aFloat248 = f_0_;
        this.anInt247 = i_1_ * 1747422061;
        this.anInt244 = 1370325433 * i_2_;
        this.anInt249 = i_3_ * -839233607;
    }

    Class18(int i) {
        this.anInt254 = -564629049 * i;
    }

    static String method358(int i, int i_5_) {
        int i_7_ = i_5_ - i;
        if (i_7_ < -9)
            return ColorUtils.htmlToHex(16711680);
        if (i_7_ < -6)
            return ColorUtils.htmlToHex(16723968);
        if (i_7_ < -3)
            return ColorUtils.htmlToHex(16740352);
        if (i_7_ < 0)
            return ColorUtils.htmlToHex(16756736);
        if (i_7_ > 9)
            return ColorUtils.htmlToHex(65280);
        if (i_7_ > 6)
            return ColorUtils.htmlToHex(4259584);
        if (i_7_ > 3)
            return ColorUtils.htmlToHex(8453888);
        if (i_7_ > 0)
            return ColorUtils.htmlToHex(12648192);
        return ColorUtils.htmlToHex(16776960);
    }

    public static OutgoingPacketBuffer method359(OutgoingPacket packet, IsaacCipher isaacCipher) {
        try {
            OutgoingPacketBuffer outgoingPacketBuffer = OutgoingPacketBuffer.getOutgoingPacketBuffer();
            outgoingPacketBuffer.outgoingPacket = packet;
            outgoingPacketBuffer.anInt7397 = packet.length * -1035235683;
            if (-1 == outgoingPacketBuffer.anInt7397 * 157188735)
                outgoingPacketBuffer.payload = new RsBitsBuffer(260);
            else if (outgoingPacketBuffer.anInt7397 * 157188735 == -2)
                outgoingPacketBuffer.payload = new RsBitsBuffer(10000);
            else if (157188735 * outgoingPacketBuffer.anInt7397 <= 18)
                outgoingPacketBuffer.payload = new RsBitsBuffer(20);
            else if (outgoingPacketBuffer.anInt7397 * 157188735 <= 98)
                outgoingPacketBuffer.payload = new RsBitsBuffer(100);
            else
                outgoingPacketBuffer.payload = new RsBitsBuffer(260);
            outgoingPacketBuffer.payload.setCipher(isaacCipher);
            outgoingPacketBuffer.payload.method3668((outgoingPacketBuffer.outgoingPacket.id) * -1687656101);
            outgoingPacketBuffer.payloadOffset = 0;
            return outgoingPacketBuffer;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("as.f(").append(')').toString());
        }
    }

    static final void method361(ScriptRuntime runtime) {
        runtime.integerStackOffset -= -783761378;
        int i_8_ = (runtime.integerStack[runtime.integerStackOffset * 681479919]);
        int i_9_ = (runtime.integerStack[runtime.integerStackOffset * 681479919 + 1]);
        String string = (String) (runtime.objectStack[(runtime.objectArgs -= 969361751) * -203050393]);
        if (99 == i_8_)
            StaticMethods.sendConsoleMessage(string);
        else if (i_8_ == 98)
            StaticMethods.method5694(string);
        else
            PublicMessage.sendPublicMessage(i_8_, i_9_, "", "", "", string);
    }

    public static void method362(String string, String string_10_, int i, boolean bool) {
        if (GameClient.gameState * -1233866115 == 8) {
            OutgoingPacketBuffer outgoingPacketBuffer = method359(OutgoingPacket.aClass198_2072, ConnectionType.lobbyConnection.encryptor);
            outgoingPacketBuffer.payload.writeShort(0);
            int i_12_ = (385051775 * outgoingPacketBuffer.payload.offset);
            outgoingPacketBuffer.payload.writeString(string);
            outgoingPacketBuffer.payload.writeString(string_10_);
            outgoingPacketBuffer.payload.writeByte(i);
            outgoingPacketBuffer.payload.writeByte(bool ? 1 : 0);
            outgoingPacketBuffer.payload.offset += 814893177;
            outgoingPacketBuffer.payload.encodeXtea(Class361.anIntArray3913, i_12_, (outgoingPacketBuffer.payload.offset * 385051775));
            outgoingPacketBuffer.payload.writeSizeShort(385051775 * (outgoingPacketBuffer.payload.offset) - i_12_);
            ConnectionType.lobbyConnection.sendFrame(outgoingPacketBuffer);
            if (i < 13) {
                GameClient.aBoolean8680 = true;
                FrameBufferContext.method566((byte) 12);
            }
            Class357.aClass413_3845 = Class413.aClass413_6576;
        }
    }

    Class18 method355() {
        return new Class18(-1509687305 * this.anInt254, this.aFloat245, this.aFloat248, -1848560027 * this.anInt247, this.anInt244 * -1070844791, this.anInt249 * -988477815);
    }

    void method356(Class18 class18_4_) {
        this.aFloat245 = class18_4_.aFloat245;
        this.aFloat248 = class18_4_.aFloat248;
        this.anInt247 = class18_4_.anInt247 * 1;
        this.anInt244 = 1 * class18_4_.anInt244;
        this.anInt254 = 1 * class18_4_.anInt254;
        this.anInt249 = class18_4_.anInt249 * 1;
    }
}
