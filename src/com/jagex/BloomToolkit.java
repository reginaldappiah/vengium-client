package com.jagex;/* BloomToolkit - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class BloomToolkit {
	protected NativeToolkit toolkit;
	boolean aBoolean1586;

	abstract boolean method1617();

	abstract boolean method1618();

	boolean method1619() {
		return method1618();
	}

	abstract void method1620();

	abstract void method1621(int i, int i_0_);

	abstract void method1622();

	abstract void method1623(int i);

	int method1624() {
		return 1;
	}

	int method1625() {
		return 0;
	}

	boolean method1626() {
		return this.aBoolean1586;
	}

	void method1627() {
		/* empty */
	}

	abstract boolean method1628();

	abstract void method1629(int i, int i_1_);

	abstract void method1630(int i, FrameBufferContext class52_sub1, Interface9_Impl2 interface9_impl2, Interface8_Impl1_Impl2 interface8_impl1_impl2, Interface9_Impl2 interface9_impl2_2_);

	abstract void method1631(int i);

	abstract void method1632(int i);

	abstract void method1633(int i, FrameBufferContext class52_sub1, Interface9_Impl2 interface9_impl2, Interface8_Impl1_Impl2 interface8_impl1_impl2, Interface9_Impl2 interface9_impl2_3_);

	abstract boolean method1634();

	BloomToolkit(NativeToolkit toolkit) {
		this.toolkit = toolkit;
	}
}
