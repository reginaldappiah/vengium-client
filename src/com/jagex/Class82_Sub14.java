package com.jagex;/* Class82_Sub14 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class82_Sub14 extends Class82 {
	int anInt6870;
	int anInt6871;
	int anInt6872;
	int anInt6873;
	int anInt6874;
	public static int anInt6875;

	public void method868() {
		Class87.aClass86Array798[this.anInt6872 * -1513279001].method961(this.anInt6873 * -1362665787, this.anInt6870 * 742935457, this.anInt6874 * 1433353217, this.anInt6871 * 1898976349);
	}

	public void method866() {
		try {
			Class87.aClass86Array798[this.anInt6872 * -1513279001].method961(this.anInt6873 * -1362665787, this.anInt6870 * 742935457, this.anInt6874 * 1433353217, this.anInt6871 * 1898976349);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("yb.f(").append(')').toString());
		}
	}

	Class82_Sub14(Buffer class298_sub53) {
		super(class298_sub53);
		this.anInt6872 = class298_sub53.readUShort() * 586633687;
		int i = class298_sub53.readInt();
		this.anInt6870 = 2031900769 * (i >>> 16);
		this.anInt6874 = 10535937 * (i & 0xffff);
		this.anInt6873 = class298_sub53.readUByte() * 325218317;
		this.anInt6871 = class298_sub53.readUByte() * 340156405;
	}

	public void method869() {
		Class87.aClass86Array798[this.anInt6872 * -1513279001].method961(this.anInt6873 * -1362665787, this.anInt6870 * 742935457, this.anInt6874 * 1433353217, this.anInt6871 * 1898976349);
	}

}
