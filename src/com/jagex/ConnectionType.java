package com.jagex;/* Class25 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.network.IncommingPacket;

import java.io.IOException;

public class ConnectionType {
    public static ConnectionType lobbyConnection;
    public static ConnectionType gameConnection;
    public IsaacCipher encryptor;
    public int anInt339;
    public boolean aBoolean347;
    int anInt327;
    Stream stream;
    Class453 aClass453_329 = new Class453();
    Buffer buffer;
    RsBitsBuffer bitsBuffer;
    IsaacCipher decryptor;
    IncommingPacket INCOMMING_PACKET;
    int population;
    boolean aBoolean337;
    int anInt338;
    Class124 aClass124_340;
    int anInt341;
    int anInt342;
    int anInt343;
    IncommingPacket aClass202_344;
    IncommingPacket aClass202_345;
    int anInt346 = 0;
    IncommingPacket aClass202_348;

    ConnectionType() {
        this.buffer = new Buffer(1500);
        this.bitsBuffer = new RsBitsBuffer(15000);
        this.INCOMMING_PACKET = null;
        this.population = 0;
        this.aBoolean337 = true;
        this.anInt338 = 0;
        anInt339 = 0;
        aBoolean347 = false;
        this.aClass124_340 = new Class124();
        Thread thread = new Thread(this.aClass124_340);
        thread.setPriority(1);
        thread.start();
    }

    public static ConnectionType getConnectionType() {
        if (GameClient.isLobbyConnected(-1233866115 * GameClient.gameState))
            return lobbyConnection;
        return gameConnection;
    }

    static int method392(byte[][] is, byte[][] is_1_, int[] is_2_, byte[] is_3_, int[] is_4_, int i, int i_5_) {
        int i_7_ = is_2_[i];
        int i_8_ = is_4_[i] + i_7_;
        int i_9_ = is_2_[i_5_];
        int i_10_ = i_9_ + is_4_[i_5_];
        int i_11_ = i_7_;
        if (i_9_ > i_7_)
            i_11_ = i_9_;
        int i_12_ = i_8_;
        if (i_10_ < i_8_)
            i_12_ = i_10_;
        int i_13_ = is_3_[i] & 0xff;
        if ((is_3_[i_5_] & 0xff) < i_13_)
            i_13_ = is_3_[i_5_] & 0xff;
        byte[] is_14_ = is_1_[i];
        byte[] is_15_ = is[i_5_];
        int i_16_ = i_11_ - i_7_;
        int i_17_ = i_11_ - i_9_;
        for (int i_18_ = i_11_; i_18_ < i_12_; i_18_++) {
            int i_19_ = is_14_[i_16_++] + is_15_[i_17_++];
            if (i_19_ < i_13_)
                i_13_ = i_19_;
        }
        return -i_13_;
    }

    static final void method394(ScriptRuntime runtime) {
        ToMoveScripts.method4875(Class272.method2557(), runtime);
    }

    static final void method395(ScriptRuntime runtime) {
        int i_28_ = (runtime.integerstack[1883543357 * runtime.integerPos]);
        Class128.playerVarsProvider.method1604(i_28_, (runtime.integerStack[(runtime.integerStackOffset -= -391880689) * 681479919]));
    }

    final void dropFrames() {
        try {
            this.aClass453_329.clean();
            this.anInt346 = 0;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("az.a(").append(')').toString());
        }
    }

    void stopConnection() {
        try {
            if (this.stream != null) {
                this.stream.close();
                this.stream = null;
            }
            this.aClass124_340.method1381(null);
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("az.k(").append(')').toString());
        }
    }

    void closeConnection() {
        this.stream = null;
        this.aClass124_340.method1381(null);
    }

    public final void flush() throws IOException {
        if (this.stream != null && 500279933 * this.anInt346 > 0) {
            this.buffer.offset = 0;
            for (; ; ) {
                OutgoingPacketBuffer outgoingPacketBuffer = (OutgoingPacketBuffer) this.aClass453_329.method5939();
                if (null == outgoingPacketBuffer) {
                    break;
                }
                if (58571303 * outgoingPacketBuffer.payloadOffset > ((this.buffer.buffer).length - (this.buffer.offset * 385051775))) {
                    break;
                }
                this.buffer.writeBytes((outgoingPacketBuffer.payload.buffer), 0, outgoingPacketBuffer.payloadOffset * 58571303);
                this.anInt346 -= outgoingPacketBuffer.payloadOffset * 20706419;
                outgoingPacketBuffer.unlink();
                outgoingPacketBuffer.payload.reset();
                outgoingPacketBuffer.method3400();
            }
            this.stream.method3868(this.buffer.buffer, 0, (385051775 * this.buffer.offset));
            this.anInt342 += (211924279 * this.buffer.offset);
            anInt339 = 0;
        }
    }

    public Stream getStream() {
        return this.stream;
    }

    void recordStats() {
        if (GameClient.clientTick * 443738891 % 50 == 0) {
            this.anInt327 = -514533411 * this.anInt342;
            this.anInt342 = 0;
            this.anInt343 = this.anInt341 * 65385213;
            this.anInt341 = 0;
        }
    }

    void init(Stream stream, String string) {
        this.stream = stream;
        this.aClass124_340.method1381(string);
    }

    public final void sendFrame(OutgoingPacketBuffer outgoingPacketBuffer) {
        this.aClass453_329.pushBack(outgoingPacketBuffer);
        outgoingPacketBuffer.payloadOffset = (outgoingPacketBuffer.payload.offset * -2007143959);
        outgoingPacketBuffer.payload.offset = 0;
        this.anInt346 += outgoingPacketBuffer.payloadOffset * 20706419;
    }
}
