package com.jagex;/* Class274 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class274 implements Interface21 {
	static Class274 aClass274_6529;
	public static Class274 aClass274_6530;
	static Class274 aClass274_6531;
	static Class274 aClass274_6532;
	public int anInt6533;
	static Class274 aClass274_6534;
	static Class274 aClass274_6535;
	static Class274 aClass274_6536 = new Class274(7, 0);
	static Class274 aClass274_6537;
	int anInt6538;
	static SpriteToolkit aClass57_6539;

	public int method244() {
		return 1575163887 * this.anInt6538;
	}

	public Class274 method2567(byte i) {
		try {
			switch (anInt6533 * 495490839) {
			case 3:
				return aClass274_6534;
			case 1:
				return aClass274_6537;
			case 0:
				return aClass274_6531;
			case 7:
				return aClass274_6530;
			case 4:
				return aClass274_6532;
			case 6:
				return aClass274_6535;
			case 5:
				return aClass274_6529;
			case 2:
				return aClass274_6536;
			default:
				throw new IllegalStateException();
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("lj.b(").append(')').toString());
		}
	}

	static {
		aClass274_6529 = new Class274(3, 1);
		aClass274_6537 = new Class274(6, 2);
		aClass274_6532 = new Class274(0, 3);
		aClass274_6530 = new Class274(2, 4);
		aClass274_6534 = new Class274(5, 5);
		aClass274_6535 = new Class274(1, 6);
		aClass274_6531 = new Class274(4, 7);
	}

	public int getID() {
		try {
			return 1575163887 * this.anInt6538;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("lj.f(").append(')').toString());
		}
	}

	public int method243() {
		return 1575163887 * this.anInt6538;
	}

	Class274(int i, int i_0_) {
		anInt6533 = i * 699142311;
		this.anInt6538 = i_0_ * 1812395791;
	}

	static final void method2568(ScriptRuntime runtime) {
		try {
			int i_1_ = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
			IComponentDefinition class105 = IComponentDefinition.getInterfaceComponent(i_1_);
			IComponentDefinitionCollection IComponentDefinitionCollection = IComponentDefinition.getIComponentDefinitionCollections[i_1_ >> 16];
			ToMoveIComponentScripts.method6315(class105, runtime);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("lj.fg(").append(')').toString());
		}
	}

	static final void method2569(ScriptRuntime class403, int i) {
		try {
			IComponentScripter IComponentScripter = (class403.currentInstrBool ? class403.aIComponentScripter_5247 : class403.aIComponentScripter_5246);
			IComponentDefinition class105 = IComponentScripter.componentDefinition;
			IComponentDefinitionCollection IComponentDefinitionCollection = IComponentScripter.IComponentDefinitionCollection;
			Class298_Sub32_Sub5.method3174(class105, IComponentDefinitionCollection, class403);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("lj.nk(").append(')').toString());
		}
	}
}
