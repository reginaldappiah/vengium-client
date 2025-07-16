package com.jagex;/* Class376 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.utils.TimeUtils;

public class Class376 {
	public char aChar4085;
	public int anInt4086;
	public int anInt4087;
	public int anInt4088;
	public static int anInt4089;
	public static int anInt4090;

	void method4655(Buffer class298_sub53, int i) {
		try {
			for (;;) {
				int i_0_ = class298_sub53.readUByte();
				if (i_0_ == 0) {
					if (i <= 1110101469) {
						/* empty */
					}
					break;
				}
				method4656(class298_sub53, i_0_, 2123525160);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("pq.a(").append(')').toString());
		}
	}

	void method4656(Buffer class298_sub53, int i, int i_1_) {
		try {
			if (i == 1)
				aChar4085 = Class485.keyCodeToSymbol(class298_sub53.readByte());
			else if (i == 2) {
				anInt4086 = class298_sub53.readUShort() * -1304139699;
				anInt4087 = class298_sub53.readUByte() * 480047535;
				anInt4088 = class298_sub53.readUByte() * -1977314169;
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("pq.f(").append(')').toString());
		}
	}

	Class376() {
		/* empty */
	}

	static final void method4657(ScriptRuntime runtime) {
		try {
			int i_2_ = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
			PublicMessage class102 = PublicMessage.getMessageCharacterCount(i_2_);
			int i_3_ = -1;
			if (null != class102)
				i_3_ = class102.rights * -945858763;
			runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = i_3_;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("pq.abv(").append(')').toString());
		}
	}

	static final void method4658(ScriptRuntime class403, int i) {
		try {
			class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919 - 1)] = SettingsManager.settingsManager.groundDecoration.getValue() == 1 ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("pq.ajg(").append(')').toString());
		}
	}

	public static void method4659(int i, int i_4_) {
		try {
			if (StaticMethods.method4931()) {
				if (2084404473 * Class360.socialNetworkId != i)
					Class360.accountName = 2742373017286080113L;
				Class360.socialNetworkId = i * 2035975497;
				ConnectionType.lobbyConnection.stopConnection();
				Class439.loadGameState(4);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("pq.q(").append(')').toString());
		}
	}

	static final void method4660(ScriptRuntime class403, int i) {
		try {
			class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919 - 1)] = (int) (TimeUtils.getTime() / 60000L);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("pq.akn(").append(')').toString());
		}
	}
}
