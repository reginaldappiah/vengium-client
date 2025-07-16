package com.jagex;/* Class365_Sub1_Sub1_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.maths.Matrix43f;

public class Class365_Sub1_Sub1_Sub3 extends Class365_Sub1_Sub1 {
	int anInt10134;
	int anInt10135;
	Animator aAnimator_10136;
	ParticleSystem aParticleSystem_10137;
	boolean aBoolean10138;
	int anInt10139 = 0;

	void method4479(GraphicsToolkit graphicsToolkit, ModelToolkit class387, Matrix43f class222, byte i) {
			class387.method4463(class222);
			EmissiveTriangle[] emissiveTriangles = class387.method4464();
			EffectiveVertex[] effectiveVertices = class387.method4445();
			if ((null == this.aParticleSystem_10137 || (this.aParticleSystem_10137.aBoolean3992)) && (emissiveTriangles != null || effectiveVertices != null))
				this.aParticleSystem_10137 = ParticleSystem.getSystem(GameClient.clientTick * 443738891, true);
			if (null != this.aParticleSystem_10137) {
				this.aParticleSystem_10137.createObject(graphicsToolkit, (long) (443738891 * GameClient.clientTick), emissiveTriangles, effectiveVertices, false);
				this.aParticleSystem_10137.setPlane(plane);
			}
	}

	public void method4480(byte i) {
		try {
			if (this.aParticleSystem_10137 != null)
				this.aParticleSystem_10137.method4221();
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("akr.k(").append(')').toString());
		}
	}

	public Class334 method4358(GraphicsToolkit graphicsToolkit) {
		try {
			return null;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("akr.bc(").append(')').toString());
		}
	}

	public Class365_Sub1_Sub1_Sub3(Region class331, int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, boolean bool) {
		super(class331, i_1_, i_2_, i_3_, i_4_, i_5_, i_6_, i_7_, i_8_, i_9_, false, (byte) 0);
		this.anInt10134 = 0;
		this.aBoolean10138 = true;
		this.anInt10135 = 1921334459 * i;
		this.anInt10139 = i_10_ * -1141067271;
		SpotType class398 = (SpotTypeLoader.loader.get(this.anInt10135 * -743331725));
		int i_11_ = 1505778629 * class398.animationID;
		if (i_11_ != -1) {
			this.aAnimator_10136 = new Animator_Sub2(this, false);
			int i_12_ = class398.aBoolean5215 ? 0 : 2;
			if (bool)
				i_12_ = 1;
			this.aAnimator_10136.method5824(i_11_, i_0_, i_12_, false);
		}
		method4362(1);
	}

	public final boolean method4481(byte i) {
		try {
			return (this.aAnimator_10136 != null && !this.aAnimator_10136.method5826());
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("akr.f(").append(')').toString());
		}
	}

	ModelToolkit method4482(GraphicsToolkit graphicsToolkit, int i, int graphicID) {
			SpotType spotType = SpotTypeLoader.loader.get(graphicID);
			FloorToolkit floorToolkit = aClass331_7722.aClass_xaArray3519[plane];
			FloorToolkit floorToolkit1 = (aByte7724 < 3 ? aClass331_7722.aClass_xaArray3519[1 + aByte7724] : null);
			Vector3f class217 = getWorldTransform().trans;
			return ((this.aAnimator_10136 != null && !this.aAnimator_10136.method5978()) ? spotType.method4918(graphicsToolkit, i, true, floorToolkit, floorToolkit1, (int) class217.x, (int) class217.y, (int) class217.z, (this.aAnimator_10136), (byte) 2) : spotType.method4918(graphicsToolkit, i, true, floorToolkit, floorToolkit1, (int) class217.x, (int) class217.y, (int) class217.z, null, (byte) 2));
	}

	void method4357(GraphicsToolkit class_ra, int i) {
		try {
			ModelToolkit class387 = method4482(class_ra, 0, (-743331725 * this.anInt10135));
			if (class387 != null)
				method4479(class_ra, class387, method4347(), (byte) -58);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("akr.bb(").append(')').toString());
		}
	}

	final void method4355(GraphicsToolkit graphicsToolkit, Class365_Sub1 class365_sub1, int i, int i_16_, int i_17_, boolean bool) {
		try {
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("akr.bk(").append(')').toString());
		}
	}

	boolean method4350(GraphicsToolkit class_ra, int i, int i_19_, byte i_20_) {
		try {
			return false;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("akr.bu(").append(')').toString());
		}
	}

	final boolean method4366() {
		try {
			return false;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("akr.bw(").append(')').toString());
		}
	}

	public final void method4483(int i, int i_21_) {
		try {
			if (this.aAnimator_10136 != null && !this.aAnimator_10136.method5978())
				this.aAnimator_10136.method5981(i);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("akr.a(").append(')').toString());
		}
	}

	final void method4398() {
		try {
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("akr.bq(").append(')').toString());
		}
	}

	public int method4361() {
		try {
			return 1112786493 * this.anInt10134;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("akr.bm(").append(')').toString());
		}
	}

	Class335 method4394(GraphicsToolkit graphicsToolkit) {
		try {
			ModelToolkit class387 = method4482(graphicsToolkit, 0x800 | (0 != (this.anInt10139) * -657768375 ? 5 : 0), (-743331725 * this.anInt10135));
			if (null == class387)
				return null;
			if (-657768375 * this.anInt10139 != 0)
				class387.f(1510098944 * this.anInt10139);
			Matrix43f class222 = method4347();
			method4479(graphicsToolkit, class387, class222, (byte) -52);
			Class335 class335 = StaticMethods.method818(false);
			class387.render(class222, aClass302_Sub1Array7726[0], 0);
			if (null != this.aParticleSystem_10137) {
				Class69 class69 = this.aParticleSystem_10137.method4229();
				graphicsToolkit.renderParticles(class69);
			}
			this.aBoolean10138 = class387.i();
			this.anInt10134 = class387.YA() * 2028765461;
			class387.n();
			return class335;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("akr.bo(").append(')').toString());
		}
	}

	boolean method4376() {
		try {
			return this.aBoolean10138;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("akr.be(").append(')').toString());
		}
	}

	public final boolean method4484(int i) {
		try {
			return (null == this.aAnimator_10136 || this.aAnimator_10136.method5978());
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("akr.b(").append(')').toString());
		}
	}

	boolean method4399() {
		try {
			return false;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("akr.bf(").append(')').toString());
		}
	}
}
