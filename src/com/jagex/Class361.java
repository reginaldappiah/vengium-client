package com.jagex;/* Class361 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class361 {
	static int[] anIntArray3913;
	public static int anInt3914;

	Class361() throws Throwable {
		throw new Error();
	}

	static final void method4303(ScriptRuntime class403, int i) {
		try {
			IComponentScripter IComponentScripter = (class403.currentInstrBool ? class403.aIComponentScripter_5247 : class403.aIComponentScripter_5246);
			IComponentDefinition class105 = IComponentScripter.componentDefinition;
			IComponentDefinitionCollection IComponentDefinitionCollection = IComponentScripter.IComponentDefinitionCollection;
			ToMoveScripts.method2131(class105, class403);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("pa.mb(").append(')').toString());
		}
	}

	public static int translateSymbolOffsets(CharSequence charsequence, int start, int end, byte[] data, int offset) {
		try {
			int length = end - start;
			for (int position = 0; position < length; position++) {
				char c = charsequence.charAt(start + position);
				if (c > 0 && c < '\u0080' || c >= '\u00a0' && c <= '\u00ff')
					data[offset + position] = (byte) c;
				else if (c == '\u20ac')
					data[offset + position] = (byte) -128;
				else if (c == '\u201a')
					data[position + offset] = (byte) -126;
				else if (c == '\u0192')
					data[offset + position] = (byte) -125;
				else if (c == '\u201e')
					data[position + offset] = (byte) -124;
				else if (c == '\u2026')
					data[offset + position] = (byte) -123;
				else if ('\u2020' == c)
					data[offset + position] = (byte) -122;
				else if ('\u2021' == c)
					data[position + offset] = (byte) -121;
				else if ('\u02c6' == c)
					data[offset + position] = (byte) -120;
				else if (c == '\u2030')
					data[offset + position] = (byte) -119;
				else if (c == '\u0160')
					data[offset + position] = (byte) -118;
				else if ('\u2039' == c)
					data[position + offset] = (byte) -117;
				else if ('\u0152' == c)
					data[position + offset] = (byte) -116;
				else if ('\u017d' == c)
					data[offset + position] = (byte) -114;
				else if ('\u2018' == c)
					data[position + offset] = (byte) -111;
				else if (c == '\u2019')
					data[position + offset] = (byte) -110;
				else if (c == '\u201a')
					data[offset + position] = (byte) -109;
				else if (c == '\u201d')
					data[position + offset] = (byte) -108;
				else if (c == '\u2022')
					data[offset + position] = (byte) -107;
				else if (c == '\u2013')
					data[position + offset] = (byte) -106;
				else if ('\u2014' == c)
					data[offset + position] = (byte) -105;
				else if ('\u02dc' == c)
					data[position + offset] = (byte) -104;
				else if (c == '\u2122')
					data[position + offset] = (byte) -103;
				else if ('\u0161' == c)
					data[position + offset] = (byte) -102;
				else if ('\u203a' == c)
					data[position + offset] = (byte) -101;
				else if ('\u0153' == c)
					data[position + offset] = (byte) -100;
				else if ('\u017e' == c)
					data[offset + position] = (byte) -98;
				else if ('\u0178' == c)
					data[position + offset] = (byte) -97;
				else
					data[offset + position] = (byte) 63;
			}
			return length;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("pa.k(").append(')').toString());
		}
	}

	static void method4305(ScriptRuntime class403, byte i) {
		try {
			class403.integerStack[class403.integerStackOffset * 681479919 - 1] = (Class316.aClass362_3318.getQuestType((class403.integerStack[681479919 * class403.integerStackOffset - 1])).method4562(Class128.playerVarsProvider) ? 1 : 0);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("pa.j(").append(')').toString());
		}
	}

	static void method4306(String[] strings, int[] data, int start, int end) {
		try {
			if (start < end) {
				int middle = (end + start) / 2;
				int newStart = start;
				String string = strings[middle];
				strings[middle] = strings[end];
				strings[end] = string;
				int newMiddle = data[middle];
				data[middle] = data[end];
				data[end] = newMiddle;
				for (int index = start; index < end; index++) {
					if (null == string || (null != strings[index] && strings[index].compareTo(string) < (index & 0x1))) {
						String string_11_ = strings[index];
						strings[index] = strings[newStart];
						strings[newStart] = string_11_;
						int i_12_ = data[index];
						data[index] = data[newStart];
						data[newStart++] = i_12_;
					}
				}
				strings[end] = strings[newStart];
				strings[newStart] = string;
				data[end] = data[newStart];
				data[newStart] = newMiddle;
				method4306(strings, data, start, newStart - 1);
				method4306(strings, data, 1 + newStart, end);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("pa.p(").append(')').toString());
		}
	}
}
