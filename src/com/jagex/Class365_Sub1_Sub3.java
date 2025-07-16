package com.jagex;/* Class365_Sub1_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class365_Sub1_Sub3 extends Class365_Sub1 {
	protected short aShort9802;
	protected short aShort9803;
	public static CacheResourceWorker aCacheResourceWorker_9804;

	int method4354(Light[] lights, int i) {
		try {
			Vector3f class217 = getWorldTransform().trans;
			return method4392(((int) class217.x >> -1688804109 * aClass331_7722.positionHash), ((int) class217.z >> -1688804109 * aClass331_7722.positionHash), lights);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("aji.dg(").append(')').toString());
		}
	}

	final boolean method4366() {
		try {
			return false;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("aji.bw(").append(')').toString());
		}
	}

	final void method4398() {
		try {
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("aji.bq(").append(')').toString());
		}
	}

	Class365_Sub1_Sub3(Region class331, int i, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_) {
		super(class331);
		plane = (byte) i_6_;
		aByte7724 = (byte) i_7_;
		aShort9802 = (short) i_8_;
		aShort9803 = (short) i_9_;
		method4340(new Vector3f((float) i, (float) i_4_, (float) i_5_));
	}

	final void method4355(GraphicsToolkit graphicsToolkit, Class365_Sub1 class365_sub1, int i, int i_10_, int i_11_, boolean bool) {
		try {
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("aji.bk(").append(')').toString());
		}
	}

	boolean method4364(GraphicsToolkit graphicsToolkit) {
		try {
			Vector3f class217 = getWorldTransform().trans;
			return (aClass331_7722.aClass333_3512.method4073(aByte7724, ((int) class217.x >> aClass331_7722.positionHash * -1688804109), ((int) class217.z >> aClass331_7722.positionHash * -1688804109), method4361()));
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("aji.dl(").append(')').toString());
		}
	}

	boolean method4360(int i) {
		try {
			Vector3f class217 = getWorldTransform().trans;
			return (aClass331_7722.aBooleanArrayArray3563[(583010427 * aClass331_7722.anInt3538 + (((int) class217.x >> -1688804109 * aClass331_7722.positionHash) - (-804213305 * aClass331_7722.anInt3553)))][(((int) class217.z >> -1688804109 * aClass331_7722.positionHash) - aClass331_7722.anInt3513 * 465603579 + 583010427 * aClass331_7722.anInt3538)]);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("aji.dq(").append(')').toString());
		}
	}
}
