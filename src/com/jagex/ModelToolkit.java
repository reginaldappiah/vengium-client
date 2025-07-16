package com.jagex;/* Class387 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.game.cache.definition.animation.AnimationFrame;
import com.jagex.game.cache.definition.animation.AnimationFrameBase;
import com.jagex.maths.Matrix43f;

public abstract class ModelToolkit {
	protected boolean aBoolean4148 = false;

	public abstract EffectiveVertex[] method4445();

	int method4729(float f, float f_0_, float f_1_) {
		float f_2_ = f < 0.0F ? -f : f;
		float f_3_ = f_0_ < 0.0F ? -f_0_ : f_0_;
		float f_4_ = f_1_ < 0.0F ? -f_1_ : f_1_;
		if (f_3_ > f_2_ && f_3_ > f_4_) {
			if (f_0_ > 0.0F)
				return 0;
			return 1;
		}
		if (f_4_ > f_2_ && f_4_ > f_3_) {
			if (f_1_ > 0.0F)
				return 2;
			return 3;
		}
		if (f > 0.0F)
			return 4;
		return 5;
	}

	void method4730(int i, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, float[] fs, int i_11_, float f, float f_12_, float f_13_, float[] fs_14_) {
		i -= i_7_;
		i_5_ -= i_8_;
		i_6_ -= i_9_;
		float f_15_ = (float) i * fs[0] + (float) i_5_ * fs[1] + (float) i_6_ * fs[2];
		float f_16_ = (float) i * fs[3] + (float) i_5_ * fs[4] + (float) i_6_ * fs[5];
		float f_17_ = (float) i * fs[6] + (float) i_5_ * fs[7] + (float) i_6_ * fs[8];
		float f_18_;
		float f_19_;
		if (i_10_ == 0) {
			f_18_ = f_15_ + f + 0.5F;
			f_19_ = -f_17_ + f_13_ + 0.5F;
		} else if (i_10_ == 1) {
			f_18_ = f_15_ + f + 0.5F;
			f_19_ = f_17_ + f_13_ + 0.5F;
		} else if (i_10_ == 2) {
			f_18_ = -f_15_ + f + 0.5F;
			f_19_ = -f_16_ + f_12_ + 0.5F;
		} else if (i_10_ == 3) {
			f_18_ = f_15_ + f + 0.5F;
			f_19_ = -f_16_ + f_12_ + 0.5F;
		} else if (i_10_ == 4) {
			f_18_ = f_17_ + f_13_ + 0.5F;
			f_19_ = -f_16_ + f_12_ + 0.5F;
		} else {
			f_18_ = -f_17_ + f_13_ + 0.5F;
			f_19_ = -f_16_ + f_12_ + 0.5F;
		}
		if (i_11_ == 1) {
			float f_20_ = f_18_;
			f_18_ = -f_19_;
			f_19_ = f_20_;
		} else if (i_11_ == 2) {
			f_18_ = -f_18_;
			f_19_ = -f_19_;
		} else if (i_11_ == 3) {
			float f_21_ = f_18_;
			f_18_ = f_19_;
			f_19_ = -f_21_;
		}
		fs_14_[0] = f_18_;
		fs_14_[1] = f_19_;
	}

	float[] method4731(int i, int i_22_, int i_23_, int i_24_, float f, float f_25_, float f_26_) {
		float[] fs = new float[9];
		float[] fs_27_ = new float[9];
		float f_28_ = (float) Math.cos((double) ((float) i_24_ * 0.024543693F));
		float f_29_ = (float) Math.sin((double) ((float) i_24_ * 0.024543693F));
		float f_30_ = 1.0F - f_28_;
		fs[0] = f_28_;
		fs[1] = 0.0F;
		fs[2] = f_29_;
		fs[3] = 0.0F;
		fs[4] = 1.0F;
		fs[5] = 0.0F;
		fs[6] = -f_29_;
		fs[7] = 0.0F;
		fs[8] = f_28_;
		float[] fs_31_ = new float[9];
		float f_32_ = 1.0F;
		float f_33_ = 0.0F;
		f_28_ = (float) i_22_ / 32767.0F;
		f_29_ = -(float) Math.sqrt((double) (1.0F - f_28_ * f_28_));
		f_30_ = 1.0F - f_28_;
		float f_34_ = (float) Math.sqrt((double) (i * i + i_23_ * i_23_));
		if (f_34_ == 0.0F && f_28_ == 0.0F)
			fs_27_ = fs;
		else {
			if (f_34_ != 0.0F) {
				f_32_ = (float) -i_23_ / f_34_;
				f_33_ = (float) i / f_34_;
			}
			fs_31_[0] = f_28_ + f_32_ * f_32_ * f_30_;
			fs_31_[1] = f_33_ * f_29_;
			fs_31_[2] = f_33_ * f_32_ * f_30_;
			fs_31_[3] = -f_33_ * f_29_;
			fs_31_[4] = f_28_;
			fs_31_[5] = f_32_ * f_29_;
			fs_31_[6] = f_32_ * f_33_ * f_30_;
			fs_31_[7] = -f_32_ * f_29_;
			fs_31_[8] = f_28_ + f_33_ * f_33_ * f_30_;
			fs_27_[0] = fs[0] * fs_31_[0] + fs[1] * fs_31_[3] + fs[2] * fs_31_[6];
			fs_27_[1] = fs[0] * fs_31_[1] + fs[1] * fs_31_[4] + fs[2] * fs_31_[7];
			fs_27_[2] = fs[0] * fs_31_[2] + fs[1] * fs_31_[5] + fs[2] * fs_31_[8];
			fs_27_[3] = fs[3] * fs_31_[0] + fs[4] * fs_31_[3] + fs[5] * fs_31_[6];
			fs_27_[4] = fs[3] * fs_31_[1] + fs[4] * fs_31_[4] + fs[5] * fs_31_[7];
			fs_27_[5] = fs[3] * fs_31_[2] + fs[4] * fs_31_[5] + fs[5] * fs_31_[8];
			fs_27_[6] = fs[6] * fs_31_[0] + fs[7] * fs_31_[3] + fs[8] * fs_31_[6];
			fs_27_[7] = fs[6] * fs_31_[1] + fs[7] * fs_31_[4] + fs[8] * fs_31_[7];
			fs_27_[8] = fs[6] * fs_31_[2] + fs[7] * fs_31_[5] + fs[8] * fs_31_[8];
		}
		fs_27_[0] *= f;
		fs_27_[1] *= f;
		fs_27_[2] *= f;
		fs_27_[3] *= f_25_;
		fs_27_[4] *= f_25_;
		fs_27_[5] *= f_25_;
		fs_27_[6] *= f_26_;
		fs_27_[7] *= f_26_;
		fs_27_[8] *= f_26_;
		return fs_27_;
	}

	public abstract void KA(int animationFlag);

	public abstract int m();

	abstract boolean ea();

	public abstract int Z();

	public abstract void S(int i);

	public abstract void t(int i);

	public abstract void ia(int i, int i_35_, int i_36_);

	public abstract void wa();

	public abstract void oa(int i, int i_37_, int i_38_);

	void method4732(FloorToolkit class_xa, int i, int i_41_, int i_42_, int i_43_, int i_44_, int i_45_, int i_46_) {
		int i_49_ = -i_43_ / 2;
		int i_50_ = -i_44_ / 2;
		int i_51_ = class_xa.method6340(i + i_49_, i_42_ + i_50_);
		int i_52_ = i_43_ / 2;
		int i_53_ = -i_44_ / 2;
		int i_54_ = class_xa.method6340(i + i_52_, i_42_ + i_53_);
		int i_55_ = -i_43_ / 2;
		int i_56_ = i_44_ / 2;
		int i_57_ = class_xa.method6340(i + i_55_, i_42_ + i_56_);
		int i_58_ = i_43_ / 2;
		int i_59_ = i_44_ / 2;
		int i_60_ = class_xa.method6340(i + i_58_, i_42_ + i_59_);
		int i_61_ = i_51_ < i_54_ ? i_51_ : i_54_;
		int i_62_ = i_57_ < i_60_ ? i_57_ : i_60_;
		int i_63_ = i_54_ < i_60_ ? i_54_ : i_60_;
		int i_64_ = i_51_ < i_57_ ? i_51_ : i_57_;
		if (i_44_ != 0) {
			int i_65_ = ((int) (Math.atan2((double) (i_61_ - i_62_), (double) i_44_) * 2607.5945876176133) & 0x3fff);
			if (i_65_ != 0) {
				if (i_45_ != 0) {
					if (i_65_ > 8192) {
						int i_66_ = 16384 - i_45_;
						if (i_65_ < i_66_)
							i_65_ = i_66_;
					} else if (i_65_ > i_45_)
						i_65_ = i_45_;
				}
				t(i_65_);
			}
		}
		if (i_43_ != 0) {
			int i_67_ = ((int) (Math.atan2((double) (i_64_ - i_63_), (double) i_43_) * 2607.5945876176133) & 0x3fff);
			if (i_67_ != 0) {
				if (i_46_ != 0) {
					if (i_67_ > 8192) {
						int i_68_ = 16384 - i_46_;
						if (i_67_ < i_68_)
							i_67_ = i_68_;
					} else if (i_67_ > i_46_)
						i_67_ = i_46_;
				}
				EA(i_67_);
			}
		}
		int i_69_ = i_51_ + i_60_;
		if (i_54_ + i_57_ < i_69_)
			i_69_ = i_54_ + i_57_;
		i_69_ = (i_69_ >> 1) - i_41_;
		if (i_69_ != 0)
			ia(0, i_69_, 0);
	}

	abstract void method4733();

	abstract void method4734();

	public final void method4735(FrameCollection frameCollection, int i, FrameCollection class298_sub37_sub4_70_, int i_71_, int i_72_, int i_73_, int i_74_, boolean bool) {
		if (i != -1) {
			method4733();
			if (!ea())
				method4734();
			else {
				AnimationFrame frame = (frameCollection.frames[i]);
				AnimationFrameBase base = frame.base;
				AnimationFrame animationFrame = null;
				if (class298_sub37_sub4_70_ != null) {
					animationFrame = (class298_sub37_sub4_70_.frames[i_71_]);
					if (animationFrame.base != base)
						animationFrame = null;
				}
				method4767(base, frame, animationFrame, i_72_, i_73_, i_74_, null, false, bool, 65535, null);
				ka();
				method4734();
			}
		}
	}

	public abstract void pa(int i, int i_76_, FloorToolkit class_xa, FloorToolkit class_xa_77_, int i_78_, int i_79_, int i_80_);

	public final void method4736(FrameCollection class298_sub37_sub4, int i, FrameCollection class298_sub37_sub4_81_, int i_82_, int i_83_, int i_84_, FrameCollection class298_sub37_sub4_85_, int i_86_, FrameCollection class298_sub37_sub4_87_, int i_88_, int i_89_, int i_90_, boolean[] bools, boolean bool) {
		if (i != -1) {
			if (bools == null || i_86_ == -1)
				method4735(class298_sub37_sub4, i, class298_sub37_sub4_81_, i_82_, i_83_, i_84_, 0, bool);
			else {
				method4733();
				if (!ea())
					method4734();
				else {
					AnimationFrame class96 = (class298_sub37_sub4.frames[i]);
					AnimationFrameBase class298_sub15 = class96.base;
					AnimationFrame class96_91_ = null;
					if (class298_sub37_sub4_81_ != null) {
						class96_91_ = (class298_sub37_sub4_81_.frames[i_82_]);
						if (class96_91_.base != class298_sub15)
							class96_91_ = null;
					}
					method4767(class298_sub15, class96, class96_91_, i_83_, i_84_, 0, bools, false, bool, 65535, null);
					AnimationFrame class96_92_ = (class298_sub37_sub4_85_.frames[i_86_]);
					AnimationFrame class96_93_ = null;
					if (class298_sub37_sub4_87_ != null) {
						class96_93_ = (class298_sub37_sub4_87_.frames[i_88_]);
						if (class96_93_.base != class298_sub15)
							class96_93_ = null;
					}
					method4738(0, new int[0], 0, 0, 0, 0, bool);
					method4767(class96_92_.base, class96_92_, class96_93_, i_89_, i_90_, 0, bools, true, bool, 65535, null);
					ka();
					method4734();
				}
			}
		}
	}

	public final void method4737(FrameCollection frameCollection, int frameStartOffset) {
		if (frameStartOffset != -1) {
			method4733();
			if (!ea())
				method4734();
			else {
				AnimationFrame animationFrame = (frameCollection.frames[frameStartOffset]);
				AnimationFrameBase animationFrameBase = animationFrame.base;
				for (int count = 0; count < animationFrame.transformationCount; count++) {
					short used = animationFrame.transformationIndicies[count];
					if (animationFrameBase.aBooleanArray7275[used]) {
						if (animationFrame.skippedReferences[count] != -1)
							animate(0, 0, 0, 0);
						animate((animationFrameBase.transformationTypes[used]), animationFrame.transformationX[count], animationFrame.transformationY[count], animationFrame.transformationZ[count]);
					}
				}
				ka();
				method4734();
			}
		}
	}

	abstract void method4738(int transformationType, int[] is, int i_96_, int i_97_, int i_98_, int i_99_, boolean bool);

	public abstract void render(Matrix43f class222, Class302_Sub1 class302_sub1, int i);

	abstract void e(int transformationType, int[] is, int i_105_, int i_106_, int i_107_, boolean bool, int i_108_, int[] is_109_);

	abstract void animate(int transformType, int transformX, int transformY, int transformZ);

	public abstract void method4741(Matrix43f class222, int i, boolean bool);

	public abstract int N();

	public abstract int n();

	public abstract int YA();

	public abstract int o();

	public abstract int AA();

	public abstract int ha();

	public abstract void p(int i);

	public abstract void Q(int i);

	public abstract int c();

	public abstract byte[] ah();

	public abstract void X(short i, short i_117_);

	public abstract void method4742(byte i, byte[] is);

	public abstract void W(short i, short i_118_);

	public abstract void PA(int i, int i_119_, int i_120_, int i_121_);

	public abstract boolean method4743();

	public abstract boolean i();

	void method4744(int i, int i_123_, int i_124_, int i_125_, int i_126_, int i_127_, float[] fs, float f, int i_128_, float f_129_, float[] fs_130_) {
		i -= i_125_;
		i_123_ -= i_126_;
		i_124_ -= i_127_;
		float f_131_ = ((float) i * fs[0] + (float) i_123_ * fs[1] + (float) i_124_ * fs[2]);
		float f_132_ = ((float) i * fs[3] + (float) i_123_ * fs[4] + (float) i_124_ * fs[5]);
		float f_133_ = ((float) i * fs[6] + (float) i_123_ * fs[7] + (float) i_124_ * fs[8]);
		float f_134_ = (((float) Math.atan2((double) f_131_, (double) f_133_) / 6.2831855F) + 0.5F);
		if (f != 1.0F)
			f_134_ *= f;
		float f_135_ = f_132_ + 0.5F + f_129_;
		if (i_128_ == 1) {
			float f_136_ = f_134_;
			f_134_ = -f_135_;
			f_135_ = f_136_;
		} else if (i_128_ == 2) {
			f_134_ = -f_134_;
			f_135_ = -f_135_;
		} else if (i_128_ == 3) {
			float f_137_ = f_134_;
			f_134_ = f_135_;
			f_135_ = -f_137_;
		}
		fs_130_[0] = f_134_;
		fs_130_[1] = f_135_;
	}

	public abstract void method4745(ModelToolkit modelToolkit, int i, int i_141_, int i_142_, boolean bool);

	public abstract int ya();

	public abstract void f(int i);

	public abstract ModelToolkit method4755(byte i, int i_153_, boolean bool);

	public abstract boolean u();

	public abstract void EA(int i);

	ModelToolkit() {
		/* empty */
	}

	public final void method4765(FrameCollection frameCollection, int frameIndex, FrameCollection class298_sub37_sub4_191_, int i_192_, int i_193_, int i_194_, int i_195_, int i_196_, boolean bool, int[] is) {
		if (frameIndex != -1) {
			method4733();
			if (!ea())
				method4734();
			else {
				AnimationFrame frame = (frameCollection.frames[frameIndex]);
				AnimationFrameBase frameBase = frame.base;
				AnimationFrame class96_197_ = null;
				if (class298_sub37_sub4_191_ != null) {
					class96_197_ = (class298_sub37_sub4_191_.frames[i_192_]);
					if (class96_197_.base != frameBase)
						class96_197_ = null;
				}
				method4767(frameBase, frame, class96_197_, i_193_, i_194_, i_195_, null, false, bool, i_196_, is);
				ka();
				method4734();
			}
		}
	}

	void method4766(int transformationType, int[] is, int i_198_, int i_199_, int i_200_, int i_201_, boolean bool, int i_202_, int[] is_203_) {
		if (i_201_ == 1) {
			if (transformationType == AnimationFrameBase.UNKNOWN0 || transformationType == AnimationFrameBase.UNKNOWN1) {
				int i_204_ = -i_198_;
				i_198_ = i_200_;
				i_200_ = i_204_;
			} else if (transformationType == AnimationFrameBase.UNKNOWN3) {
				int i_205_ = i_198_;
				i_198_ = i_200_;
				i_200_ = i_205_;
			} else if (transformationType == AnimationFrameBase.UNKNOWN2) {
				int i_206_ = i_198_;
				i_198_ = -i_200_ & 0x3fff;
				i_200_ = i_206_ & 0x3fff;
			}
		} else if (i_201_ == 2) {
			if (transformationType == AnimationFrameBase.UNKNOWN0 || transformationType == AnimationFrameBase.UNKNOWN1) {
				i_198_ = -i_198_;
				i_200_ = -i_200_;
			} else if (transformationType == AnimationFrameBase.UNKNOWN2) {
				i_198_ = -i_198_ & 0x3fff;
				i_200_ = -i_200_ & 0x3fff;
			}
		} else if (i_201_ == 3) {
			if (transformationType == AnimationFrameBase.UNKNOWN0 || transformationType == AnimationFrameBase.UNKNOWN1) {
				int i_207_ = i_198_;
				i_198_ = -i_200_;
				i_200_ = i_207_;
			} else if (transformationType == AnimationFrameBase.UNKNOWN3) {
				int i_208_ = i_198_;
				i_198_ = i_200_;
				i_200_ = i_208_;
			} else if (transformationType == AnimationFrameBase.UNKNOWN2) {
				int i_209_ = i_198_;
				i_198_ = i_200_ & 0x3fff;
				i_200_ = -i_209_ & 0x3fff;
			}
		}
		if (i_202_ != 65535)
			e(transformationType, is, i_198_, i_199_, i_200_, bool, i_202_, is_203_);
		else
			method4738(transformationType, is, i_198_, i_199_, i_200_, i_201_, bool);
	}

	void method4767(AnimationFrameBase animationFrameBase, AnimationFrame primaryAnimationFrame, AnimationFrame secondaryAnimationFrame, int i, int i_211_, int i_212_, boolean[] bools, boolean bool, boolean bool_213_, int i_214_, int[] is) {
		if (secondaryAnimationFrame == null || i == 0) {
			for (int index = 0; index < primaryAnimationFrame.transformationCount; index++) {
				short i_216_ = primaryAnimationFrame.transformationIndicies[index];
				if (bools == null || bools[i_216_] == bool || (animationFrameBase.transformationTypes[i_216_]) == 0) {
					short i_217_ = primaryAnimationFrame.skippedReferences[index];
					if (i_217_ != -1)
						method4766(0, (animationFrameBase.labels[i_217_]), 0, 0, 0, i_212_, bool_213_, i_214_ & (animationFrameBase.anIntArray7280[i_217_]), is);
					method4766((animationFrameBase.transformationTypes[i_216_]), (animationFrameBase.labels[i_216_]), primaryAnimationFrame.transformationX[index], primaryAnimationFrame.transformationY[index], primaryAnimationFrame.transformationZ[index], i_212_, bool_213_, i_214_ & (animationFrameBase.anIntArray7280[i_216_]), is);
				}
			}
		} else {
			int index = 0;
			int i_219_ = 0;
			for (int baseCount = 0; (baseCount < animationFrameBase.count * 92429039); baseCount++) {
				boolean bool_221_ = false;
				if (index < primaryAnimationFrame.transformationCount && primaryAnimationFrame.transformationIndicies[index] == baseCount)
					bool_221_ = true;
				boolean bool_222_ = false;
				if (i_219_ < secondaryAnimationFrame.transformationCount && (secondaryAnimationFrame.transformationIndicies[i_219_] == baseCount))
					bool_222_ = true;
				if (bool_221_ || bool_222_) {
					if (bools != null && bools[baseCount] != bool && (animationFrameBase.transformationTypes[baseCount]) != 0) {
						if (bool_221_)
							index++;
						if (bool_222_)
							i_219_++;
					} else {
						int i_223_ = 0;
						int transformationType = (animationFrameBase.transformationTypes[baseCount]);
						if (transformationType == AnimationFrameBase.UNKNOWN3 || transformationType == AnimationFrameBase.UNKNOWN10)
							i_223_ = 128;
						int transformationX;
						int transformationY;
						int transformationZ;
						short skippedReferences;
						byte transformationFlags;
						if (bool_221_) {
							transformationX = primaryAnimationFrame.transformationX[index];
							transformationY = primaryAnimationFrame.transformationY[index];
							transformationZ = primaryAnimationFrame.transformationZ[index];
							skippedReferences = primaryAnimationFrame.skippedReferences[index];
							transformationFlags = primaryAnimationFrame.transformationFlags[index];
							index++;
						} else {
							transformationX = i_223_;
							transformationY = i_223_;
							transformationZ = i_223_;
							skippedReferences = (short) -1;
							transformationFlags = (byte) 0;
						}
						int i_230_;
						int i_231_;
						int i_232_;
						short i_233_;
						byte i_234_;
						if (bool_222_) {
							i_230_ = secondaryAnimationFrame.transformationX[i_219_];
							i_231_ = secondaryAnimationFrame.transformationY[i_219_];
							i_232_ = secondaryAnimationFrame.transformationZ[i_219_];
							i_233_ = secondaryAnimationFrame.skippedReferences[i_219_];
							i_234_ = secondaryAnimationFrame.transformationFlags[i_219_];
							i_219_++;
						} else {
							i_230_ = i_223_;
							i_231_ = i_223_;
							i_232_ = i_223_;
							i_233_ = (short) -1;
							i_234_ = (byte) 0;
						}
						int i_235_;
						int i_236_;
						int i_237_;
						if ((transformationFlags & 0x2) != 0 || (i_234_ & 0x1) != 0) {
							i_235_ = transformationX;
							i_236_ = transformationY;
							i_237_ = transformationZ;
						} else if (transformationType == AnimationFrameBase.UNKNOWN2) {
							int i_238_ = i_230_ - transformationX & 0x3fff;
							int i_239_ = i_231_ - transformationY & 0x3fff;
							int i_240_ = i_232_ - transformationZ & 0x3fff;
							if (i_238_ >= 8192)
								i_238_ -= 16384;
							if (i_239_ >= 8192)
								i_239_ -= 16384;
							if (i_240_ >= 8192)
								i_240_ -= 16384;
							i_235_ = transformationX + i_238_ * i / i_211_ & 0x3fff;
							i_236_ = transformationY + i_239_ * i / i_211_ & 0x3fff;
							i_237_ = transformationZ + i_240_ * i / i_211_ & 0x3fff;
						} else if (transformationType == AnimationFrameBase.UNKNOWN9) {
							int i_241_ = i_230_ - transformationX & 0x3fff;
							if (i_241_ >= 8192)
								i_241_ -= 16384;
							i_235_ = transformationX + i_241_ * i / i_211_ & 0x3fff;
							i_237_ = 0;
							i_236_ = 0;
						} else if (transformationType == AnimationFrameBase.UNKNOWN7) {
							int i_242_ = i_230_ - transformationX & 0x3f;
							if (i_242_ >= 32)
								i_242_ -= 64;
							i_235_ = transformationX + i_242_ * i / i_211_ & 0x3f;
							i_236_ = transformationY + (i_231_ - transformationY) * i / i_211_;
							i_237_ = transformationZ + (i_232_ - transformationZ) * i / i_211_;
						} else {
							i_235_ = transformationX + (i_230_ - transformationX) * i / i_211_;
							i_236_ = transformationY + (i_231_ - transformationY) * i / i_211_;
							i_237_ = transformationZ + (i_232_ - transformationZ) * i / i_211_;
						}
						if (skippedReferences != -1)
							method4766(0, (animationFrameBase.labels[skippedReferences]), 0, 0, 0, i_212_, bool_213_, (i_214_ & (animationFrameBase.anIntArray7280[skippedReferences])), is);
						else if (i_233_ != -1)
							method4766(0, (animationFrameBase.labels[i_233_]), 0, 0, 0, i_212_, bool_213_, (i_214_ & (animationFrameBase.anIntArray7280[i_233_])), is);
						method4766(transformationType, (animationFrameBase.labels[baseCount]), i_235_, i_236_, i_237_, i_212_, bool_213_, i_214_ & (animationFrameBase.anIntArray7280[baseCount]), is);
					}
				}
			}
		}
	}

	abstract void ka();

	void method4780(int i, int i_259_, int i_260_, int i_261_, int i_262_, int i_263_, float[] fs, int i_264_, float f, float[] fs_265_) {
		i -= i_261_;
		i_259_ -= i_262_;
		i_260_ -= i_263_;
		float f_266_ = ((float) i * fs[0] + (float) i_259_ * fs[1] + (float) i_260_ * fs[2]);
		float f_267_ = ((float) i * fs[3] + (float) i_259_ * fs[4] + (float) i_260_ * fs[5]);
		float f_268_ = ((float) i * fs[6] + (float) i_259_ * fs[7] + (float) i_260_ * fs[8]);
		float f_269_ = (float) Math.sqrt((double) (f_266_ * f_266_ + f_267_ * f_267_ + f_268_ * f_268_));
		float f_270_ = (((float) Math.atan2((double) f_266_, (double) f_268_) / 6.2831855F) + 0.5F);
		float f_271_ = ((float) Math.asin((double) (f_267_ / f_269_)) / 3.1415927F + 0.5F + f);
		if (i_264_ == 1) {
			float f_272_ = f_270_;
			f_270_ = -f_271_;
			f_271_ = f_272_;
		} else if (i_264_ == 2) {
			f_270_ = -f_270_;
			f_271_ = -f_271_;
		} else if (i_264_ == 3) {
			float f_273_ = f_270_;
			f_270_ = f_271_;
			f_271_ = -f_273_;
		}
		fs_265_[0] = f_270_;
		fs_265_[1] = f_271_;
	}

	public abstract EmissiveTriangle[] method4464();

	public abstract void method4784();

	Class76 method4785(BaseModel class64, int[] is, int i) {
		int[] is_276_ = null;
		int[] is_277_ = null;
		int[] is_278_ = null;
		float[][] fs = null;
		if (class64.aByteArray635 != null) {
			int i_279_ = class64.anInt634;
			int[] is_280_ = new int[i_279_];
			int[] is_281_ = new int[i_279_];
			int[] is_282_ = new int[i_279_];
			int[] is_283_ = new int[i_279_];
			int[] is_284_ = new int[i_279_];
			int[] is_285_ = new int[i_279_];
			for (int i_286_ = 0; i_286_ < i_279_; i_286_++) {
				is_280_[i_286_] = 2147483647;
				is_281_[i_286_] = -2147483647;
				is_282_[i_286_] = 2147483647;
				is_283_[i_286_] = -2147483647;
				is_284_[i_286_] = 2147483647;
				is_285_[i_286_] = -2147483647;
			}
			for (int i_287_ = 0; i_287_ < i; i_287_++) {
				int i_288_ = is[i_287_];
				if (class64.aByteArray635[i_288_] != -1) {
					int i_289_ = class64.aByteArray635[i_288_] & 0xff;
					for (int i_290_ = 0; i_290_ < 3; i_290_++) {
						short i_291_;
						if (i_290_ == 0)
							i_291_ = class64.aShortArray644[i_288_];
						else if (i_290_ == 1)
							i_291_ = class64.aShortArray646[i_288_];
						else
							i_291_ = class64.aShortArray624[i_288_];
						int i_292_ = class64.anIntArray616[i_291_];
						int i_293_ = class64.anIntArray642[i_291_];
						int i_294_ = class64.anIntArray618[i_291_];
						if (i_292_ < is_280_[i_289_])
							is_280_[i_289_] = i_292_;
						if (i_292_ > is_281_[i_289_])
							is_281_[i_289_] = i_292_;
						if (i_293_ < is_282_[i_289_])
							is_282_[i_289_] = i_293_;
						if (i_293_ > is_283_[i_289_])
							is_283_[i_289_] = i_293_;
						if (i_294_ < is_284_[i_289_])
							is_284_[i_289_] = i_294_;
						if (i_294_ > is_285_[i_289_])
							is_285_[i_289_] = i_294_;
					}
				}
			}
			is_276_ = new int[i_279_];
			is_277_ = new int[i_279_];
			is_278_ = new int[i_279_];
			fs = new float[i_279_][];
			for (int i_295_ = 0; i_295_ < i_279_; i_295_++) {
				byte i_296_ = class64.aByteArray622[i_295_];
				if (i_296_ > 0) {
					is_276_[i_295_] = (is_280_[i_295_] + is_281_[i_295_]) / 2;
					is_277_[i_295_] = (is_282_[i_295_] + is_283_[i_295_]) / 2;
					is_278_[i_295_] = (is_284_[i_295_] + is_285_[i_295_]) / 2;
					float f;
					float f_297_;
					float f_298_;
					if (i_296_ == 1) {
						int i_299_ = class64.anIntArray639[i_295_];
						if (i_299_ == 0) {
							f = 1.0F;
							f_298_ = 1.0F;
						} else if (i_299_ > 0) {
							f = 1.0F;
							f_298_ = (float) i_299_ / 1024.0F;
						} else {
							f_298_ = 1.0F;
							f = (float) -i_299_ / 1024.0F;
						}
						f_297_ = 64.0F / (float) class64.anIntArray640[i_295_];
					} else if (i_296_ == 2) {
						f = 64.0F / (float) class64.anIntArray639[i_295_];
						f_297_ = 64.0F / (float) class64.anIntArray640[i_295_];
						f_298_ = 64.0F / (float) class64.anIntArray641[i_295_];
					} else {
						f = (float) class64.anIntArray639[i_295_] / 1024.0F;
						f_297_ = (float) class64.anIntArray640[i_295_] / 1024.0F;
						f_298_ = (float) class64.anIntArray641[i_295_] / 1024.0F;
					}
					fs[i_295_] = method4731(class64.aShortArray623[i_295_], class64.aShortArray636[i_295_], class64.aShortArray638[i_295_], class64.aByteArray645[i_295_] & 0xff, f, f_297_, f_298_);
				}
			}
		}
		return new Class76(this, is_276_, is_277_, is_278_, fs);
	}

	public abstract void method4463(Matrix43f viewingAngles);

	public abstract boolean method4787(int i, int i_300_, Matrix43f class222, boolean bool, int i_301_);

	public abstract int RA();

	public abstract Class_na ga(Class_na class_na);

}
