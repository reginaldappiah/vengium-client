package com.jagex;/* Class_ra_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.maths.Matrix43f;
import com.jagex.maths.Matrix4f;
import com.jagex.utils.TimeUtils;

import java.awt.*;

public class JavaGraphicsToolkit extends GraphicsToolkit {
	int[] anIntArray7967;
	int anInt7968;
	int anInt7969;
	SoftCache aClass348_7970;
	int width;
	int height;
	float[] aFloatArray7973;
	int anInt7974;
	SoftCache aClass348_7975;
	int anInt7976;
	int anInt7977;
	int anInt7978;
	int anInt7979;
	int anInt7980;
	int anInt7981;
	int anInt7982;
	int anInt7983;
	Matrix43f aClass222_7984;
	boolean aBoolean7985 = false;
	Matrix4f aMatrix4f_7986;
	Matrix4f aMatrix4f_7987;
	float[][] aFloatArrayArray7988;
	int anInt7989;
	int anInt7990;
	int anInt7991;
	SpriteToolkit aClass57_7992;
	float aFloat7993;
	boolean aBoolean7994 = false;
	float aFloat7995;
	float aFloat7996;
	float aFloat7997;
	int anInt7998;
	int anInt7999;
	Matrix4f aMatrix4f_8000;
	Class15[] aClass15Array8001;
	int anInt8002;
	boolean aBoolean8003;
	float aFloat8004;
	float aFloat8005;
	int anInt8006;

    public static GraphicsToolkit create(Canvas canvas, MaterialRawLoader materialRawLoader, int width, int height) {
        return new JavaGraphicsToolkit(canvas, materialRawLoader, width, height);
    }

    public void updateSun(int i, float f, float f_0_, float f_1_, float f_2_, float f_3_) {
		this.anInt7998 = (int) (f * 65535.0F) * 295067571;
		this.anInt7982 = -2064023785 * (int) (f_0_ * 65535.0F);
		float f_4_ = (float) Math.sqrt((double) (f_2_ * f_2_ + f_1_ * f_1_ + f_3_ * f_3_));
		this.anInt7978 = (int) (f_1_ * 65535.0F / f_4_) * -666627277;
		this.anInt7979 = (int) (65535.0F * f_2_ / f_4_) * 1031065997;
		this.anInt7981 = 1231602687 * (int) (f_3_ * 65535.0F / f_4_);
	}

	JavaGraphicsToolkit(MaterialRawLoader interface_ma) {
		super(interface_ma);
		this.anInt7974 = 0;
		this.anInt7991 = 0;
		this.anInt7976 = 0;
		this.anInt7977 = 0;
		this.anInt7998 = 324258125;
		this.anInt7982 = 740517758;
		this.anInt7983 = -1151176370;
		this.aFloatArrayArray7988 = new float[6][4];
		this.aFloat7997 = 1.0F;
		this.aFloat8004 = 0.0F;
		this.anInt8002 = -169217664;
		this.aBoolean8003 = false;
		this.aClass348_7970 = new SoftCache(16);
		this.anInt8006 = -2116530773;
		try {
			this.aClass348_7975 = new SoftCache(256);
			this.aClass222_7984 = new Matrix43f();
			this.aMatrix4f_8000 = new Matrix4f();
			this.aMatrix4f_7986 = new Matrix4f();
			this.aMatrix4f_7987 = new Matrix4f();
			method5210(1);
			method5201(0);
			Class374_Sub1.method4640(true, true, -162450455);
			this.aBoolean7994 = true;
			this.anInt7968 = (int) TimeUtils.getTime() * -1260974911;
		} catch (Throwable throwable) {
			throwable.printStackTrace();
			destroy();
			throw new RuntimeException("");
		}
	}

	void renderFrame(int i, int i_5_) throws GraphicsFrameException {
		renderContext.method581(i, i_5_);
		if (textures != null)
			textures.method176(-119853711);
	}

	void method5023() {
		if (this.aBoolean7994) {
			StaticMethods.method2000(true, false);
			this.aBoolean7994 = false;
		}
		this.aBoolean7985 = true;
	}

	boolean method5196() {
		return this.aBoolean7985;
	}

	int[] method5197(int i) {
		Class298_Sub4 class298_sub4;
		synchronized (this.aClass348_7975) {
			class298_sub4 = ((Class298_Sub4) this.aClass348_7975.get((long) i | ~0x7fffffffffffffffL));
			if (class298_sub4 == null) {
				if (!textures.method170(i, (short) 2824)) {
					int[] is = null;
					return is;
				}
				Class53 class53 = textures.method174(i);
				int i_8_ = ((class53.aBoolean518 || this.aBoolean8003) ? 64 : 1107560907 * this.anInt8002);
				class298_sub4 = new Class298_Sub4(i, i_8_, textures.method172(i, 0.7F, i_8_, i_8_, true, (byte) 2), 1 != -2138060883 * class53.anInt528);
				this.aClass348_7975.put(class298_sub4, (long) i | ~0x7fffffffffffffffL);
			}
		}
		class298_sub4.aBoolean7189 = true;
		return class298_sub4.method2854();
	}

	public boolean method5001() {
		return false;
	}

	public boolean isResizable() {
		return true;
	}

	public boolean hasBloomToolkits() {
		return false;
	}

	public boolean method4996() {
		return false;
	}

	public boolean method5082() {
		return false;
	}

	public boolean isMultisampled() {
		return false;
	}

	public boolean at() {
		return false;
	}

	public boolean method5051() {
		return true;
	}

	public void method5061(boolean bool) {
		/* empty */
	}

	RenderContext createRenderFrameContext(Canvas canvas, int i, int i_30_) {
		return IsaacCipher.method5919(this, canvas, i, i_30_, -1465343898);
	}

	public void getDimension(int[] frameContext) {
		frameContext[0] = 692106883 * this.width;
		frameContext[1] = this.height * 918677455;
	}

	void method5198() {
		if (null != this.aFloatArray7973) {
			if (0 == -912871679 * this.anInt7974 && (this.anInt7991 * -1416794725 == this.width * 692106883) && -1278653805 * this.anInt7976 == 0 && (63686679 * this.anInt7977 == 918677455 * this.height)) {
				int i = this.aFloatArray7973.length;
				int i_37_ = i - (i & 0x7);
				int i_38_ = 0;
				while (i_38_ < i_37_) {
					this.aFloatArray7973[i_38_++] = 2.14748365E9F;
					this.aFloatArray7973[i_38_++] = 2.14748365E9F;
					this.aFloatArray7973[i_38_++] = 2.14748365E9F;
					this.aFloatArray7973[i_38_++] = 2.14748365E9F;
					this.aFloatArray7973[i_38_++] = 2.14748365E9F;
					this.aFloatArray7973[i_38_++] = 2.14748365E9F;
					this.aFloatArray7973[i_38_++] = 2.14748365E9F;
					this.aFloatArray7973[i_38_++] = 2.14748365E9F;
				}
				while (i_38_ < i)
					this.aFloatArray7973[i_38_++] = 2.14748365E9F;
			} else {
				int i = (this.anInt7991 * -1416794725 - this.anInt7974 * -912871679);
				int i_39_ = (this.anInt7977 * 63686679 - -1278653805 * this.anInt7976);
				int i_40_ = 692106883 * this.width - i;
				int i_41_ = ((-1278653805 * this.anInt7976 * (692106883 * this.width)) + this.anInt7974 * -912871679);
				int i_42_ = i >> 3;
				int i_43_ = i & 0x7;
				i = i_41_ - 1;
				for (int i_44_ = -i_39_; i_44_ < 0; i_44_++) {
					if (i_42_ > 0) {
						int i_45_ = i_42_;
						do {
							this.aFloatArray7973[++i] = 2.14748365E9F;
							this.aFloatArray7973[++i] = 2.14748365E9F;
							this.aFloatArray7973[++i] = 2.14748365E9F;
							this.aFloatArray7973[++i] = 2.14748365E9F;
							this.aFloatArray7973[++i] = 2.14748365E9F;
							this.aFloatArray7973[++i] = 2.14748365E9F;
							this.aFloatArray7973[++i] = 2.14748365E9F;
							this.aFloatArray7973[++i] = 2.14748365E9F;
						} while (--i_45_ > 0);
					}
					if (i_43_ > 0) {
						int i_46_ = i_43_;
						do
							this.aFloatArray7973[++i] = 2.14748365E9F;
						while (--i_46_ > 0);
					}
					i += i_40_;
				}
			}
		}
	}

	public void RA(boolean bool) {
		Class15 class15 = method5202(Thread.currentThread());
		class15.aBoolean207 = bool;
	}

	public void resetClip() {
		this.anInt7989 = 0;
		this.anInt7990 = 0;
		this.anInt7980 = 845086741 * this.width;
		this.anInt7969 = -1768491203 * this.height;
		method5209();
	}

	public void method5112() {
		/* empty */
	}

	public void GA(float f, float f_47_) {
		this.aFloat7997 = f_47_ - f;
		this.aFloat8004 = f_47_ + f - 1.0F;
		for (int i = 0; i < this.anInt7999 * -922307687; i++) {
			Class15 class15 = this.aClass15Array8001[i];
			Class2 class2 = class15.aClass2_192;
			class2.aFloat46 = this.aFloat7997;
			class2.aFloat27 = this.aFloat8004;
		}
	}

	public void L() {
		this.anInt7974 = 0;
		this.anInt7976 = 0;
		this.anInt7991 = 2046188857 * this.width;
		this.anInt7977 = -482117367 * this.height;
		method5209();
	}

	public void setClip(int x, int y, int width, int height) {
		if (x < 0)
			x = 0;
		if (y < 0)
			y = 0;
		if (width > 692106883 * this.width)
			width = 692106883 * this.width;
		if (height > this.height * 918677455)
			height = 918677455 * this.height;
		this.anInt7974 = x * -1291169535;
		this.anInt7991 = width * -1912131437;
		this.anInt7976 = y * 104031131;
		this.anInt7977 = 1656090535 * height;
		method5209();
	}

	boolean method5199(int i) {
		return this.aBoolean8003 || textures.method174(i).aBoolean518;
	}

	public void XA(int x1, int x2, int y1, int y2, int rgba) {
		if (null != this.anIntArray7967 && (x2 >= -1278653805 * this.anInt7976 && x2 < 63686679 * this.anInt7977)) {
			if (x1 < -912871679 * this.anInt7974) {
				y1 -= -912871679 * this.anInt7974 - x1;
				x1 = this.anInt7974 * -912871679;
			}
			if (x1 + y1 > -1416794725 * this.anInt7991)
				y1 = -1416794725 * this.anInt7991 - x1;
			int i_56_ = x1 + 692106883 * this.width * x2;
			int i_57_ = y2 >>> 24;
			if (rgba == 0 || rgba == 1 && i_57_ == 255) {
				for (int i_58_ = 0; i_58_ < y1; i_58_++)
					this.anIntArray7967[i_56_ + i_58_] = y2;
			} else if (rgba == 1) {
				y2 = (i_57_ << 24) + (((y2 & 0xff00) * i_57_ >> 8 & 0xff00) + (i_57_ * (y2 & 0xff00ff) >> 8 & 0xff00ff));
				int i_59_ = 256 - i_57_;
				for (int i_60_ = 0; i_60_ < y1; i_60_++) {
					int i_61_ = this.anIntArray7967[i_60_ + i_56_];
					i_61_ = ((i_59_ * (i_61_ & 0xff00) >> 8 & 0xff00) + (i_59_ * (i_61_ & 0xff00ff) >> 8 & 0xff00ff));
					this.anIntArray7967[i_60_ + i_56_] = y2 + i_61_;
				}
			} else if (rgba == 2) {
				for (int i_62_ = 0; i_62_ < y1; i_62_++) {
					int i_63_ = this.anIntArray7967[i_56_ + i_62_];
					int i_64_ = y2 + i_63_;
					int i_65_ = (i_63_ & 0xff00ff) + (y2 & 0xff00ff);
					i_63_ = (i_65_ & 0x1000100) + (i_64_ - i_65_ & 0x10000);
					this.anIntArray7967[i_56_ + i_62_] = i_64_ - i_63_ | i_63_ - (i_63_ >>> 8);
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	public void drawRectangle(int startX, int startY, int endX, int endY, int rgba, int mode) {
		XA(startX, startY, endX, rgba, mode);
		XA(startX, endY + startY - 1, endX, rgba, mode);
		G(startX, 1 + startY, endY - 2, rgba, mode);
		G(startX + endX - 1, 1 + startY, endY - 2, rgba, mode);
	}

	public void drawFilledRectangle(int startX, int startY, int endX, int endY, int rgba, int mode) {
		if (null != this.anIntArray7967) {
			if (startX < this.anInt7974 * -912871679) {
				endX -= -912871679 * this.anInt7974 - startX;
				startX = this.anInt7974 * -912871679;
			}
			if (startY < -1278653805 * this.anInt7976) {
				endY -= -1278653805 * this.anInt7976 - startY;
				startY = -1278653805 * this.anInt7976;
			}
			if (startX + endX > this.anInt7991 * -1416794725)
				endX = -1416794725 * this.anInt7991 - startX;
			if (endY + startY > 63686679 * this.anInt7977)
				endY = 63686679 * this.anInt7977 - startY;
			if (endX > 0 && endY > 0 && startX <= this.anInt7991 * -1416794725 && startY <= this.anInt7977 * 63686679) {
				int i_76_ = this.width * 692106883 - endX;
				int i_77_ = (startY * (this.width * 692106883) + startX);
				int i_78_ = rgba >>> 24;
				if (0 == mode || mode == 1 && 255 == i_78_) {
					int i_79_ = endX >> 3;
					int i_80_ = endX & 0x7;
					endX = i_77_ - 1;
					for (int i_81_ = -endY; i_81_ < 0; i_81_++) {
						if (i_79_ > 0) {
							startX = i_79_;
							do {
								this.anIntArray7967[++endX] = rgba;
								this.anIntArray7967[++endX] = rgba;
								this.anIntArray7967[++endX] = rgba;
								this.anIntArray7967[++endX] = rgba;
								this.anIntArray7967[++endX] = rgba;
								this.anIntArray7967[++endX] = rgba;
								this.anIntArray7967[++endX] = rgba;
								this.anIntArray7967[++endX] = rgba;
							} while (--startX > 0);
						}
						if (i_80_ > 0) {
							startX = i_80_;
							do
								this.anIntArray7967[++endX] = rgba;
							while (--startX > 0);
						}
						endX += i_76_;
					}
				} else if (1 == mode) {
					rgba = ((i_78_ * (rgba & 0xff00ff) >> 8 & 0xff00ff) + (i_78_ * ((rgba & ~0xff00ff) >>> 8) & ~0xff00ff));
					int i_82_ = 256 - i_78_;
					for (int i_83_ = 0; i_83_ < endY; i_83_++) {
						for (int i_84_ = -endX; i_84_ < 0; i_84_++) {
							int i_85_ = this.anIntArray7967[i_77_];
							i_85_ = (((i_85_ & 0xff00ff) * i_82_ >> 8 & 0xff00ff) + (i_82_ * ((i_85_ & ~0xff00ff) >>> 8) & ~0xff00ff));
							this.anIntArray7967[i_77_++] = i_85_ + rgba;
						}
						i_77_ += i_76_;
					}
				} else if (mode == 2) {
					for (int i_86_ = 0; i_86_ < endY; i_86_++) {
						for (int i_87_ = -endX; i_87_ < 0; i_87_++) {
							int i_88_ = this.anIntArray7967[i_77_];
							int i_89_ = rgba + i_88_;
							int i_90_ = (rgba & 0xff00ff) + (i_88_ & 0xff00ff);
							i_88_ = (i_89_ - i_90_ & 0x10000) + (i_90_ & 0x1000100);
							this.anIntArray7967[i_77_++] = i_89_ - i_88_ | i_88_ - (i_88_ >>> 8);
						}
						i_77_ += i_76_;
					}
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public void N(int i, int i_91_, int i_92_, int i_93_, int i_94_, int i_95_, byte[] is, int i_96_, int i_97_) {
		if (this.anIntArray7967 != null && (i_92_ > 0 && i_93_ > 0)) {
			int i_98_ = 0;
			int i_99_ = 0;
			int i_100_ = (i_96_ << 16) / i_92_;
			int i_101_ = (is.length / i_96_ << 16) / i_93_;
			int i_102_ = i + i_91_ * (692106883 * this.width);
			int i_103_ = 692106883 * this.width - i_92_;
			if (i_93_ + i_91_ > this.anInt7977 * 63686679)
				i_93_ -= (i_91_ + i_93_ - 63686679 * this.anInt7977);
			if (i_91_ < this.anInt7976 * -1278653805) {
				int i_104_ = -1278653805 * this.anInt7976 - i_91_;
				i_93_ -= i_104_;
				i_102_ += i_104_ * (this.width * 692106883);
				i_99_ += i_104_ * i_101_;
			}
			if (i + i_92_ > -1416794725 * this.anInt7991) {
				int i_105_ = (i + i_92_ - this.anInt7991 * -1416794725);
				i_92_ -= i_105_;
				i_103_ += i_105_;
			}
			if (i < this.anInt7974 * -912871679) {
				int i_106_ = -912871679 * this.anInt7974 - i;
				i_92_ -= i_106_;
				i_102_ += i_106_;
				i_98_ += i_100_ * i_106_;
				i_103_ += i_106_;
			}
			int i_107_ = i_94_ >>> 24;
			int i_108_ = i_95_ >>> 24;
			if (0 == i_97_ || 1 == i_97_ && i_107_ == 255 && i_108_ == 255) {
				int i_109_ = i_98_;
				for (int i_110_ = -i_93_; i_110_ < 0; i_110_++) {
					int i_111_ = (i_99_ >> 16) * i_96_;
					for (int i_112_ = -i_92_; i_112_ < 0; i_112_++) {
						if (is[(i_98_ >> 16) + i_111_] != 0)
							this.anIntArray7967[i_102_++] = i_95_;
						else
							this.anIntArray7967[i_102_++] = i_94_;
						i_98_ += i_100_;
					}
					i_99_ += i_101_;
					i_98_ = i_109_;
					i_102_ += i_103_;
				}
			} else if (1 == i_97_) {
				int i_113_ = i_98_;
				for (int i_114_ = -i_93_; i_114_ < 0; i_114_++) {
					int i_115_ = (i_99_ >> 16) * i_96_;
					for (int i_116_ = -i_92_; i_116_ < 0; i_116_++) {
						int i_117_ = i_94_;
						if (is[(i_98_ >> 16) + i_115_] != 0)
							i_117_ = i_95_;
						int i_118_ = i_117_ >>> 24;
						int i_119_ = 255 - i_118_;
						int i_120_ = this.anIntArray7967[i_102_];
						this.anIntArray7967[i_102_++] = (((i_118_ * (i_117_ & 0xff00) + (i_120_ & 0xff00) * i_119_) & 0xff0000) + (((i_120_ & 0xff00ff) * i_119_ + (i_117_ & 0xff00ff) * i_118_) & ~0xff00ff)) >> 8;
						i_98_ += i_100_;
					}
					i_99_ += i_101_;
					i_98_ = i_113_;
					i_102_ += i_103_;
				}
			} else if (i_97_ == 2) {
				int i_121_ = i_98_;
				for (int i_122_ = -i_93_; i_122_ < 0; i_122_++) {
					int i_123_ = i_96_ * (i_99_ >> 16);
					for (int i_124_ = -i_92_; i_124_ < 0; i_124_++) {
						int i_125_ = i_94_;
						if (is[(i_98_ >> 16) + i_123_] != 0)
							i_125_ = i_95_;
						if (i_125_ != 0) {
							int i_126_ = (this.anIntArray7967[i_102_]);
							int i_127_ = i_126_ + i_125_;
							int i_128_ = (i_126_ & 0xff00ff) + (i_125_ & 0xff00ff);
							i_126_ = (i_128_ & 0x1000100) + (i_127_ - i_128_ & 0x10000);
							this.anIntArray7967[i_102_++] = i_127_ - i_126_ | i_126_ - (i_126_ >>> 8);
						} else
							i_102_++;
						i_98_ += i_100_;
					}
					i_99_ += i_101_;
					i_98_ = i_121_;
					i_102_ += i_103_;
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	void CA(int i, int i_129_, int i_130_, int i_131_, int i_132_) {
		if (this.anIntArray7967 != null) {
			if (i_130_ < 0)
				i_130_ = -i_130_;
			int i_133_ = i_129_ - i_130_;
			if (i_133_ < -1278653805 * this.anInt7976)
				i_133_ = this.anInt7976 * -1278653805;
			int i_134_ = i_130_ + i_129_ + 1;
			if (i_134_ > this.anInt7977 * 63686679)
				i_134_ = 63686679 * this.anInt7977;
			int i_135_ = i_133_;
			int i_136_ = i_130_ * i_130_;
			int i_137_ = 0;
			int i_138_ = i_129_ - i_135_;
			int i_139_ = i_138_ * i_138_;
			int i_140_ = i_139_ - i_138_;
			if (i_129_ > i_134_)
				i_129_ = i_134_;
			int i_141_ = i_131_ >>> 24;
			if (0 == i_132_ || i_132_ == 1 && i_141_ == 255) {
				while (i_135_ < i_129_) {
					for (/**/; i_140_ <= i_136_ || i_139_ <= i_136_; i_140_ += i_137_++ + i_137_)
						i_139_ += i_137_ + i_137_;
					int i_142_ = i - i_137_ + 1;
					if (i_142_ < this.anInt7974 * -912871679)
						i_142_ = -912871679 * this.anInt7974;
					int i_143_ = i_137_ + i;
					if (i_143_ > this.anInt7991 * -1416794725)
						i_143_ = this.anInt7991 * -1416794725;
					int i_144_ = i_142_ + (this.width * 692106883 * i_135_);
					for (int i_145_ = i_142_; i_145_ < i_143_; i_145_++)
						this.anIntArray7967[i_144_++] = i_131_;
					i_135_++;
					i_139_ -= i_138_-- + i_138_;
					i_140_ -= i_138_ + i_138_;
				}
				i_137_ = i_130_;
				i_138_ = i_135_ - i_129_;
				i_140_ = i_138_ * i_138_ + i_136_;
				i_139_ = i_140_ - i_137_;
				i_140_ -= i_138_;
				while (i_135_ < i_134_) {
					for (/**/; i_140_ > i_136_ && i_139_ > i_136_; i_139_ -= i_137_ + i_137_)
						i_140_ -= i_137_-- + i_137_;
					int i_146_ = i - i_137_;
					if (i_146_ < this.anInt7974 * -912871679)
						i_146_ = this.anInt7974 * -912871679;
					int i_147_ = i + i_137_;
					if (i_147_ > -1416794725 * this.anInt7991 - 1)
						i_147_ = (-1416794725 * this.anInt7991 - 1);
					int i_148_ = (i_135_ * (692106883 * this.width) + i_146_);
					for (int i_149_ = i_146_; i_149_ <= i_147_; i_149_++)
						this.anIntArray7967[i_148_++] = i_131_;
					i_135_++;
					i_140_ += i_138_ + i_138_;
					i_139_ += i_138_++ + i_138_;
				}
			} else if (i_132_ == 1) {
				i_131_ = ((i_141_ << 24) + ((i_141_ * (i_131_ & 0xff00ff) >> 8 & 0xff00ff) + (i_141_ * (i_131_ & 0xff00) >> 8 & 0xff00)));
				int i_150_ = 256 - i_141_;
				while (i_135_ < i_129_) {
					for (/**/; i_140_ <= i_136_ || i_139_ <= i_136_; i_140_ += i_137_++ + i_137_)
						i_139_ += i_137_ + i_137_;
					int i_151_ = 1 + (i - i_137_);
					if (i_151_ < -912871679 * this.anInt7974)
						i_151_ = this.anInt7974 * -912871679;
					int i_152_ = i + i_137_;
					if (i_152_ > -1416794725 * this.anInt7991)
						i_152_ = this.anInt7991 * -1416794725;
					int i_153_ = ((this.width * 692106883 * i_135_) + i_151_);
					for (int i_154_ = i_151_; i_154_ < i_152_; i_154_++) {
						int i_155_ = this.anIntArray7967[i_153_];
						i_155_ = (((i_155_ & 0xff00ff) * i_150_ >> 8 & 0xff00ff) + (i_150_ * (i_155_ & 0xff00) >> 8 & 0xff00));
						this.anIntArray7967[i_153_++] = i_131_ + i_155_;
					}
					i_135_++;
					i_139_ -= i_138_-- + i_138_;
					i_140_ -= i_138_ + i_138_;
				}
				i_137_ = i_130_;
				i_138_ = -i_138_;
				i_140_ = i_136_ + i_138_ * i_138_;
				i_139_ = i_140_ - i_137_;
				i_140_ -= i_138_;
				while (i_135_ < i_134_) {
					for (/**/; i_140_ > i_136_ && i_139_ > i_136_; i_139_ -= i_137_ + i_137_)
						i_140_ -= i_137_-- + i_137_;
					int i_156_ = i - i_137_;
					if (i_156_ < this.anInt7974 * -912871679)
						i_156_ = this.anInt7974 * -912871679;
					int i_157_ = i + i_137_;
					if (i_157_ > this.anInt7991 * -1416794725 - 1)
						i_157_ = (-1416794725 * this.anInt7991 - 1);
					int i_158_ = ((692106883 * this.width * i_135_) + i_156_);
					for (int i_159_ = i_156_; i_159_ <= i_157_; i_159_++) {
						int i_160_ = this.anIntArray7967[i_158_];
						i_160_ = (((i_160_ & 0xff00ff) * i_150_ >> 8 & 0xff00ff) + (i_150_ * (i_160_ & 0xff00) >> 8 & 0xff00));
						this.anIntArray7967[i_158_++] = i_131_ + i_160_;
					}
					i_135_++;
					i_140_ += i_138_ + i_138_;
					i_139_ += i_138_++ + i_138_;
				}
			} else if (i_132_ == 2) {
				while (i_135_ < i_129_) {
					for (/**/; i_140_ <= i_136_ || i_139_ <= i_136_; i_140_ += i_137_++ + i_137_)
						i_139_ += i_137_ + i_137_;
					int i_161_ = i - i_137_ + 1;
					if (i_161_ < -912871679 * this.anInt7974)
						i_161_ = this.anInt7974 * -912871679;
					int i_162_ = i + i_137_;
					if (i_162_ > -1416794725 * this.anInt7991)
						i_162_ = this.anInt7991 * -1416794725;
					int i_163_ = ((this.width * 692106883 * i_135_) + i_161_);
					for (int i_164_ = i_161_; i_164_ < i_162_; i_164_++) {
						int i_165_ = this.anIntArray7967[i_163_];
						int i_166_ = i_131_ + i_165_;
						int i_167_ = (i_131_ & 0xff00ff) + (i_165_ & 0xff00ff);
						i_165_ = (i_167_ & 0x1000100) + (i_166_ - i_167_ & 0x10000);
						this.anIntArray7967[i_163_++] = i_166_ - i_165_ | i_165_ - (i_165_ >>> 8);
					}
					i_135_++;
					i_139_ -= i_138_-- + i_138_;
					i_140_ -= i_138_ + i_138_;
				}
				i_137_ = i_130_;
				i_138_ = -i_138_;
				i_140_ = i_138_ * i_138_ + i_136_;
				i_139_ = i_140_ - i_137_;
				i_140_ -= i_138_;
				while (i_135_ < i_134_) {
					for (/**/; i_140_ > i_136_ && i_139_ > i_136_; i_139_ -= i_137_ + i_137_)
						i_140_ -= i_137_-- + i_137_;
					int i_168_ = i - i_137_;
					if (i_168_ < this.anInt7974 * -912871679)
						i_168_ = -912871679 * this.anInt7974;
					int i_169_ = i + i_137_;
					if (i_169_ > this.anInt7991 * -1416794725 - 1)
						i_169_ = (this.anInt7991 * -1416794725 - 1);
					int i_170_ = i_168_ + i_135_ * (this.width * 692106883);
					for (int i_171_ = i_168_; i_171_ <= i_169_; i_171_++) {
						int i_172_ = this.anIntArray7967[i_170_];
						int i_173_ = i_172_ + i_131_;
						int i_174_ = (i_172_ & 0xff00ff) + (i_131_ & 0xff00ff);
						i_172_ = (i_173_ - i_174_ & 0x10000) + (i_174_ & 0x1000100);
						this.anIntArray7967[i_170_++] = i_173_ - i_172_ | i_172_ - (i_172_ >>> 8);
					}
					i_135_++;
					i_140_ += i_138_ + i_138_;
					i_139_ += i_138_++ + i_138_;
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	public void G(int i, int i_183_, int i_184_, int i_185_, int i_186_) {
		if (null != this.anIntArray7967 && (i >= this.anInt7974 * -912871679 && i < this.anInt7991 * -1416794725)) {
			if (i_183_ < -1278653805 * this.anInt7976) {
				i_184_ -= this.anInt7976 * -1278653805 - i_183_;
				i_183_ = this.anInt7976 * -1278653805;
			}
			if (i_184_ + i_183_ > 63686679 * this.anInt7977)
				i_184_ = 63686679 * this.anInt7977 - i_183_;
			int i_187_ = i + i_183_ * (this.width * 692106883);
			int i_188_ = i_185_ >>> 24;
			if (i_186_ == 0 || 1 == i_186_ && 255 == i_188_) {
				for (int i_189_ = 0; i_189_ < i_184_; i_189_++)
					this.anIntArray7967[i_187_ + i_189_ * (this.width * 692106883)] = i_185_;
			} else if (i_186_ == 1) {
				i_185_ = ((i_188_ * (i_185_ & 0xff00) >> 8 & 0xff00) + ((i_185_ & 0xff00ff) * i_188_ >> 8 & 0xff00ff) + (i_188_ << 24));
				int i_190_ = 256 - i_188_;
				for (int i_191_ = 0; i_191_ < i_184_; i_191_++) {
					int i_192_ = (i_191_ * (692106883 * this.width) + i_187_);
					int i_193_ = this.anIntArray7967[i_192_];
					i_193_ = ((i_190_ * (i_193_ & 0xff00ff) >> 8 & 0xff00ff) + ((i_193_ & 0xff00) * i_190_ >> 8 & 0xff00));
					this.anIntArray7967[i_192_] = i_193_ + i_185_;
				}
			} else if (2 == i_186_) {
				for (int i_194_ = 0; i_194_ < i_184_; i_194_++) {
					int i_195_ = (i_194_ * (692106883 * this.width) + i_187_);
					int i_196_ = this.anIntArray7967[i_195_];
					int i_197_ = i_185_ + i_196_;
					int i_198_ = (i_196_ & 0xff00ff) + (i_185_ & 0xff00ff);
					i_196_ = (i_198_ & 0x1000100) + (i_197_ - i_198_ & 0x10000);
					this.anIntArray7967[i_195_] = i_197_ - i_196_ | i_196_ - (i_196_ >>> 8);
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	public void method5187(int i, int i_199_, int i_200_, int i_201_) {
		this.anInt7989 = 1021645229 * i;
		this.anInt7990 = i_199_ * 574739315;
		this.anInt7980 = 626158471 * i_200_;
		this.anInt7969 = 370599731 * i_201_;
		method5209();
	}

	public void drawDashedLine(int i, int i_202_, int i_203_, int i_204_, int i_205_, int i_206_, int i_207_, int i_208_, int i_209_) {
		if (null != this.anIntArray7967) {
			i_203_ -= i;
			i_204_ -= i_202_;
			if (i_204_ == 0) {
				if (i_203_ >= 0)
					method5217(i, i_202_, 1 + i_203_, i_205_, i_206_, i_207_, i_208_, i_209_);
				else {
					int i_210_ = i_208_ + i_207_;
					i_209_ %= i_210_;
					i_209_ = i_207_ + i_210_ - i_209_ - (1 + -i_203_) % i_210_;
					i_209_ %= i_210_;
					if (i_209_ < 0)
						i_209_ += i_210_;
					method5217(i_203_ + i, i_202_, 1 + -i_203_, i_205_, i_206_, i_207_, i_208_, i_209_);
				}
			} else if (i_203_ == 0) {
				if (i_204_ >= 0)
					method5215(i, i_202_, i_204_ + 1, i_205_, i_206_, i_207_, i_208_, i_209_);
				else {
					int i_211_ = i_208_ + i_207_;
					i_209_ %= i_211_;
					i_209_ = i_207_ + i_211_ - i_209_ - (-i_204_ + 1) % i_211_;
					i_209_ %= i_211_;
					if (i_209_ < 0)
						i_209_ += i_211_;
					method5215(i, i_204_ + i_202_, 1 + -i_204_, i_205_, i_206_, i_207_, i_208_, i_209_);
				}
			} else {
				i_209_ <<= 8;
				i_207_ <<= 8;
				i_208_ <<= 8;
				int i_212_ = i_208_ + i_207_;
				i_209_ %= i_212_;
				if (i_204_ + i_203_ < 0) {
					int i_213_ = (int) (Math.sqrt((double) (i_204_ * i_204_ + i_203_ * i_203_)) * 256.0);
					int i_214_ = i_213_ % i_212_;
					i_209_ = i_212_ + i_207_ - i_209_ - i_214_;
					i_209_ %= i_212_;
					if (i_209_ < 0)
						i_209_ += i_212_;
					i += i_203_;
					i_203_ = -i_203_;
					i_202_ += i_204_;
					i_204_ = -i_204_;
				}
				if (i_203_ > i_204_) {
					i_202_ <<= 16;
					i_202_ += 32768;
					i_204_ <<= 16;
					int i_215_ = (int) Math.floor(0.5 + ((double) i_204_ / (double) i_203_));
					i_203_ += i;
					int i_216_ = i_205_ >>> 24;
					int i_217_ = (int) Math.sqrt((double) (65536 + (i_215_ >> 8) * (i_215_ >> 8)));
					if (0 == i_206_ || 1 == i_206_ && i_216_ == 255) {
						while (i <= i_203_) {
							int i_218_ = i_202_ >> 16;
							if (i >= (this.anInt7974 * -912871679) && i < (-1416794725 * this.anInt7991) && i_218_ >= (this.anInt7976 * -1278653805) && i_218_ < (this.anInt7977 * 63686679) && i_209_ < i_207_)
								this.anIntArray7967[(this.width * 692106883 * i_218_) + i] = i_205_;
							i_202_ += i_215_;
							i++;
							i_209_ += i_217_;
							i_209_ %= i_212_;
						}
					} else if (i_206_ == 1) {
						i_205_ = ((i_216_ << 24) + (((i_205_ & 0xff00) * i_216_ >> 8 & 0xff00) + (i_216_ * (i_205_ & 0xff00ff) >> 8 & 0xff00ff)));
						int i_219_ = 256 - i_216_;
						while (i <= i_203_) {
							int i_220_ = i_202_ >> 16;
							if (i >= (this.anInt7974 * -912871679) && i < (this.anInt7991 * -1416794725) && i_220_ >= (this.anInt7976 * -1278653805) && i_220_ < 63686679 * (this.anInt7977) && i_209_ < i_207_) {
								int i_221_ = i + i_220_ * (692106883 * (this.width));
								int i_222_ = (this.anIntArray7967[i_221_]);
								i_222_ = (((i_222_ & 0xff00ff) * i_219_ >> 8 & 0xff00ff) + (i_219_ * (i_222_ & 0xff00) >> 8 & 0xff00));
								this.anIntArray7967[i_221_] = i_222_ + i_205_;
							}
							i_202_ += i_215_;
							i++;
							i_209_ += i_217_;
							i_209_ %= i_212_;
						}
					} else if (2 == i_206_) {
						while (i <= i_203_) {
							int i_223_ = i_202_ >> 16;
							if (i >= (this.anInt7974 * -912871679) && i < (-1416794725 * this.anInt7991) && i_223_ >= -1278653805 * this.anInt7976 && i_223_ < 63686679 * (this.anInt7977) && i_209_ < i_207_) {
								int i_224_ = i + (i_223_ * (this.width * 692106883));
								int i_225_ = (this.anIntArray7967[i_224_]);
								int i_226_ = i_225_ + i_205_;
								int i_227_ = ((i_225_ & 0xff00ff) + (i_205_ & 0xff00ff));
								i_225_ = (i_227_ & 0x1000100) + (i_226_ - i_227_ & 0x10000);
								this.anIntArray7967[i_224_] = i_226_ - i_225_ | i_225_ - (i_225_ >>> 8);
							}
							i_202_ += i_215_;
							i++;
							i_209_ += i_217_;
							i_209_ %= i_212_;
						}
					} else
						throw new IllegalArgumentException();
				} else {
					i <<= 16;
					i += 32768;
					i_203_ <<= 16;
					int i_228_ = (int) Math.floor((double) i_203_ / (double) i_204_ + 0.5);
					i_204_ += i_202_;
					int i_229_ = i_205_ >>> 24;
					int i_230_ = (int) Math.sqrt((double) ((i_228_ >> 8) * (i_228_ >> 8) + 65536));
					if (i_206_ == 0 || 1 == i_206_ && i_229_ == 255) {
						while (i_202_ <= i_204_) {
							int i_231_ = i >> 16;
							if (i_202_ >= (this.anInt7976 * -1278653805) && i_202_ < 63686679 * (this.anInt7977) && i_231_ >= -912871679 * this.anInt7974 && i_231_ < -1416794725 * this.anInt7991 && i_209_ < i_207_)
								this.anIntArray7967[i_202_ * (this.width * 692106883) + i_231_] = i_205_;
							i += i_228_;
							i_202_++;
							i_209_ += i_230_;
							i_209_ %= i_212_;
						}
					} else if (i_206_ == 1) {
						i_205_ = ((i_229_ << 24) + (((i_205_ & 0xff00ff) * i_229_ >> 8 & 0xff00ff) + ((i_205_ & 0xff00) * i_229_ >> 8 & 0xff00)));
						int i_232_ = 256 - i_229_;
						while (i_202_ <= i_204_) {
							int i_233_ = i >> 16;
							if (i_202_ >= (this.anInt7976 * -1278653805) && i_202_ < 63686679 * (this.anInt7977) && i_233_ >= -912871679 * this.anInt7974 && i_233_ < -1416794725 * this.anInt7991 && i_209_ < i_207_) {
								int i_234_ = ((692106883 * this.width * i_202_) + i_233_);
								int i_235_ = (this.anIntArray7967[i_234_]);
								i_235_ = ((i_232_ * (i_235_ & 0xff00) >> 8 & 0xff00) + (i_232_ * (i_235_ & 0xff00ff) >> 8 & 0xff00ff));
								this.anIntArray7967[(692106883 * this.width * i_202_) + i_233_] = i_205_ + i_235_;
							}
							i += i_228_;
							i_202_++;
							i_209_ += i_230_;
							i_209_ %= i_212_;
						}
					} else if (2 == i_206_) {
						while (i_202_ <= i_204_) {
							int i_236_ = i >> 16;
							if (i_202_ >= (this.anInt7976 * -1278653805) && i_202_ < (this.anInt7977 * 63686679) && i_236_ >= -912871679 * this.anInt7974 && i_236_ < (this.anInt7991 * -1416794725) && i_209_ < i_207_) {
								int i_237_ = (i_236_ + i_202_ * (692106883 * (this.width)));
								int i_238_ = (this.anIntArray7967[i_237_]);
								int i_239_ = i_238_ + i_205_;
								int i_240_ = ((i_238_ & 0xff00ff) + (i_205_ & 0xff00ff));
								i_238_ = (i_240_ & 0x1000100) + (i_239_ - i_240_ & 0x10000);
								this.anIntArray7967[i_237_] = i_239_ - i_238_ | i_238_ - (i_238_ >>> 8);
							}
							i += i_228_;
							i_202_++;
							i_209_ += i_230_;
							i_209_ %= i_212_;
						}
					} else
						throw new IllegalArgumentException();
				}
			}
		}
	}

	public ToolkitDesciption getDescription() {
		return new ToolkitDesciption(ToolkitDesciption.SSE, "Pure Java", 1, "CPU", 0L);
	}

	public void method5007(int i, int i_241_, int i_242_, int i_243_, int i_244_, int i_245_, ToolkitLoader toolkitLoader, int i_246_, int i_247_, int i_248_, int i_249_, int i_250_) {
		if (null != this.anIntArray7967) {
			Toolkit_Loader_Sub2 class_ta_sub2 = (Toolkit_Loader_Sub2) toolkitLoader;
			int[] is = class_ta_sub2.anIntArray8443;
			int[] is_251_ = class_ta_sub2.anIntArray8442;
			int i_252_ = (this.anInt7976 * -1278653805 > i_247_ ? -1278653805 * this.anInt7976 : i_247_);
			int i_253_ = ((this.anInt7977 * 63686679 < i_247_ + is.length) ? this.anInt7977 * 63686679 : i_247_ + is.length);
			i_250_ <<= 8;
			i_248_ <<= 8;
			i_249_ <<= 8;
			int i_254_ = i_248_ + i_249_;
			i_250_ %= i_254_;
			i_242_ -= i;
			i_243_ -= i_241_;
			if (i_243_ + i_242_ < 0) {
				int i_255_ = (int) (Math.sqrt((double) (i_243_ * i_243_ + i_242_ * i_242_)) * 256.0);
				int i_256_ = i_255_ % i_254_;
				i_250_ = i_248_ + i_254_ - i_250_ - i_256_;
				i_250_ %= i_254_;
				if (i_250_ < 0)
					i_250_ += i_254_;
				i += i_242_;
				i_242_ = -i_242_;
				i_241_ += i_243_;
				i_243_ = -i_243_;
			}
			if (i_242_ > i_243_) {
				i_241_ <<= 16;
				i_241_ += 32768;
				i_243_ <<= 16;
				int i_257_ = (int) Math.floor((double) i_243_ / (double) i_242_ + 0.5);
				i_242_ += i;
				int i_258_ = i_244_ >>> 24;
				int i_259_ = (int) Math.sqrt((double) (65536 + (i_257_ >> 8) * (i_257_ >> 8)));
				if (0 == i_245_ || i_245_ == 1 && 255 == i_258_) {
					while (i <= i_242_) {
						int i_260_ = i_241_ >> 16;
						int i_261_ = i_260_ - i_247_;
						if (i >= this.anInt7974 * -912871679 && i < (-1416794725 * this.anInt7991) && i_260_ >= i_252_ && i_260_ < i_253_ && i_250_ < i_248_) {
							int i_262_ = is[i_261_] + i_246_;
							if (i >= i_262_ && i < i_262_ + is_251_[i_261_])
								this.anIntArray7967[i + (692106883 * this.width * i_260_)] = i_244_;
						}
						i_241_ += i_257_;
						i++;
						i_250_ += i_259_;
						i_250_ %= i_254_;
					}
				} else if (1 == i_245_) {
					i_244_ = ((i_258_ << 24) + ((i_258_ * (i_244_ & 0xff00ff) >> 8 & 0xff00ff) + ((i_244_ & 0xff00) * i_258_ >> 8 & 0xff00)));
					int i_263_ = 256 - i_258_;
					while (i <= i_242_) {
						int i_264_ = i_241_ >> 16;
						int i_265_ = i_264_ - i_247_;
						if (i >= -912871679 * this.anInt7974 && i < (this.anInt7991 * -1416794725) && i_264_ >= i_252_ && i_264_ < i_253_ && i_250_ < i_248_) {
							int i_266_ = i_246_ + is[i_265_];
							if (i >= i_266_ && i < is_251_[i_265_] + i_266_) {
								int i_267_ = i + (this.width * 692106883 * i_264_);
								int i_268_ = (this.anIntArray7967[i_267_]);
								i_268_ = ((i_263_ * (i_268_ & 0xff00) >> 8 & 0xff00) + (i_263_ * (i_268_ & 0xff00ff) >> 8 & 0xff00ff));
								this.anIntArray7967[i_267_] = i_268_ + i_244_;
							}
						}
						i_241_ += i_257_;
						i++;
						i_250_ += i_259_;
						i_250_ %= i_254_;
					}
				} else if (i_245_ == 2) {
					while (i <= i_242_) {
						int i_269_ = i_241_ >> 16;
						int i_270_ = i_269_ - i_247_;
						if (i >= this.anInt7974 * -912871679 && i < (-1416794725 * this.anInt7991) && i_269_ >= i_252_ && i_269_ < i_253_ && i_250_ < i_248_) {
							int i_271_ = is[i_270_] + i_246_;
							if (i >= i_271_ && i < i_271_ + is_251_[i_270_]) {
								int i_272_ = ((692106883 * this.width * i_269_) + i);
								int i_273_ = (this.anIntArray7967[i_272_]);
								int i_274_ = i_244_ + i_273_;
								int i_275_ = ((i_244_ & 0xff00ff) + (i_273_ & 0xff00ff));
								i_273_ = ((i_274_ - i_275_ & 0x10000) + (i_275_ & 0x1000100));
								this.anIntArray7967[i_272_] = i_274_ - i_273_ | i_273_ - (i_273_ >>> 8);
							}
						}
						i_241_ += i_257_;
						i++;
						i_250_ += i_259_;
						i_250_ %= i_254_;
					}
				} else
					throw new IllegalArgumentException();
			} else {
				i <<= 16;
				i += 32768;
				i_242_ <<= 16;
				int i_276_ = (int) Math.floor(0.5 + ((double) i_242_ / (double) i_243_));
				int i_277_ = (int) Math.sqrt((double) ((i_276_ >> 8) * (i_276_ >> 8) + 65536));
				i_243_ += i_241_;
				int i_278_ = i_244_ >>> 24;
				if (i_245_ == 0 || i_245_ == 1 && i_278_ == 255) {
					while (i_241_ <= i_243_) {
						int i_279_ = i >> 16;
						int i_280_ = i_241_ - i_247_;
						if (i_241_ >= i_252_ && i_241_ < i_253_ && i_279_ >= (this.anInt7974 * -912871679) && i_279_ < (this.anInt7991 * -1416794725) && i_250_ < i_248_ && i_279_ >= i_246_ + is[i_280_] && i_279_ < is_251_[i_280_] + (i_246_ + is[i_280_]))
							this.anIntArray7967[(i_241_ * (692106883 * this.width) + i_279_)] = i_244_;
						i += i_276_;
						i_241_++;
						i_250_ += i_277_;
						i_250_ %= i_254_;
					}
				} else if (1 == i_245_) {
					i_244_ = (((i_244_ & 0xff00ff) * i_278_ >> 8 & 0xff00ff) + ((i_244_ & 0xff00) * i_278_ >> 8 & 0xff00) + (i_278_ << 24));
					int i_281_ = 256 - i_278_;
					while (i_241_ <= i_243_) {
						int i_282_ = i >> 16;
						int i_283_ = i_241_ - i_247_;
						if (i_241_ >= i_252_ && i_241_ < i_253_ && i_282_ >= (this.anInt7974 * -912871679) && i_282_ < (this.anInt7991 * -1416794725) && i_250_ < i_248_ && i_282_ >= i_246_ + is[i_283_] && (i_282_ < is[i_283_] + i_246_ + is_251_[i_283_])) {
							int i_284_ = (i_282_ + i_241_ * (this.width * 692106883));
							int i_285_ = (this.anIntArray7967[i_284_]);
							i_285_ = ((i_281_ * (i_285_ & 0xff00) >> 8 & 0xff00) + ((i_285_ & 0xff00ff) * i_281_ >> 8 & 0xff00ff));
							this.anIntArray7967[(i_282_ + i_241_ * (this.width * 692106883))] = i_244_ + i_285_;
						}
						i += i_276_;
						i_241_++;
						i_250_ += i_277_;
						i_250_ %= i_254_;
					}
				} else if (2 == i_245_) {
					while (i_241_ <= i_243_) {
						int i_286_ = i >> 16;
						int i_287_ = i_241_ - i_247_;
						if (i_241_ >= i_252_ && i_241_ < i_253_ && i_286_ >= (this.anInt7974 * -912871679) && i_286_ < (this.anInt7991 * -1416794725) && i_250_ < i_248_ && i_286_ >= i_246_ + is[i_287_] && (i_286_ < is[i_287_] + i_246_ + is_251_[i_287_])) {
							int i_288_ = (692106883 * this.width * i_241_) + i_286_;
							int i_289_ = (this.anIntArray7967[i_288_]);
							int i_290_ = i_289_ + i_244_;
							int i_291_ = (i_244_ & 0xff00ff) + (i_289_ & 0xff00ff);
							i_289_ = (i_291_ & 0x1000100) + (i_290_ - i_291_ & 0x10000);
							this.anIntArray7967[i_288_] = i_290_ - i_289_ | i_289_ - (i_289_ >>> 8);
						}
						i += i_276_;
						i_241_++;
						i_250_ += i_277_;
						i_250_ %= i_254_;
					}
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public void drawThickDiagonalLine(int startX, int startY, int endX, int endY, int rgba, int lineWidth, int mode) {
		if (null != this.anIntArray7967) {
			Class15 class15 = method5202(Thread.currentThread());
			Class2 class2 = class15.aClass2_192;
			int i_298_ = endX - startX;
			int i_299_ = endY - startY;
			int i_300_ = i_298_ >= 0 ? i_298_ : -i_298_;
			int i_301_ = i_299_ >= 0 ? i_299_ : -i_299_;
			int i_302_ = i_300_;
			if (i_302_ < i_301_)
				i_302_ = i_301_;
			if (0 != i_302_) {
				int i_303_ = (i_298_ << 16) / i_302_;
				int i_304_ = (i_299_ << 16) / i_302_;
				i_298_ += i_303_ >> 16;
				i_299_ += i_304_ >> 16;
				if (i_304_ <= i_303_)
					i_303_ = -i_303_;
				else
					i_304_ = -i_304_;
				int i_305_ = i_304_ * lineWidth >> 17;
				int i_306_ = i_304_ * lineWidth + 1 >> 17;
				int i_307_ = i_303_ * lineWidth >> 17;
				int i_308_ = 1 + lineWidth * i_303_ >> 17;
				startX -= class2.method287();
				startY -= class2.method288();
				int i_309_ = i_305_ + startX;
				int i_310_ = startX - i_306_;
				int i_311_ = startX + i_298_ - i_306_;
				int i_312_ = i_305_ + (startX + i_298_);
				int i_313_ = startY + i_307_;
				int i_314_ = startY - i_308_;
				int i_315_ = i_299_ + startY - i_308_;
				int i_316_ = startY + i_299_ + i_307_;
				if (mode == 0)
					class2.anInt19 = 0;
				else if (mode == 1)
					class2.anInt19 = 255 - (rgba >>> 24);
				else
					throw new IllegalArgumentException();
				RA(false);
				class2.aBoolean20 = (i_309_ < 0 || i_309_ > class2.anInt22 || i_310_ < 0 || i_310_ > class2.anInt22 || i_311_ < 0 || i_311_ > class2.anInt22);
				class2.method293(true, false, false, (float) i_313_, (float) i_314_, (float) i_315_, (float) i_309_, (float) i_310_, (float) i_311_, 100.0F, 100.0F, 100.0F, rgba);
				class2.aBoolean20 = (i_309_ < 0 || i_309_ > class2.anInt22 || i_311_ < 0 || i_311_ > class2.anInt22 || i_312_ < 0 || i_312_ > class2.anInt22);
				class2.method293(true, false, false, (float) i_313_, (float) i_315_, (float) i_316_, (float) i_309_, (float) i_311_, (float) i_312_, 100.0F, 100.0F, 100.0F, rgba);
				RA(true);
			}
		}
	}

	boolean method5200(int i) {
		return textures.method170(i, (short) 19583);
	}

	public Heap createNativeHeap(int i) {
		return null;
	}

	public void setBufferHeap(Heap class_v) {
		/* empty */
	}

	public boolean method5052() {
		return false;
	}

	public ToolkitLoader createClippingMask(int i, int i_317_, int[] is, int[] is_318_) {
		return new Toolkit_Loader_Sub2(is, is_318_);
	}

	public SpriteToolkit method5033(int i, int i_324_, int i_325_, int i_326_, boolean bool) {
		if (this.anIntArray7967 == null)
			throw new IllegalStateException("");
		int[] is = new int[i_325_ * i_326_];
		int i_327_ = i_324_ * (692106883 * this.width) + i;
		int i_328_ = 692106883 * this.width - i_325_;
		for (int i_329_ = 0; i_329_ < i_326_; i_329_++) {
			int i_330_ = i_325_ * i_329_;
			for (int i_331_ = 0; i_331_ < i_325_; i_331_++)
				is[i_331_ + i_330_] = this.anIntArray7967[i_327_++];
			i_327_ += i_328_;
		}
		if (bool)
			return new Class57_Sub1_Sub1(this, is, i_325_, i_326_);
		return new Class57_Sub1_Sub2(this, is, i_325_, i_326_);
	}

	public void DA(int i, ToolkitLoader toolkitLoader, int i_332_, int i_333_) {
		if (null != this.anIntArray7967) {
			Toolkit_Loader_Sub2 class_ta_sub2 = (Toolkit_Loader_Sub2) toolkitLoader;
			int[] is = class_ta_sub2.anIntArray8443;
			int[] is_334_ = class_ta_sub2.anIntArray8442;
			int i_335_;
			if (63686679 * this.anInt7977 < is.length + i_333_)
				i_335_ = this.anInt7977 * 63686679 - i_333_;
			else
				i_335_ = is.length;
			int i_336_;
			if (this.anInt7976 * -1278653805 > i_333_) {
				i_336_ = this.anInt7976 * -1278653805 - i_333_;
				i_333_ = this.anInt7976 * -1278653805;
			} else
				i_336_ = 0;
			if (i_335_ - i_336_ > 0) {
				int i_337_ = 692106883 * this.width * i_333_;
				for (int i_338_ = i_336_; i_338_ < i_335_; i_338_++) {
					int i_339_ = i_332_ + is[i_338_];
					int i_340_ = is_334_[i_338_];
					if (this.anInt7974 * -912871679 > i_339_) {
						i_340_ -= (-912871679 * this.anInt7974 - i_339_);
						i_339_ = -912871679 * this.anInt7974;
					}
					if (-1416794725 * this.anInt7991 < i_339_ + i_340_)
						i_340_ = (-1416794725 * this.anInt7991 - i_339_);
					i_339_ += i_337_;
					for (int i_341_ = -i_340_; i_341_ < 0; i_341_++)
						this.anIntArray7967[i_339_++] = i;
					i_337_ += this.width * 692106883;
				}
			}
		}
	}

	public int method5004(int i, int i_353_) {
		return i | i_353_;
	}

	public FloorToolkit createLandScapeRenderer(int i, int i_354_, int[][] is, int[][] is_355_, int i_356_, int i_357_, int i_358_) {
		return new Class_xa_Sub2(this, i_357_, i_358_, i, i_354_, is, is_355_, i_356_);
	}

	public Matrix43f getTransformationMatrix() {
		Class15 class15 = method5202(Thread.currentThread());
		return class15.aClass222_219;
	}

	public Light createLight(int i, int i_359_, int i_360_, int i_361_, int i_362_, float f) {
		return null;
	}

	public void setLights(int i, Light[] class298_sub10s) {
		/* empty */
	}

	void method5201(int i) {
		this.aClass15Array8001[i].method347(Thread.currentThread(), (byte) -84);
	}

	Class15 method5202(Runnable runnable) {
		for (int i = 0; i < -922307687 * this.anInt7999; i++) {
			if ((this.aClass15Array8001[i].aRunnable179) == runnable)
				return this.aClass15Array8001[i];
		}
		return null;
	}

	public void renderParticles(Class69 class69) {
		method5203(null != this.anIntArray7967, this.aFloatArray7973 != null, false, class69);
	}

	void method5203(boolean bool, boolean bool_363_, boolean bool_364_, Class69 class69) {
		Class15 class15 = method5202(Thread.currentThread());
		Class302_Sub3 class302_sub3 = class69.aClass448_680.aClass302_Sub3_5621;
		for (Class302_Sub3 class302_sub3_365_ = class302_sub3.aClass302_Sub3_7650; class302_sub3_365_ != class302_sub3; class302_sub3_365_ = class302_sub3_365_.aClass302_Sub3_7650) {
			Class302_Sub3_Sub1 class302_sub3_sub1 = (Class302_Sub3_Sub1) class302_sub3_365_;
			int i = class302_sub3_sub1.anInt9785 >> 12;
			int i_366_ = class302_sub3_sub1.anInt9789 >> 12;
			int i_367_ = class302_sub3_sub1.anInt9790 >> 12;
			float f = (((float) i * this.aMatrix4f_7987.aFloatArray2594[2]) + (float) i_366_ * (this.aMatrix4f_7987.aFloatArray2594[6]) + (this.aMatrix4f_7987.aFloatArray2594[10] * (float) i_367_) + (this.aMatrix4f_7987.aFloatArray2594[14]));
			float f_368_ = (this.aMatrix4f_7987.aFloatArray2594[15] + ((this.aMatrix4f_7987.aFloatArray2594[11]) * (float) i_367_ + ((this.aMatrix4f_7987.aFloatArray2594[7]) * (float) i_366_ + (float) i * (this.aMatrix4f_7987.aFloatArray2594[3]))));
			if (!(f < -f_368_)) {
				float f_369_ = (this.aFloat7997 * f / f_368_ + this.aFloat8004);
				if (!(f > class15.aFloat205)) {
					float f_370_ = ((this.aMatrix4f_7987.aFloatArray2594[12]) + ((float) i_366_ * (this.aMatrix4f_7987.aFloatArray2594[4]) + (float) i * (this.aMatrix4f_7987.aFloatArray2594[0]) + (this.aMatrix4f_7987.aFloatArray2594[8]) * (float) i_367_));
					float f_371_ = ((this.aMatrix4f_7987.aFloatArray2594[13]) + ((float) i_367_ * (this.aMatrix4f_7987.aFloatArray2594[9]) + ((float) i_366_ * (this.aMatrix4f_7987.aFloatArray2594[5]) + (this.aMatrix4f_7987.aFloatArray2594[1]) * (float) i)));
					if (!(f_370_ < -f_368_) && !(f_370_ > f_368_) && !(f_371_ < -f_368_) && !(f_371_ > f_368_)) {
						float f_372_ = (float) class302_sub3_sub1.anInt9791 / 4096.0F;
						float f_373_ = f_370_ + (this.aMatrix4f_7986.aFloatArray2594[0]) * f_372_;
						float f_374_ = (f_372_ * (this.aMatrix4f_7986.aFloatArray2594[3]) + f_368_);
						float f_375_ = (this.aFloat8005 + (f_370_ * this.aFloat7993 / f_368_));
						float f_376_ = ((f_371_ * this.aFloat7995 / f_368_) + this.aFloat7996);
						float f_377_ = (this.aFloat8005 + (f_373_ * this.aFloat7993 / f_374_));
						method5204(bool, bool_363_, bool_364_, class302_sub3_sub1, (int) f_375_, (int) f_376_, f_369_, (int) (f_377_ < f_375_ ? f_375_ - f_377_ : f_377_ - f_375_));
					}
				}
			}
		}
	}

	void method5204(boolean bool, boolean bool_378_, boolean bool_379_, Class302_Sub3_Sub1 class302_sub3_sub1, int i, int i_380_, float f, int i_381_) {
		int i_382_ = class302_sub3_sub1.anInt9794;
		int i_383_ = i_381_;
		i_381_ <<= 1;
		if (-1 == i_382_)
			method5219(bool_378_, i, i_380_, f, i_383_, class302_sub3_sub1.anInt9792, 1);
		else {
			if (i_382_ != this.anInt8006 * -815285507) {
				SpriteToolkit class57 = (SpriteToolkit) this.aClass348_7970.get((long) i_382_);
				if (class57 == null) {
					int[] is = method5197(i_382_);
					if (is != null) {
						int i_384_ = (method5199(i_382_) ? 64 : (1107560907 * this.anInt8002));
						class57 = createRenderSprite(is, 0, i_384_, i_384_, i_384_);
						this.aClass348_7970.put(class57, (long) i_382_);
					} else
						return;
				}
				this.anInt8006 = 2116530773 * i_382_;
				this.aClass57_7992 = class57;
			}
			i_381_++;
			((Class57_Sub1) this.aClass57_7992).method678(bool, bool_378_, bool_379_, i - i_383_, i_380_ - i_383_, f, i_381_, i_381_, 0, class302_sub3_sub1.anInt9792, 1, 1, false);
		}
	}

	void method5205(boolean bool, boolean bool_385_, boolean bool_386_, int i, int i_387_, float f, int i_388_, int i_389_, int i_390_, int i_391_, int i_392_, int i_393_) {
		if (i_388_ != 0 && i_389_ != 0) {
			if (i_390_ != 65535) {
				Class53 class53 = textures.method174(i_390_);
				if (!class53.aBoolean524) {
					if (i_390_ != this.anInt8006 * -815285507) {
						SpriteToolkit class57 = (SpriteToolkit) this.aClass348_7970.get((long) i_390_);
						if (null == class57) {
							int[] is = method5197(i_390_);
							if (null == is)
								return;
							int i_394_ = (method5199(i_390_) ? 64 : (this.anInt8002 * 1107560907));
							class57 = createRenderSprite(is, 0, i_394_, i_394_, i_394_);
							this.aClass348_7970.put(class57, (long) i_390_);
						}
						this.anInt8006 = i_390_ * 2116530773;
						this.aClass57_7992 = class57;
					}
					((Class57_Sub1) this.aClass57_7992).method678(bool, bool_385_, bool_386_, i - i_388_, i_387_ - i_389_, f, i_388_ << 1, i_389_ << 1, i_392_, i_391_, i_393_, 1, -2138060883 * class53.anInt528 != 2);
					return;
				}
			}
			method5219(bool_385_, i, i_387_, f, i_388_, i_391_, i_393_);
		}
	}

	int method5206(int i) {
		return textures.method174(i).aShort532 & 0xffff;
	}

	void method5207(int width, int height, int[] is, float[] fs) {
		this.width = -1336293333 * width;
		this.height = height * -1138901201;
		this.anIntArray7967 = is;
		this.aFloatArray7973 = fs;
		for (int index = 0; index < this.anInt7999 * -922307687; index++)
			this.aClass15Array8001[index].method348(-455629367);
		L();
		resetClip();
	}

	public void ci(Matrix4f matrix4f) {
		this.aMatrix4f_7986.method2142(matrix4f);
		method5208();
	}

	public Matrix4f method5045() {
		return new Matrix4f(this.aMatrix4f_7986);
	}

	public void setModelAmbient(float f) {
		this.anInt7983 = -1954754855 * (int) (65535.0F * f);
	}

	public int method5048() {
		return 0;
	}

	public void J(int i) {
		/* empty */
	}

	void method5208() {
		this.aMatrix4f_8000.method2145(this.aClass222_7984);
		this.aMatrix4f_7987.method2142(this.aMatrix4f_8000);
		this.aMatrix4f_7987.method2144(this.aMatrix4f_7986);
		this.aMatrix4f_7987.method2157(this.aFloatArrayArray7988[0]);
		this.aMatrix4f_7987.method2158(this.aFloatArrayArray7988[1]);
		this.aMatrix4f_7987.method2156(this.aFloatArrayArray7988[2]);
		this.aMatrix4f_7987.method2170(this.aFloatArrayArray7988[3]);
		this.aMatrix4f_7987.method2171(this.aFloatArrayArray7988[4]);
		this.aMatrix4f_7987.method2163(this.aFloatArrayArray7988[5]);
		float f = this.aMatrix4f_7986.method2155();
		float f_403_ = ((this.aMatrix4f_7986.aFloatArray2594[10] * (f - 255.0F)) + this.aMatrix4f_7986.aFloatArray2594[14]);
		float f_404_ = (this.aMatrix4f_7986.aFloatArray2594[10] * f + this.aMatrix4f_7986.aFloatArray2594[14]);
		float f_405_ = f_404_ - f_403_;
		for (int i = 0; i < -922307687 * this.anInt7999; i++) {
			Class15 class15 = this.aClass15Array8001[i];
			class15.aFloat205 = f_403_;
			class15.aFloat183 = f_405_;
		}
	}

	public void cw(Matrix43f class222) {
		this.aClass222_7984 = class222;
		method5208();
	}

	public void a(EnvironmentMap class66) {
		/* empty */
	}

	void method5209() {
		int i = (-1416794725 * this.anInt7991 - this.anInt7974 * -912871679);
		int i_413_ = (this.anInt7977 * 63686679 - -1278653805 * this.anInt7976);
		float f = (this.aFloat7993 = ((float) (-1840027081 * this.anInt7980) / 2.0F));
		float f_414_ = (this.aFloat7995 = (float) (this.anInt7969 * 1936944123) / 2.0F);
		this.aFloat8005 = f + (float) (this.anInt7989 * 1767406117);
		this.aFloat7996 = f_414_ + (float) (-457799237 * this.anInt7990);
		for (int i_415_ = 0; i_415_ < -922307687 * this.anInt7999; i_415_++) {
			Class15 class15 = this.aClass15Array8001[i_415_];
			Class2 class2 = class15.aClass2_192;
			class2.aFloat17 = f;
			class2.aFloat26 = f_414_;
			class2.aFloat23 = (this.aFloat8005 - (float) (-912871679 * this.anInt7974));
			class2.aFloat25 = (this.aFloat7996 - (float) (-1278653805 * this.anInt7976));
			class2.anInt22 = i;
			class2.anInt38 = i_413_;
		}
		int i_416_ = ((-1278653805 * this.anInt7976 * (this.width * 692106883)) + -912871679 * this.anInt7974);
		for (int i_417_ = this.anInt7976 * -1278653805; i_417_ < 63686679 * this.anInt7977; i_417_++) {
			for (int i_418_ = 0; i_418_ < -922307687 * this.anInt7999; i_418_++)
				this.aClass15Array8001[i_418_].aClass2_192.anIntArray47[i_417_ - this.anInt7976 * -1278653805] = i_416_;
			i_416_ += 692106883 * this.width;
		}
	}

	public void bloomSmn() {
		/* empty */
	}

	public boolean method5054() {
		return false;
	}

	public void method5022(int i, int i_419_, int i_420_, int i_421_, int i_422_, int i_423_, ToolkitLoader toolkitLoader, int i_424_, int i_425_) {
		if (this.anIntArray7967 != null) {
			Toolkit_Loader_Sub2 class_ta_sub2 = (Toolkit_Loader_Sub2) toolkitLoader;
			int[] is = class_ta_sub2.anIntArray8443;
			int[] is_426_ = class_ta_sub2.anIntArray8442;
			int i_427_ = (this.anInt7976 * -1278653805 > i_425_ ? this.anInt7976 * -1278653805 : i_425_);
			int i_428_ = ((63686679 * this.anInt7977 < i_425_ + is.length) ? 63686679 * this.anInt7977 : i_425_ + is.length);
			i_420_ -= i;
			i_421_ -= i_419_;
			if (i_420_ + i_421_ < 0) {
				i += i_420_;
				i_420_ = -i_420_;
				i_419_ += i_421_;
				i_421_ = -i_421_;
			}
			if (i_420_ > i_421_) {
				i_419_ <<= 16;
				i_419_ += 32768;
				i_421_ <<= 16;
				int i_429_ = (int) Math.floor(0.5 + ((double) i_421_ / (double) i_420_));
				i_420_ += i;
				if (i < this.anInt7974 * -912871679) {
					i_419_ += (-912871679 * this.anInt7974 - i) * i_429_;
					i = -912871679 * this.anInt7974;
				}
				if (i_420_ >= -1416794725 * this.anInt7991)
					i_420_ = -1416794725 * this.anInt7991 - 1;
				int i_430_ = i_422_ >>> 24;
				if (0 == i_423_ || i_423_ == 1 && 255 == i_430_) {
					for (/**/; i <= i_420_; i++) {
						int i_431_ = i_419_ >> 16;
						int i_432_ = i_431_ - i_425_;
						if (i_431_ >= i_427_ && i_431_ < i_428_) {
							int i_433_ = is[i_432_] + i_424_;
							if (i >= i_433_ && i < is_426_[i_432_] + i_433_)
								this.anIntArray7967[(this.width * 692106883 * i_431_) + i] = i_422_;
						}
						i_419_ += i_429_;
					}
				} else if (1 == i_423_) {
					i_422_ = ((i_430_ << 24) + ((i_430_ * (i_422_ & 0xff00ff) >> 8 & 0xff00ff) + ((i_422_ & 0xff00) * i_430_ >> 8 & 0xff00)));
					int i_434_ = 256 - i_430_;
					for (/**/; i <= i_420_; i++) {
						int i_435_ = i_419_ >> 16;
						int i_436_ = i_435_ - i_425_;
						if (i_435_ >= i_427_ && i_435_ < i_428_) {
							int i_437_ = is[i_436_] + i_424_;
							if (i >= i_437_ && i < is_426_[i_436_] + i_437_) {
								int i_438_ = i + (this.width * 692106883 * i_435_);
								int i_439_ = (this.anIntArray7967[i_438_]);
								i_439_ = (((i_439_ & 0xff00) * i_434_ >> 8 & 0xff00) + (i_434_ * (i_439_ & 0xff00ff) >> 8 & 0xff00ff));
								this.anIntArray7967[i_438_] = i_439_ + i_422_;
							}
						}
						i_419_ += i_429_;
					}
				} else if (2 == i_423_) {
					for (/**/; i <= i_420_; i++) {
						int i_440_ = i_419_ >> 16;
						int i_441_ = i_440_ - i_425_;
						if (i_440_ >= i_427_ && i_440_ < i_428_) {
							int i_442_ = is[i_441_] + i_424_;
							if (i >= i_442_ && i < i_442_ + is_426_[i_441_]) {
								int i_443_ = i + (i_440_ * (this.width * 692106883));
								int i_444_ = (this.anIntArray7967[i_443_]);
								int i_445_ = i_422_ + i_444_;
								int i_446_ = ((i_422_ & 0xff00ff) + (i_444_ & 0xff00ff));
								i_444_ = (i_446_ & 0x1000100) + (i_445_ - i_446_ & 0x10000);
								this.anIntArray7967[i_443_] = i_445_ - i_444_ | i_444_ - (i_444_ >>> 8);
							}
						}
						i_419_ += i_429_;
					}
				} else
					throw new IllegalArgumentException();
			} else {
				i <<= 16;
				i += 32768;
				i_420_ <<= 16;
				int i_447_ = (int) Math.floor((double) i_420_ / (double) i_421_ + 0.5);
				i_421_ += i_419_;
				if (i_419_ < i_427_) {
					i += (i_427_ - i_419_) * i_447_;
					i_419_ = i_427_;
				}
				if (i_421_ >= i_428_)
					i_421_ = i_428_ - 1;
				int i_448_ = i_422_ >>> 24;
				if (i_423_ == 0 || 1 == i_423_ && i_448_ == 255) {
					for (/**/; i_419_ <= i_421_; i_419_++) {
						int i_449_ = i >> 16;
						int i_450_ = i_419_ - i_425_;
						int i_451_ = is[i_450_] + i_424_;
						if ((i_449_ >= this.anInt7974 * -912871679) && i_449_ < (-1416794725 * this.anInt7991) && i_449_ >= i_451_ && i_449_ < is_426_[i_450_] + i_451_)
							this.anIntArray7967[(692106883 * this.width * i_419_) + i_449_] = i_422_;
						i += i_447_;
					}
				} else if (i_423_ == 1) {
					i_422_ = ((i_448_ * (i_422_ & 0xff00ff) >> 8 & 0xff00ff) + (i_448_ * (i_422_ & 0xff00) >> 8 & 0xff00) + (i_448_ << 24));
					int i_452_ = 256 - i_448_;
					for (/**/; i_419_ <= i_421_; i_419_++) {
						int i_453_ = i >> 16;
						int i_454_ = i_419_ - i_425_;
						int i_455_ = i_424_ + is[i_454_];
						if ((i_453_ >= -912871679 * this.anInt7974) && i_453_ < (-1416794725 * this.anInt7991) && i_453_ >= i_455_ && i_453_ < is_426_[i_454_] + i_455_) {
							int i_456_ = (692106883 * this.width * i_419_) + i_453_;
							int i_457_ = (this.anIntArray7967[i_456_]);
							i_457_ = (((i_457_ & 0xff00) * i_452_ >> 8 & 0xff00) + (i_452_ * (i_457_ & 0xff00ff) >> 8 & 0xff00ff));
							this.anIntArray7967[(i_419_ * (692106883 * this.width) + i_453_)] = i_457_ + i_422_;
						}
						i += i_447_;
					}
				} else if (i_423_ == 2) {
					for (/**/; i_419_ <= i_421_; i_419_++) {
						int i_458_ = i >> 16;
						int i_459_ = i_419_ - i_425_;
						int i_460_ = i_424_ + is[i_459_];
						if ((i_458_ >= -912871679 * this.anInt7974) && i_458_ < (-1416794725 * this.anInt7991) && i_458_ >= i_460_ && i_458_ < i_460_ + is_426_[i_459_]) {
							int i_461_ = ((this.width * 692106883 * i_419_) + i_458_);
							int i_462_ = (this.anIntArray7967[i_461_]);
							int i_463_ = i_462_ + i_422_;
							int i_464_ = (i_422_ & 0xff00ff) + (i_462_ & 0xff00ff);
							i_462_ = (i_463_ - i_464_ & 0x10000) + (i_464_ & 0x1000100);
							this.anIntArray7967[i_461_] = i_463_ - i_462_ | i_462_ - (i_462_ >>> 8);
						}
						i += i_447_;
					}
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public void method4787(boolean bool) {
		this.aBoolean8003 = bool;
		this.aClass348_7975.clear();
	}

	public Matrix4f cz() {
		Class15 class15 = method5202(Thread.currentThread());
		return class15.aMatrix4f_190;
	}

	public EnvironmentMap method5179(EnvironmentMap class66, EnvironmentMap class66_465_, float f, EnvironmentMap class66_466_) {
		return null;
	}

	public void O() {
		for (int i = 0; i < this.aClass15Array8001.length; i++) {
			this.aClass15Array8001[i].anInt184 = 950886337 * this.aClass15Array8001[i].anInt185;
			this.aClass15Array8001[i].aBoolean186 = false;
		}
	}

	public void method5020(int i, int i_467_, float f, int i_468_, int i_469_, float f_470_, int i_471_, int i_472_, float f_473_, int i_474_, int i_475_, int i_476_, int i_477_) {
		boolean bool = null != this.anIntArray7967;
		boolean bool_478_ = this.aFloatArray7973 != null;
		if (bool || bool_478_) {
			Class15 class15 = method5202(Thread.currentThread());
			Class2 class2 = class15.aClass2_192;
			class2.aBoolean16 = false;
			i -= -912871679 * this.anInt7974;
			i_468_ -= -912871679 * this.anInt7974;
			i_471_ -= -912871679 * this.anInt7974;
			i_467_ -= this.anInt7976 * -1278653805;
			i_469_ -= this.anInt7976 * -1278653805;
			i_472_ -= this.anInt7976 * -1278653805;
			class2.aBoolean20 = (i < 0 || i > class2.anInt22 || i_468_ < 0 || i_468_ > class2.anInt22 || i_471_ < 0 || i_471_ > class2.anInt22);
			int i_479_ = i_474_ >>> 24;
			if (0 == i_477_ || i_477_ == 1 && 255 == i_479_) {
				class2.anInt19 = 0;
				class2.aBoolean48 = false;
				class2.method292(bool, bool_478_, false, (float) i_467_, (float) i_469_, (float) i_472_, (float) i, (float) i_468_, (float) i_471_, f, f_470_, f_473_, i_474_, i_475_, i_476_);
			} else if (1 == i_477_) {
				class2.anInt19 = 255 - i_479_;
				class2.aBoolean48 = false;
				class2.method292(bool, bool_478_, false, (float) i_467_, (float) i_469_, (float) i_472_, (float) i, (float) i_468_, (float) i_471_, f, f_470_, f_473_, i_474_, i_475_, i_476_);
			} else if (2 == i_477_) {
				class2.anInt19 = 128;
				class2.aBoolean48 = true;
				class2.method292(bool, bool_478_, false, (float) i_467_, (float) i_469_, (float) i_472_, (float) i, (float) i_468_, (float) i_471_, f, f_470_, f_473_, i_474_, i_475_, i_476_);
			} else
				throw new IllegalArgumentException();
			class2.aBoolean16 = true;
		}
	}

	public void method_do(float f, float f_480_, float f_481_, float[] fs) {
		float f_482_ = ((this.aMatrix4f_7987.aFloatArray2594[11] * f_481_) + (f * this.aMatrix4f_7987.aFloatArray2594[3] + this.aMatrix4f_7987.aFloatArray2594[15] + f_480_ * (this.aMatrix4f_7987.aFloatArray2594[7])));
		float f_483_ = ((f_481_ * this.aMatrix4f_7987.aFloatArray2594[8]) + (this.aMatrix4f_7987.aFloatArray2594[12] + (this.aMatrix4f_7987.aFloatArray2594[0] * f) + f_480_ * (this.aMatrix4f_7987.aFloatArray2594[4])));
		float f_484_ = ((this.aMatrix4f_7987.aFloatArray2594[5] * f_480_) + (this.aMatrix4f_7987.aFloatArray2594[1] * f + this.aMatrix4f_7987.aFloatArray2594[13]) + (this.aMatrix4f_7987.aFloatArray2594[9] * f_481_));
		float f_485_ = (f * this.aMatrix4f_8000.aFloatArray2594[2] + this.aMatrix4f_8000.aFloatArray2594[14] + (this.aMatrix4f_8000.aFloatArray2594[6] * f_480_) + (this.aMatrix4f_8000.aFloatArray2594[10] * f_481_));
		fs[0] = (f_483_ * this.aFloat7993 / f_482_ + this.aFloat8005);
		fs[1] = (this.aFloat7996 + this.aFloat7995 * f_484_ / f_482_);
		fs[2] = f_485_;
	}

	public void dr(float f, float f_486_, float f_487_, float[] fs) {
		float f_488_ = ((f_487_ * this.aMatrix4f_7987.aFloatArray2594[10]) + (this.aMatrix4f_7987.aFloatArray2594[2] * f + this.aMatrix4f_7987.aFloatArray2594[14] + (this.aMatrix4f_7987.aFloatArray2594[6] * f_486_)));
		float f_489_ = ((f_487_ * this.aMatrix4f_7987.aFloatArray2594[11]) + (this.aMatrix4f_7987.aFloatArray2594[15] + (this.aMatrix4f_7987.aFloatArray2594[3] * f) + f_486_ * (this.aMatrix4f_7987.aFloatArray2594[7])));
		if (f_488_ < -f_489_ || f_488_ > f_489_) {
			float[] fs_490_ = fs;
			float[] fs_491_ = fs;
			fs[2] = Float.NaN;
			fs_491_[1] = Float.NaN;
			fs_490_[0] = Float.NaN;
		} else {
			float f_492_ = (this.aMatrix4f_7987.aFloatArray2594[12] + f * (this.aMatrix4f_7987.aFloatArray2594[0]) + f_486_ * (this.aMatrix4f_7987.aFloatArray2594[4]) + f_487_ * (this.aMatrix4f_7987.aFloatArray2594[8]));
			if (f_492_ < -f_489_ || f_492_ > f_489_) {
				float[] fs_493_ = fs;
				float[] fs_494_ = fs;
				fs[2] = Float.NaN;
				fs_494_[1] = Float.NaN;
				fs_493_[0] = Float.NaN;
			} else {
				float f_495_ = ((this.aMatrix4f_7987.aFloatArray2594[5]) * f_486_ + ((this.aMatrix4f_7987.aFloatArray2594[13]) + f * (this.aMatrix4f_7987.aFloatArray2594[1])) + (this.aMatrix4f_7987.aFloatArray2594[9]) * f_487_);
				if (f_495_ < -f_489_ || f_495_ > f_489_) {
					float[] fs_496_ = fs;
					float[] fs_497_ = fs;
					fs[2] = Float.NaN;
					fs_497_[1] = Float.NaN;
					fs_496_[0] = Float.NaN;
				} else {
					float f_498_ = ((this.aMatrix4f_8000.aFloatArray2594[10]) * f_487_ + (f * (this.aMatrix4f_8000.aFloatArray2594[2]) + (this.aMatrix4f_8000.aFloatArray2594[14]) + (this.aMatrix4f_8000.aFloatArray2594[6]) * f_486_));
					fs[0] = (this.aFloat8005 + (f_492_ * this.aFloat7993 / f_489_));
					fs[1] = (this.aFloat7995 * f_495_ / f_489_ + this.aFloat7996);
					fs[2] = f_498_;
				}
			}
		}
	}

	public void method5058(int i, Class78 class78) {
		Class15 class15 = method5202(Thread.currentThread());
		class15.anInt196 = 1450505545 * i;
		class15.anInt184 = -1634857629 * class78.anInt726;
		class15.anInt215 = -296597081 * class78.anInt725;
	}

	void method5210(int i) {
		this.anInt7999 = i * 877981865;
		this.aClass15Array8001 = new Class15[-922307687 * this.anInt7999];
		for (int i_514_ = 0; i_514_ < this.anInt7999 * -922307687; i_514_++)
			this.aClass15Array8001[i_514_] = new Class15(this);
	}

	public void clear(int i, int i_520_) {
		if ((i & 0x1) != 0)
			drawFilledRectangle(0, 0, 692106883 * this.width, this.height * 918677455, i_520_, 0);
		if ((i & 0x2) != 0)
			method5198();
	}

	void method5188(float f, float f_570_, float f_571_, float f_572_, float f_573_, float f_574_) {
		/* empty */
	}

	public void qa(int[] is) {
		is[0] = -912871679 * this.anInt7974;
		is[1] = this.anInt7976 * -1278653805;
		is[2] = -1416794725 * this.anInt7991;
		is[3] = this.anInt7977 * 63686679;
	}

	boolean method5212(int i) {
		return (textures.method174(i).aBoolean540 || textures.method174(i).aBoolean541);
	}

	public FontToolkit createFontToolkit(RSFontMetrics class505, Sprite[] sprites, boolean loaded) {
		int[] is = new int[sprites.length];
		int[] is_575_ = new int[sprites.length];
		boolean bool_576_ = false;
		for (int i = 0; i < sprites.length; i++) {
			is[i] = sprites[i].width;
			is_575_[i] = sprites[i].height;
			if (sprites[i].alpha != null)
				bool_576_ = true;
		}
		if (loaded) {
			if (bool_576_)
				return new Class264_Sub2(this, class505, sprites, is, is_575_);
			return new Class264_Sub4(this, class505, sprites, is, is_575_);
		}
		if (bool_576_)
			throw new IllegalArgumentException("");
		return new Class264_Sub1(this, class505, sprites, is, is_575_);
	}

	public int[] aq(int i, int i_578_, int i_579_, int i_580_) {
		if (null == this.anIntArray7967)
			throw new IllegalStateException("");
		int[] is = new int[i_579_ * i_580_];
		int i_581_ = 0;
		for (int i_582_ = 0; i_582_ < i_580_; i_582_++) {
			int i_583_ = i + (this.width * 692106883 * (i_578_ + i_582_));
			for (int i_584_ = 0; i_584_ < i_579_; i_584_++)
				is[i_581_++] = this.anIntArray7967[i_584_ + i_583_];
		}
		return is;
	}

	public void method5176() {
		/* empty */
	}

	public void method5057(int i, Class78 class78) {
		for (int i_670_ = 0; i_670_ < this.aClass15Array8001.length; i_670_++) {
			this.aClass15Array8001[i_670_].anInt185 = 329691201 * (this.aClass15Array8001[i_670_].anInt184);
			this.aClass15Array8001[i_670_].anInt196 = 1450505545 * i;
			this.aClass15Array8001[i_670_].anInt184 = class78.anInt726 * -1634857629;
			this.aClass15Array8001[i_670_].anInt215 = class78.anInt725 * -296597081;
			this.aClass15Array8001[i_670_].aBoolean186 = true;
		}
	}

	public void method5075() {
		/* empty */
	}

	public void method5056(int i, int i_673_, int i_674_, int i_675_) {
		/* empty */
	}

	public void clean(int i) {
		int i_1092_ = i - -1633713343 * this.anInt7968;
		for (Class298_Sub4 class298_sub4 = (Class298_Sub4) this.aClass348_7975.method4190(); null != class298_sub4; class298_sub4 = (Class298_Sub4) this.aClass348_7975.method4191()) {
			if (class298_sub4.aBoolean7189) {
				class298_sub4.anInt7188 += i_1092_;
				int i_1093_ = class298_sub4.anInt7188 / 50;
				if (i_1093_ > 0) {
					Class53 class53 = textures.method174((class298_sub4.anInt7190));
					float f = class53.aBoolean518 ? 64.0F : 128.0F;
					class298_sub4.method2855((int) ((float) i_1092_ / 1000.0F * (float) class53.aByte535 / 64.0F * f), (int) (f * ((float) class53.aByte509 * ((float) i_1092_ / 1000.0F) / 64.0F)));
					class298_sub4.anInt7188 -= 50 * i_1093_;
				}
				class298_sub4.aBoolean7189 = false;
			}
		}
		this.anInt7968 = -1260974911 * i;
		this.aClass348_7970.method4186(5);
		this.aClass348_7975.method4186(5);
	}

	public void drawDiagonalLine(int startX, int startY, int endX, int endY, int rgba, int mode) {
		if (null != this.anIntArray7967) {
			endX -= startX;
			endY -= startY;
			if (0 == endY) {
				if (endX >= 0)
					XA(startX, startY, 1 + endX, rgba, mode);
				else
					XA(startX + endX, startY, -endX + 1, rgba, mode);
			} else if (endX == 0) {
				if (endY >= 0)
					G(startX, startY, 1 + endY, rgba, mode);
				else
					G(startX, startY + endY, 1 + -endY, rgba, mode);
			} else {
				if (endX + endY < 0) {
					startX += endX;
					endX = -endX;
					startY += endY;
					endY = -endY;
				}
				if (endX > endY) {
					startY <<= 16;
					startY += 32768;
					endY <<= 16;
					int i_1159_ = (int) Math.floor(0.5 + ((double) endY / (double) endX));
					endX += startX;
					if (startX < this.anInt7974 * -912871679) {
						startY += i_1159_ * ((this.anInt7974 * -912871679) - startX);
						startX = this.anInt7974 * -912871679;
					}
					if (endX >= this.anInt7991 * -1416794725)
						endX = (-1416794725 * this.anInt7991 - 1);
					int i_1160_ = rgba >>> 24;
					if (mode == 0 || mode == 1 && i_1160_ == 255) {
						for (/**/; startX <= endX; startX++) {
							int i_1161_ = startY >> 16;
							if (i_1161_ >= (-1278653805 * this.anInt7976) && i_1161_ < (this.anInt7977 * 63686679))
								this.anIntArray7967[startX + i_1161_ * (692106883 * (this.width))] = rgba;
							startY += i_1159_;
						}
					} else if (1 == mode) {
						rgba = ((i_1160_ << 24) + ((i_1160_ * (rgba & 0xff00) >> 8 & 0xff00) + (i_1160_ * (rgba & 0xff00ff) >> 8 & 0xff00ff)));
						int i_1162_ = 256 - i_1160_;
						for (/**/; startX <= endX; startX++) {
							int i_1163_ = startY >> 16;
							if (i_1163_ >= (this.anInt7976 * -1278653805) && i_1163_ < (this.anInt7977 * 63686679)) {
								int i_1164_ = startX + (i_1163_ * (this.width * 692106883));
								int i_1165_ = (this.anIntArray7967[i_1164_]);
								i_1165_ = ((i_1162_ * (i_1165_ & 0xff00) >> 8 & 0xff00) + ((i_1165_ & 0xff00ff) * i_1162_ >> 8 & 0xff00ff));
								this.anIntArray7967[i_1164_] = rgba + i_1165_;
							}
							startY += i_1159_;
						}
					} else if (2 == mode) {
						for (/**/; startX <= endX; startX++) {
							int i_1166_ = startY >> 16;
							if (i_1166_ >= (this.anInt7976 * -1278653805) && i_1166_ < (this.anInt7977 * 63686679)) {
								int i_1167_ = ((i_1166_ * (692106883 * this.width)) + startX);
								int i_1168_ = (this.anIntArray7967[i_1167_]);
								int i_1169_ = rgba + i_1168_;
								int i_1170_ = ((i_1168_ & 0xff00ff) + (rgba & 0xff00ff));
								i_1168_ = ((i_1169_ - i_1170_ & 0x10000) + (i_1170_ & 0x1000100));
								this.anIntArray7967[i_1167_] = i_1169_ - i_1168_ | i_1168_ - (i_1168_ >>> 8);
							}
							startY += i_1159_;
						}
					} else
						throw new IllegalArgumentException();
				} else {
					startX <<= 16;
					startX += 32768;
					endX <<= 16;
					int i_1171_ = (int) Math.floor(0.5 + ((double) endX / (double) endY));
					endY += startY;
					if (startY < this.anInt7976 * -1278653805) {
						startX += (this.anInt7976 * -1278653805 - startY) * i_1171_;
						startY = this.anInt7976 * -1278653805;
					}
					if (endY >= 63686679 * this.anInt7977)
						endY = this.anInt7977 * 63686679 - 1;
					int i_1172_ = rgba >>> 24;
					if (mode == 0 || mode == 1 && i_1172_ == 255) {
						for (/**/; startY <= endY; startY++) {
							int i_1173_ = startX >> 16;
							if (i_1173_ >= (this.anInt7974 * -912871679) && i_1173_ < (this.anInt7991 * -1416794725))
								this.anIntArray7967[(this.width * 692106883 * startY) + i_1173_] = rgba;
							startX += i_1171_;
						}
					} else if (1 == mode) {
						rgba = (((rgba & 0xff00ff) * i_1172_ >> 8 & 0xff00ff) + ((rgba & 0xff00) * i_1172_ >> 8 & 0xff00) + (i_1172_ << 24));
						int i_1174_ = 256 - i_1172_;
						for (/**/; startY <= endY; startY++) {
							int i_1175_ = startX >> 16;
							if (i_1175_ >= (-912871679 * this.anInt7974) && i_1175_ < -1416794725 * this.anInt7991) {
								int i_1176_ = (i_1175_ + (692106883 * this.width * startY));
								int i_1177_ = (this.anIntArray7967[i_1176_]);
								i_1177_ = ((i_1174_ * (i_1177_ & 0xff00ff) >> 8 & 0xff00ff) + (i_1174_ * (i_1177_ & 0xff00) >> 8 & 0xff00));
								this.anIntArray7967[i_1175_ + startY * (692106883 * this.width)] = rgba + i_1177_;
							}
							startX += i_1171_;
						}
					} else if (2 == mode) {
						for (/**/; startY <= endY; startY++) {
							int i_1178_ = startX >> 16;
							if (i_1178_ >= (this.anInt7974 * -912871679) && i_1178_ < (this.anInt7991 * -1416794725)) {
								int i_1179_ = (i_1178_ + (startY * (this.width * 692106883)));
								int i_1180_ = (this.anIntArray7967[i_1179_]);
								int i_1181_ = rgba + i_1180_;
								int i_1182_ = ((i_1180_ & 0xff00ff) + (rgba & 0xff00ff));
								i_1180_ = ((i_1181_ - i_1182_ & 0x10000) + (i_1182_ & 0x1000100));
								this.anIntArray7967[i_1179_] = i_1181_ - i_1180_ | i_1180_ - (i_1180_ >>> 8);
							}
							startX += i_1171_;
						}
					} else
						throw new IllegalArgumentException();
				}
			}
		}
	}

	int method5214(int i) {
		return (textures.method174(i).anInt528 * -2138060883);
	}

	public Matrix43f method5044() {
		return new Matrix43f(this.aClass222_7984);
	}

	void method5215(int i, int i_1234_, int i_1235_, int i_1236_, int i_1237_, int i_1238_, int i_1239_, int i_1240_) {
		if (null != this.anIntArray7967 && (i >= this.anInt7974 * -912871679 && i < -1416794725 * this.anInt7991)) {
			int i_1241_ = this.width * 692106883 * i_1234_ + i;
			int i_1242_ = i_1236_ >>> 24;
			int i_1243_ = i_1239_ + i_1238_;
			int i_1244_ = i_1240_ % i_1243_;
			if (0 == i_1237_ || 1 == i_1237_ && 255 == i_1242_) {
				int i_1245_ = 0;
				while (i_1245_ < i_1235_) {
					if ((i_1245_ + i_1234_ >= -1278653805 * this.anInt7976) && (i_1234_ + i_1245_ < this.anInt7977 * 63686679) && i_1244_ < i_1238_)
						this.anIntArray7967[(i_1245_ * (692106883 * this.width) + i_1241_)] = i_1236_;
					i_1245_++;
					i_1244_ = ++i_1244_ % i_1243_;
				}
			} else if (1 == i_1237_) {
				i_1236_ = ((i_1242_ * (i_1236_ & 0xff00) >> 8 & 0xff00) + ((i_1236_ & 0xff00ff) * i_1242_ >> 8 & 0xff00ff) + (i_1242_ << 24));
				int i_1246_ = 256 - i_1242_;
				int i_1247_ = 0;
				while (i_1247_ < i_1235_) {
					if ((i_1247_ + i_1234_ >= this.anInt7976 * -1278653805) && (i_1247_ + i_1234_ < 63686679 * this.anInt7977) && i_1244_ < i_1238_) {
						int i_1248_ = (i_1247_ * (692106883 * this.width) + i_1241_);
						int i_1249_ = this.anIntArray7967[i_1248_];
						i_1249_ = (((i_1249_ & 0xff00ff) * i_1246_ >> 8 & 0xff00ff) + ((i_1249_ & 0xff00) * i_1246_ >> 8 & 0xff00));
						this.anIntArray7967[i_1248_] = i_1236_ + i_1249_;
					}
					i_1247_++;
					i_1244_ = ++i_1244_ % i_1243_;
				}
			} else if (i_1237_ == 2) {
				int i_1250_ = 0;
				while (i_1250_ < i_1235_) {
					if ((i_1250_ + i_1234_ >= this.anInt7976 * -1278653805) && (i_1234_ + i_1250_ < this.anInt7977 * 63686679) && i_1244_ < i_1238_) {
						int i_1251_ = (i_1250_ * (this.width * 692106883) + i_1241_);
						int i_1252_ = this.anIntArray7967[i_1251_];
						int i_1253_ = i_1236_ + i_1252_;
						int i_1254_ = (i_1252_ & 0xff00ff) + (i_1236_ & 0xff00ff);
						i_1252_ = (i_1254_ & 0x1000100) + (i_1253_ - i_1254_ & 0x10000);
						this.anIntArray7967[i_1251_] = i_1253_ - i_1252_ | i_1252_ - (i_1252_ >>> 8);
					}
					i_1250_++;
					i_1244_ = ++i_1244_ % i_1243_;
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	public void constrainClip(int x, int y, int width, int height) {
		if (-912871679 * this.anInt7974 < x)
			this.anInt7974 = x * -1291169535;
		if (this.anInt7976 * -1278653805 < y)
			this.anInt7976 = y * 104031131;
		if (this.anInt7991 * -1416794725 > width)
			this.anInt7991 = width * -1912131437;
		if (63686679 * this.anInt7977 > height)
			this.anInt7977 = height * 1656090535;
		method5209();
	}

	void method5217(int i, int i_1275_, int i_1276_, int i_1277_, int i_1278_, int i_1279_, int i_1280_, int i_1281_) {
		if (this.anIntArray7967 != null && (i_1275_ >= this.anInt7976 * -1278653805 && i_1275_ < 63686679 * this.anInt7977)) {
			int i_1282_ = i_1275_ * (692106883 * this.width) + i;
			int i_1283_ = i_1277_ >>> 24;
			int i_1284_ = i_1280_ + i_1279_;
			int i_1285_ = i_1281_ % i_1284_;
			if (0 == i_1278_ || i_1278_ == 1 && 255 == i_1283_) {
				int i_1286_ = 0;
				while (i_1286_ < i_1276_) {
					if ((i_1286_ + i >= -912871679 * this.anInt7974) && (i_1286_ + i < -1416794725 * this.anInt7991) && i_1285_ < i_1279_)
						this.anIntArray7967[(i_1286_ + i_1282_)] = i_1277_;
					i_1286_++;
					i_1285_ = ++i_1285_ % i_1284_;
				}
			} else if (1 == i_1278_) {
				i_1277_ = ((i_1283_ << 24) + (((i_1277_ & 0xff00ff) * i_1283_ >> 8 & 0xff00ff) + ((i_1277_ & 0xff00) * i_1283_ >> 8 & 0xff00)));
				int i_1287_ = 256 - i_1283_;
				int i_1288_ = 0;
				while (i_1288_ < i_1276_) {
					if ((i_1288_ + i >= -912871679 * this.anInt7974) && (i_1288_ + i < -1416794725 * this.anInt7991) && i_1285_ < i_1279_) {
						int i_1289_ = (this.anIntArray7967[i_1282_ + i_1288_]);
						i_1289_ = (((i_1289_ & 0xff00ff) * i_1287_ >> 8 & 0xff00ff) + (i_1287_ * (i_1289_ & 0xff00) >> 8 & 0xff00));
						this.anIntArray7967[(i_1282_ + i_1288_)] = i_1277_ + i_1289_;
					}
					i_1288_++;
					i_1285_ = ++i_1285_ % i_1284_;
				}
			} else if (i_1278_ == 2) {
				int i_1290_ = 0;
				while (i_1290_ < i_1276_) {
					if ((i + i_1290_ >= -912871679 * this.anInt7974) && (i_1290_ + i < -1416794725 * this.anInt7991) && i_1285_ < i_1279_) {
						int i_1291_ = (this.anIntArray7967[i_1282_ + i_1290_]);
						int i_1292_ = i_1277_ + i_1291_;
						int i_1293_ = (i_1277_ & 0xff00ff) + (i_1291_ & 0xff00ff);
						i_1291_ = (i_1292_ - i_1293_ & 0x10000) + (i_1293_ & 0x1000100);
						this.anIntArray7967[(i_1282_ + i_1290_)] = i_1292_ - i_1291_ | i_1291_ - (i_1291_ >>> 8);
					}
					i_1290_++;
					i_1285_ = ++i_1285_ % i_1284_;
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	public Interface8_Impl1_Impl2 method5186(int i, int i_1294_) {
		return new Class12(i, i_1294_);
	}

	public int za() {
		return 0;
	}

	public boolean method5159() {
		return false;
	}

	public void method5169(int i) {
		DirectXModelToolkit.anInt7787 = DirectXModelToolkit.anInt7810 = i;
		if (-922307687 * this.anInt7999 > 1)
			throw new IllegalStateException();
		method5210(this.anInt7999 * -922307687);
		method5201(0);
	}

	public ModelToolkit creatModelToolkit(BaseModel class64, int i, int i_1311_, int i_1312_, int i_1313_) {
		return new DirectXModelToolkit(this, class64, i, i_1312_, i_1313_, i_1311_);
	}

	public SpriteToolkit bu(int[] is, int i, int i_1314_, int i_1315_, int i_1316_, boolean bool) {
		boolean bool_1317_ = false;
		int i_1318_ = i;
		while_120_: for (int i_1319_ = 0; i_1319_ < i_1316_; i_1319_++) {
			for (int i_1320_ = 0; i_1320_ < i_1315_; i_1320_++) {
				int i_1321_ = is[i_1318_++] >>> 24;
				if (i_1321_ != 0 && 255 != i_1321_) {
					bool_1317_ = true;
					break while_120_;
				}
			}
		}
		if (bool_1317_)
			return new Class57_Sub1_Sub1(this, is, i, i_1314_, i_1315_, i_1316_, bool);
		return new Class57_Sub1_Sub2(this, is, i, i_1314_, i_1315_, i_1316_, bool);
	}

	public FrameBufferContext method5094() {
		return new Class52_Sub1_Sub1(this);
	}

	public boolean method5074() {
		return false;
	}

	public int method5025(int i, int i_1386_, int i_1387_, int i_1388_, int i_1389_, int i_1390_) {
		int i_1391_ = 0;
		float f = ((float) i_1387_ * (this.aMatrix4f_7987.aFloatArray2594[10]) + ((this.aMatrix4f_7987.aFloatArray2594[6] * (float) i_1386_) + ((float) i * (this.aMatrix4f_7987.aFloatArray2594[2]) + (this.aMatrix4f_7987.aFloatArray2594[14]))));
		float f_1392_ = (((float) i_1390_ * this.aMatrix4f_7987.aFloatArray2594[10]) + ((this.aMatrix4f_7987.aFloatArray2594[6] * (float) i_1389_) + (this.aMatrix4f_7987.aFloatArray2594[14] + (float) i_1388_ * (this.aMatrix4f_7987.aFloatArray2594[2]))));
		float f_1393_ = (((float) i * this.aMatrix4f_7987.aFloatArray2594[3]) + this.aMatrix4f_7987.aFloatArray2594[15] + (this.aMatrix4f_7987.aFloatArray2594[7] * (float) i_1386_) + (float) i_1387_ * (this.aMatrix4f_7987.aFloatArray2594[11]));
		float f_1394_ = (((float) i_1388_ * this.aMatrix4f_7987.aFloatArray2594[3]) + this.aMatrix4f_7987.aFloatArray2594[15] + (this.aMatrix4f_7987.aFloatArray2594[7] * (float) i_1389_) + (this.aMatrix4f_7987.aFloatArray2594[11] * (float) i_1390_));
		if (f < -f_1393_ && f_1392_ < -f_1394_)
			i_1391_ |= 0x10;
		else if (f > f_1393_ && f_1392_ > f_1394_)
			i_1391_ |= 0x20;
		float f_1395_ = ((this.aMatrix4f_7987.aFloatArray2594[4] * (float) i_1386_) + (this.aMatrix4f_7987.aFloatArray2594[12] + (this.aMatrix4f_7987.aFloatArray2594[0] * (float) i)) + (this.aMatrix4f_7987.aFloatArray2594[8] * (float) i_1387_));
		float f_1396_ = ((this.aMatrix4f_7987.aFloatArray2594[8] * (float) i_1390_) + (((float) i_1388_ * this.aMatrix4f_7987.aFloatArray2594[0]) + this.aMatrix4f_7987.aFloatArray2594[12] + (this.aMatrix4f_7987.aFloatArray2594[4] * (float) i_1389_)));
		if (f_1395_ < -f_1393_ && f_1396_ < -f_1394_)
			i_1391_ |= 0x1;
		if (f_1395_ > f_1393_ && f_1396_ > f_1394_)
			i_1391_ |= 0x2;
		float f_1397_ = (((float) i_1386_ * this.aMatrix4f_7987.aFloatArray2594[5]) + ((this.aMatrix4f_7987.aFloatArray2594[1] * (float) i) + this.aMatrix4f_7987.aFloatArray2594[13]) + (this.aMatrix4f_7987.aFloatArray2594[9] * (float) i_1387_));
		float f_1398_ = (((float) i_1388_ * this.aMatrix4f_7987.aFloatArray2594[1]) + this.aMatrix4f_7987.aFloatArray2594[13] + ((float) i_1389_ * this.aMatrix4f_7987.aFloatArray2594[5]) + (this.aMatrix4f_7987.aFloatArray2594[9] * (float) i_1390_));
		if (f_1397_ < -f_1393_ && f_1398_ < -f_1394_)
			i_1391_ |= 0x4;
		if (f_1397_ > f_1393_ && f_1398_ > f_1394_)
			i_1391_ |= 0x8;
		return i_1391_;
	}

	public void drawFog(int color, int intensity, int i_1400_) {
		for (int i_1401_ = 0; i_1401_ < this.aClass15Array8001.length; i_1401_++) {
			Class15 class15 = this.aClass15Array8001[i_1401_];
			class15.anInt184 = 1903335279 * (color & 0xffffff);
			int i_1402_ = 688695183 * class15.anInt184 >>> 16 & 0xff;
			if (i_1402_ < 2)
				i_1402_ = 2;
			int i_1403_ = 688695183 * class15.anInt184 >> 8 & 0xff;
			if (i_1403_ < 2)
				i_1403_ = 2;
			int i_1404_ = class15.anInt184 * 688695183 & 0xff;
			if (i_1404_ < 2)
				i_1404_ = 2;
			class15.anInt184 = (i_1402_ << 16 | i_1403_ << 8 | i_1404_) * 1903335279;
			class15.aBoolean216 = intensity >= 0;
		}
	}

	public SpriteToolkit createSpriteToolkit(Sprite sprite, boolean loaded) {
		int[] is = sprite.palette;
		byte[] is_1416_ = sprite.raster;
		int i = sprite.width;
		int i_1417_ = sprite.height;
		Class57_Sub1 class57_sub1;
		if (loaded && null == sprite.alpha) {
			int[] is_1418_ = new int[is.length];
			byte[] is_1419_ = new byte[i_1417_ * i];
			for (int i_1420_ = 0; i_1420_ < i_1417_; i_1420_++) {
				int i_1421_ = i_1420_ * i;
				for (int i_1422_ = 0; i_1422_ < i; i_1422_++)
					is_1419_[i_1421_ + i_1422_] = is_1416_[i_1422_ + i_1421_];
			}
			for (int i_1423_ = 0; i_1423_ < is.length; i_1423_++)
				is_1418_[i_1423_] = is[i_1423_];
			class57_sub1 = new Class57_Sub1_Sub3(this, is_1419_, is_1418_, i, i_1417_);
		} else {
			int[] is_1424_ = new int[i_1417_ * i];
			byte[] is_1425_ = sprite.alpha;
			if (is_1425_ != null) {
				for (int i_1426_ = 0; i_1426_ < i_1417_; i_1426_++) {
					int i_1427_ = i * i_1426_;
					for (int i_1428_ = 0; i_1428_ < i; i_1428_++)
						is_1424_[i_1427_ + i_1428_] = (is[is_1416_[i_1427_ + i_1428_] & 0xff] | is_1425_[i_1428_ + i_1427_] << 24);
				}
				class57_sub1 = new Class57_Sub1_Sub1(this, is_1424_, i, i_1417_);
			} else {
				for (int i_1429_ = 0; i_1429_ < i_1417_; i_1429_++) {
					int i_1430_ = i_1429_ * i;
					for (int i_1431_ = 0; i_1431_ < i; i_1431_++) {
						int i_1432_ = is[is_1416_[i_1431_ + i_1430_] & 0xff];
						is_1424_[i_1430_ + i_1431_] = 0 != i_1432_ ? ~0xffffff | i_1432_ : 0;
					}
				}
				class57_sub1 = new Class57_Sub1_Sub2(this, is_1424_, i, i_1417_);
			}
		}
		class57_sub1.method621(sprite.offsetX, sprite.offsetY, sprite.deltaWidth, sprite.deltaHeight);
		return class57_sub1;
	}

	public SpriteToolkit method5029(int i, int i_1433_, boolean bool, boolean bool_1434_) {
		if (bool)
			return new Class57_Sub1_Sub1(this, i, i_1433_);
		return new Class57_Sub1_Sub2(this, i, i_1433_);
	}

	public EnvironmentMap createEnvironmentMap(int i, int i_1448_, int i_1449_, int i_1450_, int i_1451_, int i_1452_) {
		return null;
	}

	public int method5017(int i, int i_1453_) {
		i |= 0x20800;
		return i & i_1453_ ^ i_1453_;
	}

	JavaGraphicsToolkit(Canvas canvas, MaterialRawLoader interface_ma, int i, int i_1460_) {
		this(interface_ma);
		try {
			attach(canvas, i, i_1460_);
			method5003(canvas);
		} catch (Throwable throwable) {
			throwable.printStackTrace();
			destroy();
			throw new RuntimeException("");
		}
	}

	void method5219(boolean bool, int i, int i_1529_, float f, int i_1530_, int i_1531_, int i_1532_) {
		if (null != this.anIntArray7967) {
			if (i_1530_ < 0)
				i_1530_ = -i_1530_;
			int i_1533_ = i_1529_ - i_1530_;
			if (i_1533_ < -1278653805 * this.anInt7976)
				i_1533_ = -1278653805 * this.anInt7976;
			int i_1534_ = 1 + (i_1530_ + i_1529_);
			if (i_1534_ > 63686679 * this.anInt7977)
				i_1534_ = 63686679 * this.anInt7977;
			int i_1535_ = i_1533_;
			int i_1536_ = i_1530_ * i_1530_;
			int i_1537_ = 0;
			int i_1538_ = i_1529_ - i_1535_;
			int i_1539_ = i_1538_ * i_1538_;
			int i_1540_ = i_1539_ - i_1538_;
			if (i_1529_ > i_1534_)
				i_1529_ = i_1534_;
			int i_1541_ = i_1531_ >>> 24;
			if (i_1532_ == 0 || 1 == i_1532_ && 255 == i_1541_) {
				while (i_1535_ < i_1529_) {
					for (/**/; i_1540_ <= i_1536_ || i_1539_ <= i_1536_; i_1540_ += i_1537_++ + i_1537_)
						i_1539_ += i_1537_ + i_1537_;
					int i_1542_ = 1 + (i - i_1537_);
					if (i_1542_ < this.anInt7974 * -912871679)
						i_1542_ = this.anInt7974 * -912871679;
					int i_1543_ = i_1537_ + i;
					if (i_1543_ > this.anInt7991 * -1416794725)
						i_1543_ = -1416794725 * this.anInt7991;
					int i_1544_ = (i_1535_ * (692106883 * this.width) + i_1542_);
					for (int i_1545_ = i_1542_; i_1545_ < i_1543_; i_1545_++) {
						if (!bool || f < (this.aFloatArray7973[i_1544_]))
							this.anIntArray7967[i_1544_] = i_1531_;
						i_1544_++;
					}
					i_1535_++;
					i_1539_ -= i_1538_-- + i_1538_;
					i_1540_ -= i_1538_ + i_1538_;
				}
				i_1537_ = i_1530_;
				i_1538_ = i_1535_ - i_1529_;
				i_1540_ = i_1538_ * i_1538_ + i_1536_;
				i_1539_ = i_1540_ - i_1537_;
				i_1540_ -= i_1538_;
				while (i_1535_ < i_1534_) {
					for (/**/; i_1540_ > i_1536_ && i_1539_ > i_1536_; i_1539_ -= i_1537_ + i_1537_)
						i_1540_ -= i_1537_-- + i_1537_;
					int i_1546_ = i - i_1537_;
					if (i_1546_ < this.anInt7974 * -912871679)
						i_1546_ = -912871679 * this.anInt7974;
					int i_1547_ = i + i_1537_;
					if (i_1547_ > -1416794725 * this.anInt7991 - 1)
						i_1547_ = (this.anInt7991 * -1416794725 - 1);
					int i_1548_ = (i_1546_ + i_1535_ * (692106883 * this.width));
					for (int i_1549_ = i_1546_; i_1549_ <= i_1547_; i_1549_++) {
						if (!bool || f < (this.aFloatArray7973[i_1548_]))
							this.anIntArray7967[i_1548_] = i_1531_;
						i_1548_++;
					}
					i_1535_++;
					i_1540_ += i_1538_ + i_1538_;
					i_1539_ += i_1538_++ + i_1538_;
				}
			} else if (1 == i_1532_) {
				i_1531_ = ((i_1541_ * (i_1531_ & 0xff00ff) >> 8 & 0xff00ff) + ((i_1531_ & 0xff00) * i_1541_ >> 8 & 0xff00) + (i_1541_ << 24));
				int i_1550_ = 256 - i_1541_;
				while (i_1535_ < i_1529_) {
					for (/**/; i_1540_ <= i_1536_ || i_1539_ <= i_1536_; i_1540_ += i_1537_++ + i_1537_)
						i_1539_ += i_1537_ + i_1537_;
					int i_1551_ = i - i_1537_ + 1;
					if (i_1551_ < -912871679 * this.anInt7974)
						i_1551_ = -912871679 * this.anInt7974;
					int i_1552_ = i + i_1537_;
					if (i_1552_ > this.anInt7991 * -1416794725)
						i_1552_ = -1416794725 * this.anInt7991;
					int i_1553_ = (i_1551_ + i_1535_ * (692106883 * this.width));
					for (int i_1554_ = i_1551_; i_1554_ < i_1552_; i_1554_++) {
						if (!bool || f < (this.aFloatArray7973[i_1553_])) {
							int i_1555_ = (this.anIntArray7967[i_1553_]);
							i_1555_ = (((i_1555_ & 0xff00) * i_1550_ >> 8 & 0xff00) + (i_1550_ * (i_1555_ & 0xff00ff) >> 8 & 0xff00ff));
							this.anIntArray7967[i_1553_] = i_1555_ + i_1531_;
						}
						i_1553_++;
					}
					i_1535_++;
					i_1539_ -= i_1538_-- + i_1538_;
					i_1540_ -= i_1538_ + i_1538_;
				}
				i_1537_ = i_1530_;
				i_1538_ = -i_1538_;
				i_1540_ = i_1538_ * i_1538_ + i_1536_;
				i_1539_ = i_1540_ - i_1537_;
				i_1540_ -= i_1538_;
				while (i_1535_ < i_1534_) {
					for (/**/; i_1540_ > i_1536_ && i_1539_ > i_1536_; i_1539_ -= i_1537_ + i_1537_)
						i_1540_ -= i_1537_-- + i_1537_;
					int i_1556_ = i - i_1537_;
					if (i_1556_ < -912871679 * this.anInt7974)
						i_1556_ = -912871679 * this.anInt7974;
					int i_1557_ = i_1537_ + i;
					if (i_1557_ > -1416794725 * this.anInt7991 - 1)
						i_1557_ = (-1416794725 * this.anInt7991 - 1);
					int i_1558_ = (i_1535_ * (692106883 * this.width) + i_1556_);
					for (int i_1559_ = i_1556_; i_1559_ <= i_1557_; i_1559_++) {
						if (!bool || f < (this.aFloatArray7973[i_1558_])) {
							int i_1560_ = (this.anIntArray7967[i_1558_]);
							i_1560_ = (((i_1560_ & 0xff00) * i_1550_ >> 8 & 0xff00) + (i_1550_ * (i_1560_ & 0xff00ff) >> 8 & 0xff00ff));
							this.anIntArray7967[i_1558_] = i_1560_ + i_1531_;
						}
						i_1558_++;
					}
					i_1535_++;
					i_1540_ += i_1538_ + i_1538_;
					i_1539_ += i_1538_++ + i_1538_;
				}
			} else if (2 == i_1532_) {
				while (i_1535_ < i_1529_) {
					for (/**/; i_1540_ <= i_1536_ || i_1539_ <= i_1536_; i_1540_ += i_1537_++ + i_1537_)
						i_1539_ += i_1537_ + i_1537_;
					int i_1561_ = i - i_1537_ + 1;
					if (i_1561_ < -912871679 * this.anInt7974)
						i_1561_ = -912871679 * this.anInt7974;
					int i_1562_ = i + i_1537_;
					if (i_1562_ > -1416794725 * this.anInt7991)
						i_1562_ = -1416794725 * this.anInt7991;
					int i_1563_ = i_1561_ + (this.width * 692106883 * i_1535_);
					for (int i_1564_ = i_1561_; i_1564_ < i_1562_; i_1564_++) {
						if (!bool || f < (this.aFloatArray7973[i_1563_])) {
							int i_1565_ = (this.anIntArray7967[i_1563_]);
							int i_1566_ = i_1565_ + i_1531_;
							int i_1567_ = (i_1565_ & 0xff00ff) + (i_1531_ & 0xff00ff);
							i_1565_ = (i_1567_ & 0x1000100) + (i_1566_ - i_1567_ & 0x10000);
							this.anIntArray7967[i_1563_] = i_1566_ - i_1565_ | i_1565_ - (i_1565_ >>> 8);
						}
						i_1563_++;
					}
					i_1535_++;
					i_1539_ -= i_1538_-- + i_1538_;
					i_1540_ -= i_1538_ + i_1538_;
				}
				i_1537_ = i_1530_;
				i_1538_ = -i_1538_;
				i_1540_ = i_1536_ + i_1538_ * i_1538_;
				i_1539_ = i_1540_ - i_1537_;
				i_1540_ -= i_1538_;
				while (i_1535_ < i_1534_) {
					for (/**/; i_1540_ > i_1536_ && i_1539_ > i_1536_; i_1539_ -= i_1537_ + i_1537_)
						i_1540_ -= i_1537_-- + i_1537_;
					int i_1568_ = i - i_1537_;
					if (i_1568_ < this.anInt7974 * -912871679)
						i_1568_ = -912871679 * this.anInt7974;
					int i_1569_ = i_1537_ + i;
					if (i_1569_ > this.anInt7991 * -1416794725 - 1)
						i_1569_ = (-1416794725 * this.anInt7991 - 1);
					int i_1570_ = ((this.width * 692106883 * i_1535_) + i_1568_);
					for (int i_1571_ = i_1568_; i_1571_ <= i_1569_; i_1571_++) {
						if (!bool || f < (this.aFloatArray7973[i_1570_])) {
							int i_1572_ = (this.anIntArray7967[i_1570_]);
							int i_1573_ = i_1572_ + i_1531_;
							int i_1574_ = (i_1531_ & 0xff00ff) + (i_1572_ & 0xff00ff);
							i_1572_ = (i_1574_ & 0x1000100) + (i_1573_ - i_1574_ & 0x10000);
							this.anIntArray7967[i_1570_] = i_1573_ - i_1572_ | i_1572_ - (i_1572_ >>> 8);
						}
						i_1570_++;
					}
					i_1535_++;
					i_1540_ += i_1538_ + i_1538_;
					i_1539_ += i_1538_++ + i_1538_;
				}
			} else
				throw new IllegalArgumentException();
		}
	}

}
