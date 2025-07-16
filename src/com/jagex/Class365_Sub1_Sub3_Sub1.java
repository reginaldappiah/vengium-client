package com.jagex;/* Class365_Sub1_Sub3_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.maths.Matrix43f;
import com.jagex.utils.StringUtils;

public class Class365_Sub1_Sub3_Sub1 extends Class365_Sub1_Sub3 implements SceneObject {
	boolean aBoolean9903 = true;
	boolean aBoolean9904;
	Class334 aClass334_9905;
	public Class60 aClass60_9906;

    boolean method4376() {
		try {
			return this.aBoolean9903;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wl.be(").append(')').toString());
		}
	}

	public Class334 method4358(GraphicsToolkit graphicsToolkit) {
		try {
			return this.aClass334_9905;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wl.bc(").append(')').toString());
		}
	}

	public int method4361() {
		try {
			return aClass60_9906.method705();
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wl.bm(").append(')').toString());
		}
	}

	public int method4363() {
		try {
			return aClass60_9906.method699();
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wl.bx(").append(')').toString());
		}
	}

	public void method4504(Class435 class435) {
		try {
			aClass60_9906.method698(class435);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wl.by(").append(')').toString());
		}
	}

	void method4357(GraphicsToolkit class_ra, int i) {
		try {
			ModelToolkit class387 = aClass60_9906.method700(class_ra, 262144, false, true);
			if (null != class387) {
				Matrix43f class222 = method4347();
				Class235 class235 = getWorldTransform();
				int i_0_ = (int) class235.trans.x >> 9;
				int i_1_ = (int) class235.trans.z >> 9;
				aClass60_9906.method701(class_ra, class387, class222, false);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wl.bb(").append(')').toString());
		}
	}

	boolean method4350(GraphicsToolkit class_ra, int i, int i_2_, byte i_3_) {
		try {
			ModelToolkit class387 = aClass60_9906.method700(class_ra, 131072, false, false);
			if (null == class387)
				return false;
			return class387.method4787(i, i_2_, method4347(), false, 0);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wl.bu(").append(')').toString());
		}
	}

	public int getID() {
		try {
			return 1686561661 * aClass60_9906.fileID;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wl.a(").append(')').toString());
		}
	}

	public int method29() {
		try {
			return aClass60_9906.anInt589 * -1598457753;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wl.f(").append(')').toString());
		}
	}

	public int method30() {
		try {
			return 748228569 * aClass60_9906.anInt590;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wl.b(").append(')').toString());
		}
	}

	public void method31() {
		try {
			/* empty */
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wl.p(").append(')').toString());
		}
	}

	public boolean method39() {
		try {
			return aClass60_9906.method706();
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wl.i(").append(')').toString());
		}
	}

	public void method37(GraphicsToolkit toolkit) {
		try {
			aClass60_9906.method707();
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wl.d(").append(')').toString());
		}
	}

	public void method33(GraphicsToolkit toolkit) {
		try {
			aClass60_9906.method702(toolkit);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wl.k(").append(')').toString());
		}
	}

    boolean method4399() {
		try {
			return false;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wl.bf(").append(')').toString());
		}
	}

    public int method4505() {
		return aClass60_9906.method699();
	}

	public int method4506() {
		return aClass60_9906.method699();
	}

	Class335 method4394(GraphicsToolkit graphicsToolkit) {
		try {
			ModelToolkit class387 = aClass60_9906.method700(graphicsToolkit, 2048, false, true);
			if (class387 == null)
				return null;
			Matrix43f class222 = graphicsToolkit.getTransformationMatrix();
			class222.copy(method4347());
			class222.translate((float) aShort9802, 0.0F, (float) aShort9803);
			Class235 class235 = getWorldTransform();
			Class335 class335 = StaticMethods.method818((this.aBoolean9904));
			int i_7_ = (int) class235.trans.x >> 9;
			int i_8_ = (int) class235.trans.z >> 9;
			aClass60_9906.method701(graphicsToolkit, class387, class222, true);
			class387.render(class222, aClass302_Sub1Array7726[0], 0);
			if (null != aClass60_9906.aParticleSystem_602) {
				Class69 class69 = aClass60_9906.aParticleSystem_602.method4229();
				graphicsToolkit.renderParticles(class69);
			}
			this.aBoolean9903 = (class387.i() || null != aClass60_9906.aParticleSystem_602);
			if (null == this.aClass334_9905)
				this.aClass334_9905 = Class472.method6063((int) (class235.trans.x), (int) (class235.trans.y), (int) (class235.trans.z), class387);
			else
				Class264_Sub2.method2507(this.aClass334_9905, (int) class235.trans.x, (int) class235.trans.y, (int) class235.trans.z, class387);
			return class335;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wl.bo(").append(')').toString());
		}
	}

    public Class365_Sub1_Sub3_Sub1(Region class331, GraphicsToolkit class_ra, ObjectDefinitionLoader class433, ObjectDefinition class432, int i, int i_11_, int i_12_, int i_13_, int i_14_, boolean bool, int i_15_, int i_16_, int i_17_, int i_18_, int i_19_) {
		super(class331, i_12_, i_13_, i_14_, i, i_11_, i_15_, i_16_);
		aClass60_9906 = new Class60(class_ra, class433, class432, i_17_, i_18_, plane, i_11_, this, bool, i_19_);
		this.aBoolean9904 = 1532834983 * class432.anInt5382 != 0 && !bool;
		method4362(1);
	}

    public static void method4507(long[] ls, Object[] objects, byte i) {
		try {
			Class165.method1782(ls, objects, 0, ls.length - 1, 1394023611);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wl.r(").append(')').toString());
		}
	}

	public static String[] method4508(String string, char c) {
		try {
			int i_21_ = StringUtils.method3831(string, c, -452041917);
			String[] strings = new String[1 + i_21_];
			int i_22_ = 0;
			int i_23_ = 0;
			for (int i_24_ = 0; i_24_ < i_21_; i_24_++) {
				int i_25_;
				for (i_25_ = i_23_; string.charAt(i_25_) != c; i_25_++) {
					/* empty */
				}
				strings[i_22_++] = string.substring(i_23_, i_25_);
				i_23_ = 1 + i_25_;
			}
			strings[i_21_] = string.substring(i_23_);
			return strings;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wl.h(").append(')').toString());
		}
	}

	static final void resetHooks(IComponentDefinition componentDefinition) {
			componentDefinition.resetHooks();
	}
}
