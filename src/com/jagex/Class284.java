package com.jagex;/* Class284 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.utils.TimeUtils;

import java.awt.*;

public class Class284 {
	int anInt3046;
	public static boolean isSteroSound;
	static int anInt3048;
	static int anInt3049 = 8;
	public static int anInt3050 = 256;
	long aLong3051;
	int[] anIntArray3052;
	boolean aBoolean3053 = false;
	Class298_Sub19 aClass298_Sub19_3054;
	int anInt3055 = -2056222048;
	int anInt3056;
	static Class288 aClass288_3057;
	Class298_Sub19[] aClass298_Sub19Array3058;
	public static int anInt3059;
	long aLong3060;
	int anInt3061;
	int anInt3062;
	int anInt3063;
	long aLong3064;
	boolean aBoolean3065;
	static int anInt3066 = 3;
	static int anInt3067 = 16384;
	static int anInt3068 = 2;
	static int anInt3069 = 4;
	static int anInt3070 = 286331153;
	int anInt3071;
	int anInt3072;
	Class298_Sub19[] aClass298_Sub19Array3073;

	public final synchronized void method2679(Class298_Sub19 class298_sub19) {
			this.aClass298_Sub19_3054 = class298_sub19;
	}

	public final synchronized void method2680() {
			if (!this.aBoolean3053) {
				long l = TimeUtils.getTime();
				try {
					if (l > (6353619706144323107L * this.aLong3051 + 6000L))
						this.aLong3051 = -2662467539374708341L * (l - 6000L);
					for (/**/; (l > (6353619706144323107L * this.aLong3051 + 5000L)); l = TimeUtils.getTime()) {
						method2681(256, -518493991);
						this.aLong3051 += (-2662467539374708341L * (long) (256000 / (anInt3059 * 1164070869)));
					}
				} catch (Exception exception) {
					this.aLong3051 = -2662467539374708341L * l;
				}
				if (null != this.anIntArray3052) {
					try {
						if (0L != (-2629227736231104439L * this.aLong3060)) {
							if (l < (this.aLong3060 * -2629227736231104439L))
								return;
							method2684((this.anInt3046 * -1894797445), 816646714);
							this.aLong3060 = 0L;
							this.aBoolean3065 = true;
						}
						int i_0_ = method2688(-2047791436);
						if (this.anInt3063 * -25238017 - i_0_ > 1581283719 * this.anInt3061)
							this.anInt3061 = (-2137785289 * (-25238017 * this.anInt3063 - i_0_));
						int i_1_ = (this.anInt3056 * 444653019 + this.anInt3071 * 1513728603);
						if (i_1_ + 256 > 16384)
							i_1_ = 16128;
						if (i_1_ + 256 > -1894797445 * this.anInt3046) {
							this.anInt3046 += -480326656;
							if (-1894797445 * this.anInt3046 > 16384)
								this.anInt3046 = 904708096;
							method2686(331463442);
							method2684((this.anInt3046 * -1894797445), 1013749816);
							i_0_ = 0;
							this.aBoolean3065 = true;
							if (i_1_ + 256 > this.anInt3046 * -1894797445) {
								i_1_ = (-1894797445 * this.anInt3046) - 256;
								this.anInt3056 = (-1422272941 * (i_1_ - (this.anInt3071 * 1513728603)));
							}
						}
						for (/**/; i_0_ < i_1_; i_0_ += 256) {
							method2682(this.anIntArray3052, 256);
							method2685();
						}
						if (l > (this.aLong3064 * -9016197443635909135L)) {
							if (!this.aBoolean3065) {
								if ((this.anInt3061 * 1581283719 == 0) && 0 == (-1912576967 * this.anInt3062)) {
									method2686(331463442);
									this.aLong3060 = (2000L + l) * -3392636722701155847L;
									return;
								}
								this.anInt3056 = (Math.min((this.anInt3062 * -1912576967), 1581283719 * (this.anInt3061)) * -1422272941);
								this.anInt3062 = this.anInt3061 * -43955265;
							} else
								this.aBoolean3065 = false;
							this.anInt3061 = 0;
							this.aLong3064 = 6449118444469183249L * (l + 2000L);
						}
						this.anInt3063 = i_0_ * 1927092735;
					} catch (Exception exception) {
						method2686(331463442);
						this.aLong3060 = (l + 2000L) * -3392636722701155847L;
					}
				}
			}
	}

	final void method2681(int i, int i_2_) {
		try {
			this.anInt3072 -= i * -1831995011;
			if (-577697835 * this.anInt3072 < 0)
				this.anInt3072 = 0;
			if (this.aClass298_Sub19_3054 != null)
				this.aClass298_Sub19_3054.method2935(i);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("lu.d(").append(')').toString());
		}
	}

	final void method2682(int[] is, int i) {
		int i_3_ = i;
		if (isSteroSound)
			i_3_ <<= 1;
		Class425.method5742(is, 0, i_3_);
		this.anInt3072 -= i * -1831995011;
		if (null != this.aClass298_Sub19_3054 && this.anInt3072 * -577697835 <= 0) {
			this.anInt3072 += -1831995011 * (anInt3059 * 1164070869 >> 4);
			Class62.method731(this.aClass298_Sub19_3054);
			method2691(this.aClass298_Sub19_3054, this.aClass298_Sub19_3054.method2950());
			int i_4_ = 0;
			int i_5_ = 255;
			int i_6_ = 7;
			while_72_: while (0 != i_5_) {
				int i_7_;
				int i_8_;
				if (i_6_ < 0) {
					i_7_ = i_6_ & 0x3;
					i_8_ = -(i_6_ >> 2);
				} else {
					i_7_ = i_6_;
					i_8_ = 0;
				}
				for (int i_9_ = i_5_ >>> i_7_ & 0x11111111; 0 != i_9_; i_9_ >>>= 4) {
					if (0 != (i_9_ & 0x1)) {
						i_5_ &= 1 << i_7_ ^ 0xffffffff;
						Class298_Sub19 class298_sub19 = null;
						Class298_Sub19 class298_sub19_10_ = this.aClass298_Sub19Array3058[i_7_];
						while (class298_sub19_10_ != null) {
							Class298_Sub26 class298_sub26 = (class298_sub19_10_.aClass298_Sub26_7312);
							if (null != class298_sub26 && (class298_sub26.anInt7362 > i_8_)) {
								i_5_ |= 1 << i_7_;
								class298_sub19 = class298_sub19_10_;
								class298_sub19_10_ = (class298_sub19_10_.aClass298_Sub19_7313);
							} else {
								class298_sub19_10_.aBoolean7310 = true;
								int i_11_ = class298_sub19_10_.method2929();
								i_4_ += i_11_;
								if (class298_sub26 != null)
									class298_sub26.anInt7362 += i_11_;
								if (i_4_ >= (1853708541 * this.anInt3055))
									break while_72_;
								Class298_Sub19 class298_sub19_12_ = class298_sub19_10_.method2930();
								if (null != class298_sub19_12_) {
									int i_13_ = (class298_sub19_10_.anInt7311);
									for (/**/; class298_sub19_12_ != null; class298_sub19_12_ = class298_sub19_10_.method2931())
										method2691(class298_sub19_12_, (i_13_ * class298_sub19_12_.method2950() >> 8));
								}
								Class298_Sub19 class298_sub19_14_ = (class298_sub19_10_.aClass298_Sub19_7313);
								class298_sub19_10_.aClass298_Sub19_7313 = null;
								if (null == class298_sub19)
									this.aClass298_Sub19Array3058[i_7_] = class298_sub19_14_;
								else
									class298_sub19.aClass298_Sub19_7313 = class298_sub19_14_;
								if (class298_sub19_14_ == null)
									this.aClass298_Sub19Array3073[i_7_] = class298_sub19;
								class298_sub19_10_ = class298_sub19_14_;
							}
						}
					}
					i_7_ += 4;
					i_8_++;
				}
				i_6_--;
			}
			for (i_6_ = 0; i_6_ < 8; i_6_++) {
				Class298_Sub19 class298_sub19 = this.aClass298_Sub19Array3058[i_6_];
				Class298_Sub19[] class298_sub19s = this.aClass298_Sub19Array3058;
				int i_15_ = i_6_;
				this.aClass298_Sub19Array3073[i_6_] = null;
				class298_sub19s[i_15_] = null;
				Class298_Sub19 class298_sub19_16_;
				for (/**/; null != class298_sub19; class298_sub19 = class298_sub19_16_) {
					class298_sub19_16_ = (class298_sub19.aClass298_Sub19_7313);
					class298_sub19.aClass298_Sub19_7313 = null;
				}
			}
		}
		if (-577697835 * this.anInt3072 < 0)
			this.anInt3072 = 0;
		if (this.aClass298_Sub19_3054 != null)
			this.aClass298_Sub19_3054.method2934(is, 0, i);
		this.aLong3051 = TimeUtils.getTime() * -2662467539374708341L;
	}

	void method2683(Component component, byte i) throws Exception {
		try {
			/* empty */
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("lu.q(").append(')').toString());
		}
	}

	void method2684(int i, int i_17_) throws Exception {
		try {
			/* empty */
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("lu.n(").append(')').toString());
		}
	}

	void method2685() throws Exception {
		try {
			/* empty */
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("lu.z(").append(')').toString());
		}
	}

	void method2686(int i) {
		try {
			/* empty */
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("lu.posY(").append(')').toString());
		}
	}

	void method2687(short i) throws Exception {
		try {
			/* empty */
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("lu.t(").append(')').toString());
		}
	}

	int method2688(int i) throws Exception {
		try {
			return -1894797445 * this.anInt3046;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("lu.s(").append(')').toString());
		}
	}

	Class284() {
		this.aLong3051 = TimeUtils.getTime() * -2662467539374708341L;
		this.aLong3060 = 0L;
		this.anInt3061 = 0;
		this.anInt3062 = 0;
		this.anInt3063 = 0;
		this.aLong3064 = 0L;
		this.aBoolean3065 = true;
		this.anInt3072 = 0;
		this.aClass298_Sub19Array3058 = new Class298_Sub19[8];
		this.aClass298_Sub19Array3073 = new Class298_Sub19[8];
	}

	public final synchronized void method2689() {
			this.aBoolean3065 = true;
			try {
				method2687((short) -24697);
			} catch (Exception exception) {
				method2686(331463442);
				this.aLong3060 = ((TimeUtils.getTime() + 2000L) * -3392636722701155847L);
			}
	}

	public final synchronized void method2690() {
			if (aClass288_3057 != null) {
				boolean bool = true;
				for (int i_18_ = 0; i_18_ < 2; i_18_++) {
					if (this == (aClass288_3057.aClass284Array3104[i_18_]))
						aClass288_3057.aClass284Array3104[i_18_] = null;
					if (aClass288_3057.aClass284Array3104[i_18_] != null)
						bool = false;
				}
				if (bool) {
					aClass288_3057.aBoolean3103 = true;
					while (aClass288_3057.aBoolean3102)
						IPAddress.method6060(50L);
					aClass288_3057 = null;
				}
			}
			method2686(331463442);
			this.anIntArray3052 = null;
			this.aBoolean3053 = true;
	}

	final void method2691(Class298_Sub19 class298_sub19, int i) {
			int i_20_ = i >> 5;
			Class298_Sub19 class298_sub19_21_ = this.aClass298_Sub19Array3073[i_20_];
			if (null == class298_sub19_21_)
				this.aClass298_Sub19Array3058[i_20_] = class298_sub19;
			else
				class298_sub19_21_.aClass298_Sub19_7313 = class298_sub19;
			this.aClass298_Sub19Array3073[i_20_] = class298_sub19;
			class298_sub19.anInt7311 = i;
	}

	public static void method2692(int i) {
			synchronized (PlayerAppearance.cache) {
				PlayerAppearance.cache.method4186(i);
			}
			synchronized (PlayerAppearance.toolkitCache) {
				PlayerAppearance.toolkitCache.method4186(i);
			}
	}

}
