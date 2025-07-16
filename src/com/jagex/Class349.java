package com.jagex;/* Class349 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.game.cache.config.ConfigType;

public class Class349 {
	SoftCache aClass348_3706 = new SoftCache(64);
	EquipmentDefaults aEquipmentDefaults_3707;
	public static Class350 aClass350_3708 = new Class350();
	Js5FileSystem aClass243_3709;

	public void clear() {
		try {
			synchronized (this.aClass348_3706) {
				this.aClass348_3706.clear();
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("oo.f(").append(')').toString());
		}
	}

	public void method4200(int i, byte i_0_) {
		try {
			synchronized (this.aClass348_3706) {
				this.aClass348_3706.method4186(i);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("oo.b(").append(')').toString());
		}
	}

	public void sweep() {
		try {
			synchronized (this.aClass348_3706) {
				this.aClass348_3706.sweep();
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("oo.p(").append(')').toString());
		}
	}

	public Class350 method4202(int i, byte i_1_) {
		try {
			Class350 class350;
			synchronized (this.aClass348_3706) {
				class350 = (Class350) this.aClass348_3706.get((long) i);
			}
			if (class350 != null)
				return class350;
			byte[] is;
			synchronized (this.aClass243_3709) {
				is = (this.aClass243_3709.getFileFromArchive(-1006924897 * ConfigType.REMOTE_ANIMATIONS.type, i));
			}
			class350 = new Class350();
			class350.aClass349_3725 = this;
			if (null != is)
				class350.readValueLoop(new Buffer(is), 162499609);
			synchronized (this.aClass348_3706) {
				this.aClass348_3706.put(class350, (long) i);
			}
			return class350;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("oo.a(").append(')').toString());
		}
	}

	public Class349(Js5FileSystem fileSystem, EquipmentDefaults equipmentDefaults) {
		this.aClass243_3709 = fileSystem;
		this.aClass243_3709.getFileSystem((-1006924897 * (ConfigType.REMOTE_ANIMATIONS.type)));
		this.aEquipmentDefaults_3707 = equipmentDefaults;
	}

	static final void method4203(ScriptRuntime class403, byte i) {
		try {
			class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919 - 1)] = (class403.clanChannelChat.channelSize * 649879491);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("oo.xp(").append(')').toString());
		}
	}

	static final void method4204(ScriptRuntime class403, byte i) {
		try {
			SettingsManager.settingsManager.setValue(SettingsManager.settingsManager.voiceOverVolume, (class403.integerStack[((class403.integerStackOffset -= -391880689) * 681479919)]));
			ToMoveSettings.encodeBuffer();
			GameClient.sentPreferences = false;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("oo.aiy(").append(')').toString());
		}
	}

	static final void method4205(ScriptRuntime runtime) {
		try {
			runtime.integerStackOffset -= -783761378;
			int i_2_ = (runtime.integerStack[681479919 * runtime.integerStackOffset]);
			int i_3_ = (runtime.integerStack[1 + runtime.integerStackOffset * 681479919]);
			if (GameClient.fullscreen) {
				Class357.method4276(3, i_2_, i_3_, false);
				runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = null != GameClient.fullScreenFrame ? 1 : 0;
			} else
				runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = 0;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("oo.aed(").append(')').toString());
		}
	}
}
