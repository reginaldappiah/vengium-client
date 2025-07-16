package com.jagex;/* Class308 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.game.cache.config.prefetch.JS5PrefetchType;
import com.jagex.utils.TimeUtils;
import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggPage;
import jagtheora.ogg.OggStreamState;
import jagtheora.ogg.OggSyncState;

import java.io.IOException;

public abstract class Class308 {
	Class298_Sub24_Sub1 aClass298_Sub24_Sub1_3268;
	byte[] aByteArray3270;
	OggPage anOggPage3271;
	OggPacket anOggPacket3272;
	OggSyncState anOggSyncState3273;
	String aString3274;
	boolean aBoolean3276;
	boolean aBoolean3277;
	Class298_Sub24_Sub3 aClass298_Sub24_Sub3_3278;
	LinkedList aClass437_3279;
	Class298_Sub24_Sub4 aClass298_Sub24_Sub4_3280;
	boolean aBoolean3281;
	boolean aBoolean3282;

	public Class298_Sub24_Sub1 method3763() {
		try {
			return this.aClass298_Sub24_Sub1_3268;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("mu.r(").append(')').toString());
		}
	}

	public void method3764(String string, byte i) {
		try {
			this.aString3274 = string;
			if (this.aString3274 == null)
				this.aClass298_Sub24_Sub4_3280 = null;
			else {
				if (null != this.aClass298_Sub24_Sub4_3280 && !(this.aString3274.equals(this.aClass298_Sub24_Sub4_3280.method3091((byte) 108))))
					this.aClass298_Sub24_Sub4_3280 = null;
				if (this.aClass298_Sub24_Sub4_3280 == null) {
					for (Class298_Sub24 class298_sub24 = (Class298_Sub24) this.aClass437_3279.method5816(); null != class298_sub24; class298_sub24 = (Class298_Sub24) this.aClass437_3279.method5815()) {
						if (class298_sub24 instanceof Class298_Sub24_Sub4) {
							Class298_Sub24_Sub4 class298_sub24_sub4 = (Class298_Sub24_Sub4) class298_sub24;
							if (this.aString3274.equals(class298_sub24_sub4.method3091((byte) 59))) {
								this.aClass298_Sub24_Sub4_3280 = class298_sub24_sub4;
								break;
							}
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("mu.s(").append(')').toString());
		}
	}

	void method3765(int i) throws IOException {
		try {
			while (this.aClass298_Sub24_Sub3_3278.anOggStreamState7351.packetOut(this.anOggPacket3272) != 1) {
				Class298_Sub24 class298_sub24 = method3774((byte) 0);
				if (class298_sub24 == null) {
					if (this.aBoolean3277)
						method3769(444648186);
					return;
				}
				if (this.aClass298_Sub24_Sub4_3280 == class298_sub24)
					method3767((byte) 76);
			}
			this.aClass298_Sub24_Sub3_3278.method3073(this.anOggPacket3272, -1226862921);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("mu.p(").append(')').toString());
		}
	}

	void method3767(byte i) {
		try {
			for (Class298_Sub24 class298_sub24 = (Class298_Sub24) this.aClass437_3279.method5816(); null != class298_sub24; class298_sub24 = (Class298_Sub24) this.aClass437_3279.method5815()) {
				if (!(class298_sub24 instanceof Class298_Sub24_Sub4)) {
					if (i <= 0) {
						/* empty */
					}
				} else {
					Class298_Sub24_Sub4 class298_sub24_sub4 = (Class298_Sub24_Sub4) class298_sub24;
					while (((class298_sub24_sub4.anInt7352) * -1312498565 <= 8 || (method3779() > (double) class298_sub24_sub4.method3093(-136313953))) && (class298_sub24_sub4.anOggStreamState7351.packetOut(this.anOggPacket3272)) == 1)
						class298_sub24_sub4.method3073((this.anOggPacket3272), -1226862921);
				}
			}
			method3764(this.aString3274, (byte) 111);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("mu.i(").append(')').toString());
		}
	}

	boolean method3768(int i) {
		try {
			if (null != this.aClass298_Sub24_Sub1_3268)
				return (!this.aClass298_Sub24_Sub3_3278.method3087(-1737998296) || (method3779() > this.aClass298_Sub24_Sub3_3278.method3085(-2077117247)));
			double d = (double) this.aClass298_Sub24_Sub3_3278.method3084(-1240396603);
			return (0.0 == d || ((double) TimeUtils.getTime() >= (double) this.aClass298_Sub24_Sub3_3278.method3086((byte) 0) + 1000.0 / d));
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("mu.k(").append(')').toString());
		}
	}

	void method3769(int i) {
		try {
			for (Class298_Sub24 class298_sub24 = (Class298_Sub24) this.aClass437_3279.method5816(); null != class298_sub24; class298_sub24 = (Class298_Sub24) this.aClass437_3279.method5815()) {
				if (this.aClass298_Sub24_Sub3_3278 == class298_sub24) {
					if (i == -1942073337) {
						/* empty */
					}
				} else {
					while (class298_sub24.anOggStreamState7351.packetOut() == 1)
						class298_sub24.method3073((this.anOggPacket3272), -1226862921);
				}
			}
			if (this.aClass298_Sub24_Sub3_3278 != null) {
				for (int i_0_ = 0; i_0_ < 10 && method3768(-1610938594); i_0_++) {
					if (this.aClass298_Sub24_Sub3_3278.anOggStreamState7351.packetOut() != 1) {
						method3771((byte) 61);
						break;
					}
					this.aClass298_Sub24_Sub3_3278.method3073(this.anOggPacket3272, -1226862921);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("mu.d(").append(')').toString());
		}
	}

	public Class298_Sub24_Sub3 method3770() {
		try {
			return this.aClass298_Sub24_Sub3_3278;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("mu.posX(").append(')').toString());
		}
	}

	public void method3771(byte i) {
		try {
			if (!this.aBoolean3276) {
				for (Class298_Sub24 class298_sub24 = (Class298_Sub24) this.aClass437_3279.method5816(); class298_sub24 != null; class298_sub24 = (Class298_Sub24) this.aClass437_3279.method5815()) {
					class298_sub24.method3075(1392127048);
					class298_sub24.anOggStreamState7351.f();
				}
				this.anOggPacket3272.f();
				this.anOggPage3271.f();
				this.anOggSyncState3273.f();
				this.aBoolean3276 = true;
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("mu.u(").append(')').toString());
		}
	}

	public Class298_Sub24_Sub4 method3772() {
		try {
			return this.aClass298_Sub24_Sub4_3280;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("mu.q(").append(')').toString());
		}
	}

	public boolean method3773(int i) {
		try {
			if (!this.aBoolean3276 && !this.aBoolean3277)
				return false;
            return !(null != this.aClass298_Sub24_Sub1_3268 && this.aClass298_Sub24_Sub1_3268.method3083(-693943954) > 0);
        } catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("mu.n(").append(')').toString());
		}
	}

	Class298_Sub24 method3774(byte i) throws IOException {
		try {
			if (this.aBoolean3276)
				throw new IllegalStateException();
			if (this.aBoolean3277)
				return null;
			while_75_: do {
				int i_1_;
				do {
					if (this.anOggSyncState3273.pageOut(this.anOggPage3271) > 0)
						break while_75_;
					i_1_ = method3775(this.aByteArray3270);
					if (-1 == i_1_) {
						this.aBoolean3277 = true;
						return null;
					}
					if (0 == i_1_)
						return null;
				} while (this.anOggSyncState3273.write(this.aByteArray3270, i_1_));
				throw new RuntimeException("");
			} while (false);
			int i_2_ = this.anOggPage3271.getSerialNumber();
			if (this.anOggPage3271.isBOS()) {
				OggStreamState oggstreamstate = new OggStreamState(i_2_);
				if (!oggstreamstate.pageIn(this.anOggPage3271))
					throw new IllegalStateException();
				if (oggstreamstate.packetPeek(this.anOggPacket3272) != 1)
					throw new IllegalStateException();
				Class298_Sub24 class298_sub24;
				if (null == this.aClass298_Sub24_Sub3_3278 && this.anOggPacket3272.isTheora()) {
					this.aClass298_Sub24_Sub3_3278 = new Class298_Sub24_Sub3(oggstreamstate);
					class298_sub24 = this.aClass298_Sub24_Sub3_3278;
				} else if (null == this.aClass298_Sub24_Sub1_3268 && this.anOggPacket3272.isVorbis()) {
					this.aClass298_Sub24_Sub1_3268 = new Class298_Sub24_Sub1(oggstreamstate);
					class298_sub24 = this.aClass298_Sub24_Sub1_3268;
				} else {
					byte[] is = this.anOggPacket3272.getData();
					StringBuilder stringbuilder = new StringBuilder();
					for (int i_3_ = 1; i_3_ < is.length; i_3_++) {
						if (!Character.isLetterOrDigit((char) is[i_3_])) {
							if (i != 0) {
								/* empty */
							}
							break;
						}
						stringbuilder.append((char) is[i_3_]);
					}
					String string = stringbuilder.toString();
					if (string.equals("kate"))
						class298_sub24 = new Class298_Sub24_Sub4(oggstreamstate);
					else
						class298_sub24 = new Class298_Sub24_Sub2(oggstreamstate);
				}
				this.aClass437_3279.connect(class298_sub24, (long) i_2_);
				return class298_sub24;
			}
			Class298_Sub24 class298_sub24 = ((Class298_Sub24) this.aClass437_3279.get((long) i_2_));
			if (!class298_sub24.anOggStreamState7351.pageIn(this.anOggPage3271))
				throw new IllegalStateException();
			return class298_sub24;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("mu.f(").append(')').toString());
		}
	}

	abstract int method3775(byte[] buffer) throws IOException;

	public void method3776(boolean bool) {
		try {
			if (null != this.aClass298_Sub24_Sub1_3268) {
				TranslatedCanvas class298_sub19_sub3 = this.aClass298_Sub24_Sub1_3268.method3082();
				if (class298_sub19_sub3 != null)
					class298_sub19_sub3.method3036(bool, 1527417335);
			}
			this.aBoolean3282 = !this.aBoolean3282;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("mu.posY(").append(')').toString());
		}
	}

	public double method3779() {
		try {
			if (this.aClass298_Sub24_Sub1_3268 != null)
				return this.aClass298_Sub24_Sub1_3268.method3081(-762609524);
			if (null != this.aClass298_Sub24_Sub3_3278)
				return this.aClass298_Sub24_Sub3_3278.method3085(-831725814);
			return 0.0;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("mu.z(").append(')').toString());
		}
	}

	public void method3780() throws IOException {
		try {
			if (!this.aBoolean3282) {
				while_77_: for (/**/; !this.aBoolean3276; this.aBoolean3281 = false) {
					Class298_Sub24 class298_sub24;
					if (!this.aBoolean3281) {
						class298_sub24 = method3774((byte) 0);
						if (class298_sub24 == null) {
							if (this.aBoolean3277)
								method3769(483146986);
							break;
						}
						if (null == class298_sub24)
							throw new IllegalStateException();
						this.aBoolean3281 = true;
					} else
						class298_sub24 = ((Class298_Sub24) (this.aClass437_3279.get((long) this.anOggPage3271.getSerialNumber())));
					if (class298_sub24 == this.aClass298_Sub24_Sub1_3268) {
						if (this.aClass298_Sub24_Sub1_3268.method3083(-693943954) < 50) {
							do {
								if ((this.aClass298_Sub24_Sub1_3268.anOggStreamState7351.packetOut(this.anOggPacket3272)) != 1)
									continue while_77_;
								this.aClass298_Sub24_Sub1_3268.method3073(this.anOggPacket3272, -1226862921);
								method3767((byte) 126);
								if (this.aClass298_Sub24_Sub3_3278 != null) {
									double d = this.aClass298_Sub24_Sub3_3278.method3085(-820053880);
									for (int i_4_ = 0; i_4_ < 10 && method3768(1506745043); i_4_++) {
										method3765(-508179442);
										if (this.aBoolean3276)
											return;
									}
									if (d < this.aClass298_Sub24_Sub3_3278.method3085(-1579482552))
										break;
								}
							} while (this.aClass298_Sub24_Sub1_3268.method3083(-693943954) < 50);
							break;
						}
						break;
					}
					if (class298_sub24 instanceof Class298_Sub24_Sub4)
						method3767((byte) 72);
					else if (class298_sub24 != this.aClass298_Sub24_Sub3_3278) {
						while ((class298_sub24.anOggStreamState7351.packetOut(this.anOggPacket3272)) == 1) {
							if (1 == (class298_sub24.anInt7352) * -1312498565 && (class298_sub24 instanceof Class298_Sub24_Sub4))
								method3764(this.aString3274, (byte) 43);
							class298_sub24.method3073((this.anOggPacket3272), -1226862921);
						}
					} else if ((null == this.aClass298_Sub24_Sub1_3268) && !this.aBoolean3282) {
						for (int i_5_ = 0; i_5_ < 10 && method3768(1830575914); i_5_++) {
							method3765(-508179442);
							if (this.aBoolean3276)
								break;
						}
						break;
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("mu.b(").append(')').toString());
		}
	}

	Class308(int i) {
		if (!JS5PrefetchType.getPrefetch().load("jagtheora"))
			throw new RuntimeException("");
		this.aByteArray3270 = new byte[i];
		this.anOggSyncState3273 = new OggSyncState();
		this.anOggPage3271 = new OggPage();
		this.anOggPacket3272 = new OggPacket();
		this.aClass437_3279 = new LinkedList(8);
	}

	static final void method3781(ScriptRuntime class403, byte i) {
		try {
			int i_6_ = (class403.integerStack[((class403.integerStackOffset -= -391880689) * 681479919)]);
			IComponentDefinition class105 = IComponentDefinition.getInterfaceComponent(i_6_);
			IComponentDefinitionCollection IComponentDefinitionCollection = IComponentDefinition.getIComponentDefinitionCollections[i_6_ >> 16];
			ToMoveIComponentScripts.method4681(class105, class403);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("mu.la(").append(')').toString());
		}
	}

	static final void method3782(int i, int i_7_, int i_8_, int i_9_, int i_10_) {
		try {
			int i_11_ = 0;
			int i_12_ = i_8_;
			int i_13_ = -i_8_;
			int i_14_ = -1;
			int i_15_ = StaticMethods.method6012(i_8_ + i, Class372_Sub1.anInt4051 * -1424479739, Class372_Sub1.anInt4048 * 1135094847);
			int i_16_ = StaticMethods.method6012(i - i_8_, Class372_Sub1.anInt4051 * -1424479739, 1135094847 * Class372_Sub1.anInt4048);
			Class82_Sub22.method940(Class372_Sub1.anIntArrayArray4047[i_7_], i_16_, i_15_, i_9_);
			while (i_12_ > i_11_) {
				i_14_ += 2;
				i_13_ += i_14_;
				if (i_13_ > 0) {
					i_12_--;
					i_13_ -= i_12_ << 1;
					int i_17_ = i_7_ - i_12_;
					int i_18_ = i_7_ + i_12_;
					if (i_18_ >= 1155384281 * Class372_Sub1.anInt4049 && i_17_ <= Class372_Sub1.anInt4050 * -1062447355) {
						int i_19_ = StaticMethods.method6012(i_11_ + i, (Class372_Sub1.anInt4051 * -1424479739), (1135094847 * Class372_Sub1.anInt4048));
						int i_20_ = StaticMethods.method6012(i - i_11_, (-1424479739 * Class372_Sub1.anInt4051), (Class372_Sub1.anInt4048 * 1135094847));
						if (i_18_ <= Class372_Sub1.anInt4050 * -1062447355)
							Class82_Sub22.method940((Class372_Sub1.anIntArrayArray4047[i_18_]), i_20_, i_19_, i_9_);
						if (i_17_ >= 1155384281 * Class372_Sub1.anInt4049)
							Class82_Sub22.method940((Class372_Sub1.anIntArrayArray4047[i_17_]), i_20_, i_19_, i_9_);
					}
				}
				i_11_++;
				int i_21_ = i_7_ - i_11_;
				int i_22_ = i_11_ + i_7_;
				if (i_22_ >= 1155384281 * Class372_Sub1.anInt4049 && i_21_ <= -1062447355 * Class372_Sub1.anInt4050) {
					int i_23_ = StaticMethods.method6012(i_12_ + i, (-1424479739 * Class372_Sub1.anInt4051), (Class372_Sub1.anInt4048 * 1135094847));
					int i_24_ = StaticMethods.method6012(i - i_12_, (Class372_Sub1.anInt4051 * -1424479739), 1135094847 * (Class372_Sub1.anInt4048));
					if (i_22_ <= Class372_Sub1.anInt4050 * -1062447355)
						Class82_Sub22.method940((Class372_Sub1.anIntArrayArray4047[i_22_]), i_24_, i_23_, i_9_);
					if (i_21_ >= Class372_Sub1.anInt4049 * 1155384281)
						Class82_Sub22.method940((Class372_Sub1.anIntArrayArray4047[i_21_]), i_24_, i_23_, i_9_);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("mu.n(").append(')').toString());
		}
	}

	static final void method3783(ScriptRuntime runtime) {
		try {
			IComponentScripter IComponentScripter = (runtime.currentInstrBool ? runtime.aIComponentScripter_5247 : runtime.aIComponentScripter_5246);
			IComponentDefinition component = IComponentScripter.componentDefinition;
			IComponentDefinitionCollection IComponentDefinitionCollection = IComponentScripter.IComponentDefinitionCollection;
			ToMoveIComponentScripts.method2536(component, IComponentDefinitionCollection, runtime);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("mu.dh(").append(')').toString());
		}
	}

	public static void method3784(byte i) {
		try {
			if (Class474.aBoolean5970) {
				if (Class474.anInt5971 * -64101949 < -1648308965 * StaticMethods.anInt5190)
					Class474.anInt5971 = StaticMethods.anInt5190 * 1429182921;
				while (Class474.anInt5971 * -64101949 < -499146007 * StaticMethods.anInt3630) {
					Class343_Sub1 class343_sub1 = StaticMethods.method2105(Class474.anInt5971 * -64101949);
					if (class343_sub1 == null || -1 != class343_sub1.address * 512449113)
						Class474.anInt5971 += 854136555;
					else {
						if (Class474.aClass396_5978 == null)
							Class474.aClass396_5978 = (GameClient.aClass404_8715.method4946(class343_sub1.aString7718, (byte) 111));
						int address = Class474.aClass396_5978.address * -747638219;
						if (address == -1)
							break;
						class343_sub1.address = address * -718385687;
						Class474.anInt5971 += 854136555;
						Class474.aClass396_5978 = null;
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("mu.a(").append(')').toString());
		}
	}
}
