package com.jagex;/* Class302_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class302_Sub3 extends Class302 {
	public Class302_Sub3 aClass302_Sub3_7649;
	public Class302_Sub3 aClass302_Sub3_7650;

	public void method3721(int i) {
		try {
			if (null != aClass302_Sub3_7649) {
				aClass302_Sub3_7649.aClass302_Sub3_7650 = aClass302_Sub3_7650;
				aClass302_Sub3_7650.aClass302_Sub3_7649 = aClass302_Sub3_7649;
				aClass302_Sub3_7650 = null;
				aClass302_Sub3_7649 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("aap.b(").append(')').toString());
		}
	}

	static final void method3723(ScriptRuntime class403, int i) {
		try {
			int i_0_ = (class403.integerStack[((class403.integerStackOffset -= -391880689) * 681479919)]);
			IComponentDefinition class105 = IComponentDefinition.getInterfaceComponent(i_0_);
			IComponentDefinitionCollection IComponentDefinitionCollection = IComponentDefinition.getIComponentDefinitionCollections[i_0_ >> 16];
			Class214.method1989(class105, IComponentDefinitionCollection, class403, (byte) 121);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("aap.ks(").append(')').toString());
		}
	}
}
