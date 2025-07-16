package com.jagex;/* Class298_Sub31 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class298_Sub31 extends Node {
	int anInt7369;
	String aString7370;

	Class298_Sub31() {
		/* empty */
	}

	static final void method3114(ScriptRuntime class403, int i) {
			class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919 - 1)] = Class525.aBoolean6300 ? 1 : 0;
	}

	static final String method3115(String string, String string_0_, String string_1_, int i) {
			for (int i_2_ = string.indexOf(string_0_); i_2_ != -1; i_2_ = string.indexOf(string_0_, i_2_ + string_1_.length()))
				string = new StringBuilder().append(string.substring(0, i_2_)).append(string_1_).append(string.substring(i_2_ + string_0_.length())).toString();
			System.out.println("Shader string: " + string);
			return string;
	}
}
