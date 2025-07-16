package com.jagex;/* Class298_Sub29 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class ObjectNode extends Node {
	public Object nodeObject;

	public ObjectNode(Object object) {
		nodeObject = object;
	}

	static final void method3111(ScriptRuntime runtime, byte i) {
		try {
			runtime.integerStack[(runtime.integerStackOffset += -391880689) * 681479919 - 1] = GameClient.anInt8913 * -1710848853;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("abn.acb(").append(')').toString());
		}
	}
}
