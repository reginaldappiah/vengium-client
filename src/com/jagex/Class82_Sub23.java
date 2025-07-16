package com.jagex;/* Class82_Sub23 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.game.cache.config.prefetch.Js5List;

public class Class82_Sub23 extends Class82 {
	Class95 aClass95_6918;
	int anInt6919;
	int anInt6920;
	protected static Class295 aClass295_6921;

	Class82_Sub23(Buffer class298_sub53) {
		super(class298_sub53);
		this.anInt6920 = class298_sub53.readUShort() * 192120791;
		this.anInt6919 = class298_sub53.readUByte() * -1335683137;
	}

	public void method869() {
		Class116.method1268(this.aClass95_6918, -915613633 * this.anInt6919, (byte) -39);
	}

	boolean method870() {
		try {
			if (null == this.aClass95_6918)
				this.aClass95_6918 = new Class95(Js5List.JS5_MUSIC, (this.anInt6920 * -949920793));
			return this.aClass95_6918.method1030();
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("yv.p(").append(')').toString());
		}
	}

	public void method868() {
		Class116.method1268(this.aClass95_6918, -915613633 * this.anInt6919, (byte) 16);
	}

	boolean method941() {
		if (null == this.aClass95_6918)
			this.aClass95_6918 = new Class95(Js5List.JS5_MUSIC, this.anInt6920 * -949920793);
		return this.aClass95_6918.method1030();
	}

	public void method866() {
		try {
			Class116.method1268(this.aClass95_6918, -915613633 * this.anInt6919, (byte) -9);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("yv.f(").append(')').toString());
		}
	}
}
