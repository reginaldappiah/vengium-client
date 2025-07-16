package com.jagex;/* Class298_Sub31_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class ShaderProgram extends Class298_Sub31 {
	Class100 aClass100_9314;
	String aString9315;
	String aString9316;
	int anInt9317;
	Class100 aClass100_9318;

	public abstract boolean method3116(int i);

	public abstract int method3117(int i);

	public String toString() {
			String string = new StringBuilder().append( this.aClass100_9318.toString()).append(" ").append( this.aString9315).toString();
			if ( this.aString9316 != null && !"".equals( this.aString9316))
				string = new StringBuilder().append(string).append(" : ").append( this.aString9316).toString();
			return string;
	}

	public Class100 method3118(int i) {
			return this.aClass100_9318;
	}

	public abstract int method3119(int i);

	public int method3120(int i) {
		if ( this.aClass100_9318 != Class100.aClass100_1076)
				throw new IllegalArgumentException_Sub1(this, this.aClass100_9318.toString().toLowerCase());
			return 890433517 * this.anInt9317;
	}

	String method3121(byte i) {
	
			return this.aString9315;
			
	}

	ShaderProgram(Class114 class114) {
		 this.aClass100_9318 = class114.aClass100_1375;
		
		 this.aString9315 = class114.aString1377;
		 if (aString9315.contains("tex")) {
		 System.out.println("aString9315: " + aString9315);
		 }
		 this.aString9316 = class114.aString1378;
		 if (aString9316.contains("tex")) {
		 System.out.println("aString9316: " + aString9316);
		 }
		 this.anInt9317 = class114.anInt1374 * 1232308479;
		 this.aClass100_9314 = class114.aClass100_1376;
	}

	public Class100 method3122(int i) {
			return this.aClass100_9314;
	}

	public abstract int method3123(int i);

	public abstract boolean method3124(int i);
}
