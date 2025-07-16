package com.jagex;/* Class365_Sub1_Sub1_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.maths.Matrix43f;

public class Class365_Sub1_Sub1_Sub4 extends Class365_Sub1_Sub1 {
	Class299 aClass299_10140;
	ModelToolkit aClass387_10141;

	public Class334 method4358(GraphicsToolkit graphicsToolkit) {
		try {
			return null;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("akx.bc(").append(')').toString());
		}
	}

	boolean method4350(GraphicsToolkit class_ra, int i, int i_0_, byte i_1_) {
		try {
			return false;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("akx.bu(").append(')').toString());
		}
	}

	boolean method4366() {
		try {
			return false;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("akx.bw(").append(')').toString());
		}
	}

	boolean method4399() {
		try {
			if (this.aClass387_10141 != null)
				return !this.aClass387_10141.u();
			return true;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("akx.bf(").append(')').toString());
		}
	}

	void method4355(GraphicsToolkit graphicsToolkit, Class365_Sub1 class365_sub1, int i, int i_2_, int i_3_, boolean bool) {
		try {
			/* empty */
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("akx.bk(").append(')').toString());
		}
	}

	void method4357(GraphicsToolkit class_ra, int i) {
		try {
			/* empty */
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("akx.bb(").append(')').toString());
		}
	}

	public int method4361() {
		try {
			return (null != this.aClass387_10141 ? this.aClass387_10141.YA() : 0);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("akx.bm(").append(')').toString());
		}
	}

	void method4398() {
		try {
			/* empty */
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("akx.bq(").append(')').toString());
		}
	}

	Class335 method4394(GraphicsToolkit graphicsToolkit) {
		try {
			if (null == this.aClass387_10141)
				this.aClass387_10141 = this.aClass299_10140.method3679(graphicsToolkit, 809073544);
			if (null != this.aClass387_10141) {
				Matrix43f class222 = graphicsToolkit.getTransformationMatrix();
				Matrix43f class222_7_ = method4347();
				Class235 class235 = getWorldTransform();
				class222.copy(class222_7_);
				Class326 class326 = (aClass331_7722.gameSceneBase[plane][(int) class235.trans.x >> 9][(int) class235.trans.z >> 9]);
				if (null != class326 && class326.aClass365_Sub1_Sub2_3461 != null)
					class222.translate(0.0F, (float) -(class326.aClass365_Sub1_Sub2_3461.aShort9801), 0.0F);
				this.aClass387_10141.render(class222, null, 0);
			}
			return null;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("akx.bo(").append(')').toString());
		}
	}

	Class365_Sub1_Sub1_Sub4(Region class331, Class299 class299, int i, int i_8_, int i_9_, int i_10_, int i_11_) {
		super(class331, i, i_8_, i_9_, i_10_, i_11_, i_9_ >> 9, i_9_ >> 9, i_11_ >> 9, i_11_ >> 9, false, (byte) 0);
		this.aClass299_10140 = class299;
	}

	boolean method4376() {
		try {
			if (this.aClass387_10141 != null)
				return this.aClass387_10141.i();
			return false;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("akx.be(").append(')').toString());
		}
	}

}
