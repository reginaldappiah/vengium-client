package com.jagex;/* Class370 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.game.cache.config.ConfigType;

public class Class370 {
	SoftCache aClass348_4029 = new SoftCache(64);
	Js5FileSystem aClass243_4030;

	public void method4573(int i, int i_0_) {
		try {
			synchronized (this.aClass348_4029) {
				this.aClass348_4029.method4186(i);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("pj.b(").append(')').toString());
		}
	}

	public void clear() {
		try {
			synchronized (this.aClass348_4029) {
				this.aClass348_4029.clear();
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("pj.f(").append(')').toString());
		}
	}

	public void sweep() {
		try {
			synchronized (this.aClass348_4029) {
				this.aClass348_4029.sweep();
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("pj.p(").append(')').toString());
		}
	}

	public Class376 method4576(int i, int i_1_) {
		try {
			Class376 class376;
			synchronized (this.aClass348_4029) {
				class376 = (Class376) this.aClass348_4029.get((long) i);
			}
			if (null != class376)
				return class376;
			byte[] is;
			synchronized (this.aClass243_4030) {
				is = (this.aClass243_4030.getFileFromArchive(ConfigType.aClass120_1414.type * -1006924897, i));
			}
			class376 = new Class376();
			if (is != null)
				class376.method4655(new Buffer(is), 1705012994);
			synchronized (this.aClass348_4029) {
				this.aClass348_4029.put(class376, (long) i);
			}
			return class376;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("pj.a(").append(')').toString());
		}
	}

	public Class370(Js5FileSystem class243) {
		this.aClass243_4030 = class243;
		if (null != this.aClass243_4030)
			this.aClass243_4030.getFileSystem(-1006924897 * ConfigType.aClass120_1414.type);
	}

	public static boolean method4577() {
		try {
			Class298_Sub47 class298_sub47 = ((Class298_Sub47) Class478.aClass453_6002.method5939());
            return class298_sub47 != null;
        } catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("pj.f(").append(')').toString());
		}
	}

	public static void loadingPleaseWait(int mode, boolean bool) {
			GameDefaults.profileGraphics(mode, Tradution.LOADING_PLEASE_WAIT.translate(GameLanguage.CURRENT_LANGUAGE), bool);
	}

	static void method4579(int i, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, Class435 class435, byte i_8_) {
		try {
			ObjectDeque objectDeque = null;
			for (ObjectDeque objectDeque_9_ = ((ObjectDeque) ObjectDeque.aClass453_7162.method5939()); objectDeque_9_ != null; objectDeque_9_ = ((ObjectDeque) ObjectDeque.aClass453_7162.method5944())) {
				if (i == (2108312995 * objectDeque_9_.plane) && i_3_ == 634196087 * objectDeque_9_.localX && i_4_ == objectDeque_9_.localY * -2146829167 && -431456739 * (objectDeque_9_.anInt7157) == i_5_) {
					objectDeque = objectDeque_9_;
					break;
				}
			}
			if (null == objectDeque) {
				objectDeque = new ObjectDeque();
				objectDeque.plane = i * -196260341;
				objectDeque.anInt7157 = i_5_ * 1088435253;
				objectDeque.localX = i_3_ * 656787783;
				objectDeque.localY = 284247153 * i_4_;
				ObjectDeque.aClass453_7162.pushBack(objectDeque);
			}
			objectDeque.anInt7156 = i_6_ * 240885009;
			objectDeque.type = i_7_ * 998055383;
			objectDeque.aClass435_7158 = class435;
			objectDeque.aBoolean7159 = true;
			objectDeque.aBoolean7160 = false;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("pj.f(").append(')').toString());
		}
	}
}
