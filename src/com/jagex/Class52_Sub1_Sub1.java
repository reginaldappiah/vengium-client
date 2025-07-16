package com.jagex;/* Class52_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class52_Sub1_Sub1 extends FrameBufferContext {
	JavaGraphicsToolkit aClass_ra_Sub1_9052;
	Class12 aClass12_9053;
	Class24 aClass24_9054;
	int anInt9055;
	int anInt9056 = 0;

	public void method563(int i, Interface8_Impl1_Impl1 interface8_impl1_impl1) {
		try {
			Class24 class24 = (Class24) interface8_impl1_impl1;
			if (null != this.aClass12_9053 && class24 != null && ((class24.anInt9947 * 215983317 != (this.aClass12_9053.anInt9943) * 1026825677) || (1671547161 * this.aClass12_9053.anInt9944 != 467687639 * class24.anInt9948)))
				throw new RuntimeException();
			this.aClass24_9054 = class24;
			if (null != class24) {
				this.anInt9056 = 1103799935 * class24.anInt9947;
				this.anInt9055 = class24.anInt9948 * 1322627015;
			} else if (this.aClass12_9053 == null) {
				this.anInt9056 = 0;
				this.anInt9055 = 0;
			}
			if (this == this.aClass_ra_Sub1_9052.getFrameContext())
				attach();
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("aeu.z(").append(')').toString());
		}
	}

	public int getWidth() {
		try {
			return this.anInt9056 * 494047915;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("aeu.a(").append(')').toString());
		}
	}

    Class52_Sub1_Sub1(JavaGraphicsToolkit class_ra_sub1) {
		this.anInt9055 = 0;
		this.aClass_ra_Sub1_9052 = class_ra_sub1;
	}

	public boolean method560() {
		try {
			return true;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("aeu.h(").append(')').toString());
		}
	}

	public void method558(Interface8_Impl1_Impl2 interface8_impl1_impl2) {
		try {
			Class12 class12 = (Class12) interface8_impl1_impl2;
			if (this.aClass24_9054 != null && class12 != null && ((class12.anInt9943 * 1026825677 != (this.aClass24_9054.anInt9947) * 215983317) || ((this.aClass24_9054.anInt9948) * 467687639 != 1671547161 * class12.anInt9944)))
				throw new RuntimeException();
			this.aClass12_9053 = class12;
			if (class12 != null) {
				this.anInt9056 = class12.anInt9943 * 1931039079;
				this.anInt9055 = class12.anInt9944 * 1986423081;
			} else if (null == this.aClass24_9054) {
				this.anInt9056 = 0;
				this.anInt9055 = 0;
			}
			if (this == this.aClass_ra_Sub1_9052.getFrameContext())
				attach();
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("aeu.n(").append(')').toString());
		}
	}

	public int getHeight() {
		try {
			return -1236783503 * this.anInt9055;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("aeu.f(").append(')').toString());
		}
	}

	public void destroy() {
		try {
			/* empty */
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("aeu.b(").append(')').toString());
		}
	}

    public void method561(int i, Interface8_Impl1_Impl1 interface8_impl1_impl1) {
		Class24 class24 = (Class24) interface8_impl1_impl1;
		if (null != this.aClass12_9053 && class24 != null && ((class24.anInt9947 * 215983317 != (this.aClass12_9053.anInt9943) * 1026825677) || (1671547161 * this.aClass12_9053.anInt9944 != 467687639 * class24.anInt9948)))
			throw new RuntimeException();
		this.aClass24_9054 = class24;
		if (null != class24) {
			this.anInt9056 = 1103799935 * class24.anInt9947;
			this.anInt9055 = class24.anInt9948 * 1322627015;
		} else if (this.aClass12_9053 == null) {
			this.anInt9056 = 0;
			this.anInt9055 = 0;
		}
		if (this == this.aClass_ra_Sub1_9052.getFrameContext())
			attach();
	}

	public void method562(int i, Interface8_Impl1_Impl1 interface8_impl1_impl1) {
		Class24 class24 = (Class24) interface8_impl1_impl1;
		if (null != this.aClass12_9053 && class24 != null && ((class24.anInt9947 * 215983317 != (this.aClass12_9053.anInt9943) * 1026825677) || (1671547161 * this.aClass12_9053.anInt9944 != 467687639 * class24.anInt9948)))
			throw new RuntimeException();
		this.aClass24_9054 = class24;
		if (null != class24) {
			this.anInt9056 = 1103799935 * class24.anInt9947;
			this.anInt9055 = class24.anInt9948 * 1322627015;
		} else if (this.aClass12_9053 == null) {
			this.anInt9056 = 0;
			this.anInt9055 = 0;
		}
		if (this == this.aClass_ra_Sub1_9052.getFrameContext())
			attach();
	}

	public void method564(Interface8_Impl1_Impl2 interface8_impl1_impl2) {
		Class12 class12 = (Class12) interface8_impl1_impl2;
		if (this.aClass24_9054 != null && class12 != null && ((class12.anInt9943 * 1026825677 != (this.aClass24_9054.anInt9947) * 215983317) || ((this.aClass24_9054.anInt9948) * 467687639 != 1671547161 * class12.anInt9944)))
			throw new RuntimeException();
		this.aClass12_9053 = class12;
		if (class12 != null) {
			this.anInt9056 = class12.anInt9943 * 1931039079;
			this.anInt9055 = class12.anInt9944 * 1986423081;
		} else if (null == this.aClass24_9054) {
			this.anInt9056 = 0;
			this.anInt9055 = 0;
		}
		if (this == this.aClass_ra_Sub1_9052.getFrameContext())
			attach();
	}

	public boolean method557() {
		return true;
	}

	public boolean method559() {
		return true;
	}

	public boolean method565() {
		return true;
	}

    boolean attach() {
		try {
			this.aClass_ra_Sub1_9052.method5207(494047915 * this.anInt9056, -1236783503 * this.anInt9055, (this.aClass24_9054 == null ? null : (this.aClass24_9054.anIntArray9949)), (this.aClass12_9053 == null ? null : (this.aClass12_9053.aFloatArray9945)));
			return true;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("aeu.p(").append(')').toString());
		}
	}

    boolean detach() {
		try {
			return true;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("aeu.i(").append(')').toString());
		}
	}

    static final void method568(IComponentDefinition class105, IComponentDefinitionCollection IComponentDefinitionCollection, ScriptRuntime class403, byte i) {
		try {
			class105.tiling = (class403.integerStack[(class403.integerStackOffset -= -391880689) * 681479919]) == 1;
			StaticMethods.updateComponentTick(class105);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("aeu.dz(").append(')').toString());
		}
	}
}
