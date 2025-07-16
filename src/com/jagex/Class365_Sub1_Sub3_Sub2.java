package com.jagex;/* Class365_Sub1_Sub3_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.game.settings.SceneryShadowsSettings;
import com.jagex.maths.Matrix43f;

public class Class365_Sub1_Sub3_Sub2 extends Class365_Sub1_Sub3 implements SceneObject {
	Class334 aClass334_9922;
	ObjectDefinitionLoader aClass433_9923;
	Class_na aClass_na9924;
	ModelToolkit aClass387_9925;
	int anInt9926;
	byte aByte9927;
	byte aByte9928;
	boolean aBoolean9929;
	boolean aBoolean9930;
	boolean aBoolean9931;
	static String aString9932;
	static ResourceCache aResourceCache_9933;

	boolean method4399() {
		try {
			if (null != this.aClass387_9925)
				return !this.aClass387_9925.u();
			return true;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wq.bf(").append(')').toString());
		}
	}

	boolean method4376() {
		try {
			if (null != this.aClass387_9925)
				return this.aClass387_9925.i();
			return false;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wq.be(").append(')').toString());
		}
	}

	public int method4361() {
		try {
			return (this.aClass387_9925 != null ? this.aClass387_9925.YA() : 0);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wq.bm(").append(')').toString());
		}
	}

	ModelToolkit method4510(GraphicsToolkit class_ra, int i, int i_0_) {
		try {
			if (this.aClass387_9925 != null && class_ra.method5017(this.aClass387_9925.m(), i) == 0)
				return this.aClass387_9925;
			FontMetricsDefinitionLoader fontMetricsDefinitionLoader = method4511(class_ra, i, false, -1045378786);
			if (fontMetricsDefinitionLoader != null)
				return (ModelToolkit) fontMetricsDefinitionLoader.toolkit;
			return null;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wq.by(").append(')').toString());
		}
	}

	public void method37(GraphicsToolkit toolkit) {
		try {
			Object object = null;
			Class_na class_na;
			if (this.aClass_na9924 == null && this.aBoolean9931) {
				FontMetricsDefinitionLoader fontMetricsDefinitionLoader = method4511(toolkit, 262144, true, -1658395754);
				class_na = (Class_na) (null != fontMetricsDefinitionLoader ? fontMetricsDefinitionLoader.anObject5646 : null);
			} else {
				class_na = this.aClass_na9924;
				this.aClass_na9924 = null;
			}
			Vector3f class217 = getWorldTransform().trans;
			if (class_na != null)
				aClass331_7722.method4047(class_na, aByte7724, (int) class217.x, (int) class217.z, null, 1462465403);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wq.d(").append(')').toString());
		}
	}

	Class335 method4394(GraphicsToolkit graphicsToolkit) {
		try {
			if (this.aClass387_9925 == null)
				return null;
			Matrix43f class222 = graphicsToolkit.getTransformationMatrix();
			class222.copy(method4347());
			class222.translate((float) aShort9802, 0.0F, (float) aShort9803);
			Class335 class335 = StaticMethods.method818((this.aBoolean9930));
			this.aClass387_9925.render(class222, aClass302_Sub1Array7726[0], 0);
			return class335;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wq.bo(").append(')').toString());
		}
	}

	public int method30() {
		try {
			return this.aByte9928;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wq.b(").append(')').toString());
		}
	}

	boolean method4350(GraphicsToolkit class_ra, int i, int i_1_, byte i_2_) {
		try {
			ModelToolkit class387 = method4510(class_ra, 131072, 1991691041);
			if (class387 != null) {
				Matrix43f class222 = method4347();
				return class387.method4787(i, i_1_, class222, false, 0);
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wq.bu(").append(')').toString());
		}
	}

	public int getID() {
		try {
			return 2016845759 * this.anInt9926;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wq.a(").append(')').toString());
		}
	}

	public void method31() {
		try {
			if (null != this.aClass387_9925)
				this.aClass387_9925.method4784();
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wq.p(").append(')').toString());
		}
	}

	public boolean method39() {
		try {
			return this.aBoolean9931;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wq.i(").append(')').toString());
		}
	}

	public void method33(GraphicsToolkit toolkit) {
		try {
			Object object = null;
			Class_na class_na;
			if (null == this.aClass_na9924 && this.aBoolean9931) {
				FontMetricsDefinitionLoader fontMetricsDefinitionLoader = method4511(toolkit, 262144, true, 443427270);
				class_na = (Class_na) (fontMetricsDefinitionLoader != null ? fontMetricsDefinitionLoader.anObject5646 : null);
			} else {
				class_na = this.aClass_na9924;
				this.aClass_na9924 = null;
			}
			Vector3f class217 = getWorldTransform().trans;
			if (null != class_na)
				aClass331_7722.method4055(class_na, aByte7724, (int) class217.x, (int) class217.z, null, -1121841328);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wq.k(").append(')').toString());
		}
	}

	public int method29() {
		try {
			return this.aByte9927;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wq.f(").append(')').toString());
		}
	}

	public Class365_Sub1_Sub3_Sub2(Region class331, GraphicsToolkit class_ra, ObjectDefinitionLoader class433, ObjectDefinition class432, int i, int i_3_, int i_4_, int i_5_, int i_6_, boolean bool, int i_7_, int i_8_, int i_9_, int i_10_) {
		super(class331, i_4_, i_5_, i_6_, i, i_3_, i_7_, i_8_);
		this.aClass433_9923 = class433;
		this.anInt9926 = class432.objectID * 1469074669;
		this.aBoolean9929 = bool;
		this.aByte9928 = (byte) i_10_;
		this.aByte9927 = (byte) i_9_;
		this.aBoolean9930 = 0 != class432.anInt5382 * 1532834983 && !bool;
		this.aBoolean9931 = (class_ra.method5082() && class432.aBoolean5433 && !this.aBoolean9929 && SettingsManager.settingsManager.sceneryShadows.getValue() != SceneryShadowsSettings.NONE);
		int i_11_ = 2048;
		if (class432.aBoolean5441)
			i_11_ |= 0x80000;
		FontMetricsDefinitionLoader fontMetricsDefinitionLoader = method4511(class_ra, i_11_, this.aBoolean9931, -772904584);
		if (null != fontMetricsDefinitionLoader) {
			this.aClass387_9925 = (ModelToolkit) fontMetricsDefinitionLoader.toolkit;
			this.aClass_na9924 = (Class_na) fontMetricsDefinitionLoader.anObject5646;
			if (class432.aBoolean5441) {
				this.aClass387_9925 = this.aClass387_9925.method4755((byte) 0, i_11_, false);
				if (class432.aBoolean5441) {
					Class287 class287 = GameClient.myRegion.method2632();
					this.aClass387_9925.PA(1599271859 * class287.anInt3096, class287.anInt3097 * 1630923113, -1560648831 * class287.anInt3098, -57569897 * class287.anInt3099);
				}
			}
		}
		method4362(1);
	}

	public Class334 method4358(GraphicsToolkit graphicsToolkit) {
		try {
			Vector3f class217 = getWorldTransform().trans;
			if (this.aClass334_9922 == null)
				this.aClass334_9922 = Class472.method6063((int) class217.x, (int) class217.y, (int) class217.z, method4510(graphicsToolkit, 0, 1964135899));
			return this.aClass334_9922;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wq.bc(").append(')').toString());
		}
	}

	FontMetricsDefinitionLoader method4511(GraphicsToolkit class_ra, int i, boolean bool, int i_15_) {
		try {
			ObjectDefinition class432 = (this.aClass433_9923.get(2016845759 * this.anInt9926));
			FloorToolkit class_xa;
			FloorToolkit class_xa_16_;
			if (this.aBoolean9929) {
				class_xa = aClass331_7722.aClass_xaArray3521[aByte7724];
				class_xa_16_ = aClass331_7722.aClass_xaArray3519[0];
			} else {
				class_xa = aClass331_7722.aClass_xaArray3519[aByte7724];
				if (aByte7724 < 3)
					class_xa_16_ = aClass331_7722.aClass_xaArray3519[aByte7724 + 1];
				else
					class_xa_16_ = null;
			}
			Vector3f class217 = getWorldTransform().trans;
			return (class432.method5785(class_ra, i, this.aByte9927, this.aByte9928, class_xa, class_xa_16_, (int) class217.x, (int) class217.y, (int) class217.z, bool, null, -911505460));
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wq.bl(").append(')').toString());
		}
	}

	void method4357(GraphicsToolkit class_ra, int i) {
		try {
			/* empty */
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wq.bb(").append(')').toString());
		}
	}

	public static void method4512(int i) {
			Class423.aClass57_5356 = null;
			Class74.aClass57_700 = null;
			Class313.aClass57_3299 = null;
			ClassNotAnim.aClass57_6123 = null;
			Class82_Sub8.aClass57_6855 = null;
			Js5CacheWrite.aClass57_6062 = null;
			Class367.aClass57_4001 = null;
			OverlayDefinition.aClass57_4070 = null;
			Class65.aClass264_664 = null;
			StaticMethods.aClass505_2420 = null;
	}

	public static int[] method4513(int i, int i_17_, int i_18_, int i_19_, int i_20_, float f, boolean bool, int i_21_) {
		try {
			int[] is = new int[i];
			Class298_Sub32_Sub34 class298_sub32_sub34 = new Class298_Sub32_Sub34();
			class298_sub32_sub34.anInt9543 = -1333197873 * i_17_;
			class298_sub32_sub34.aBoolean9548 = bool;
			class298_sub32_sub34.anInt9546 = 1143174821 * i_18_;
			class298_sub32_sub34.anInt9545 = 2124139087 * i_19_;
			class298_sub32_sub34.anInt9547 = -1820512295 * i_20_;
			class298_sub32_sub34.anInt9544 = 52875281 * (int) (4096.0F * f);
			class298_sub32_sub34.method3133(-369839691);
			Class250.method2397(i, 1, (byte) 24);
			class298_sub32_sub34.method3356(0, is, -2040071008);
			return is;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wq.bf(").append(')').toString());
		}
	}

	static void method4514(int i, int i_22_, int i_23_, int i_24_, int i_25_, int i_26_, int i_27_) {
		try {
			int i_28_ = i_26_ + i_23_;
			int i_29_ = i_24_ - i_26_;
			for (int i_30_ = i_23_; i_30_ < i_28_; i_30_++)
				Class82_Sub22.method940((Class372_Sub3.anIntArrayArray4047[i_30_]), i, i_22_, i_25_);
			for (int i_31_ = i_24_; i_31_ > i_29_; i_31_--)
				Class82_Sub22.method940((Class372_Sub3.anIntArrayArray4047[i_31_]), i, i_22_, i_25_);
			int i_32_ = i + i_26_;
			int i_33_ = i_22_ - i_26_;
			for (int i_34_ = i_28_; i_34_ <= i_29_; i_34_++) {
				int[] is = Class372_Sub3.anIntArrayArray4047[i_34_];
				Class82_Sub22.method940(is, i, i_32_, i_25_);
				Class82_Sub22.method940(is, i_33_, i_22_, i_25_);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wq.posY(").append(')').toString());
		}
	}

}
