package com.jagex;/* Class427 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.game.cache.config.ConfigType;

public class Class427 {
	SoftCache aClass348_5360 = new SoftCache(64);
	Js5FileSystem aClass243_5361;
	static int anInt5362;

	public void clear() {
		try {
			synchronized (this.aClass348_5360) {
				this.aClass348_5360.clear();
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("rr.f(").append(')').toString());
		}
	}

	public Class427(Js5FileSystem class243) {
		this.aClass243_5361 = class243;
		if (this.aClass243_5361 != null)
			this.aClass243_5361.getFileSystem(ConfigType.aClass120_1430.type * -1006924897);
	}

	public void method5746(int i, int i_0_) {
		try {
			synchronized (this.aClass348_5360) {
				this.aClass348_5360.method4186(i);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("rr.b(").append(')').toString());
		}
	}

	public void sweep() {
		try {
			synchronized (this.aClass348_5360) {
				this.aClass348_5360.sweep();
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("rr.p(").append(')').toString());
		}
	}

	public Class434 method5748(int i) {
		try {
			Class434 class434;
			synchronized (this.aClass348_5360) {
				class434 = (Class434) this.aClass348_5360.get((long) i);
			}
			if (null != class434)
				return class434;
			byte[] is = (this.aClass243_5361.getFileFromArchive(-1006924897 * ConfigType.aClass120_1430.type, i));
			class434 = new Class434();
			if (null != is)
				class434.method5801(new Buffer(is), 2030266422);
			synchronized (this.aClass348_5360) {
				this.aClass348_5360.put(class434, (long) i);
			}
			return class434;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("rr.a(").append(')').toString());
		}
	}

	static final void method5749(ScriptRuntime runtime) {
		try {
			runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = StaticMethods.anInt2099 * -815951577;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("rr.amt(").append(')').toString());
		}
	}

	static final void method5750(ScriptRuntime class403, short i) {
		try {
			if (14 == -1233866115 * GameClient.gameState)
				Class474.aBoolean5970 = (class403.integerStack[(class403.integerStackOffset -= -391880689) * 681479919]) == 1;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("rr.alm(").append(')').toString());
		}
	}

	static final void method5751(ScriptRuntime class403, int i) {
		try {
			class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919 - 1)] = 647547479 * Class95.anInt924;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("rr.amj(").append(')').toString());
		}
	}
}
