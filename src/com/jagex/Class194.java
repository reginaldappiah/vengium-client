package com.jagex;/* Class194 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.utils.CameraUtils;

public class Class194 {
	public static int anInt1953 = 17;
	public static int anInt1954 = 4;
	public static int anInt1955 = 20;
	public static int anInt1956 = 1;
	public static int anInt1957 = 21;
	public static int anInt1958 = 27;
	public static int anInt1959 = 28;
	public static int anInt1960 = 9;
	public static int anInt1961 = 7;
	public static int anInt1962 = 15;
	public static int anInt1963 = 26;
	public static int anInt1964 = 31;
	public static int anInt1965 = 12;
	public static int anInt1966 = 5;
	public static int anInt1967 = 14;
	public static int anInt1968 = 22;
	public static int anInt1969 = 23;
	public static int anInt1970 = 29;
	public static int anInt1971 = 32;
	public static int anInt1972 = 8;
	public static int anInt1973 = 16;
	public static int anInt1974 = 24;
	public static int anInt1975 = 33;
	public static int anInt1976 = 6;
	public static int anInt1977 = 11;
	public static int anInt1978 = 10;
	public static int anInt1979 = 18;
	public static int anInt1980 = 13;
	public static int anInt1981 = 25;
	public static int anInt1982 = 3;
	public static int anInt1983 = 2;
	public static int anInt1984 = 30;

	Class194() throws Throwable {
		throw new Error();
	}

	static final void method1863(ScriptRuntime class403, byte i) {
		try {
			IComponentScripter IComponentScripter = (class403.currentInstrBool ? class403.aIComponentScripter_5247 : class403.aIComponentScripter_5246);
			IComponentDefinition class105 = IComponentScripter.componentDefinition;
			IComponentDefinitionCollection IComponentDefinitionCollection = IComponentScripter.IComponentDefinitionCollection;
			ToMoveIComponentScripts.method1397(class105, class403);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("if.np(").append(')').toString());
		}
	}

	static final void method1864(ScriptRuntime class403, int i) {
		try {
			int i_0_ = (class403.integerStack[((class403.integerStackOffset -= -391880689) * 681479919)]);
			IComponentDefinition class105 = IComponentDefinition.getInterfaceComponent(i_0_);
			IComponentDefinitionCollection IComponentDefinitionCollection = IComponentDefinition.getIComponentDefinitionCollections[i_0_ >> 16];
			Class324.method3958(class105, IComponentDefinitionCollection, class403, -389689371);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("if.oa(").append(')').toString());
		}
	}

	static final void method1865(ScriptRuntime class403, int i) {
		try {
			class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919 - 1)] = CameraUtils.cameraType * -863531439 == 4 ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("if.agy(").append(')').toString());
		}
	}

	static final void method1866(ScriptRuntime class403, int i) {
		try {
			int i_1_ = (class403.integerStack[((class403.integerStackOffset -= -391880689) * 681479919)]);
			SettingsManager.settingsManager.setValue(SettingsManager.settingsManager.particles, i_1_);
			ToMoveSettings.encodeBuffer();
			GameClient.sentPreferences = false;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("if.aih(").append(')').toString());
		}
	}

	public static Class336 method1867(int i, int i_2_, int i_3_, int i_4_, Class424 class424, int i_5_, byte i_6_) {
		try {
			Class315.aClass336_Sub2_3309.toX = i * -760677635;
			Class315.aClass336_Sub2_3309.toY = 167105303 * i_2_;
			Class315.aClass336_Sub2_3309.sizeX = i_3_ * -1544157451;
			Class315.aClass336_Sub2_3309.sizeY = -1468199503 * i_4_;
			Class315.aClass336_Sub2_3309.aClass424_7713 = class424;
			Class315.aClass336_Sub2_3309.anInt7714 = -2142070477 * i_5_;
			return Class315.aClass336_Sub2_3309;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("if.k(").append(')').toString());
		}
	}

	public static void closeMenus() {
			Class170.method1808();
			GameClient.menuOpen = false;
			StaticMethods.method2112(Class88.anInt806 * -1347746885, TileMessage.anInt7658 * 1089948687, 608683427 * Class134.anInt6343, 1396607435 * Class448.anInt5619);
			Class298_Sub45.aMenuOption_7522 = null;
			StaticMethods.aMenuOption_3322 = null;
	}

	static final void method1869(ScriptRuntime runtime) {
		try {
			IComponentScripter IComponentScripter = (runtime.currentInstrBool ? runtime.aIComponentScripter_5247 : runtime.aIComponentScripter_5246);
			IComponentDefinition class105 = IComponentScripter.componentDefinition;
			runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = class105.anInt1166 * 684246511;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("if.pd(").append(')').toString());
		}
	}

	static final void method1870(IComponentDefinition class105, IComponentDefinitionCollection IComponentDefinitionCollection, ScriptRuntime class403, byte i) {
		try {
			class105.anInt1232 = (class403.integerStack[(class403.integerStackOffset -= -391880689) * 681479919]) * -7527659;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("if.jq(").append(')').toString());
		}
	}
}
