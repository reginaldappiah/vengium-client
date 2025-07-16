package com.jagex;/* Class499 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.game.cache.config.ConfigType;

public class Class499 {
	SoftCache aClass348_6111 = new SoftCache(64);
	Js5FileSystem aClass243_6112;

    public Class499(Js5FileSystem class243) {
		this.aClass243_6112 = class243;
		this.aClass243_6112.getFileSystem((ConfigType.aClass120_1436.type) * -1006924897);
	}

	public void clear() {
		try {
			synchronized (this.aClass348_6111) {
				this.aClass348_6111.clear();
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("uq.f(").append(')').toString());
		}
	}

	public void sweep() {
		try {
			synchronized (this.aClass348_6111) {
				this.aClass348_6111.sweep();
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("uq.p(").append(')').toString());
		}
	}

	public Class493 method6214(int i, int i_0_) {
		try {
			Class493 class493;
			synchronized (this.aClass348_6111) {
				class493 = (Class493) this.aClass348_6111.get((long) i);
			}
			if (class493 != null)
				return class493;
			byte[] is;
			synchronized (this.aClass243_6112) {
				is = (this.aClass243_6112.getFileFromArchive(-1006924897 * ConfigType.aClass120_1436.type, i));
			}
			class493 = new Class493();
			if (null != is)
				class493.readValueLoop(new Buffer(is));
			synchronized (this.aClass348_6111) {
				this.aClass348_6111.put(class493, (long) i);
			}
			return class493;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("uq.a(").append(')').toString());
		}
	}

	public void method6215(int i, int i_1_) {
		try {
			synchronized (this.aClass348_6111) {
				this.aClass348_6111.method4186(i);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("uq.b(").append(')').toString());
		}
	}

	static GameContext[] method6216(byte i) {
		try {
			return (new GameContext[] { GameContext.game3, GameContext.VENGIUM, GameContext.stellardawn, GameContext.game4, GameContext.game5 });
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("uq.a(").append(')').toString());
		}
	}

	static final void method6217(ScriptRuntime runtime) {
		try {
			StaticMethods.method3903();
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("uq.wg(").append(')').toString());
		}
	}

	static final void method6218(IComponentDefinition componentDefinition, IComponentDefinitionCollection IComponentDefinitionCollection, ScriptRuntime runtime) {
		try {
			String string = (String) (runtime.objectStack[(runtime.objectArgs -= 969361751) * -203050393]);
			if (Class298_Sub6.method2863(string, runtime) != null)
				string = string.substring(0, string.length() - 1);
			componentDefinition.onOptHook = Class128_Sub2.method1441(string, runtime);
			componentDefinition.hasScript = true;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("uq.lu(").append(')').toString());
		}
	}
}
