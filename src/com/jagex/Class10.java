package com.jagex;/* Class10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

public class Class10 {
	static int entitiesInRegion;
	static int anInt130;
	static byte[] aByteArray131 = new byte[2048];
	static byte[] playersMovementTypes = new byte[2048];
	static Buffer[] aClass298_Sub53Array133 = new Buffer[2048];
	static int[] entities;
	static int[] players;
	static int anInt136 = 1;
	static int anInt137 = 2;
	static Class410[] aClass410Array138;
	static int anInt139;
	static int[] anIntArray140;

	static {
		entitiesInRegion = 0;
		players = new int[2048];
		anInt130 = 0;
		entities = new int[2048];
		aClass410Array138 = new Class410[2048];
		anInt139 = 0;
		anIntArray140 = new int[2048];
	}

	Class10() throws Throwable {
		throw new Error();
	}

	public static void setRandom(Buffer buffer, byte i) {
		try {
			byte[] is = new byte[24];
			try {
				GameShell.aBufferedFile_6499.seek(0L);
				GameShell.aBufferedFile_6499.method6136(is, 430767444);
				int i_0_;
				for (i_0_ = 0; i_0_ < 24; i_0_++) {
					if (0 != is[i_0_]) {
						if (i != 1) {
							/* empty */
						}
						break;
					}
				}
				if (i_0_ >= 24)
					throw new IOException();
			} catch (Exception exception) {
				for (int i_1_ = 0; i_1_ < 24; i_1_++)
					is[i_1_] = (byte) -1;
			}
			buffer.writeBytes(is, 0, 24);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ak.r(").append(')').toString());
		}
	}

	static final void method323(ScriptRuntime runtime) {
		try {
			int interfaceHash = runtime.integerStack[(runtime.integerStackOffset -= -391880689) * 681479919];
			IComponentDefinition class105 = IComponentDefinition.getInterfaceComponent(interfaceHash);
			//System.out.println("METHOD 323, INTERFACE ID: " + (tertiary >> 16) + ", Component Definitions: " + class105);
			IComponentDefinitionCollection interfaceComponentDefinitionSize = IComponentDefinition.getIComponentDefinitionCollections[interfaceHash >> 16];
			Class194.method1870(class105, interfaceComponentDefinitionSize, runtime, (byte) -123);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ak.jn(").append(')').toString());
		}
	}

	static final void method324(ScriptRuntime runtime) {
		try {
			StaticMethods.method4295((runtime.integerStack[(runtime.integerStackOffset -= -391880689) * 681479919]));
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ak.aef(").append(')').toString());
		}
	}

	static final void method325(ScriptRuntime class403, byte i) {
		try {
			System.out.println("gg");
			System.out.println(class403.objectStack[((class403.objectArgs -= 969361751) * -203050393)]);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ak.afw(").append(')').toString());
		}
	}
}
