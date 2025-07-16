package com.jagex;/* Class298_Sub45 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class298_Sub45 extends Node {
	Class190 aClass190_7514;
	float aFloat7515;
	int anInt7516;
	int anInt7517;
	EffectiveVertex aEffectiveVertex_7518;
	int anInt7519;
	float aFloat7520;
	static float[] aFloatArray7521 = new float[3];
	static MenuOption aMenuOption_7522;

	void method3532(int i) {
		try {
			this.anInt7516 = 2086576921 * this.aEffectiveVertex_7518.anInt671;
			this.anInt7517 = this.aEffectiveVertex_7518.anInt675 * 587912369;
			this.anInt7519 = this.aEffectiveVertex_7518.anInt676 * -247287593;
			if (this.aEffectiveVertex_7518.aMatrix4f_677 != null)
				this.aEffectiveVertex_7518.aMatrix4f_677.method2167((float) (1776313545 * (this.aClass190_7514.anInt1933)), (float) (-739294135 * (this.aClass190_7514.anInt1934)), (float) (this.aClass190_7514.anInt1935 * -1849369705), aFloatArray7521);
			this.aFloat7515 = aFloatArray7521[0];
			this.aFloat7520 = aFloatArray7521[2];
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("acf.a(").append(')').toString());
		}
	}

	Class298_Sub45(EffectiveVertex effectiveVertex, ParticleSystem particleSystem) {
		this.aEffectiveVertex_7518 = effectiveVertex;
		this.aClass190_7514 = this.aEffectiveVertex_7518.method775();
		method3532(-1046035099);
	}

	static final void method3533(IComponentDefinition componentDefinition, IComponentDefinitionCollection IComponentDefinitionCollection, ScriptRuntime runtime) {
		try {
			componentDefinition.transparency = (runtime.integerStack[(runtime.integerStackOffset -= -391880689) * 681479919]) * 728904583;
			StaticMethods.updateComponentTick(componentDefinition);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("acf.dx(").append(')').toString());
		}
	}
}
