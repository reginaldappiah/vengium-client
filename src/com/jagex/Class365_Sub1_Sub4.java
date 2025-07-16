package com.jagex;/* Class365_Sub1_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class365_Sub1_Sub4 extends Class365_Sub1 {
	int method4354(Light[] lights, int i) {
		try {
			Vector3f class217 = getWorldTransform().trans;
			return method4392(((int) class217.x >> -1688804109 * aClass331_7722.positionHash), ((int) class217.z >> -1688804109 * aClass331_7722.positionHash), lights);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ajx.dg(").append(')').toString());
		}
	}

	boolean method4360(int i) {
		try {
			Vector3f class217 = getWorldTransform().trans;
			return (aClass331_7722.aBooleanArrayArray3563[(((int) class217.x >> -1688804109 * aClass331_7722.positionHash) - aClass331_7722.anInt3553 * -804213305 + aClass331_7722.anInt3538 * 583010427)][(((int) class217.z >> aClass331_7722.positionHash * -1688804109) - aClass331_7722.anInt3513 * 465603579 + aClass331_7722.anInt3538 * 583010427)]);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ajx.dq(").append(')').toString());
		}
	}

	boolean method4364(GraphicsToolkit graphicsToolkit) {
		try {
			Vector3f class217 = getWorldTransform().trans;
			Class322 class322 = aClass331_7722.method4036(plane, ((int) class217.x >> (aClass331_7722.positionHash * -1688804109)), ((int) class217.z >> (-1688804109 * aClass331_7722.positionHash)), -113950602);
			if (null != class322 && class322.aClass365_Sub1_Sub1_3359.aBoolean9799)
				return (aClass331_7722.aClass333_3512.method4073(plane, ((int) class217.x >> -1688804109 * aClass331_7722.positionHash), ((int) class217.z >> aClass331_7722.positionHash * -1688804109), (class322.aClass365_Sub1_Sub1_3359.method4361() + method4361())));
			return (aClass331_7722.aClass333_3512.method4071(plane, ((int) class217.x >> -1688804109 * aClass331_7722.positionHash), ((int) class217.z >> aClass331_7722.positionHash * -1688804109)));
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ajx.dl(").append(')').toString());
		}
	}

	final void method4355(GraphicsToolkit graphicsToolkit, Class365_Sub1 class365_sub1, int i, int i_0_, int i_1_, boolean bool) {
		try {
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ajx.bk(").append(')').toString());
		}
	}

	final boolean method4366() {
		try {
			return false;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ajx.bw(").append(')').toString());
		}
	}

	final void method4398() {
		try {
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ajx.bq(").append(')').toString());
		}
	}

	Class365_Sub1_Sub4(Region class331, int i, int i_5_, int i_6_, int i_7_, int i_8_) {
		super(class331);
		plane = (byte) i_7_;
		aByte7724 = (byte) i_8_;
		method4340(new Vector3f((float) i, (float) i_5_, (float) i_6_));
	}

}
