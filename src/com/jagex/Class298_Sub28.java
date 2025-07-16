package com.jagex;/* Class298_Sub28 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.*;

public class Class298_Sub28 extends Node {
	public byte[] aByteArray7365;

	public Class298_Sub28(byte[] is) {
		aByteArray7365 = is;
	}

	static final void method3108(ScriptRuntime runtime) {
		try {
			runtime.objectLocals[(runtime.integerstack[runtime.integerPos * 1883543357])] = (runtime.objectStack[((runtime.objectArgs -= 969361751) * -203050393)]);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("abm.af(").append(')').toString());
		}
	}

	public static final void method3109(byte i) {
		try {
			if (1 != -707576455 * Class360.loginStep) {
				Class360.activeConnection.stopConnection();
				IComponentSettings.method3503();
				StaticMethods.method4693();
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("abm.i(").append(')').toString());
		}
	}

	static String method3110(Throwable throwable, byte i) throws IOException {
		try {
			String string;
			if (throwable instanceof RuntimeException_Sub2) {
				RuntimeException_Sub2 runtimeexception_sub2 = (RuntimeException_Sub2) throwable;
				string = new StringBuilder().append(runtimeexception_sub2.aString6308).append(" | ").toString();
				throwable = (runtimeexception_sub2.aThrowable6309);
			} else
				string = "";
			StringWriter stringwriter = new StringWriter();
			PrintWriter printwriter = new PrintWriter(stringwriter);
			throwable.printStackTrace(printwriter);
			printwriter.close();
			String string_0_ = stringwriter.toString();
			BufferedReader bufferedreader = new BufferedReader(new StringReader(string_0_));
			String string_1_ = bufferedreader.readLine();
			for (;;) {
				String string_2_ = bufferedreader.readLine();
				if (null == string_2_) {
					if (i != 10)
						throw new IllegalStateException();
					break;
				}
				int i_3_ = string_2_.indexOf('(');
				int i_4_ = string_2_.indexOf(')', i_3_ + 1);
				String string_5_;
				if (-1 != i_3_)
					string_5_ = string_2_.substring(0, i_3_);
				else
					string_5_ = string_2_;
				string_5_ = string_5_.trim();
				string_5_ = string_5_.substring(string_5_.lastIndexOf(' ') + 1);
				string_5_ = string_5_.substring(string_5_.lastIndexOf('\t') + 1);
				string = new StringBuilder().append(string).append(string_5_).toString();
				if (i_3_ != -1 && -1 != i_4_) {
					int i_6_ = string_2_.indexOf(".java:", i_3_);
					if (i_6_ >= 0)
						string = new StringBuilder().append(string).append(string_2_.substring(5 + i_6_, i_4_)).toString();
				}
				string = new StringBuilder().append(string).append(' ').toString();
			}
			string = new StringBuilder().append(string).append("| ").append(string_1_).toString();
			return string;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("abm.b(").append(')').toString());
		}
	}
}
