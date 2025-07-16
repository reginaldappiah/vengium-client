package com.jagex;/* Class365_Sub1_Sub1_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.maths.Matrix43f;

public class Class365_Sub1_Sub1_Sub5 extends Class365_Sub1_Sub1 implements SceneObject {
	boolean aBoolean9875;
	boolean aBoolean9876 = true;
	Class334 aClass334_9877;
	public Class60 aClass60_9878;

    boolean method4376() {
		try {
			return this.aBoolean9876;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wb.be(").append(')').toString());
		}
	}

	public int method4485() {
		return aClass60_9878.method699();
	}

	public Class334 method4358(GraphicsToolkit graphicsToolkit) {
		try {
			return this.aClass334_9877;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wb.bc(").append(')').toString());
		}
	}

	public int method4363() {
		try {
			return aClass60_9878.method699();
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wb.bx(").append(')').toString());
		}
	}

	Class335 method4394(GraphicsToolkit graphicsToolkit) {
		try {
			ModelToolkit class387 = aClass60_9878.method700(graphicsToolkit, 2048, false, true);
			if (class387 == null)
				return null;
			Matrix43f class222 = method4347();
			Class335 class335 = StaticMethods.method818((this.aBoolean9875));
			aClass60_9878.method701(graphicsToolkit, class387, class222, true);
			class387.render(class222, aClass302_Sub1Array7726[0], 0);
			if (null != aClass60_9878.aParticleSystem_602) {
				Class69 class69 = aClass60_9878.aParticleSystem_602.method4229();
				graphicsToolkit.renderParticles(class69);
			}
			this.aBoolean9876 = (class387.i() || null != aClass60_9878.aParticleSystem_602);
			Class235 class235 = getWorldTransform();
			if (this.aClass334_9877 == null)
				this.aClass334_9877 = Class472.method6063((int) (class235.trans.x), (int) (class235.trans.y), (int) (class235.trans.z), class387);
			else
				Class264_Sub2.method2507(this.aClass334_9877, (int) class235.trans.x, (int) class235.trans.y, (int) class235.trans.z, class387);
			return class335;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wb.bo(").append(')').toString());
		}
	}

	void method4357(GraphicsToolkit class_ra, int i) {
		try {
			ModelToolkit class387 = aClass60_9878.method700(class_ra, 262144, true, true);
			if (class387 != null)
				aClass60_9878.method701(class_ra, class387, method4347(), false);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wb.bb(").append(')').toString());
		}
	}

	public void method4486(Class435 class435) {
		try {
			aClass60_9878.method698(class435);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wb.bl(").append(')').toString());
		}
	}

	boolean method4350(GraphicsToolkit class_ra, int i, int i_0_, byte i_1_) {
		try {
			ModelToolkit class387 = aClass60_9878.method700(class_ra, 131072, false, false);
			if (class387 == null)
				return false;
			return class387.method4787(i, i_0_, method4347(), false, 0);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wb.bu(").append(')').toString());
		}
	}

	final boolean method4366() {
		try {
			return false;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wb.bw(").append(')').toString());
		}
	}

	public boolean method39() {
		try {
			return aClass60_9878.method706();
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wb.i(").append(')').toString());
		}
	}

	public int getID() {
		try {
			return 1686561661 * aClass60_9878.fileID;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wb.a(").append(')').toString());
		}
	}

	public int method29() {
		try {
			return -1598457753 * aClass60_9878.anInt589;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wb.f(").append(')').toString());
		}
	}

	public int method30() {
		try {
			return 748228569 * aClass60_9878.anInt590;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wb.b(").append(')').toString());
		}
	}

	public void method31() {
		try {
			/* empty */
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wb.p(").append(')').toString());
		}
	}

	public void method33(GraphicsToolkit toolkit) {
		try {
			aClass60_9878.method702(toolkit);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wb.k(").append(')').toString());
		}
	}

	public void method37(GraphicsToolkit toolkit) {
		try {
			aClass60_9878.method707();
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wb.d(").append(')').toString());
		}
	}

    public int method4487() {
		return aClass60_9878.method699();
	}

    boolean method4399() {
		try {
			return false;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wb.bf(").append(')').toString());
		}
	}

    public Class365_Sub1_Sub1_Sub5(Region class331, GraphicsToolkit class_ra, ObjectDefinitionLoader class433, ObjectDefinition class432, int i, int i_9_, int i_10_, int i_11_, int i_12_, boolean bool, int i_13_, int i_14_, int i_15_, int i_16_, int i_17_, int i_18_, int i_19_) {
		super(class331, i, i_9_, i_10_, i_11_, i_12_, i_13_, i_14_, i_15_, i_16_, 512737201 * class432.anInt5409 == 1, StaticMethods.method1253(i_17_, i_18_));
		aClass60_9878 = new Class60(class_ra, class433, class432, i_17_, i_18_, plane, i_9_, this, bool, i_19_);
		this.aBoolean9875 = 1532834983 * class432.anInt5382 != 0 && !bool;
		method4362(1);
	}

    final void method4355(GraphicsToolkit graphicsToolkit, Class365_Sub1 class365_sub1, int i, int i_20_, int i_21_, boolean bool) {
		try {
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wb.bk(").append(')').toString());
		}
	}

	final void method4398() {
		try {
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wb.bq(").append(')').toString());
		}
	}

	public int method4361() {
		try {
			return aClass60_9878.method705();
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wb.bm(").append(')').toString());
		}
	}

}
