package com.jagex;/* Class82_Sub11 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.utils.CameraUtils;

public class Class82_Sub11 extends Class82 {
	int anInt6859;
	String aString6860;

	public void method866() {
			if (577335585 * GameClient.cutsceneID != -1)
				Class70.method803(577335585 * GameClient.cutsceneID, this.aString6860, 607881685 * this.anInt6859);
	}

	Class82_Sub11(Buffer buffer) {
		super(buffer);
		this.aString6860 = buffer.readString();
		System.out.println("String astring6860: " + aString6860);
		this.anInt6859 = buffer.readUShort() * -602577027;
	}

	public void method868() {
		if (577335585 * GameClient.cutsceneID != -1)
			Class70.method803(577335585 * GameClient.cutsceneID, this.aString6860, 607881685 * this.anInt6859);
	}

	public void method869() {
		if (577335585 * GameClient.cutsceneID != -1)
			Class70.method803(577335585 * GameClient.cutsceneID, this.aString6860, 607881685 * this.anInt6859);
	}

	public static final void stopCameraShake() {
			for (int index = 0; index < 5; index++)
				GameClient.enabledCameraShakeSlots[index] = false;
			GameClient.anInt8768 = -1723181617;
			GameClient.anInt8769 = 2694169;
			Class128_Sub1.anInt8556 = 0;
			Class427.anInt5362 = 0;
			CameraUtils.cameraType = 1355934404;
			Class418.anInt5339 = -1001372047;
			Class100.anInt1081 = 178575833;
	}

}
