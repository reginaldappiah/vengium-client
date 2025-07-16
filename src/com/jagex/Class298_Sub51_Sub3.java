package com.jagex;/* Class298_Sub51_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class298_Sub51_Sub3 extends Widget {
	Class409 aClass409_9778;

	public boolean method3573() {
		try {
			SceneObject sceneObject = this.aClass409_9778.method4971();
			if (null != sceneObject) {
				ToMoveScripts.method709(CS2Context.aClass502_6730, interfaceID * -1617025021, -1, sceneObject);
				return true;
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ajl.a(").append(')').toString());
		}
	}

	public Class298_Sub51_Sub3(int interfaceId, int clipped, Class409 class409) {
		super(interfaceId, clipped);
		this.aClass409_9778 = class409;
	}

	public boolean method3579() {
		SceneObject sceneObject = this.aClass409_9778.method4971();
		if (null != sceneObject) {
			ToMoveScripts.method709(CS2Context.aClass502_6730, interfaceID * -1617025021, -1, sceneObject);
			return true;
		}
		return false;
	}
}
