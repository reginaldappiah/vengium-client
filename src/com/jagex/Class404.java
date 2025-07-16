package com.jagex;/* Class404 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.game.cache.config.Js5Configs;
import com.jagex.utils.StringUtils;
import jaclib.ping.Ping;

import java.net.InetAddress;
import java.util.LinkedList;
import java.util.Queue;

public class Class404 implements Runnable {
	Thread aThread5263;
	Object anObject5264 = new Object();
	Queue aQueue5265 = new LinkedList();

	public Class396 method4946(String string, byte i) {
		try {
			if (this.aThread5263 == null)
				throw new IllegalStateException("");
			if (string == null)
				throw new IllegalArgumentException("");
			Class396 class396 = new Class396(string);
			method4947(class396, 1206892874);
			return class396;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("qu.a(").append(')').toString());
		}
	}

	void method4947(Object object, int i) {
		try {
			synchronized (this.aQueue5265) {
				this.aQueue5265.add(object);
				this.aQueue5265.notify();
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("qu.b(").append(')').toString());
		}
	}

	public void method4948() {
		try {
			if (this.aThread5263 != null) {
				method4947(this.anObject5264, 1206892874);
				try {
					this.aThread5263.join();
				} catch (InterruptedException interruptedexception) {
					/* empty */
				}
				this.aThread5263 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("qu.f(").append(')').toString());
		}
	}

	public Class404() {
		this.aThread5263 = new Thread(this);
		this.aThread5263.setDaemon(true);
		this.aThread5263.start();
	}

	public void run() {
		try {
			for (;;) {
				Class396 class396;
				synchronized (this.aQueue5265) {
					Object object;
					for (object = this.aQueue5265.poll(); null == object; object = this.aQueue5265.poll()) {
						try {
							this.aQueue5265.wait();
						} catch (InterruptedException interruptedexception) {
							/* empty */
						}
					}
					if (this.anObject5264 == object)
						break;
					class396 = (Class396) object;
				}
				int i;
				try {
					byte[] address = InetAddress.getByName(class396.aString5194).getAddress();
					i = Ping.a(address[0], address[1], address[2], address[3], 1000L);
				} catch (Throwable throwable) {
					i = 1000;
				}
				class396.address = i * 842879005;
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("qu.run(").append(')').toString());
		}
	}

	static final void method4949(ScriptRuntime runtime) {
			int interfaceHash = (runtime.integerstack[runtime.integerPos * 1883543357]);
			Class374.interfaceGCValue[interfaceHash] = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
			IComponentUpdateNode.appendGlobalConfigUpdate(interfaceHash);
			GameClient.aBoolean8736 |= Class254.interfaceGC[interfaceHash];
	}

	static final void method4950(ScriptRuntime runtime) {
		try {
			int i_1_ = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
			runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = (Js5Configs.itemList.getItemDefinitions(i_1_).equipSlot) * -906758929;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("qu.aai(").append(')').toString());
		}
	}

	static final void method4951(ScriptRuntime runtime) {
		try {
			runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = SettingsManager.settingsManager.desiredToolkit.getValue();
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("qu.akf(").append(')').toString());
		}
	}

	public static String method4952(long l) {
		try {
			if (l <= 0L || l >= 6582952005840035281L)
				return null;
			if (l % 37L == 0L)
				return null;
			int i = 0;
			for (long l_2_ = l; l_2_ != 0L; l_2_ /= 37L)
				i++;
			StringBuilder stringbuilder = new StringBuilder(i);
			while (0L != l) {
				long l_3_ = l;
				l /= 37L;
				char c = StringUtils.aCharArray5342[(int) (l_3_ - 37L * l)];
				if (c == '_') {
					int i_4_ = stringbuilder.length() - 1;
					stringbuilder.setCharAt(i_4_, Character.toUpperCase(stringbuilder.charAt(i_4_)));
					c = '\u00a0';
				}
				stringbuilder.append(c);
			}
			stringbuilder.reverse();
			stringbuilder.setCharAt(0, Character.toUpperCase(stringbuilder.charAt(0)));
			return stringbuilder.toString();
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("qu.b(").append(')').toString());
		}
	}

	static final void method4953(ScriptRuntime runtime) {
		try {
			IComponentScripter IComponentScripter = (runtime.currentInstrBool ? runtime.aIComponentScripter_5247 : runtime.aIComponentScripter_5246);
			IComponentDefinition class105 = IComponentScripter.componentDefinition;
			runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = -1232467723 * class105.itemID;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("qu.pv(").append(')').toString());
		}
	}

	static final void method4954(ScriptRuntime class403) {
		try {
			IComponentScripter IComponentScripter = (class403.currentInstrBool ? class403.aIComponentScripter_5247 : class403.aIComponentScripter_5246);
			IComponentDefinition class105 = IComponentScripter.componentDefinition;
			IComponentDefinitionCollection IComponentDefinitionCollection = IComponentScripter.IComponentDefinitionCollection;
			ToMoveIComponentScripts.getLineWidth(class105, class403);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("qu.do(").append(')').toString());
		}
	}
}
