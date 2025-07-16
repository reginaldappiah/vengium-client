package com.jagex;/* Class365_Sub1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class365_Sub1_Sub2 extends Class365_Sub1 {
	public short aShort9801;

	int method4354(Light[] lights, int i) {
		try {
			Vector3f class217 = getWorldTransform().trans;
			return method4392(((int) class217.x >> -1688804109 * aClass331_7722.positionHash), ((int) class217.z >> -1688804109 * aClass331_7722.positionHash), lights);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ajh.dg(").append(')').toString());
		}
	}

	boolean method4364(GraphicsToolkit graphicsToolkit) {
		try {
			Vector3f class217 = getWorldTransform().trans;
			return (aClass331_7722.aClass333_3512.method4071(aByte7724, ((int) class217.x >> -1688804109 * aClass331_7722.positionHash), ((int) class217.z >> -1688804109 * aClass331_7722.positionHash)));
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ajh.dl(").append(')').toString());
		}
	}

	boolean method4360(int i) {
		try {
			Vector3f class217 = getWorldTransform().trans;
			return (aClass331_7722.aBooleanArrayArray3563[(((int) class217.x >> -1688804109 * aClass331_7722.positionHash) - aClass331_7722.anInt3553 * -804213305 + aClass331_7722.anInt3538 * 583010427)][(583010427 * aClass331_7722.anInt3538 + (((int) class217.z >> aClass331_7722.positionHash * -1688804109) - (465603579 * aClass331_7722.anInt3513)))]);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ajh.dq(").append(')').toString());
		}
	}

	Class365_Sub1_Sub2(Region class331, int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_) {
		super(class331);
		plane = (byte) i_2_;
		aByte7724 = (byte) i_3_;
		aShort9801 = (short) i_4_;
		method4340(new Vector3f((float) i, (float) i_0_, (float) i_1_));
	}

}
