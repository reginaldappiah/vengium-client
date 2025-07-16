package com.jagex;/* Class365_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class365_Sub1_Sub1 extends Class365_Sub1 {
	public short aShort9795;
	public short aShort9796;
	public short aShort9797;
	public short aShort9798;
	public boolean aBoolean9799;
	byte aByte9800;

	Class365_Sub1_Sub1(Region class331, int plane, int collisionPlane, int worldX, int worldY, int initialHeight, int i_4_, int i_5_, int i_6_, int i_7_, boolean bool, byte i_8_) {
		super(class331);
		this.plane = (byte) plane;
		aByte7724 = (byte) collisionPlane;
		method4340(new Vector3f((float) worldX, (float) worldY, (float) initialHeight));
		aShort9798 = (short) i_4_;
		aShort9796 = (short) i_5_;
		aShort9795 = (short) i_6_;
		aShort9797 = (short) i_7_;
		aBoolean9799 = bool;
		this.aByte9800 = i_8_;
	}

	void method4404() {
		try {
			/* empty */
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ajf.ew(").append(')').toString());
		}
	}

	int method4354(Light[] lights, int i) {
		try {
			int i_9_ = 0;
			while_44_: for (int i_10_ = aShort9798; i_10_ <= aShort9796; i_10_++) {
				for (int i_11_ = aShort9795; i_11_ <= aShort9797; i_11_++) {
					long l = (aClass331_7722.aLongArrayArrayArray3554[plane][i_10_][i_11_]);
					long l_12_ = 0L;
					while_43_: while (l_12_ <= 48L) {
						int i_13_ = (int) (l >>> (int) l_12_ & 0xffffL);
						if (i_13_ <= 0)
							break;
						Class321 class321 = (aClass331_7722.aClass321Array3558[i_13_ - 1]);
						for (int i_14_ = 0; i_14_ < i_9_; i_14_++) {
							if (class321.light == lights[i_14_]) {
								l_12_ += 16L;
								continue while_43_;
							}
						}
						lights[i_9_++] = class321.light;
						if (i_9_ == 4) {
							if (i == -1150488077) {
								/* empty */
							}
							break while_44_;
						}
						l_12_ += 16L;
					}
				}
			}
			for (int i_15_ = i_9_; i_15_ < 4; i_15_++)
				lights[i_15_] = null;
			if (this.aByte9800 != 0) {
				int i_16_ = (aShort9798 - -804213305 * aClass331_7722.anInt3553);
				int i_17_ = (aShort9795 - aClass331_7722.anInt3513 * 465603579);
				short i_18_;
				int i_19_;
				int i_20_;
				short i_21_;
				if (1 == this.aByte9800) {
					if (i_17_ > i_16_) {
						i_18_ = aShort9798;
						i_19_ = aShort9795 - 1;
						i_20_ = 1 + aShort9798;
						i_21_ = aShort9795;
					} else {
						i_18_ = aShort9798;
						i_19_ = 1 + aShort9795;
						i_20_ = aShort9798 - 1;
						i_21_ = aShort9795;
					}
				} else if (i_17_ > -i_16_) {
					i_18_ = aShort9798;
					i_19_ = aShort9795 - 1;
					i_20_ = aShort9798 - 1;
					i_21_ = aShort9795;
				} else {
					i_18_ = aShort9798;
					i_19_ = aShort9795 + 1;
					i_20_ = aShort9798 + 1;
					i_21_ = aShort9795;
				}
				int i_22_ = 0;
				while_48_: for (/**/; i_22_ < i_9_; i_22_++) {
					long l = (aClass331_7722.aLongArrayArrayArray3554[plane][i_18_][i_19_]);
					while_45_: do {
						Class321 class321;
						do {
							if (0L == l)
								break while_45_;
							class321 = (aClass331_7722.aClass321Array3558[(int) ((l & 0xffffL) - 1L)]);
							l >>>= 16;
						} while (class321.light != lights[i_22_]);
						if (i == -1150488077) {
							/* empty */
						}
						continue while_48_;
					} while (false);
					l = (aClass331_7722.aLongArrayArrayArray3554[plane][i_20_][i_21_]);
					while_46_: do {
						Class321 class321;
						do {
							if (0L == l)
								break while_46_;
							class321 = (aClass331_7722.aClass321Array3558[(int) ((l & 0xffffL) - 1L)]);
							l >>>= 16;
						} while (class321.light != lights[i_22_]);
						if (i == -1150488077) {
							/* empty */
						}
						continue while_48_;
					} while (false);
					for (int i_23_ = i_22_; i_23_ < i_9_ - 1; i_23_++)
						lights[i_23_] = lights[i_23_ + 1];
					i_9_--;
				}
			}
			return i_9_;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ajf.dg(").append(')').toString());
		}
	}

	boolean method4360(int i) {
		try {
			for (int i_24_ = aShort9798; i_24_ <= aShort9796; i_24_++) {
				for (int i_25_ = aShort9795; i_25_ <= aShort9797; i_25_++) {
					int i_26_ = (aClass331_7722.anInt3538 * 583010427 + (i_24_ - (aClass331_7722.anInt3553 * -804213305)));
					if (i_26_ >= 0) {
						if (i_26_ >= (aClass331_7722.aBooleanArrayArray3563).length) {
							if (i == -697358316) {
								/* empty */
							}
						} else {
							int i_27_ = (i_25_ - (465603579 * aClass331_7722.anInt3513) + (aClass331_7722.anInt3538 * 583010427));
							if (i_27_ >= 0) {
								if (i_27_ >= (aClass331_7722.aBooleanArrayArray3563).length) {
									if (i == -697358316) {
										/* empty */
									}
								} else if (aClass331_7722.aBooleanArrayArray3563[i_26_][i_27_])
									return true;
							}
						}
					}
				}
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ajf.dq(").append(')').toString());
		}
	}

	boolean method4364(GraphicsToolkit graphicsToolkit) {
		try {
			return (aClass331_7722.aClass333_3512.method4074(aByte7724, aShort9798, aShort9796, aShort9795, aShort9797, method4358(graphicsToolkit)));
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ajf.dl(").append(')').toString());
		}
	}

}
