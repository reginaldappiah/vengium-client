package com.jagex;/* Class327 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import com.jagex.utils.TimeUtils;

import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.util.Iterator;

public class ConfigDefinitions {

	public static long time;
	public int startingBit;
	public int realConfigID;
	public int endingBit;
	static Buffer aClass298_Sub53_3471;

	void parseBuffer(Buffer buffer) {
		try {
			for (;;) {
				int opcode = buffer.readUByte();
				if (opcode == 0) {
					break;
				}
				parseOpcode(buffer, opcode);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("nq.a(").append(')').toString());
		}
	}

	void parseOpcode(Buffer buffer, int opcode) {
		if (opcode == 1) {
			realConfigID = buffer.readUShort() * 2019336269;
			startingBit = buffer.readUByte() * 2083582845;
			endingBit = buffer.readUByte() * 627221103;
		}
	}

	ConfigDefinitions() {
		/* empty */
	}

	public static void method3977(Region class331, GraphicsToolkit class_ra) {
		try {
			Iterator iterator = Class344.aList3683.iterator();
			while (iterator.hasNext()) {
				ParticleSystem particleSystem = (ParticleSystem) iterator.next();
				if (particleSystem.aBoolean3771) {
					particleSystem.method4228(class331, class_ra);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("nq.b(").append(')').toString());
		}
	}

	static final void method3978(IComponentDefinition componentDefinition, ScriptRuntime runtime) {
			String string = (String) (runtime.objectStack[(runtime.objectArgs -= 969361751) * -203050393]);
			if (Class298_Sub6.method2863(string, runtime) != null) {
				string = string.substring(0, string.length() - 1);
			}
			componentDefinition.onDragHook = Class128_Sub2.method1441(string, runtime);
			componentDefinition.hasScript = true;
	}

	public static void method3979(boolean bool, byte[] data) {
		try {
			if (aClass298_Sub53_3471 == null) {
				aClass298_Sub53_3471 = new Buffer(20000);
			}
			aClass298_Sub53_3471.writeBytes(data, 0, data.length);
			if (bool) {
				Class431.method5763(aClass298_Sub53_3471.buffer);
				Class474.aClass343_Sub1Array5975 = new Class343_Sub1[1017276543 * Class24.anInt9950];
				int i_2_ = 0;
				for (int index = -1648308965 * StaticMethods.anInt5190; index <= -499146007 * StaticMethods.anInt3630; index++) {
					Class343_Sub1 class343_sub1 = StaticMethods.method2105(index);
					if (class343_sub1 != null) {
						Class474.aClass343_Sub1Array5975[i_2_++] = class343_sub1;
					}
				}
				Class474.aBoolean5974 = false;
				time = TimeUtils.getTime() * -4824082235216898149L;
				aClass298_Sub53_3471 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("nq.p(").append(')').toString());
		}
	}

	static final boolean method3980(char c) {
		try {
			return c == '\u00a0' || c == ' ' || c == '_' || '-' == c;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("nq.b(").append(')').toString());
		}
	}

	static Class298_Sub32 method3981(Buffer class298_sub53) {
		try {
			class298_sub53.readUByte();
			int i_4_ = class298_sub53.readUByte();
			Class298_Sub32 class298_sub32 = Class234.method2182(i_4_, (byte) 11);
			class298_sub32.anInt7381 = class298_sub53.readUByte() * -2127296983;
			int i_5_ = class298_sub53.readUByte();
			for (int i_6_ = 0; i_6_ < i_5_; i_6_++) {
				int i_7_ = class298_sub53.readUByte();
				class298_sub32.method3137(i_7_, class298_sub53);
			}
			class298_sub32.method3133(-245700254);
			return class298_sub32;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("nq.u(").append(')').toString());
		}
	}

	static final void method3982(ScriptRuntime class403) {
		try {
			String string = "";
			if (Class365_Sub1_Sub5_Sub2.aClipboard9941 != null) {
				Transferable transferable = Class365_Sub1_Sub5_Sub2.aClipboard9941.getContents(null);
				if (transferable != null) {
					try {
						string = ((String) transferable.getTransferData(DataFlavor.stringFlavor));
						if (null == string) {
							string = "";
						}
					} catch (Exception exception) {
						/* empty */
					}
				}
			}
			class403.objectStack[((class403.objectArgs += 969361751) * -203050393 - 1)] = string;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("nq.afl(").append(')').toString());
		}
	}

	static void method3983() {
		try {
			Class436.aMenuOption_5466 = (new MenuOption(Tradution.CANCEL.translate(GameLanguage.CURRENT_LANGUAGE), "", -1808468501 * GameClient.targetLeaveCursor, 1006, -1, 0L, 0, 0, true, false, 0L, true));
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("nq.k(").append(')').toString());
		}
	}

	static final void method3984(ScriptRuntime class403) {
		try {
			int i_8_ = ((GameClient.anIntArrayArrayArray8767[(class403.integerStack[((class403.integerStackOffset -= -391880689) * 681479919)])]).length >> 1);
			class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919 - 1)] = i_8_;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("nq.afz(").append(')').toString());
		}
	}
}
