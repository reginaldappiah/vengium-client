package com.jagex;/* Class504 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.game.cache.config.ConfigType;

public class Class504 {
	Js5FileSystem fileSystem;
	SoftCache cache = new SoftCache(64);

	public void sweep() {
		try {
			synchronized (this.cache) {
				this.cache.sweep();
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("uv.p(").append(')').toString());
		}
	}

	public Class504(Js5FileSystem fileSystem) {
		this.fileSystem = fileSystem;
		if (null != this.fileSystem)
			this.fileSystem.getFileSystem(ConfigType.PARAMETERS.type * -1006924897);
	}

	public void method6249(int i, byte i_0_) {
			synchronized (this.cache) {
				this.cache.method4186(i);
			}
	}

	public void clear() {
		try {
			synchronized (this.cache) {
				this.cache.clear();
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("uv.f(").append(')').toString());
		}
	}

	public Class497 get(int fileID) {
			Class497 class497;
			synchronized (this.cache) {
				class497 = (Class497) this.cache.get((long) fileID);
			}
			if (class497 != null)
				return class497;
			byte[] data;
			synchronized (this.fileSystem) {
				data = (this.fileSystem.getFileFromArchive(-1006924897 * ConfigType.PARAMETERS.type, fileID));
			}
			class497 = new Class497();
			if (data != null)
				class497.readValueLoop(new Buffer(data));
			synchronized (this.cache) {
				this.cache.put(class497, (long) fileID);
			}
			return class497;
	}

}
