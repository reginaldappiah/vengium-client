package com.jagex;/* Class515 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

public class Class515 {
	Js5FileSystem aClass243_6229;
	Class521[] aClass521Array6230;
	static int anInt6231 = 0;
	int anInt6232;
	static long aLong6233;

	public Class510[] method6294(int i) {
		try {
			if (i < 0 || i >= this.aClass521Array6230.length)
				return (method6297(0, 0, 1721668121).aClass510Array6280);
			Class521 class521 = this.aClass521Array6230[i];
			if (!class521.aBoolean6279 || class521.aClass510Array6280.length <= 1)
				return class521.aClass510Array6280;
			int i_1_ = this.anInt6232 * -644243797 == -1 ? 0 : 1;
			Random random = new Random();
			Class510[] class510s = (new Class510[class521.aClass510Array6280.length]);
			System.arraycopy(class521.aClass510Array6280, 0, class510s, 0, class510s.length);
			for (int i_2_ = i_1_; i_2_ < class510s.length; i_2_++) {
				int i_3_ = (TranslatedCanvas.method3039(random, class510s.length - i_1_, (byte) -54) + i_1_);
				Class510 class510 = class521.aClass510Array6280[i_2_];
				class510s[i_2_] = class510s[i_3_];
				class510s[i_3_] = class510;
			}
			return class510s;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("vo.b(").append(')').toString());
		}
	}

	public Class509 method6295(int i, byte i_4_) {
		try {
			byte[] is = this.aClass243_6229.getFileFromArchive(i, 0);
			Class509 class509 = new Class509();
			class509.method6283(new Buffer(is), -391228687);
			return class509;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("vo.f(").append(')').toString());
		}
	}

	public Class515(GameContext class411, GameLanguage class429, Js5FileSystem class243) {
		this.aClass243_6229 = class243;
		Buffer class298_sub53 = new Buffer(this.aClass243_6229.getFileFromArchive(0, 0));
		int i = ((null == class298_sub53.buffer || class298_sub53.buffer.length < 1) ? -1 : class298_sub53.readUByte());
		if (i < 4) {
			this.aClass521Array6230 = new Class521[0];
			this.anInt6232 = -818506755;
		} else {
			int i_5_ = class298_sub53.readUByte();
			Class146[] class146s = Class521.method6323(521246259);
			boolean bool = true;
			if (i_5_ != class146s.length)
				bool = false;
			else {
				for (int i_6_ = 0; i_6_ < class146s.length; i_6_++) {
					int i_7_ = class298_sub53.readUByte();
					if (i_7_ != class146s[i_6_].anInt1574 * -1509893635) {
						bool = false;
						break;
					}
				}
			}
			if (bool) {
				int i_8_ = class298_sub53.readUByte();
				int i_9_ = class298_sub53.readUByte();
				int i_10_;
				int i_11_;
				if (i > 2) {
					this.anInt6232 = class298_sub53.readShort() * 818506755;
					i_10_ = class298_sub53.readUTriByte();
					i_11_ = class298_sub53.readUShort();
				} else {
					this.anInt6232 = -818506755;
					i_10_ = 0;
					i_11_ = 0;
				}
				this.aClass521Array6230 = new Class521[1 + i_9_];
				for (int i_12_ = 0; i_12_ < i_8_; i_12_++) {
					int i_13_ = class298_sub53.readUByte();
					boolean bool_14_ = class298_sub53.readUByte() == 1;
					int i_15_ = class298_sub53.readUShort();
					Class510[] class510s;
					if (this.anInt6232 * -644243797 == -1) {
						class510s = new Class510[i_15_];
						for (int i_16_ = 0; i_16_ < i_15_; i_16_++) {
							int i_17_ = class298_sub53.readUShort();
							int i_18_ = class298_sub53.readUTriByte();
							int i_19_ = class298_sub53.readUShort();
							class510s[i_16_] = new Class510(i_17_, i_18_, i_19_);
						}
						this.aClass521Array6230[i_13_] = new Class521(bool_14_, class510s);
					} else {
						class510s = new Class510[1 + i_15_];
						class510s[0] = new Class510((-644243797 * this.anInt6232), i_10_, i_11_);
						for (int i_20_ = 0; i_20_ < i_15_; i_20_++) {
							int i_21_ = class298_sub53.readUShort();
							int i_22_ = class298_sub53.readUTriByte();
							int i_23_ = class298_sub53.readUShort();
							class510s[i_20_ + 1] = new Class510(i_21_, i_22_, i_23_);
						}
					}
					this.aClass521Array6230[i_13_] = new Class521(bool_14_, class510s);
				}
				for (int i_24_ = 0; i_24_ < i_9_ + 1; i_24_++) {
					if (null == this.aClass521Array6230[i_24_])
						this.aClass521Array6230[i_24_] = method6297(i_10_, i_11_, 1315448185);
				}
			} else {
				this.aClass521Array6230 = new Class521[0];
				this.anInt6232 = -818506755;
			}
		}
	}

	public boolean method6296(byte i) {
		try {
			return -1 != -644243797 * this.anInt6232;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("vo.p(").append(')').toString());
		}
	}

	Class521 method6297(int i, int i_25_, int i_26_) {
		try {
			if (-1 == this.anInt6232 * -644243797)
				return new Class521(false, new Class510[0]);
			Class510 class510 = new Class510(this.anInt6232 * -644243797, i, i_25_);
			return new Class521(false, new Class510[] { class510 });
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("vo.a(").append(')').toString());
		}
	}

	static final void method6298(ScriptRuntime class403, int i) {
		try {
			IComponentScripter IComponentScripter = (class403.currentInstrBool ? class403.aIComponentScripter_5247 : class403.aIComponentScripter_5246);
			IComponentDefinition class105 = IComponentScripter.componentDefinition;
			IComponentDefinitionCollection IComponentDefinitionCollection = IComponentScripter.IComponentDefinitionCollection;
			ConfigDefinitions.method3978(class105, class403);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("vo.lz(").append(')').toString());
		}
	}
}
