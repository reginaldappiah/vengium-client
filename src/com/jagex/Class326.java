package com.jagex;/* Class326 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class326 {
	public Class326 aClass326_3455;
	public Class322 aClass322_3456;
	public Class365_Sub1_Sub5 aClass365_Sub1_Sub5_3457;
	public Class365_Sub1_Sub5 aClass365_Sub1_Sub5_3458;
	public Class365_Sub1_Sub3 aClass365_Sub1_Sub3_3459;
	public Class365_Sub1_Sub3 aClass365_Sub1_Sub3_3460;
	public Class365_Sub1_Sub2 aClass365_Sub1_Sub2_3461;
	Class365_Sub1_Sub4 aClass365_Sub1_Sub4_3462;
	short aShort3463;
	short aShort3464;
	short aShort3465;
	public byte aByte3466;
	short aShort3467;

	public Class326(int i) {
		aByte3466 = (byte) i;
	}

	static final void method3969(ScriptRuntime runtime) {
		try {
			IComponentScripter IComponentScripter = (runtime.currentInstrBool ? runtime.aIComponentScripter_5247 : runtime.aIComponentScripter_5246);
			IComponentDefinition componentDefinition = IComponentScripter.componentDefinition;
			IComponentDefinitionCollection IComponentDefinitionCollection = IComponentScripter.IComponentDefinitionCollection;
			Class75.method835(componentDefinition, IComponentDefinitionCollection, runtime);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("np.ju(").append(')').toString());
		}
	}

}
