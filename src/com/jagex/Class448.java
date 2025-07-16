package com.jagex;/* Class448 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class448 {
	static int anInt5619;
	Class302_Sub3 aClass302_Sub3_5620;
	public Class302_Sub3 aClass302_Sub3_5621 = new Class302_Sub3();

	public void method5907(int i) {
		try {
			for (;;) {
				Class302_Sub3 class302_sub3 = aClass302_Sub3_5621.aClass302_Sub3_7650;
				if (class302_sub3 == aClass302_Sub3_5621) {
					if (i >= 1446077798) {
						/* empty */
					}
					break;
				}
				class302_sub3.method3721(-850214067);
			}
			this.aClass302_Sub3_5620 = null;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("sm.p(").append(')').toString());
		}
	}

	public void method5908(Class302_Sub3 class302_sub3, byte i) {
		try {
			if (class302_sub3.aClass302_Sub3_7649 != null)
				class302_sub3.method3721(-850214067);
			class302_sub3.aClass302_Sub3_7649 = aClass302_Sub3_5621.aClass302_Sub3_7649;
			class302_sub3.aClass302_Sub3_7650 = aClass302_Sub3_5621;
			class302_sub3.aClass302_Sub3_7649.aClass302_Sub3_7650 = class302_sub3;
			class302_sub3.aClass302_Sub3_7650.aClass302_Sub3_7649 = class302_sub3;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("sm.a(").append(')').toString());
		}
	}

	public Class302_Sub3 method5909(int i) {
		try {
			Class302_Sub3 class302_sub3 = this.aClass302_Sub3_5620;
			if (class302_sub3 == aClass302_Sub3_5621) {
				this.aClass302_Sub3_5620 = null;
				return null;
			}
			this.aClass302_Sub3_5620 = class302_sub3.aClass302_Sub3_7650;
			return class302_sub3;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("sm.b(").append(')').toString());
		}
	}

	public int method5910(short i) {
		try {
			int i_0_ = 0;
			for (Class302_Sub3 class302_sub3 = aClass302_Sub3_5621.aClass302_Sub3_7650; aClass302_Sub3_5621 != class302_sub3; class302_sub3 = class302_sub3.aClass302_Sub3_7650)
				i_0_++;
			return i_0_;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("sm.i(").append(')').toString());
		}
	}

	public Class302_Sub3 method5911(int i) {
		try {
			Class302_Sub3 class302_sub3 = aClass302_Sub3_5621.aClass302_Sub3_7650;
			if (aClass302_Sub3_5621 == class302_sub3) {
				this.aClass302_Sub3_5620 = null;
				return null;
			}
			this.aClass302_Sub3_5620 = class302_sub3.aClass302_Sub3_7650;
			return class302_sub3;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("sm.f(").append(')').toString());
		}
	}

	public Class448() {
		aClass302_Sub3_5621.aClass302_Sub3_7650 = aClass302_Sub3_5621;
		aClass302_Sub3_5621.aClass302_Sub3_7649 = aClass302_Sub3_5621;
	}

	static final void method5912(int interfaceID, int i_1_, int i_2_, int width, int height, int i_5_, int i_6_, int i_7_) {
		try {
			if (!Class378.componentExists(interfaceID, null)) {
				if (-1 != i_7_)
					GameClient.aBooleanArray8900[i_7_] = true;
				else {
					for (int i_9_ = 0; i_9_ < 113; i_9_++)
						GameClient.aBooleanArray8900[i_9_] = true;
				}
			} else
				IComponentDefinition.updateComponentType(IComponentDefinition.getIComponentDefinitionCollections[interfaceID].getComponentDefinitions(), -1, i_1_, i_2_, width, height, i_5_, i_6_, i_7_, i_7_ < 0);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("sm.kt(").append(')').toString());
		}
	}

	static final void method5913(ScriptRuntime class403, int i) {
		try {
			class403.longArgs -= -682569305;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("sm.be(").append(')').toString());
		}
	}
}
