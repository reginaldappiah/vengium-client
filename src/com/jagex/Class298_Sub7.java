package com.jagex;/* Class298_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class298_Sub7 extends Node {
	public int anInt7212;
	public int anInt7213;
	public int anInt7214;
	public int anInt7215;
	public int anInt7216;
	public int anInt7217;
	public int anInt7218;
	public int anInt7219;
	public int anInt7220;

	Class298_Sub7(Buffer class298_sub53) {
		int i = class298_sub53.readInt();
		anInt7214 = (i >>> 28) * 227078415;
		anInt7218 = -1209133463 * (i >>> 14 & 0x3fff);
		anInt7212 = (i & 0x3fff) * -1854987659;
		anInt7219 = class298_sub53.readUByte() * -1854609097;
		anInt7213 = class298_sub53.readUByte() * -1880600721;
		anInt7215 = class298_sub53.readUByte() * -1093975085;
		anInt7216 = class298_sub53.readUByte() * 1165274655;
		anInt7217 = class298_sub53.readUByte() * 2032904299;
		anInt7220 = class298_sub53.readUByte() * -1262403157;
	}

	public static Class298_Sub37_Sub13 method2864() {
		try {
			return Class301_Sub1.aClass298_Sub37_Sub13_3218;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("aak.cl(").append(')').toString());
		}
	}

	static final void method2865(ScriptRuntime class403, int i) {
		try {
			IComponentDefinition class105 = IComponentDefinition.getInterfaceComponent((class403.integerStack[(class403.integerStackOffset -= -391880689) * 681479919]));
			class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919 - 1)] = -1232467723 * class105.itemID;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("aak.rz(").append(')').toString());
		}
	}

	static final void method2866(ScriptRuntime class403, byte i) {
		try {
			int i_0_ = (class403.integerStack[((class403.integerStackOffset -= -391880689) * 681479919)]);
			PublicMessage class102 = PublicMessage.getMessageCharacterCount(i_0_);
			int i_1_ = -1;
			if (class102 != null)
				i_1_ = class102.anInt1093 * -246265729;
			class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919 - 1)] = i_1_;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("aak.act(").append(')').toString());
		}
	}
}
