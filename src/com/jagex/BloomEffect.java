package com.jagex;/* Class150_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class BloomEffect extends BloomToolkit {
	public static float aFloat7011;
	public static float aFloat7012 = 0.25F;
	public static float aFloat7013 = 1.0F;
	ShaderProgram scale;
	public static float aFloat7015;
	Class123 program;
	ShaderProgramToolkit composite;
	ShaderProgramToolkit techDefault;
	ShaderProgramToolkit blur;
	ShaderProgram PosAndTexCoords;
	ShaderProgram sceneTexture;
	ShaderProgramToolkit fullscreen;
	ShaderProgram bloomTexture;
	ShaderProgram parameters;
	ShaderProgram sampleSize;
	ShaderProgramToolkit brightpass;
	boolean aBoolean7028;

	void method1622() {
		/* empty */
	}

	boolean method1635() {
		return (toolkit.aBoolean8349 && toolkit.method5483());
	}

	boolean method1617() {
		return this.aBoolean7028;
	}

	void method1630(int i, FrameBufferContext class52_sub1, Interface9_Impl2 interface9_impl2, Interface8_Impl1_Impl2 interface8_impl1_impl2, Interface9_Impl2 interface9_impl2_0_) {
		float f = toolkit.method5315();
		float f_1_ = (float) class52_sub1.getWidth();
		float f_2_ = (float) class52_sub1.getHeight();
		Interface9_Impl2 interface9_impl2_3_ = interface9_impl2;
		float[] verticies = { -1.0F, 1.0F, 0.0F, 0.0F, -1.0F, -3.0F, 0.0F, 2.0F, 3.0F, 1.0F, 2.0F, 0.0F };
		int i_4_ = (int) f_1_;
		int i_5_ = (int) f_2_;
		int i_6_ = i_4_;
		int i_7_ = i_5_;
		if (i == 0) {
			i_4_ = 256;
			i_5_ = 256;
			this.program.method1331(this.brightpass);
			this.program.method1340();
		} else if (i == 1) {
			i_4_ = 256;
			i_5_ = 256;
			i_6_ = i_4_;
			i_7_ = i_5_;
			this.program.method1331(this.blur);
			this.program.method1340();
			this.program.method1324(this.sampleSize, aFloat7015 / f_1_, 0.0F, 1650378474);
		} else if (i == 2) {
			i_4_ = 256;
			i_5_ = 256;
			i_6_ = i_4_;
			i_7_ = i_5_;
			this.program.method1331(this.blur);
			this.program.method1340();
			this.program.method1324(this.sampleSize, 0.0F, aFloat7015 / f_2_, 1292626481);
		} else if (i == 3) {
			this.program.method1331(this.composite);
			interface9_impl2_3_ = interface9_impl2_0_;
			this.program.method1341(this.bloomTexture, 1, interface9_impl2);
			this.program.method1340();
		}
		float f_8_ = (float) i_4_ / f_1_;
		float f_9_ = (float) i_5_ / f_2_;
		float f_10_ = (float) i_6_ / f_1_;
		float f_11_ = (float) i_7_ / f_2_;
		verticies[8] = (verticies[8] + 1.0F) * f_8_ - 1.0F;
		verticies[5] = (verticies[5] - 1.0F) * f_9_ + 1.0F;
		verticies[10] *= f_10_;
		verticies[7] *= f_11_;
		this.program.method1347(this.PosAndTexCoords, verticies);
		this.program.method1341(this.sceneTexture, 0, interface9_impl2_3_);
		this.program.glColor4f(this.parameters, aFloat7011, aFloat7012, aFloat7013, 0.0F);
		this.program.glColor4f(this.scale, f / f_1_, f / f_2_, 256.0F / f_1_, 256.0F / f_2_);
		toolkit.method5187(0, 0, i_4_, i_5_);
		toolkit.setClip(0, 0, i_4_, i_5_);
	}

	void method1621(int i, int i_12_) {
		/* empty */
	}

	int method1624() {
		return 4;
	}

	void method1633(int i, FrameBufferContext frameBuffer, Interface9_Impl2 interface9_impl2, Interface8_Impl1_Impl2 interface8_impl1_impl2, Interface9_Impl2 interface9_impl2_13_) {
		float f = toolkit.method5315();
		float frameHeight = (float) frameBuffer.getWidth();
		float frameWidth = (float) frameBuffer.getHeight();
		Interface9_Impl2 interface9_impl2_16_ = interface9_impl2;
		float[] verticies = { -1.0F, 1.0F, 0.0F, 0.0F, -1.0F, -3.0F, 0.0F, 2.0F, 3.0F, 1.0F, 2.0F, 0.0F };
		int height = (int) frameHeight;
		int width = (int) frameWidth;
		int newHeight = height;
		int newWidth = width;
		if (i == 0) {
			height = 256;
			width = 256;
			this.program.method1331(this.brightpass);
			this.program.method1340();
		} else if (i == 1) {
			height = 256;
			width = 256;
			newHeight = height;
			newWidth = width;
			this.program.method1331(this.blur);
			this.program.method1340();
			this.program.method1324(this.sampleSize, aFloat7015 / frameHeight, 0.0F, -1570489076);
		} else if (i == 2) {
			height = 256;
			width = 256;
			newHeight = height;
			newWidth = width;
			this.program.method1331(this.blur);
			this.program.method1340();
			this.program.method1324(this.sampleSize, 0.0F, aFloat7015 / frameWidth, 895542574);
		} else if (i == 3) {
			this.program.method1331(this.composite);
			interface9_impl2_16_ = interface9_impl2_13_;
			this.program.method1341(this.bloomTexture, 1, interface9_impl2);
			this.program.method1340();
		}
		float f_21_ = (float) height / frameHeight;
		float f_22_ = (float) width / frameWidth;
		float f_23_ = (float) newHeight / frameHeight;
		float f_24_ = (float) newWidth / frameWidth;
		verticies[8] = (verticies[8] + 1.0F) * f_21_ - 1.0F;
		verticies[5] = (verticies[5] - 1.0F) * f_22_ + 1.0F;
		verticies[10] *= f_23_;
		verticies[7] *= f_24_;
		this.program.method1347(this.PosAndTexCoords, verticies);
		this.program.method1341(this.sceneTexture, 0, interface9_impl2_16_);
		this.program.glColor4f(this.parameters, aFloat7011, aFloat7012, aFloat7013, 0.0F);
		this.program.glColor4f(this.scale, f / frameHeight, f / frameWidth, 256.0F / frameHeight, 256.0F / frameWidth);
		toolkit.method5187(0, 0, height, width);
		toolkit.setClip(0, 0, height, width);
	}

	void method1623(int i) {
		this.program.method1372();
	}

	void method1629(int i, int i_25_) {
		/* empty */
	}

	boolean method1618() {
		if (method1635()) {
			this.program = toolkit.method5297("FilterBloom");
			if (this.program == null)
				return false;
			try {
				this.sceneTexture = this.program.method1360("sceneTex");
				this.bloomTexture = this.program.method1360("bloomTex1");
				this.parameters = this.program.method1360("params");
				this.sampleSize = this.program.method1360("sampleSize");
				this.scale = this.program.method1360("pixelOffsetAndBloomScale");
				this.PosAndTexCoords = this.program.method1360("PosAndTexCoords");
				this.program.method1327("test");
				this.fullscreen = this.program.method1327("techFullscreenTri");
				this.brightpass = this.program.method1327("brightpass");
				this.blur = this.program.method1327("blur");
				this.composite = this.program.method1327("composite");
				this.techDefault = this.program.method1327("techDefault");
			} catch (Exception_Sub2_Sub1 exception_sub2_sub1) {
				return false;
			} catch (Exception_Sub2_Sub2 exception_sub2_sub2) {
				return false;
			}
			if (!this.fullscreen.method1221())
				return false;
			if (!this.brightpass.method1221())
				return false;
			if (!this.blur.method1221())
				return false;
			if (!this.composite.method1221())
				return false;
			if (!this.techDefault.method1221())
				return false;
			this.aBoolean7028 = true;
			return true;
		}
		return false;
	}

	boolean method1628() {
		if (method1635()) {
			this.program = toolkit.method5297("FilterBloom");
			if (this.program == null)
				return false;
			try {
				this.sceneTexture = this.program.method1360("sceneTex");
				this.bloomTexture = this.program.method1360("bloomTex1");
				this.parameters = this.program.method1360("params");
				this.sampleSize = this.program.method1360("sampleSize");
				this.scale = this.program.method1360("pixelOffsetAndBloomScale");
				this.PosAndTexCoords = this.program.method1360("PosAndTexCoords");
				this.program.method1327("test");
				this.fullscreen = this.program.method1327("techFullscreenTri");
				this.brightpass = this.program.method1327("brightpass");
				this.blur = this.program.method1327("blur");
				this.composite = this.program.method1327("composite");
				this.techDefault = this.program.method1327("techDefault");
			} catch (Exception_Sub2_Sub1 exception_sub2_sub1) {
				return false;
			} catch (Exception_Sub2_Sub2 exception_sub2_sub2) {
				return false;
			}
			if (!this.fullscreen.method1221())
				return false;
			if (!this.brightpass.method1221())
				return false;
			if (!this.blur.method1221())
				return false;
			if (!this.composite.method1221())
				return false;
			if (!this.techDefault.method1221())
				return false;
			this.aBoolean7028 = true;
			return true;
		}
		return false;
	}

	int method1625() {
		return 1;
	}

	int method1636() {
		return 1;
	}

	void method1620() {
		/* empty */
	}

	void method1631(int i) {
		this.program.method1372();
	}

	void method1632(int i) {
		this.program.method1372();
	}

	int method1637() {
		return 1;
	}

	int method1638() {
		return 1;
	}

	public BloomEffect(NativeToolkit toolkit) {
		super(toolkit);
	}

	int method1639() {
		return 1;
	}

	int method1640() {
		return 4;
	}

	int method1641() {
		return 1;
	}

	boolean method1634() {
		return this.aBoolean7028;
	}

	static {
		aFloat7011 = 1.0F;
		aFloat7015 = 1.0F;
	}

	int method1642() {
		return 4;
	}
}
