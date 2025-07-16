package com.jagex;/* Class365_Sub1_Sub2_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.game.settings.SceneryShadowsSettings;
import com.jagex.maths.Matrix43f;

public class Class365_Sub1_Sub2_Sub2 extends Class365_Sub1_Sub2 implements SceneObject {
	boolean aBoolean9912;
	ModelToolkit aClass387_9913;
	Class_na aClass_na9914;
	int anInt9915;
	boolean aBoolean9916;
	byte aByte9917;
	ObjectDefinitionLoader aClass433_9918;
	boolean aBoolean9919;
	Class334 aClass334_9920;
	boolean aBoolean9921;

	public Class334 method4358(GraphicsToolkit graphicsToolkit) {
		try {
			Vector3f class217 = getWorldTransform().trans;
			if (this.aClass334_9920 == null)
				this.aClass334_9920 = Class472.method6063((int) class217.x, (int) class217.y, (int) class217.z, method4501(graphicsToolkit, 0, (byte) 68));
			return this.aClass334_9920;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wo.bc(").append(')').toString());
		}
	}

	public int method4361() {
		try {
			return (null != this.aClass387_9913 ? this.aClass387_9913.YA() : 0);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wo.bm(").append(')').toString());
		}
	}

	ModelToolkit method4501(GraphicsToolkit class_ra, int i, byte i_0_) {
		try {
			if (this.aClass387_9913 != null && class_ra.method5017(this.aClass387_9913.m(), i) == 0)
				return this.aClass387_9913;
			FontMetricsDefinitionLoader fontMetricsDefinitionLoader = method4502(class_ra, i, false, -1886813239);
			if (null != fontMetricsDefinitionLoader)
				return (ModelToolkit) fontMetricsDefinitionLoader.toolkit;
			return null;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wo.by(").append(')').toString());
		}
	}

	FontMetricsDefinitionLoader method4502(GraphicsToolkit class_ra, int i, boolean bool, int i_1_) {
		try {
			ObjectDefinition class432 = (this.aClass433_9918.get(2049836463 * this.anInt9915));
			FloorToolkit class_xa;
			FloorToolkit class_xa_2_;
			if (this.aBoolean9916) {
				class_xa = aClass331_7722.aClass_xaArray3521[aByte7724];
				class_xa_2_ = aClass331_7722.aClass_xaArray3519[0];
			} else {
				class_xa = aClass331_7722.aClass_xaArray3519[aByte7724];
				if (aByte7724 < 3)
					class_xa_2_ = aClass331_7722.aClass_xaArray3519[aByte7724 + 1];
				else
					class_xa_2_ = null;
			}
			Vector3f class217 = getWorldTransform().trans;
			return (class432.method5785(class_ra, i, Class424.aClass424_6610.type * -1976050083, this.aByte9917, class_xa, class_xa_2_, (int) class217.x, (int) class217.y, (int) class217.z, bool, null, -474476261));
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wo.bl(").append(')').toString());
		}
	}

    void method4357(GraphicsToolkit class_ra, int i) {
		try {
			/* empty */
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wo.bb(").append(')').toString());
		}
	}

	boolean method4350(GraphicsToolkit class_ra, int i, int i_3_, byte i_4_) {
		try {
			ModelToolkit class387 = method4501(class_ra, 131072, (byte) 22);
			if (null != class387) {
				Matrix43f class222 = method4347();
				return class387.method4787(i, i_3_, class222, false, 0);
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wo.bu(").append(')').toString());
		}
	}

	boolean method4366() {
		try {
			return this.aBoolean9912;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wo.bw(").append(')').toString());
		}
	}

	void method4355(GraphicsToolkit graphicsToolkit, Class365_Sub1 class365_sub1, int i, int i_5_, int i_6_, boolean bool) {
		try {
			if (class365_sub1 instanceof Class365_Sub1_Sub2_Sub2) {
				Class365_Sub1_Sub2_Sub2 class365_sub1_sub2_sub2_8_ = (Class365_Sub1_Sub2_Sub2) class365_sub1;
				if (this.aClass387_9913 != null && null != class365_sub1_sub2_sub2_8_.aClass387_9913)
					this.aClass387_9913.method4745(class365_sub1_sub2_sub2_8_.aClass387_9913, i, i_5_, i_6_, bool);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wo.bk(").append(')').toString());
		}
	}

	void method4398() {
		try {
			this.aBoolean9912 = false;
			if (this.aClass387_9913 != null)
				this.aClass387_9913.KA(this.aClass387_9913.m() & ~0x10000);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wo.bq(").append(')').toString());
		}
	}

	public int method29() {
		try {
			return Class424.aClass424_6610.type * -1976050083;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wo.f(").append(')').toString());
		}
	}

	public int method30() {
		try {
			return this.aByte9917;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wo.b(").append(')').toString());
		}
	}

	public void method31() {
		try {
			if (this.aClass387_9913 != null)
				this.aClass387_9913.method4784();
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wo.p(").append(')').toString());
		}
	}

	public boolean method39() {
		try {
			return this.aBoolean9921;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wo.i(").append(')').toString());
		}
	}

	public void method37(GraphicsToolkit toolkit) {
		try {
			Object object = null;
			Class_na class_na;
			if (this.aClass_na9914 == null && this.aBoolean9921) {
				FontMetricsDefinitionLoader fontMetricsDefinitionLoader = method4502(toolkit, 262144, true, -1850458180);
				class_na = (Class_na) (fontMetricsDefinitionLoader != null ? fontMetricsDefinitionLoader.anObject5646 : null);
			} else {
				class_na = this.aClass_na9914;
				this.aClass_na9914 = null;
			}
			Vector3f class217 = getWorldTransform().trans;
			if (class_na != null)
				aClass331_7722.method4047(class_na, aByte7724, (int) class217.x, (int) class217.z, null, 174451452);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wo.d(").append(')').toString());
		}
	}

    public Class365_Sub1_Sub2_Sub2(Region class331, GraphicsToolkit class_ra, ObjectDefinitionLoader class433, ObjectDefinition class432, int i, int i_9_, int i_10_, int i_11_, int i_12_, boolean bool, int i_13_, boolean bool_14_) {
		super(class331, i_10_, i_11_, i_12_, i, i_9_, class432.anInt5418 * -228547261);
		this.aClass433_9918 = class433;
		this.anInt9915 = 646380829 * class432.objectID;
		this.aBoolean9916 = bool;
		this.aByte9917 = (byte) i_13_;
		this.aBoolean9919 = class432.anInt5382 * 1532834983 != 0 && !bool;
		this.aBoolean9912 = bool_14_;
		this.aBoolean9921 = (class_ra.method5082() && class432.aBoolean5433 && !this.aBoolean9916 && SettingsManager.settingsManager.sceneryShadows.getValue() != SceneryShadowsSettings.NONE);
		int i_15_ = 2048;
		if (this.aBoolean9912)
			i_15_ |= 0x10000;
		if (class432.aBoolean5441)
			i_15_ |= 0x80000;
		FontMetricsDefinitionLoader fontMetricsDefinitionLoader = method4502(class_ra, i_15_, this.aBoolean9921, -2037171144);
		if (fontMetricsDefinitionLoader != null) {
			this.aClass387_9913 = (ModelToolkit) fontMetricsDefinitionLoader.toolkit;
			this.aClass_na9914 = (Class_na) fontMetricsDefinitionLoader.anObject5646;
			if (this.aBoolean9912 || class432.aBoolean5441) {
				this.aClass387_9913 = this.aClass387_9913.method4755((byte) 0, i_15_, false);
				if (class432.aBoolean5441) {
					Class287 class287 = GameClient.myRegion.method2632();
					this.aClass387_9913.PA(1599271859 * class287.anInt3096, class287.anInt3097 * 1630923113, -1560648831 * class287.anInt3098, -57569897 * class287.anInt3099);
				}
			}
		}
		method4362(1);
	}

    Class335 method4394(GraphicsToolkit graphicsToolkit) {
		try {
			if (this.aClass387_9913 == null)
				return null;
			Matrix43f class222 = method4347();
			Class335 class335 = StaticMethods.method818((this.aBoolean9919));
			this.aClass387_9913.render(class222, aClass302_Sub1Array7726[0], 0);
			return class335;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wo.bo(").append(')').toString());
		}
	}

	public void method33(GraphicsToolkit toolkit) {
		try {
			Object object = null;
			Class_na class_na;
			if (this.aClass_na9914 == null && this.aBoolean9921) {
				FontMetricsDefinitionLoader fontMetricsDefinitionLoader = method4502(toolkit, 262144, true, -2121821591);
				class_na = (Class_na) (fontMetricsDefinitionLoader != null ? fontMetricsDefinitionLoader.anObject5646 : null);
			} else {
				class_na = this.aClass_na9914;
				this.aClass_na9914 = null;
			}
			Vector3f class217 = getWorldTransform().trans;
			if (null != class_na)
				aClass331_7722.method4055(class_na, aByte7724, (int) class217.x, (int) class217.z, null, -412237236);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wo.k(").append(')').toString());
		}
	}

	public int getID() {
		try {
			return this.anInt9915 * 2049836463;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wo.a(").append(')').toString());
		}
	}

	boolean method4376() {
		try {
			if (null != this.aClass387_9913)
				return this.aClass387_9913.i();
			return false;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wo.be(").append(')').toString());
		}
	}

	boolean method4399() {
		try {
			if (null != this.aClass387_9913)
				return !this.aClass387_9913.u();
			return true;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wo.bf(").append(')').toString());
		}
	}

	static final void method4503(ScriptRuntime class403, int i) {
		try {
			int i_25_ = (class403.integerstack[class403.integerPos * 1883543357]);
			int i_26_ = (class403.integerStack[((class403.integerStackOffset -= -391880689) * 681479919)]);
			if (i_26_ < 0 || i_26_ >= class403.arrayLengths[i_25_])
				throw new RuntimeException();
			class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919 - 1)] = class403.arrays[i_25_][i_26_];
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wo.au(").append(')').toString());
		}
	}
}
