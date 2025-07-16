package com.jagex;/* Class298_Sub40_Sub13 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.maths.Matrix43f;
import com.jagex.maths.Matrix4f;

public class Class298_Sub40_Sub13 extends Class298_Sub40 {
	int anInt9730;
	int anInt9731;
	Class160 aClass160_9732;

	void method3508(Buffer class298_sub53, int i) {
		try {
			this.anInt9731 = class298_sub53.readInt() * -1426634659;
			this.anInt9730 = class298_sub53.readInt() * 771945371;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("agz.a(").append(')').toString());
		}
	}

	void method3509(Buffer class298_sub53) {
		this.anInt9731 = class298_sub53.readInt() * -1426634659;
		this.anInt9730 = class298_sub53.readInt() * 771945371;
	}

	void method3510(Class162 class162, byte i) {
		try {
			class162.method1761((-814822411 * this.anInt9731), (this.anInt9730 * 1839676051), (byte) 26);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("agz.f(").append(')').toString());
		}
	}

	void method3511(Class162 class162) {
		class162.method1761((-814822411 * this.anInt9731), (this.anInt9730 * 1839676051), (byte) 66);
	}

	void method3512(Buffer class298_sub53) {
		this.anInt9731 = class298_sub53.readInt() * -1426634659;
		this.anInt9730 = class298_sub53.readInt() * 771945371;
	}

	Class298_Sub40_Sub13(Class160 class160) {
		super();
		this.aClass160_9732 = class160;

	}

	static void method3518(Matrix43f class222, Matrix4f matrix4f, int i, int i_1_, int i_2_) {
			if (null == Class436.aMatrix4f_5493)
				Class436.aMatrix4f_5493 = new Matrix4f(matrix4f);
			else
				Class436.aMatrix4f_5493.method2142(matrix4f);
			Class436.aClass222_5495.copy(class222);
			Class436.anInt5491 = i * 2082905543;
			Class436.anInt5492 = -130447475 * i_1_;
	}
}
