package com.jagex;/* Class12 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.network.OutgoingPacket;

public class Class12 implements Interface8_Impl1_Impl2 {
	int anInt9943;
	int anInt9944;
	float[] aFloatArray9945;
	public static Class298_Sub44 systemInfo;

	public void b() {
		try {
			/* empty */
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("am.b(").append(')').toString());
		}
	}

	public int f() {
		try {
			return 1671547161 * this.anInt9944;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("am.f(").append(')').toString());
		}
	}

	public int a() {
		try {
			return this.anInt9943 * 1026825677;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("am.a(").append(')').toString());
		}
	}

	public int i() {
		return this.anInt9943 * 1026825677;
	}

	public int p() {
		return this.anInt9943 * 1026825677;
	}

	public void u() {
		/* empty */
	}

	public int k() {
		return 1671547161 * this.anInt9944;
	}

	public void d() {
		/* empty */
	}

	Class12(int i, int i_0_) {
		this.anInt9943 = i * -1635379451;
		this.anInt9944 = i_0_ * 2106032937;
		this.aFloatArray9945 = new float[(this.anInt9944 * 1671547161 * (1026825677 * this.anInt9943))];
	}

	public void x() {
		/* empty */
	}

	static void method332(GraphicsToolkit class_ra, int i, int i_1_, IComponentDefinition class105, int i_2_) {
		try {
			int i_3_ = 63;
			int i_4_ = 7;
			for (int i_5_ = 63; i_5_ >= 0; i_5_--) {
				int i_6_ = (i_5_ & 0x3f) << 10 | (i_4_ & 0x7) << 7 | i_3_ & 0x7f;
				Class374_Sub1.method4640(false, true, -162450455);
				int i_7_ = Class294.anIntArray3165[i_6_];
				StaticMethods.method2000(false, true);
				class_ra.drawFilledRectangle(i, ((63 - i_5_) * (class105.aspectHeight * 457937409) >> 6) + i_1_, -2093041337 * class105.aspectWidth, 1 + (class105.aspectHeight * 457937409 >> 6), i_7_, 0);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("am.a(").append(')').toString());
		}
	}

	static final void method333(ScriptRuntime runtime) {
		try {
			IComponentScripter IComponentScripter = (runtime.currentInstrBool ? runtime.aIComponentScripter_5247 : runtime.aIComponentScripter_5246);
			IComponentDefinition class105 = IComponentScripter.componentDefinition;
			Class239.method2209(class105, runtime, (byte) 24);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("am.qz(").append(')').toString());
		}
	}

	static final void method334(ScriptRuntime runtime) {
		try {
			ConnectionType connectionType = ConnectionType.getConnectionType();
			OutgoingPacketBuffer outgoingPacketBuffer = Class18.method359(OutgoingPacket.PUBLIC_QUICK_CHAT_PACKET, connectionType.encryptor);
			outgoingPacketBuffer.payload.writeByte(0);
			int i_8_ = (outgoingPacketBuffer.payload.offset * 385051775);
			outgoingPacketBuffer.payload.writeByte(3);
			outgoingPacketBuffer.payload.writeShort(runtime.aClass177_5243.anInt1787 * -2034569943);
			runtime.aClass177_5243.aClass298_Sub37_Sub14_1788.method3464(outgoingPacketBuffer.payload, runtime.aClass177_5243.anIntArray1789, 1205733536);
			outgoingPacketBuffer.payload.method3649((outgoingPacketBuffer.payload.offset * 385051775) - i_8_);
			connectionType.sendFrame(outgoingPacketBuffer);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("am.adu(").append(')').toString());
		}
	}

	static final void method335(ScriptRuntime runtime) {
		try {
			String string = null;
			if (null != StockMarketListing.aClass524_2773)
				string = StockMarketListing.aClass524_2773.getAddressHostName();
			if (string == null)
				string = "";
			runtime.objectStack[((runtime.objectArgs += 969361751) * -203050393 - 1)] = string;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("am.amr(").append(')').toString());
		}
	}

	public static final void method338(String string, boolean bool, short i) {
		try {
			if (null != string) {
				if (GameClient.anInt8952 * -548972447 >= 100)
					FontToolkit.sendMessage(4, (Tradution.aClass470_5924.translate(GameLanguage.CURRENT_LANGUAGE)));
				else {
					String string_10_ = Class173.method1824(string);
					if (null != string_10_) {
						for (int i_11_ = 0; i_11_ < -548972447 * GameClient.anInt8952; i_11_++) {
							String string_12_ = Class173.method1824((GameClient.aStringArray8859[i_11_]));
							if (null != string_12_ && string_12_.equals(string_10_)) {
								FontToolkit.sendMessage(4, new StringBuilder().append(string).append(Tradution.aClass470_5925.translate((GameLanguage.CURRENT_LANGUAGE))).toString());
								return;
							}
							if (GameClient.aStringArray8955[i_11_] != null) {
								String string_13_ = Class173.method1824((GameClient.aStringArray8955[i_11_]));
								if (string_13_ != null && string_13_.equals(string_10_)) {
									FontToolkit.sendMessage(4, new StringBuilder().append(string).append(Tradution.aClass470_5925.translate(GameLanguage.CURRENT_LANGUAGE)).toString());
									return;
								}
							}
						}
						for (int i_14_ = 0; i_14_ < GameClient.anInt8941 * -1054937867; i_14_++) {
							String string_15_ = Class173.method1824((GameClient.playerAccountNames[i_14_]));
							if (string_15_ != null && string_15_.equals(string_10_)) {
								FontToolkit.sendMessage(4, new StringBuilder().append(Tradution.aClass470_5931.translate(GameLanguage.CURRENT_LANGUAGE)).append(string).append(Tradution.aClass470_5932.translate(GameLanguage.CURRENT_LANGUAGE)).toString());
								return;
							}
							if (null != GameClient.aStringArray8945[i_14_]) {
								String string_16_ = Class173.method1824((GameClient.aStringArray8945[i_14_]));
								if (string_16_ != null && string_16_.equals(string_10_)) {
									FontToolkit.sendMessage(4, new StringBuilder().append(Tradution.aClass470_5931.translate(GameLanguage.CURRENT_LANGUAGE)).append(string).append(Tradution.aClass470_5932.translate(GameLanguage.CURRENT_LANGUAGE)).toString());
									return;
								}
							}
						}
						if (Class173.method1824((Player.myPlayer.accountName)).equals(string_10_))
							FontToolkit.sendMessage(4, (Tradution.aClass470_5837.translate(GameLanguage.CURRENT_LANGUAGE)));
						else {
							ConnectionType connectionType = ConnectionType.getConnectionType();
							OutgoingPacketBuffer outgoingPacketBuffer = Class18.method359(OutgoingPacket.ADD_IGNORE_PACKET, connectionType.encryptor);
							outgoingPacketBuffer.payload.writeByte(StaticMethods.method693(string) + 1);
							outgoingPacketBuffer.payload.writeString(string);
							outgoingPacketBuffer.payload.writeByte(bool ? 1 : 0);
							connectionType.sendFrame(outgoingPacketBuffer);
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("am.mt(").append(')').toString());
		}
	}

	static final void method339(ScriptRuntime class403, int i) {
		try {
			IComponentScripter IComponentScripter = (class403.currentInstrBool ? class403.aIComponentScripter_5247 : class403.aIComponentScripter_5246);
			IComponentDefinition class105 = IComponentScripter.componentDefinition;
			IComponentDefinitionCollection IComponentDefinitionCollection = IComponentScripter.IComponentDefinitionCollection;
			Class472.method6065(class105, IComponentDefinitionCollection, class403, -653692022);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("am.nz(").append(')').toString());
		}
	}

	static final void method340(ScriptRuntime runtime) {
		try {
			runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = GameClient.interfaceSelected ? 1 : 0;
			runtime.objectStack[((runtime.objectArgs += 969361751) * -203050393 - 1)] = GameClient.aString8754 == null ? "" : GameClient.aString8754;
			runtime.objectStack[((runtime.objectArgs += 969361751) * -203050393 - 1)] = GameClient.selectedInterfaceOption == null ? "" : GameClient.selectedInterfaceOption;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("am.vt(").append(')').toString());
		}
	}
}
