package com.jagex;/* Class82_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class82_Sub5 extends Class82 {
	String message;
	int anInt6835;
	int anInt6836;
	int duration;

	public void method868() {
		Class87.aClass94Array794[796511923 * this.anInt6836].method1015().setNextForceTalk(this.message, 1847855163 * this.anInt6835, 0, -1158638155 * this.duration);
	}

	public void method866() {
			Class87.aClass94Array794[796511923 * this.anInt6836].method1015().setNextForceTalk(this.message, 1847855163 * this.anInt6835, 0, -1158638155 * this.duration);
	}

	Class82_Sub5(Buffer buffer) {
		super(buffer);
		this.anInt6836 = buffer.readUShort() * -1921544069;
		this.message = buffer.readString();
		this.anInt6835 = buffer.readInt() * -170815245;
		this.duration = buffer.readUShort() * 2118217885;
	}

	public void method869() {
		Class87.aClass94Array794[796511923 * this.anInt6836].method1015().setNextForceTalk(this.message, 1847855163 * this.anInt6835, 0, -1158638155 * this.duration);
	}

}
