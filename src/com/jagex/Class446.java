package com.jagex;/* Class446 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;

public class Class446 implements Iterator {
	Class453 aClass453_5611;
	Node aClass298_5612;
	Node aClass298_5613 = null;
	static int anInt5614;

	public void method5898(Class453 class453, int i) {
		try {
			this.aClass453_5611 = class453;
			this.aClass298_5612 = this.aClass453_5611.aClass298_5643.previous;
			this.aClass298_5613 = null;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("sk.d(").append(')').toString());
		}
	}

	void method5899(int i) {
		try {
			this.aClass298_5612 = this.aClass453_5611.aClass298_5643.previous;
			this.aClass298_5613 = null;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("sk.u(").append(')').toString());
		}
	}

	public Node getNext(int i) {
		try {
			method5899(1114782715);
			return (Node) next();
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("sk.posX(").append(')').toString());
		}
	}

	public boolean hasNext() {
		try {
			return (this.aClass298_5612 != this.aClass453_5611.aClass298_5643);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("sk.hasNext(").append(')').toString());
		}
	}

	public void remove() {
		try {
			if (null == ( this).aClass298_5613)
				throw new IllegalStateException();
			this.aClass298_5613.unlink();
			this.aClass298_5613 = null;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("sk.remove(").append(')').toString());
		}
	}

	public Class446(Class453 class453) {
		this.aClass453_5611 = class453;
		this.aClass298_5612 = ( this).aClass453_5611.aClass298_5643.previous;
		this.aClass298_5613 = null;
	}

	public Object next() {
		try {
			Node class298 = this.aClass298_5612;
			if (this.aClass453_5611.aClass298_5643 == class298) {
				class298 = null;
				this.aClass298_5612 = null;
			} else
				this.aClass298_5612 = class298.previous;
			this.aClass298_5613 = class298;
			return class298;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("sk.next(").append(')').toString());
		}
	}

	static final void method5901(ScriptRuntime runtime) {
		try {
			int i_0_ = ((runtime).integerStack[(((runtime).integerStackOffset -= -391880689) * 681479919)]);
			if (GameClient.fullscreen) {
				Class456[] class456s = Class271.method2545((byte) 18);
				runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = 28445523 * class456s[i_0_].anInt5663;
				runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = 262154323 * class456s[i_0_].anInt5665;
			} else {
				runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = 0;
				runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = 0;
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("sk.aek(").append(')').toString());
		}
	}

	static final void method5902(ScriptRuntime class403, int i) {
		try {
			class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919 - 1)] = (Class374.interfaceGCValue[( class403.integerstack[1883543357 * ( class403).integerPos])]);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("sk.aq(").append(')').toString());
		}
	}
}
