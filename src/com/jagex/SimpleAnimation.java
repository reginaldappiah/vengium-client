package com.jagex;/* Class438_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.game.cache.definition.animation.AnimationDefinition;

public class SimpleAnimation extends Animator {
	void method5837(AnimationDefinition class391, int i) {
		try {
			StaticMethods.method2119(class391, i);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("aem.l(").append(')').toString());
		}
	}

	public SimpleAnimation() {
		super(true);
	}

	void method5847(AnimationDefinition class391, int i) {
		StaticMethods.method2119(class391, i);
	}
}
