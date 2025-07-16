package com.jagex;/* Class235 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class235 {
	public Vector3f trans;
	public Quaternion aQuaternion_2600;

	public Class235(Class235 class235_0_) {
		aQuaternion_2600 = new Quaternion();
		trans = new Vector3f();
		method2186(class235_0_);
	}

	public final void method2185() {
		aQuaternion_2600.method2024();
		trans.getNegativeVector3f();
		trans.method2014(aQuaternion_2600);
	}

	public Class235() {
		aQuaternion_2600 = new Quaternion();
		trans = new Vector3f();
	}

	public void method2186(Class235 class235_1_) {
		aQuaternion_2600.method2022(class235_1_.aQuaternion_2600);
		trans.setVector3fOfficial(class235_1_.trans);
	}

	public final void method2187(Class235 class235_2_) {
		aQuaternion_2600.method2026(class235_2_.aQuaternion_2600);
		trans.method2014(class235_2_.aQuaternion_2600);
		trans.addVector3f(class235_2_.trans);
	}
}
