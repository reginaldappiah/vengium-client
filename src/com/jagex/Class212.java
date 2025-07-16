package com.jagex;/* Class212 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class212 {
	public static Class212 aClass212_2421;
	public static Class212 aClass212_2422;
	public static Class212 aClass212_2423;
	public static Class212 aClass212_2424;
	public static Class212 aClass212_2425;
	public static Class212 aClass212_2426;
	public static Class212 aClass212_2427;
	public static Class212 aClass212_2428;
	public static Class212 aClass212_2429;
	public static Class212 aClass212_2430;
	public static Class212 aClass212_2431 = new Class212(8);
	int anInt2432;
	public String method1951() {
			return new StringBuilder().append("_").append(368445667 * this.anInt2432).toString();
	}

	public void method1952() {
			try {
				method1954();
			} catch (Throwable throwable) {

			}
	}

	public Object method1953(Object[] objects) throws Throwable {
			return Class466.method6022(GameClient.applet, method1951(), objects);
	}

	public Object method1954() throws Throwable {
			return Class466.method6021(GameClient.applet, method1951());
	}

	public void method1955(Object[] objects) {
		try {
				method1953(objects);
			} catch (Throwable throwable) {

			}
	}

	Class212(int i) {
		this.anInt2432 = i * -665617205;
	}

	static {
		aClass212_2422 = new Class212(2);
		aClass212_2423 = new Class212(5);
		aClass212_2427 = new Class212(1);
		aClass212_2425 = new Class212(4);
		aClass212_2426 = new Class212(11);
		aClass212_2428 = new Class212(7);
		aClass212_2421 = new Class212(9);
		aClass212_2429 = new Class212(10);
		aClass212_2430 = new Class212(6);
		aClass212_2424 = new Class212(3);
	}

	static final void method1957() {
			if (GameClient.aBoolean8638)
				aClass212_2428.method1952();
	}
}
