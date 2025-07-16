package com.jagex;/* Class15 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.game.cache.config.Js5Configs;
import com.jagex.maths.Matrix43f;
import com.jagex.maths.Matrix4f;

public class Class15 {
	int[] anIntArray178;
	Runnable aRunnable179;
	static float aFloat180 = 255.0F;
	float[] aFloatArray181;
	JavaGraphicsToolkit aClass_ra_Sub1_182;
	float aFloat183;
	int anInt184;
	int anInt185;
	boolean aBoolean186;
	DirectXModelToolkit[] aDirectXModelToolkitArray187;
	float[] aFloatArray188;
	Matrix43f aClass222_189;
	Matrix4f aMatrix4f_190;
	float aFloat191;
	Class2 aClass2_192;
	float aFloat193;
	Matrix4f aMatrix4f_194;
	Matrix4f aMatrix4f_195;
	int anInt196;
	float[] aFloatArray197;
	float[] aFloatArray198;
	float[] aFloatArray199;
	float[] aFloatArray200;
	int[] anIntArray201;
	int[] anIntArray202;
	int[] anIntArray203;
	int[] anIntArray204;
	float aFloat205 = 0.85F;
	int[] anIntArray206;
	boolean aBoolean207;
	float aFloat208;
	float aFloat209;
	float[] aFloatArray210;
	float aFloat211;
	float aFloat212;
	int[] anIntArray213;
	int anInt214;
	int anInt215;
	boolean aBoolean216;
	DirectXModelToolkit[] aDirectXModelToolkitArray217;
	float[] aFloatArray218;
	Matrix43f aClass222_219;
	float aFloat220;
	float[] aFloatArray221;
	float[] aFloatArray222;
	float[] aFloatArray223;

	Class15(JavaGraphicsToolkit class_ra_sub1) {
		this.aFloat183 = 1.0F - this.aFloat205;
		this.anInt184 = 0;
		this.anInt185 = 0;
		this.aBoolean186 = false;
		this.anInt196 = 0;
		this.anInt215 = 0;
		this.aBoolean207 = true;
		this.aMatrix4f_190 = new Matrix4f();
		this.aClass222_219 = new Matrix43f();
		this.aClass222_189 = new Matrix43f();
		this.aMatrix4f_194 = new Matrix4f();
		this.aMatrix4f_195 = new Matrix4f();
		this.anIntArray213 = new int[DirectXModelToolkit.anInt7810];
		this.aFloatArray197 = new float[DirectXModelToolkit.anInt7810];
		this.aFloatArray188 = new float[DirectXModelToolkit.anInt7810];
		this.aFloatArray199 = new float[DirectXModelToolkit.anInt7810];
		this.aFloatArray200 = new float[DirectXModelToolkit.anInt7810];
		this.anIntArray201 = new int[8];
		this.anIntArray202 = new int[8];
		this.anIntArray203 = new int[8];
		this.anIntArray204 = new int[10000];
		this.anIntArray178 = new int[10000];
		this.aFloat211 = 1.0F;
		this.aFloat212 = 0.0F;
		this.aFloat191 = 1.0F;
		this.aFloatArray210 = new float[2];
		this.aDirectXModelToolkitArray187 = new DirectXModelToolkit[7];
		this.aDirectXModelToolkitArray217 = new DirectXModelToolkit[7];
		this.aFloatArray218 = new float[64];
		this.aFloatArray181 = new float[64];
		this.aFloatArray223 = new float[64];
		this.aFloatArray221 = new float[64];
		this.aFloatArray222 = new float[64];
		this.aFloatArray198 = new float[3];
		this.aClass_ra_Sub1_182 = class_ra_sub1;
		this.aClass2_192 = new Class2(class_ra_sub1, this);
		for (int i = 0; i < 7; i++) {
			this.aDirectXModelToolkitArray187[i] = new DirectXModelToolkit(this.aClass_ra_Sub1_182);
			this.aDirectXModelToolkitArray217[i] = new DirectXModelToolkit(this.aClass_ra_Sub1_182);
		}
		this.anIntArray206 = new int[DirectXModelToolkit.anInt7787];
		for (int i = 0; i < DirectXModelToolkit.anInt7787; i++)
			this.anIntArray206[i] = -1;
	}

	void method347(Runnable runnable, byte i) {
		try {
			this.aRunnable179 = runnable;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ap.f(").append(')').toString());
		}
	}

	void method348(int i) {
		try {
			this.aClass2_192 = new Class2(this.aClass_ra_Sub1_182, this);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ap.a(").append(')').toString());
		}
	}

	static final void method349(ScriptRuntime class403, int i) {
		try {
			int i_0_ = (class403.integerStack[((class403.integerStackOffset -= -391880689) * 681479919)]);
			ItemDefinition class468 = Js5Configs.itemList.getItemDefinitions(i_0_);
			if (-1673957995 * class468.certTemplateID == -1 && 809765849 * class468.certID >= 0)
				class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919) - 1] = 809765849 * class468.certID;
			else
				class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919) - 1] = i_0_;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ap.aal(").append(')').toString());
		}
	}

	static final void method350(ScriptRuntime runtime) {
		try {
			int i_1_ = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
			runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = (Class379.anIntArray4096[Class173.method1823(i_1_) & 0xffff]);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ap.zl(").append(')').toString());
		}
	}

	static final void method351(ScriptRuntime runtime) {
		try {
			IComponentScripter IComponentScripter = (runtime.currentInstrBool ? runtime.aIComponentScripter_5247 : runtime.aIComponentScripter_5246);
			IComponentDefinition class105 = IComponentScripter.componentDefinition;
			IComponentDefinitionCollection IComponentDefinitionCollection = IComponentScripter.IComponentDefinitionCollection;
			ToMoveIComponentScripts.method365(class105, IComponentDefinitionCollection, false, 1, runtime);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ap.hp(").append(')').toString());
		}
	}
}
