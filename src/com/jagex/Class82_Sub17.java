package com.jagex;/* Class82_Sub17 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.network.OutgoingPacket;

public class Class82_Sub17 extends Class82 {
	int anInt6887;
	int anInt6888;
	int anInt6889;

	public void method868() {
		Class94 class94 = (Class87.aClass94Array794[this.anInt6889 * -824702981]);
		Class80 class80 = (Class87.aClass80Array795[this.anInt6888 * -1213610501]);
		class80.method852(class94, this.anInt6887 * 301530619, 1628828546);
	}

	public void method866() {
		try {
			Class94 class94 = (Class87.aClass94Array794[this.anInt6889 * -824702981]);
			Class80 class80 = (Class87.aClass80Array795[this.anInt6888 * -1213610501]);
			class80.method852(class94, this.anInt6887 * 301530619, 1628828546);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("yf.f(").append(')').toString());
		}
	}

	Class82_Sub17(Buffer class298_sub53) {
		super(class298_sub53);
		this.anInt6889 = class298_sub53.readUShort() * 1115286323;
		this.anInt6888 = class298_sub53.readUShort() * -1394180813;
		this.anInt6887 = class298_sub53.readUByte() * 1303807283;
	}

	public void method869() {
		Class94 class94 = (Class87.aClass94Array794[this.anInt6889 * -824702981]);
		Class80 class80 = (Class87.aClass80Array795[this.anInt6888 * -1213610501]);
		class80.method852(class94, this.anInt6887 * 301530619, 1628828546);
	}

	static void method918(IComponentDefinition class105, int i, int i_0_, int i_1_) {
		try {
			Class436.componentDefinition = class105;
			Class436.anInt5487 = i * -1021462033;
			Class436.anInt5502 = i_0_ * -1325119769;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("yf.av(").append(')').toString());
		}
	}

	static final void method919(ScriptRuntime class403, int i) {
		try {
			SettingsManager.settingsManager.setValue(SettingsManager.settingsManager.sceneryShadows, (class403.integerStack[((class403.integerStackOffset -= -391880689) * 681479919)]));
			GameClient.myRegion.method2667();
			ToMoveSettings.encodeBuffer();
			GameClient.sentPreferences = false;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("yf.aib(").append(')').toString());
		}
	}

	public static void method920(int[] is, int[] is_2_, int i, int i_3_, int i_4_) {
		try {
			if (i < i_3_) {
				int i_5_ = (i + i_3_) / 2;
				int i_6_ = i;
				int i_7_ = is[i_5_];
				is[i_5_] = is[i_3_];
				is[i_3_] = i_7_;
				int i_8_ = is_2_[i_5_];
				is_2_[i_5_] = is_2_[i_3_];
				is_2_[i_3_] = i_8_;
				int i_9_ = 2147483647 == i_7_ ? 0 : 1;
				for (int i_10_ = i; i_10_ < i_3_; i_10_++) {
					if (is[i_10_] < i_7_ + (i_10_ & i_9_)) {
						int i_11_ = is[i_10_];
						is[i_10_] = is[i_6_];
						is[i_6_] = i_11_;
						int i_12_ = is_2_[i_10_];
						is_2_[i_10_] = is_2_[i_6_];
						is_2_[i_6_++] = i_12_;
					}
				}
				is[i_3_] = is[i_6_];
				is[i_6_] = i_7_;
				is_2_[i_3_] = is_2_[i_6_];
				is_2_[i_6_] = i_8_;
				method920(is, is_2_, i, i_6_ - 1, 1275694928);
				method920(is, is_2_, 1 + i_6_, i_3_, 415383023);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("yf.i(").append(')').toString());
		}
	}

	static final void method921(ScriptRuntime class403, byte i) {
		try {
			class403.integerStackOffset -= -1175642067;
			GameClient.anInt8837 = 1583527743 * (class403.integerStack[681479919 * class403.integerStackOffset]);
			ShaderProgramToolkit.aClass459_6404 = StaticMethods.method2571((class403.integerStack[(class403.integerStackOffset * 681479919) + 1]), 2087599862);
			if (null == ShaderProgramToolkit.aClass459_6404)
				ShaderProgramToolkit.aClass459_6404 = Class459.aClass459_5671;
			GameClient.anInt8913 = (-1777248765 * (class403.integerStack[2 + class403.integerStackOffset * 681479919]));
			ConnectionType connectionType = ConnectionType.getConnectionType();
			OutgoingPacketBuffer outgoingPacketBuffer = Class18.method359(OutgoingPacket.aClass198_2053, connectionType.encryptor);
			outgoingPacketBuffer.payload.writeByte(-1168328513 * GameClient.anInt8837);
			outgoingPacketBuffer.payload.writeByte(1790024195 * ShaderProgramToolkit.aClass459_6404.anInt5673);
			outgoingPacketBuffer.payload.writeByte(GameClient.anInt8913 * -1710848853);
			connectionType.sendFrame(outgoingPacketBuffer);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("yf.abz(").append(')').toString());
		}
	}
}
