package com.jagex;/* Class82_Sub18 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class82_Sub18 extends Class82 {
	int anInt6890;
	int anInt6891;

	public void method869() {
		Class136.method1495(this.anInt6890 * 115033111, 0, this.anInt6891 * -1734052405, -649427988);
	}

	public void method866() {
		try {
			Class136.method1495(this.anInt6890 * 115033111, 0, this.anInt6891 * -1734052405, -649427988);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("yl.f(").append(')').toString());
		}
	}

	public void method868() {
		Class136.method1495(this.anInt6890 * 115033111, 0, this.anInt6891 * -1734052405, -649427988);
	}

	Class82_Sub18(Buffer class298_sub53) {
		super(class298_sub53);
		this.anInt6890 = class298_sub53.readUShort() * 2089431975;
		this.anInt6891 = class298_sub53.readUByte() * 779683811;
	}

	public static final void method922() {
		try {
			if (!GameClient.aBoolean8762) {
				GameClient.aFloat8759 += (24.0F - GameClient.aFloat8759) / 2.0F;
				GameClient.aBoolean8763 = true;
				GameClient.aBoolean8762 = true;
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("yl.hc(").append(')').toString());
		}
	}

	static final void method923(ScriptRuntime class403) {
		try {
			class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919 - 1)] = GameClient.aBoolean8638 ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("yl.afb(").append(')').toString());
		}
	}
}
