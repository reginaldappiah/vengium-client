package com.jagex;/* Class205 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.game.cache.config.ConfigType;

public class Class205 {
	Js5FileSystem fs;
	public int anInt2339;
	SoftCache cache = new SoftCache(64);
	static long aLong2341;

	public VarDefinition get(int id) {
		try {
			VarDefinition def;
			synchronized (cache) {
				def = (VarDefinition) cache.get((long) id);
			}
			if (null != def)
				return def;
			byte[] data;
			synchronized (fs) {
				data = (fs.getFileFromArchive(-1006924897 * ConfigType.DOMAIN_TYPE.type, id));
			}
			def = new VarDefinition();
			if (null != data)
				def.decode(new Buffer(data));
			synchronized (cache) {
				cache.put(def, (long) id);
			}
			return def;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("iq.a(").append(')').toString());
		}
	}

	public void clear() {
		try {
			synchronized (cache) {
				cache.clear();
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("iq.f(").append(')').toString());
		}
	}

	public void method1916(int i, byte i_1_) {
		try {
			synchronized (cache) {
				cache.method4186(i);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("iq.b(").append(')').toString());
		}
	}

	public void sweep() {
		try {
			synchronized (cache) {
				cache.sweep();
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("iq.p(").append(')').toString());
		}
	}

	public Class205(Js5FileSystem class243) {
		fs = class243;
		if (null != fs)
			anInt2339 = (fs.getFileSystem(ConfigType.DOMAIN_TYPE.type * -1006924897)) * 1946957321;
		else
			anInt2339 = 0;
	}

	static void method1918(Class335 class335, byte i) {
		try {
			class335.aClass365_Sub1_3616 = null;
			synchronized (Class335.stack) {
				if (Class335.stack.size() < 200)
					Class335.stack.push(class335);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("iq.f(").append(')').toString());
		}
	}
}
