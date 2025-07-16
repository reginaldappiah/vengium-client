package com.jagex;/* Class288_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

public class Class288_Sub1 extends Class288 implements Runnable {
	public static Class219 target;

	static void method5191() {
        if (ClientLoadingScreenBar.currentLoadingScreen != null ) {
            target = new Class219();
            target.updateLoadingBarPercentage(-4360787748556788915L * Class230.time, ClientLoadingScreenBar.currentLoadingScreen.primaryText.translate(GameLanguage.CURRENT_LANGUAGE), (360399239 * ClientLoadingScreenBar.currentLoadingScreen.startPercentage), ClientLoadingScreenBar.currentLoadingScreen);
            GameClient.thread = new Thread(target, "");
            GameClient.thread.start();
        }
    }

	public void run() {
		try {
			this.aBoolean3102 = true;
			do {
				try {
					try {
						while (!this.aBoolean3103) {
							for (int i = 0; i < 2; i++) {
								Class284 class284 = (this.aClass284Array3104[i]);
								if (class284 != null)
									class284.method2680();
							}
							IPAddress.method6060(10L);
							GameShell.cleanSystemQueue(null);
						}
					} catch (Exception exception) {
						IPAddress.reportError(null, exception);
						this.aBoolean3102 = false;
						break;
					}
					this.aBoolean3102 = false;
				} catch (RuntimeException object) {
					this.aBoolean3102 = false;
					throw object;
				}
			} while (false);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("vn.run(").append(')').toString());
		}
	}

	Class288_Sub1() {
		/* empty */
	}

	static void method2730(int i) {
		try {
			if (Class525.aClass486_6298 != null) {
				try {
					int i_0_;
					if (0 == -1868526275 * Class525.anInt6297)
						i_0_ = 250;
					else
						i_0_ = 2000;
					Class525.anInt6295 += -1475309103;
					if (Class525.anInt6295 * -1864800463 > i_0_)
						PlayerAppearance.method4547(261104990);
					if (Class525.aClass486_6298 == Js5CacheWrite.aClass486_6060) {
						ConnectionType.lobbyConnection.init((Class264_Sub4.method2515(Class241.lobbyConnectionInfo.createSocket(), 15000)), Class241.lobbyConnectionInfo.host);
						ConnectionType.lobbyConnection.dropFrames();
						OutgoingPacketBuffer outgoingPacketBuffer = StaticMethods.empty();
						outgoingPacketBuffer.payload.writeByte(-1813470547 * LoginConnection.aLoginConnection_2415.type);
						outgoingPacketBuffer.payload.writeShort(0);
						int i_1_ = ((outgoingPacketBuffer.payload.offset) * 385051775);
						outgoingPacketBuffer.payload.writeShort(718);
						outgoingPacketBuffer.payload.writeShort(1);
						Class361.anIntArray3913 = Class256.method2446(outgoingPacketBuffer, -201782073);
						int i_2_ = ((outgoingPacketBuffer.payload.offset) * 385051775);
						outgoingPacketBuffer.payload.writeString(GameClient.aString8655);
						outgoingPacketBuffer.payload.writeShort(GameClient.offiliateId * -1154804873);
						outgoingPacketBuffer.payload.writeLong(GameClient.aLong8645 * -5648129435911399733L);
						outgoingPacketBuffer.payload.writeByte(GameLanguage.CURRENT_LANGUAGE.getID());
						outgoingPacketBuffer.payload.writeByte(GameClient.game.id * -937307905);
						Class10.setRandom((outgoingPacketBuffer.payload), (byte) 1);
						String string = GameClient.additionalInfo;
						outgoingPacketBuffer.payload.writeByte(null == string ? 0 : 1);
						if (null != string)
							outgoingPacketBuffer.payload.writeString(string);
						Class12.systemInfo.writeMachineInformation(outgoingPacketBuffer.payload);
						outgoingPacketBuffer.payload.offset += 814893177;
						outgoingPacketBuffer.payload.encodeXtea(Class361.anIntArray3913, i_2_, 385051775 * (outgoingPacketBuffer.payload.offset));
						outgoingPacketBuffer.payload.writeSizeShort((outgoingPacketBuffer.payload.offset) * 385051775 - i_1_);
						ConnectionType.lobbyConnection.sendFrame(outgoingPacketBuffer);
						ConnectionType.lobbyConnection.flush();
						Class525.aClass486_6298 = Js5CacheWrite.aClass486_6061;
					}
					if (Js5CacheWrite.aClass486_6061 == Class525.aClass486_6298) {
						if (ConnectionType.lobbyConnection.getStream().isAvailable(1)) {
							ConnectionType.lobbyConnection.getStream().readBytes((ConnectionType.lobbyConnection.bitsBuffer.buffer), 0, 1);
							Class525.aClass412_6299 = ((Class412) (StaticMethods.method5701(Class412.method4928(), (ConnectionType.lobbyConnection.bitsBuffer.buffer[0]) & 0xff)));
							if (Class525.aClass412_6299 == Class412.aClass412_6569) {
								ConnectionType.lobbyConnection.encryptor = new IsaacCipher(Class361.anIntArray3913);
								int[] is = new int[4];
								for (int i_3_ = 0; i_3_ < 4; i_3_++)
									is[i_3_] = 50 + Class361.anIntArray3913[i_3_];
								ConnectionType.lobbyConnection.decryptor = new IsaacCipher(is);
								new IsaacCipher(is);
								ConnectionType.lobbyConnection.bitsBuffer.setCipher((ConnectionType.lobbyConnection.decryptor));
								Class439.loadGameState(8);
								ConnectionType.lobbyConnection.dropFrames();
								ConnectionType.lobbyConnection.bitsBuffer.offset = 0;
								ConnectionType.lobbyConnection.aClass202_344 = null;
								ConnectionType.lobbyConnection.aClass202_345 = null;
								ConnectionType.lobbyConnection.aClass202_348 = null;
								ConnectionType.lobbyConnection.anInt338 = 0;
							} else
								ConnectionType.lobbyConnection.stopConnection();
							ConnectionType.lobbyConnection.INCOMMING_PACKET = null;
							Class525.aClass486_6298 = null;
						}
					}
				} catch (IOException ioexception) {
					PlayerAppearance.method4547(-1990066446);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("vn.n(").append(')').toString());
		}
	}
}
