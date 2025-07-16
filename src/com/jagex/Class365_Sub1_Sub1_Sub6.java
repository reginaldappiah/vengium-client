package com.jagex;/* Class365_Sub1_Sub1_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.game.settings.SceneryShadowsSettings;
import com.jagex.maths.Matrix43f;
import com.jagex.utils.TimeUtils;

public class Class365_Sub1_Sub1_Sub6 extends Class365_Sub1_Sub1 implements SceneObject {
	ModelToolkit aClass387_9879;
	byte aByte9880;
	Class_na aClass_na9881;
	Class334 aClass334_9882;
	int anInt9883;
	ObjectDefinitionLoader aClass433_9884;
	byte aByte9885;
	boolean aBoolean9886;
	boolean aBoolean9887;
	boolean aBoolean9888;
	boolean aBoolean9889;

    public int method4361() {
		try {
			return (null != this.aClass387_9879 ? this.aClass387_9879.YA() : 0);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wf.bm(").append(')').toString());
		}
	}

	ModelToolkit method4491(GraphicsToolkit class_ra, int i, int i_0_) {
		try {
			if (this.aClass387_9879 != null && class_ra.method5017(this.aClass387_9879.m(), i) == 0)
				return this.aClass387_9879;
			FontMetricsDefinitionLoader fontMetricsDefinitionLoader = method4492(class_ra, i, false, -1828314772);
			if (fontMetricsDefinitionLoader != null)
				return (ModelToolkit) fontMetricsDefinitionLoader.toolkit;
			return null;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wf.bl(").append(')').toString());
		}
	}

	public Class334 method4358(GraphicsToolkit graphicsToolkit) {
		try {
			Vector3f class217 = getWorldTransform().trans;
			if (this.aClass334_9882 == null)
				this.aClass334_9882 = Class472.method6063((int) class217.x, (int) class217.y, (int) class217.z, method4491(graphicsToolkit, 0, 720922451));
			return this.aClass334_9882;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wf.bc(").append(')').toString());
		}
	}

	public int method29() {
		try {
			return this.aByte9880;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wf.f(").append(')').toString());
		}
	}

    boolean method4350(GraphicsToolkit class_ra, int i, int i_1_, byte i_2_) {
		try {
			ModelToolkit class387 = method4491(class_ra, 131072, -114494856);
			if (null != class387) {
				Matrix43f class222 = method4347();
				return class387.method4787(i, i_1_, class222, false, 0);
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wf.bu(").append(')').toString());
		}
	}

	boolean method4366() {
		try {
			return this.aBoolean9889;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wf.bw(").append(')').toString());
		}
	}

	void method4355(GraphicsToolkit graphicsToolkit, Class365_Sub1 class365_sub1, int i, int i_3_, int i_4_, boolean bool) {
		try {
			if (class365_sub1 instanceof Class365_Sub1_Sub5_Sub1) {
				Class365_Sub1_Sub5_Sub1 class365_sub1_sub5_sub1 = (Class365_Sub1_Sub5_Sub1) class365_sub1;
				if (null != this.aClass387_9879 && null != class365_sub1_sub5_sub1.modelToolkit)
					this.aClass387_9879.method4745((class365_sub1_sub5_sub1.modelToolkit), i, i_3_, i_4_, bool);
			} else if (class365_sub1 instanceof Class365_Sub1_Sub1_Sub6) {
				Class365_Sub1_Sub1_Sub6 class365_sub1_sub1_sub6_6_ = (Class365_Sub1_Sub1_Sub6) class365_sub1;
				if (this.aClass387_9879 != null && (class365_sub1_sub1_sub6_6_.aClass387_9879) != null)
					this.aClass387_9879.method4745(class365_sub1_sub1_sub6_6_.aClass387_9879, i, i_3_, i_4_, bool);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wf.bk(").append(')').toString());
		}
	}

	void method4398() {
		try {
			this.aBoolean9889 = false;
			if (null != this.aClass387_9879)
				this.aClass387_9879.KA(this.aClass387_9879.m() & ~0x10000);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wf.bq(").append(')').toString());
		}
	}

	public int method30() {
		try {
			return this.aByte9885;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wf.b(").append(')').toString());
		}
	}

	public void method31() {
		try {
			if (this.aClass387_9879 != null)
				this.aClass387_9879.method4784();
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wf.p(").append(')').toString());
		}
	}

	public boolean method39() {
		try {
			return this.aBoolean9887;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wf.i(").append(')').toString());
		}
	}

    void method4357(GraphicsToolkit class_ra, int i) {
		try {
			/* empty */
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wf.bb(").append(')').toString());
		}
	}

	Class335 method4394(GraphicsToolkit graphicsToolkit) {
		try {
			if (this.aClass387_9879 == null)
				return null;
			Matrix43f class222 = method4347();
			Class335 class335 = StaticMethods.method818((this.aBoolean9888));
			this.aClass387_9879.render(class222, aClass302_Sub1Array7726[0], 0);
			return class335;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wf.bo(").append(')').toString());
		}
	}

    public Class365_Sub1_Sub1_Sub6(Region class331, GraphicsToolkit graphicsGraphicsToolkit, ObjectDefinitionLoader class433, ObjectDefinition class432, int i, int i_7_, int i_8_, int i_9_, int i_10_, boolean bool, int i_11_, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_, boolean bool_17_) {
		super(class331, i, i_7_, i_8_, i_9_, i_10_, i_11_, i_12_, i_13_, i_14_, 512737201 * class432.anInt5409 == 1, Class79.method848(i_15_, i_16_, (byte) 27));
		this.aClass433_9884 = class433;
		this.anInt9883 = class432.objectID * 1514496897;
		aByte7724 = (byte) i_7_;
		this.aBoolean9886 = bool;
		this.aByte9880 = (byte) i_15_;
		this.aByte9885 = (byte) i_16_;
		this.aBoolean9888 = 0 != 1532834983 * class432.anInt5382 && !bool;
		this.aBoolean9889 = bool_17_;
		this.aBoolean9887 = (graphicsGraphicsToolkit.method5082() && class432.aBoolean5433 && !this.aBoolean9886 && SettingsManager.settingsManager.sceneryShadows.getValue() != SceneryShadowsSettings.NONE);
		int i_18_ = 2048;
		if (this.aBoolean9889)
			i_18_ |= 0x10000;
		if (class432.aBoolean5441)
			i_18_ |= 0x80000;
		FontMetricsDefinitionLoader fontMetricsDefinitionLoader = method4492(graphicsGraphicsToolkit, i_18_, this.aBoolean9887, -1835687018);
		if (null != fontMetricsDefinitionLoader) {
			this.aClass387_9879 = (ModelToolkit) fontMetricsDefinitionLoader.toolkit;
			this.aClass_na9881 = (Class_na) fontMetricsDefinitionLoader.anObject5646;
			if (this.aBoolean9889 || class432.aBoolean5441) {
				this.aClass387_9879 = this.aClass387_9879.method4755((byte) 0, i_18_, false);
				if (class432.aBoolean5441) {
					Class287 class287 = GameClient.myRegion.method2632();
					this.aClass387_9879.PA(1599271859 * class287.anInt3096, class287.anInt3097 * 1630923113, class287.anInt3098 * -1560648831, class287.anInt3099 * -57569897);
				}
			}
		}
		method4362(1);
	}

	FontMetricsDefinitionLoader method4492(GraphicsToolkit class_ra, int i, boolean bool, int i_19_) {
		try {
			ObjectDefinition class432 = (this.aClass433_9884.get(this.anInt9883 * 614847827));
			FloorToolkit class_xa;
			FloorToolkit class_xa_20_;
			if (this.aBoolean9886) {
				class_xa = aClass331_7722.aClass_xaArray3521[aByte7724];
				class_xa_20_ = aClass331_7722.aClass_xaArray3519[0];
			} else {
				class_xa = aClass331_7722.aClass_xaArray3519[aByte7724];
				if (aByte7724 < 3)
					class_xa_20_ = aClass331_7722.aClass_xaArray3519[1 + aByte7724];
				else
					class_xa_20_ = null;
			}
			Vector3f class217 = getWorldTransform().trans;
			return (class432.method5785(class_ra, i, ((this.aByte9880 != Class424.aClass424_6604.type * -1976050083) ? (int) this.aByte9880 : Class424.aClass424_6611.type * -1976050083), ((Class424.aClass424_6604.type * -1976050083 == this.aByte9880) ? this.aByte9885 + 4 : this.aByte9885), class_xa, class_xa_20_, (int) class217.x, (int) class217.y, (int) class217.z, bool, null, -920698887));
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wf.br(").append(')').toString());
		}
	}

	public int method4493(short i) {
		try {
			return (null != this.aClass387_9879 ? this.aClass387_9879.N() / 4 : 15);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wf.bz(").append(')').toString());
		}
	}

	public void method37(GraphicsToolkit toolkit) {
		try {
			Object object = null;
			Class_na class_na;
			if (null == this.aClass_na9881 && this.aBoolean9887) {
				FontMetricsDefinitionLoader fontMetricsDefinitionLoader = method4492(toolkit, 262144, true, -2139710295);
				class_na = (Class_na) (fontMetricsDefinitionLoader != null ? fontMetricsDefinitionLoader.anObject5646 : null);
			} else {
				class_na = this.aClass_na9881;
				this.aClass_na9881 = null;
			}
			Vector3f class217 = getWorldTransform().trans;
			if (class_na != null)
				aClass331_7722.method4047(class_na, aByte7724, (int) class217.x, (int) class217.z, null, 1871597287);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wf.d(").append(')').toString());
		}
	}

	boolean method4399() {
		try {
			if (null != this.aClass387_9879)
				return !this.aClass387_9879.u();
			return true;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wf.bf(").append(')').toString());
		}
	}

	boolean method4376() {
		try {
			if (null != this.aClass387_9879)
				return this.aClass387_9879.i();
			return false;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wf.be(").append(')').toString());
		}
	}

	public void method33(GraphicsToolkit toolkit) {
		try {
			Object object = null;
			Class_na class_na;
			if (null == this.aClass_na9881 && this.aBoolean9887) {
				FontMetricsDefinitionLoader fontMetricsDefinitionLoader = method4492(toolkit, 262144, true, -1616676956);
				class_na = (Class_na) (null != fontMetricsDefinitionLoader ? fontMetricsDefinitionLoader.anObject5646 : null);
			} else {
				class_na = this.aClass_na9881;
				this.aClass_na9881 = null;
			}
			Vector3f class217 = getWorldTransform().trans;
			if (null != class_na)
				aClass331_7722.method4055(class_na, aByte7724, (int) class217.x, (int) class217.z, null, -808327981);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wf.k(").append(')').toString());
		}
	}

    public int getID() {
		try {
			return 614847827 * this.anInt9883;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wf.a(").append(')').toString());
		}
	}

	static void updateMinimap(GraphicsToolkit toolkit) {
			if ((Player.myPlayer.plane != -1694437021 * Minimap.anInt57) && GameClient.myRegion.getRegion() != null) {
				TimeUtils.getTime();
				if (Minimap.drawMinimap(toolkit, (Player.myPlayer.plane)))
					Minimap.anInt57 = (Player.myPlayer.plane) * -955770805;
			}
	}
}
